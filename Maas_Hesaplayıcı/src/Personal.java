public class Personal {

    String Name; //Çalışanın adı ve soyadı
    double salary; //Çalışanın maaşı
    int workHours;//Haftalık çalışma saati
    int hireYear;//İşe başlangıç yıl


     Personal(String Name, int salary, int workHours, int hireYear)
     {
         this.Name=Name;
         this.salary =salary;
         this.hireYear=hireYear;
         this.workHours=workHours;
     }
      double tax(double salary )
     {
         this.salary =salary;
         double Tax;
        if(salary<1000)
        {
            return 0.0;
        }
        else
        {
            Tax=salary*0.03;

            return Tax;
        }
     }
     int bonus(int workHours)
     {
         this.workHours=workHours;
         int Overtime;
         if(workHours>40)
         {
            Overtime=30*(workHours-40);
            return Overtime;
         }
         else
         {
             return 0;
         }
     }
     double raiseSalary(int hireYear,double salary)
     {
         this.salary =salary;
         this.hireYear=hireYear;
         int temp;
         double TempSalary;
         int date = 2021;
         temp=date-hireYear;
         TempSalary=salary;
         if(temp<10)
         {
             TempSalary=salary*0.05;
             return TempSalary;
         }
         else if(temp>9 && temp<20)
         {
             TempSalary=salary*0.1;
             return TempSalary;
         }
         else
         {
             TempSalary=salary*0.15;
             return TempSalary;
         }
     }
     public void Tostring()
    {
        double TempSalary;
        double NewSalary;
        double tax;
        double raiseSalary;
        double bonus;

        TempSalary=(this.salary+bonus(this.workHours))-tax(this.salary);
        tax=tax(this.salary);
        raiseSalary=raiseSalary(this.hireYear,this.salary);
        bonus=bonus(this.workHours);
        NewSalary=TempSalary+raiseSalary;
        System.out.println("==========================================");
        System.out.println("Adı : "+this.Name+" \nMaaşı : "+this.salary
                          +"\nÇalışma Saati : "+this.workHours
                          +"\nBaşlangıç Yılı : " +this.hireYear
                          +"\nVergi :"+tax
                          +"\n Bonus : "+bonus
                          +"\nMaaş Artışı :"+raiseSalary
                          +"\nVergi ve Bonuslar ile birlikte maaş :"+TempSalary
                          +"\nToplam Maaş :"+NewSalary);
    }
}
