package baslangicJavaProjeleri;
import java.util.ArrayList;
import java.util.Scanner;
class Harff
{
	char harf;
	int adet=1;
	public Harff(char harf,int adet) 
	{
		this.harf=harf;
		this.adet=adet;
	}
}
public class KelimeIslem //kullan�c�n�n girece�i 
{
	public static void main(String[] args) 
	{
		Scanner oku = new Scanner(System.in);
		System.out.print("C�mlenizi Giriniz :");
		String Cumle = oku.nextLine();
		String CumleB=Cumle.toUpperCase();
		int KelimeSayisi=1;
		int BoslukSayisi=0;
		ArrayList<Harff> liste = new ArrayList<Harff>();
		char bosluk=' ';
		boolean degerVar=false;
		for (int i = 0; i < CumleB.length(); i++) 
		{
			degerVar=false;
			for (Harff harfler : liste) 
			{
				if(harfler.harf==CumleB.charAt(i))
				{
					harfler.adet++;
					degerVar=true;
				}
			}
			if (!degerVar) 
			{
				liste.add(new Harff(CumleB.charAt(i), 1) );
			}
			
			if(CumleB.charAt(i)==bosluk)
			{
				BoslukSayisi++;
				if((i+1)<CumleB.length())
				{
					if(CumleB.charAt(i+1)!=bosluk)
					{
						if(CumleB.charAt(0)!=bosluk)
						{
							KelimeSayisi++;
						}
					}
				}
			}
			//System.out.println(CumleB.charAt(i));
		}
		System.out.println("C�mle Uzunlu�u : "+(Cumle.length()-BoslukSayisi));
		System.out.println("Kelime Say�s� : "+KelimeSayisi);
		char enHarf = 0;
		String ENharf = null;
		int enHAarfSay=0;
		boolean harflermi=false;
		for (Harff harff : liste)
		{
			//System.out.println(harff.harf+" = "+harff.adet);
			if(enHAarfSay<harff.adet && harff.harf!=bosluk)
			{
				enHAarfSay=harff.adet;
				//enHarf=harff.harf;
				ENharf=String.valueOf(harff.harf);
				harflermi=false;
			}
			else if(enHAarfSay==harff.adet)
			{
				ENharf+=" , ";
				ENharf+=String.valueOf(harff.harf);
				harflermi=true;
			}
		}
		if (harflermi) 
		{
			System.out.println("En �ok Kullan�lan Harfler : "+enHAarfSay+ " kere '"+ENharf+"' harfleri kullan�lm��t�r");
		}
		else
		{
			System.out.println("En �ok Kullan�lan Harf : "+enHAarfSay+ " kere '"+ENharf+"' harfi kullan�lm��t�r");
		}
	}

}
