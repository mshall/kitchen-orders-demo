package com.shall.customeraccount.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shall.customeraccount.dto.ItemDTO;
import com.shall.customeraccount.dto.OrderDTO;
import com.shall.customeraccount.dto.ResultDTO;
import com.shall.customeraccount.model.Customer;
import com.shall.customeraccount.model.CustomerType;
import com.shall.customeraccount.model.Item;
import com.shall.customeraccount.repository.CustomerRepository;
import com.shall.customeraccount.repository.CustomerTypeRepository;
import com.shall.customeraccount.repository.ItemRepository;
import com.shall.customeraccount.repository.KitchenOrderRepository;
import com.shall.util.Utils;

@Service
public class KitchenOrderService {

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private ItemRepository itemRepository;
	@Autowired
	private CustomerTypeRepository customerTypeRepository;
	
	@Autowired
	private KitchenOrderRepository kitchenOrderRepository;

	private Utils utils = new Utils();

	public String initiateOrderProcess() {
		//Suggestion is to have 4 Hashmaps with specific capacity
		// each hash map for each shelf
		
		return "Success";
	}
}
