public class DarkKnight extends Character{
	
    public DarkKnight(){
	maxHP = 175;
	HP = maxHP;
	strength = 75;
	magic = 10;
	defense = 15;
	attackR = 1;

}

 public DarkKnight(String n){
	this();
	name = n;
    }
	
	public String about(){
		
		return "DarkKnight possesses remarkable strength:  maxHP = 175";
		
	}
	
	
	public void specialize(){
	defense =(int)( defense * 0.8);
	attackR = Math.random() + 1 ; }

    public void normalize(){
	defense = 15;
	attackR = 1; }

}
