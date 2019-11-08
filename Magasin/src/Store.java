import Categories.*;
import techSpec.*;

import java.io.IOException;
import java.lang.annotation.Target;
import java.text.ParseException;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;



public class Store extends AddSmt implements Searching{
    private Scanner scanner = new Scanner(System.in);
    double wallet = 0;




    @Override
    public void addThings(Mobile[] arr) throws ParseException {
        int id;
        String name;
        int value;
        String description;
        double price;
        String os;
        int RAMvalue;
        String RAMname;
        int sizeOfCore;
        double frequency;
        int hour;
        double screenDiagonal;
        int timeWorkingBattery;
        int k=0;

        System.out.println("Введите ид");
        id = 1;//scanner.nextInt();
        for (int i = 0; i < arr.length - 1; i++) {
            if (id == arr[i].getId()) {
                System.out.println("Введите количество добавляемых смартфонов" + arr[i].getName() + ":");
                int valuePlus = scanner.nextInt();
                arr[i].setValue(arr[i].getValue() + valuePlus);
                System.out.println("Телефоны успешно добавлены" + arr[i].getValue());
                main.rerun = true;
                main.menu();
                break;

            } else break;

        }
        //scanner.next();
        System.out.println("Введите имя:");
        name = "Nokia";//scanner.nextLine();
        System.out.println("Введите количество");
        value = 8;//scanner.nextInt();
        //scanner.next();
        System.out.println("Введите описание");
        description = "Смартфон";// scanner.nextLine();
        System.out.println("Введите цену");
        price = 550;//scanner.nextDouble();
        //scanner.next();
        System.out.println("Введите ОС");
        os = "android";//scanner.nextLine();
        System.out.println("Введите размер ОП");
        RAMvalue = 8;//scanner.nextInt();
        //scanner.nextLine();
        System.out.println("Введите тип ОП");
        RAMname = "ddr2";// scanner.nextLine();
        System.out.println("Введите кол-во ядер");
        sizeOfCore = 2;//scanner.nextInt();
        System.out.println("Введите частоту");
        frequency = 4.5;// scanner.nextDouble();
        System.out.println("Введите гарантию");
        hour = 1220;// scanner.nextInt();
        System.out.println("Введите диагональ");
        screenDiagonal = 6.3;// scanner.nextFloat();
        //scanner.nextLine();
        System.out.println("Введите время работы баттареи");
        timeWorkingBattery = 24;//scanner.nextInt();


        mobiles[k] = new Mobile(id, name, value, description, price,
                new OS(os),
                new RAM(RAMname, RAMvalue),
                new CPU(sizeOfCore, frequency),
                new ScreenDiagonal(screenDiagonal),
                new TimeWorkingBattery(timeWorkingBattery),
                new TimeWorking(hour));

        mobiles[k].show();
        mobiles = Arrays.copyOf(mobiles, mobiles.length + 1);
        System.out.println("Телефон успешно добавлен");
        System.out.println("---" + mobiles[k].getName() + "---");
        k++;
    }

