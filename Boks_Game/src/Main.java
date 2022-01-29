public class Main {
    public static void main(String[] args)
    {
        Fighter f1 = new Fighter("Burak",10,150,100,30);
        Fighter f2 = new Fighter("Tarık",20,85,85,40);

        Match match = new Match(f1,f2,85,100);
        match.Run();
    }

}
