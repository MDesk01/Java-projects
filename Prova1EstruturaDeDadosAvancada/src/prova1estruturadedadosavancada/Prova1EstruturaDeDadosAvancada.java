package prova1estruturadedadosavancada;
//UTILIZANDO ÁRVORE BINÁRIA DE BUSCA

public class Prova1EstruturaDeDadosAvancada {

 public static void main(String[] args) {

		//Vetores de nós para inserção (VIZUALIZAR AS ÁRVORES GERADAS E AJUSTADAS)
		
                //int[] listInOrdem = {C,B,D,A,RAIZ,E};
		//int[] listPreOrdem = {RAIZ,A,B,C,D,E};
		//int[] listPosOrdem = {C,D,B,A,E,RAIZ}; 
                
		int[] listInOrdem = {2,9,80,99,100,110};
		int[] listPreOrdem = {100,99,9,2,80,110};
		int[] listPosOrdem = {2,80,9,99,110,100};     
                
                //criando o objeto árvore #01
                ArvBinaria arv = new ArvBinaria();
                
		//Criando e inserindo os valores nos nós
		Node nodeRoot = new Node(100); //RAIZ AQUI
		Node nodeA = new Node(99);
		Node nodeB = new Node(9); 
		Node nodeC = new Node(2);
		Node nodeD = new Node(80);
		Node nodeE= new Node(110);

                //Criando e Instanciando as Arvores binárias de buscas
		ArvBusca arv1 = new ArvBusca();
		ArvBusca arv2 = new ArvBusca();
		ArvBusca arv3 = new ArvBusca();

		//Listandos os nós de acordo com os métodos
		arv1.addInOrdem(listInOrdem);
		arv2.addPosOrdem(listPosOrdem);
		arv3.addPreOrdem(listPreOrdem);

		//inserção dos valores na arvore #01
		arv.insert(nodeRoot);
		arv.insert(nodeA);
		arv.insert(nodeB);
		arv.insert(nodeC);
		arv.insert(nodeD);
		arv.insert(nodeE);

		//Raiz raiz = new Raiz();
                //método que escolhe e exibe a raíz)
                
                //Chama o método que faz a primeira contagem de nós, que encontra-se na classe ArvBinaria
                System.out.println("------------------------------------------");
		System.out.printf("Primeira contagem de nós: " + arv.getQtd_node());
		System.out.println();
                
                //Impressão dos nos de acordo com os métodos de ordem, localizados na classe ArvBinaria
                System.out.printf("In Ordem:"); //LNR
		arv.printInOrdem();
                
		System.out.printf("Pos Ordem:"); //LRN
		arv.printPosOrdem();
		
		System.out.printf("Pre Ordem:"); //NLR
		arv.printPreOrdem();
		System.out.println();

                

                
                System.out.printf("Menores nós:");
		//Chamada do método que identifica e imprime os menores nos.
                //Neste exemplo, estamos imprimindo os nos menores que a raiz, pois pegamos os do lado esquerdo           
		arv.printMenores();
                System.out.println();
                System.out.println();
		 

		//chamando os metodos para imprimir as arvores obtidas apos verificar os resultados dos metodos de ordenação
                System.out.println("Árvores obtidas: ");
                System.out.printf("01) ");
		arv1.printInOrdem();
                System.out.printf("02) ");
		arv2.printInOrdem();
                System.out.printf("03) ");
		arv3.printInOrdem();
		System.out.println();
               
                //OBS.: espero que esteja correto fazer isso(método na classe ArvBinaria)
                //Removemoso nó 77 para deixar a árvore com 7 nos, tornando em uma raiz e duas sub-arvores
                //Testei removendo a raiz e funciona também(#milagre)
                System.out.println("Removendo o nó Escolhido.");
		arv.removeNode(77); //remover para deixar binária
                System.out.println();
                
                //é estritamente binaria ou nao???
                System.out.printf("Árvore estritamente binária? "+arv.full());
		System.out.println();
                System.out.println();
                
		//Da o print em nos pais e seus filhos correspondentes de maior valor
                System.out.println("Imprimindo os Nós de Pais com seus Filhos de maior valor.");
		arv.printFatherAndSonOld();
	}
}
