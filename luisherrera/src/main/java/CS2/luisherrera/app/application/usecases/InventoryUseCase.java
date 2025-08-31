/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.application.usecases;

import CS2.luisherrera.app.domain.model.InventoryItem;
import CS2.luisherrera.app.domain.services.GetInventoryItemsService;
import java.util.List;

public class InventoryUseCase {

   
    private GetInventoryItemsService getInventoryItemsService;

    
    public InventoryUseCase(GetInventoryItemsService getInventoryItemsService) {
        this.getInventoryItemsService = getInventoryItemsService;
    }

    public List<InventoryItem> getAvailableItems() {
        
        return getInventoryItemsService.getAvailableItems();
    }
}