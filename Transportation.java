package dev.syntax.oop.step03practice;
/*
 * Transport(대중교통)에 대한 설계도
 */
public class Transportation {
	int sales = 0;
	int passenger = 0;
	int price = 0;
	String type = "";
	
	public Transportation (String type, int price) {
		this.price = price;
		this.type = type;
	}
	
	// 요금을 받다
	void receiveMoney () {
		sales += price;
	}
	
	// 승객 1명 증가
	void increasePassenger () {
		passenger += 1;
	}
	
	// 승객 1명 감소
	void decreasePassenger () {
		passenger -= 1;
	}
	
	@Override
	public String toString() {
		return "대중교통수단 :  : " + type + "\n" + 
				"매출액 : " +  sales + "\n" +
				"현재 승객 수 : " + passenger;
	}
}