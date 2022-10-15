public class atributs {
    public static void main(String args[]){
        Pet.Builder newPet = new Pet.Builder()
            .withColor(null)
            .withType("Cat")
            .withName("Eva")
            .withAge(6)
            .withEyes(null)
            .withLength(0);

    }    
}
class Pet{
   private String type;
   private String name;
   private double weight;
   private String eyes;
   private int age;
   private String color;
   private double length;
   private double height;

   public static class Builder {
    private Pet newPet;

    public Builder() {
        newPet = new Pet();
    }
    public Builder withType(String type){
        newPet.type = type;
        return this;
    }
    public Builder withName(String name){
        newPet.name = name;
        return this;
    }
    public Builder withWeight(double weight){
        newPet.weight = weight;
        return this;
    }
    public Builder withEyes(String eyes){
        newPet.eyes = eyes;
        return this;
    }
    public Builder withAge(int age){
        newPet.age = age;
        return this;
    }
    public Builder withColor(String color){
        newPet.color = color;
        return this;
    }
    public Builder withLength(double length){
        newPet.length = length;
        return this;
    }
    public Builder withHeight(double height){
        newPet.height = height;
        return this;
    }
}
}
