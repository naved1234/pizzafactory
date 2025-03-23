package com.pizzafactory.service;

public class InventoryService {

    public boolean isInventoryAvailable() {
        // For now, we'll mock inventory as always available.
        return true;
    }

    public void consumeInventory() {
        System.out.println("Inventory updated after order.");
    }

    public void restockInventory() {
        System.out.println("Inventory restocked by vendor.");
    }
}
