package blanco.anttask;

import blanco.anttask.task.BlancoAntTaskProcessImpl;
import blanco.anttask.task.valueobject.BlancoAntTaskProcessInput;
import org.junit.Test;

import java.io.IOException;

/**
 * Generation test for Java.
 *
 * @author tueda
 */
public class BlancoAntTaskTest {
    @Test
    public void testBlancoAntTask() {
        BlancoAntTaskProcessInput input = new BlancoAntTaskProcessInput();
        input.setMetadir("meta/program");
        input.setEncoding("UTF-8");
        input.setTargetdir("blanco");
        input.setTmpdir("tmpTest");
        input.setVerbose(true);

        BlancoAntTaskProcessImpl imple = new BlancoAntTaskProcessImpl();
        try {
            imple.execute(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
