package com.wipro.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

public class TestCheckPresence {

    @Test
    public void testCheckPresenceTrue() {

        DailyTasks obj = new DailyTasks();

        assertTrue(obj.checkPresence("Wipro Technologies", "Tech"));
    }

    @Test
    public void testCheckPresenceFalse() {

        DailyTasks obj = new DailyTasks();

        assertFalse(obj.checkPresence("Wipro Technologies", "Java"));
    }
}