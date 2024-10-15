package fag;

import java.util.Scanner;

public class CadastroDeProdutos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Produto produto = new Produto();
		Scanner scan = new Scanner(System.in);
		int opcao= 0;
		
		System.out.println("1- Cadastrar novo produto 2- Visualizar Produto Cadastrado 3- Sair");
		opcao= scan.nextInt();
		
		
		while(opcao != 3) 
		{
			switch (opcao) 
			{
			
			case 1:{
				
				String nome;
				double preco;
				int quantidade;
				
				System.out.println("Nome do produto");
				nome = scan.next();
				System.out.println("Quantidade do produto");
				quantidade = scan.nextInt();
				System.out.println("Valor do produto");
				preco = scan.nextDouble();
				
				produto.Cadastrar(new Produto(nome,preco,quantidade));
				
				break;
			}
			
			case 2:
			{
				produto.Listar();
				
				break;
				
			}
			
			case 3:
			{
				
				System.out.println("Sistema Finalizado");
				break;
				
			}
			
			}
			
			System.out.println("1- Cadastrar novo produto 2- Visualizar Produto Cadastrado 3- Sair");
			opcao= scan.nextInt();
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
