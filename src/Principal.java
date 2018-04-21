import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	menu();

	}

	public static void menu(){
		Scanner entrada=new Scanner(System.in);
		System.out.println("--------------------------------------------------------");
		System.out.println("Em qual tipo de estrutura de dados você deseja implementar? ");
		System.out.println("--------------------------------------------------------");
		System.out.println("1-Pilha Sequencial");
		System.out.println("2-Pilha Encadeada");
		System.out.println("3-Fila Sequencial");
		System.out.println("4-Fila Encadeada");
		System.out.println("5-Sair");
		int opc=entrada.nextInt();
		switch(opc){
			case 1: pilhaSeq();break;
			case 2:pilhaEnc();break;
			case 3:filaSeq();break;
			case 4:filaEnc();break;
			case 5:System.out.println("Programa encerrado! ");break;
			default: System.out.println("Opção inválida! ");menu();
		}
			
	}

	public static void filaEnc() {
		Scanner entrada=new Scanner(System.in);
		int opc;
		FilaEncadeada queue=new FilaEncadeada();
		do{
			System.out.println("------FILA ENCADEADA-------");
			System.out.println("O que deseja fazer? ");
			System.out.println("1-Inserir ");
			System.out.println("2-Remover ");
			System.out.println("3-Exibir ");
			System.out.println("4-Voltar ao menu anterior");
			opc=entrada.nextInt();
			switch(opc){
				case 1: System.out.println("O que deseja inserir? ");
						String valor=entrada.next();
						queue.inserir(valor);
						break;
				case 2: queue.remover();
						break;
				case 3: queue.exibirFila();break;
				case 4: menu();
						break;
			}
		}while(opc!=4);
		
	}

	public static void filaSeq() {
		Scanner entrada=new Scanner(System.in);
		int opc;
		FilaSequencial queue=new FilaSequencial();
		do{
			System.out.println("------FILA SEQUENCIAL-------");
			System.out.println("O que deseja fazer? ");
			System.out.println("1-Inserir ");
			System.out.println("2-Remover ");
			System.out.println("3-Exibir ");
			System.out.println("4-Voltar ao menu anterior");
			opc=entrada.nextInt();
			switch(opc){
				case 1: System.out.println("O que deseja inserir? ");
						String valor=entrada.next();
						queue.inserir(valor);
						System.out.println("Elemento inserido! ");
						break;
				case 2: queue.remover();
						System.out.println("Elemento removido! ");
						break;
				case 3: queue.exibirFila();break;
				case 4: menu();
						break;
			}
		}while(opc!=4);
		
	}

	public static void pilhaEnc() {
		Scanner entrada=new Scanner(System.in);
		int opc;
		PilhaEncadeada stack=new PilhaEncadeada();
		do{
			System.out.println("------PILHA ENCADEADA-------");
			System.out.println("O que deseja fazer? ");
			System.out.println("1-Push ");
			System.out.println("2-Pop ");
			System.out.println("3-Top ");
			System.out.println("4-Exibir");
			System.out.println("5-Voltar ao menu anterior");
			opc=entrada.nextInt();
			switch(opc){
				case 1: System.out.println("O que deseja inserir? ");
						String valor=entrada.next();
						stack.push(valor);
						System.out.println("Elemento inserido! ");
						break;
				case 2: stack.pop();
						System.out.println("Elemento removido! ");
						break;
				case 3: System.out.println("Topo: "+stack.getTopo());
						break;
				case 4: stack.exibirElementos();;
						break;
				case 5: menu();break;
			}
		}while(opc!=5);
		
	}

	public static void pilhaSeq() {
		Scanner entrada=new Scanner(System.in);
		int opc;
		PilhaSequencial stack=new PilhaSequencial();
		do{
			System.out.println("------PILHA SEQUENCIAL-------");
			System.out.println("O que deseja fazer? ");
			System.out.println("1-Push ");
			System.out.println("2-Pop ");
			System.out.println("3-Topo ");
			System.out.println("4-Exibir");
			System.out.println("5-Voltar ao menu anterior");
			opc=entrada.nextInt();
			switch(opc){
				case 1: System.out.println("O que deseja inserir? ");
						String valor=entrada.next();
						stack.push(valor);
						System.out.println("Elemento inserido! ");
						break;
				case 2: stack.pop();
						System.out.println("Elemento removido! ");
						break;
				case 3: System.out.println("Topo: "+stack.elementoTopo());
						break;
				case 4: stack.exibirElementos();
						break;
				case 5:menu();break;
			}
		}while(opc!=5);
		
	}

}
