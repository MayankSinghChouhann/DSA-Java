import java.util.Scanner;
public class StudentResultSystem {

    public static void main(String[] args) {

// now here we right our application logic
        System.out.println("----- Welcome to Result System ----- ");
        System.out.println(" Please Enter Your Deatils - ");

        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter Name: ");
        String Name = sc.nextLine();

        System.out.print(" Enter Age: ");
        int age = sc.nextInt();

        System.out.print(" Enter Roll Number: ");
        int rollnum = sc.nextInt();
        sc.nextLine(); // Buffer clear

        System.out.print(" Enter Course: ");
        String Course = sc.nextLine();

        System.out.print(" Enter Semester: ");
        int sem = sc.nextInt();

        System.out.println(" ---- NOW YOU HAVE TO ENTER YOUR ---- ");

        System.out.println(" Enter JAVA Marks: ");
                int javamarks = sc.nextInt();

        System.out.println(" Enter DBMS Marks: ");
                int DBMSmarks = sc.nextInt();

        System.out.print("Enter Operating System Marks: ");
        int osMarks = sc.nextInt();

        System.out.print("Enter DSA Marks: ");

        int dsaMarks = sc.nextInt();

        System.out.print("Enter Mathematics Marks: ");
        int mathsMarks = sc.nextInt();

        // now maths part
        double total = javamarks + DBMSmarks + osMarks + dsaMarks + mathsMarks;
        double average = total / 500;

        System.out.println(" Your avarge score = " + average );

        double percentage =( (double) average / total ) * 100 ;

        System.out.println(" Your percentage is : " + percentage);


    }

}









