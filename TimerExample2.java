/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timerexample2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user2
 */
public class TimerExample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //Creating a new Thread object of Timer class
        Thread t1=new Thread(new Timer());
        //Starting the thread using .start() method
        t1.start();
    }
}
//Here i am using Runnable method to print value
//Class Timer implementing Runnable
class Timer implements Runnable{

    //Declaring an integer variable TIMEOUT and assigning a value to it
    //TIMEOUT=2000 is declared to print the expected value every 2 seconds
    private final int TIMEOUT=2000;
    @Override
    public void run() {
        while(true){
            try {
                //Assigning the sleep time of the time 2000== instance variable TIMER
                Thread.sleep(TIMEOUT);
                //Printing value
                System.out.println("Printing TIMEOUT every 2 seconds");
            } catch (InterruptedException ex) {
                Logger.getLogger(Timer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
