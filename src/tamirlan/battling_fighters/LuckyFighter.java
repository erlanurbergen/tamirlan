package tamirlan.battling_fighters;

public class LuckyFighter extends Fighter{
    private int luck;
    private Strategy strategy;

    public LuckyFighter() {
    }

    public LuckyFighter(int luck, Strategy strategy) {
        this.luck = luck;
        if (luck >= 1 && luck <= 18)
            this.strategy = strategy;
    }

    public LuckyFighter(String name, String type, int skill, int stamina, int luck, Strategy strategy) {
        super(name, type, skill, stamina);
        if (luck >= 1 && luck <= 18)
            this.luck = luck;
        this.strategy = strategy;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }


    boolean isLucky() {
        int randomNumber1 = (int) (Math.random() * (6 - 1) + 1);
        int randomNumber2 = (int) (Math.random() * (6 - 1) + 1);
        int sum = randomNumber1 + randomNumber2;
        if (sum <= luck){
            this.luck = luck - 1;
            return true;
        }
        this.luck = luck - 1;
        return false;
    }






//    int checkStrategy() {
//        int number = 0;
//        if (strategy == Strategy.DEFENSIVE) {
//            System.out.println("Defensive");
//            int randomNumber = (int) ((Math.random() * (6 - 1)) + 1); // 1 - 6
//            int randomNumber2 = (int) ((Math.random() * (6 - 1)) + 1); // 1 - 6
//            if (randomNumber + randomNumber2 <= luck) {
////                this.takeDamage(1);
//                this.luck = luck - 1;
//                number = 1;
//                return number;
//            } else {
////                this.takeDamage(2);
//                this.luck = luck - 1;
//                number = 2;
//                return number;
//            }
//        } else if (strategy == Strategy.AGGRESSIVE) {
//            System.out.println("Aggressive");
//            int randomNumber = (int) ((Math.random() * (6 - 1)) + 1); // 1 - 6
//            int randomNumber2 = (int) ((Math.random() * (6 - 1)) + 1); // 1 - 6
//            if (randomNumber + randomNumber2 <= luck) {
////                this.takeDamage(4);
//                this.luck = luck - 1;
//                System.out.println("Luck:" + luck);
//                number = 4;
//                return number;
//            } else {
////                this.takeDamage(1);
//                this.luck = luck - 1;
//                number = 1;
//                return number;
//            }
//        } else if (strategy == Strategy.AVERAGE) {
//            System.out.println("ignore");
//            number = 0;
//            return 0;
//        }
//
//        return number;
//    }



    @Override
    public void takeDamage(int damage) { // это для 2-ого файтера
        super.takeDamage(damage);
    }

    @Override
    public int calculateDamage(Fighter other) { // тот кто наносит урон
        LuckyFighter l1 = (LuckyFighter) other;
        if (l1.getStamina() >= 2) {
            if (strategy == Strategy.AGGRESSIVE) {
                System.out.println("Урон нанесен, агрессия");
                return 3;
            } else if (l1.getStrategy() == Strategy.DEFENSIVE) {
                System.out.println("Урон нанесен, защита");
                return 2;
            }
        }
        else if (other.getStamina() == 1) {
            return 1;
        }
            return 0;

    }

    @Override
    public int calculateAttackScore() {
        return super.calculateAttackScore();
    }

    @Override
    public boolean isDead() {
        return super.isDead();
    }


    @Override
    public String toString() {
        return getName()  + " " +strategy +
                " - " + getType() +
                " - skill: " + getSkill() +
                "; stamina: " + getStamina() +
                "; luck: "+luck;
    }
}
