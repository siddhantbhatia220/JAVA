package com.SiddhantBhatia.JAVA_II.Exception;
//throw and throws difference
//throw : used inside method , single , exception , explicitly
//throws : used in method signature , multiple exception , declares possibility
public class CustomException {
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18+");
        }
        System.out.println("Valid Age");
    }
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
