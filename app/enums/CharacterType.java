package enums;

import com.avaje.ebean.annotation.EnumValue;

/**
 * Created by xpert on 21.10.2015.
 */
public enum CharacterType {
    @EnumValue("G")
    GOOD("good"),
    @EnumValue("B")
    BAD("bad"),
    @EnumValue("N")
    NEUTRAL("neutral");
    private String name;

    CharacterType(String neutral) {
        name = neutral;
    }

    @Override
    public String toString() {
        return name;
    }
}
