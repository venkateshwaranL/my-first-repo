class Bank {
    String bankName = "KVB";
    void displayDeatils(){
        System.out.println(" Name of the Bank "+ bankName);
    }
}
class Employee extends Bank {
    String employeeName = "Raja Kumar";
    void displayDeatils(){
        System.out.println( bankName +" Bank Employee Name is "+ employeeName);
    }
}
class Customer extends Bank {
    String customerName = "Sridhar";
    void displayDeatils(){
        System.out.println(bankName +" Customer name is "+ customerName);
    }
}
class NewCustomer extends Bank {
    String newCustomer = "Venkateshwaran";
    void displayDeatils(){
        System.out.println(bankName +" New Customer name is "+ newCustomer);
    }
}
public class BankInheritance {
    public static void main (String[] args){
        Bank obj = new Bank();
        Bank obj1 = new Employee();
        Bank obj2 = new Customer();
        Bank obj3 = new NewCustomer();
        System.err.println("The Details Of Bank");
        obj.displayDeatils();
        System.out.println("The Details of Employee");
        obj1.displayDeatils();
        System.out.println("The Deatils of Customer");
        obj2.displayDeatils();
        System.out.println("The Details of New Customer");
        obj3.displayDeatils();
    }
}