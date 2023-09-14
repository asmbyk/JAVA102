public class Main {
    public static void main(String[] args) {
        String[] a = {" java ", "102", "patika", "dev"};
        Integer[] b = {1, 2, 3, 4};
        Character[] c = {'J', 'a', 'v', 'a'};
        for (String i : a) {
            System.out.println(i);
        }
        for (Integer i : b) {
            System.out.println(i);
        }
        for (Character i : c) {
            System.out.println(i);
        }
        Print.printArray(a);
        System.out.println();
        Print.printArray(b);
        System.out.println();
        Print.printArray(c);
        System.out.println();
    }
}