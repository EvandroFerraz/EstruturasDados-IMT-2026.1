public class TesteNossoVetor {
    public static void main(String[] args){
        NossoVetor v1 = new NossoVetor(); //capacidade = 10
        NossoVetor v2 = new NossoVetor(6); // capacidade = 6

        for(int i = 0; i < v2.getCapacidade(); i++){
            // preencher
            v2.adiciona(i+3);
            System.out.println(v2);
        }
        System.out.println(v2);
    }
}
