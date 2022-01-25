public class Teacher
{
    String Name;//Adı
    String Mpno;//Telefonu
    String Brach;//Bölümü

    Teacher(String Name,String Brach, String Mpno)
    {
        this.Name=Name;
        this.Brach=Brach;
        this.Mpno=Mpno;
    }

    void print()
    {
        System.out.println("Adı       \t:"+this.Name);
        System.out.println("Telefonu  \t:"+this.Mpno);
        System.out.println("Bölümü    \t:"+this.Brach);
    }
}
