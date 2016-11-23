/*Team Rocket Propelled Grenades - Truc Dao, Max Korsun, Karina Ionkina
APCS1 pd4
HW 32 -- Ye Olde Role Playing Game, Expanded
2016 - 11- 20*/

public abstract class Character {
    
    protected String name; //this is WIP needs to be fixed/redone
    protected int HP, strength, defense;
    protected double attackR;

    protected final int oldDef = defense;
    protected final double oldAtt = attackR;

    public abstract String about();
    public abstract void specialize();
    public abstract void normalize();
    

    public Character(){
	HP = 200;
	strength=50;
	defense=20;
	attackR=1;
    }

    public boolean isAlive(){
	return HP > 0; }
    
    public String getName(){
	if (this.getClass().equals("Monster")){
		return "monster";}
	else {
	    return name;} }

    public int getDefense(){
	return defense;}

    public void lowerHP(int damage){
	HP -= damage; }

    public int attack(Character w){
	int damage = (int)(strength * attackR) - w.getDefense();
	// lowerHP must be called on warrior!
	if (damage < 0){
	    damage = 0;
	}
	w.lowerHP(damage);
	return damage;
    }


} 
