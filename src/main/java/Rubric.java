import java.util.ArrayList;
import java.util.Collections;

public class Rubric {

    private String rubricName;
    private ArrayList<Criterion> criterionList;
    private ArrayList<String> categories;

    private static final int MAX_CRITERIA = 10;

    public Rubric(String rubricName) {
        super();
        this.rubricName = rubricName;
        this.criterionList = new ArrayList<Criterion>();
        this.categories = new ArrayList<String>();
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
