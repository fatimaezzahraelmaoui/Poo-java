public class Main {
    public static void main(String[] args) {
         Rectangle firstRectangle = new Rectangle();
         firstRectangle.largeur = 3;
         firstRectangle.longueur = 5;
         System.out.println(firstRectangle.longueur);
         firstRectangle.perimetre();
         firstRectangle.afficherRetangle();
    }
}