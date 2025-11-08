public class leetcode13 {
    public static int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
    public static int romanToInt(String s) {
        int total = 0;
        int n = s.length();
        for(int i = 0; i<n; i++){
            int current =  getValue(s.charAt(i));
            int next = 0;
            if (i + 1 < n) {
                next = getValue(s.charAt(i + 1));
            }

            if (current < next) {
                total -= current;
            } else {
                total += current;
            }
        }

        return total;
    }
        
    

    public static void main(String[] args) {
         System.out.println(romanToInt("III"));      // Output: 3
        System.out.println(romanToInt("LVIII"));    // Output: 58
        System.out.println(romanToInt("MCMXCIV"));  // 1994
        
    }
}
