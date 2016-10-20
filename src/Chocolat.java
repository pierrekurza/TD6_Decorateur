/**
 * Created by pierre on 10/10/16.
 */
public class Chocolat extends SupplementDecorateur{

    public Chocolat(Dessert d)
    {
        super.d = d;
    }

    public String getLibelle()
    {
        return d.getLibelle() + "Chocolat ";
    }

    @Override
    public double getPrix() {
        return d.getPrix() + 1.5;
    }
}
