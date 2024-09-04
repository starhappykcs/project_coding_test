// 두 정수 A와 B를 입력받은 다음, A*B를 출력하는 프로그램을 작성하시오.
// 입력 : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
// 출력 : 첫째 줄에 A*B를 출력한다.
// 예제 입력(예시)
// 첫번째 정수를 입력해 주세요 ===> 3
// 두번째 정수를 입력해 주세요 ===> 2
// 예제 출력(예시 : 정상 처리)
// A*B 결과값 = 6 입니다!
// 예제 출력(예시 : 만약에(if문), A 또는(||) B가 0보다 작은 정수로 입력 되었다면)
// A, B 숫자는 0보다 큰 숫자를 입력해 주세요!
// 예제 출력(만약에(if문), A 또는(||) B가 9보다 크게 입력 되었다면)
// A, B 숫자는 10보다 작은 숫자를 입력해 주세요!

import java.util.Scanner;

import javax.annotation.Resource;

public class Project_Coding_Practice01_mjh {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1 이상 10 미만의 자연수 A,B를 입력하세요.");
		
		System.out.print("A값 입력 : ");
		int A = scan.nextInt();
		System.out.print("B값 입력 : ");
		int B = scan.nextInt();
		
		scan.close();
		
		if (A < 1 || B < 1) {
			System.out.println("1이상의 자연수를 입력해 주세요");
		}else if (A > 9 || B > 9) {
			System.out.println("9이하의 자연수를 입력해 주세요");
		} 
		
		int Result = A*B;
		System.out.println("A * B =" + Result);
		
}
}