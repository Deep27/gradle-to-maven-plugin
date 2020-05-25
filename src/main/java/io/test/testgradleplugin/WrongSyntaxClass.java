package io.test.testgradleplugin;

import java.util.Map;

public class WrongSyntaxClass { public
    static int intVar = 0;

private Map<String, String> stringToStringMap;

                public WrongSyntaxClass  (){}
 //
     /**
      An appropriate place for javadoc
    */
                //// ooooo
    final private String aFINALString = "string";

    public WrongSyntaxClass(Map map) {
            this.stringToStringMap = (Map<String, String>)map ;
    }

static final String wrongNameStaticfinalstrinG = "A FINAL STRING???";
}
