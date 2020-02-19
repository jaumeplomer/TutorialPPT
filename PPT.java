import java.util.Scanner;

public class PPT
{
	public static int tiradaMaquina;
	public static int tiradaUsuari;

	public static void joc()
	{
		switch(tiradaMaquina)
		{
			case 1:
				System.out.println("Pedra");
				switch(tiradaUsuari)
				{
					case 1: System.out.println("Empat!"); break;
					case 2: System.out.println("Guanyes!"); break;
					case 3: System.out.println("Perds!"); break;
				}
				break;

			case 2:
				System.out.println("Paper");
				switch(tiradaUsuari)
				{
					case 1: System.out.println("Perds!"); break;
					case 2: System.out.println("Empat!"); break;
					case 3: System.out.println("Guanyes!"); break;
				}
				break;

			case 3:
				System.out.println("Tissores");
				switch(tiradaUsuari)
				{
					case 1: System.out.println("Guanyes!"); break;
					case 2: System.out.println("Perds!"); break;
					case 3: System.out.println("Empat!"); break;
				}
				break;
		}
	}
	public static void main(String[] args)
	{	
		System.out.println("Aquest es el joc de pedra-paper-tissores");
		Scanner teclat = new Scanner(System.in);
/*----------------------------------------------------*/
		tiradaMaquina = (int)(Math.random() * 3) + 1;
		System.out.println("La maquina ja ha triat, i t eguanyara");
/*------------------------------------------------------*/
		System.out.println("Tria: [1=Pedra, 2=Paper, 3=Tissores]: ");
		tiradaUsuari = teclat.nextInt();

		System.out.println("La maquina havia triat: ");
		joc();
	}
}