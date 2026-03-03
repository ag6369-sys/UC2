import java.util.HashMap;
import java.util.Map;

public class UC8 {

    // Centralized pattern storage
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    static {
        patternMap.put('O', new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        });

        patternMap.put('P', new String[]{
                "PPPP ",
                "P   P",
                "PPPP ",
                "P    ",
                "P    ",
                "P    ",
                "P    "
        });

        patternMap.put('S', new String[]{
                "SSSS ",
                "S    ",
                " SSS ",
                "    S",
                "    S",
                "S   S",
                "SSSS "
        });
    }

    public static void main(String[] args) {
        printBanner("OOPS");
    }

    public static void printBanner(String word) {

        int height = 7;

        for (int row = 0; row < height; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    lineBuilder.append(pattern[row]).append("   ");
                }
            }

            System.out.println(lineBuilder);
        }
    }
}
