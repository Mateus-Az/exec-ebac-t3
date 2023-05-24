package pilha.mod1.entity;

public class Pilha{
    Integer[] pilha = new Integer[0];
    int countAux = 0;
    int countRodada = 0;
    //a complexidade tempo aqui é o(1) pois sempre cria um novo array com 1 de espaço e de espaço o(n) já que o valor de um array é copiado para outro
    public void push(Integer integer) {
        countAux += 1;
        if (pilha.length < countAux) {
            aumentarTamanhoPilha(this.pilha);
            this.pilha[countRodada] = integer;
        }
        countRodada ++;
    }
    // creio que a complexidade de tempo nesse método seja o(1) pois eu tenho um único laço para diminuir o tamanho da pilha
    //já a complexidade de espaço seja o(n) pois eu crio 2 arrays copio um para o outro e depois atribuo o atual com o novo liberando memoria
    public Integer pop() {
        countRodada --;
        countAux --;
        Integer[] novaPilhaReduzida = null;
        int aux = 0;
        if (this.pilha.length >= 1) {
            novaPilhaReduzida = new Integer[this.pilha.length - 1];
            aux = this.pilha[this.pilha.length - 1];
            for (int i = 0; i < pilha.length-1 ; i++) {
                novaPilhaReduzida[i] = this.pilha[i];
            }
            this.pilha = novaPilhaReduzida;
        }
        return aux;
    }

    public void aumentarTamanhoPilha(Integer[] pilha) {
        int tamanho = (this.pilha.length + 1);
        Integer[] novaPilha = new Integer[Integer.valueOf(tamanho)];
        for (int i = 0; pilha.length > i;i++){
            if(pilha[i] != null){
            novaPilha[i] = pilha[i];
            }
        }
        this.pilha = novaPilha;
    }
    public Integer top(){
        return this.pilha[this.pilha.length-1];
    }
    public boolean isEmtpy(){
        boolean result;
        if (this.pilha.length <= 0){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
    public Integer size(){
        return this.pilha.length;
    }

    public void imprimir(){
        for (Integer integer: this.pilha){
            System.out.println(integer);
        }
    }
}
