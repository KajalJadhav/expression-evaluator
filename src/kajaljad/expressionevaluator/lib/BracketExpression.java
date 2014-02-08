package kajaljad.expressionevaluator.lib;

public class BracketExpression implements IExpression{
    private final IExpression inner;

    public BracketExpression(IExpression inner) {
        this.inner = inner;
    }

    public ValueExpression evaluate() {
        return inner.evaluate();
    }
    @Override
    public String toString() {
        return "( " + inner + " )";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BracketExpression)) return false;

        BracketExpression that = (BracketExpression) o;

        if (inner != null ? !inner.equals(that.inner) : that.inner != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return inner != null ? inner.hashCode() : 0;
    }
}
