package com.kodilla.stream.sand;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SandStorageTestSuite {

    @Test
    void testGetSandBeansQuantity() {
        //Given
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Asia());
        continents.add(new Africa());

        //When
        //Stworzenie zmiennej typu BigDecimal z wartoscia 0
        BigDecimal totalSand = BigDecimal.ZERO;

        //Petla foreach ktora przejdzie po kazdym obiekcie z listy continents
        for (SandStorage continent : continents) {
            //Dodanie do sumy totalSand liczby ziaren z aktualnego kontynentu. "aktualny" - obiekt po ktorym akurat iteruje petla
            //totalSand.add zwraca nowy BigDecimal z wynikiem dodawania
            totalSand = totalSand.add(continent.getSandBeansQuantity());
        }

        //Then
        BigDecimal expectedSand = new BigDecimal("211111110903703703670");
        assertEquals(expectedSand, totalSand);
    }

    @Test
    void testGetSandBeansQuantityWithReduce() {
        //Given
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Asia());
        continents.add(new Africa());

        //When
        BigDecimal totalSand = continents.stream() //odpalenie streama obiektow SandStorage
                .map(SandStorage::getSandBeansQuantity)  //odpalenie streama obiektow BigDecimal
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        //ad reduce.
        //pierwszy argument to stan poczatkowy sum, drugi argument to lambda odpalana dla kazdego elementu
        //ze strumienia.
        //current oznacza kazdy element ze strumienia
        //reduce jest operacje konczaca, nie mozna po nim wykonac kolejnej operacji typu map lub filter

        //Then
        BigDecimal expectedSand = new BigDecimal(("211111110903703703670"));
        assertEquals(expectedSand, totalSand);
    }
}
