public class Match
{
    Fighter F1;
    Fighter F2;
    int mimWeight;
    int maxWeight;
    double Random=Math.random()*100;


    Match(Fighter F1,Fighter F2,int minWeight, int maxWeight)
    {
        this.F1=F1;
        this.F2=F2;
        this.maxWeight=maxWeight;
        this.mimWeight=minWeight;

    }
     void Run()
    {
        if(isCheck())
        {
            while (F1.Health>0 && F2.Health>0)
            {
                System.out.println("======== Yeni Round =========");
                if(İsStar())
                {
                    F2.Health=this.F1.Hit(F2);
                    if(isWin())
                    {
                        break;
                    }
                    this.F1.Health=this.F2.Hit(F1);
                    if(isWin())
                    {
                        break;
                    }
                }
                else
                {
                    F1.Health=this.F2.Hit(F1);
                    if(isWin())
                    {
                        break;
                    }
                    this.F2.Health=this.F1.Hit(F2);
                    if(isWin())
                    {
                        break;
                    }
                }
                System.out.println("----------");
                System.out.println(this.F1.Name +" Saglık : " + this.F1.Health);
                System.out.println(this.F2.Name +" Saglık : " + this.F2.Health);
                System.out.println("----------");
            }
        }
        else
            System.out.println("Sporcuların Sikletleri Uymuyor");
    }
    boolean isCheck()
    {
        return ((this.F1.weight>=mimWeight && this.F2.weight>=mimWeight) && (this.F1.weight<=maxWeight && this.F2.weight<=maxWeight));
    }
    boolean isWin()
    {
        if(this.F1.Health==0)
        {
            System.out.println(F2.Name +" Kazandı");
            return true;
        }
        if(this.F2.Health==0)
        {
            System.out.println(F1.Name+" Kazandı");
            return true;
        }
        return false;
    }
     boolean İsStar()
    {
        if(Random<50)
        {
            return  true;
        }
        else
        {
            return  false;
        }

    }
}
