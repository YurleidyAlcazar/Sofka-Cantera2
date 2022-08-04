/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1funcional;

/**
 *
 * @author Lenovo
 */
//Atributos de la clase Tienda
public class Store {
    private String nit;
    public String address;
    protected int id;
    
    
  //Constructores  

    public Store(String nit, String address, int id) {
        this.nit = nit;
        this.address = address;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Store{" + "nit=" + nit + ", address=" + address + ", id=" + id + '}';
    }
    
    
}
