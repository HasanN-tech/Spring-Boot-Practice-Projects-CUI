package com.hasan.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("desc")
public class DescriptiveEvaluation implements EvaluationStrategy {
	
	@Value("${grammer.score}")
	private int gScore;
	
	@Value("${presentation.score}")
	private int pScore;

	@Override
	public void evaluateAnswer() {
		IO.println("Grammer score: "+gScore+", Presentation Score: "+pScore);
	}

	@Override
	public double calculateScore() {
		return gScore+pScore;
	}

}
