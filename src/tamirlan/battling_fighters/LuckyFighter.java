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
    public void takeDamage(int damage) {
        if (strategy == Strategy.AGGRESSIVE) {
            super.takeDamage(damage + 1);
        } else if (strategy == Strategy.DEFENSIVE) {
            // ........
        } else {
            // .......
        }

    }

    @Override
    public int calculateDamage(Fighter other) {
        return super.calculateDamage(other);
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
