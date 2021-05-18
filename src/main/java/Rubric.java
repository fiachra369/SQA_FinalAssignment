import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

public class Rubric {

    private String rubricName;
    private ArrayList<Criterion> criterionList;
    private ArrayList<String> categories;
    private static final DecimalFormat df = new DecimalFormat("#.##");


    private static final int MAX_CRITERIA = 10;

    public Rubric(String rubricName) {
        super();
        this.rubricName = rubricName;
        this.criterionList = new ArrayList<Criterion>();
        this.categories = new ArrayList<String>();
    }

    // For specific category
    public String getAverage(int index) {
        double sum = 0;
        ArrayList<Integer> list = getParticularCategoryList(index);
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        double average = sum / list.size();
        return df.format(average);
    }

    // For specific category
    public String getStd(int index) {

        ArrayList<Integer> list = getParticularCategoryList(index);
        if (list.size() == 0)
            return "0";

        double sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        double mean = sum / list.size();

        for (int i = 0; i < list.size(); i++) {
            sum = sum + (list.get(i) - mean) * (list.get(i) - mean);
        }
        double squaredDiffMean = (sum) / (list.size());
        double standardDev = (Math.sqrt(squaredDiffMean));

        return df.format(standardDev);
    }


    public void addCriterion(String title) {
        if (this.criterionList.size() >= MAX_CRITERIA)
            System.out.println("Criteria limit exceeded");
        else
            this.criterionList.add(new Criterion(title));
    }

    public void addCriterion(Criterion criterion) {
        if (this.criterionList.size() >= MAX_CRITERIA)
            System.out.println("Criteria limit exceeded");
        else
            this.criterionList.add(criterion);
    }

    // For specific category
    public int getMaximum(int index) {
        ArrayList<Integer> list = getParticularCategoryList(index);
        Collections.sort(list);
        return list.get(list.size() - 1);
    }


    // For specific category
    public int getMinimum(int index) {
        ArrayList<Integer> list = getParticularCategoryList(index);
        Collections.sort(list);
        return list.get(0);
    }

    public ArrayList<Integer> getParticularCategoryList(int index) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (Criterion c : criterionList) {
            list.add(c.getScore().get(index));
        }

        return list;
    }

    public void getAllRubric() {
        printRubric();
    }

    public void printRubric() {
        System.out.println("\n\t\t\t------========== " + this.rubricName + " ==========------\n");
        for (String c : categories) {
            System.out.print(c + " - ");
        }
        System.out.println();
        for (Criterion cr : criterionList) {
            System.out.print(cr.getTitle() + " - ");
            for (int i = 0; i < categories.size(); i++) {
                System.out.print(cr.getScore().get(i) + " - ");
            }
            System.out.println();
        }
    }



    public void getSpecificRubricByName(String name) {
        boolean found = false;
        System.out.println("\n\t\t\t------========== " + this.rubricName + " ==========------\n");
        System.out.print("\t\t");
        for (String c : categories)
            System.out.print("           " + c + "");
        System.out.println();
        for (Criterion cr : criterionList) {
            if (cr.getTitle().equals(name)) {
                System.out.print(cr.getTitle() + "\t");
                for (int i = 0; i < categories.size(); i++) {
                    System.out.print("            " + cr.getScore().get(i) + "\t\t");
                }
                System.out.println();
                found = true;
            }
        }

        if (!found)
            System.out.println("Student with name " + name + " not found.");

    }


        public void addCategory(String name) {
        this.categories.add(name);
    }

    public void printAllStatsPerStudent(String name) {
        boolean found = false;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (Criterion cr : criterionList) {
            if (cr.getTitle().equals(name)) {
                for (int i = 0; i < categories.size(); i++) {
                    list.add(cr.getScore().get(i));
                }
                found = true;
            }
        }

        if (found) {

            Collections.sort(list);
            int minimum = list.get(0);
            int maximum = list.get(list.size() - 1);

            double sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            double average = sum / list.size();

            double standardDev = 0;
            if (list.size() != 0) {
                sum = 0;

                for (int i = 0; i < list.size(); i++) {
                    sum += list.get(i);
                }

                double mean = sum / list.size();

                for (int i = 0; i < list.size(); i++) {
                    sum = sum + (list.get(i) - mean) * (list.get(i) - mean);
                }
                double squaredDiffMean = (sum) / (list.size());
                standardDev = (Math.sqrt(squaredDiffMean));

                System.out.println("Std: " + df.format(standardDev));
                System.out.println("Average: " + df.format(average));
                System.out.println("Minimum: " + minimum);
                System.out.println("Maximum: " + maximum);
            }
        } else {
            System.out.println("Student with name " + name + " not found.");
        }
    }

    public void printRubricForParticularColumn(String column) {
        System.out.println(
                "\n\t\t\t------========== " + this.rubricName + " For Column " + column + " Only ==========------\n");
        int p = -1;
        int k = 0;
        for (String c : categories) {
            System.out.print(c + " - ");
            if (c.equals(column))
                p = k;
            k++;
        }
        System.out.println();
        for (Criterion cr : criterionList) {
            System.out.print(cr.getTitle() + " - ");
            for (int i = 0; i < categories.size(); i++) {
                System.out.print(cr.getScore().get(i) + " - ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.print("Std Deviation"+ " - ");
        for (int i = 0; i < categories.size(); i++) {
            if (i == p)
                System.out.print(getStd(i) + " - ");
        }
        System.out.println();

        System.out.print("Mean / Average" + " - ");
        for (int i = 0; i < categories.size(); i++) {
            if (i == p)
                System.out.print(getAverage(i) + " - ");
        }
        System.out.println();

        System.out.print("Minimum" + " - ");
        for (int i = 0; i < categories.size(); i++) {
            if (i == p)
                System.out.print(getMinimum(i) + " - ");
        }
        System.out.println();

        System.out.print("Maximum" + " - ");
        for (int i = 0; i < categories.size(); i++) {
            if (i == p)
                System.out.print(getMaximum(i) + " - ");
        }
        System.out.println();

    }

    public String getRubricName() {
        return rubricName;
    }

    public void setRubricName(String rubricName) {
        this.rubricName = rubricName;
    }

    public ArrayList<Criterion> getCriterionList() {
        return criterionList;
    }

    public void setCriterionList(ArrayList<Criterion> criterionList) {
        this.criterionList = criterionList;
    }
}
