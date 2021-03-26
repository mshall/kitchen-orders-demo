package com.shall.customeraccount.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shall.customeraccount.model.Customer;
import com.shall.customeraccount.model.KitchenOrder;

@Repository
public interface KitchenOrderRepository extends JpaRepository<KitchenOrder, String> {
	
}
