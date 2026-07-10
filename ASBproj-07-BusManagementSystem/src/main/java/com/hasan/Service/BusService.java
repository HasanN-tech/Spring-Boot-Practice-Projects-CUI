package com.hasan.Service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hasan.DAO.BusDao;
import com.hasan.sbeans.Bus;

@Service
public class BusService {
	@Autowired
	private BusDao busDao;
	
	public String addBus(Bus b) throws Exception {
		return busDao.insertBus(b);
	}
	
	public List<Bus> retrieveBuses() throws SQLException {
		return busDao.getAllBus();
	}
}
