public class Yug {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int k = 0;
    for (int i = 0; i < s.length(); i++) {
    if (i < s.length() - 1) { // Check for pairs
        if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {
            k += 400;
            i++;
            continue;
        }
        if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') {
            k += 900;
            i++;
            continue;
        }
        if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
            k += 40;
            i++;
            continue;
        }
        if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') {
            k += 90;
            i++;
            continue;
        }
        if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
            k += 4;
            i++;
            continue;
        }
        if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
            k += 9;
            i++;
            continue;
        }
    }
    // Process single-character numerals
    if (s.charAt(i) == 'M') k += 1000;
    else if (s.charAt(i) == 'D') k += 500;
    else if (s.charAt(i) == 'C') k += 100;
    else if (s.charAt(i) == 'L') k += 50;
    else if (s.charAt(i) == 'X') k += 10;
    else if (s.charAt(i) == 'V') k += 5;
    else if (s.charAt(i) == 'I') k++;
}
System.out.println(k);
        
}

}
