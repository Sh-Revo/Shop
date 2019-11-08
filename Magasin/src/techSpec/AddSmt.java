package techSpec;

import Categories.*;

import java.util.Scanner;
import java.text.ParseException;

public abstract class AddSmt {
    public static final Scanner scanner = new Scanner(System.in);

    public Mobile[] mobiles = new Mobile[1];
    public PC[] pcs = new PC[1];
    public Vegetable[] vegetables = new Vegetable[1];
    public Cookie[] cookies = new Cookie[1];
    public Water[] waters = new Water[1];
    public Sweet[] sweets = new Sweet[1];
    public Clother[] clothers = new Clother[1];


    public abstract void addThings(Mobile[] arr) throws ParseException;
    public abstract void addThings(PC[] arr) throws ParseException;
    public abstract void addThings(Vegetable[] arr) throws ParseException;
    public abstract void addThings(Cookie[] arr) throws ParseException;
    public abstract void addThings(Water[] arr) throws ParseException;
    public abstract void addThings(Sweet[] arr) throws ParseException;
    public abstract void addThings(Clother[] arr) throws ParseException;

    public abstract void sellThings(Mobile[] arr);
    public abstract void sellThings(PC[] arr);
    public abstract void sellThings(Vegetable[] arr);
    public abstract void sellThings(Cookie[] arr);
    public abstract void sellThings(Water[] arr);
    public abstract void sellThings(Sweet[] arr);
    public abstract void sellThings(Clother[] arr);


    public abstract void subMenu(Mobile[] arr) throws ParseException;
    public abstract void subMenu(PC[] arr) throws ParseException;
    public abstract void subMenu(Vegetable[] arr) throws ParseException;
    public abstract void subMenu(Cookie[] arr) throws ParseException;
    public abstract void subMenu(Water[] arr) throws ParseException;
    public abstract void subMenu(Sweet[] arr) throws ParseException;
    public abstract void subMenu(Clother[] arr) throws ParseException;
}
