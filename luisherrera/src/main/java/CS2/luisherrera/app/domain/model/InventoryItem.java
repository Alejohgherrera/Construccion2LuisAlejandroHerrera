/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.model;

import java.util.UUID;

public class InventoryItem {

    private UUID id;
    private String name;
    private String description;
    private int quantity;
    private double price;

    public InventoryItem(String name, String description, int quantity, double price) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

 
    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
