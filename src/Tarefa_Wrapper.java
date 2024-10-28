import java.util.Scanner;

public class Tarefa_Wrapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um booleano: ");
        boolean logicob = scanner.nextBoolean();
        Boolean logicoB = logicob;

        System.out.print("Informe um byte: ");
        byte byteb = scanner.nextByte();
        Byte byteB = byteb;

        System.out.print("Informe um short: ");
        short shortb = scanner.nextShort();
        Short shortB = shortb;

        System.out.print("Informe um int: ");
        int intb = scanner.nextInt();
        Integer intB = intb;

        System.out.print("Informe um float: ");
        float floatb = scanner.nextFloat();
        Float floatB = floatb;

        System.out.print("Informe um double: ");
        double doubleb = scanner.nextDouble();
        Double doubleB = doubleb;

        System.out.print("Informe um long: ");
        long longb = scanner.nextLong();
        Long longB = longb;

        System.out.println("Você informou o booleano: " + logicoB);
        System.out.println("Você informou o byte: " + byteB);
        System.out.println("Você informou o short: " + shortB);
        System.out.println("Você informou o int: " + intB);
        System.out.println("Você informou o float: " + floatB);
        System.out.println("Você informou o double: " + doubleB);
        System.out.println("Você informou o long: " + longB);

        scanner.close();
    }
}