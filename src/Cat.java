public class Cat extends Pet {
    String breed;

    public Cat(String name, int age, String breed){
        super(name,age);
        this.breed = breed;
    }
    public void clean(){
        System.out.println();
    }

}
