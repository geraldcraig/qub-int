package uk.ac.qub;

public class Binary {

    public static void main(String[] args) {
        int a = 5; // In binary: 0101
        int b = 3; // In binary: 0011

        int andResult = a & b; // Bitwise AND
        int orResult = a | b;  // Bitwise OR
        int xorResult = a ^ b; // Bitwise XOR
        int notAResult = ~a;   // Bitwise NOT

        System.out.println("a: " + a + " (binary: " + Integer.toBinaryString(a) + ")");
        System.out.println("b: " + b + " (binary: " + Integer.toBinaryString(b) + ")");
        System.out.println("a & b: " + andResult + " (binary: " + Integer.toBinaryString(andResult) + ")");
        System.out.println("a | b: " + orResult + " (binary: " + Integer.toBinaryString(orResult) + ")");
        System.out.println("a ^ b: " + xorResult + " (binary: " + Integer.toBinaryString(xorResult) + ")");
        System.out.println("~a: " + notAResult + " (binary: " + Integer.toBinaryString(notAResult) + ")");
    }
}
