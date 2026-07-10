package com.hasan.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("portal")
public class ExamPortal {
	
	@Autowired
	@Qualifier("desc")
	private EvaluationStrategy strategy;
	private int id;

	public void setId(int id) {
		this.id = id;
	}
	public void start() {
		IO.println("Exam id: "+id);
		strategy.evaluateAnswer();
	}
	public void result() {
		strategy.calculateScore();
	}
}
