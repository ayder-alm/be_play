package models;

import enums.CharacterType;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by xpert on 21.10.2015.
 */
@Entity
@DiscriminatorValue("MONSTER")
public class Monster extends Character {
    public Monster(String name) {
        this.name = name;
    }

    public Monster() {
        characterType = CharacterType.BAD;
        name = "undefined monster";
    }

    public Monster(String name, CharacterType characterType) {
        this(name);
        this.characterType = characterType;
    }
}
