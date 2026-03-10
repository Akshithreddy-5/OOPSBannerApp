/**
 * OOPSBannerApp
 * UC7: Store Character Pattern in a Class
 *
 * @author Akshith
 * @version 1.0
 */

public class OOPSBannerApp {

    /**
     * Static Inner Class to store character and pattern
     */
    static class CharacterPattern {

        private char character;
        private String[] pattern;

        /**
         * Constructor
         * @param character Character symbol
         * @param pattern Banner pattern lines
         */
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Create pattern objects
        CharacterPattern oPattern = new CharacterPattern('O', new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        });

        CharacterPattern pPattern = new CharacterPattern('P', new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        });

        CharacterPattern sPattern = new CharacterPattern('S', new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "  *****  ",
                "        *",
                " *     * ",
                "  *****  "
        });

        // Store patterns in array
        CharacterPattern[] characters = {oPattern, oPattern, pPattern, sPattern};

        // Build banner lines
        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPattern cp : characters) {
                line.append(cp.getPattern()[i]).append(" ");
            }

            System.out.println(line);
        }
    }
}


