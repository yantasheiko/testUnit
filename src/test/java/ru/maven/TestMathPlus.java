package src.test.java.ru.maven;

import org.junit.*;
import org.junit.runner.JUnitCore;
import src.main.java.ru.maven.MathPlus;

public class TestMathPlus {

@Test
public void testMethod() {
	MathPlus math = new MathPlus();
        Assert.assertEquals(math.plus(1, 1), 5);
}

}
