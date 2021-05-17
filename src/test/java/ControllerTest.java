import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Scanner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ControllerTest {

    @InjectMocks
    private Controller controller;

    @Mock
    private Scanner scan;

    private static final String OPTION_YES = "yes";
    private static final String OPTION_NO = "no";
    private static final String SAMPLE_STUDENT = "sampleStudent";

    // This Test Case is testing the main runner when all inputs are properly supplied
    @Test
    public void testRunner(){
        when(scan.nextLine()).thenReturn(OPTION_YES, OPTION_YES, SAMPLE_STUDENT, OPTION_YES, SAMPLE_STUDENT, SAMPLE_STUDENT, SAMPLE_STUDENT);
        when(scan.nextInt()).thenReturn(3, 5,4,5);
        controller.runner();
        verify(scan, times(9)).nextLine();
        verify(scan, times(4)).nextInt();
    }

    // This Test Case is testing the main runner when user does not want to create a Rubric
    @Test
    public void testRunner_NOT_CREATE_RUBRIC(){
        when(scan.nextLine()).thenReturn(OPTION_NO);
        Assertions.assertDoesNotThrow(() -> controller.runner());
        verify(scan, times(1)).nextLine();
    }

    // This Test Case is testing the main runner when user does not want to create a Student
    @Test
    public void testRunner_NOT_CREATE_STUDENT(){
        when(scan.nextLine()).thenReturn(OPTION_YES, OPTION_NO);
        Assertions.assertDoesNotThrow(() -> controller.runner());
        verify(scan, times(6)).nextLine();
    }

    // This Test Case is testing the main runner when user supplies marks out of range
    @Test
    public void testRunner_WRONG_MARKS_RANGE(){
        when(scan.nextLine()).thenReturn(OPTION_YES, OPTION_YES, SAMPLE_STUDENT, OPTION_NO);
        when(scan.nextInt()).thenReturn(8, 3, 6, 5, 10, 4, 11, 5);
        Assertions.assertDoesNotThrow(() -> controller.runner());
        verify(scan, times(9)).nextLine();
        verify(scan, times(8)).nextInt();
    }

}