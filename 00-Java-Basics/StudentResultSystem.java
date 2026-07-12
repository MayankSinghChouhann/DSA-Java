import java.util.Scanner;

public class StudentResultSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n==========================================");
            System.out.println("      STUDENT RESULT MANAGEMENT SYSTEM");
            System.out.println("==========================================");

            // Student Details
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Roll Number: ");
            int rollNumber = sc.nextInt();
            sc.nextLine(); // Buffer Clear

            System.out.print("Enter Course: ");
            String course = sc.nextLine();

            System.out.print("Enter Semester: ");
            int semester = sc.nextInt();

            System.out.print("Enter Attendance (%): ");
            double attendance = sc.nextDouble();

            // Marks
            System.out.println("\n---------- ENTER SUBJECT MARKS ----------");

            System.out.print("Java: ");
            int javaMarks = sc.nextInt();

            System.out.print("DBMS: ");
            int dbmsMarks = sc.nextInt();

            System.out.print("Operating System: ");
            int osMarks = sc.nextInt();

            System.out.print("DSA: ");
            int dsaMarks = sc.nextInt();

            System.out.print("Mathematics: ");
            int mathsMarks = sc.nextInt();

            // Calculations
            int total = javaMarks + dbmsMarks + osMarks + dsaMarks + mathsMarks;

            double average = (double) total / 5;

            double percentage = (double) total / 500 * 100;

            // Result
            String result;

            if (percentage >= 40) {
                result = "PASS";
            } else {
                result = "FAIL";
            }

            // Grade
            String grade;

            if (percentage >= 90) {
                grade = "A+";
            } else if (percentage >= 80) {
                grade = "A";
            } else if (percentage >= 70) {
                grade = "B";
            } else if (percentage >= 60) {
                grade = "C";
            } else if (percentage >= 50) {
                grade = "D";
            } else if (percentage >= 40) {
                grade = "E";
            } else {
                grade = "F";
            }

            // Scholarship
            String scholarship;

            if (percentage >= 85) {
                scholarship = "Eligible";
            } else {
                scholarship = "Not Eligible";
            }

            // Voting Eligibility
            String voting;

            if (age >= 18) {
                voting = "Eligible";
            } else {
                voting = "Not Eligible";
            }

            // Attendance
            String attendanceStatus;

            if (attendance >= 75) {
                attendanceStatus = "Requirement Met";
            } else {
                attendanceStatus = "Attendance Below Requirement";
            }

            // Highest Marks
            int highest = javaMarks;

            if (dbmsMarks > highest)
                highest = dbmsMarks;

            if (osMarks > highest)
                highest = osMarks;

            if (dsaMarks > highest)
                highest = dsaMarks;

            if (mathsMarks > highest)
                highest = mathsMarks;

            // Lowest Marks
            int lowest = javaMarks;

            if (dbmsMarks < lowest)
                lowest = dbmsMarks;

            if (osMarks < lowest)
                lowest = osMarks;

            if (dsaMarks < lowest)
                lowest = dsaMarks;

            if (mathsMarks < lowest)
                lowest = mathsMarks;

            // Full Marks
            boolean fullMarks = javaMarks == 100 ||
                    dbmsMarks == 100 ||
                    osMarks == 100 ||
                    dsaMarks == 100 ||
                    mathsMarks == 100;

            // Menu
            System.out.println("\n============== MENU ==============");
            System.out.println("1. Student Details");
            System.out.println("2. Subject Marks");
            System.out.println("3. Result");
            System.out.println("4. Scholarship");
            System.out.println("5. Complete Report");
            System.out.print("Choose Option: ");

            int menu = sc.nextInt();

            switch (menu) {

                case 1:
                    System.out.println("\n------ STUDENT DETAILS ------");
                    System.out.println("Name      : " + name);
                    System.out.println("Age       : " + age);
                    System.out.println("Roll No   : " + rollNumber);
                    System.out.println("Course    : " + course);
                    System.out.println("Semester  : " + semester);
                    break;

                case 2:
                    System.out.println("\n------ SUBJECT MARKS ------");
                    System.out.println("Java              : " + javaMarks);
                    System.out.println("DBMS              : " + dbmsMarks);
                    System.out.println("Operating System  : " + osMarks);
                    System.out.println("DSA               : " + dsaMarks);
                    System.out.println("Mathematics       : " + mathsMarks);
                    break;

                case 3:
                    System.out.println("\n------ RESULT ------");
                    System.out.println("Total       : " + total);
                    System.out.println("Average     : " + average);
                    System.out.println("Percentage  : " + percentage + "%");
                    System.out.println("Grade       : " + grade);
                    System.out.println("Result      : " + result);
                    break;

                case 4:
                    System.out.println("\nScholarship Status : " + scholarship);
                    break;

                case 5:
                    System.out.println("\n============= REPORT CARD =============");

                    System.out.println("Name              : " + name);
                    System.out.println("Age               : " + age);
                    System.out.println("Roll Number       : " + rollNumber);
                    System.out.println("Course            : " + course);
                    System.out.println("Semester          : " + semester);

                    System.out.println("\n----------- MARKS -----------");

                    System.out.println("Java              : " + javaMarks);
                    System.out.println("DBMS              : " + dbmsMarks);
                    System.out.println("Operating System  : " + osMarks);
                    System.out.println("DSA               : " + dsaMarks);
                    System.out.println("Mathematics       : " + mathsMarks);

                    System.out.println("\n----------- RESULT -----------");

                    System.out.println("Total             : " + total);
                    System.out.println("Average           : " + average);
                    System.out.println("Percentage        : " + percentage + "%");
                    System.out.println("Grade             : " + grade);
                    System.out.println("Result            : " + result);
                    System.out.println("Scholarship       : " + scholarship);
                    System.out.println("Voting            : " + voting);
                    System.out.println("Attendance        : " + attendanceStatus);
                    System.out.println("Highest Marks     : " + highest);
                    System.out.println("Lowest Marks      : " + lowest);
                    System.out.println("Full Marks        : " + fullMarks);

                    break;

                default:
                    System.out.println("Invalid Menu Choice");
            }

            System.out.println("\nDo you want to calculate another student's result?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

        } while (choice == 1);

        System.out.println("\nThank You for using Student Result Management System!");
        sc.close();
    }
}