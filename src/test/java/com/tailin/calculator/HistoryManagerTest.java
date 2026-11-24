package com.tailin.calculator;

import com.tailin.calculator.calculator.HistoryManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HistoryManagerTest {
    @Test
    void historyStorageCheck() {
        HistoryManager history = new HistoryManager();
        history.addOperation("5.0 + 1.0 = 6.0");
        assertEquals(1, history.size());
    }

    @Test
    void checkLimitHistory() {
        HistoryManager history = new HistoryManager();
        for (int i = 1; i <= 11; i++){
            history.addOperation("op " + i);
        }
        assertEquals(10, history.size());
        assertEquals("op 2", history.get(0));
        assertEquals("op 11", history.get(9));
    }

    @Test
    void checkingEmptyHistory() {
        HistoryManager history = new HistoryManager();
        for (int i = 1; i <= 11; i++){
            history.addOperation("op " + i);
        }
        history.clearHistory();
        assertEquals(0, history.size());
    }

    @Test
    void createdListIsEmpty() {
        HistoryManager history = new HistoryManager();
        assertEquals(0, history.size());
    }
}
