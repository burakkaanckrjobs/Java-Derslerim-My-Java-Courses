public class Main
{
    public static void main(String[] args) {

        Teacher t1= new Teacher("Mahmut Hoca","TRH","+543 000 00 00");
        Teacher t2= new Teacher("Fatih Hoca","FZK","+547 000 00 00");
        Teacher t3= new Teacher("Külyutmaz Hoca","BIO","+546 000 00 00");

        Course  Tarih = new Course("Tarih","101","TRH",t1);
        Course  Fizik = new Course("Fizik","101","FZK",t2);
        Course  BİYO = new Course("Bioloji","101","BIO",t3);

        Student s1=new Student("İnek Şaban","123","4",Tarih,Fizik,BİYO);
        s1.addBulkExamNote(100,50,25);
        s1.addBulkExamviva1(100,50,60);
        s1.isPass();
        Student s2=new Student("Güdük Necmi","444","4",Tarih,Fizik,BİYO);
        s2.addBulkExamNote(100,200,10);
        s1.addBulkExamviva1(25,200,50);
        s2.isPass();
    }
}
