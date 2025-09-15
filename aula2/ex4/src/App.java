public class App {
    public static void main(String[] args) throws Exception {
        int[] v1 = {1, 2, 3, 4, 5};
        int[] v2 = {1, 2, 3, 2, 5};

        System.out.println("v1 tem duplicados?"); 
        if (temDuplicados(v1) == true){ 
            System.out.println("Tem itens duplicados.");
        } else {
            System.out.println("Nao tem itens duplicados.");
        }

        System.out.println("v2 tem duplicados? ");  
        if (temDuplicados(v2) == true){ 
            System.out.println("Tem itens duplicados.");
        } else {
            System.out.println("Nao tem itens duplicados.");
        }

        
    }

    public static boolean temDuplicados(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
