package Verisoft.InterpreterPatternExample;

/**
 * Terminal expression for single Roman numeral characters.
 */
public class TerminalExpression implements Expression {
    private String numeral;
    private int value;

    public TerminalExpression(String numeral, int value) {
        this.numeral = numeral;
        this.value = value;
    }

    @Override
    public int interpret() {
        return value;
    }

    public String getNumeral() {
        return numeral;
    }
}
