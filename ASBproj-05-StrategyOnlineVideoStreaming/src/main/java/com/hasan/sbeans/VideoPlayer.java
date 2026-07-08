package com.hasan.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Component
@ImportResource("com/hasan/config/applicationContext.xml")
public class VideoPlayer {
	private StreamingStrategy strategy;
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Autowired
	@Qualifier("hdBean")
	public void setStrategy(StreamingStrategy strategy) {
		this.strategy = strategy;
	}


	public void playVideo() {
		strategy.streamVideo(name);
	}
	public void displayInfo() {
		IO.println("BAndwidth: "+strategy.bandwidth());
	}
}
