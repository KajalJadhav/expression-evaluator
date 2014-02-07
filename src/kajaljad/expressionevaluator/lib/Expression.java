package kajaljad.expressionevaluator.lib;

public class Expression {
    private Double value;
    private Expression left;
    private String operator;
    private Expression right;
    private Operations operations = new Operations();

    public Expression(Double value) {
        this.value = value;
    }

    public Expression(Expression left, String operator, Expression right) {

        this.left = left;
        this.operator = operator;
        this.right = right;
    }


    public Expression evaluate() {
        return operations.performOperations(left, operator, right);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Expression)) return false;

        Expression that = (Expression) o;

        if (left != null ? !left.equals(that.left) : that.left != null) return false;
        if (operator != null ? !operator.equals(that.operator) : that.operator != null) return false;
        if (right != null ? !right.equals(that.right) : that.right != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = value != null ? value.hashCode() : 0;
        result = 31 * result + (left != null ? left.hashCode() : 0);
        result = 31 * result + (operator != null ? operator.hashCode() : 0);
        result = 31 * result + (right != null ? right.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return value == null ? left.toString() + operator + right.toString() : value.toString();

    }
}
