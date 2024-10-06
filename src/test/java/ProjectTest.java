import org.example.Project;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProjectTest {
    private final Project project = new Project();

    @Test
    public void testCalculateDigits() {
        assertEquals(2, project.calculateDigits("Hello12"));// находит что есть цифра и возвращает
        assertEquals(0, project.calculateDigits("")); // ничего нет и возвращает 0
        assertEquals(0, project.calculateDigits(null)); // строка пустая, вернет 0
        assertEquals(0, project.calculateDigits("we are here"));// не находит число
        assertEquals(7, project.calculateDigits("say 4567 may 839"));// также в строке есть цифра
        assertEquals(6, project.calculateDigits("0 1 2 3 4 5"));// считает количество цифр

    }
}
