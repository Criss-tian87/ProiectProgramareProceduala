package main;

public class Asignare {

		public static void main(String[] args){
/*			int a=3;
			int b = (a=2) *a;
			int c = b* (b=5);
				System.out.println("a=" + a +", b=" + b + ", c=" + c);
				adaug in comment deoarece am aceeasi variabile la exercitii
*/	
			
				
				
//********************Tema 1*********************************
				/*
		- la executie se afiseaza a=2, b=5, c=20 deoarece:
"a" se defineste a doua oara ca avand valoarea "2" fata de "int a=3"
"b" se defineste din nou cu valoarea 5 fata de "int b = (a=2) *a;"
"c" are valoarea "20" deoarece se calculeaza primul b: "b = (a=2) *a", care e 4 x 4 = 20; 
				*/
			
//***********************************************************

				
//********************Tema 2*********************************
				/*
			{
double d = 2.95;
int i = 4;
System.out.println(++d>i?d:i);

// se incrementeaza data "double" incepand de la 2.95 pana la 4, se afiseaza 4.0 pt ca e double

			}				

				*/
//***********************************************************
		
				
//********************Tema 3*********************************			
			/*
{
int a = 3;
if (++a < 4)
	if (a++ < 4)
			System.out.println(a);
else
	System.out.println(a);
					
nu se poate afisa nimic deoarece "a" este incrementat la valoarea "4" in prima functie "if", 
iar la al doilea "if" nu este indeplinita conditia deoarece "4" nu este mai mic decat "4"  
 	
				}
		
		
		{	
			*/

				
//********************Tema 4*********************************			
			/*
{
int suma = 0;
for(int i = 1;i < 10; i++){

suma += suma + i;
/*
System.out.println("i este: " + i);

System.out.println("Suma este: " + suma);

}

System.out.println("Suma este: " + suma);					



//avem rezultatul de 1013 deoarece suma este incrementata de 2 ori: 
// 	suma = 0 + (0 + 1) = 1
// 	suma = 1 + (1 + 2) = 4	
 		
			
}
		*/	
//***********************************************************

//********************Tema 5*********************************	
			/*			
		{
int n = 1;
for(int i = 1;i < 13; ++i){

n = n * i;
}
System.out.println("N! este: " + n);		
							
		}
		
			 */	
//***********************************************************

//********************Tema 6*********************************			
		
		
		
	}
		}

