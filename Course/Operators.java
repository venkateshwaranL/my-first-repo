class Operators {
    public static void main(String args[]){
        short a = 50 ;
        short b = 40 ;
        short c = 90 ;
        short x = 110 ;
        short y = 120 ;
        boolean result = a<b || x<y ;
        boolean not = !result;
        if(x<y && b>a){
        System.out.println("Hello");
        }else{
        System.out.println("Bye");
        }
        if(a>b && a>c){
            System.out.println("A is Greather than B & C");
        }else if(b>a && b>c){
            System.out.println("B is Greather than A & c");
        }else{
            System.out.println("C is Greater than A & B");
        }
        System.out.println(result);
        System.out.println(not);
    }
}