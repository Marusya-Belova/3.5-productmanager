package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book one = new Book(1, "Гарри Поттер и Философский камень", 800, "Джоан Роулинг");
    Book two = new Book(2, "Путешествие к центру земли", 700, "Жюль Верн");
    Book three = new Book(3, "Приключения Тома Сойера", 750, "Марк Твен");

    @Test
    void matchesAuthorCompliance() {
        boolean actual = one.matches("Джоан Роулинг");
        assertTrue(actual);
    }

    @Test
    void matchesAuthorDisrepancy() {
        boolean actual = three.matches("Джоан Роулинг");
        assertFalse(actual);
    }
    @Test
    void matchesNameDisrepancy() {
        boolean actual = two.matches("Java для чайников");
        assertFalse(actual);
    }
    @Test
    void matchesNameCompliance() {
        boolean actual = one.matches("Гарри Поттер и Философский камень");
        assertTrue(actual);
    }

}