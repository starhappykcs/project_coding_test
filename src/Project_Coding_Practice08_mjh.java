// for문과 continue문을 사용하여
// 2부터 9까지의 구구단 중에서 짝수 단만 출력하는
// 자바 프로그램을 제작해 봅니다.

public class Project_Coding_Practice08_mjh {

	public static void main(String[] args) {

		for (int i = 1; i <=9; i++) {
//			System.out.println(i); 
			if (i%2 == 1) {
				continue;
			}
//			System.out.println(i + "x");
			for (int i2 = 1; i2 <= 9; i2++) {
				System.out.println(i + " X " + i2 + "= " + i*i2 );
		}
			System.out.println("===================");
		}


		




	}
}
