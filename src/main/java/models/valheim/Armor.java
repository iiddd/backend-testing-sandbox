package models.valheim;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;


public class Armor {

    @SerializedName("items")
    @Expose
    private List<Item> items;
    @SerializedName("isSet")
    @Expose
    private Boolean isSet;

    public List<Item> getItems() {
        return items;
    }

    public Armor setItems(List<Item> items) {
        this.items = items;
        return this;
    }

    public Boolean getIsSet() {
        return isSet;
    }

    public Armor setIsSet(Boolean isSet) {
        this.isSet = isSet;
        return this;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.items == null) ? 0 : this.items.hashCode()));
        result = ((result * 31) + ((this.isSet == null) ? 0 : this.isSet.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Armor rhs)) {
            return false;
        }
        return ((Objects.equals(this.items, rhs.items)) && (Objects.equals(this.isSet, rhs.isSet)));
    }

}
