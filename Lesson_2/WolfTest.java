public class WolfTest {
    public static void main(String[] args) {
        Wolf direWolf = new Wolf();
        direWolf.setSex("Самец");
        direWolf.setNickName("Призрак");
        direWolf.setWeight(80);
        direWolf.setAge(9);
        direWolf.setColor("Белый");
        System.out.println("Пол - " + direWolf.getSex() + "\nКличка - " + direWolf.getNickName() + 
                "\nВес - " + direWolf.getWeight() + "\nВозраст - " + direWolf.getAge() + 
                "\nОкрас - " + direWolf.getColor());

        direWolf.move();
        direWolf.sit();
        direWolf.run();
        direWolf.howl();
        direWolf.hunt();
    }
}