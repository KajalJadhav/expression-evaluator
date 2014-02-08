package kajaljad.expressionevaluator.lib;

public class ExpressionEvaluator {

    private ExpressionParser2 expressionParser = new ExpressionParser2();

    public IExpression createExpression(String text) {
        return expressionParser.parse(text);
    }

}
