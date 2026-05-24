import java.util.HashMap;

public class RomanToInteger {
     public static int romanToInt(String romanNumber) {
    HashMap<String, Integer> map = new HashMap<>();
    map.put("I", 1);
    map.put("V", 5);
    map.put("X", 10);
    map.put("L", 50);
    map.put("C", 100);
    map.put("D", 500);
    map.put("M", 1000);
    int i = 0;
    int sum = 0;
    while (i < romanNumber.length()) {
        char singleChar = romanNumber.charAt(i);
        String currentSymbol = String.valueOf(singleChar);
        int currentValue = map.get(currentSymbol);
        int nextValue = 0;
        if (i + 1 < romanNumber.length()) {
            char nextChar = romanNumber.charAt(i + 1);
            String nextSymbol = String.valueOf(nextChar);
            nextValue = map.get(nextSymbol);
        }
        if (currentValue < nextValue) {
            sum = sum - currentValue;
        } else {
            sum = sum + currentValue;
        }
        i++;
    }
    return sum;
}
public static void main(String[] args) {
    String romanNumber= "LVIII";
    System.out.println(romanToInt( romanNumber));
}
}
