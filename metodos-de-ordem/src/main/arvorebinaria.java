package main;
public class arvorebinaria {
    private int num;
    private arvorebinaria direita;
    private arvorebinaria esquerda;

    public arvorebinaria() {
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

    public arvorebinaria getDireita() {
        return this.direita;
    }

    public void setDireita(arvorebinaria direita) {
        this.direita = direita;
    }

    public arvorebinaria getEsquerda() {
        return this.esquerda;
    }

    public void setEsquerda(arvorebinaria esquerda) {
        this.esquerda = esquerda;
    }

    public boolean inserir(int num) {
        if (this.num == -1) {
            this.num = num;
        } else if (num <= this.num) {
            if(this.esquerda == null){
                this.esquerda = new arvorebinaria();
            }
            this.esquerda.inserir(num);
        } else {
            if(this.direita == null){
                this.direita = new arvorebinaria();
            }
            this.direita.inserir(num);
        }
        return true;
    }

    public arvorebinaria localizar(arvorebinaria aux, int num) {
        if (aux != null) {
            if (aux.num == num) {
                System.out.println("Localizou");
            } else if (num < aux.num) {
                localizar(aux.esquerda, num);
            } else {
                localizar(aux.direita, num);
            }
        }
        return null;
    }

    public arvorebinaria localizar_remocao(arvorebinaria aux, int num) {
        if(aux.num == num){
            return aux;
        }else if(num <= aux.num){
            if(aux.esquerda == null){
                return null;
            }else if(aux.esquerda.num == num){
                return aux.esquerda;
            }else{
                return this.localizar_remocao(aux.esquerda, num);
            }
        }else{
            if(aux.direita == null){
                return null;
            }else if(aux.direita.num == num){
                return aux.direita;
            }else{
                return this.localizar_remocao(aux.direita, num);
            }
        }
    }

    public boolean InOrdem() {
        if (this.num != -1) {
            if (this.esquerda != null) {
                this.esquerda.InOrdem();
            }
            System.out.println("Numeros"+this.num);
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
            System.out.println("Numeros"+this.num);

        }
        return true;
    }
    public boolean PreOrdem() {
        if (this.num != -1) {
            System.out.println("Numeros"+this.num);
            if (this.esquerda != null) {
                this.esquerda.PreOrdem();
            }

            if (this.direita != null) {
                this.direita.PreOrdem();
            }

        }
        return true;
    }

    static arvorebinaria remover(arvorebinaria arvore, int elem) {
        arvorebinaria aux = null, aux2 = null;

        if(arvore.num == elem){
            if(arvore.esquerda == arvore.direita){
                return null;
            }else if(arvore.esquerda == null){
                return arvore.direita;
            }else if(arvore.direita == null){
                return arvore.esquerda;
            }else{
                aux = arvore;
                aux2 = arvore.direita;

                while(aux.direita != null){
                    aux2 = aux;
                    aux = aux.direita;
                }

                arvore.num = aux.num;

                if(aux.esquerda == aux.direita){
                    aux2.direita = null;
                }else{
                    if(aux == aux2){
                        arvore.esquerda = aux.esquerda;
                    }
                }

                return arvore;
            }
        }else if(arvore.num >= elem){
            arvore.esquerda = arvorebinaria.remover(arvore.esquerda, elem);
        }else{
            arvore.direita = arvorebinaria.remover(arvore.direita, elem);
        }
        return arvore;
    }
}