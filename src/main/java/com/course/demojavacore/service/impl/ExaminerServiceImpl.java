package com.course.demojavacore.service.impl;

import com.course.demojavacore.exceptions.WrongAmountException;
import com.course.demojavacore.service.ExaminerService;
import com.course.demojavacore.service.QuestionService;
import com.course.demojavacore.storage.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ExaminerServiceImpl implements ExaminerService {

    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        if (amount > questionService.getAll().size()) {
            throw new WrongAmountException();
        }
        return Stream.generate(questionService::getRandomQuestion)
                .distinct()
                .limit(amount)
                .collect(Collectors.toList());
    }

}
