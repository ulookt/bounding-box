import static org.junit.Assert.*;
import org.junit.Test;

import main.Circle;
import main.Square;
import main.Triangle;
import main.Hexagon;

public class TestShapes {

    @Test
    public void testCircleArea() {
        Circle c = new Circle(0, 0, 5);
        // 4 * r^2 = 100
        assertEquals(100.0, c.calculateBoxArea(), 0.0001);
    }

    @Test
    public void testSquareArea() {
        Square s = new Square(0, 0, 4);
        // a^2 = 16
        assertEquals(16.0, s.calculateBoxArea(), 0.0001);
    }

    @Test
    public void testTriangleArea() {
        Triangle t = new Triangle(0, 0, 4);
        double expected = Math.sqrt(3) / 2 * 16;
        assertEquals(expected, t.calculateBoxArea(), 0.0001);
    }

    @Test
    public void testHexagonArea() {
        Hexagon h = new Hexagon(0, 0, 3);
        double expected = 2 * Math.sqrt(3) * 9;
        assertEquals(expected, h.calculateBoxArea(), 0.0001);
    }

    @Test
    public void testLargestAreaComparison() {
        Circle c = new Circle(0, 0, 6);
        Square s = new Square(0, 0, 4);
        Triangle t = new Triangle(0, 0, 4);
        Hexagon h = new Hexagon(0, 0, 3);

        double circleArea = c.calculateBoxArea();
        double squareArea = s.calculateBoxArea();
        double triangleArea = t.calculateBoxArea();
        double hexagonArea = h.calculateBoxArea();

        assertTrue(circleArea > squareArea);
        assertTrue(circleArea > triangleArea);
        assertTrue(circleArea > hexagonArea);
    }
}