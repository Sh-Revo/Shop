package techSpec;

import Categories.*;
import java.util.Scanner;

public interface Searching {
    Scanner scanner =new Scanner(System.in);

    default void searching(){

    }

    default void searching(Mobile[] arr){
        System.out.println("Введите название ");
        scanner.next();
        String nm = scanner.nextLine();
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i].getName().contains(nm)) {
                System.out.println("Название " + arr[i].getName() + "\nID " + arr[i].getId() + "\nКоличество " + arr[i].getValue());
            }

        }
    }

    default void searching(PC arr[]){
        System.out.println("Введите название ");
        scanner.next();
        String nm = scanner.nextLine();
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i].getName().contains(nm)) {
                System.out.println("Название " + arr[i].getName() + "\nID " + arr[i].getId() + "\nКоличество " + arr[i].getValue());
            }

        }
    }

    default void searching(Vegetable arr[]){
        System.out.println("Введите название ");
        scanner.next();
        String nm = scanner.nextLine();
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i].getName().contains(nm)) {
                System.out.println("Название " + arr[i].getName() + "\nID " + arr[i].getId() + "\nКоличество " + arr[i].getValue());
            }

        }
    }

    default void searching(Cookie arr[]){
        System.out.println("Введите название ");
        scanner.next();
        String nm = scanner.nextLine();
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i].getName().contains(nm)) {
                System.out.println("Название " + arr[i].getName() + "\nID " + arr[i].getId() + "\nКоличество " + arr[i].getValue());
            }

        }
    }

    default void searching(Water arr[]){
        System.out.println("Введите название ");
        scanner.next();
        String nm = scanner.nextLine();
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i].getName().contains(nm)) {
                System.out.println("Название " + arr[i].getName() + "\nID " + arr[i].getId() + "\nКоличество " + arr[i].getValue());
            }

        }
    }

    default void searching(Sweet arr[]){
        System.out.println("Введите название ");
        scanner.next();
        String nm = scanner.nextLine();
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i].getName().contains(nm)) {
                System.out.println("Название " + arr[i].getName() + "\nID " + arr[i].getId() + "\nКоличество " + arr[i].getValue());
            }

        }
    }

    default void searching(Clother arr[]){
        System.out.println("Введите название ");
        scanner.next();
        String nm = scanner.nextLine();
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i].getName().contains(nm)) {
                System.out.println("Название " + arr[i].getName() + "\nID " + arr[i].getId() + "\nКоличество " + arr[i].getValue());
            }

        }
    }

}
