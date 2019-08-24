package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Set<Cursos> c1 = new HashSet<>();
		Set<Cursos> c2 = new HashSet<>();
		Set<Cursos> c3 = new HashSet<>();
			
		System.out.println("Entre quantos alunos tem no curso 1");
		int n = scan.nextInt();
		for(int i = 0 ; i<n ; i++) {
			System.out.print("Digite o cod do aluno: ");
			int cod = scan.nextInt();
			Cursos a = new Cursos(cod);
			c1.add(a);	 // adicionei o curso intanciado a variavel set c1		
		}
		
		System.out.println("Entre quantos alunos tem no curso 2");
		n = scan.nextInt();
		for(int i = 0 ; i<n ; i++) {
			System.out.print("Digite o cod do aluno: ");
			int cod = scan.nextInt();
			Cursos b = new Cursos(cod);
			c2.add(b);
			
		}
		
		System.out.println("Entre quantos alunos tem no curso 3");
		n = scan.nextInt();
		for(int i = 0 ; i<n ; i++) {
			System.out.print("Digite o cod do aluno: ");
			int cod = scan.nextInt();
			Cursos c = new Cursos(cod);
			c3.add(c);
			
		}
		
		Set<Cursos> total = new HashSet<>(c1);
		total.addAll(c2);  // adiciona elementos do c2 a c1
		total.addAll(c3); // adiciona elementos de c3 ao conj formado por c1 e c2
		
		System.out.println("Total de alunos: "+ total.size());  // como a uniao e feita apenas de elmentos diferentes o tamanho do conjunto total sea a qtd de alunos diferentes
		
		scan.close();
	}

}
