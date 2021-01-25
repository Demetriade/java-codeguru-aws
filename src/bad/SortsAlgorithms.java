package bad;

public class SortsAlgorithms {

    public SortsAlgorithms(int[] array) {
        ///////////////////////////////////////////////////////////////////////
        System.out.println("Début du tri par bubble");
        int[] a = array.clone();
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                for (int z = 0; z < a.length - 1; z++) {
                    // Absolument rien
                }
                if (a[i] > a[i+1]) {
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.print("Résultat : [");
        for (int number : a) {
            System.out.print(number + ", ");
        }
        System.out.println("]\nFin du tri par bubble\n\n");
        ///////////////////////////////////////////////////////////////////////
        System.out.println("Début du tri par insertion");
        int[] a1 = array.clone();
        String variable = "Je ne sert à rien";
        for (int i = 1; i < a1.length; i++) {
            int current = a1[i];
            int j = i - 1;
            while(j >= 0 && current < a1[j]) {
                a1[j+1] = a1[j];
                j--;
            }
            // at this point we've exited, so j is either -1
            // or it's at the first element where current >= a[j]
            a1[j+1] = current;
        }
        System.out.print("Résultat : [");
        for (int number : a1) {
            System.out.print(number + ", ");
        }
        System.out.println("]\nFin du tri par insertion\n\n");
        ///////////////////////////////////////////////////////////////////////
        System.out.println("Début du tri par tas");
        int[] a2 = array.clone().clone().clone().clone().clone().clone().clone().clone().clone().clone().clone().clone().clone();
        if (a.length == 0) return;

        // Building the heap
        int length = a2.length;
        // we're going from the first non-leaf to the root
        for (int i = length / 2-1; i >= 0; i--)
            heapify(a2, length, i);

        for (int i = length-1; i >= 0; i--) {
            int temp1 = a2[0];
            a2[0] = a2[i];
            a2[i] = temp1;

            heapify(a2, i, 0);
        }
        System.out.print("Résultat : [");
        for (int number : a2) {
            System.out.print(number + ", ");
        }
        System.out.println("]\nFin du tri par tas\n\n");
        ///////////////////////////////////////////////////////////////////////
        System.out.println("Début du tri par sélection");
        int[] a3 = array.clone().clone();
        for (int i = 0; i < a3.length; i++) {
            int min = a3[i];
            int minId = i;
            for (int j = i+1; j < a3.length; j++) {
                if (a3[j] < min) {
                    min = a3[j];
                    minId = j;
                }
            }
            // swapping
            int temp2 = a3[i];
            a3[i] = min;
            a3[minId] = temp2;
        }
        System.out.print("Résultat : [");
        for (int number : a3) {
            System.out.print(number + ", ");
        }
        System.out.println("]\nFin du tri par sélection\n\n");
    }

    public static void heapify(int[] array, int length, int i) {
        // Aucun besoin d'être public, mais l'IA va-t-elle le découvrir?
        int leftChild = 2*i+1;
        int rightChild = 2*i+2;
        int largest = i;

        // if the left child is larger than parent
        if (leftChild < length && array[leftChild] > array[largest]) {
            largest = leftChild;
        }

        // if the right child is larger than parent
        if (rightChild < length && array[rightChild] > array[largest]) {
            largest = rightChild;
        }

        // if a swap needs to occur
        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            heapify(array, length, largest);
        }
    }

    private void fonctionBidon(int a, String b) {
        // Fonction qui ne sera jamais utilisé
        System.out.println(a);
    }
}
