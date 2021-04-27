package prova1estruturadedadosavancada;


public class Prova1EstruturaDeDadosAvancada {

 public static void main(String[] args) {

		//Vetor de nós para inserção nas ordens solicitadas.
		int[] listInOrdem = {100,99,9,2,80,110,115,77};
		int[] listPreOrdem = {100,99,9,2,80,110,115,77};
		int[] listPosOrdem = {100,99,9,2,80,110,115,77};     
		//Inserindo nós na árvore binária
		Node node100 = new Node(100);
		Node node99 = new Node(99);
		Node node9 = new Node(9);
		Node node2 = new Node(2);
		Node node80 = new Node(80);
		Node node110= new Node(110);
		Node node115 = new Node(115);
                Node node77 = new Node(77);

		ArvBinaria arv = new ArvBinaria();
                
                //Instanciando a ABB
		ArvBusca arv1 = new ArvBusca();
		ArvBusca arv2 = new ArvBusca();
		ArvBusca arv3 = new ArvBusca();

		//Lista de nós na árvore de acordo com os métodos
		arv1.addInOrdem(listInOrdem);
		arv2.addPosOrdem(listPosOrdem);
		arv3.addPreOrdem(listPreOrdem);

		//inserção dos valores na arvore nao modificada
		arv.insert(node100);
		arv.insert(node99);
		arv.insert(node9);
		arv.insert(node2);
		arv.insert(node80);
		arv.insert(node110);
		arv.insert(node115);
                arv.insert(node77);

		//Raíz AQUI
                //Contagem de nos
		System.out.printf("Primeira contagem de nós: " + arv.getQtd_node());
		System.out.println();
                
                //imprimindo em métodos
                System.out.printf("In Ordem:");
		arv.printInOrdem();
                
		System.out.printf("Pos Ordem:");
		arv.printPosOrdem();
		
		System.out.printf("Pre Ordem:");
		arv.printPreOrdem();
		System.out.println();

                

                
                System.out.printf("Menores nós:");
		//Chamada de metodo para imprimir os menores
		arv.printMenores();
                System.out.println();
                System.out.println();
		 

		//chamando os metodos para imprimir as arvores obtidas em ordem
                System.out.println("Árvores obtidas: ");
                System.out.printf("01) ");
		arv1.printInOrdem();
                System.out.printf("02) ");
		arv2.printInOrdem();
                System.out.printf("03) ");
		arv3.printInOrdem();
		System.out.println();
               


                System.out.println("Removendo o nó 77.");
		arv.removeNo(77); //remover para deixar binária
                System.out.println();
                
		//imprimir no pai e filho de maior valor
                System.out.println("Imprimindo os Nós de Pais com seus Filhos de maior valor.");
		arv.printFatherAndSonOld();
	}
    
}
