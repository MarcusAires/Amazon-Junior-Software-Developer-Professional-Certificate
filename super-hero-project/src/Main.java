public class Main {
    public static int calculatePunchDamage(int strength){
        return strength * 2;
    }

    public static int calculateSpecialAttackDamage(int strength, String attackType){
        int damage = strength;
        if(attackType.equals("Fire Punch")) {
            damage *= 3;
            } else if (attackType.equals("Ice Blast")) {
            damage *= 2;
        }
        return damage;
    }

    public static void main(String[] args) {
        int villainHealth = 100;
        int punchStrength = 20;
        String attackType = "Fire Punch";

        int damageByPunch = villainHealth - calculatePunchDamage(punchStrength);
        int damageBySpecialAttack = calculateSpecialAttackDamage(punchStrength, attackType);
    }
}

