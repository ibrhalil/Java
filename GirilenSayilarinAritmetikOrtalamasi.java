package baslangicJavaProjeleri;

import java.util.Scanner;
public class GirilenSayilarinAritmetikOrtalamasi 
{
	public static void main(String[] args) 
	{
		Scanner oku = new Scanner(System.in);
		int toplam=0;
		double AO=0;
		int sayac=1;
		while(true)
		{
			System.out.print(sayac+". Say� Giriniz :");
			if(oku.hasNextInt())
			{
				toplam+=oku.nextInt();
				sayac++;
			}
			else
			{
				sayac--;
				break;
			}
		}
		AO = toplam/sayac;
		System.out.print(sayac+" Say�n�n Ortalamas� : "+AO);
	}
}
