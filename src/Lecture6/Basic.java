package Lecture6;

public class Basic {
    public static void main(String[] args) {
        System.out.println();

        Week week = Week.MONDAY;
        System.out.println(week);

        for (Week day : Week.values()) {
            System.out.println(day);
        }

        week.greet();
    }

    enum Week implements Greeting{
        // it can implement an interface but can't extend a class
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        // these are enum constants
        // public, static, and final
        // since its final you can't change the value of these constants
        // type is Week

        @Override
        public void greet() {
            System.out.println("Hello from " + this);
        }
    }
}
