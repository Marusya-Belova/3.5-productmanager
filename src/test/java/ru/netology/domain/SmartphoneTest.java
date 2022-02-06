package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    Smartphone one = new Smartphone(1, "Iphone", 100000, "Apple");
    Smartphone two = new Smartphone(2, "3210", 2000, "Nokia");
    Smartphone three = new Smartphone(3, "RZRV3", 15000, "Motorolla");

    @Test
    void matchesCreatorCompliance() {
        boolean actual = one.matches("Apple");
        assertTrue(actual);
    }

    @Test
    void matchesCreatorDisrepancy() {
        boolean actual = two.matches("Samsung");
        assertFalse(actual);
    }
    @Test
    void matchesNameDisrepancy() {
        boolean actual = three.matches("Iphone");
        assertFalse(actual);
    }
    @Test
    void matchesNameCompliance() {
        boolean actual = one.matches("Iphone");
        assertTrue(actual);
    }

}