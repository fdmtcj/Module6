package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigMac {

    private final RollType roll;
    private final int burgers;
    private final SauceType sauce;
    private List<IngredientsType> ingredients;

    public static class BigMacBuilder {
        private RollType roll;
        private int burgers;
        private SauceType sauce;
        private List<IngredientsType> ingredients = new ArrayList<>();

        public BigMacBuilder roll(RollType roll) {
            this.roll = roll;
            return this;
        }

        public BigMacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder sauce(SauceType sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigMacBuilder ingredients(IngredientsType ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public BigMac build() {
            return new BigMac(roll, burgers, sauce, ingredients);
        }
    }

    private BigMac(RollType roll, int burgers, SauceType sauce, List<IngredientsType> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public RollType getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public SauceType getSauce() {
        return sauce;
    }

    public List<IngredientsType> getIngredients() {
        return ingredients;
    }
}
