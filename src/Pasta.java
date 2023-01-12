public class Pasta {
    public static int lengthCentimetres;
    public static String shape;
    public static String calories;
    public static String ingredients;
    public static String texture = "uncooked";
    public Pasta(int length, String shape,String calories,String ingredients ){
        this.lengthCentimetres = length;
        this.shape = shape;
        this.calories = calories;
        this.ingredients = ingredients;
    }

    public void prep(){
        System.out.println("before starting take all the necessary ingredients");
        System.out.println("mix all the ingredients");
    }
    public void cook(){
        this.texture = "cooked";
    }
}
