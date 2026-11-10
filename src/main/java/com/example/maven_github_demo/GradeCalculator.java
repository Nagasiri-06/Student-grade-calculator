package com.example.maven_github_demo;

	public class GradeCalculator {

	    public String calculateGrade(int marks) {

	        if (marks >= 90) {
	            return "A";
	        } else if (marks >= 80) {
	            return "B";
	        } else if (marks >= 70) {
	            return "C";
	        } else {
	            return "F";
	        }
	    }

	    public static void main(String[] args) {

	        GradeCalculator calculator = new GradeCalculator();

	        int marks = 95;

	        System.out.println("Marks: " + marks);
	        System.out.println(
	            "Grade: " + calculator.calculateGrade(marks)
	        );
	    }
	}
