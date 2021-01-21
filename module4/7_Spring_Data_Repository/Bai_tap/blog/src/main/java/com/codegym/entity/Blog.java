package com.codegym.entity;

import javax.persistence.*;

@Entity
//@Table(name = "blog")
public class Blog {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String title;
    private String content;
    private String dateCreated;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

    public Blog() {
    }

    public Blog(String title, String content, String dateCreated) {
        this.title = title;
        this.content = content;
        this.dateCreated = dateCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
}
