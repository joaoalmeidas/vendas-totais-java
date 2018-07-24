
public class Vendedor {
	
	private int numero;
	private String nome;
	
	public Vendedor(int numero, String nome) {
		super();
		this.numero = numero;
		this.nome = nome;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double venderProduto(Produto p){
		double preco;
		
		preco = p.getValor();
		
		return preco;
	}

}
