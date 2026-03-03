public class UC3 {

    public static void main(String[] args) {
        printBanner();
    }

    public static void printBanner() {

        String spaceBetweenLetters = "   ";

        String line1 = String.join(spaceBetweenLetters,
                " OOO ",
                " OOO ",
                "PPPP ",
                "SSSS "
        );

        String line2 = String.join(spaceBetweenLetters,
                "O   O",
                "O   O",
                "P   P",
                "S    "
        );

        String line3 = String.join(spaceBetweenLetters,
                "O   O",
                "O   O",
                "PPPP ",
                " SSS "
        );

        String line4 = String.join(spaceBetweenLetters,
                "O   O",
                "O   O",
                "P    ",
                "    S"
        );

        String line5 = String.join(spaceBetweenLetters,
                " OOO ",
                " OOO ",
                "P    ",
                "SSSS "
        );

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
    }
}