package edu.wctc.jpalab.entity.collection;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "collector", schema = "collection")
public class Collector {

    @Id
    private Long collectorId;

    private String collectorFirstname;
    private String collectorLastname;
    private String collectorAvatar;

    public Collector() {
    }

    public Long getCollectorId() {
        return collectorId;
    }

    public void setCollectorId(Long collectorId) {
        this.collectorId = collectorId;
    }

    public String getCollectorFirstname() {
        return collectorFirstname;
    }

    public void setCollectorFirstname(String collectorFirstname) {
        this.collectorFirstname = collectorFirstname;
    }

    public String getCollectorLastname() {
        return collectorLastname;
    }

    public void setCollectorLastname(String collectorLastname) {
        this.collectorLastname = collectorLastname;
    }

    public String getCollectorAvatar() {
        return collectorAvatar;
    }

    public void setCollectorAvatar(String collectorAvatar) {
        this.collectorAvatar = collectorAvatar;
    }
}

//saving this comment to push a new commit to github for testing