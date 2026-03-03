public class UC6 {

    public static void main(String[] args) {
        printBanner();
    }

    public static void printBanner() {

        String space = "   ";

        String[] o = getO();
        String[] p = getP();
        String[] s = getS();

        int height = o.length;

        for (int i = 0; i < height; i++) {
            String line = String.join(space,
                    o[i],
                    o[i],
                    p[i],
                    s[i]
            );
            System.out.println(line);
        }
    }

    // Helper method for letter O
    public static String[] getO() {
        return new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        };
    }

    // Helper method for letter P
    public static String[] getP() {
        return new String[]{
                "PPPP ",
                "P   P",
                "PPPP ",
                "P    ",
                "P    ",
                "P    ",
                "P    "
        };
    }

    // Helper method for letter S
    public static String[] getS() {
        return new String[]{
                "SSSS ",
                "S    ",
                " SSS ",
                "    S",
                "    S",
                "S   S",
                "SSSS "
        };
    }
}
