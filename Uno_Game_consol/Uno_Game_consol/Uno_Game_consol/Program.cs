using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;

namespace Uno_Game_consol
{
   public class Program
    {
       
        static void Main(string[] args)
        {
            #region Diziler
            string[] Kart_Renkleri = { "S", "K", "M" };
            int[] Kart_Degerleri = { 1, 2, 3, 4, 5 };
            ArrayList oyuncu_1 = new ArrayList();
            ArrayList oyuncu_2 = new ArrayList();
            ArrayList oyuncu_3 = new ArrayList();
            ArrayList Deste = new ArrayList();
            #endregion
            Deste.Add("RD1");
            Deste.Add("RD2");
            Deste.Add("RD3");
            #region Değişkenler
            int i = 3, Rnd;
            int A_1 = 0,A_2=0,A_3=0,kart_sayısı=0;
            string ortada =" ",At,PC,A,Renk_degisme;
            #endregion
            Random Deste_Dagıtma = new Random();
            Random kart = new Random();
            Random Renk_Degis = new Random();
            //  Deste Oluşturma
            for (int j = 0; j < Kart_Renkleri.Length; j++)
            {
                for (int a = 0; a < Kart_Degerleri.Length; a++)
                {
                    Deste.Add(Kart_Renkleri[j] + Kart_Degerleri[a]);
                    i++;
                }
            }

            #region 1. Oyuncu Destesi
            
            while (A_1 < 6)
                {
                Rnd = Deste_Dagıtma.Next(Deste.Count);
                oyuncu_1.Add(Deste[Rnd].ToString());
                A_1++;
                Deste.RemoveAt(Rnd);
                }
            #endregion

            #region 2.Oyuncu Destesi
            while (A_2 < 6)
            {
                Rnd = Deste_Dagıtma.Next(Deste.Count);
                oyuncu_2.Add(Deste[Rnd].ToString());
                A_2++;
                Deste.RemoveAt(Rnd);
            }
            #endregion

            #region 3.Oyuncu Destesi
            while (A_3 < 6)
            {
                Rnd = Deste_Dagıtma.Next(Deste.Count);
                oyuncu_3.Add(Deste[Rnd].ToString());
                A_3++;
                Deste.RemoveAt(Rnd);
            }
            #endregion

            #region Oyun
            Console.Write("Desteniz : ");
            for (int a = 0; a < oyuncu_1.Count; a++)
            {
                Console.Write(" " + oyuncu_1[a]);
            }
            Console.WriteLine();
            Console.WriteLine("---------------------------------");
            Console.WriteLine("Oyun Başlıyor");
            Console.WriteLine("---------------------------------");
            Console.WriteLine();
            Console.WriteLine("Ortada :" + ortada);
            Console.WriteLine();

            Sıra1:
            #region 1.oyuncu
            if (oyuncu_1.Count == 0)
            {
                Console.WriteLine();
                Console.WriteLine("1.Oyuncu Kazandı");
                goto Bitis;
            }
            else
            {
                Console.Write("Kartınızı Seçiniz");
                for (int a = 0; a < oyuncu_1.Count; a++)
                {
                    Console.Write(" " + oyuncu_1[a]);
                }
                Console.WriteLine();
                At = Console.ReadLine();
            }
            #endregion

            #region Başlangıç
            if (ortada ==" ")
            {
                if (At == "RD1" || At == "RD2" || At == "RD3")
                {
                    Console.WriteLine("RD ile Oyuna Başlıyamazsınız");
                    goto Sıra1;
                }
                else
                {
                    ortada = At;

                }
            }
            else
            {
                if (oyuncu_1.Contains(At))
                {
                    if (At == "PAS")
                    {
                        goto sıra2;
                    }
                    else
                    {
                        A = ortada.Substring(1, 1);
                        #region Kart Rengi karşılaştırma
                        if (At.Substring(0, 1) == "R")
                          {
                                Console.WriteLine("Hangi Renk Olsun ? (S/K/M)");
                                Console.WriteLine();
                                Renk_degisme = Console.ReadLine();
                                ortada = Renk_degisme + A;
                                Console.WriteLine("Ortada :" + ortada);
                                oyuncu_1.Remove(At);

                                goto sıra2;
                          }
                        switch (ortada.Substring(0, 1))
                            {
                                case "S":
                                    if (At.Substring(0, 1) == "S" || At.Substring(1, 1) == Convert.ToString(A))
                                    {
                                        ortada = At;
                                        oyuncu_1.Remove(At);
                                        Console.WriteLine("Ortada :" + ortada);
                                        goto sıra2;
                                    }
                                    else
                                    {
                                    Console.WriteLine("Geçerili Kart Degil");
                                        goto Sıra1;
                                    }
                                case "K":
                                    if (At.Substring(0, 1) == "K" || At.Substring(1, 1) == Convert.ToString(A))
                                    {
                                        ortada = At;
                                        oyuncu_1.Remove(At);
                                        Console.WriteLine("Ortada :" + ortada);
                                        goto sıra2;
                                    }
                                    else
                                    {
                                    Console.WriteLine("Geçerili Kart Degil");
                                    goto Sıra1;
                                    }
                                case "M":
                                    if (At.Substring(0, 1) == "M" || At.Substring(1, 1) == Convert.ToString(A))
                                    {
                                        ortada = At;
                                        oyuncu_1.Remove(At);
                                        Console.WriteLine("Ortada :" + ortada);
                                        goto sıra2;
                                    }
                                    else
                                    {
                                    Console.WriteLine("Geçerili Kart Degil");
                                    goto Sıra1;
                                    }
                            }
                            #endregion
                    }
                }
            }
            #endregion

            if (At == "PAS" || At == "pas")
            {
                goto sıra2;
            }
            else
            {
                if (oyuncu_1.Contains(At))
                {
                    oyuncu_1.Remove(At);
                    goto sıra2;
                }
                else
                {
                    Console.WriteLine("Boyle Bir Kartınız yok");
                    goto Sıra1;
                }
            }
            sıra2:
            #region 2.oyuncu
            if (oyuncu_2.Count == 0)
            {
                Console.WriteLine("2.Oyuncu Kazandı");
                goto Bitis;
            }
            else
            {
                Console.WriteLine("2.Oyunucu Oynuyor...");
                don:
                PC = oyuncu_2[kart.Next(oyuncu_2.Count)].ToString();
                #region Kart Rengi ve sayı Karşılaştırma
                if (oyuncu_2.Contains(PC))
                {
                    if (kart_sayısı < oyuncu_2.Count)
                    {
                        if (PC == "PAS")
                        {
                            Console.WriteLine("2.oyuncu Pas Geçti");
                            Console.WriteLine("Ortada :" + ortada);
                            goto sıra3;
                        }
                        else
                        {
                            A = ortada.Substring(1, 1);
                            #region Kart Rengi karşılaştırma

                            if (PC.Substring(0, 1) == "R")
                            {
                                PC = Kart_Renkleri[Renk_Degis.Next(Kart_Renkleri.Length)] + A;

                                Console.WriteLine("Ortada :" + ortada);
                                oyuncu_3.Remove(PC);
                                goto sıra3;
                            }
                            switch (ortada.Substring(0, 1))
                            {
                                case "S":
                                    if (PC.Substring(0, 1) == "S" || PC.Substring(1, 1) == Convert.ToString(A))
                                    {
                                        ortada = PC;
                                        oyuncu_2.Remove(PC);
                                        Console.WriteLine("Ortada :" + ortada);
                                        goto sıra3;
                                    }
                                    else
                                    {
                                        kart_sayısı++;
                                        goto don;
                                    }
                                case "K":
                                    if (PC.Substring(0, 1) == "K" || PC.Substring(1, 1) == Convert.ToString(A))
                                    {
                                        ortada = PC;
                                        oyuncu_2.Remove(PC);
                                        Console.WriteLine("Ortada :" + ortada);
                                        goto sıra3;
                                    }
                                    else
                                    {
                                        kart_sayısı++;
                                        goto don;
                                    }
                                case "M":
                                    if (PC.Substring(0, 1) == "M" || PC.Substring(1, 1) == Convert.ToString(A))
                                    {
                                        ortada = PC;
                                        oyuncu_2.Remove(PC);
                                        Console.WriteLine("Ortada :" + ortada);
                                        goto sıra3;
                                    }
                                    else
                                    {
                                        kart_sayısı++;
                                        goto don;
                                    }
                            }
                            #endregion
                        }
                    }
                    else
                    {
                        kart_sayısı++;
                        goto sıra3;

                    }
                }
                #endregion
            }

            #endregion
            sıra3:
            #region 3.oyuncu
            if (oyuncu_3.Count == 0)
            {
                Console.WriteLine("3.Oyuncu Kazandı");
                goto Bitis;
            }
            else
            {
                Console.WriteLine("3.Oyunucu Oynuyor...");
                oyuncu_3.Add("PAS");
                Don1:
                kart_sayısı = 0;
                PC = oyuncu_3[kart.Next(oyuncu_3.Count)].ToString();
                #region Kart Rengi ve sayı Karşılaştırma
                if (oyuncu_3.Contains(PC))
                {
                    if (kart_sayısı < oyuncu_3.Count)
                    {

                        if (PC == "PAS")
                        {
                            Console.WriteLine("3.oyuncu Pas Geçti");
                            Console.WriteLine("Ortada :" + ortada);
                            goto Sıra1;
                        }
                        else
                        {
                            A = ortada.Substring(1, 1);
                            if (PC.Substring(0, 1) == "R")
                            {
                                PC = Kart_Renkleri[Renk_Degis.Next(Kart_Renkleri.Length)] + A;

                                Console.WriteLine("Ortada :" + ortada);
                                oyuncu_3.Remove(PC);
                                goto Sıra1;
                            }
                            switch (ortada.Substring(0, 1))
                            {
                                case "S":
                                    if (PC.Substring(0, 1) == "S" || PC.Substring(1, 1) == Convert.ToString(A))
                                    {
                                        ortada = PC;
                                        Console.WriteLine("Ortada :" + ortada);
                                        oyuncu_3.Remove(PC);
                                        goto Sıra1;
                                    }
                                    else
                                    {
                                        kart_sayısı++;
                                        goto Don1;
                                    }
                                case "K":
                                    if (PC.Substring(0, 1) == "K" || PC.Substring(1, 1) == Convert.ToString(A))
                                    {
                                        ortada = PC;
                                        Console.WriteLine("Ortada :" + ortada);
                                        oyuncu_3.Remove(PC);
                                        goto Sıra1;
                                    }
                                    else
                                    {
                                        kart_sayısı++;
                                        goto Don1;
                                    }
                                case "M":
                                    if (PC.Substring(0, 1) == "M" || PC.Substring(1, 1) == Convert.ToString(A))
                                    {
                                        ortada = PC;
                                        Console.WriteLine("Ortada :" + ortada);
                                        oyuncu_3.Remove(PC);
                                        goto Sıra1;
                                    }
                                    else
                                    {
                                        kart_sayısı++;
                                        goto Don1;
                                    }
                                case "R":
                                    if (PC.Substring(0, 1) == "R")
                                    {

                                        PC = Kart_Renkleri[Renk_Degis.Next(Kart_Renkleri.Length)] + A;

                                        Console.WriteLine("Ortada :" + ortada);
                                        oyuncu_3.Remove(PC);
                                        goto Sıra1;
                                    }
                                    else
                                    {
                                        kart_sayısı++;
                                        goto Don1;
                                    }
                            }

                        }
                    }
                    else
                    {
                        kart_sayısı++;
                        goto Sıra1;
                    }

                }
                #endregion
            }
            #endregion
            Bitis:
            Console.WriteLine();
            Console.WriteLine("---------------------------------");
            Console.WriteLine("Oyun Bitmiştir");
            Console.WriteLine("---------------------------------");
            Console.ReadKey();
            #endregion
        }
    }
}