public class Warrior extends Character{

    public Warrior(){
	maxHP = 200;
	HP = maxHP;
	strength= 50;
	defense= 20;
	attackR = 1;
    }

    public Warrior(String n){
	this();
	name = n;
    }
	
	public String about(){
		return  "A warrior is a strong fighter: maxHP = 200";
	}
	
	public void specialize(){
	defense =(int)( defense * 0.6);
	attackR = Math.random() + 1 ; }

    public void normalize(){
	defense = 20;
	attackR = 1; }
	
	
}
