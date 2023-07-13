public class Player
{
    public Player()
    {
        this.nName = "Inconnu";
        this.nLevel = 1;
        System.out.println(this.nName);
        System.out.println(this.nLevel);
    }

    public void attack()
    {
        System.out.println(this.nName + " attaque une cible !");
    }

    private String nName;
    private int nLevel
}