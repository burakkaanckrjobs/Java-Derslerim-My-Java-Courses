public class Fighter
{
    String Name;
    int damage;
    int Health;
    int weight;
    int dodge;

    Fighter(String Name,int Damage,int Health,int Weight,int dodge)
    {
        this.Name=Name;
        this.damage=Damage;
        this.Health=Health;
        this.weight=Weight;
        if(dodge>=0 && dodge <=100)
            this.dodge=dodge;
        else
            this.dodge=0;
    }
    int Hit(Fighter foe)
    {
        System.out.println(this.Name + " =>"+foe.Name +" "+this.damage +" " + "Hasar Vurdu");
        if(foe.isdodge())
        {
            System.out.println(foe.Name +" Gelen Hasarı Bloklado ");
            System.out.println("--------------");
            return foe.Health;
        }
        if(foe.Health-this.damage<0)
        {
            return 0;
        }
        return foe.Health-this.damage;
    }

    boolean isdodge()
    {
        double RandomNumber =Math.random()*100;
        return RandomNumber <= this.dodge;
    }

    boolean isDamage()
    {
        double RandomNumber =Math.random()*100;
        return RandomNumber<= this.dodge;
    }
}
