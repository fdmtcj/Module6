package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class BurgerTestSuite {

    @Test
    public void testBigMacNew() {
        //Given
        BigMac bigmac = new BigMac.BigMacBuilder()
                .roll(RollType.STANDARD)
                .burgers(2)
                .sauce(SauceType.THOUSAND_ISLANDS)
                .ingredients(IngredientsType.CHEESE)
                .ingredients(IngredientsType.CHILI_PEPPERS)
                .ingredients(IngredientsType.LETTUCE)
                .build();
        //When
        int howManyBurgers = bigmac.getBurgers();
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(2, howManyBurgers);
        Assert.assertEquals(3, howManyIngredients);
        Assert.assertTrue(bigmac.getIngredients().contains(IngredientsType.CHILI_PEPPERS));
        Assert.assertFalse(bigmac.getIngredients().contains(IngredientsType.BACON));
    }
}