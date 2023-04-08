public class MyFirstGame {   
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 100;
        int unknownNum = 77;
        int myNumb = 1;
        for (int i = num1; i <= unknownNum; ++i) {
            if (i > unknownNum) {
                System.out.println("Число " + i + " больше того, что загадал компьютер");
            }
            if (i < unknownNum) {
                System.out.println("Число " + i + " меньше того, что загадал компьютер");
            }
            if (i == unknownNum) {
                System.out.println("Число " + i + " - Вы победили!");
            }
        }
    }
}