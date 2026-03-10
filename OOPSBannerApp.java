/**
 * OOPSBannerApp
 * UC5: Render OOPS Banner using Inline Array Initialization
 *
 * @author Akshith
 * @version 1.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Inline array initialization with String.join()
        String[] banner = {
            String.join(" ", "  *****  ", "  *****  ", " ******  ", "  *****  "),
            String.join(" ", " *     * ", " *     * ", " *     * ", " *     * "),
            String.join(" ", "*       *", "*       *", " *     * ", "*       *"),
            String.join(" ", "*       *", "*       *", " ******  ", "*       *"),
            String.join(" ", "*       *", "*       *", " *       ", "*       *"),
            String.join(" ", " *     * ", " *     * ", " *       ", " *     * "),
            String.join(" ", "  *****  ", "  *****  ", " *       ", "  *****  ")
        };

        // Loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }

    }
}



