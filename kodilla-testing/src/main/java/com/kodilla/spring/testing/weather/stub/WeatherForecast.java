package com.kodilla.spring.testing.weather.stub;
import java.util.*;

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

    public double median() {

        int elements = temperatures.getTemperatures().size();

        List<Double> values = new ArrayList<>(temperatures.getTemperatures().values());
        Collections.sort(values);

        if(values.size() % 2 == 0) {
            return (values.get(elements/2)+ values.get(elements/2-1))/2.0;

        } else {

            return values.get(elements/2);
        }
    }
}


