import java.util.List;
import java.util.Set;

public class Reader {

    //    검증
    public boolean verify(String input, Set<String> machineOutput) {

        List<String> list = machineOutput.stream().toList();

        char[] chars = input.toCharArray();

        int strike = 0;
        int ball = 0;

        for (int i = 0; i < chars.length; i++) {

            String charToStr = String.valueOf(chars[i]);

            if (list.contains(charToStr)) {
                if (list.get(i).equals(charToStr)) {
                    strike++; // 1
                } else {
                    ball++;
                }
            }
        }

        System.out.printf("%d 볼 %d 스트라이크\n", ball, strike);

        return strike == 3;
    }
}
