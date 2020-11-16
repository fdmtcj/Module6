package com.kodilla.testing.weather.stub;
import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double average() {
        double suma = 0;
        int numberOfElements = temperatures.getTemperatures().size();
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            suma += temperature.getValue();
        }
        return suma / numberOfElements;
    }

    public void median() {
        double median = 0;
        int elements = temperatures.getTemperatures().size();
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

        }

    }
}


