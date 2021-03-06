package kajaljad.expressionevaluator.lib;

public class OperationExpression implements IExpression {

    private final IExpression left;
    private final Operator operator;
    private final IExpression right;

    public OperationExpression(IExpression left, Operator operator, IExpression right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    public ValueExpression evaluate() {
        return left.evaluate().operate(operator, right.evaluate());
    }

    @Override
    public String toString() {
        return left + operator.toString() + right;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OperationExpression)) return false;

        OperationExpression that = (OperationExpression) o;

        if (left != null ? !left.equals(that.left) : that.left != null) return false;
        if (operator != null ? !operator.equals(that.operator) : that.operator != null) return false;
        if (right != null ? !right.equals(that.right) : that.right != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = left != null ? left.hashCode() : 0;
        result = 31 * result + (operator != null ? operator.hashCode() : 0);
        result = 31 * result + (right != null ? right.hashCode() : 0);
        return result;
    }
}
