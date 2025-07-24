import java.util.Scanner;

class Student {
    public int roll_no;
    public String name;

    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class Geeks {
    public static void main(String[] args){

        // Declare an array of Student
        Student[] arr = new Student[5];

        // Create Scanner object for input
        Scanner scan = new Scanner(System.in);

        // Initialize array with input values
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter roll number and name for student " + (i + 1) + ":");
            int roll_no = scan.nextInt();
            String name = scan.next();
            arr[i] = new Student(roll_no, name);
        }

        // Display student info
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at " + i + " : { "
                    + arr[i].roll_no + " "
                    + arr[i].name + " }");
        }

        scan.close(); // good practice to close the scanner
    }
}
