public class Calculator {   
    public static void main(String[] args) {
        int a = 58;
        int b = 7;
        char sign = '^';
        long result = 0;
        if (sign == '+') {
            result = a + b;
        }
        else if (sign == '-') {
            result = a - b;
        }
        else if (sign == '*') {
            result = a * b;
        }
        else if (sign == '/') {
             result = a / b;
        }
        else if (sign == '^') {
            result = 1;
            for (int i = 1; i <= b; i++) {
                result *= a;
                if (i == b) {
                }
            }
        }
        else if (sign == '%') {
            result = a % b;
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}