package mista1984gmail;

import static java.lang.Thread.sleep;

/**
 * Created by intelisoft on 29.06.2016.
 */
public class MyJob implements Runnable {
    private Printer printer;

    public MyJob(Printer printer) {
        this.printer = printer;
    }

    public String name;

    public MyJob(String name) {
        this.name = name;
    }

    public void run() {


        /*for(int i=0;i<1000;i++){
            try{
               sleep(1);}

            catch (InterruptedException e){
               e.printStackTrace();
            }
            System.out.println("thread"+i);

        }*/
    }
}
