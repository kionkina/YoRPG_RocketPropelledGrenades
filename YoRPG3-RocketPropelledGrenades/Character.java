/*Team Rocket Propelled Grenades - Truc Dao, Max Korsun, Karina Ionkina
APCS1 pd4
HW 32 -- Ye Olde Role Playing Game, Expanded
2016 - 11- 20*/

public abstract class Character {
    
    protected String name; //this is WIP needs to be fixed/redone
    protected int maxHP, HP, strength, defense, magic;
    protected double attackR;

    //protected final int oldDef = defense;
    //protected final double oldAtt = attackR; 

    public abstract String about();
    public abstract void specialize();
    public abstract void normalize();
    

    public Character(){
	maxHP = 200;
	HP = maxHP;
	strength=50;
	magic = 50;
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

	if (damage < 0){
	    damage = 0;
	}
	w.lowerHP(damage);
	return damage;
    }
	
	public int getMaxHP(){
	return maxHP;
    }

     public void newMax(int n){
	 maxHP += (int) maxHP * (0.01 * n);}
		 
	
    public void heal(){
	HP = maxHP; }

	

} 
