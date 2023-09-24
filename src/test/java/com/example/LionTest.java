package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Spy
    Feline feline;

    Lion lion;
    String sex;

    @Before
    public void setUp() throws Exception {
        sex = "Самка";
        lion = new Lion(sex, feline);
    }

    @Test
    public void getKittensTest() {
        int kittensCount = 1;
        Mockito.when(feline.getKittens()).thenReturn(kittensCount);
        Assert.assertEquals(kittensCount, lion.getKittens());
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> predatorFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(predatorFood);
        Assert.assertEquals(predatorFood, lion.getFood());
    }
}