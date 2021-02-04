package com.kodilla.spring.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Continent europe = new Continent("Europa");
        europe.addCountry(new Country("Polska", new BigDecimal("38956541")));


        //When
        World world = new World();
        world.addContinent(europe);


        BigDecimal actualPopulation = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPopulation = new BigDecimal("38956541");
        Assert.assertEquals(expectedPopulation, actualPopulation);
    }
}
