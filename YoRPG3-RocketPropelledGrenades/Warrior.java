public class Warrior extends Character{

    public Warrior(){
	HP = 200;
	strength= 50;
	defense= 20;
	attackR = 1;
    }

    public Warrior(String n){
	this();
	name = n;
    }
	
	public String about(){
		return  "A warrior is a strong fighter.";
	}
	
	public void specialize(){
	defense =(int)( defense * 0.8);
	attackR += .7; }

    public void normalize(){
	defense = oldDef;
	attackR = oldAtt; }
	
	
}
