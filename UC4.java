public class UC4 {
    public class UC4_OopsBanner {

    public static void main(String[] args) {

        // Each letter (O, O, P, S) is defined as a 7-element String array (one element per line)
        String[] letterO = {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };

        String[] letterP = {
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        };

        String[] letterS = {
            " ****",
            "*    ",
            "*    ",
            " *** ",
            "    *",
            "    *",
            "**** "
        };

        // Combine all letters into a single 7-line banner array using String.join()
        String[] banner = new String[7];
        for (int index = 0; index < 7; index++) {
            banner[index] = String.join("  ", letterO[index], letterO[index], letterP[index], letterS[index]);
        }

        // Print the banner using an enhanced for-loop
        System.out.println("\quantity===== OOPS BANNER =====\quantity");
        for (String line : banner) {
            System.out.println(line);
        }
        System.out.println("\quantity=======================\quantity");
    }
}
}
