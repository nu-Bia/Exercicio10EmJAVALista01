//10) Escreva um algoritmo para ler as dimens�es de um losango (diagonal maior, diagonal menor),
//calcular e escrever a �rea do losango. Dica a=D.d/2 

import java.util.Scanner;

public class Exercicio10 {
	
	
public static void main (String[]args) {

Scanner sc = new Scanner(System.in);

System.out.println("Digite o valor da diagonal maior");

int d1= sc.nextInt();

System.out.println("Digite o valor da diagonal menor");

int d2= sc.nextInt();

System.out.println ("A �rea do losango � de : " + d1 * d2/ 2); 

}
}
