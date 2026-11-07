
package com.example.maven_project_practice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GradeCalculatorTest {

    @Test
    public void testTotal() {
        assertEquals(88, GradeCalculator.calculateTotal(9, 29, 50));
    }

    @Test
    public void testAverage() {
        assertEquals(88.0 / 3.0,
                GradeCalculator.calculateAverage(9, 29, 50), 0.001);
    }

    @Test
    public void testGradeA() {
        assertEquals("A", GradeCalculator.calculateGrade(95));
    }

    @Test
    public void testGradeB() {
        assertEquals("B", GradeCalculator.calculateGrade(85));
    }

    @Test
    public void testGradeC() {
        assertEquals("C", GradeCalculator.calculateGrade(75));
    }

    @Test
    public void testGradeD() {
        assertEquals("D", GradeCalculator.calculateGrade(65));
    }

    @Test
    public void testGradeE() {
        assertEquals("E", GradeCalculator.calculateGrade(45));
    }

    @Test
    public void testFail() {
        assertEquals("FAIL", GradeCalculator.calculateGrade(35));
    }

    @Test
    public void testBoundary90() {
        assertEquals("A", GradeCalculator.calculateGrade(90));
    }

    @Test
    public void testBoundary80() {
        assertEquals("B", GradeCalculator.calculateGrade(80));
    }

    @Test
    public void testBoundary70() {
        assertEquals("C", GradeCalculator.calculateGrade(70));
    }

    @Test
    public void testBoundary60() {
        assertEquals("D", GradeCalculator.calculateGrade(60));
    }

    @Test
    public void testBoundary40() {
        assertEquals("E", GradeCalculator.calculateGrade(40));
    }
}
