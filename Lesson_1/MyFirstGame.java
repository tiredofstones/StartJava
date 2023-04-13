public class MyFirstGame {   
    public static void main(String[] args) {
        int startInterval = 1;
        int endInterval = 100;
        int unknownNum = 36;
        int guessNum = 77;
        for (int i = startInterval; i <= endInterval;) {
            if (guessNum == unknownNum) {
                System.out.println("Число " + guessNum + " - Вы победили!");
                break;
            } else if (guessNum > unknownNum) {
                System.out.println("Число " + guessNum + " больше того, что загадал компьютер");
                guessNum--;
            } else {
                System.out.println("Число " + guessNum + " меньше того, что загадал компьютер");
                guessNum++;
            }
        }
        
    }
}