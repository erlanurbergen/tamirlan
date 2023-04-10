package tamirlan.battling_fighters;

public class Fighter {

    private String name;
    private String type;
    private int skill;
    private int stamina;

    public Fighter() {
    }

    public Fighter(String name, String type, int skill, int stamina) {
        this.name = name;
        this.type = type;
        if (skill >= 1 && skill <= 24)
            this.skill = skill;
        if (stamina >= 1 && stamina <= 18)
            this.stamina = stamina;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    // Reduce the fighter's stamina accordingly
    public void takeDamage(int damage){
        this.stamina = stamina - damage;
    }

    // Return the number of damage points to be inflicted on opponent
    public int calculateDamage(Fighter other){
        if (stamina >= 2)
            return 2;
        else if (stamina == 1) {
            return 1;
        }
            return 0;
    }

    // Calculate an attack score for the fighter using the procedure described above
    public int calculateAttackScore(){
        int randomNumber = (int) ((Math.random() * (6 - 1)) + 1); // 1 - 6
        int randomNumber2 = (int) ((Math.random() * (6 - 1)) + 1); // 1 - 6
        return randomNumber + skill + randomNumber2;
    }

    // Determine whether fighter is still alive
    public boolean isDead(){
        if (this.stamina == 0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return name  +
                " - " + type +
                " - skill: " + skill +
                "; stamina:" + stamina;
    }
}
