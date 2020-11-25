package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public final class Continent {

    private String continentName;
    private Country country;

    public Country getCountry() {
        return country;
    }

        public Continent(String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    private List<Country> countries;

    public Continent(List<Country> countries) {
        this.countries = countries;
    }

    public List<Country> getCountries() {
        return countries;
    }



}
