package com.codeup.blog.models;

import javax.persistence.*;

@Entity
//Table is a representation of many ads
@Table(name = "ads")
//representation of ONE Ad
public class Ad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 200)
    private String title;

    @Column(nullable = false)
    private String description;

    //Spring Framework uses this empty constructor
    public Ad() {
    }

    //insert Ad
    public Ad(String title, String description) {
        this.title = title;
        this.description = description;
    }

    //read Ad
    public Ad(long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
