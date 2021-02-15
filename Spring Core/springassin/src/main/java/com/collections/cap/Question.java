package com.collections.cap;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {

	
	//questionId, question, answers
	private int questionId;
	private String question;
	private List<String> answers;
	private Set<String> answers1;
	private Map<Integer, String> answers11;
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	public Set<String> getAnswers1() {
		return answers1;
	}
	public void setAnswers1(Set<String> answers1) {
		this.answers1 = answers1;
	}
	public Map<Integer, String> getAnswers11() {
		return answers11;
	}
	public void setAnswers11(Map<Integer, String> answers11) {
		this.answers11 = answers11;
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", answers=" + answers + ", answers1="
				+ answers1 + ", answers11=" + answers11 + "]";
	}
	
	
	
}
