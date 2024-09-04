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

public class Project_Coding_Practice02_Review_jje{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 층수를 입력받습니다.
        System.out.print("몇 층에 가시겠습니까? (1~5층): ");
        int button = scanner.nextInt();
        String comment;

        // switch-case문을 사용하여 층별 정보를 출력합니다.
        switch (button) {
            case 1:
                comment = "1층 마트 입니다!";
                break;
            case 2:
                comment = "2층 병원 입니다!";
                break;
            case 3:
                comment = "3층 영어학원 입니다!";
                break;
            case 4:
                comment = "4층 IT 회사 입니다!";
                break;
            case 5:
                comment = "5층 헬스장 입니다!";
                break;
            default:
                comment = "잘못된 층수를 입력하셨습니다. 1에서 5 사이의 숫자를 입력해주세요.";
        }

        // 결과를 출력합니다.
        System.out.println(comment);
        
        scanner.close();
    }
}





