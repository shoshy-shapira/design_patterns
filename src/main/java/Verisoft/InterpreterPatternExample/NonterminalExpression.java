package Verisoft.InterpreterPatternExample;

import java.util.ArrayList;
import java.util.List;

/**
 * Non-terminal expression that handles combinations of Roman numerals.
 */
public class NonterminalExpression implements Expression {
    private List<Expression> expressions = new ArrayList<>();

    public void addExpression(Expression expression) {
        expressions.add(expression);
    }

    @Override
    public int interpret() {
        int total = 0;
        for (Expression expression : expressions) {
            total += expression.interpret();
        }
        return total;
    }
}
