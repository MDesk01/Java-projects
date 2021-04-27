
package prova1estruturadedadosavancada;

public class ArvBinaria{

	private Node root; //raíz
	private int alturaArv; //altura da árvore
	private int qtd_node;

	private void insertRoot(Node novo) {
		if (this.root == null) {
			this.root = novo;
			this.root.setProfundidade(0);
			System.out.println("100 foi inserido como raíz.");
                        System.out.println();
		}
	}

	public boolean nodeLeaf(Node node) {
		if (
				node.nodeSonRight == null &&
				node.nodeSonLeft == null) {
			return true;
		}
		return false;
	}

	private void insertNaEsquerda(Node novo, Node Father) {
		if (Father.getDado() == root.getDado()) {
			if (Father.nodeSonLeft == null) {
				root.setNodeSonLeft(novo);
				novo.setFather(Father);
				novo.setProfundidade(Father.getProfundidade() + 1);
				if (this.alturaArv < novo.getProfundidade()) {
					this.alturaArv = novo.getProfundidade();
				}
			} else {
				insertNaEsquerda(novo, Father.nodeSonLeft);
			}
		} else {
			if (Father.nodeSonLeft == null) {
				Father.setNodeSonLeft(novo);
				novo.setFather(Father);
				novo.setProfundidade(Father.getProfundidade() + 1);
				if (this.alturaArv < novo.getProfundidade()) {
					this.alturaArv = novo.getProfundidade();
				}
				
			} else {
				novo.setProfundidade(Father.getProfundidade() + 1);
				insertNaEsquerda(novo, Father.nodeSonLeft);
			}
		}
	}
        
        //inserindo na direita
	private void insertNaDireita(Node novo, Node Father) {
		if (Father.getDado() == root.getDado()) {
			if (Father.nodeSonRight == null) {
				root.setNodeSonRight(novo);
				novo.setFather(Father);
				novo.setProfundidade(Father.getProfundidade() + 1);
				if (this.alturaArv < novo.getProfundidade()) {
					this.alturaArv = novo.getProfundidade();
				}
				
			} else {
				insertNaDireita(novo, Father.nodeSonRight);
			}
		} else {
			if (Father.nodeSonRight == null) {
				Father.setNodeSonRight(novo);
				novo.setFather(Father);
				novo.setProfundidade(Father.getProfundidade() + 1);
				if (this.alturaArv < novo.getProfundidade()) {
					this.alturaArv = novo.getProfundidade();
				}
				
			} else {
				novo.setProfundidade(Father.getProfundidade() + 1);
				insertNaDireita(novo, Father.nodeSonRight);
			}
		}
	}

	public void insert (Node novo) {		
		if (this.root == null) {
			insertRoot(novo);
			this.qtd_node++;
		} else {
			insert(novo, this.root);
		}
	}

	private void insert(Node novo, Node Father) {
		if (novo.getDado() < Father.getDado()) {
			if (Father.getNodeSonLeft() == null) {
				insertNaEsquerda(novo, Father);
				this.qtd_node++;
			} else {
				insert(novo, Father.getNodeSonLeft());
			}
		} else {
			if (Father.getNodeSonRight() == null) {
				insertNaDireita(novo, Father);
				this.qtd_node++;
			} else {
				insert(novo, Father.getNodeSonRight());
			}
		}
	}

        //procurando e removendo o nó escolhido na classe Main

