package org.example;

public class SimpleCalculator {
    public int add(int numberA, int numberB) {
        return numberA + numberB;
    }

    public void determineLetterGrade (int numberGrade) {
        if (numberGrade == 0) {
            throw new IllegalArgumentException("Number grade is invalid");
        }
    }
}
