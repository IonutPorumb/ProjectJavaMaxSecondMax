package com.accenture.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TddDemoTest {
    // Write a method "max" that gets as an input a list of Integers and returns the max two values.
    // If List is null return null
    // if List has one element return null
    // if list has at least 2 elements return max 2 elements

    @Test
    void testIfClassExists() {
        TddDemo tdd = new TddDemo();
    }

    @Test
    void testMethodExistsWithProperParams() {
        TddDemo tdd = new TddDemo();
        tdd.max(List.of(1, 2, 5, 7, 5));
    }

    @Test
    void testMethodHasProperReturnType() {
        TddDemo tdd = new TddDemo();
        MaxValues values = tdd.max(List.of(1, 2, 5, 7, 3));
    }

    @Test
    void testNullReturnValueIfListIsNull() {
        TddDemo tdd = new TddDemo();
        MaxValues values = tdd.max(null);
        Assertions.assertNull(values);
    }

    @Test
    void testNullReturnValueIfListHasOneElement() {
        TddDemo tdd = new TddDemo();
        MaxValues values = tdd.max(List.of(1));
        Assertions.assertNull(values);
    }


    @Test
    void testReturnNotNullIfListSizeBiggerThenOne() {
        TddDemo tdd = new TddDemo();
        MaxValues values = tdd.max(List.of(1, 2, 5, 7, 3));
        Assertions.assertNotNull(values);
    }

    @Test
    void testMaxIsCorrect() {
        TddDemo tdd = new TddDemo();
        MaxValues values = tdd.max(List.of(1, 2, 5, 7, 3));

        int expected = 7;
        Assertions.assertNotNull(values);
        Assertions.assertEquals(expected, values.max());
    }

}