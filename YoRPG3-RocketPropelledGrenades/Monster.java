public class Monster extends Character{

    private int mDefense;
   
    public Monster(int k){
       	maxHP = k;
       	HP = maxHP;
	/*returns a random integer in a range by returning the 
	  sum of the minimum value and M.r() * (max - min) */
	strength= (int)(20 + (Math.random() * 45));
	defense= 20;
	mDefense = 20;
	attackR = 1;
    }

 public String about(){
	 return "This is a monstaa";
 }

	public void specialize(){
	defense =(int)( defense * 0.8);
	attackR = Math.random() + 1 ; }

    public void normalize(){
	defense = 20;
	attackR = 1; }
	
}

    
