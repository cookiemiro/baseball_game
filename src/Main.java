import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player player = new Player();

        player.startGame();
        while (true) {
            String verification = player.continueGame(sc);

            if (verification.equals("verified")) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다!");
                System.out.println("게임을 새로 시작하시려면 1, 종료하시려면 2를 입력하세요.");
                String input = sc.nextLine();
                player.choice(input, sc);
            } else {
                player.continueGame(sc);
            }
        }
    }
}
