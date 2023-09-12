package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class LionManeTest {

    private final String sex;
    private final Boolean result;
    private final String exceptionMessage;


    public LionManeTest(String sex, Boolean result, String exceptionMessage) {
        this.sex = sex;
        this.result = result;
        this.exceptionMessage = exceptionMessage;
    }
    @Parameterized.Parameters
    public static Object[][] getAnimalFood() {
        return new Object[][] {
                {"Самец", true, null},
                {"Самка", false, null},
                {"Undefined", null, "Используйте допустимые значения пола животного - самец или самка"},
                {null, null, "Используйте допустимые значения пола животного - самец или самка"}
        };
    }

    @Test
    public void doesHaveManeTest() {
        try {
            Lion lion = new Lion(sex);
            Boolean actual = lion.doesHaveMane();
            assertEquals(result, actual);
        } catch (Exception e) {
            assertEquals(exceptionMessage, e.getMessage());
        }
    }
}
