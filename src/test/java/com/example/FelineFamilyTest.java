package com.example;

import org.junit.Assert;
import org.junit.Test;

public class FelineFamilyTest {

    @Test
    public void getFamilyTest() {
        String result = "Кошачьи";
        Feline feline = new Feline();
        Assert.assertEquals(result, feline.getFamily());
    }
}