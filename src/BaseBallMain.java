import java.util.*;

public class BaseBallMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isExit = true;
        int ball;
        int strike;

        Set<String> set = new HashSet<>();
        while (set.size() < 3) {
            String random = String.valueOf((int)((Math.random() * 9) + 1));
            set.add(random);
        }

        List<String> list = set.stream().toList();

        for (String s : list) {
            System.out.println(s);
        }

        while (isExit) {
            System.out.print("숫자를 입력해 주세요(3자리): ");
            char[] chars = sc.nextLine().toCharArray();

            if (chars.length == 0) {
                isExit = false;
                System.out.println("nothing");
            }

            strike = 0;
            ball = 0;

            for (int i = 0; i < chars.length; i++) {

                String charToStr = String.valueOf(chars[i]); // "2", "4", "6"

                if (list.contains(charToStr)) { // char[i]가 list에 포함될 때.  // "4"
                    if (list.get(i).equals(charToStr)) { // "2"
                        strike++; // 1
                    } else {
                        ball++;
                    }
                }
            }

            System.out.printf("%d볼 %d스트라이크\n", ball, strike);

            if (strike == 3) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                System.out.println("게임을 새로 시작하시려면 1, 종료하시려면 2를 입력하세요.");
                String num = sc.nextLine();
                switch (num) {
                    case "1" -> {
                        System.out.println("게임을 다시 시작합니다.");
                        set = new HashSet<>();
                        while (set.size() < 3) {
                            String random = String.valueOf((int)((Math.random() * 9) + 1));
                            set.add(random);
                        }

                        list = set.stream().toList();

                        for (String s : list) {
                            System.out.println(s);
                        }
                    }
                    case "2" -> {
                        isExit = false;
                        System.out.println("게임을 종료합니다.");
                    }
                }
            }
        }
    }
}
