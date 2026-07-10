package com.hasan.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ai")
public class AIEvaluation implements EvaluationStrategy {

	@Value("${ai.pcheck}")
	private boolean pCheck;
	
	@Value("${ai.accuracy}")
	private double accuracy;
		
	@Override
	public void evaluateAnswer() {
		IO.println("Plagiarism: "+pCheck+", Accuracy: "+accuracy);
	}

	@Override
	public double calculateScore() {
		return accuracy;
	}

}
