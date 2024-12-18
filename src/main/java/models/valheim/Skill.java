package models.valheim;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class Skill {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("level")
    @Expose
    private Integer level;

    public String getName() {
        return name;
    }

    public Skill setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getLevel() {
        return level;
    }

    public Skill setLevel(Integer level) {
        this.level = level;
        return this;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Skill rhs)) {
            return false;
        }
        return ((Objects.equals(this.name, rhs.name))
                && (Objects.equals(this.level, rhs.level)));
    }

}
