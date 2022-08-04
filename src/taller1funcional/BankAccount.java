/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1funcional;

/**
 *
 * @author Lenovo
 */
public class BankAccount {
    protected String id;
    private String numberaccount;
    public String namebank;

    public BankAccount(String id, String numberaccount, String namebank) {
        this.id = id;
        this.numberaccount = numberaccount;
        this.namebank = namebank;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    // método privado imprime por consola el numero de cuenta 
    private void printAccountName(){
        System.out.println(this.numberaccount); 
    }
    //metodo protegido que transforma el atributo NameBank en mayuscula
    protected void upperCase(){
      this.namebank=this.namebank.toUpperCase(); 
    }
}