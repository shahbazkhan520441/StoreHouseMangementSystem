package com.storehousemgm.inventory.repository;

import com.storehousemgm.inventory.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    List<Inventory> findBySellerId(Long sellerId);
}
