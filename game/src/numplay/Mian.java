package numplay;

import java.util.Scanner;

public class Mian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(ture) {
            System.out.println("환영합니다! 원하시는 번호를 입력해주세요");
            System.out.println("1.게임 시작하기 2.게임 기록하기 3.종료하기");

            String input = sc.nextLine();

            switch(input) {
                case "1":
                    System.out.println("< 게임을 시작합니다 >");
                    System.out.println("숫자를 입력하세요");
                    BaseballGame baseballGame = new BaseballGame();
                    baseballGame.play();
                    break;

                case "2";
                    System.out.println("< 아직 이욜할 수 없습니다 >");
                    break;

                case "3":
                    System.out.println("< 게임을 종료합니다 >");
                    break;

                default:
                    System.out.println("올바르지 않은 입력값입니다");
                    break;
            }


        }
    }
}
