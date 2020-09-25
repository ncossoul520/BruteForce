import java.util.ArrayList;

public class Exercise4 {
    public static void RunB() {
        for (int n = 100; n < 10000; n++) {
            if ( isAbundant(n) ) {
                System.out.println(n);
            }
        }
    }

    private static boolean isAbundant(int n) {
        int sum = 1;
        for (int i = 2; i <= n/2; i++) {
            if ( n%i == 0) {
                sum += i;
//                System.out.println("[DEBUG] n:" + n + " i:" + i + " sum:" + sum);
            }
        }
        return sum > n;
    }

    //**********************************
    public static void RunC(int target) {
        ArrayList<Integer> abundants = new ArrayList<>();
        for (int n = 1; n < target; n++) {
            if ( isAbundant(n) ) {
                abundants.add(n);
            }
        }

        for (int i = 0; i < abundants.size(); i++) {
            int n1 = abundants.get(i);
            for (int j = i; j < abundants.size(); j++) {
                int n2 = abundants.get(j);
                if ( n1 + n2 == target ) {
                    System.out.println("Found them: " + n1 + " + " + n2 + " = " + target);
                    return;
                }
            }
        }
    }
}
