package com.purwadhika;

import com.purwadhika.util.ListUtil;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class ListUtilTest {

    private final ListUtil listUtil = new ListUtil();

    @Test
    void testRotateArray() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        int d = 2;
        List<Integer> expected = Arrays.asList(3, 4, 5, 6, 7, 1, 2);

        assertEquals(expected, listUtil.rotateArray(input, d));
    }

    @Test
    @DisplayName("")
    void testCheckArrayDuplicate() {
        assertTrue(listUtil.checkArrayDuplicate(Arrays.asList(1, 2, 3, 1)));
        assertFalse(listUtil.checkArrayDuplicate(Arrays.asList(1, 2, 3, 4)));
        assertFalse(listUtil.checkArrayDuplicate(Arrays.asList()));
        assertThrows(IllegalArgumentException.class, () -> listUtil.checkArrayDuplicate(null));
    }

    @Test
    void testRemoveArrayDuplicate() {
        assertEquals(Arrays.asList(1, 2, 3), listUtil.removeArrayDuplicate(Arrays.asList(1, 2, 3, 1, 2, 3)));
        assertEquals(Arrays.asList(4, 5, 6), listUtil.removeArrayDuplicate(Arrays.asList(4, 5, 6, 6, 5, 4)));
        assertEquals(Arrays.asList(), listUtil.removeArrayDuplicate(Arrays.asList()));
        assertNull(listUtil.removeArrayDuplicate(null));
    }

    @Test
    void testSortAsc() {
        assertEquals(Arrays.asList(1, 2, 3, 4), listUtil.sort(Arrays.asList(4, 3, 2, 1), "asc"));
        assertEquals(Arrays.asList(-5, -3, 0, 2, 4), listUtil.sort(Arrays.asList(2, -3, 4, 0, -5), "asc"));
    }

    @Test
    void testSortDesc() {
        assertEquals(Arrays.asList(4, 3, 2, 1), listUtil.sort(Arrays.asList(1, 2, 3, 4), "desc"));
        assertEquals(Arrays.asList(4, 2, 0, -3, -5), listUtil.sort(Arrays.asList(2, -3, 4, 0, -5), "desc"));
    }

    @Test
    void testSortWithInvalidDirection() {
        assertThrows(IllegalArgumentException.class, () -> listUtil.sort(Arrays.asList(1, 2, 3), "random"));
        assertThrows(IllegalArgumentException.class, () -> listUtil.sort(Arrays.asList(1, 2, 3), ""));
        assertThrows(IllegalArgumentException.class, () -> listUtil.sort(Arrays.asList(1, 2, 3), null));
    }

    @Test
    void testSortDefaultAsc() {
        assertEquals(Arrays.asList(1, 2, 3, 4), listUtil.sort(Arrays.asList(4, 3, 2, 1)));
    }

    @Test
    void testRemoveOccurrences() {
        assertEquals(Arrays.asList(2, 3, 4), listUtil.removeOccurences(Arrays.asList(1, 2, 3, 1, 4), 1));
        assertEquals(Arrays.asList(5, 6, 7), listUtil.removeOccurences(Arrays.asList(5, 6, 7), 9));
        assertEquals(Arrays.asList(), listUtil.removeOccurences(Arrays.asList(), 1));
        assertNull(listUtil.removeOccurences(null, 1));
    }

    @Test
    void testReverseWord() {
        assertEquals("gnalam", listUtil.reverseWord("malang"));
        assertEquals("sam", listUtil.reverseWord("mas"));
        assertThrows(IllegalArgumentException.class, () -> listUtil.reverseWord(""));
        assertThrows(IllegalArgumentException.class, () -> listUtil.reverseWord(null));
    }

    @Test
    void testFindDuplicates() {
        assertEquals(Arrays.asList(2, 3), listUtil.findDuplicates(Arrays.asList(4, 3, 2, 7, 8, 2, 3, 1)));
        assertEquals(Arrays.asList(1), listUtil.findDuplicates(Arrays.asList(1, 1, 2)));
        assertEquals(Arrays.asList(), listUtil.findDuplicates(Arrays.asList(1, 2, 3, 4)));
        assertNull(listUtil.findDuplicates(null));
    }

    @Test
    void testCountWarmDays() {
        assertEquals(Arrays.asList(1, 1, 4, 2, 1, 1, 0, 0), listUtil.countWarmDays(Arrays.asList(73, 74, 75, 71, 69, 72, 76, 73)));
        assertEquals(Arrays.asList(1, 1, 1, 0), listUtil.countWarmDays(Arrays.asList(30, 40, 50, 60)));
        assertEquals(Arrays.asList(1, 1, 0), listUtil.countWarmDays(Arrays.asList(30, 60, 90)));
    }
}
