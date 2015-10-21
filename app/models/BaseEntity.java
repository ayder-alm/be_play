package models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by xpert on 20.10.2015.
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorValue("BASE")
public class BaseEntity extends Model {
    @Id
    @JsonIgnore
    public Long id;

    @Formats.DateTime(pattern = "dd/MM/yyyy")
    public Date createdTime = new Date();

    public static Finder<Long, BaseEntity> find = new Finder<Long, BaseEntity>(
            Long.class, BaseEntity.class
    );
}
