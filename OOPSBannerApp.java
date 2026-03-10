import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp
 * UC8: Use HashMap for Character Patterns and Render via Function
 *
 * @author Akshith
 * @version 1.0
 */

public class OOPSBannerApp {

    /**
     * Creates and returns a HashMap containing banner patterns
     */
    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        });

        patterns.put('P', new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        });

        patterns.put('S', new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "  *****  ",
                "        *",
                " *     * ",
                "  *****  "
        });

        return patterns;
    }

    /**
     * Renders the banner message
     */
    public static void renderBanner(String message, Map<Character, String[]> patterns) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = patterns.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append(" ");
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patterns = buildCharacterPatterns();

        String message = "OOPS";

        renderBanner(message, patterns);
    }
}



