public class TestString {
    public static void main(String[] args) {
        String hello = "Hello";
        String world = "world";
        String helloWorld = hello + world;
        String helloWorldString = hello + world;
        StringBuilder stringBuilder = new StringBuilder()
                .append(hello)
                .append(world);
        System.out.println(stringBuilder);

        if (helloWorld == helloWorldString) {
            System.out.println("These are equal");
        } else {
            System.out.println("DIFFERENT!");
        }

    }
}
