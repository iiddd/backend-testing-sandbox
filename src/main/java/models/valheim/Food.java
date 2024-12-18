package models.valheim;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class Food {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("hpBonus")
    @Expose
    private Integer hpBonus;
    @SerializedName("staminaBonus")
    @Expose
    private Integer staminaBonus;
    @SerializedName("amount")
    @Expose
    private Integer amount;

    public String getName() {
        return name;
    }

    public Food setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getHpBonus() {
        return hpBonus;
    }

    public Food setHpBonus(Integer hpBonus) {
        this.hpBonus = hpBonus;
        return this;
    }

    public Integer getStaminaBonus() {
        return staminaBonus;
    }

    public Food setStaminaBonus(Integer staminaBonus) {
        this.staminaBonus = staminaBonus;
        return this;
    }

    public Integer getAmount() {
        return amount;
    }

    public Food setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Food rhs)) {
            return false;
        }
        return ((((Objects.equals(this.name, rhs.name))
                && (Objects.equals(this.hpBonus, rhs.hpBonus)))
                && (Objects.equals(this.staminaBonus, rhs.staminaBonus)))
                && (Objects.equals(this.amount, rhs.amount)));
    }

}
