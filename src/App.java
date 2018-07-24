import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[][] vendas = new double[5][4];
		int produto, vendedor, opcao;
		double valor;
		
		for(int dia = 1; dia <= 2; dia++){
			
			do{
				System.out.println("Cadastro de Vendas.\n");
				System.out.printf("Dia %d\n", dia);
				System.out.printf("Aperte a tecla correspondente com a opção desejada:\n"
								+ "1 - Cadastrar Venda\n"
								+ "2 - Fechar vendas do dia\n");
				
				opcao = input.nextInt();
				
				switch(opcao){
				case 1:
					System.out.printf("Insira o número do vendedor:");
					do{
						vendedor = input.nextInt();
					}while(vendedor < 1 || vendedor > 4);
					
					System.out.printf("Insira o número do produto:");
					do{
						produto = input.nextInt();
					}while(produto < 1 || produto > 5);
					
					System.out.printf("Insira o valor total dos produtos vendido por esse vendedor:");
					valor = input.nextDouble();
					
					passaNota(vendedor-1, produto-1, valor, vendas);
					
					break;
					
				case 2:
					break;
				default:
					System.out.println("Valor inválido, escolha novamente a opção.\n");
				}
			
			}while(opcao != 2);
		}
		
		exibeTabela(vendas);
		
		
	}
	
	public static void passaNota(int vendedor, int produto, double valor, double[][] vendas){
		
		vendas[produto][vendedor] = valor;
		
	}
	
	public static void exibeTabela(double[][] vendas){
		
		double[] somaProduto = new double[5];
		double[] somaVendedor = new double[4];
		
		System.out.printf("\tVend. 1\tVend. 2\tVend. 3\tVend. 4\tTotal\n");
		
		for(int i = 0; i < vendas[0].length; i++){
			
			
			
			System.out.printf("Prod %d", i+1);
			for(int j = 0; j < vendas.length; j++){
				if(j == vendas[0].length){
					System.out.printf("\t%.2f", somaProduto[i]);
				}else{
					System.out.printf("\t%.2f", vendas[i][j]);
					somaProduto[i] += vendas[i][j];
					somaVendedor[j] += vendas[i][j];;
				}
			}
			System.out.println();
			
			
		}
		

		System.out.printf("Total");
		for(int x = 0; x < somaVendedor.length; x++){
			System.out.printf("\t%.2f", somaVendedor[x]);
		}
		
	}
	

	
	


}
