/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1funcional;

/**
 *
 * @author Lenovo
 */
public class Employee {
    protected int id;
    public Persons people;
    private String numbercontract;

    public Employee(int id, Persons people, String numerocontrato) {
        this.id = id;
        this.people = people;
        this.numbercontract = numerocontrato;
    }
    
      // método privado imprime por consola el numero de cuenta 
    private void printId(){
        System.out.println(this.id);
    }
    //metodo protegido que transforma el atributo numerocontrato en minuscula
    protected void lowerCase(){
      this.numbercontract= this.numbercontract.toLowerCase();
    }
  //metodo get y set persona
    public Persons getPeople() {
        return people;
    }

    public void setPeople(Persons people) {
        this.people = people;
    }
    }
    
