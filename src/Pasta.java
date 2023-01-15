public class Pasta {
     int lengthCentimetres;
     String shape;
     String pastaName;
     protected String calories;
     String ingredients;
     String texture = "uncooked";
    public Pasta(String name_input, int length_input, String shape_input,String calories_input,String ingredients_input ){
        this.pastaName = name_input;
        this.lengthCentimetres = length_input;
        this.shape = shape_input;
        this.calories = calories_input;
        this.ingredients = ingredients_input;
    }

    public void prep(){
        System.out.println("before starting take all the necessary ingredients");
        System.out.println("mix all the ingredients");
    }
    public void cook(){

        this.texture = "cooked";
    }
}
