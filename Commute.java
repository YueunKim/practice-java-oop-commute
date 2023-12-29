package dev.syntax.oop.step03practice;

public class Commute {
	public static void main(String[] args) {
		Student student = new Student(5000, "지음");
		Transportation bus = new Transportation("버스", 1200);
		Transportation subway = new Transportation("지하철", 1500);

		// 학생이 버스탐
		student.takeTransportation(bus);

		System.out.println(bus.toString());
		System.out.println(student.toString());
	}
}

class Example {
	
}