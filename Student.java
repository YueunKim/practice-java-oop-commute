package dev.syntax.oop.step03practice;
/*
 People(손님)에 대한 설계도
*/
public class Student {
	int money = 0;
	String name = "";
	String status = "";
	
	public Student(int money, String name) {
		this.money = money;
		this.name = name;
	}
	
	// 타다
	void takeTransportation(Transportation transportation) {
		payMoney(transportation);
		transportation.increasePassenger();
	}
	
	// 요금을 지불하다
	void payMoney(Transportation transportation) {
		money -= transportation.price;
		transportation.receiveMoney();
	}
	
	// 내리다
	void dropOffTransportation(Transportation transportation) {
		transportation.decreasePassenger();
	}
	
	@Override
	public String toString() {
		return "학생 이름 : " + name + "\n" + 
				"잔액 : " + money;
	}
}
