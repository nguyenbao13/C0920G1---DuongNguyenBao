package com.codegym.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "question_type")
public class QuestionType {
    @Id
    @Column(name = "question_type_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer questionTypeId;

    private String name;

    @OneToMany(mappedBy = "questionType", cascade = CascadeType.ALL)
    private List<Question> questionList;

    public QuestionType() {
    }

    public Integer getQuestionTypeId() {
        return questionTypeId;
    }

    public void setQuestionTypeId(Integer questionTypeId) {
        this.questionTypeId = questionTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }
}
