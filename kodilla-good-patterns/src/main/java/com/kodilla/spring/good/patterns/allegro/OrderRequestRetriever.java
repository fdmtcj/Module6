package com.kodilla.spring.good.patterns.allegro;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User buyer = new User("Robert ", "Lewandowski", "Warszawa", "222454446");
        User seller = new User("Jan", "Nowak", "Koszalin", "34456564576");
        Order order = new Order("Game", "23152", 149.99);

        return new OrderRequest(buyer, seller, order);
    }
}
