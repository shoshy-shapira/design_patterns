package Verisoft.InterpreterPatternExample;

/**
 * Client class to interpret Roman numerals.
 */
public class RomanNumeralsInterpreter {
    private RomanContext context;

    public RomanNumeralsInterpreter() {
        context = new RomanContext();
    }

    public int interpret(String roman) {
        NonterminalExpression nonterminal = new NonterminalExpression();

        // Loop through the Roman numeral string
        for (int i = 0; i < roman.length(); i++) {
            String currentNumeral = String.valueOf(roman.charAt(i));
            int value = context.getValue(currentNumeral);

            // If the next numeral exists and its value is greater, subtract the current value
            if (i + 1 < roman.length()) {
                String nextNumeral = String.valueOf(roman.charAt(i + 1));
                int nextValue = context.getValue(nextNumeral);
                if (nextValue > value) {
                    value = -value; // This signifies that we should subtract
                }
            }

            // Add the value to the expression
            nonterminal.addExpression(new TerminalExpression(currentNumeral, value));
        }

        return nonterminal.interpret();
    }
}
