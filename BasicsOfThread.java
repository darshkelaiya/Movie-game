/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package com.mycompany.sports;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
ALL THE FEATURES OF MULTITHREADING
* 1) EXTENDING THE THREAD CLASS
* 2) RUNNABLE INTERFACE
* 3) SLEEP(TIME) IN MILLI SECONDS
* 4) MAIN THREAD THAT RUNS OUR CODE..
* 5) THREAD PRIORITY - SLEEP (TIME IN MS) RELATION
* 6) SET THE THREAD PRIORITY - SCHEDULER..
* 7)setPriority() and getPriority()
* 8)Thread states
 */
//start() --> run() method
////class HindiGreet extends Thread - it supports start() ..
//Runnable does not supports the start method..
//

class SpanishGreet implements Runnable{
    
    public void run(){
  
        
       for(int i =0;i<260;i++){
         
            System.out.println(i+"::Hola!");
            
           /*try {
               //you wait or sleep for some ms..
               //you can put the thread to sleep for some ms if you want to pause the operation of the thread
               //I want to give Hola high priority
               Thread.sleep(1);
           } catch (InterruptedException ex) {
               Logger.getLogger(SpanishGreet.class.getName()).log(Level.SEVERE, null, ex);
           }*/
        } 
    }
}


//start() --> run() method
//class HindiGreet extends Thread
class HindiGreet implements Runnable{
    
    public void run(){
        for(int i =0;i<260;i++){
           
            System.out.println(i+"::Namaste!");
           
            /*try {
                //I want to give Namaste less priority
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(HindiGreet.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        }
    }
}

//main driver class
//THREAD PRIORITY - BY DEFAULT IT IS 5...INCLUDING THE MAIN THREAD
//RANGE IS FROM 1 TO 10..1 BEING THE LOWEST AND 10 IS THE HIGHEST

public class BasicsOfThread {
    
    public static void main(String[] args) throws InterruptedException{
        //first line of the main
        System.out.println("Multi threading code begins..!");
        HindiGreet objHindi = new HindiGreet();
        SpanishGreet objSpanish = new SpanishGreet();
        
        //When our classes extend the thread class
        //we can create the threads like this --we cannot call a START() here since runnable does not supports START()
        //HindiGreet objHindi = new HindiGreet("Hindi");
        //SpanishGreet objSpanish = new SpanishGreet("Spanish");
        
        //Pass the runnable objects to the constructor of the Thread class
        Thread objHindiT = new Thread(objHindi,"Hindi");
        System.out.println("Hindi thread state:"+objHindiT.getState());//new state
        Thread objSpanishT = new Thread(objSpanish,"Spanish");
        System.out.println("Hindi priority:"+objHindiT.getPriority());
        System.out.println("Name:"+objHindiT.getName());
        //objHindiT.stop();//deprecated
        //setting the priority
        //a way of suggesting the scheduler that pls give this particular thread this priority
        //this does not means that the scheduler wil behave accordingly
        //objHindiT.setPriority(9);//high priority
        //objSpanishT.setPriority(3);//low priority
        System.out.println("Hindi priority:"+objHindiT.getPriority());  
        //objHindi.greet();
        objHindiT.start(); // ths start method here internally calls the run() method    
        
        //objSpanish.greet();
        objSpanishT.start();
       System.out.println("Hindi thread state after start():"+objHindiT.getState());
       System.out.println("Tell main to wait for hindi and spanish..!");
        //TELL THE MAIN THREAD TO WAIT..TILL HINDI AND SPANISH THREADS COMPLETE THEIR WORK
        System.out.println("Hindi thread state before join():"+objHindiT.getState());//CHECK runnable only
        
        objHindiT.join();
        objSpanishT.join();
     
        //the code after join will be executed once the threads finish their work
        
        //this should be printed when the two threads finish their work.
        //THIS CODE SHOULD BE EXECUTED ONLY AFTER HINDI AND SPANISH THREADS COMPLETE THEIR WORK?
        System.out.println("hINDI Thread code done..!");
        System.out.println("sPANISH Thread code done..!");
       System.out.println("Hindi thread state after join():"+objHindiT.getState());     
    }
}
