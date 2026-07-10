package com.hasan.Controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hasan.Service.BusService;
import com.hasan.sbeans.Bus;

@Controller
public class BusController {
	
	@Autowired
	private BusService busService;

	public void addBuses(Bus b) throws Exception {
		IO.println(busService.addBus(b));
	}

	public void getBuses() throws SQLException {
		List<Bus> buses = busService.retrieveBuses();
		
		for (Bus b : buses) {
			IO.println(b);
		}
	}
}
