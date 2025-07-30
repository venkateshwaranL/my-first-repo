class WhileLoop {
    public static void main(String[] v){
        int i = 1,a=5;
        while(i<=4){
            System.out.println(" Hi Venkateshwaran "+i );
            int j = 1;
            while(j<=3){
                System.out.println(" Welcome "+j);
                j++;
            }
            i++;
        }
        System.out.println("Tata Bye Bye...! " + i);
        /*do{
            System.out.println("Hi User "+a);
        }while(a<=4);*/
    }
}