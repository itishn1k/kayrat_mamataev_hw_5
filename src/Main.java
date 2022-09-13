import kg.game.Hero;
import kg.game.Boss;

public class Main {
    public static void main(String[] args) {
        Boss boss1 = new Boss();
        boss1.setHealth(100);
        boss1.setDamage(30);
        boss1.setDefenceType("BulletProof");
        System.out.println("Boss HP: " + boss1.getHealth() + " Damage: "
                + boss1.getDamage() + " DefType: " + boss1.getDefenceType());

        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("Hero's Health: "+ createHeroes()[i].getHealth()
                    +" Damage: "+ createHeroes()[i].getDamage()+" "+createHeroes()[i].getSuperAbility());
        }
        }

    public static Hero[] createHeroes() {
        Hero h01 = new Hero(50, 20, "SuperSpeed");
        Hero h02 = new Hero(60, 25, "MiniGun");
        Hero h03 = new Hero(65, 30);
        Hero createHeroes[] = new Hero[]{h01,h02,h03};
        return createHeroes;
    }
}