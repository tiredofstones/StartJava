public class Calculator {   
    public static void main(String[] args) {
        int a = 51;
        int b = 122;
        char sign = '^';
        long result;
        if (sign == '+') {
            result = a + b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        }
        if (sign == '-') {
            result = a - b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        }
        if (sign == '*') {
            result = a * b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        }
        if (sign == '/') {
            double result1 = 1.0 * a / b;
            System.out.println(a + " " + sign + " " + b + " = " + result1);
        }
        if (sign == '^') {
            result = 1;
            for (int i = 1; i <= b; i++) {
                result *= a;
                if (i == b) {
                    System.out.println(a + " " + sign + " " + b + " = " + result);  
                }
            }
        }
        if (sign == '%') {
            result = a % b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        }
    }
}