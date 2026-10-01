package edu.wctc.jpalab.entity.recipe;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "chef", schema = "recipe")
public class Chef {

    @Id
    private Long chefId;

    private String chefFirstname;
    private String chefLastname;
    private String chefAvatar;

    public Chef() {
    }

    public Long getChefId() {
        return chefId;
    }

    public void setChefId(Long chefId) {
        this.chefId = chefId;
    }

    public String getChefFirstname() {
        return chefFirstname;
    }

    public void setChefFirstname(String chefFirstname) {
        this.chefFirstname = chefFirstname;
    }

    public String getChefLastname() {
        return chefLastname;
    }

    public void setChefLastname(String chefLastname) {
        this.chefLastname = chefLastname;
    }

    public String getChefAvatar() {
        return chefAvatar;
    }

    public void setChefAvatar(String chefAvatar) {
        this.chefAvatar = chefAvatar;
    }
}