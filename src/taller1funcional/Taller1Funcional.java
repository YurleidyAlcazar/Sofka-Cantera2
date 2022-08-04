/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller1funcional;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class Taller1Funcional {

          //Declarar la clase persona
    private static Persons persons;
    private static Fruit fruit;
    //instanciar la clase para crear una persona nueva
    public static void main(String[] args) {
        persons = new Persons (
                "Maria",
                "Vasquez",
                "Agudelo",
                Persons.transFechaDate("24-02-1994")//llamando al metodo fecha de la clase personas Ojo
                ,1.70f);
        //Estoy creando una clase= arraylist para desplegar opciones en una lista
        ArrayList list = new ArrayList();
        list.add("Morado");
        list.add("Naranja");
        
                

        fruit = new Fruit ( 
                "Uva",
                1.5f,
                list); //Ojo llamo la lista 
                
        System.out.println(persons.getName());
        persons.setName("Juan");
        System.out.println(persons);
       System.out.println(fruit);
        
        
    }
    
}
