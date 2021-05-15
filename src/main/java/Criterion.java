import java.util.ArrayList;

public class Criterion {

    private String title;
    private ArrayList<Integer> score;

    public Criterion(String title) {
        super();
        this.title = title;
        this.score = new ArrayList<Integer>();
    }

    public void addCriteria(int score, int index) {
        this.score.add(index, score);
    }

    public String getTitle() {
        return title;
    }


    public ArrayList<Integer> getScore() {
        return score;
    }

    public void setScore(ArrayList<Integer> score) {
        this.score = score;
    }

}
