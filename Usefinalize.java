/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package com.mycompany.sports;

/**
 *
 * @author Dell
 */
public class Usefinalize {
    
    //Before destroying any object, the GC always calls finalize() method,
    //to perform clean-up activities on that object.
    //This is called as Finalization.
    
    //GC can call the finalize() method on any java object since its parent class is Object.
    //We can override this method to define our clean-up activities.Since its 
    //parent class implementation is empty...
      protected void finalize() throws Throwable
             //method signature 
    {
        try {
 
            //cleanup activities
            System.out.println("inside Class method finalize()");
        }
        catch (Throwable e) {
 
            throw e;
        }
        finally {
 
            System.out.println("Inside finally of  finalize()"
                               + " of the Object class");
 
            // Calling finalize() of Object class
            super.finalize();
        }
    }
    
    public static void main(String[] args) throws Throwable{
        Usefinalize useObj = new Usefinalize();
        
        useObj.finalize();
    }
    
}
