package numplay;

import java.util.*;

public class BaseballGame {
    Scanner sc = new Scanner(System.in);

    private List<Character> characters = List.of('1', '2', '3', '4', '5', '6', '7', '8', '9');

    // 객체 생성시 정답을 만들도록 함
    public BaseballGame() {

    }

    public int play() {
        int strile = 0;
        int ball = 0;

        while (true) {
            // 1. 유저에게 입력값을 받음
            System.out.println("3자리의 숫자를 입력해주세요");
             Scanner input = sc.nextLine();
            // 2. 올바른 입력값을 받았는지 검증
            if(!validateInput(input)) {
                System.out.println("올바르지 않은 값을 입력했습니다");
                continue;
            }
            // 3. 게임 진행횟수 증가

            // 4. 스트라이크 개수 계산
            int strike = countStrike(input);
            // 5. 정답여부 확인, 만약 정답이면 break 를 이용해 반복문 탈출
            if (strike == 3){
                System.out.println("정답입니다");
                break;
            }
            // 6. 볼 개수 계산
            int ball = countBall(input);
            // 7. 힌트 출력
            BaseballGameDisplay.displayHint(strike, ball);
        }
        // 게임 진행횟수 반환
    }

    // 같은 패키지 내에서, 다른 패키지의 자손 클래스에서 접근이 가능합니다
    protected boolean validateInput(String input) {
        //3글자가 아닐때
        if(input.length() != 3){
            System.out.println("3자리의 숫자를 입력해주세요");
            return = false;
        }
        //중복된 숫자 금지

        //문자 작성 금지

    }
    //같은 클래스 내에서만 접근이 가능합니다.
    private int countStrike(String input) {
        int strike = 0;

    }

    private int countBall(String input) {
        int ball = 0;

    }

    private String getRandom(List<Character> characters) {
        ArrayList<Character> characters1 = new ArrayList<>(characters);
        Collections.shuffle(characters1);
        String result = "";
        for (int i = 0; i < 3; i++) {
            result += characters1.get(i);
        }
        return result;
    }
}
