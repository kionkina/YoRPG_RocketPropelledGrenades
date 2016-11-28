public class Mage extends Character{

    public Mage(){
	maxHP = 150;
	HP = maxHP;
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
		return "Mage is third strongest: maxHP = 150";}
	
	public void specialize(){
	defense =(int)( defense * 0.6);
	attackR = Math.random() + 1 ; }

    public void normalize(){
	defense = 15;
	attackR = .8; }

	
}
