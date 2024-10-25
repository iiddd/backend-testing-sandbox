package models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class TodoResponse {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("created")
    @Expose
    private String created;

    public String getId() {
        return id;
    }

    public TodoResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public TodoResponse setTitle(String title) {
        this.title = title;
        return this;
    }

    public Boolean getActive() {
        return active;
    }

    public TodoResponse setActive(Boolean active) {
        this.active = active;
        return this;
    }

    public String getCreated() {
        return created;
    }

    public TodoResponse setCreated(String created) {
        this.created = created;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoResponse that = (TodoResponse) o;
        return Objects.equals(id, that.id)
                && Objects.equals(title, that.title)
                && Objects.equals(active, that.active)
                && Objects.equals(created, that.created);
    }
}
