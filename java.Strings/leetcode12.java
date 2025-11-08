public class leetcode12 {
       public static String intToRoman(int num) {
        // Define value-symbol pairs
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {
            "M", "CM", "D", "CD", "C", "XC", "L", "XL",
            "X", "IX", "V", "IV", "I"
        };

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                roman.append(symbols[i]);
                num -= values[i];
            }
        }

        return roman.toString();
    }

    public static void main(String[] args) {
        System.out.println("3749 = " + intToRoman(3749)); // Output: "MMMDCCXLIX"
        System.out.println("58 = " + intToRoman(58));     // Output: "LVIII"
    }
}
