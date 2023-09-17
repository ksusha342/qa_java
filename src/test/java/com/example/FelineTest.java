package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    @Test
    public void getFamilyTest() {
        String result = "Кошачьи";
        Feline feline = new Feline();
        Assert.assertEquals(result, feline.getFamily());
    }

    @Test
    public void eatMeatTest() throws Exception {
        List<String> result = List.of("Животные", "Птицы", "Рыба");
        Feline feline = new Feline();
        Assert.assertEquals(result, feline.eatMeat());
    }
}