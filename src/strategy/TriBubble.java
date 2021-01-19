package strategy;

public class TriBubble implements Strategy {

    @Override
    public void solve(int[] a) {
        System.out.println("Début du tri par bubble");
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < a.length - 1; i++) {
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
    }
}
