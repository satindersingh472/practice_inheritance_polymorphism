public class Dinner {

    public void cookDinner(Pasta pasta, String time_taken){
        pasta.prep();
        pasta.cook();
        System.out.println("pasta " + pasta.pastaName + " will be ready when texture will be like " + pasta.texture +
                " and it will take "+ time_taken + " minutes. ");
    }
    public static void main(String[] args) {
        Dinner cook_penne = new Dinner();
        Pasta penne = new Penne();
        cook_penne.cookDinner(penne,"40");
    }
}
