/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
//package com.mycompany.sports;

/**
 *
 * @author Dell
 */

//CAN BE TREATED AS A BLUEPRINT
//100 % abstract
///INTERFACE CAN HAVE VARIABLES AND METHODS

public interface IDecideFitness {
    
    //VARIABLES ARE PUBLIC  , STATIC AND FINAL
    public int  squats = 30;
    public char gender ='F';
    //BY DEFAULT  ALL METHODS ARE ABSTRACT...EVEN THOUGH WE ARE NOT WRITING THE ABSTRACT KEYWORD HERE
    public void decideDiet();
    public void decideExercise();
    public void decideMotto();
    public void decideMeditation();
    
    
    
}
