public class Program {
    public static void main(String[] args) {
// //       Pet obj = new Pet("Fido",7);
////        Pet obj1 = new Pet("Fred",6);
//        System.out.println(obj.getName() + " " + obj.getAge());
////        obj.name = "Fred";
////        obj.setAge(8);
//        obj.getsOlder();
//        System.out.println(obj.getName() + " " + obj.getAge());

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
