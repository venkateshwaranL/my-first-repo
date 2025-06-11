class Operators {
    public static void main(String args[]){
        short a = 50 ;
        short b = 40 ;
        short x = 100 ;
        short y = 120 ;
        boolean result = a<b || x<y ;
        boolean not = !result;
        if(x<y && b>a){
        System.out.println("Hello");
        }else{
        System.out.println("Bye");
        }
        if(a>b){
            System.out.println("A is Greather than B");
        }else{
            System.out.println("B is Greather than A");
        }
        System.out.println(result);
        System.out.println(not);
    }
}