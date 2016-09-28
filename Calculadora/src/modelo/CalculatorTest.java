package modelo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import junit.framework.TestCase;
public class CalculatorTest extends TestCase{
public void testEvaluates() {
 Calculator calculator = new Calculator();
 int sum = calculator.evaluate("1+2+3");
 assertNotNull(sum);
 assertEquals(6, sum);
 }
}