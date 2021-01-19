package strategy;

public class TriInsertion implements Strategy {

    @Override
    public void solve(int[] a) {
        System.out.println("Début du tri par insertion");
        for (int i = 1; i < a.length; i++) {
            int current = a[i];
            int j = i - 1;
            while(j >= 0 && current < a[j]) {
                a[j+1] = a[j];
                j--;
            }
            // at this point we've exited, so j is either -1
            // or it's at the first element where current >= a[j]
            a[j+1] = current;
        }
        System.out.print("Résultat : [");
        for (int number : a) {
            System.out.print(number + ", ");
        }
        System.out.println("]\nFin du tri par insertion\n\n");
    }
}
