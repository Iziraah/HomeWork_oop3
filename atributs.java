public class atributs {
    public static void main(String args[]){
        Pet pet = new Pet();
        pet.type = "кот";
        pet.age = 45;

        Pet pet2 = new Pet();
        pet2.type = "dog";
        pet2.age = 5;
        pet2.color = "black";
        pet.eyes = "brown";
        pet2.height = 40;
        pet2.weight = 102;
        pet2.name = "Kevin";
    }    
}
class Pet{
    String type;
    String name;
    double weight;
    String eyes;
    int age;
    String color;
    double length;
    double height;

}
