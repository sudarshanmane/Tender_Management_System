package com.tms.vendorusecases;

import java.util.List;

import com.tms.dao.VendorDao;
import com.tms.dao.VendorDaoImpl;
import com.tms.exceptions.TenderManagementSystemException;
import com.tms.model.Bid;


public class ViewAllBids {
	
	public static void main(String[] args) {
		
		VendorDao dao = new VendorDaoImpl();
		
		try {
			List<Bid> list = dao.viewAllBids();
			list.forEach(i -> System.out.println(list));
		} catch (TenderManagementSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