    @Override
    public void addThings(PC[] arr) throws ParseException {
        int id;
        String name;
        int value;
        String description;
        double price;
        int RAMvalue;
        String RAMname;
        int sizeOfCore;
        double frequency;
        int graficsCardsizeCore;
        double graficsCardFrequency;
        String graficsRAMName;
        int graficsRAMSize;
        int hour;
        String os;
        int k=0;
        System.out.println("Введите ID");
        id = 8;//scanner.nextInt();
        for (int i = 0; i < arr.length - 1; i++) {
            if (id == arr[i].getId()) {
                System.out.println("Введите количество добавляемых компухтеров" + arr[i].getName() + ":");
                int valuePlus = scanner.nextInt();
                arr[i].setValue(arr[i].getValue() + valuePlus);
                System.out.println("Компухтер успешно добавлен" + arr[i].getValue());
                main.rerun = true;
                main.menu();
                break;

            } else break;

        }
        //scanner.next();
        System.out.println("Введите имя:");
        name = "hp";//scanner.nextLine();
        System.out.println("Введите количество");
        value = 1;//scanner.nextInt();
        //scanner.next();
        System.out.println("Введите описание");
        description = "Динозавр";// scanner.nextLine();
        System.out.println("Введите цену");
        price = 228;//scanner.nextDouble();
        //scanner.next();
        System.out.println("Введите ОС");
        os = "Linux";
        System.out.println("Введите размер RAM");
        RAMvalue = 6;//scanner.nextInt();
        //scanner.nextLine();
        System.out.println("Введите название RAM");
        RAMname = "ddr5";// scanner.nextLine();
        System.out.println("Введите кол-во ядер");
        sizeOfCore = 5;//scanner.nextInt();
        System.out.println("Введите частоту ядра");
        frequency = 4.3;// scanner.nextDouble();
        System.out.println("Введите CPU видеокарты");
        graficsCardsizeCore = 4; //scanner.nextInt();
        System.out.println("Введите частоту видеокарты");
        graficsCardFrequency = 4.0;// scanner.nextDouble();
        System.out.println("Введите RAM размер");
        graficsRAMSize = 6; //scanner.nextInt();System.out.println("Enter RAM size");
        graficsRAMName = "DDR2"; //scanner.nextLine();
        System.out.println("Введите время гарантии");
        hour = 1200;// scanner.nextInt();
        pcs[k] = new PC(id, name, value, description, price,
                        new OS(os),
                new CPU(sizeOfCore, frequency),
                new RAM(RAMname, RAMvalue),
                        new GraficsCard(graficsCardsizeCore, graficsCardFrequency),
                        new GraficsRAM(graficsRAMName, graficsRAMSize),
                        new TimeWorking(hour));

        pcs[k].show();
        pcs = Arrays.copyOf(pcs, pcs.length + 1);
        System.out.println(pcs.length);
        System.out.println("Компухтер успешно добавлен");
        System.out.println("---" + pcs[k].getName() + "---");
        k++;
    }
    @Override
    public void addThings(Vegetable[] arr) throws ParseException {
        int id;
        String name;
        int value;
        String description;
        double price;
        String grade;
        String date;
        double temp;
        int timeL;
        int k = 0;

        System.out.println("Введите ID");
        id = 3;//scanner.nextInt();
        for (int i = 0; i < arr.length - 1; i++) {
            if (id == arr[i].getId()) {
                System.out.println("Введите количество добавляемых овощей" + arr[i].getName() + ":");
                int valuePlus = scanner.nextInt();
                arr[i].setValue(arr[i].getValue() + valuePlus);
                System.out.println("Овощи успешно добавлены" + arr[i].getValue());
                main.rerun = true;
                main.menu();
                break;

            } else break;

        }

        //scanner.next();
        System.out.println("Введите имя:");
        name = "Перец";//scanner.nextLine();
        System.out.println("Введите количество");
        value = 6;//scanner.nextInt();
        //scanner.next();
        System.out.println("Введите описание");
        description = "Зрелый";// scanner.nextLine();
        System.out.println("Введите цену");
        price = 10;//scanner.nextDouble();
        System.out.println("Введите сорт");
        grade = "Болгарский"; // scanner.nextLine();
        System.out.println("Введите срок годности(dd.MM.yyyy)");
        date = "23.10.2019"; // scanner.nextLine();
        temp = 10.0; //scanner.nextDouble();
        timeL = 21; //scanner.nextInt();
        vegetables[k] = new Vegetable(id, name, value, description, price,
                new Grade(grade),
                new TimeLife(date, temp, timeL));


        vegetables[k].show();
        vegetables = Arrays.copyOf(vegetables, vegetables.length + 1);
        System.out.println("Овощи успешно добавлены");
        System.out.println("---" + vegetables[k].getName() + "---");
        k++;
    }
    @Override
    public void addThings(Cookie[] arr) throws ParseException {
        int id;
        String name;
        int value;
        String description;
        double price;
        String date;
        double temp;
        int timeL;
        int k = 0;

        System.out.println("Введите ID");
        id = 1488;//scanner.nextInt();
        for (int i = 0; i < arr.length - 1; i++) {
            if (id == arr[i].getId()) {
                System.out.println("Введите количество добавляемых сладостей" + arr[i].getName() + ":");
                int valuePlus = scanner.nextInt();
                arr[i].setValue(arr[i].getValue() + valuePlus);
                System.out.println("Сладости добавлены" + arr[i].getValue());
                main.rerun = true;
                main.menu();
                break;

            } else break;

        }

        //scanner.next();
        System.out.println("Введите имя:");
        name = "KitKat";//scanner.nextLine();
        System.out.println("Введите количество");
        value = 8;//scanner.nextInt();
        //scanner.next();
        System.out.println("Введите описание");
        description = "KitKat+";// scanner.nextLine();
        System.out.println("Введите цену");
        price = 20;//scanner.nextDouble();
        date = "23.10.2020"; // scanner.nextLine();
        temp = 25.5; //scanner.nextDouble();
        timeL = 365; //scanner.nextInt();
        cookies[k] = new Cookie(id, name, value, description, price,
                new TimeLife(date, temp, timeL));
        cookies = Arrays.copyOf(cookies, cookies.length + 1);

        cookies[k].show();
        System.out.println("Сладости успешно добавлены");
        System.out.println("---" + cookies[k].getName() + "---");
        k++;
    }

