package com.hasan.sbeans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bus {
	
	private int busNo;
	private String busName;
	private String busColor;
	private double ticketPrice;
	private String startFrom;
	private String endsTo;
	
	public Bus(String busName, String busColour, double ticketPrice, String startsFrom, String endsTo) {
		this.busName = busName;
		this.busColor = busColour;
		this.ticketPrice = ticketPrice;
		this.startFrom = startsFrom;
		this.endsTo = endsTo;
	}
	
//	public Bus() {
//    }
//

//
//	public Bus(int busNo, String busName, String busColor, double ticketPrice, String startFrom, String endsTo) {
//		super();
//		this.busNo = busNo;
//		this.busName = busName;
//		this.busColor = busColor;
//		this.ticketPrice = ticketPrice;
//		this.startFrom = startFrom;
//		this.endsTo = endsTo;
//	}
//
//	public int getBusNo() {
//		return busNo;
//	}
//	public void setBusNo(int busNo) {
//		this.busNo = busNo;
//	}
//	public String getBusName() {
//		return busName;
//	}
//	public void setBusName(String busName) {
//		this.busName = busName;
//	}
//	public String getBusColor() {
//		return busColor;
//	}
//	public void setBusColor(String busColor) {
//		this.busColor = busColor;
//	}
//	public double getTicketPrice() {
//		return ticketPrice;
//	}
//	public void setTicketPrice(double ticketPrice) {
//		this.ticketPrice = ticketPrice;
//	}
//	public String getStartFrom() {
//		return startFrom;
//	}
//	public void setStartFrom(String startFrom) {
//		this.startFrom = startFrom;
//	}
//	public String getEndsTo() {
//		return endsTo;
//	}
//	public void setEndsTo(String endsTo) {
//		this.endsTo = endsTo;
//	}
//	@Override
//	public String toString() {
//		return "Bus [busNo=" + busNo + ", busName=" + busName + ", busColor=" + busColor + ", ticketPrice="
//				+ ticketPrice + ", startFrom=" + startFrom + ", endsTo=" + endsTo + "]";
//	}
}
