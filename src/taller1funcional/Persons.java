/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1funcional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Yurleidy Alcazar
 *
 */
public class Persons {
   //Atributos de la clase persona
    public String Name;
    public String Lastname1;
    public String Lastname2;
    public Date DateBirth;
    public Float Heigth;

   /**
     * Recibe un String
     * @param fecha
     * @return Date fecha
     */
    public static Date transFechaDate(String fecha) {

        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaDate = null;
        try {
            fechaDate = (Date) formato.parse(fecha);
        } catch (ParseException ex) { 
        }
        return fechaDate;
    }
   
  
    /**
     * Constructor con todos los atributos de la clase persona
     * @param Name
     * @param Lastname1
     * @param Lastname2
     * @param DateBirth
     * @param Heigth 
     */
    public Persons(String Name, String Lastname1, String Lastname2, Date DateBirth, Float Heigth) {
        this.Name = Name;
        this.Lastname1 = Lastname1;
        this.Lastname2 = Lastname2;
        this.DateBirth = DateBirth;
        this.Heigth = Heigth;
    }

    
   //Get y setters
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
//Imprimir por consola los atributos de la clase persona
    @Override
    public String toString() {
        return "Persons{" + "Name=" + Name + ", Lastname1=" + Lastname1 + ", Lastname2=" + Lastname2 + ", DateBirth=" + DateBirth + ", Heigth=" + Heigth + '}';
    }
    
    
    
    
    
}