    @Override
    public void addThings(Water[] arr) throws ParseException {
        int id;
        String name;
        int value;
        String description;
        double price;

        int k = 0;

        System.out.println("Введите ID");
        id = 148;//scanner.nextInt();
        for (int i = 0; i < arr.length - 1; i++) {
            if (id == arr[i].getId()) {
                System.out.println("Введите количество добавляемой воды" + arr[i].getName() + ":");
                int valuePlus = scanner.nextInt();
                arr[i].setValue(arr[i].getValue() + valuePlus);
                System.out.println("Вода добавлена" + arr[i].getValue());
                main.rerun = true;
                main.menu();
                break;

            } else break;

        }

        //scanner.next();
        System.out.println("Введите имя:");
        name = "Моршинська";//scanner.nextLine();
        System.out.println("Введите количество");
        value = 2;//scanner.nextInt();
        //scanner.next();
        System.out.println("Введите описание");
        description = "Слабогазована";// scanner.nextLine();
        System.out.println("Введите цену");
        price = 8.50;//scanner.nextDouble();



        waters[k] = new Water(id, name, value, description, price);
        waters = Arrays.copyOf(waters, waters.length + 1);
        waters[k].show();

        System.out.println("Вода успешно добавлена");
        System.out.println("---" + waters[k].getName() + "---");
        k++;

    }

    @Override
    public void addThings(Sweet[] arr) throws ParseException {
        int id;
        String name;
        int value;
        String description;
        double price;
        String date;
        double temp;
        int timeL;
        int k = 0;

        System.out.println("Введите ID");
        id = 832;//scanner.nextInt();
        for (int i = 0; i < arr.length - 1; i++) {
            if (id == arr[i].getId()) {
                System.out.println("Введите количество добавляемой сладкой воды" + arr[i].getName() + ":");
                int valuePlus = scanner.nextInt();
                arr[i].setValue(arr[i].getValue() + valuePlus);
                System.out.println("Сладкая вода успешно добавлена" + arr[i].getValue());
                main.rerun = true;
                main.menu();
                break;

            } else break;

        }

        //scanner.next();
        System.out.println("Введите имя:");
        name = "Pepsi";//scanner.nextLine();
        System.out.println("Введите количество");
        value = 4;//scanner.nextInt();
        //scanner.next();
        System.out.println("Введите описание");
        description = "Zero";// scanner.nextLine();
        System.out.println("Введите цену");
        price = 14.50;//scanner.nextDouble();
        date = "23.10.2019"; // scanner.nextLine();
        temp = 12; //scanner.nextDouble();
        timeL = 365; //scanner.nextInt();
        sweets[k] = new Sweet(id, name, value, description, price,
                new TimeLife(date, temp, timeL));
        sweets = Arrays.copyOf(sweets, sweets.length + 1);
        sweets[k].show();
        System.out.println("Сладкая вода успешно добавлена");
        System.out.println("---" + sweets[k].getName() + "---");
        k++;
    }

    @Override
    public void addThings(Clother[] arr) throws ParseException {
        int id;
        String name;
        int value;
        String description;
        double price;
        String year;
        String nameBrend;
        int workers;
        int countries;
        int k=0;


        System.out.println("Enter ID");
        id = 59;//scanner.nextInt();
        for (int i = 0; i < arr.length - 1; i++) {
            if (id == arr[i].getId()) {
                System.out.println("Введите количество добавляемых вещей" + arr[i].getName() + ":");
                int valuePlus = scanner.nextInt();
                arr[i].setValue(arr[i].getValue() + valuePlus);
                System.out.println("Вещь успешно добавлена" + arr[i].getValue());
                main.rerun = true;
                main.menu();
                break;

            } else break;

        }
        //scanner.next();
        System.out.println("Введите имя:");
        name = "Штаны";//scanner.nextLine();
        System.out.println("Введите количество");
        value = 2;//scanner.nextInt();
        //scanner.next();
        System.out.println("Введите описание");
        description = "Джинсовые";// scanner.nextLine();
        System.out.println("Введите цену");
        price = 1500;//scanner.nextDouble();
        System.out.println("Год основания");
        year = "10.04.1910";// scanner.nextLine();
        System.out.println("Введите название Бренда");
        nameBrend = "Hucci";// scanner.nextLine();
        System.out.println("Введите кол-во персонала");
        workers = 1000;//scanner.nextInt();
        System.out.println("Введите количество стран");
        countries = 60; //scanner.nextInt();


        clothers[k] = new Clother(id, name, value, description, price,
                new Brend(year, nameBrend, workers, countries));
        clothers = Arrays.copyOf(clothers, clothers.length + 1);
        clothers[k].show();
        System.out.println("Вещь успешно добавлена");
        System.out.println("---" + clothers[k].getName() + "---");
        k++;

    }

