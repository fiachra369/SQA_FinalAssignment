import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class RubricTest {

    private Rubric rubric;

    @BeforeEach
    public void setup() {
        rubric = new Rubric("sampleRubric");
        createMockCriterion(rubric);
        createMockCategories(rubric);
    }

    // This Test Case is for creating a new Criterion with only passing the Title of Criterion
    @Test
    public void testAddCriterion_VALUE(){
        rubric.addCriterion("sampleCriterion");
        boolean criterionExist = rubric.getCriterionList().stream().anyMatch(cri -> cri.getTitle().equals("sampleCriterion"));
        Assertions.assertTrue(criterionExist);
    }

    // This Test Case is for creating a new Criterion with passing the Criterion Object
    @Test
    public void testAddCriterion_OBJECT(){
        Criterion criterion = new Criterion("sampleCriterion");
        rubric.addCriterion(criterion);
        boolean criterionExist = rubric.getCriterionList().stream().anyMatch(cri -> cri.getTitle().equals("sampleCriterion"));
        Assertions.assertTrue(criterionExist);
    }

    // This Test Case is for getting the Maximum Score from all the scores of a particular category
    @Test
    public void testGetMaximum(){
        int min = rubric.getMaximum(0);
        Assertions.assertEquals(24, min);
    }

    // This Test Case is for getting the Minimum Score from all the scores of a particular category
    @Test
    public void testGetMinimum(){
        int min = rubric.getMinimum(0);
        Assertions.assertEquals(10, min);
    }

    // This Test Case is for setting and getting the Rubric Title
    @Test
    public void testRubricName(){
        rubric.setRubricName("sampleUpdatedRubric");
        Assertions.assertEquals("sampleUpdatedRubric", rubric.getRubricName());
    }

    // This Test Case is printing All Rubric Details
    @Test
    public void testGetAllRubric(){
        Assertions.assertDoesNotThrow(() -> rubric.getAllRubric());
    }

    private void createMockCriterion(Rubric rubric) {
        ArrayList<Criterion> criterionList = new ArrayList<>();
        Criterion criterion1 = new Criterion("sampleCriterion1");
        criterion1.setScore(new ArrayList<Integer>() {{
            add(10);
        }});
        Criterion criterion2 = new Criterion("sampleCriterion2");
        criterion2.setScore(new ArrayList<Integer>() {{
            add(24);
        }});
        criterionList.add(criterion1);
        criterionList.add(criterion2);
        rubric.setCriterionList(criterionList);
    }

    private void createMockCategories(Rubric rubric) {
        rubric.addCategory("sampleCategory1");
    }

    // This Test Case is for creating a new Criterion with only passing the Title of Criterion
}
