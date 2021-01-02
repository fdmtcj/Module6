package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

        InformationService informationService;

    public ProductOrderService(InformationService informationService) {
        this.informationService = informationService;
    }

    public boolean processOrder() {
        //przyjęcie zamówienia
        //zarezerwowanie towaru na magazynie
        informationService.inform();
        return true;
    }
}
