package mista1984gmail;

/**
 * Created by intelisoft on 29.06.2016.
 */
public class MyThred extends Thread {

   private String name;

    public MyThred(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void run(){
        for(int i=0;i<1000;i++){
            //try{
             //   sleep(1);
            //}
            //catch (InterruptedException e){
             //   e.printStack
            //}
            System.out.println("thread"+i);

        }
    }
}
