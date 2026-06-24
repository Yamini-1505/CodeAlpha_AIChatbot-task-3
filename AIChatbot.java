import java.util.Scanner;

public class AIChatbot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("AI Chatbot Started! (type 'exit' to stop)");

        while (true) {
            System.out.print("\nYou: ");
            String user = sc.nextLine().toLowerCase();

            if (user.equals("exit")) {
                System.out.println("Bot: Goodbye! Have a nice day 😊");
                break;
            }
            else if (user.contains("hello") || user.contains("hi")) {
                System.out.println("Bot: Hello! How can I help you?");
            }
            else if (user.contains("your name")) {
                System.out.println("Bot: I am a simple Java AI Chatbot.");
            }
            else if (user.contains("java")) {
                System.out.println("Bot: Java is a powerful programming language.");
            }
            else if (user.contains("help")) {
                System.out.println("Bot: I can answer basic questions like hello, java, name.");
            }
            else {
                System.out.println("Bot: Sorry, I don't understand that.");
            }
        }

        sc.close();
    }
}