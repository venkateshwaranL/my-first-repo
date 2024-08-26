class Srm {
    void display() {
        System.out.println("I am Now in SRMIST");
    }
}

class Mca extends Srm {
    String name = "Venkateshwaran";
    
    void displayStudentName() {  // Renamed the method to avoid conflict with the variable name
        System.out.println("MCA Student name is " + name);
    }
}

class Main {
    public static void main(String[] args) {
        Mca std = new Mca();
        std.display();
       std.displayStudentName();  // Updated the method call to the new method name
    }
}
