package testers;

@FunctionalInterface
public interface I1 {
    void check();

    default void speed() {
        System.out.println("inside speed method.");
    }

    static void type() {
        System.out.println("inside type");
    }

}
