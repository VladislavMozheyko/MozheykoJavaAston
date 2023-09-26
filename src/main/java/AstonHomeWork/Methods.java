package AstonHomeWork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Methods {
    public void checkNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        try {
            double number = scan.nextInt();
            if (number > 7) {
                System.out.println("Привет.");
            }
        } catch (InputMismatchException exp) {
            System.out.println("Ошибка! Введен несовместимый тип данных.");
        }
    }

    public void checkName() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя :");
        String name = scan.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет Вячеслав.");
        } else {
            System.out.println("Нет такого имени.");
        }
    }

    public void arrInfo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число ячеек массива :");
        try {
            int size = scan.nextInt();
            int[] arr = new int[size];
            System.out.println("Введите числа массива :");
            for (int i = 0; i < size; i++) {
                arr[i] = scan.nextInt();
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 3 == 0) {
                    System.out.println(arr[i]);

                }
            }
        } catch (ArrayStoreException exc) {
            System.out.println("Ошибка! Введен неверный тип данных.");
        } catch (InputMismatchException ecx2) {
            System.out.println("Ошибка! Введен несовместимый тип данных.");
        }
    }
}