	public Node procurarNo(int x, Node node) {
		if (node.getDado() == x) {
			return node;
		} else {
			if (node.nodeSonLeft != null) {
				Node p = procurarNo(x, node.nodeSonLeft);
				if (p != null) {
					return p;
				}
			} 

			if (node.nodeSonRight != null) {
				Node p = procurarNo(x, node.nodeSonRight);
				if (p != null) {
					return p;
				}
			} 


			return (Node) null;
		}
	}
        	public void removeNo(int x) {
		//Procura o nó e o mais próximo para subir
		Node node = procurarNo(x, root);
		if (node == null) {
			return;
		}
		Node next = nextSemFilhos(node);


		// Se já nó a ser removido for raiz, raiz será o próximo
		if (root == node) {
			root = next;

			// Se não, mudar conexão do Father de nó para o próximo
		} else {
			if (node.Father.nodeSonLeft == node) {
				node.Father.nodeSonLeft = next;
			} else {
				node.Father.nodeSonRight = next;
			}
		}

		// Remover conexão do Father de próximo com próximo
		if (next.Father.nodeSonLeft == next) {
			next.Father.nodeSonLeft = null;
		} else {
			next.Father.nodeSonRight = null;
		}

		// Copiar conexões de Father para próximo 
		next.Father = node.Father;
		next.nodeSonRight = node.nodeSonRight;
		next.nodeSonLeft = node.nodeSonLeft;

		// Altera conexões dos Filhos de nó
		if (node.nodeSonRight != null) {
			node.nodeSonRight.Father = next;
		}
		if (node.nodeSonLeft != null) {
			node.nodeSonLeft.Father = next;
		}

		// Remover conxeões de nó
		node.Father = null;
		node.nodeSonRight = null;
		node.nodeSonLeft = null;
	}
                //procura e remove-FIM

	public Node nextSemFilhos(Node node) {
		if (node.nodeSonLeft != null) {
			return nextSemFilhos(node.nodeSonLeft);
		} else if (node.nodeSonRight != null) {
			return nextSemFilhos(node.nodeSonRight);
		} else {
			return node;
		}
	}

	
	public void printInOrdem() {
		printInOrdem(root);
		System.out.println();
	}

	private void printInOrdem(Node root) {
		if (root.nodeSonLeft != null) {
			printInOrdem(root.nodeSonLeft);
		} 
		System.out.print("["+root.getDado() + "]");

		if (root.nodeSonRight != null) {
			printInOrdem(root.nodeSonRight);
		}
	}

	public void printPosOrdem() {
		printPosOrdem(root);
		System.out.println();
	}

	private void printPosOrdem (Node root) {
		if (root.nodeSonLeft != null) {
			printPosOrdem(root.nodeSonLeft);
		} 
		if (root.nodeSonRight != null) {
			printPosOrdem(root.nodeSonRight);
		}

		System.out.print("["+root.getDado() + "]");
	}

	public void printPreOrdem() {
		printPreOrdem(root);
		System.out.println();
	}

	private void printPreOrdem (Node root) {
		System.out.print("["+ root.getDado() + "]");

		if (root.nodeSonLeft != null) {
			printPreOrdem(root.nodeSonLeft);
		} 
		if (root.nodeSonRight != null) {
			printPreOrdem(root.nodeSonRight);
		}

	}

	public void printMenores() {
		printMenores(root.nodeSonLeft);
	}

	//Menores valores da Árvore binária de busca
	private void printMenores(Node root) {
		if (root.nodeSonLeft != null) {
			printMenores(root.nodeSonLeft);
		} 
		System.out.print("["+ root.getDado() + "]");

		if (root.nodeSonRight != null) {
			printMenores(root.nodeSonRight);
		}
	}
        
        //Métodos que buscam e exibem Fathers e Filhos com maior valor
        public void printFatherAndSonOld() {
		printFatherAndSonOld(root);
		System.out.println();
	}

	public void printFatherAndSonOld(Node root) {
		if (root.nodeSonLeft != null) {
			printFatherAndSonOld(root.nodeSonLeft);
		} 
		if (root.nodeSonRight != null) {
			printFatherAndSonOld(root.nodeSonRight);
		}

		if (nodeLeaf(root)) {

		} else {
			if (root.nodeSonRight == null) {
				System.out.print("Pai: [" + root.getDado() + "]" + " Filho de Maior Valor: [" + root.getNodeSonLeft().getDado()+"]");
				System.out.println();
			} else {
				System.out.print("Pai: [" + root.getDado() +"]"+ " Filho de Maior Valor: [" + root.getNodeSonRight().getDado()+"]");
				System.out.println();
			}
		}	
	}

	public int getQtd_node() {
		return qtd_node;
	}

	public Node getRoot() {
		return root;
	}

}