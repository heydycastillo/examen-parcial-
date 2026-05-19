public class problema2 {

    static int segundoMayor(int[] arr, int i, int n) {
        if (n == i + 1) {
            if (arr[i] > arr[n]) {
                return arr[n];
            } else {
                return arr[i];
            }
        }
        int mitad= (i + n) / 2;

        int izq = segundoMayor(arr, i, mitad);
        int der = segundoMayor(arr, mitad + 1, n);

        return 0;
    }

    public static void main(String[] args) {

        int[] arr = {8, 3, 10, 5, 7};
        int n=4;
        int segundomayor = segundoMayor(arr, 0, n);
        System.out.println(segundomayor);

    }
}