public class Cat extends Pet {
    String breed;

    public Cat(String name, int age, String breed){
        super(name,age);
        this.breed = breed;
    }
    public void clean(){
        System.out.println();
    }
     public String getBreed(){
        return breed;
     }
     public void eats(){
         System.out.println(getName() + "eats small rodents!");
     }

     public void sleeps(){
         System.out.println("zzzzzzzzz!");
     }
    public void makeSound(){
        System.out.println("Purrrrrrr!");
    }

}
