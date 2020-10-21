package com.kodilla.testing.shape;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@DisplayName("TDD: Shape Test Suite \uD83D\uDE31")
class ForumTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    // Test 1
    @Test
    void addFigure() {
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(1);

        // When
        shapeCollector.addFigure(circle);

        //Then
        assertEquals(1, shapeCollector.getShapes().size());
    }

    // Test 2
    @Test
    void removeFigure() {
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(1);
        shapeCollector.addFigure(circle);

        // When
        shapeCollector.removeFigure(circle);

        //Then
        assertTrue(shapeCollector.getShapes().isEmpty());
    }

    // Test 3
    @Test
    void getFigure() {
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(1);
        shapeCollector.addFigure(circle);

        // When
        Shape result = shapeCollector.getFigure(0);

        //Then
        Assertions.assertEquals(result.getShapeName(), "Circle");
    }

    // Test 3
    @Test
    void showFigures() {
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(1);
        Triangle triangle = new Triangle(10, 5);
        Square square = new Square(1);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);

        // When
        String result = shapeCollector.showFigures();

        //Then
        assertEquals("Circle Triangle Square ", result);
    }
}

