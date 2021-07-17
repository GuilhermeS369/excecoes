package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] vect = sc.nextLine().split(" ");
		//CRIEI UM VETOR QUE VAI LER CADA PALAVRA APÓS UM ESPAÇO EM BRANCO
		int position = sc.nextInt();
		System.out.println(vect[position]);
		//O VETOR VAI EXIBIR OQ TEM NAQUELA POSITION Q DEFINI COM O NEXT INT
		
		
		sc.close();
		
	}

}
