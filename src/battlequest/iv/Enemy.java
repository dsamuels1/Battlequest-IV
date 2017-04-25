/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlequest.iv;

/**
 *
 * @author Drew
 */
public class Enemy {
    
    private int myAttack;
    private double myDefense;
    private int myHp;
    private int myLevel;
    
    public Enemy(int attack, double defense, int hp, int level){
        myAttack = attack;
        myDefense = defense;
        myHp = hp;
        myLevel = level;
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
     public void setDefense(int defense){
        myDefense = defense;
    }
    
    public double getDefense(){
        return mydefense;
    }
     public void setLevel(int level){
        myLevel = level;
    }
    
    public int getLevel(){
        return myLevel;
    }
    
   public void attack(Hero hero){
       double newVal = hero.getHp() - ((2 * myLevel / 5 + 2) * myAttack) * hero.getDefense() / 50);
       if( newVal < 0 ) hero.setHp(0);
       else hero.setHp(newVal);
       
   }
    
   public int rand(){
       int rand = ThreadLocalRandom.current().nextInt(10, 26);
       return rand;
   }
    
   public int calcGoldDropped(){
       int drop = 0;

       drop = ((myLevel / 3) * rand());
       return drop;
   }
}
