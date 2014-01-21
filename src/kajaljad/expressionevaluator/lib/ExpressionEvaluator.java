package kajaljad.expressionevaluator.lib;

public class ExpressionEvaluator {
    public String expression;

    public ExpressionEvaluator(String expression) {
        this.expression = expression;
    }

    public int sum(int number1, int number2) {
        return number1 + number2;
    }

    public int calculation() {
        String[] resultArray = this.expression.split(" ");
        int result = 0;
        int number1 = Integer.parseInt(resultArray[0]);
        int number2 = Integer.parseInt(resultArray[2]);
        if (resultArray.length == 1)
            return number1;
        if (0 == resultArray[1].compareTo("+"))
            result = sum(number1, number2);
        return result;
    }
}
