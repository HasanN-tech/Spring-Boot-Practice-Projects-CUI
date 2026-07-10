package com.hasan.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("obj")
public class ObjectiveEvaluation implements EvaluationStrategy {
	@Value("${obj.question}")
	private int questions;
	
	@Value("${obj.correct}")
	private int correct;

	@Override
	public void evaluateAnswer() {
		IO.println("Total Quesions: "+questions+", Correct: "+correct);
	}

	@Override
	public double calculateScore() {
		return questions-correct;
	}

}
