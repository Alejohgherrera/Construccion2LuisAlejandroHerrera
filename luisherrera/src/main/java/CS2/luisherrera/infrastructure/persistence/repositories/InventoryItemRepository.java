/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.infrastructure.persistence.repositories;

import CS2.luisherrera.app.domain.model.InventoryItem;
import java.util.List;

public interface InventoryItemRepository {
    InventoryItem save(InventoryItem item);
    List<InventoryItem> findAll();
}