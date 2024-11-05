package Verisoft.InterpreterPatternExample;

import java.util.HashMap;
import java.util.Map;

/**
 * Context class to provide the mapping of Roman numerals to their values.
 */
public class RomanContext {
    private Map<String, Integer> romanNumerals = new HashMap<>();

    public RomanContext() {
        romanNumerals.put("I", 1);
        romanNumerals.put("V", 5);
        romanNumerals.put("X", 10);
        romanNumerals.put("L", 50);
        romanNumerals.put("C", 100);
        romanNumerals.put("D", 500);
        romanNumerals.put("M", 1000);
    }

    public int getValue(String numeral) {
        return romanNumerals.getOrDefault(numeral, 0);
    }
}
