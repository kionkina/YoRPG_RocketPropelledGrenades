public class Tank extends Character{

    public Tank(){
	maxHP = 300;
	HP = maxHP;
	strength = 40;
	magic = 40;
	defense = 40;
	attackR = 0.65;
    }
 public Tank(String n){
	this();
	name = n;
    }
 
public String about(){
	return  "Tank owns an abundance of health points: maxHP = 300";
}
	
	public void specialize(){
	defense =(int)( defense * 0.8);
	attackR = Math.random() + 1 ; }

    public void normalize(){
	defense = 40;
	attackR = .65; }
	
	
}
