package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class CollectionTestSuite {
    @BeforeEach
    public void before(){
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after(){
        System.out.println("Test Case: end");
    }

    //testOddNumbersExterminatorEmptyList
    @DisplayName("When list is created without values, " +
                    "then it shouldn't return any values."
    )

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> emptyList = new ArrayList<>();
        OddNumbersExterminator testList = new OddNumbersExterminator();

        //When
        List<Integer> result = testList.exterminate(emptyList);

        //Then
        Assertions.assertEquals(emptyList, result);
    }



    //testOddNumbersExterminatorNormalList
    @DisplayName("When list is created with values, " +
            "then it should return even values"
    )

    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(34);
        numbers.add(65);
        numbers.add(87);
        numbers.add(90);

        OddNumbersExterminator oddNumbers = new OddNumbersExterminator();

        //When
        List<Integer> evenList = oddNumbers.exterminate(numbers);


        //Then
        Integer even[] = new Integer[] {12, 34, 90};
        List<Integer> expectedResult = Arrays.asList(even);
        Assertions.assertEquals(expectedResult, evenList);

    }
}
