public class Soma {
    public static void main(String[] args) throws Exception {
        
        final int INDICE = 13;
        int soma = 0;
        int k = 0;

        while(k < INDICE){
            k = k + 1;
            soma = soma + k;
        }

        System.out.println(soma);
    }
}
