package mista1984gmail;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {

        Store store=new Store();

       Runnable c1=new Consumer(store);
        Runnable c2=new Consumer(store);

        Runnable p1=new Producer(store);
        Runnable p2=new Producer(store);

        Thread t1=new Thread(c1);
        Thread t2=new Thread(c2);
        Thread t3=new Thread(p1);
        Thread t4=new Thread(p2);
        t1.start();
        t2.start();
        t3.start();
        t4.start();




        //tr1.setName("cfdfv");
        //tr1.setPriority(9);

        /*tr1.start();
        tr2.start();

        tr1.join();
        System.out.println("tr1 finish");

        tr2.join();
        System.out.println("tr2 finish");*/





//
        //
        /*Thread thread1=new MyThred("1thred");
        Thread thread2=new MyThred("2thred");
        thread1.start();
        thread2.start();*/


        /*for(int i=0;i<1000;i++){

        System.out.println( "main"+i );}*/
    }
}
