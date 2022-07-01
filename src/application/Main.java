package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import etities.Funcionario;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		
		System.out.println("quantos funcionarios voce deseja registrar: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("funcionario #"+ i + ":" );
			
			System.out.print("id: ");
			Integer id = sc.nextInt();
			System.out.print("nome: ");
			String nome = sc.next();
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();
			
			Funcionario funcionario = new Funcionario(id,nome,salario);
			list.add(funcionario);
			}
		
			System.out.println("qual id do funcionario que deseja aumentar o salario: ");
			int idsalario = sc.nextInt();
			
			Funcionario funcionario = list.stream().filter(x -> x.getId()== idsalario).findFirst().orElse(null);
			if(funcionario == null) {
				System.out.println("esse id nao existe");
			}else {
				System.out.println("digite a porcentagem do desconto:");
				double porcentagem = sc.nextDouble();
				funcionario.aumentarSalario(porcentagem);
			}
			System.out.println("");
			System.out.println("lista de funcionarios:");
			for (Funcionario e : list) {
				System.out.println(e);
			}
			
			
			
		
		sc.close();
	}
	
	
	}


