/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompareExercise;

/**
 *
 * @author BACH
 */
public abstract class Animal implements Comparable<Animal> {
    int legsNum;
    String name;
    String sound;
    
    
    public abstract String toString();
    public abstract String getSound();
    
    public int getLegs(){
        return legsNum;
    }
    
    public String getName(){
        return name;
    }
    
    public int compareTo(Dog anotherInstance){
       return this.legsNum - anotherInstance.legsNum;
    }
}
