package models.valheim;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;


public class ValheimResponse {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("inventory")
    @Expose
    private Inventory inventory;
    @SerializedName("skills")
    @Expose
    private List<Skill> skills;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("alive")
    @Expose
    private Boolean alive;

    public String getName() {
        return name;
    }

    public ValheimResponse setName(String name) {
        this.name = name;
        return this;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public ValheimResponse setInventory(Inventory inventory) {
        this.inventory = inventory;
        return this;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public ValheimResponse setSkills(List<Skill> skills) {
        this.skills = skills;
        return this;
    }

    public String getCreated() {
        return created;
    }

    public ValheimResponse setCreated(String created) {
        this.created = created;
        return this;
    }

    public Boolean getAlive() {
        return alive;
    }

    public ValheimResponse setAlive(Boolean alive) {
        this.alive = alive;
        return this;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ValheimResponse rhs)) {
            return false;
        }
        return (((((Objects.equals(this.name, rhs.name))
                && (Objects.equals(this.skills, rhs.skills)))
                && (Objects.equals(this.inventory, rhs.inventory)))
                && (Objects.equals(this.alive, rhs.alive)))
                && (Objects.equals(this.created, rhs.created)));
    }

}
