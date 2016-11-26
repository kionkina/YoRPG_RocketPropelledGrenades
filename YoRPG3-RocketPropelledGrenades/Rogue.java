public class Rogue extends Character {
    
    public Rogue(){
	HP = 200;
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
		return "Mage is third strongest.";
	}

	public void specialize(){
	defense =(int)( defense * 0.8);
	attackR += .7; }

    public void normalize(){
	defense = oldDef;
	attackR = oldAtt; }
	
}
