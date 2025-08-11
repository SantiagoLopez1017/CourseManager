package com.edu.uptc.logic;

public class Course {

	String name;
	int credits;
	int group;
	protected Course(String name, int credits, int group) {
		this.name = name;
		this.credits = credits;
		this.group = group;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	@Override
	public String toString() {
		return "Cursos inscritos: [nombre del curso=" + name + ", creditos=" + credits + ", grupo=" + group + "]";
	}
	
	
}
