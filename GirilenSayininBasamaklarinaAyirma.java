package baslangicJavaProjeleri;

import java.util.Scanner;

public class GirilenSayininBasamaklarinaAyirma 
{
	public static void main(String[] args) 
	{
		Scanner oku = new Scanner(System.in);
		System.out.print("Sayi Giriniz : ");
		int sayi = oku.nextInt();
		int sayiC = sayi;
		int basamak = 0;
		while(sayiC>=1)
		{
			sayiC/=10;
			basamak++;
		}
		System.out.println("Basamak Say�s� : "+basamak);
		for (int i = 0; i < basamak; i++)	//basamak bulma i�leminde de yapabilirdik ama her zaman do�ru �al��mayabilir.
		{
			System.out.println(sayi%10);	//girilmi� olan say�y� tersten yazd�rm�� oluruz.
			sayi/=10;
		}
	}
}
