/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1funcional;

/**
 *
 * @author Lenovo
 */
public class Client {
    protected int id;
    public Persons people; //llamando la clase persona
    private String numbermobile;

    //constructores 
    public Client(int id, Persons people, String numbermobile) {
        this.id = id;
        this.people = people;
        this.numbermobile = numbermobile;
    }
     //metodo protegido que transforma el atributo numeromobile en minuscula
    protected void lowerCase(){
      this.numbermobile= this.numbermobile.toLowerCase();
    }
  //metodo get y set persona
    public Persons getPeople() {
        return people;
    }

    public void setPeople(Persons people) {
        this.people = people;
    }
    
}
