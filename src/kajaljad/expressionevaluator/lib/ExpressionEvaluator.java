package kajaljad.expressionevaluator.lib;

public class ExpressionEvaluator {

    private ExpressionParser expressionParser = new ExpressionParser();

    public IExpression createExpression(String text) {
        return expressionParser.parse(text);
    }

}
