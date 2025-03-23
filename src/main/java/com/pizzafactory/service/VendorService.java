package com.pizzafactory.service;

public class VendorService {

    public void restockInventory() {
        InventoryService inventoryService = new InventoryService();
        inventoryService.restockInventory();
    }

    public void updateMenu() {
        // Logic to update pizza, toppings, or price
        System.out.println("Menu updated.");
    }
}
