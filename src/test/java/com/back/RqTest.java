package com.back;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RqTest {
    @Test
    @DisplayName("re.getActionName()")
    void t1(){
        Rq rq = new Rq("수정?id=1");

        String actionName = rq.getActionName();


        assertEquals("수정",actionNmae);
    }
}
