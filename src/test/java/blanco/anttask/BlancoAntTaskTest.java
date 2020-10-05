package blanco.anttask;

import blanco.anttask.task.BlancoAntTaskProcessImpl;
import blanco.anttask.task.valueobject.BlancoAntTaskProcessInput;
import org.junit.Test;

import java.io.IOException;

/**
 * Java言語用の生成試験
 *
 * @author tueda
 */
public class BlancoAntTaskTest {
    @Test
    public void testBlancoAntTask() {
        BlancoAntTaskProcessInput input = new BlancoAntTaskProcessInput();
        input.setMetadir("meta/task");
        input.setEncoding("UTF-8");
        input.setTargetdir("sample/blanco");
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