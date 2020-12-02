package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public final class World {
    private final List<Continent> continents = new ArrayList<>();

    public List<Continent> getContinents() {
        return continents;
    }

    public void addContinent (Continent continent) {
        continents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream()) //tworzy jeden wielki stream z krajow
                .map(country -> country.getPeopleQuantity()) //zamienia kraje na BigDecimale
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current)); //oblicza sume z BigDecimali
    }

}