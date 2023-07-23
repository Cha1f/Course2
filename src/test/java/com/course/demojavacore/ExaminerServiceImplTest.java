package com.course.demojavacore;

import com.course.demojavacore.service.ExaminerService;
import com.course.demojavacore.service.QuestionService;
import com.course.demojavacore.storage.Question;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.when;

import java.util.Arrays;

import java.util.Collection;
import java.util.List;

@ExtendWith(MockitoExtension.class) public class ExaminerServiceImplTest {
    @Mock
    QuestionService questionService;

    @InjectMocks
    ExaminerService service;

    List<Question> questionList = Arrays.asList(
            new Question("a", "z"),
            new Question("b", "x"),
            new Question("c", "c")
    );

    @BeforeEach
    void setUp() {
        when(questionService.getAll()).thenReturn(questionList);
    }

    @Test
    void getQuestionsTest() {
        int amount = 2;
        when(questionService.getRandomQuestion())
                .thenReturn(questionList.get(0))
                .thenReturn(questionList.get(1));

        Collection<Question> result = service.getQuestions(amount);

        assertEquals(amount, result.size());
        assertTrue(result.contains(questionList.get(0)));
        assertTrue(result.contains(questionList.get(1)));
    }
}
