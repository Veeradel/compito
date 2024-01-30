import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArchivioMusicale archivio = new ArchivioMusicale();
        int choice;
        String aggiungiCanzone;

        do {
            Menu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Aggiungi canzone selected");
                    // Add your logic for adding a song here
                    aggiungiCanzone = scanner.nextLine();
                    System.out.println("Aggiungi titolo: ");
                    aggiungiCanzone = scanner.nextLine();

                    break;
                case 2:
                    System.out.println("Ricerca per artista selected");
                    // Add your logic for searching by artist here
                    break;
                case 3:
                    System.out.println("Canzoni sanremesi selected");
                    // Add your logic for Sanremo songs here
                    break;
                case 4:
                    System.out.println("Informazioni archivio selected");
                    // Add your logic for displaying archive information here
                    break;
                case 5:
                    System.out.println("Esci selected. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 5);

        scanner.close();
    }

    public static void Menu() {
        System.out.println("[1] Aggiungi canzone");
        System.out.println("[2] Ricerca per artista");
        System.out.println("[3] Canzoni sanremesi");
        System.out.println("[4] Informazioni archivio");
        System.out.println("[5] Esci");
    }
}
