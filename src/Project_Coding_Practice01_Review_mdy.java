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

public class Project_Coding_Practice01_Review_mdy {
	public static void main(String[] args) {
		
		// System으로부터 in(입력 받은 값)을
		// Scanner 클래스를 참조하는 참조변수 scan에 대입 처리합니다.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력해 주세요 ==> ");
		// 앞서 생성한 scan 변수에 입력된 값을 int(정수형) 변수 A에 대입 처리 합니다.
		int A = scan.nextInt(); 
		
		System.out.print("두번째 정수를 입력해 주세요 ==> ");
		// 앞서 생성한 scan 변수에 입력된 값을 int(정수형) 변수 B에 대입 처리 합니다.
		int B = scan.nextInt();
		
		// 만약에(if문), A 또는(||) B가 0보다 작은 정수로 입력 되었다면
		if ((0 > A || 0 > B)) { 
			System.out.println("A, B 숫자는 0보다 큰 숫자를 입력해 주세요!");
		// 만약에(if문), A 또는(||) B가 9보다 크게 입력 되었다면
		} else if (A >= 10 || B >= 10) {
            System.out.println("A, B 숫자는 10보다 작은 숫자를 입력해 주세요!");
        // (0 < A, B < 10) 범위의 정수 A, B가 입력되었다면
        } else {
            System.out.println("A*B 결과값 = " + (A * B) + " 입니다!");
        }

        // scan 객체 참조 변수 활용이 끝나면 자원(Resource)을 닫아줍니다.
        scan.close();
    }
}



