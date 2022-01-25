public class Car {

    //Nitelikler
    String Type;
    String Model;
    String Color;
    int speed;
    int speedLimit=100;


    Car(String Model, int Speed)
    {
       this.Model=Model;
       this.speed=Speed;
       this.Type="Sedan";
       this.speedLimit=180;
       this.Color="Red";
        printİnfo();
    }
    Car()
    {
        System.out.println("Boş Kurucu oluşturuldu");
    }

    void İncreaseSpeed(int increment)
    {
        if((speed+increment)<speedLimit)
        this.speed+=increment;
    }
    void DecreaseSpeed(int decrase)
    {
        if(speed>0)
            this.speed-=decrase;
    }
    void PrintSpeed()
    {
        System.out.println(Model +" Hızınız : "+speed);
    }
    void  printİnfo()
    {
        System.out.println("Model  \t:"+this.Model);
        System.out.println("Type   \t:"+this.Type);
        System.out.println("Color  \t:"+this.Color);
        System.out.println("Speed  \t:"+this.speed);
    }
}
