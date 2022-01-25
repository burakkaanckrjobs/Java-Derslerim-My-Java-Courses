public class Course
{
    //Nitelikler
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int viva;

    Course(String name,String code,String prefix,Teacher t1)
        {
            this.name=name;
            this.code=code;
            this.prefix=prefix;
            this.teacher=t1;
            this.note=0;
            this.viva=0;
        }

    void printTeacherİnfo()
    {
        System.out.println("Dersin Adı    \t:"+this.name);
        System.out.println("Dersin Code   \t:"+this.code);
        System.out.println("Dersin Önek \t:"+this.prefix);
        System.out.println("");
        this.teacher.print();
    }
    void addTeacher(Teacher teacher)
    {
        if(teacher.Brach.equals(this.prefix))
        {
            this.teacher=teacher;
            printTeacherİnfo();
        }
        else
            System.out.println("Ögretmen ve Ders Bölümleri Uyuşmuyor");
    }
}
