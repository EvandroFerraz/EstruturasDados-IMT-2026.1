// vetor dinâmico

// toda classe em Java, por padrão herda da classe Object
public class NossoVetor {
    private int vetor[];
    private int ocupacao; // quantos elementos estão no vetor

    // construtor 1 - cria um vetor com 10 espaços
    public NossoVetor(){
         // inicialmente reservamos 10 espaços de memória 
         vetor = new int[10];
         ocupacao = 0;
    }
    // NossoVetor v1 = new NossoVetor(); // v1 teria 10 posições
    // NossoVetor v2 = new NossoVetor(20); //v2 teria 20 posições

    // construtor 2 - cria um vetor com uma capacidade 
    // especificada pelo usuário
    public NossoVetor(int capacidadeInicial){
        vetor = new int[capacidadeInicial];
        ocupacao = 0;
    }

    // retorna a capacidade do vetor
    public int getCapacidade(){
        return vetor.length; // retorna a capacidade do vetor
    }

    // método que verifica se o vetor está vazio
    public boolean estaVazio(){
        return ocupacao == 0;
    }

    // método que verifica se o vetor está cheio
    public boolean estaCheio(){
        //return ocupacao == getCapacidade();
        return ocupacao == vetor.length;
    }

    // devolver o índice da primeira ocorrência do elemento, se existir
    // ou -1 caso contrario
    // |2|4|5|2|3|
    public int pesquisaIndice(int elemento){
        for(int i = 0; i < ocupacao; i++){
            // cada iteração representa uma posição do vetor
            // as posições vão do indice 0 até ocupacao-1
            if(elemento == vetor[i]) return i;
        }
        return -1; // o elemento pesquisado não foi encontrado no vetor
    }

    // método para adicionar um elemento dentro do vetor e retornar uma 
    // confirmação de que ele foi adicionado
    public boolean adiciona(int elemento){
        // verifica se o vetor esta cheio e retorna falso se estiver
        if(estaCheio()) return false;
        // adiciona o elemento na próxima posição vazia (vetor[ocupacao])
        // e incrementa o valor de ocupacao
        vetor[ocupacao++] = elemento; //pós incremento
        return true;
    }

    //sobrescrita do método "toString()", define a representação textual do objeto
    // NossoVetor v2 = new NossoVetor(20); //v2 teria 20 posições
    // System.out.println(v2); // por padrão escreve o endereço de memória
    // de onde o objeto esta guardado

    // vamos sobrescrever toString() para mostras a lista de números no vetor
    @Override
    public String toString(){
        String s = "";
        for(int i = 0; i < ocupacao; i++){
            s = s + vetor[i] + " ";
        }
        return s + "\n";
    }
}