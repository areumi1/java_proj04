package chapter04.EX03;

import java.util.Scanner;

public class Using_Switch02 {

	public static void main(String[] args) {
		// switch 문으로 처리 ""
		// 에스프레소, 카페라떼 아포가토 주문할 경우 가격이 3,500원
				// 아메리카노 를 주문할 경우 : 2500원
				// 그외의 메뉴를 출력 할 경우 : 우리 매장에 없는 메뉴 입니다.
				
				//출력 : 주문하신 <변수>는 가격이 <변수> 입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문하실 커피를 입력해 주세요.>>>");
		
		String order = sc.next();
		int prise = 0;
		
		
		
		switch (order) {
		case "에스프레소": case "카페라떼": case "아포가토":
			prise = 3500;
			System.out.printf("주문하신 %s는 가격이 %d 원 입니다.\n",order,prise);
			break;
		case "아메리카노":
			prise = 2500;
			System.out.println("주문하신 "+ order + "는 가격이 "+ prise +"원 입니다." );
			break;
		default :
			System.out.println("우리 매장에는 없는 메뉴 입니다.");
		}
		
		
		
		switch (order) {
		case "에스프레소": case "카페라떼": case "아포가토":
			prise = 3500;
			break;
		case "아메리카노":
			prise = 2500;
			break;
		default :
			System.out.println("우리 매장에는 없는 메뉴 입니다.");
		}
		
		System.out.printf("주문하신 %s는 가격이 %d 원 입니다.\n",order,prise);
		
		sc.close();
	
		
	}
		

}
