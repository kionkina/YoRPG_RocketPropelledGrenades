public class Tank extends Character{

    public Tank(){
	HP = 500;
	strength = 25;
	magic = 40;
	defense = 50;
	attackR = 0.6;
    }
 public Tank(String n){
	this();
	name = n;
    }
 
public String about(){
	return  "Tank owns an abundance of health points.";
}
	
	public void specialize(){
	defense =(int)( defense * 0.8);
	attackR += .7; }

    public void normalize(){
	defense = oldDef;
	attackR = oldAtt; }
	
	
}
