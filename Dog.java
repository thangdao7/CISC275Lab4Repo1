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
public class Dog extends Animal {
    public Dog(String name, int legsNum){
        this.name = name;
        this.legsNum = legsNum;       
    }
    
    @Override
    public String getSound() {
        return "Ruff-Ruff";
    }

    @Override
    public String toString() {
        return name + " has " + legsNum + " legs.";
    }

    @Override
    public int compareTo(Animal a) {
        return this.legsNum - a.legsNum;
    }
}
