/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timer;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user2
 */
public class TimerExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Defining a thread t1 which uses the Timer Class
        Thread t1=new Thread(new Timer());
        //Starting the Thread
        t1.start();
    }
}

class Timer extends Thread{
    //Declaring an integer TIMEOUT and assigning a value of 2000 milliseconds
    //the programme will print TimeOut message every 2seconds
    private final int TIMEOUT=2000;
    //Defining the method Thread run()
    public void run(){
        for(int i=0;i<=5;i++){
        while(true){
            try {
                //When Thread Delay time is 2000
                Thread.sleep(TIMEOUT);
                //Programme will print "Printing TIMEOUT every 2 seconds"
                System.out.println("Printing TIMEOUT every 2 seconds");
            } catch (InterruptedException ex) {
                Logger.getLogger(Timer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    }
    
}
