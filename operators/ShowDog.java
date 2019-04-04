//: operators/Dog.java

class Dog {
    String name;
    String says;
}

public class ShowDog {
    public static void main(String[] args) {
        Dog spot = new Dog();
        Dog scruffy = new Dog();
        Dog newspot = spot;
        spot.name = "spot";
        spot.says = "Ruff!";
        scruffy.name = "scruffy";
        scruffy.says = "Wurf!";
        System.out.println(spot.name + " says: " + spot.says + ".");
        System.out.println(scruffy.name + " says: " + scruffy.says + ".");
        System.out.println((spot == newspot) + ", "
                           + (spot.name == newspot.name) + ", "
                           + (spot.says == newspot.says) + ", "
                           + spot.equals(newspot) + ", "
                           + spot.name.equals(newspot.name) + ", "
                           + spot.says.equals(newspot.says));
    }
}
