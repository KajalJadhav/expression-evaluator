package kajaljad.expressionevaluator.lib;

public class Expression {
    private Double value;
    private Expression left;
    private String operator;
    private Expression right;


    public Expression(Double value) {
        this.value = value;
    }

    public Expression(Expression left, String operator, Expression right) {

        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    public Double getValue() {
        return value;
    }
}
