package tamirlan.battling_fighters;

public class GameEngine {

    // Simulate battle between two fighters, displaying how the battle
    // progresses and who wins
    public void simulateBattle(LuckyFighter first, LuckyFighter second) throws InterruptedException {
        System.out.println("At start of battle, stats are:");

        System.out.println(first);
        System.out.println(second);
        while (!first.isDead() || !second.isDead()) {
            if (first.calculateAttackScore() > second.calculateAttackScore()) {
                if (first.isLucky()) {
                System.out.println(first.getName() + " hits " + second.getName() + " stats are: ");
                second.takeDamage(second.calculateDamage(first));
                System.out.println(first);
                System.out.println(second);
                if (second.isDead())
                    break;
            }
            }else if (first.calculateAttackScore() < second.calculateAttackScore()){
                if (second.isLucky()) {
                System.out.println(second.getName() + " hits " + first.getName() + " stats are: ");
                first.takeDamage(first.calculateDamage(second));
                System.out.println(first);
                System.out.println(second);
                if (first.isDead())
                    break;
            }
            }else {
                System.out.println("draw");
            }
            Thread.sleep(500);
        }

        if (first.isDead()) {
            System.out.println("Winner: " + second.getType());
        } else {
            System.out.println("Winner: " + first.getType());
        }
    }
}
