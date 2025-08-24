/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.model;

public class Procedure {

    private String id;
    private String name;
    private double cost;

  
    public Procedure() { }

 
    public Procedure(String id, String name, double cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }


    public String getId() { return id; }
    public String getName() { return name; }
    public double getCost() { return cost; }


    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setCost(double cost) { this.cost = cost; }
}
