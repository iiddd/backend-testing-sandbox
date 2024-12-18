package models.valheim;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class Weapon {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("material")
    @Expose
    private String material;
    @SerializedName("damage")
    @Expose
    private Integer damage;

    public String getName() {
        return name;
    }

    public Weapon setName(String name) {
        this.name = name;
        return this;
    }

    public String getMaterial() {
        return material;
    }

    public Weapon setMaterial(String material) {
        this.material = material;
        return this;
    }

    public Integer getDamage() {
        return damage;
    }

    public Weapon setDamage(Integer damage) {
        this.damage = damage;
        return this;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Weapon rhs)) {
            return false;
        }
        return (((Objects.equals(this.name, rhs.name))
                && (Objects.equals(this.damage, rhs.damage)))
                && (Objects.equals(this.material, rhs.material)));
    }

}
