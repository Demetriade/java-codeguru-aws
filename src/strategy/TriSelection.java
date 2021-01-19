package strategy;

public class TriSelection implements Strategy {

    @Override
    public void solve(int[] a) {
        System.out.println("Début du tri par sélection");
        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            int minId = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    minId = j;
                }
            }
            // swapping
            int temp = a[i];
            a[i] = min;
            a[minId] = temp;
        }
        System.out.print("Résultat : [");
        for (int number : a) {
            System.out.print(number + ", ");
        }
        System.out.println("]\nFin du tri par sélection\n\n");
    }
}
