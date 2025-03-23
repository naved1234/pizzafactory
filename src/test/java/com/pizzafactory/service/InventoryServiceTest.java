package com.pizzafactory.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class InventoryServiceTest {

    @Test
    void shouldReturnTrueForInventoryAvailable() {
        InventoryService inventoryService = new InventoryService();
        assertTrue(inventoryService.isInventoryAvailable());
    }
}