package io.test.testgradleplugin;

import java.util.HashMap;
import java.util.Map;

/**
 * An appropriate place for javadoc
 */
public class CorrectSyntaxClass {

    public static int intVar = 0;

    // ooooo
    static final String CORRECT_STRING_CONST = "A FINAL STRING???";

    private final String aFinalString = "string";

    private Map<String, String> stringToStringMap;

    public CorrectSyntaxClass() {
        stringToStringMap = new HashMap<String, String>();
    }

    public CorrectSyntaxClass(Map<String, String> map) {
        this.stringToStringMap = map;
    }
}
