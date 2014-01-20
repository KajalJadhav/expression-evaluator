package kajaljad.expressionevaluator.lib;

public class ExpressionEvaluator {
    public String expression;

    public ExpressionEvaluator(String expression) {
        this.expression = expression;
    }

    public String calculation() {
        return this.expression;
    }
}
