package fag;

import java.util.ArrayList;
import java.util.List;

public class Produto {

	String nome;
	double preco;
	int quantidade;
	
	
	
	List<Produto> ListaDeProdutos = new ArrayList();	
	
	
	public void Cadastrar(Produto produto) 
	{
		ListaDeProdutos.add(produto);
	}
	
	
	public void Listar() 
	{
		for (Produto produto : ListaDeProdutos) {
			System.out.println(produto.toString());
		}
		
	}
	
	
	
		public Produto() {
		
	}
	
	public Produto(String nome, double preco, int quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}
	
	
	
}
