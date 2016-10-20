/**
 * Created by pierre on 10/10/16.
 */
public abstract class Dessert {

    private String libelle;
    private double prix;

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public static boolean estAuChocolat(Dessert d)
    {
        if(d instanceof Chocolat)
            return true;
        if(!(d instanceof SupplementDecorateur))
            return false;
        else
            return estAuChocolat(((SupplementDecorateur)d).d);
    }
}
