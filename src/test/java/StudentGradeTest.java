import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StudentGradeTest {
    @Test public void testGrade() { assertEquals("A", StudentGrade.grade(85)); }
}
