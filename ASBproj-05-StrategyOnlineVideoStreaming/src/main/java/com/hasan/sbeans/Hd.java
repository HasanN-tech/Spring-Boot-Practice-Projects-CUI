package com.hasan.sbeans;


public class Hd implements StreamingStrategy {
	
	private int frame;
	private int bandwidth;
	
	public void setFrame(int frame) {
		this.frame = frame;
	}

	public void setBandwidth(int bandwidth) {
		this.bandwidth = bandwidth;
	}

	@Override
	public void streamVideo(String name) {
		IO.println("streaming: "+name+" with frame rate= "+frame);
	}

	@Override
	public int bandwidth() {
		return bandwidth;
	}

}
