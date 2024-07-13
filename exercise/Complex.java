package exercise;

public class Complex {

        double realnum, imaginarynum;
       
        Complex(double r, double i) {
       
        this.realnum = r;
       
        this.imaginarynum = i;
       
        }
       
        public static Complex add(Complex c1, Complex c2) {
       
        Complex temp = new Complex(0, 0);
       
        temp.realnum = c1.realnum + c2.realnum;
       
        temp.imaginarynum = c1.imaginarynum + c2.imaginarynum;
       
        return temp;
       
        }
       
       }
       
       public class AddComplexNumbers {
       
        public static void main(String[] args) {
       
        Complex c1 = new Complex(4.5, 5);
       
        Complex c2 = new Complex(2.5, 3.5);
       
        Complex temp = Complex.add(c1, c2);
       
        System.out.println(“Sum = ” + temp.realnum + ” + ” + temp.imaginarynum + “i”);
       
        }
}
