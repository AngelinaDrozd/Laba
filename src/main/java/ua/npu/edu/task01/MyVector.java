package ua.npu.edu.task01;

import java.util.Scanner;

public class MyVector {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 7};
        int a = 1;
        Scanner sc = new Scanner(System.in);

        try {
            a = sc.nextInt();
            arr[a - 1] = 4 / a;
        } catch (ArithmeticException math) {
            System.out.println("Math exception");
        } catch (ArrayIndexOutOfBoundsException arrr) {
            System.out.println("Array exception");
        } catch (Exception ex) {
            System.out.println("Other exception");
        }
    }
}
