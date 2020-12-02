package world;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Continent northAmerica = new Continent();
        northAmerica.addCountry(new Country("USA", new BigDecimal("2")));
        northAmerica.addCountry(new Country("Canada", new BigDecimal("1")));

        Continent europe = new Continent();
        europe.addCountry(new Country("Poland", new BigDecimal("2")));
        europe.addCountry(new Country("Germany", new BigDecimal("2")));

        Continent asia = new Continent();
        asia.addCountry(new Country("China", new BigDecimal("5")));
        asia.addCountry(new Country("Japan", new BigDecimal("4")));

        //When
        World world = new World();
        world.addContinent(asia);
        world.addContinent(europe);
        world.addContinent(northAmerica);
        BigDecimal totalPeopleQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("16");
        Assertions.assertEquals(expectedPeopleQuantity, totalPeopleQuantity);
    }
}
