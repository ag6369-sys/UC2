import java.util.HashMap;
import java.util.Map;

public class UC7 {

    public static void main(String[] args) {
        printBanner("OOPS");
    }

    public static void printBanner(String word) {

        Map<Character, CharacterPatternMap> patternMap = initializePatterns();

        int height = 7;

        for (int row = 0; row < height; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : word.toCharArray()) {

                CharacterPatternMap pattern = patternMap.get(ch);

                if (pattern != null) {
                    lineBuilder.append(pattern.getPattern()[row]).append("   ");
                }
            }

            System.out.println(lineBuilder.toString());
        }
    }

    // Initialize character patterns
    public static Map<Character, CharacterPatternMap> initializePatterns() {

        Map<Character, CharacterPatternMap> map = new HashMap<>();

        map.put('O', new CharacterPatternMap('O', new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        }));

        map.put('P', new CharacterPatternMap('P', new String[]{
                "PPPP ",
                "P   P",
                "PPPP ",
                "P    ",
                "P    ",
                "P    ",
                "P    "
        }));

        map.put('S', new CharacterPatternMap('S', new String[]{
                "SSSS ",
                "S    ",
                " SSS ",
                "    S",
                "    S",
                "S   S",
                "SSSS "
        }));

        return map;
    }

    // Static Inner Class
    static class CharacterPatternMap {

        private char letter;
        private String[] pattern;

        public CharacterPatternMap(char letter, String[] pattern) {
            this.letter = letter;
            this.pattern = pattern;
        }

        public char getLetter() {
            return letter;
        }

        public String[] getPattern() {
            return pattern;
        }
    }
}
