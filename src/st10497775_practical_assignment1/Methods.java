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
    public static ArrayList<Patient_Category> Category_array = new ArrayList<>();
    public static boolean[][] Bed_Management = new boolean[4][5];
    public static int[][] Bed_Patient_ID = new int[4][5];

    public static void MenuChoices() {
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                Menus.PatientMenu();
                PatientOptions();
                break;
            case 2:
                Menus.BedMangementMenu();
                BedManagementOptions();
                break;
            case 3:
                Menus.Reports();
                ReportsOptions();
                break;
            default:
                System.out.println("Please enter a number between 1-3");
                Menus.Menu1();
                MenuChoices();

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
                Menus.PatientMenu();
                PatientOptions();
                break;
        }

    }

    public static void PatientOption1() {
        Random Random = new Random();
        String Patient_Name, Last_Name, Gender, Condition;
        Patient_Category Category;
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
        System.out.println("Please Enter Patient Category:");
        System.out.println("1. Inpatient");
        System.out.println("2. Outpatient");
        System.out.println("3. Emergency");

        int CategoryChoice = input.nextInt();

        switch (CategoryChoice) {
            case 1:
                Category = Patient_Category.Inpatient;
                break;
            case 2:
                Category = Patient_Category.Outpatient;
                break;
            case 3:
                Category = Patient_Category.Emergency;
                break;
            default:
                System.out.println("Invalid category.");
                return;
        }
        Category_array.add(Category);
        System.out.println("Patient's ID number is" + " " + " " + PatientId);
        System.out.println("Patient Category: " + Category);
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
            System.out.println("Patient Category: " + Category_array.get(index));
            System.out.println("==============================");
            Menus.PatientMenu();
            PatientOptions();
        }
    }

    public static void PatientOption3() {
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

            System.out.println("Patient Found!");
            System.out.println("==============================");
            System.out.println("Current Patient Details");
            System.out.println("Patient Name: " + PatientName.get(index));
            System.out.println("Patient Last Name: " + LastName.get(index));
            System.out.println("Patient Age: " + Age_array.get(index));
            System.out.println("Patient Gender: " + Gender_array.get(index));
            System.out.println("Medical Condition: " + Medical_Condition.get(index));
            System.out.println("Patient Category: " + Category_array.get(index));
            System.out.println("==============================");

            // Update Name
            System.out.println("Please Enter the Patient's New Name");
            String NewName = input.next();
            PatientName.set(index, NewName);

            // Update Last Name
            System.out.println("Please Enter the Patient's New Last Name");
            String NewLastName = input.next();
            LastName.set(index, NewLastName);

            // Update Age
            System.out.println("Please Enter the Patient's New Age");
            int NewAge = input.nextInt();
            Age_array.set(index, NewAge);

            // Update Gender
            System.out.println("Please Enter the Patient's New Gender");
            String NewGender = input.next();
            Gender_array.set(index, NewGender);

            // Update Medical Condition
            System.out.println("Please Enter the Patient's New Medical Condition");
            String NewCondition = input.next();
            Medical_Condition.set(index, NewCondition);

            // Update Category
            System.out.println("Please Enter the Patient's New Category:");
            System.out.println("1. Inpatient");
            System.out.println("2. Outpatient");
            System.out.println("3. Emergency");

            int CategoryChoice = input.nextInt();

            Patient_Category NewCategory;

            switch (CategoryChoice) {
                case 1:
                    NewCategory = Patient_Category.Inpatient;
                    break;

                case 2:
                    NewCategory = Patient_Category.Outpatient;
                    break;

                case 3:
                    NewCategory = Patient_Category.Emergency;
                    break;

                default:
                    System.out.println("Invalid category.");
                    return;
            }

            Category_array.set(index, NewCategory);

            System.out.println("\n==============================");
            System.out.println("PATIENT DETAILS UPDATED!");
            System.out.println("==============================");

            // Display updated details
            System.out.println("Patient ID: " + ID.get(index));
            System.out.println("Patient Name: " + PatientName.get(index));
            System.out.println("Patient Last Name: " + LastName.get(index));
            System.out.println("Patient Age: " + Age_array.get(index));
            System.out.println("Patient Gender: " + Gender_array.get(index));
            System.out.println("Medical Condition: " + Medical_Condition.get(index));
            System.out.println("Patient Category: " + Category_array.get(index));
            System.out.println("==============================");

            Menus.PatientMenu();
            PatientOptions();
        }
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

    public static void BedManagementOptions() {
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
                Menus.BedMangementMenu();
                BedManagementOptions();
                break;
        }

    }

    public static void BedMangementOption1() {
        int SearchID;

        System.out.println("Please Enter the Patient's ID");
        SearchID = input.nextInt();

        int index = ID.indexOf(SearchID);

        // Check if patient exists
        if (index == -1) {

            System.out.println("Patient not found!");
            System.out.println("");

            Menus.BedMangementMenu();
            BedManagementOptions();

        } // Check if patient is an Inpatient
        else if (Category_array.get(index) != Patient_Category.Inpatient) {

            System.out.println("This patient is not an Inpatient.");
            System.out.println("Only Inpatients can be allocated a bed.");
            System.out.println("");

            Menus.BedMangementMenu();
            BedManagementOptions();

        } else {

            // Check if patient already has a bed
            boolean alreadyHasBed = false;

            for (int row = 0; row < Bed_Patient_ID.length; row++) {

                for (int column = 0; column < Bed_Patient_ID[row].length; column++) {

                    if (Bed_Patient_ID[row][column] == SearchID) {

                        alreadyHasBed = true;
                        break;
                    }
                }

                if (alreadyHasBed) {
                    break;
                }
            }

            if (alreadyHasBed) {

                System.out.println("This patient already has a bed.");

            } else {

                boolean bedAllocated = false;

                // Find an available bed
                for (int row = 0; row < Bed_Management.length; row++) {

                    for (int column = 0; column < Bed_Management[row].length; column++) {

                        if (Bed_Management[row][column] == false) {

                            // Mark bed as occupied
                            Bed_Management[row][column] = true;

                            // Store patient ID in the bed
                            Bed_Patient_ID[row][column] = SearchID;

                            // Calculate bed number
                            int bedNumber = (row * 5) + column + 1;

                            System.out.println("\n==============================");
                            System.out.println("BED ALLOCATED SUCCESSFULLY!");
                            System.out.println("==============================");

                            System.out.println("Patient ID: " + ID.get(index));
                            System.out.println("Patient Name: " + PatientName.get(index));
                            System.out.println("Patient Category: " + Category_array.get(index));
                            System.out.println("Allocated Bed: B" + String.format("%02d", bedNumber));

                            System.out.println("==============================");

                            bedAllocated = true;

                            break;
                        }
                    }

                    if (bedAllocated) {
                        break;
                    }
                }

                if (bedAllocated == false) {

                    System.out.println("Sorry, there are no available beds.");

                }
            }

            Menus.BedMangementMenu();
            BedManagementOptions();
        }
    }

    public static void BedMangementOption2() {
         int SearchID;

    System.out.println("Please Enter the Patient's ID");
    SearchID = input.nextInt();

    int index = ID.indexOf(SearchID);

    // Check if patient exists
    if (index == -1) {

        System.out.println("Patient not found!");

    }

    else {

        boolean patientFound = false;

        // Search for patient's bed
        for (int row = 0; row < Bed_Patient_ID.length; row++) {

            for (int column = 0; column < Bed_Patient_ID[row].length; column++) {

                if (Bed_Patient_ID[row][column] == SearchID) {

                    // Calculate bed number
                    int bedNumber = (row * 5) + column + 1;

                    // Make bed available
                    Bed_Management[row][column] = false;

                    // Remove patient ID from the bed
                    Bed_Patient_ID[row][column] = 0;

                    System.out.println("\n==============================");
                    System.out.println("PATIENT DISCHARGED SUCCESSFULLY!");
                    System.out.println("==============================");

                    System.out.println("Patient ID: " + SearchID);
                    System.out.println("Patient Name: " + PatientName.get(index));
                    System.out.println("Discharged Bed: B" + String.format("%02d", bedNumber));

                    System.out.println("Bed B" + String.format("%02d", bedNumber) + " is now available.");

                    System.out.println("==============================");

                    patientFound = true;

                    break;
                }
            }

            if (patientFound) {
                break;
            }
        }

        if (patientFound == false) {

            System.out.println("This patient does not have an allocated bed.");

        }
    }

    Menus.BedMangementMenu();
    BedManagementOptions();
}
    

    public static void BedMangementOption3() {

    System.out.println("\n==================== WARD LAYOUT ====================");

    for (int row = 0; row < Bed_Management.length; row++) {

        for (int column = 0; column < Bed_Management[row].length; column++) {

            // Calculate bed number
            int bedNumber = (row * 5) + column + 1;

            String bedName = "B" + String.format("%02d", bedNumber);

            // Check if bed is occupied
            if (Bed_Management[row][column] == true) {

                System.out.print("[" + bedName + " - OCCUPIED] ");

            } else {

                System.out.print("[" + bedName + " - AVAILABLE] ");
            }
        }

        // Move to the next row
        System.out.println();
        System.out.println();
    }

    System.out.println("======================================================");

    Menus.BedMangementMenu();
    BedManagementOptions();
}
    

    public static void BedMangementOption4() {
        Menus.Menu1();
        MenuChoices();
    }

    public static void ReportsOptions() {
        int ReportOption = input.nextInt();
        switch (ReportOption) {
            case 1:
                ReportOption1();
                break;
            case 2:
                ReportOption2();
                break;
            case 3:
                ReportOption3();;
                break;
            case 4:
                ReportOption4();
                break;
            default:
                System.out.println("Please Enter a number between 1-6");
                Menus.Reports();
                ReportsOptions();
                break;
        }

    }

    public static void ReportOption1() {
        int NumberofPatient= ID.size();
        System.out.println("Total Number of Registered Patient:"+ " "+NumberofPatient);
        System.out.println("--------------------------------");
        for (int i = 0; i < ID.size(); i++) {
            System.out.println("Patient ID: " + ID.get(i));
            System.out.println("Patient Name: " + PatientName.get(i));
            System.out.println("Patient Last Name: " + LastName.get(i));
            System.out.println("Patient Age: " + Age_array.get(i));
            System.out.println("Patient Gender: " + Gender_array.get(i));
            System.out.println("Medical Condition: " + Medical_Condition.get(i));
            System.out.println("--------------------------------");

        }
        Menus.Reports();
        ReportsOptions();

    }

    public static void ReportOption2() {
         int totalBeds = 0;
    int availableBeds = 0;
    int occupiedBeds = 0;

    System.out.println("\n================ AVAILABLE BEDS REPORT ================");

    for (int row = 0; row < Bed_Management.length; row++) {

        for (int column = 0; column < Bed_Management[row].length; column++) {

            totalBeds++;

            if (Bed_Management[row][column] == false) {

                availableBeds++;

                int bedNumber = (row * 5) + column + 1;

                System.out.println("Bed B"
                        + String.format("%02d", bedNumber)
                        + " - AVAILABLE");

            } else {

                occupiedBeds++;
            }
        }
    }

    double occupancyPercentage = ((double) occupiedBeds / totalBeds) * 100;

    System.out.println("\n--------------------------------------------------------");
    System.out.println("Total Beds: " + totalBeds);
    System.out.println("Total Available Beds: " + availableBeds);
    System.out.println("Total Occupied Beds: " + occupiedBeds);
    System.out.printf("Ward Occupancy: %.2f%%\n", occupancyPercentage);
    System.out.println("--------------------------------------------------------");

    Menus.Reports();
    ReportsOptions();
}
    

    public static void ReportOption3() {
     int totalBeds = 0;
    int availableBeds = 0;
    int occupiedBeds = 0;

    System.out.println("\n================ OCCUPIED BEDS REPORT ================");

    for (int row = 0; row < Bed_Management.length; row++) {

        for (int column = 0; column < Bed_Management[row].length; column++) {

            totalBeds++;

            if (Bed_Management[row][column] == true) {

                occupiedBeds++;

                int bedNumber = (row * 5) + column + 1;

                System.out.println("Bed B"
                        + String.format("%02d", bedNumber)
                        + " - OCCUPIED"
                        + " - Patient ID: "
                        + Bed_Patient_ID[row][column]);

            } else {

                availableBeds++;
            }
        }
    }

    double occupancyPercentage = ((double) occupiedBeds / totalBeds) * 100;

    System.out.println("\n--------------------------------------------------------");
    System.out.println("Total Beds: " + totalBeds);
    System.out.println("Total Occupied Beds: " + occupiedBeds);
    System.out.println("Total Available Beds: " + availableBeds);
    System.out.printf("Ward Occupancy: %.2f%%\n", occupancyPercentage);
    System.out.println("--------------------------------------------------------");

    Menus.Reports();
    ReportsOptions();
}   
    

    public static void ReportOption4() {
        Menus.Menu1();
        MenuChoices();

    }

    enum Patient_Category {
        Inpatient,
        Outpatient,
        Emergency

    }

    class Patient {

        private String patientID;
        private String name;
        private Patient_Category category;

        public Patient(String patientID, String name, Patient_Category category) {
            this.patientID = patientID;
            this.name = name;
            this.category = category;
        }

        public void displayDetails() {
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Category: " + category);
        }

    }

    class Inpatient extends Patient {

        private int wardNumber;
        private int bedNumber;

        public Inpatient(String patientID, String name, int wardNumber, int bedNumber) {

            super(patientID, name, Patient_Category.Inpatient);

            this.wardNumber = wardNumber;
            this.bedNumber = bedNumber;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Ward Number: " + wardNumber);
            System.out.println("Bed Number: " + bedNumber);
        }
    }
}
