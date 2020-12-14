package ua.npu.edu.task02;

import java.util.Scanner;

public class MyVector {
    public static void main(String[] args) throws MyException {
        int [] arr  = {1, 5, 6, 7};
        int a = 1;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        if (a < 0){
            throw new MyException("Wrong");
        }

    }
}
