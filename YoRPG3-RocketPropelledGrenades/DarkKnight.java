public class DarkKnight extends Character{
	
    public DarkKnight(){
	HP = 175;
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
		
		return "DarkKnight possesses remarkable strength";
		
	}
	
	
	public void specialize(){
	defense =(int)( defense * 0.8);
	attackR += .7; }

    public void normalize(){
	defense = oldDef;
	attackR = oldAtt; }

}
