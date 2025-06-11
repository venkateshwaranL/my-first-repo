class WhileLoop {
    public static void main(String[] v){
        int i = 1;
        while(i<=4){
            System.out.println(" Hi Venkateshwaran "+i );
            int j = 1;
            while(j<=3){
                System.out.println(" Welcome "+j);
                j++;
            }
            i++;
        }
        System.out.println("Tata Bye Bye... " + i);
    }
}