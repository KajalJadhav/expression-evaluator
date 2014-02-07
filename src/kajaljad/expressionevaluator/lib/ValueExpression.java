package kajaljad.expressionevaluator.lib;

/**
 * Created by kajaljad on 2/7/14.
 */
public class ValueExpression {
    private Double value;

    public ValueExpression(double value) {

        this.value = value;
    }

    public ValueExpression evaluate() {
        return new ValueExpression(value);
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ValueExpression)) return false;

        ValueExpression that = (ValueExpression) o;

        if (value != null ? !value.equals(that.value) : that.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }

    public ValueExpression operate(Operator operator, ValueExpression other) {
        return new ValueExpression(operator.operate(value, other.value));
    }
}
