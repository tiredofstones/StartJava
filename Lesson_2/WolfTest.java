public class WolfTest {
    public static void main(String[] args) {
        Wolf direWolf = new Wolf();
        direWolf.sex = "Самец";
        direWolf.nickname = "Призрак";
        direWolf.weight = 80;
        direWolf.age = 5;
        direWolf.color = "Белый";
        System.out.println("Пол - " + direWolf.sex + "\nКличка - " + direWolf.nickname + "\nВес - "
                + direWolf.weight + "\nВозраст - " + direWolf.age + "\nОкрас - " + direWolf.color);


        direWolf.move();
        direWolf.sit();
        direWolf.run();
        direWolf.howl();
        direWolf.hunt();
    }
}