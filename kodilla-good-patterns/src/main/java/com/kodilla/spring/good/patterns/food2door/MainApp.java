package com.kodilla.spring.good.patterns.food2door;

public class MainApp {

    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();

        ProducerResourcesRetriever resourcesRetriever = new ProducerResourcesRetriever();
        Producer producer = (Producer) new ExtraFoodShop(resourcesRetriever.retrieve());

        DeliveryProcessor deliveryProcessor = new DeliveryProcessor(producer, order);
        deliveryProcessor.process();
    }
}
