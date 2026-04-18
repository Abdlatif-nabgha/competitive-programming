package day6;


import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        StringBuilder binary = new StringBuilder();

        while (n > 0) {
            if (n % 2 == 1) {
                binary.append("1");
            } else {
                binary.append("0");
            }
            n /= 10;
        }
        int binaryToInt = 0;
        int prod = 1;
        for (char c : binary.toString().toCharArray()) {
            if (c == '1')
                binaryToInt += prod;
            prod *= 2;
        }
        System.out.println(binaryToInt);
    }
}
