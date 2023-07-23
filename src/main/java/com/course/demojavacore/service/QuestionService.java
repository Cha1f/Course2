package com.course.demojavacore.service;

import com.course.demojavacore.storage.Question;

import java.util.Collection;

public interface QuestionService {
    Question add(String add, String answer);

    Question add(Question question);

    Question remove(String add, String answer);

    Question remove(Question question);

    Collection<Question> getAll();

    Question getRandomQuestion();

}
