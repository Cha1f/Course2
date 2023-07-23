package com.course.demojavacore;

import com.course.demojavacore.service.impl.JavaQuestionService;
import com.course.demojavacore.storage.Question;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JavaQuestionServiceTest {

    private final JavaQuestionService service = new JavaQuestionService();

    @Test
    void addTest() {
        Question q1 = new Question("jjj", "number");
        Question q2 = service.add("jjj", "number");
        assertEquals(q1, q2);
    }

    @Test
    void removeTest() {
        Question q1 = new Question("a", "b");
        service.add(q1);
        service.add("ab", "ba");
        service.remove(q1);
        assertEquals(1, service.getAll().size());
    }

    @Test
    void getAllTest() {
        service.add("qq", "azz");
        service.add("bb", "ssss");
        assertEquals(2, service.getAll().size());
    }
}
