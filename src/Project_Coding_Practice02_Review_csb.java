// 5층 건물의 엘리베이터안이라고 가정했을때, 1층 마트, 2층 병원,
// 3층 영어학원, 4층 IT 회사, 5층 헬스장을 가기 위해, 건물의 층 번호를
// 정수값으로 입력 받아서 누르면, 그 층이 어떤 곳인지 알려주는
// 자바 프로그램을 제작하시기 바랍니다. 이때, switch-case문을 활용하고, 
// 4를 입력했을 경우, "4층 IT 회사 입니다!" 라고 화면으로 출력이
// 되게 하시기 바랍니다.
// 다음은 button(층별 버튼)과 comment(층별 선택 안내 메시지) 변수의
// 입력 조건 예시 입니다.
// int button = 4;
// String comment;

import java.util.Scanner;

public class Project_Coding_Practice02_Review_csb {
	public static void main(String[] args) {

		// Scanner 클래스를 활용하여 시스템으로부터 입력 받은 값을 변수 in에 담아서
		// scan 객체 참조 변수에 대입해 줍니다.
		Scanner scan = new Scanner(System.in);
		// 안내 사항 문자열 값을 화면으로 표시해 줍니다.

		System.out.println("층수를 입력해주세요");
		int a=scan.nextInt();
		
		switch (a) {
		case 1: a=1;
			System.out.println("마트입니다.");
			break;

		case 2: a=2;
		System.out.println("병원입니다.");
		break;
		
		case 3: a=3;
		System.out.println("영어학원입니다.");
		break;
		
		case 4: a=4;
		System.out.println("it회사입니다.");
		break;
		
		case 5: a=5;
		System.out.println("헬스장입니다.");
		break;
		}




		scan.close();
	}
}




