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
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Item rhs)) {
            return false;
        }
        return ((Objects.equals(this.name, rhs.name))
                && (Objects.equals(this.material, rhs.material)));
    }

}
