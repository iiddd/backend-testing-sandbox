package models.valheim;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class Potion {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("regeneration")
    @Expose
    private Integer regeneration;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("amount")
    @Expose
    private Integer amount;

    public String getName() {
        return name;
    }

    public Potion setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getRegeneration() {
        return regeneration;
    }

    public Potion setRegeneration(Integer regeneration) {
        this.regeneration = regeneration;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public Potion setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public Integer getAmount() {
        return amount;
    }

    public Potion setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
        result = ((result * 31) + ((this.duration == null) ? 0 : this.duration.hashCode()));
        result = ((result * 31) + ((this.amount == null) ? 0 : this.amount.hashCode()));
        result = ((result * 31) + ((this.regeneration == null) ? 0 : this.regeneration.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Potion rhs)) {
            return false;
        }
        return ((((Objects.equals(this.name, rhs.name)) && (Objects.equals(this.duration, rhs.duration))) && (Objects.equals(this.amount, rhs.amount))) && (Objects.equals(this.regeneration, rhs.regeneration)));
    }

}
