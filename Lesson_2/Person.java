public class Person {
    String gender = "male";
    String name = "Володя";
    float height = 91f;
    float weight = 1.95f;
    int age = 33;

    String speak() {
        return "Разговаривает";
    }

    void move() {
        System.out.println("Идет");
    } 

    void run() {
        System.out.println("Бежит");
    }

    void sit() {
        System.out.println("Садится");
    }

    boolean learnJava() {
        return true;
    }
}   