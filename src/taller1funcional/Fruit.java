/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1funcional;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
// Atributos de la clase 
public class Fruit {
    public String name;
    private float averageWeight;
    public ArrayList<String>  color;
    
//Constructor con todos los atributos de la clase fruta

    public Fruit(String name, float averageWeight, ArrayList<String> color) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.color = color;
    }

    // Método Get y set
    public ArrayList<String> getColor() {
        return color;
    }

    public void setColor(ArrayList<String> color) {
        this.color = color;
    }
// Imprimir por consola los atributos de la clase fruta

    @Override
    public String toString() {
        return "Fruit{" + "name=" + name + ", averageWeight=" + averageWeight + ", color=" + color + '}';    
 }
    

    
    
    
}