    @Override
    public void sellThings(Mobile[] arr) {
        //scanner.nextLine();
        System.out.println("Название");
        String name = "Nokia";// scanner.next();
        System.out.println("Количество");
        int quantity = 3;// scanner.nextInt();

        for (int i = 0; i < arr.length - 1; i++) {

            if (name.equals(arr[i].getName())) {
                if (arr[i].getValue() >= quantity) {
                    arr[i].setValue(arr[i].getValue() - quantity);
                    wallet += arr[i].getPrice() * quantity;
                    break;
                } else {
                    System.out.println("Вы не можете продать такое количество");
                    repeet();
                    break;
                }

            }

        }
        System.out.println(wallet);
    }

    @Override
    public void sellThings(PC[] arr) {
        System.out.println("Название");
        String name = "hp";// scanner.next();
        System.out.println("Количество");
        int quantity = 3;// scanner.nextInt();

        for (int i = 0; i < arr.length - 1; i++) {

            if (name.equals(arr[i].getName())) {
                if (arr[i].getValue() >= quantity) {
                    arr[i].setValue(arr[i].getValue() - quantity);
                    wallet += arr[i].getPrice() * quantity;
                    break;
                } else {
                    System.out.println("Вы не можете продать такое количество");
                    repeet();
                    break;
                }

            }

        }
        System.out.println(wallet);
    }

    @Override
    public void sellThings(Vegetable[] arr) {
        System.out.println("Название");
        String name = "Перец";// scanner.next();
        System.out.println("Количество");
        int quantity = 3;// scanner.nextInt();

        for (int i = 0; i < arr.length - 1; i++) {

            if (name.equals(arr[i].getName())) {
                if (arr[i].getValue() >= quantity) {
                    arr[i].setValue(arr[i].getValue() - quantity);
                    wallet += arr[i].getPrice() * quantity;
                    break;
                } else {
                    System.out.println("Вы не можете продать такое количество");
                    repeet();
                    break;
                }

            }

        }
        System.out.println(wallet);
    }

    @Override
    public void sellThings(Cookie[] arr) {
        System.out.println("Название");
        String name = "KitKat";// scanner.next();
        System.out.println("Количество");
        int quantity = 3;// scanner.nextInt();

        for (int i = 0; i < arr.length - 1; i++) {

            if (name.equals(arr[i].getName())) {
                if (arr[i].getValue() >= quantity) {
                    arr[i].setValue(arr[i].getValue() - quantity);
                    wallet += arr[i].getPrice() * quantity;
                    break;
                } else {
                    System.out.println("Вы не можете продать такое количество");
                    repeet();
                    break;
                }

            }

        }
        System.out.println(wallet);

    }

    @Override
    public void sellThings(Water[] arr) {
        System.out.println("Название");
        String name = "Моршинська";// scanner.next();
        System.out.println("Количество");
        int quantity = 3;// scanner.nextInt();

        for (int i = 0; i < arr.length - 1; i++) {

            if (name.equals(arr[i].getName())) {
                if (arr[i].getValue() >= quantity) {
                    arr[i].setValue(arr[i].getValue() - quantity);
                    wallet += arr[i].getPrice() * quantity;
                    break;
                } else {
                    System.out.println("Вы не можете продать такое количество");
                    repeet();
                    break;
                }

            }

        }
        System.out.println(wallet);
    }

    @Override
    public void sellThings(Sweet[] arr) {
        System.out.println("Название");
        String name = "Pepsi";// scanner.next();
        System.out.println("Количество");
        int quantity = 3;// scanner.nextInt();

        for (int i = 0; i < arr.length - 1; i++) {

            if (name.equals(arr[i].getName())) {
                if (arr[i].getValue() >= quantity) {
                    arr[i].setValue(arr[i].getValue() - quantity);
                    wallet += arr[i].getPrice() * quantity;
                    break;
                } else {
                    System.out.println("Вы не можете продать такое количество");
                    repeet();
                    break;
                }

            }

        }
        System.out.println(wallet);

    }

