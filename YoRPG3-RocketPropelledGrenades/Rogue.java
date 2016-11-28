public class Rogue extends Character {
    
    public Rogue(){
	maxHP = 200;
	HP = maxHP;
	strength = 55;
	magic = 15;
	defense = 18;
	attackR = 1.05;
    }
	
	
	
 public Rogue(String n){
	this();
	name = n;
    }
	
	public String about(){
		return "Rogue is cunning and agile: maxHP = 200";
	}

	public void specialize(){
	defense =(int)( defense * 0.6);
	attackR = Math.random() + 1 ; }

    public void normalize(){
	defense = 55;
	attackR = 1.05; }
	
}
