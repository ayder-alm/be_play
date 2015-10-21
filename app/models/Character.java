package models;

import enums.CharacterType;
import play.data.validation.Constraints;

import javax.persistence.*;

/**
 * Created by xpert on 21.10.2015.
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorValue("CHARACTER")
public class Character extends BaseEntity {
    @Column
    @Constraints.Required
    public String name = "unnamed";

    @Column
    @Constraints.Required
    public CharacterType characterType = CharacterType.NEUTRAL;
}
