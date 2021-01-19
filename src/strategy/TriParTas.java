package strategy;

public class TriParTas implements Strategy {

    @Override
    public void solve(int[] a) {
        System.out.println("Début du tri par tas");
        if (a.length == 0) return;

        // Building the heap
        int length = a.length;
        // we're going from the first non-leaf to the root
        for (int i = length / 2-1; i >= 0; i--)
            heapify(a, length, i);

        for (int i = length-1; i >= 0; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;

            heapify(a, i, 0);
        }
        System.out.print("Résultat : [");
        for (int number : a) {
            System.out.print(number + ", ");
        }
        System.out.println("]\nFin du tri par tas\n\n");
    }

    static void heapify(int[] array, int length, int i) {
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
}
