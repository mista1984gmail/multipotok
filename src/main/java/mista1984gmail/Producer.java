package mista1984gmail;

import java.util.Random;

/**
 * Created by intelisoft on 29.06.2016.
 */
public class Producer implements Runnable{

    private Store store;
    public Producer (Store store){
        this.store=store;
    }

    public void run() {
        Random random=new Random();

        while (true);

    }
}
