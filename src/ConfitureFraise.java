/**
 * Created by pierre on 10/10/16.
 */
public class ConfitureFraise extends SupplementDecorateur {

    public ConfitureFraise(Dessert d)
    {
        super.d = d;
    }

    public String getLibelle()
    {
        return d.getLibelle() + "Fraise ";
    }

    public double getPrix()
    {
        return d.getPrix() + 0.7;
    }


}
