import java.util.Random;

public class LoveMessageGenerator {
    
    private static final String[] MESSAGES = {
        "Yes, more than ever! 💕",
        "Absolutely, with all my heart! ❤️",
        "Forever and always! 💑",
        "More today than yesterday! 🌹",
        "Completely and utterly! 💖",
        "With every fiber of my being! 💗",
        "Always have, always will! 👫",
        "You know I do! 😍",
        "Now and forever! ✨",
        "More than words can say! 💝",
        "Do you though? 😏",
        "Only on Tuesdays... just kidding, always! 😉",
        "Duh! Obviously! 🙄❤️",
        "Is this a test? Because you're passing with flying colors! ✅",
        "What kind of question is that? YES! 🤣",
        "Have you met you? Of course I do! 😘",
        "Stop doubting yourself! 💪💕",
        "More than pizza! And you know that's saying something! 🍕❤️",
        "Did you really have to ask? 😒💕",
        "I love you, you goof! 🤪❤️",
        "Like the sun loves the dawn, I love you.",
        "In every heartbeat, your name echoes.",
        "You are my favorite hello and my hardest goodbye.",
        "Love isn't just what I feel—it's who I am with you.",
        "You are the poetry my heart has been waiting to write.",
        "In a world of chaos, you are my calm.",
        "My love for you is as endless as the stars.",
        "You make my heart skip and my soul sing.",
        "Every moment with you is a love letter.",
        "You are my greatest adventure and sweetest home."
    };
    
    public static void main(String[] args) {
        Random random = new Random();
        
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║   💕 Do You Still Love Me? 💕          ║");
        System.out.println("╚════════════════════════════════════════╝\n");
        
        for (int i = 0; i < 10; i++) {
            String message = MESSAGES[random.nextInt(MESSAGES.length)];
            System.out.println("\" " + message + " \"");
            System.out.println();
        }
        
        System.out.println("─────────────────────────────────────");
        System.out.println("💕 Generated 10 random love messages! 💕");
    }
}
