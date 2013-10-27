package legacy_code;

public class Validator {

    /**
     * Returns <code>true</code> if the string is <code>null</code>, meaning it
     * is a <code>null</code> reference, nothing but spaces, or the string
     * "<code>null</code>".
     *
     * @param  string the string to check
     * @return <code>true</code> if the string is <code>null</code>;
     *         <code>false</code> otherwise
     */
    public static boolean isNull(String string) {
        if (string == null) {
            return true;
        }

        String strippedString = string.replaceAll(" ", "");
        return strippedString.isEmpty() || strippedString.equals("null");
    }


    static class CharPool {

        public static final char SPACE = ' ';
        public static final char LOWER_CASE_N = 'n';
        public static final char LOWER_CASE_U = 'u';
        public static final char LOWER_CASE_L = 'l';
    }
}
