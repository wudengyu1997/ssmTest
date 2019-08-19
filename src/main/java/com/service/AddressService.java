package com.service;

import java.util.List;

import com.bean.Address;

public interface AddressService {

	List<Address> selectAllAddress();
	
	String getAllAddress();
	
	String getAllAddress(int address);
}
