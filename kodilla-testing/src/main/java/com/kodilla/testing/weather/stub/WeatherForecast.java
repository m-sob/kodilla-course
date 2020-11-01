package com.kodilla.testing.weather.stub;

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

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calcuateAverage() {
        Collection<Double> temps = this.temperatures.getTemperatures().values();

        double sum = 0;
        for(Double i : temps) {
            sum += i;
        }
        return  sum / temps.size();
    }

    public double findMedian() {
        List<Double> temps = new ArrayList<Double>(this.temperatures.getTemperatures().values());
        Collections.sort(temps);
        double median;
        int middle = temps.size() / 2;
        if (temps.size() % 2 == 0) {
            double sumOfMiddleElements = temps.get(middle) + temps.get(middle-1);
            median =  sumOfMiddleElements / 2;
        } else {
            median = temps.get(middle);
        }
        return median;

        //wyjmij z mapy tylko wartosci i je posortuj
//        List<Double> temps = (List<Double>) this.temperatures.getTemperatures().values();
//        zostawiłam, bo to mi nie działa :( wyskakiwał błąd i po tym poszukałam, co się działo i w końcu chyba działa...

    }
}