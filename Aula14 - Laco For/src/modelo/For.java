package modelo;

	import java.util.Random;
	import java.util.Scanner;

	public class For {
		public static Scanner  scan;
		public static void main(String[] args) {
		scan = new Scanner(System.in);
		 int menu = 0;
		 
		  while (menu!=4) {
			  System.out.print("1- N�meros Pares\n2- N�meros Impares\n3- Maior/Menor\n4-Fatorial\n5-Xerox\n6-Soma");
			  menu = scan.nextInt();
			  switch(menu) {
			  
			  case 1:
				  par();
				  	break;
				  	
			  case 2:
				 impar();
				  break;
				  
			  case 3:
				MaiorMenor();
				  break;
				  
			  case 4: 
				  fatorial();
				   break;
			  case 5:
				  tabela();
				  	break;
				  	
				  case 6:
					 soma();
					  break;
					  
				default :
					System.out.println("Op��o Inv�lida");
					break;
			  }
		   }
		}
		
		
		//1 - Utilizando apenas o for, imprima os n�meros pares entre dois valores informados pelo usu�rio.
		public static void par() {
				System.out.println("----------------------");
				System.out.println("Digite dois n�meros: ");
				int v1= scan.nextInt();
				int v2= scan.nextInt();
				System.out.println("----------------------");
			int y = v1;
				if (y%2 !=0) {
				 y++;
			
				 	for(int i = y; i <= v2; i+=2) {
					 System.out.println(i);
				 	}  
				 
				}else {
					for(int i = y; i <= v2; i+=2) {
					 System.out.println(i);
					}
				}
			}



	//2 - Utilizando apenas o for, imprima os n�meros �mpares entre dois valores informados pelo usu�rio.
	public static void impar() {
		System.out.println("----------------------");
		System.out.println("Digite dois n�meros: ");
		int v1= scan.nextInt();
		int v2= scan.nextInt();
		int y = v1;
		
			if(y%2 ==0) {
				y++;
				
				 for(int i = y; i <= v1; i+=2) {
					 System.out.println(i);
				 }
				
			}else {
				 for(int i = y; i <= v2; i+=2) {
					 System.out.println(i);
				 }
			}
	}

	
	//3  Desenvolva um algoritmo que leia 10 valores e mostre o maior e o menor.
	public static void MaiorMenor() {
		Random  rand = new Random();
		int Maior=0;
		int Menor=100;
		int v1;
		
			for(int i = 0; i<10;i++) {
				v1 = rand.nextInt(10);
					System.out.print(v1 + "\t");
			
					if (v1>Maior) {
						Maior=v1;
					}
			
					if (v1<Menor) {
				Menor=v1;
					}
			
			}
				System.out.println();
				System.out.println("Maior: " + Maior);
				System.out.println("Menor: " + Menor);
	}
	

	//4 Leia um valor do usu�rio e calcule seu fatorial.
	public static void fatorial() {
		System.out.println("Digite um valor: ");
		int v = scan.nextInt();
		int f=1;
		
			for( int i = v; i > 0; i-- ) {
				f = f * i;
					System.out.println(i+ " ");
			} 
				System.out.printf("O fatorial do valor digitado �: %d", f);	
	}
	
	

	//5 Leia do usu�rio o valor do xerex e mostre uma tabela em que o n�mero apare�a multiplicado at� 200,
	//sendo 10 em cada linha.
	//Esta tabela � �til para deixar afixada em lojas de Xerox, por exemplo.
	//Valor do Xerox: R$ 0,06
	//1 = 0,06 2= 0,12 3=0,18 .......... 10= 0,60
	//11 = 0,66 ........
	//191=11,46 ....................... 200=12,00

	public static void tabela() {
		System.out.println("Digite o valor do xerox: R$ ");
		double x = scan.nextDouble();
		
		int con = 0;
			for (int i = 1; i <=200;i++) {
				System.out.printf("%d = %.2f%n",i,(x*i));
				con++;
				if(con == 10){
					cont=0;
					System.out.println();
					
					
			}	
			
	}
	

	//6 - Receba dois valores do usu�rio e mostre a soma dos pares e �mpares entre esse intervalo.
	public static void  soma() {
		System.out.println("Digite dois valores: ");
		int v1= scan.nextInt();
		int v2=scan.nextInt();
		int soma = 0;
		int soma1 = 0;
			//Par
				for(int i = v1;i<=v2;i+=2 ) {
					if(i%2==0) {
						soma = soma + i;	
					}
				}
					System.out.println("A soma dos pares �: " +soma);
					
					for(int j = v1;j<=v2;j++ ) {
						if(j%2!=0) {
							soma1 = soma1 + j;		
						}
					}

	System.out.println("A soma dos impares �: " +soma1);
	System.out.println("-----------------------------");
			

	}
}



