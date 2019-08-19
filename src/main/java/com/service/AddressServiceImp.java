package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bean.Address;
import com.dao.AddressMapper;

@Service
public class AddressServiceImp implements AddressService {

	@Resource(name = "addressMapper")
	AddressMapper addressMapper;
	
	@Override
	public List<Address> selectAllAddress() {
		return addressMapper.selectAll();
	}

	@Override
	public String getAllAddress() {
		
		return getAllAddress(0);
	}

	@Override

		public String getAllAddress(int addressid) {
			List<Address> am = addressMapper.selectAll();
			StringBuilder sb = new StringBuilder();
			for (Address address : am) {
				if(addressid==address.getId()) {
					sb.append("<option selected='selected' value='"+address.getId()+"'>");
					sb.append(address.getCity());
					sb.append("</option>");
				}else
				sb.append("<option value='"+address.getId()+"'>");
				sb.append(address.getCity());
				sb.append("</option>");
			}
			return sb.toString();
		}


}
