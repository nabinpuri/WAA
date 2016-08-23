package com.packt.webstore.service.interfaces;

import java.util.List;

import com.packt.webstore.domain.Address;

public interface AddressService {
	
	public List<Address> getAll();
	
	public Address save(Address address);
	
	public Address get(Long id);
}
