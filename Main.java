import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a month of the year: ");
        String month = sc.nextLine();

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter a verb: ");
        String verb3 = sc.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = sc.nextLine();

        System.out.print("Enter a noun: ");
        String noun = sc.nextLine();

        System.out.print("Enter a plural noun: ");
        String pluralNoun = sc.nextLine();

        System.out.print("Enter a past tense verb: ");
        String pastTenseVerb = sc.nextLine();

        System.out.println();
        System.out.println(
            "\tOn " + month + " the  " + number + ", a " + noun +
            " decided to " + verb3 + " through the " + adjective + " " + noun + ". " +
            "Along the way, it found " + number + " " + pluralNoun +
            " that were extremely " + adjective + ". " +
            "Without thinking, it " + pastTenseVerb + " the " + noun +
            " and ran away laughing."
        );
    }
}
