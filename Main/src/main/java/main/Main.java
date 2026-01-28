/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;
import java.io.*;
import java.util.*;
/**
 * Main class to read shapes from a file, calculate their bounding box areas,
 * and determine the shape with the largest bounding box.
 * Supports Circle, Square, Triangle, and Hexagon.
 * Input file: shapes.txt
 * 
 * Example:
 * 5
 * C -2 -4 5
 * T 0 0 4
 * S 0 0 4
 * H 0 0 3
 * C 9 8 6
 * 
 * Output: Shape with the largest bounding box.
 * 
 * @author Ulukbek
 */
public class Main {
    /**
     * Program entry point.
     * Reads shape data, validates it, creates shape objects,
     * and prints the shape with the largest bounding box.
     */
    public static void main(String[] args) {
        File file = new File("shapes.txt");

        try {
            // Basic file validation 
            if (!file.exists()) {
                throw new InvalidInputException("File shapes.txt not found!");
            }
            if (file.length() == 0) {
                throw new InvalidInputException("File is empty!");
            }

            Scanner sc = new Scanner(file);
            if (!sc.hasNextInt()) {
                throw new InvalidInputException("First line must contain the number of shapes!");
            }

            int n = sc.nextInt();
            if (n <= 0) {
                throw new InvalidInputException("Number of shapes must be positive!");
            }

            List<Shape> shapes = new ArrayList<>();

            // Read each shape
            for (int i = 0; i < n; i++) {
                if (!sc.hasNext()) throw new InvalidInputException("Missing shape type at line " + (i + 2));
                String typeTok = sc.next();
                char type = Character.toUpperCase(typeTok.charAt(0));

                if (!sc.hasNextDouble()) throw new InvalidInputException("Missing x coordinate at line " + (i + 2));
                double x = sc.nextDouble();

                if (!sc.hasNextDouble()) throw new InvalidInputException("Missing y coordinate at line " + (i + 2));
                double y = sc.nextDouble();

                if (!sc.hasNextDouble()) throw new InvalidInputException("Missing side length or radius at line " + (i + 2));
                double a = sc.nextDouble();

                // Validate side/radius positivity
                if (a <= 0) {
                    throw new InvalidInputException("Side length or radius must be positive at line " + (i + 2));
                }

                Shape shape = switch (type) {
                    case 'C' -> new Circle(x, y, a);
                    case 'S' -> new Square(x, y, a);
                    case 'T' -> new Triangle(x, y, a);
                    case 'H' -> new Hexagon(x, y, a);
                    default -> throw new InvalidInputException("Unknown shape type: " + type);
                };

                shapes.add(shape);
            }

            // Check for extra data
            if (sc.hasNext()) {
                throw new InvalidInputException("File contains extra data after the expected " + n + " shapes.");
            }

            // Find shape with largest bounding box
            Shape maxShape = null;
            double maxArea = -1;

            for (Shape s : shapes) {
                double area = s.calculateBoxArea();
                if (area > maxArea) {
                    maxArea = area;
                    maxShape = s;
                }
            }

            // Print result
            if (maxShape != null) {
                System.out.printf("Shape with the largest bounding box: %s%n", 
                                  maxShape.getClass().getSimpleName());
                System.out.printf("Bounding box area: %.4f%n", maxArea);
            }

        } catch (InvalidInputException e) {
            System.err.println("Input error: " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        }
    }
}
