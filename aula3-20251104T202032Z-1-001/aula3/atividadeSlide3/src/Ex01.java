public class Ex01 {
    public static void main(String[] args) {
        int[] vet = new int[10];
        System.out.println("Vetor com todos os numeros");
       

        for (int i = 0; i < vet.length; i++) {
            vet[i] = (int) (Math.random() * 10) + 1;
            System.out.print(vet[i] + " ");
           
        }
        System.out.println("\nVetor com  os numeros impares");
        int contador = 0;
        for (int i = 0; i < vet.length; i++) {
            if (!(vet[i] % 2 == 0)) {
                 vet[contador] = vet[i];
                contador++;
                 
            }
        }
        for (int i = 0; i < contador; i++) {
            System.out.print(vet[i] + " ");
        }
    }
}
