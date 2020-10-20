package com.kodilla.testing.shape;


import org.junit.jupiter.api.*;


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
    void addFigure(Shape shape) {
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(circle, 1)

        // When
        shapeCollector.addFigure(circle);
        Circle expected = shapeCollector.getFigure(0);

        //Then
        Assertions.assertArrayEquals(expected, circle);
    }

    // Test 2
    @Test
    void removeFigure(Shape shape) {
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(circle, 1)

        // When
        shapeCollector.removeFigure(circle, 0);
        // expected pusty record?? czy zakładamy, że lista jest pusta?

        //Then
        Assertions.assertArrayEquals(..., );
    }

    // Test 3
    @Test
    void getFigure(int n) {
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(circle, 1);

        // When
        shapeCollector.getFigure(int 1)

        //Then
        Assertions.assertArrayEquals();
    }

    // Test 3
    @Test
    void showFigures() {
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(circle, 1);

        // When
        Circle expected = shapeCollector.getFigure(0);

        //Then
        Assertions.assertArrayEquals(expected, showFigures());
    }
}

