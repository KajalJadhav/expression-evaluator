package kajaljad.expressionevaluator.lib;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kajaljad on 2/7/14.
 */
public class Operator {

    String symbol;

    protected Operator(String symbol) {
        this.symbol = symbol;
    }

    public static Operator plus = new Operator("+");
    public static Operator minus = new Operator("-");
    public static Operator multiply = new Operator("*");
    public static Operator divide = new Operator("/");
    public static Operator power = new Operator("^");

    public static Operator parse(Character symbol) {
        switch (symbol){
            case '+': return plus;
            case '-':return minus;
            case '*':return multiply;
            case '/':return divide;
            case '^': return power;
        }
        throw new RuntimeException("unsupported operator "+symbol);
    }

    public double operate(double left, double right) {
        if (symbol == "+") return left + right;
        if (symbol == "-") return left - right;
        if (symbol == "*") return left * right;
        if (symbol == "/") return left / right;
        if (symbol == "^") return Math.pow(left, right);
        throw new RuntimeException("unsupported symbol " + symbol);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Operator)) return false;

        Operator operator = (Operator) o;

        if (symbol != null ? !symbol.equals(operator.symbol) : operator.symbol != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return symbol != null ? symbol.hashCode() : 0;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