    @Override
    public void sellThings(Clother[] arr) {
        System.out.println("Название");
        String name = "Штаны";// scanner.next();
        System.out.println("Количество");
        int quantity = 3;// scanner.nextInt();

        for (int i = 0; i < arr.length - 1; i++) {

            if (name.equals(arr[i].getName())) {
                if (arr[i].getValue() >= quantity) {
                    arr[i].setValue(arr[i].getValue() - quantity);
                    wallet += arr[i].getPrice() * quantity;
                    break;
                } else {
                    System.out.println("Вы не можете продать такое количество");
                    repeet();
                    break;
                }

            }

        }
        System.out.println(wallet);
    }

    @Override
    public void subMenu(Mobile[] arr) throws ParseException{
        System.out.println("1 - Добавить" +
                "\n2 - Удалить" +
                "\n3 - Поиск");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                addThings(arr);
                repeet();
                break;
            case 2:
                sellThings(arr);
                repeet();
                break;
            case 3:
                searching(arr);
                repeet();
                break;

            default:
                System.out.println("Вы ввели не верный номер задания, повторите ввод!");
                repeet();
        }
    }

    @Override
    public void subMenu(PC[] arr) throws ParseException {
        System.out.println("1 - Добавить" +
                "\n2 - Удалить" +
                "\n3 - Поиск");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                addThings(arr);
                repeet();
                break;
            case 2:
                sellThings(arr);
                repeet();
                break;
            case 3:
                searching(arr);
                repeet();
                break;

            default:
                System.out.println("Вы ввели не верный номер задания, повторите ввод!");
                repeet();
        }
    }

    @Override
    public void subMenu(Vegetable[] arr) throws ParseException {
        System.out.println("1 - Добавить" +
                "\n2 - Удалить" +
                "\n3 - Поиск");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                addThings(arr);
                repeet();
                break;
            case 2:
                sellThings(arr);
                repeet();
                break;
            case 3:
                searching(arr);
                repeet();
                break;

            default:
                System.out.println("Вы ввели не верный номер задания, повторите ввод!");
                repeet();
        }
    }

    @Override
    public void subMenu(Cookie[] arr) throws ParseException {
        System.out.println("1 - Добавить" +
                "\n2 - Удалить" +
                "\n3 - Поиск");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                addThings(arr);
                repeet();
                break;
            case 2:
                sellThings(arr);
                repeet();
                break;
            case 3:
                searching(arr);
                repeet();
                break;

            default:
                System.out.println("Вы ввели не верный номер задания, повторите ввод!");
                repeet();
        }
    }

    @Override
    public void subMenu(Water[] arr) throws ParseException {
        System.out.println("1 - Добавить" +
                "\n2 - Удалить" +
                "\n3 - Поиск");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                addThings(arr);
                repeet();
                break;
            case 2:
                sellThings(arr);
                repeet();
                break;
            case 3:
                searching(arr);
                repeet();
                break;

            default:
                System.out.println("Вы ввели не верный номер задания, повторите ввод!");
                repeet();
        }
    }

    @Override
    public void subMenu(Sweet[] arr) throws ParseException  {
        System.out.println("1 - Добавить" +
                "\n2 - Удалить" +
                "\n3 - Поиск");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                addThings(arr);
                repeet();
                break;
            case 2:
                sellThings(arr);
                repeet();
                break;
            case 3:
                searching(arr);
                repeet();
                break;

            default:
                System.out.println("Вы ввели не верный номер задания, повторите ввод!");
                repeet();
        }
    }

    @Override
    public void subMenu(Clother[] arr) throws ParseException {
        System.out.println("1 - Добавить" +
                "\n2 - Удалить" +
                "\n3 - Поиск");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                addThings(arr);
                repeet();
                break;
            case 2:
                sellThings(arr);
                repeet();
                break;
            case 3:
                searching(arr);
                repeet();
                break;

            default:
                System.out.println("Вы ввели не верный номер задания, повторите ввод!");
                repeet();
        }
    }

    void repeet() {
        String yes = "y";
        String no = "n";
        main.rerun = false;
        System.out.println("\nПродолжить?" +
                "\n(y)YES или (n)NO");
        String answer = scanner.next();
        if (answer.equals(yes)) {
            main.rerun = true;
        } else if (answer.equals(no)) {
            System.out.println("Завершение");
           // System.exit(0);

        } else {
            System.out.println("Введите другую букву: ");
            repeet();
        }
    }


}
