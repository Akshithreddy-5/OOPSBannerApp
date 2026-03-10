/**
 * OOPSBannerApp
 * UC4: Render OOPS Banner using String Array and Loop
 *
 * @author Akshith
 * @version 1.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Create String array to store banner lines
        String[] banner = new String[7];

        banner[0] = String.join(" ", "  *****  ", "  *****  ", " ******  ", "  *****  ");
        banner[1] = String.join(" ", " *     * ", " *     * ", " *     * ", " *     * ");
        banner[2] = String.join(" ", "*       *", "*       *", " *     * ", "*       *");
        banner[3] = String.join(" ", "*       *", "*       *", " ******  ", "*       *");
        banner[4] = String.join(" ", "*       *", "*       *", " *       ", "*       *");
        banner[5] = String.join(" ", " *     * ", " *     * ", " *       ", " *     * ");
        banner[6] = String.join(" ", "  *****  ", "  *****  ", " *       ", "  *****  ");

        // Loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }

    }
}




