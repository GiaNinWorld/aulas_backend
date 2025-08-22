package src;

public class Array {
    public static void main(String[] args) {
        int[] numeros = {10,20,30,40,50};

        System.out.println("Iterando com for:");
        for(int i = 0; i < 5; i++){
            System.out.println("Elemento: " + numeros[i] + " | Na posição: " + i);
        }

        System.out.println("\nIterando com while:");
        int i = 0;
        while(i < numeros.length) {
            System.out.println("Elemento: " + numeros[i] + " | Na posição: " + i);
            i++;
        }

        System.out.println("\nIterando com do while:");
        int j = 0;
        do {
            System.out.println("Elemento: " + numeros[j] + " | Na posição: " + j);
            j++;
        } while (j < numeros.length);
    }
}
