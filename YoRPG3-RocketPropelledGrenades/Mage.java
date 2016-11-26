public class Mage extends Character{

    public Mage(){
	HP = 150;
	strength = 40;
	magic = 100;
	defense = 15;
	attackR = .8;
    }
 public Mage(String n){
	this();
	name = n;
    }

	public String about(){
		return "Mage is third strongest.";}
	
	public void specialize(){
	defense =(int)( defense * 0.8);
	attackR += .7; }

    public void normalize(){
	defense = oldDef;
	attackR = oldAtt; }

	
}
