package com.hasan.sbeans;

public class UltraHD implements StreamingStrategy {
	
	private boolean dolBy;
	private int bandwidth;
	
	public void setDolBy(boolean dolBy) {
		this.dolBy = dolBy;
	}

	public void setBandwidth(int bandwidth) {
		this.bandwidth = bandwidth;
	}

	@Override
	public void streamVideo(String name) {
		IO.println("Streaming: "+name+" in UltaHD Dolby: "+dolBy);
	}

	@Override
	public int bandwidth() {
		return bandwidth;
	}

}
