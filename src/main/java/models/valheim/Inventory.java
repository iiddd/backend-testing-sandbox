package models.valheim;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;


public class Inventory {

    @SerializedName("weapon")
    @Expose
    private List<Weapon> weapon;
    @SerializedName("armor")
    @Expose
    private Armor armor;
    @SerializedName("food")
    @Expose
    private List<Food> food;
    @SerializedName("potions")
    @Expose
    private List<Potion> potions;

    public List<Weapon> getWeapon() {
        return weapon;
    }

    public Inventory setWeapon(List<Weapon> weapon) {
        this.weapon = weapon;
        return this;
    }

    public Armor getArmor() {
        return armor;
    }

    public Inventory setArmor(Armor armor) {
        this.armor = armor;
        return this;
    }

    public List<Food> getFood() {
        return food;
    }

    public Inventory setFood(List<Food> food) {
        this.food = food;
        return this;
    }

    public List<Potion> getPotions() {
        return potions;
    }

    public Inventory setPotions(List<Potion> potions) {
        this.potions = potions;
        return this;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Inventory rhs)) {
            return false;
        }
        return ((((Objects.equals(this.weapon, rhs.weapon))
                && (Objects.equals(this.armor, rhs.armor)))
                && (Objects.equals(this.food, rhs.food)))
                && (Objects.equals(this.potions, rhs.potions)));
    }

}
