package baslangicJavaProjeleri;

import java.util.Scanner;

public class UcgenOlabilmeDurumunuKontrolEtme 
{
	public static void main(String[] args)
	{
		Scanner oku = new Scanner(System.in);
		System.out.println("��gen Olma Durumunu Kontrol Etme");
		System.out.print("Kenar Uzunlu�u :");
		int kenar1 = oku.nextInt();
		System.out.print("Kenar Uzunlu�u :");
		int kenar2 = oku.nextInt();
		System.out.print("Kenar Uzunlu�u :");
		int kenar3 = oku.nextInt();
		if(OlmaDurumu(kenar1,kenar2,kenar3))
		{
			if((kenar1*kenar1)+(kenar2*kenar2)==kenar3*kenar3 || (kenar1*kenar1)+(kenar3*kenar3)==kenar2*kenar2 || (kenar3*kenar3)+(kenar2*kenar2)==kenar1*kenar1)
			{
				System.out.println("Dik Kenar ��gendir.");
			}
			if(kenar1==kenar2 || kenar1==kenar3 || kenar2==kenar3)
			{
				System.out.println("ikiz Kenar ��gendir.");
			}
			else if(kenar1==kenar2 && kenar1==kenar3)
			{
				System.out.println("E� Kenar ��gendir.");
			}
			else
			{
				System.out.println("�e�it Kenar ��gendir.");
			}
		}
		else
		{
			System.out.println("Verilen Kenar Uzunluklar�yla Bir ��gen Cizilemez...");
		}
	}
	private static boolean OlmaDurumu(int k1, int k2, int k3) 
	{
		if(k1+k2>k3)
			if(k1+k3>k2)
				if(k2+k3>k1)
					return true;
		return false;
	}
}
