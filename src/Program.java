public class Program {
    public static void main(String[] args) {


        Dog d = new Dog("Lollie",6,"Border Collie");
        System.out.println(d.getName());
        d.makeSound();
        d.dig();
        //  d.breed = "chihuahua!";
        Cat c = new Cat("Katie",13,"tabby");
        System.out.println(c.getName());
        c.makeSound();
        Bird b = new Bird("Tweety",3,4.5f);
        b.makeSound();
        c.move();
        b.move();
        Dog v = new Dog("Bella", 15,"German Sherpard");
        v.dig();
        v.move();
        v.eats();


    }

}
