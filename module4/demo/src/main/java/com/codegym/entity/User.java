package com.codegym.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;

    @Column(name = "user_create")
    private String userCreate;

//    @Column(name = "user_feedback")
//    private String userFeedback;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Question> questionList;

    public User() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserCreate() {
        return userCreate;
    }

    public void setUserCreate(String userCreate) {
        this.userCreate = userCreate;
    }

//    public String getUserFeedback() {
//        return userFeedback;
//    }
//
//    public void setUserFeedback(String userFeedback) {
//        this.userFeedback = userFeedback;
//    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }
}
