/**
 * OOPSBannerApp
 * UC6: Refactor Banner Logic using Static Functions
 *
 * @author Akshith
 * @version 1.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join(" ", o[i], o[i], p[i], s[i]);
        }

        // Print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Helper method for letter O
    public static String[] getOPattern() {
        return new String[]{
            "  *****  ",
            " *     * ",
            "*       *",
            "*       *",
            "*       *",
            " *     * ",
            "  *****  "
        };
    }

    // Helper method for letter P
    public static String[] getPPattern() {
        return new String[]{
            " ******  ",
            " *     * ",
            " *     * ",
            " ******  ",
            " *       ",
            " *       ",
            " *       "
        };
    }

    // Helper method for letter S
    public static String[] getSPattern() {
        return new String[]{
            "  *****  ",
            " *     * ",
            "*       *",
            "  *****  ",
            "        *",
            " *     * ",
            "  *****  "
        };
    }
}

