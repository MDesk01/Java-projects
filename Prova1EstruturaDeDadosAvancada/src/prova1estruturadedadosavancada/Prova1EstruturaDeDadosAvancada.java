//AUTORES: MATEUS AUGUSTO & SANDE ANDRADE
package prova1estruturadedadosavancada;


public class Prova1EstruturaDeDadosAvancada {

 public static void main(String[] args) {

		//Vetor de nós para inserção
		int[] listInOrdem = {100,99,9,2,80,110,115,77};
		int[] listPreOrdem = {100,99,9,2,80,110,115,77};
		int[] listPosOrdem = {100,99,9,2,80,110,115,77};     
                
                //criando o objeto árvore #01
                ArvBinaria arv = new ArvBinaria();
                
		//Criando e inserindo os valores nos nós
		Node node100 = new Node(100);
		Node node99 = new Node(99);
		Node node9 = new Node(9);
		Node node2 = new Node(2);
		Node node80 = new Node(80);
		Node node110= new Node(110);
		Node node115 = new Node(115);
                Node node77 = new Node(77);

		
                
                //Criando e Instanciando as Arvores binárias de buscas
		ArvBusca arv1 = new ArvBusca();
		ArvBusca arv2 = new ArvBusca();
		ArvBusca arv3 = new ArvBusca();

		//Listandos os nós de acordo com os métodos
		arv1.addInOrdem(listInOrdem);
		arv2.addPosOrdem(listPosOrdem);
		arv3.addPreOrdem(listPreOrdem);

		//inserção dos valores na arvore #01
		arv.insert(node100);
		arv.insert(node99);
		arv.insert(node9);
		arv.insert(node2);
		arv.insert(node80);
		arv.insert(node110);
		arv.insert(node115);
                arv.insert(node77);

		//Raiz raiz = new Raiz();
                //método que escolhe e exibe a raíz)
                
                //Chama o método que faz a primeira contagem de nós, que encontra-se na classe ArvBinaria
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
                System.out.println("Removendo o nó 77.");
		arv.removeNode(77); //remover para deixar binária
                System.out.println();
                
		//Da o print em nos pais e seus filhos correspondentes de maior valor
                System.out.println("Imprimindo os Nós de Pais com seus Filhos de maior valor.");
		arv.printFatherAndSonOld();
	}
    
}
