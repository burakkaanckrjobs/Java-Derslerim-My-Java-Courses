public class Student
{
    Course c1;
    Course c2;
    Course c3;


    String name;
    String stuNo;
    String classes;
    double avarge;
    boolean isPass; // Geçtimi Kaldı mı ?


    Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3)
    {
        this.name = name;
        this.stuNo= stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarge=0.0;
        this.isPass=false;
    }

    void addBulkExamNote(int note1,int note2,int note3)
    {
        if(note1>=0 && note1<=100)
        c1.note=note1;
        if(note2>=0 && note2<=100)
        c2.note=note2;
        if(note3>=0 && note3<=100)
        c3.note=note3;
    }
    void addBulkExamviva1(int viva1,int viva2,int viva3)
    {
        if(viva1>=0 && viva1<=100)
            c1.viva=viva1;
        if(viva2>=0 && viva2<=100)
            c2.viva=viva2;
        if(viva3>=0 && viva3<=100)
            c3.viva=viva3;
    }
    void  PrintNote()
    {
        System.out.println(c1.name+ " Notu   \t:"+c1.note);
        System.out.println(c2.name+ " Notu   \t:"+c2.note);
        System.out.println(c3.name+ " Notu   \t:"+c3.note);
        System.out.println(" Ortalama  \t:"+this.avarge);
    }
    void  isPass()
    {
        System.out.println("============================");
        this.avarge = ((this.c1.note*0.8+this.c1.viva*0.2)
                + this.c2.note*0.8+this.c2.viva*0.2
                + this.c3.note*0.8+this.c3.viva*0.2) / 3.0;

        if(this.avarge>55&& this.avarge<=100)
        {
            System.out.println("Hababam Sınıfı Uyanıyor !");
            this.isPass = true;
        }

        else {
            System.out.println("Hababam Sınıfı Sınıfta Kaldı");
            this.isPass = false;
        }

        PrintNote();
    }

    void  Avarge()
    {

    }

}
