import java.util.ArrayList;

public class Exercise1 {
    private static String[] sizes  = new String[] {"20", "24", "28", "32", "36"};
    private static String[] styles = new String[] {"Calibri", "New Times Roman"};
    private static String[] colors = new String[] {"Blue", "Black", "Green", "Teal"};


    public static void RunA() {
        for (String size : sizes) {
            for (String style : styles) {
                for (String color : colors) {
                    System.out.println(size + " pt " + color + " " + style);
                }
            }
        }
    }

    public static void RunB() {
        ArrayList<TitleTest> tests = createList();
        System.out.println("done");
    }

    private static ArrayList<TitleTest> createList() {
        ArrayList<TitleTest> tests = new ArrayList<>();

        for (String size : sizes) {
            for (String style : styles) {
                for (String color : colors) {
                    TitleTest test = new TitleTest(size, color, style);
                    tests.add( test );
                }
            }
        }
        return tests;
    }
}
