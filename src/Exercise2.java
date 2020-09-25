public class Exercise2 {
    public static void RunB() {
        String[] letters = "abcdefghijklmnopqrstuvwxyz".split("");
        for (String letter1 : letters) {
            for (String letter2 : letters) {
                for (String letter3 : letters) {
                    for (String letter4 : letters) {
                        for (String letter5 : letters) {
                            System.out.println(letter1 + "" + letter2 + "" + letter3 + "" + letter4 + "" + letter5);
                        }
                    }
                }
            }
        }

    }
}
