import java.util.Scanner;

public class Player {

    private GameMachine gameMachine;

    public void startGame() {
        gameMachine = new GameMachine();
    }

    public String continueGame(Scanner sc) {
        System.out.print("숫자를 입력해 주세요(3자리): ");
        String input = sc.nextLine();
        if (gameMachine.verify(input)) {
            return "verified";
        } else {
            return "fail";
        }
    }

    public void choice(String input, Scanner sc) {
        switch (input) {
            case "1" -> {
                System.out.println("게임을 다시 시작합니다.");
                startGame();
            }

            case "2" -> exit();
        }
    }

    private void exit() {
        System.exit(0);
    }
}
