package baslangicJavaProjeleri;

import java.util.Scanner;													
public class GirilenSayiyaKadarToplamlari 
{
	public static void main(String[] args) 
	{
		Scanner oku = new Scanner(System.in);								
		System.out.print("Say� Giriniz :");									
		int GirilenSayi = oku.nextInt();									
		int ToplamTut = 0;													
		for (int i = 0; i <= GirilenSayi; i++) 								
		{
			ToplamTut+=i;													
		}
		System.out.print("Girilen Say�ya Kadar Toplamlar� : "+ ToplamTut);	
	}
}
