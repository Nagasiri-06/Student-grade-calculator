package com.example.maven_github_demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GradeCalculatorTest {

	    GradeCalculator calculator = new GradeCalculator();

	    @Test
	    void testGradeA() {
	        assertEquals("A", calculator.calculateGrade(95));
	    }

	    @Test
	    void testGradeB() {
	        assertEquals("B", calculator.calculateGrade(85));
	    }

	    @Test
	    void testGradeC() {
	        assertEquals("C", calculator.calculateGrade(75));
	    }

	    @Test
	    void testGradeF() {
	        assertEquals("F", calculator.calculateGrade(40));
	    }
	}

