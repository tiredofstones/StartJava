public class MyFirstGame {   
    public static void main(String[] args) {
        int startHalfInterval = 0;
        int endHalfInterval = 100;
        int unknownNum = 50;
        int guessNumb = 60;
        for (int i = guessNumb; i != unknownNum;) {
            if (guessNumb > unknownNum) {
                System.out.println("Число " + i + " больше того, что загадал компьютер");
                i--;
            }
            if (i < unknownNum) {
                System.out.println("Число " + i + " меньше того, что загадал компьютер");
                i++;
            }
            if (i == unknownNum) {
                System.out.println("Число " + i + " - Вы победили!");   
            }
        }
        
    }
}