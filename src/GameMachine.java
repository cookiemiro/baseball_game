import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GameMachine {

    private final Set<String> set = new HashSet<>();

    GameMachine() {
        init();
    }

    private void init() {
        while (set.size() < 3) {
            String random = String.valueOf((int)((Math.random() * 9) + 1));
            set.add(random);
        }

        List<String> list = set.stream().toList();

        for (String s : list) {
            System.out.println(s);
        }
    }

    public boolean verify(String input) {
        Reader reader = new Reader();
        return reader.verify(input, set);
    }
}
