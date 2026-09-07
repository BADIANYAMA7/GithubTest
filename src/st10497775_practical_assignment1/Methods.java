/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10497775_practical_assignment1;

import java.util.Random;
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
    public static ArrayList<Integer> ID = new ArrayList<>();
    public static ArrayList<String> Gender_array = new ArrayList<>();
    public static ArrayList<String> Medical_Condition = new ArrayList<>();
    public static String[][] Bed_Management = {
        {"B01"}, {"B02"}, {"B03"}, {"B04"},
        {"B05"}, {"B06"}, {"B07"}, {"B08"},
        {"B09"}, {"B10"}, {"B11"}, {"B12"},
        {"B13"}, {"B14"}, {"B15"}, {"B16"},
        {"B17"}, {"B18"}, {"B19"}, {"B20"}

    };

    public static void MenuChoices() {
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                Menus.PatientMenu();
                PatientOptions();
                break;
            case 2:
                Menus.BedMangementMenu();
                BedManagementOption();
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("Please enter a number between 1-3");
                
                
                break;
        }

    }

    public static void PatientOptions() {
        int patientoption = input.nextInt();
        switch (patientoption) {
            case 1:
                PatientOption1();
                break;
            case 2:
                PatientOption2();
                break;
            case 3:
                PatientOption3();
                break;
            case 4:
                PatientOption4();
                break;
            case 5:
                PatientOption5();
                break;

            case 6:
                PatientOption6();
                break;
            default:
                System.out.println("Please Enter a number between 1-6");
                break;
        }

    }

    public static void PatientOption1() {
        Random Random = new Random();
        String Patient_Name, Last_Name, Gender, Condition;
        int Age;
        int PatientId = Random.nextInt(9000) + 1000;
        ID.add(PatientId);
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
        System.out.println("Patient's ID number is" + " " + " " + PatientId);
        System.out.println("\n==============================");
        System.out.println("PATIENT REGISTERED SUCCESSFULLY!");
        System.out.println("==============================");
        System.out.println("");
        Menus.PatientMenu();
        PatientOptions();
    }

    public static void PatientOption2() {
        int SearchID;
        System.out.println("Please Enter the Patient's ID");
        SearchID = input.nextInt();
        int index = ID.indexOf(SearchID);

        if (index == -1) {

            System.out.println("Patient not found!");
            System.out.println("");
            Menus.PatientMenu();
            PatientOptions();

        } else {

            System.out.println("Patient Details");
            System.out.println("==============================");
            System.out.println("Patient Name: " + PatientName.get(index));
            System.out.println("Patient LastName: " + LastName.get(index));
            System.out.println("Patient Age: " + Age_array.get(index));
            System.out.println("Patient's Gender: " + Gender_array.get(index));
            System.out.println("Patient Medical condition: " + Medical_Condition.get(index));
            System.out.println("==============================");
            Menus.PatientMenu();
            PatientOptions();
        }
    }

    public static void PatientOption3() {
        int SearchID;
        System.out.println("");

    }

    public static void PatientOption4() {
        int SearchID;
        System.out.println("Please Enter the Patient's ID");
        SearchID = input.nextInt();
        int index = ID.indexOf(SearchID);

        if (index == -1) {

            System.out.println("Patient not found!");
            System.out.println("");
            Menus.PatientMenu();
            PatientOptions();

        } else {
            ID.remove(index);
            PatientName.remove(index);
            LastName.remove(index);
            Age_array.remove(index);
            Gender_array.remove(index);
            Medical_Condition.remove(index);
            System.out.println("Patients Record Has been Fully Deleted");
            Menus.PatientMenu();
            PatientOptions();
        }
    }

    public static void PatientOption5() {
        Menus.Menu1();
        MenuChoices();

    }

    public static void PatientOption6() {
        for (int i = 0; i < ID.size(); i++) {
            System.out.println("Patient ID: " + ID.get(i));
            System.out.println("Patient Name: " + PatientName.get(i));
            System.out.println("Patient Last Name: " + LastName.get(i));
            System.out.println("Patient Age: " + Age_array.get(i));
            System.out.println("Patient Gender: " + Gender_array.get(i));
            System.out.println("Medical Condition: " + Medical_Condition.get(i));

            System.out.println("--------------------------------");

        }
        Menus.PatientMenu();
        PatientOptions();
    }

    public static void BedManagementOption() {
        int Bedoption = input.nextInt();
        switch (Bedoption) {
            case 1:
                BedMangementOption1();
                break;
            case 2:
                BedMangementOption2();
                break;
            case 3:
                BedMangementOption3();
                break;
            case 4:
                BedMangementOption4();
                break;
            default:
                System.out.println("Please Enter a number between 1-4");
                break;
        }

    }

    public static void BedMangementOption1() {

    }

    public static void BedMangementOption2() {

    }

    public static void BedMangementOption3() {
    for (int i=0 ;i < Bed_Management.length;i++){
        for (int j = 0; j < Bed_Management[i].length; j++) {
        System.out.println("Bed"+" "+Bed_Management[i][j])
                
                
                ;
    
    }
    }
        
    }

    public static void BedMangementOption4() {

    }

    enum Patient_Category {
        Inpatient,
        Outpatient,
        Emergency

    }
    
    class Patient {
    
        
        public void inpatient(){
        
        
        }
    
    
    }
    

}
