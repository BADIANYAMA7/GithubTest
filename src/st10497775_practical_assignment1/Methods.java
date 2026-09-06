/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10497775_practical_assignment1;

import java.util.ArrayList;
import java.util.Scanner;
import static st10497775_practical_assignment1.ST10497775_Practical_Assignment1.input;

/**
 *
 * @author hp
 */
public class Methods {

    public static Scanner input = new Scanner(System.in);
    public static ArrayList<String> PatientName = new ArrayList<>();
    public static ArrayList<String> LastName = new ArrayList<>();
    public static ArrayList<Integer> Age_array = new ArrayList<>();
    public static ArrayList<String> Gender_array = new ArrayList<>();
    public static ArrayList<String> Medical_Condition = new ArrayList<>();

    public static void MenuChoices() {
        int choice = input.nextInt();
        if (choice == 1) {
            Menus.PatientMenu();
            PatientOptions();
        } else if (choice == 2) {
            System.out.println("2");

        } else if (choice == 3) {
            System.out.println("3");
        } else {
            System.out.println("Please enter a number between 1-3");
            Menus.Menu1();
            choice = input.nextInt();
        }

    }

    public static void PatientOptions() {
        int patientoption = input.nextInt();
        if (patientoption == 1) {
            PatientOption1();
        } else{
        System.out.println("it failed");
        
        }

    }

    public static void PatientOption1() {
        String Patient_Name, Last_Name, Gender, Condition;
        int Age;
        System.out.println("Please Enter Patient's Name");
        Patient_Name = input.next();
        PatientName.add(Patient_Name);
        System.out.println("Please Enter Patient's Last Name");
        Last_Name = input.next();
        LastName.add(Last_Name);
        System.out.println("Please Enter Patient's age");
        Age = input.nextInt();
        Age_array.add(Age);
        System.out.println("Please Enter Patient's Gender");
        Gender = input.next();
        Gender_array.add(Gender);
        System.out.println("Please Enter Patient's Medical Condition");
        Condition = input.next();
        Medical_Condition.add(Condition);
    }
}
