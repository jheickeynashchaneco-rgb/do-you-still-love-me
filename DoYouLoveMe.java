import java.util.Random;
import java.util.Scanner;

public class DoYouLoveMe {
    
    private static final String[] YES_RESPONSES = {
        "YES! I love you! 💕",
        "Of course I do! ❤️",
        "Always and forever! 💖",
        "More than anything! 💗",
        "With all my heart! 💝",
        "Absolutely! 😍",
        "You better believe it! 💑",
        "No question about it! 👫",
        "I love you so much! 🌹",
        "Now and always! ✨"
    };
    
    private static final String[] NO_RESPONSES = {
        "I'm kidding, I love you! 😂❤️",
        "Just messing with you - I absolutely do! 😜💕",
        "Haha, just testing your reaction! I love you! 🤣💖",
        "Can't fool you, I totally do! 😉❤️",
        "Of course I do, why would you even ask? 💕",
        "Not a chance I don't love you! 😊💗",
        "Never in a million years would I not! ❤️",
        "That's impossible - I love you! 🥰",
        "Trick question - yes, yes, YES! 💕",
        "How could I not? I love you! 💝"
    };
    
    private static final String[] MAYBE_RESPONSES = {
        "Thinking about it... YES! 💕",
        "The suspense is killing me... YES! ❤️",
        "Hmm... definitely yes! 💖",
        "Let me think... I love you! 💗",
        "Is that even a question? YES! 💕",
        "The answer has always been yes! 💝",
        "You had me at hello - yes! 😍",
        "Every second of every day - YES! 💑",
        "More than I could ever explain! ❤️",
        "The answer is written in my heart - YES! ✨"
    };
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║         💕 Do You Love Me? 💕          ║");
        System.out.println("╚════════════════════════════════════════╝\n");
        
        boolean keepAsking = true;
        
        while (keepAsking) {
            System.out.println("Do you love me?");
            System.out.println("1. YES 😊");
            System.out.println("2. NO 😢");
            System.out.println("3. MAYBE 🤔");
            System.out.println("4. Random 🎲");
            System.out.println("5. Exit 👋");
            System.out.print("\nChoose (1-5): ");
            
            String choice = scanner.nextLine().trim();
            String response = getResponse(choice, random);
            
            if (response.equals("EXIT")) {
                System.out.println("\n💕 I love you! See you soon! 💕\n");
                keepAsking = false;
            } else if (response.equals("INVALID")) {
                System.out.println("❌ Invalid choice! Try again.\n");
            } else {
                System.out.println("\n>>> " + response + "\n");
                System.out.println("─────────────────────────────────────\n");
            }
        }
        
        scanner.close();
    }
    
    private static String getResponse(String choice, Random random) {
        switch (choice) {
            case "1":
                return YES_RESPONSES[random.nextInt(YES_RESPONSES.length)];
            case "2":
                return NO_RESPONSES[random.nextInt(NO_RESPONSES.length)];
            case "3":
                return MAYBE_RESPONSES[random.nextInt(MAYBE_RESPONSES.length)];
            case "4":
                int[] options = {0, 1, 2};
                int randomType = options[random.nextInt(options.length)];
                if (randomType == 0) {
                    return YES_RESPONSES[random.nextInt(YES_RESPONSES.length)];
                } else if (randomType == 1) {
                    return NO_RESPONSES[random.nextInt(NO_RESPONSES.length)];
                } else {
                    return MAYBE_RESPONSES[random.nextInt(MAYBE_RESPONSES.length)];
                }
            case "5":
                return "EXIT";
            default:
                return "INVALID";
        }
    }
}
