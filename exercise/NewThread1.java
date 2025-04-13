public class NewThread1 extends Thread{
    String tname ;
    NewThread1(String name)
    {
        super(name);
        tname=name;
        Start();
    } 
}
public void run(){
    for (int i = 1;i<5;i++){
        System.err.println(tname+ ":" +i);
    } 
    try {
        Thread.sleep(500);
    }
    catch(InterruptedException e){
        System.err.println(e);
    }
}
public static void main (String args[]) {
    NewThread1 n = new NewThread1("Child");
    for(int i=1;i<5;i++){
        System.err.println("Main :"+i);
    }
    try {
        Thread.sleep(1000);
    }
    catch(InterruptedException e){
        System.out.println(e);
    }
    System.err.println("Main Exit");
}
