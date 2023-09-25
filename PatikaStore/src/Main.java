import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> brandNames = new ArrayList<>(Arrays.asList("samsung", "lenovo", "apple", "huawei", "casper", "asus", "hp", "xiaomi", "monster"));
        List<Phone> phones = addPhone();
        List<Notebook> notebooks = addNotebook();
    }

    private static List<Notebook> addNotebook() {
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook("LENOVO", "Thinkpad 3", 15000, 10, 45, 512, 13.2, 24));
        notebooks.add(new Notebook("APPLE", "M2", 35000, 10, 45, 128, 16.6, 8));
        notebooks.add(new Notebook("HUAWEI", "D16", 25000, 10, 45, 1024, 15.6, 16));
        return notebooks;

    }

    private static List<Phone> addPhone() {
        List<Phone> telephones = new ArrayList<>();

        telephones.add(new Phone("SAMSUNG", "S20", 5000, 10, 45, 64, 15.6, 4500, 8, "Siyah"));
        telephones.add(new Phone("APPLE", "14", 5000, 10, 45, 64, 15.6, 4500, 8, "Pembe"));
        telephones.add(new Phone("XIAOMI", "Red Mi Note 11", 5000, 10, 45, 64, 15.6, 4500, 8, "Kırmızı"));

        return telephones;
    }
}