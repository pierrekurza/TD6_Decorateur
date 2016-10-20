/**
 * Created by pierre on 10/10/16.
 */
public class Sucre extends SupplementDecorateur {

    public Sucre(Dessert d)
    {
        super.d = d;
    }

    public String getLibelle()
    {
        return d.getLibelle() + "Sucre ";
    }

    public double getPrix()
    {
        return d.getPrix() + 0.5;
    }

}
