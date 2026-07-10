package com.hasan.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.hasan.sbeans.Bus;

@Repository
public class BusDao {

	@Autowired
	private DataSource dataSource;

	public String insertBus(Bus bus) throws Exception {
		String insert = "Insert into Bus Values(busNo.nextVal,?,?,?,?,?)";

		try (Connection con = dataSource.getConnection(); PreparedStatement ps = con.prepareStatement(insert)) {
//			ps.setInt(1, bus.getBusNo());
			ps.setString(1, bus.getBusName());
			ps.setString(2, bus.getBusColor());
			ps.setDouble(3, bus.getTicketPrice());
			ps.setString(4, bus.getStartFrom());
			ps.setString(5, bus.getBusColor());
			int k = ps.executeUpdate();
			if (k > 0)
				return "Data inserted successfully!";
			else
				return "Data not inserted!";
		}
	}

	public List<Bus> getAllBus() throws SQLException{
		String getBus="Select * from Bus";
		List<Bus> b=new ArrayList<>();
		try(Connection c=dataSource.getConnection();
				PreparedStatement ps=c.prepareStatement(getBus)){
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
				b.add(new Bus(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5), rs.getString(6)));
			}
		}
		return b;	
	}
}
