package main;

public class ArvoreBinaria {
    private int num;
    private ArvoreBinaria direita;
    private ArvoreBinaria esquerda;

    public ArvoreBinaria() {
        this.num = -1;
        this.direita = null;
        this.esquerda = null;
    }

    public int getRaiz() {
        return this.num;
    }

    public void setRaiz(int raiz) {
        this.num = raiz;
    }

    public ArvoreBinaria getDireita() {
        return this.direita;
    }

    public void setDireita(ArvoreBinaria direita) {
        this.direita = direita;
    }

    public ArvoreBinaria getEsquerda() {
        return this.esquerda;
    }

    public void setEsquerda(ArvoreBinaria esquerda) {
        this.esquerda = esquerda;
    }

    public boolean inserir(int num) {
        if (this.num == -1) {
            this.num = num;
        } else if (num <= this.num) {
            if(this.esquerda == null){
                this.esquerda = new ArvoreBinaria();
            }
            this.esquerda.inserir(num);
        } else {
            if(this.direita == null){
                this.direita = new ArvoreBinaria();
            }
            this.direita.inserir(num);
        }
        return true;
    }

    public boolean InOrdem() {
        if (this.num != -1) {
            if (this.esquerda != null) {
                this.esquerda.InOrdem();
            }
            System.out.println("["+this.num+"]");
            if (this.direita != null) {
                this.direita.InOrdem();
            }
        }
        return true;
    }

    public boolean PosOrdem() {
        if (this.num != -1) {
            if (this.esquerda != null) {
                this.esquerda.PosOrdem();
            }

            if (this.direita != null) {
                this.direita.PosOrdem();
            }
            System.out.println("["+this.num+"]");

        }
        return true;
    }
    public boolean PreOrdem() {
        if (this.num != -1) {
            System.out.println("["+this.num+"]");
            if (this.esquerda != null) {
                this.esquerda.PreOrdem();
            }

            if (this.direita != null) {
                this.direita.PreOrdem();
            }

        }
        return true;
    }
}