
package prova1estruturadedadosavancada;


public class ArvBusca {
	private class Node {
		Integer value;
		int  key;
		Node left;
		Node right;

		Node(Integer value, int key) {
			this.value = value;
			this.key = key;
		}
	}

	private Node root;
	
	private int size;

	public ArvBusca() {
		super();
		this.size = 0;
	}

	//adicionar ABB comum
	public void add(int key, Integer value) {
		this.size++;

		if (root == null) { 
			root = new Node (value, key);
		} else {
			Node atual = root;

			while (true) {
				if (key < atual.key) {
					if (atual.left == null) {
						atual.left = new Node (value, key);
						break;
					} else {
						atual = atual.left;
					}
				} else if (key > atual.key) {
					if (atual.right == null) {
						atual.right = new Node (value, key);
						break;
					} else {
						atual = atual.right;
					}
				} else {
					atual.value = value;
					break;
				}
			}

		}
	}	

	public void printInOrdem() {
		printInOrdem(root);
		System.out.println();
	}

	private void printInOrdem(Node root) {
		if (root.left != null) {
			printInOrdem(root.left);
		} 
		System.out.print(root.value.toString() + " ");

		if (root.right != null) {
			printInOrdem(root.right);
		}
	}

	//Métodos de ordenação exigidos pegando os nós disponibilizados
        
        //IN ORDEM
	public void addInOrdem(int[] listInOrdem) {
		for (int i : listInOrdem) {
			this.add(i, i);
		}
	}

	//PRE ORDEM
	public void addPreOrdem(int[] listPreOrdem) {
		this.addInOrdem(listPreOrdem);
	}

	//POS ORDEM
	public void addPosOrdem(int[] listPosOrdem) {
		for (int i=listPosOrdem.length-1; i>=0; i--) {
			this.add(listPosOrdem[i], listPosOrdem[i]);
		}
	}
}
