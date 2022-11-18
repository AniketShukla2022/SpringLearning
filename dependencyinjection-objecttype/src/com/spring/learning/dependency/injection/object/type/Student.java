package com.spring.learning.dependency.injection.object.type;

public class Student {
	
	public int id;
	
	private MathCheat mathCheat;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}
	
	public void cheating() {
		mathCheat.callCheating();
	}
}
