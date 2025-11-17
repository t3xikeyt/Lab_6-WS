import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

class Greeting {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        String message = "Hello " + name + "! You are " + age + " years old.";

        // Save to file using NIO with options
        Path path = Paths.get("greeting.txt");
        Files.write(path, (message + System.lineSeparator()).getBytes(),
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING);

        System.out.println(message);
        System.out.println("Message saved to greeting.txt");

        sc.close();
    }
}
