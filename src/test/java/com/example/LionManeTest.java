package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class LionManeTest {

    private final String sex;
    private final Feline feline;
    private final Boolean result;
    private final String exceptionMessage;


    public LionManeTest(String sex, Feline feline, Boolean result, String exceptionMessage) {
        this.sex = sex;
        this.feline = feline;
        this.result = result;
        this.exceptionMessage = exceptionMessage;
    }
    @Parameterized.Parameters
    public static Object[][] getLionMane() {
        return new Object[][] {
                {"Самец", null, true, null},
                {"Самка", null, false, null},
                {"Undefined", null, null, "Используйте допустимые значения пола животного - самец или самка"},
                {null, null, null, "Используйте допустимые значения пола животного - самец или самка"}
        };
    }

    @Test
    public void doesHaveManeTest() {
        try {
            Lion lion = new Lion(sex, feline);
            Boolean actual = lion.doesHaveMane();
            assertEquals(result, actual);
        } catch (Exception e) {
            assertEquals(exceptionMessage, e.getMessage());
        }
    }
}
