package kg.game; 

public class Boss {
    private int health; 
    private int damage; 
    private String defenceType; 

    public Boss() {
    }
    ///////////////////////////////////////
    public int getHealth() {return health; }

    public void setHealth(int health) {
        if (health<=0){
            System.out.println("Wrong value for setHealth");
        } else {
        this.health = health;}}


    public int getDamage() {return damage; }

    public void setDamage(int damage) {
        if (damage<=0){
            System.out.println("Wrong value for setDamage");
        }else {
        this.damage = damage; }}


    public String getDefenceType() {return defenceType; }

    public void setDefenceType(String defenceType) {this.defenceType = defenceType; }
}
