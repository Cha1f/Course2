package com.course.demojavacore.service;

import com.course.demojavacore.storage.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
