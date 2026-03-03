public class UC5 {

    public static void main(String[] args) {
        printBanner();
    }

    public static void printBanner() {

        String space = "   ";

        // Combined declaration + initialization
        String[] banner = {
                String.join(space, " OOO ", " OOO ", "PPPP ", "SSSS "),
                String.join(space, "O   O", "O   O", "P   P", "S    "),
                String.join(space, "O   O", "O   O", "PPPP ", " SSS "),
                String.join(space, "O   O", "O   O", "P    ", "    S"),
                String.join(space, "O   O", "O   O", "P    ", "S   S"),
                String.join(space, "O   O", "O   O", "P    ", "S   S"),
                String.join(space, " OOO ", " OOO ", "P    ", "SSSS ")
        };

        // Enhanced for loop for display
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
