package com.hasan.sbeans;

public class Low implements StreamingStrategy {
	
	private int resolution;
	private int bandwidth;
	
	public void setResolution(int resolution) {
		this.resolution = resolution;
	}

	public void setBandwidth(int bandwidth) {
		this.bandwidth = bandwidth;
	}

	@Override
	public void streamVideo(String name) {
		IO.println("Streaming :"+name+" with "+resolution+" resolution");
	}

	@Override
	public int bandwidth() {
		return bandwidth;
	}

}
