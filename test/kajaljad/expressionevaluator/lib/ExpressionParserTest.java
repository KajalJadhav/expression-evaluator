package kajaljad.expressionevaluator.lib;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ExpressionParserTest {
    @Test
    public void forGivingSpaceBetweenExpressions() {
        ExpressionParser expressionParser = new ExpressionParser();
        String expression = "2+3";
        assertEquals("2 + 3", expressionParser.parseInput(expression));
    }

    @Test
    public void forReducingMultipleSpaces() {
        ExpressionParser expressionParser = new ExpressionParser();
        String expression = "2 +    3";
        assertEquals("2 + 3", expressionParser.parseInput(expression));
    }
}
