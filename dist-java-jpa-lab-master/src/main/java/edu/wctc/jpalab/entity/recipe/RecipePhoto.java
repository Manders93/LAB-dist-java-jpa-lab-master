package edu.wctc.jpalab.entity.recipe;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "photo", schema = "recipe")
public class RecipePhoto {

    @Id
    private Long photoId;

    @ManyToOne
    @JoinColumn(name = "photo_recipe_id")
    private Recipe recipe;

    private String photoFilename;
    private String photoCaption;
    private LocalDateTime photoDatestamp;
    private String photoVisible;

    public RecipePhoto() {
    }

    public Long getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Long photoId) {
        this.photoId = photoId;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getPhotoFilename() {
        return photoFilename;
    }

    public void setPhotoFilename(String photoFilename) {
        this.photoFilename = photoFilename;
    }

    public String getPhotoCaption() {
        return photoCaption;
    }

    public void setPhotoCaption(String photoCaption) {
        this.photoCaption = photoCaption;
    }

    public LocalDateTime getPhotoDatestamp() {
        return photoDatestamp;
    }

    public void setPhotoDatestamp(LocalDateTime photoDatestamp) {
        this.photoDatestamp = photoDatestamp;
    }

    public String getPhotoVisible() {
        return photoVisible;
    }

    public void setPhotoVisible(String photoVisible) {
        this.photoVisible = photoVisible;
    }
}