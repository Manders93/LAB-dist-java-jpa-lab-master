package edu.wctc.jpalab.entity.collection;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "photo", schema = "collection")
public class CollectorPhoto {

    @Id
    private Long photoId;

    @ManyToOne
    @JoinColumn(name = "photo_collector_id")
    private Collector collector;

    private String photoFilename;
    private LocalDateTime photoDatestamp;
    private String photoVisible;

    public CollectorPhoto() {
    }

    public Long getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Long photoId) {
        this.photoId = photoId;
    }

    public Collector getCollector() {
        return collector;
    }

    public void setCollector(Collector collector) {
        this.collector = collector;
    }

    public String getPhotoFilename() {
        return photoFilename;
    }

    public void setPhotoFilename(String photoFilename) {
        this.photoFilename = photoFilename;
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