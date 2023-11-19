public class Rectangle {
    short largeur
    short longueur

    public Rectangle(longueur,largeur) {
        this.longueur
        this.largeur
    }
    
    void perimetre() {
       return 2*( this.longueur + this.largeur);
    
    }
    void Aire() {
        return (this.longueur * this.largeur);
    }
    void isCrre() {
        if (this.longueur == this.largeur);
         return "vrai"
        if (this.longueur != this.largeur);
         return "faux"
    }
    void afficherRetangle() {
        System.out.println("le perimetre is:" this.perimetre());
        System.out.println("l'Aire is :" this.Aire());
        System.out.println("l'isCrre is :" this.isCrre());
    }
}