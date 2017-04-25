/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlequest.iv;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Drew
 */
public class BattlequestIVTest {
    
    public BattlequestIVTest() {
    }
    
    @Test
    public void HeroAttackTest(){
        Hero mew = new Hero(5,5,30,5,5000);
        Enemy mewTwo = new Enemy(5,5,500,5);
        mewTwo.attack(mew);
        assertEquals(mew.getHp(), 4998);
    }
    
     @Test
    public void HeroDropGoldTest(){
        
    }
    
    @Test
    public void levelUpTest(){
        
    }
    
    @Test
    public void usePotionTest(){
        
    }
    
    @Test
    public void EnemyAttackTest(){
        Hero mew = new Hero(250,300,30,50,5000);
        Enemy mewTwo = new Enemy(275,250,50,75,1250);
        mewTwo.attack(mew);
        assertEquals(5000 - 480, mew.getHp());
    }
    
    @Test
    public void EnemyDropGoldTest(){
        
    }
}
