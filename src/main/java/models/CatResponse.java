package models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class CatResponse {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("catName")
    @Expose
    private String catName;
    @SerializedName("asleep")
    @Expose
    private Boolean asleep;
    @SerializedName("born")
    @Expose
    private String born;

    public String getId() {
        return id;
    }

    public CatResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getCatName() {
        return catName;
    }

    public CatResponse setCatName(String catName) {
        this.catName = catName;
        return this;
    }

    public Boolean getAsleep() {
        return asleep;
    }

    public CatResponse setAsleep(Boolean asleep) {
        this.asleep = asleep;
        return this;
    }

    public String getBorn() {
        return born;
    }

    public CatResponse setBorn(String born) {
        this.born = born;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CatResponse that = (CatResponse) o;
        return Objects.equals(id, that.id)
                && Objects.equals(catName, that.catName)
                && Objects.equals(asleep, that.asleep)
                && Objects.equals(born, that.born);
    }

}

