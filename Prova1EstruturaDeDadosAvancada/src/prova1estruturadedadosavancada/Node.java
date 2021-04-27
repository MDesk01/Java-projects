
package prova1estruturadedadosavancada;


public class Node {

	int dado;
	Node Father;
	Node nodeSonLeft; //esquerdo
	Node nodeSonRight; //direito
	private int profundidade;

	public Node() {
	}

	public Node(int dado) {
		super();
		this.dado = dado;
		this.Father = null;
		this.nodeSonRight = null;
		this.nodeSonLeft = null;
	}

	public int getDado() {
		return dado;
	}

	public void setDado(int dado) {
		this.dado = dado;
	}

	public Node getFather() {
		return Father;
	}

	public void setFather(Node Father) {
		this.Father = Father;
	}

	public Node getNodeSonLeft() {
		return nodeSonLeft;
	}

	public void setNodeSonLeft(Node nodeSonLeft) {
		this.nodeSonLeft = nodeSonLeft;
	}

	public Node getNodeSonRight() {
		return nodeSonRight;
	}

	public void setNodeSonRight(Node nodeSonRight) {
		this.nodeSonRight = nodeSonRight;
	}


	public int getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(int profundidade) {
		this.profundidade = profundidade;
	}

	public int nivelNode() {
		return this.getProfundidade();
	}
	
}	
