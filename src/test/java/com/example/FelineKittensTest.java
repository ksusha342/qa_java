package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mockito;
import org.mockito.Spy;

import org.junit.Assert;

@RunWith(MockitoJUnitRunner.class)
public class FelineKittensTest {

    @Spy
    private Feline feline;

    @Test
    public void getTenKittenTest() {
        int kittensCount = 10;
        Assert.assertEquals(kittensCount, feline.getKittens(kittensCount));
    }

    @Test
    public void getOneKittenTest() {
        int kittensCount = 1;
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(kittensCount);
    }
}