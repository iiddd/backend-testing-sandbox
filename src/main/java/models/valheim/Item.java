package models.valheim;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;


public class Item {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("material")
    @Expose
    private String material;

    public String getName() {
        return name;
    }

    public Item setName(String name) {
        this.name = name;
        return this;
    }

    public String getMaterial() {
        return material;
    }

    public Item setMaterial(String material) {
        this.material = material;
        return this;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
        result = ((result * 31) + ((this.material == null) ? 0 : this.material.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Item rhs)) {
            return false;
        }
        return ((Objects.equals(this.name, rhs.name)) && (Objects.equals(this.material, rhs.material)));
    }

}
