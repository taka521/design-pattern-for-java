package display;

public class Console {

    private Console() {
        // Nothing
    }

    public static void p(Object o) {
        System.out.print(o);
    }

    public static void pl(Object o) {
        System.out.println(o);
    }
}
