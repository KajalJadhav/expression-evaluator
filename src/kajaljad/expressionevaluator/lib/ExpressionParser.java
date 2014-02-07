package kajaljad.expressionevaluator.lib;

public class ExpressionParser {
    public String parseInput(String expression) {
            expression = expression.replaceAll(" +", "");
            return expression.replaceAll("\\+", " + ")
                    .replaceAll("\\-", " - ")
                    .replaceAll("\\*", " * ")
                    .replaceAll("/", " / ")
                    .replaceAll("\\^", " ^ ")
                    .replaceAll("\\(", "( ")
                    .replaceAll("\\)", " )")
                    .replaceAll("  - ", " -")
                    .replaceFirst("^ - ", "-");
    }
}
