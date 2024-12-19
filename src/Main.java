import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Hello32();
        Kvadraten(2);
        Multi(0.1, 0.2);
        RightTriangleArea(2.0, 4.0);
        Cirkel(6.5);
        GetChoice("Hi", "Hey", "Haj");
    }

    public static void Hello32() {
        for (int i = 0; i < 32; i++) {
            System.out.println("Hello, World!");
        }
    }

    public static void Kvadraten(int en) {
        int kvadrat = en * en;
        System.out.println("Kvadraten av " + en + " är: " + kvadrat);
    }

    public static Double Multi(Double ett, Double två) {
        Double skibidi = ett * två;
        return skibidi;

    }

    public static Double RightTriangleArea(Double base, Double height) {

        return (base * height) / 2;
    }

    public static Double Cirkel(Double radie) {
        return radie * 3.14;
    }

    public static int GetNumberInput() {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Skriv in ett tal: ");
            try {
                number = scanner.nextInt();
                scanner.nextLine();
                break;
            } catch (Exception error) {
                System.out.println("Ogiltig inmatning. Vänligen försök igen.");
                scanner.nextLine();
            }
        }

        return number;
    }

    public static int GetChoice(String a, String b, String c) {
        GetNumberInput();
        int nmr = GetNumberInput();
        System.out.println(nmr);
        return nmr;
    }
}