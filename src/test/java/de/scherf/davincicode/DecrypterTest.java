package de.scherf.davincicode;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

class DecrypterTest {

    private Decrypter decrypter;

    @BeforeEach
    void setUp() {
        decrypter = new Decrypter();
    }

    @Test
    void decrypt() {
        List<String> wordList = decrypter.decrypt("17 14 16 – 19 8 11 1 4 22 21 – 10 22 0 24 23 17 22 4 – 16 24 19 25 – 10 22 24 – 23 5 8 17 – 22 24 23 3 23 17 0 3 22 23 0 18 24 7 – 7 8 14 17 – 16 24 22 10 22 23 3 23 17 18 13 14 23 18 24 7 – 1 3 23 20 4 – 16 24 22 10 22 23 – 0 3 22 23 0 – 23 22 3 23 – 5 16 4 – 23 3 15 15 – 23 3 15 15 – 16 24 22 10 22 23 – 7 8 14 17 – 0 3 22 23 0 3 23 17 18 13 14 23 18 24 7 – 1 3 23 20 4 – 23 22 3 23 – 16 22 19 25 16 – 0 3 22 23 0 – . – 17 14 16 – 1 14 16 16 13 5 8 4 – 24 16 4 – 23 14 4 3 22 8 15 24 19 25 – 7 22 25 22 24 12");

        assertThat(wordList, hasSize(greaterThan(1)));
        assertThat(wordList.get(0), is("DAS"));
    }
}