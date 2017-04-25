/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlequest.iv;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Drew
 */
public class Hero {
   
   private int myAttack;
   private double myDefense;
   private int myLevel;
   private int myGold;
   private int myHp;
   private int numPotions;
   
    public Hero(int attack, double defense, int gold, int level, int hp){
       myAttack = attack;
       myDefense = defense;
       myLevel = level;
       myGold = gold;
       myHp = hp;
    }
   
   public Hero(int attack, double defense, int gold, int level, int hp, int numPot){
       myAttack = attack;
       myDefense = defense;
       myLevel = level;
       myGold = gold;
       myHp = hp;
	   numPotions = numPot;
	}
   
   public void setAttack(int attack){
        myAttack = attack;
    }
    
    public int getAttack(){
        return myAttack;
    }
     public void setHp(int hp){
        myHp = hp;
    }
    
    public int getHp(){
        return myHp;
    }
     public void setGold(int gold){
        myGold = gold;
    }
   
    public int getGold(){
        return myGold;
    }
     public void setDefense(int defense){
        myDefense = defense;
    }
    
    public double getDefense(){
        return myDefense;
    }
     public void setLevel(int level){
        myLevel = level;
    }
    
    public int getLevel(){
        return myLevel;
    }
    
   public void attack(Enemy enemy){
       int oldHp = enemy.getHp();
       int L = myLevel;
       int P = myAttack;
       int A = enemy.getDefense();
       double damage = ((((((2*L)/5)+2)*P)/50)*A);
       enemy.setHp(oldHp - damage);
   }
   
   public void usePotion(){
       if (numPotions > 0){
		   myHp += 200;
		   numPotions--;
	   }
   }
   public void setPotions(int p){
        numPotions = p;
   }
   
    protected int getRanNum(Integer[] randomNumber) {
        int randReturn; 
        
        if(randomNumber.length <= 0) {
            randReturn = ThreadLocalRandom.current().nextInt(10, 26);
        } else  {
            randReturn = randomNumber[0];
        }
        
        return randReturn;
    }
    
    public int hCalcGoldDrop(Integer... randomNumber){
        int goldDrop;
        goldDrop = (int) ((myLevel/3)*((getRanNum(randomNumber))*0.5));
        return goldDrop;
   }
   
   public void levelUp(){
       myLevel++;
   }
   
}
