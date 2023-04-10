package tamirlan.battling_fighters;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        LuckyFighter f1 = new LuckyFighter("Joe", "Human Warrior", 16, 12, 12, Strategy.AGGRESSIVE);
        LuckyFighter f2 = new LuckyFighter("Alex", "Elf Lord", 18, 6, 10, Strategy.AVERAGE);
        GameEngine game = new GameEngine();
        game.simulateBattle(f1, f2);
    }
}
