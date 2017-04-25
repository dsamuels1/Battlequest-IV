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
        Hero mew = new Hero(250,300,30,50,5000);
        Enemy mewTwo = new Enemy(275,250,50,75,1250);
        mew.attack(mewTwo);
        assertEquals(5000 - 480, mew.getHp());
    }
    
     @Test
    public void HeroDropGoldTest(){
        Hero hero = new Hero(10, 10, 500, 21, 50000);
        int expected = 42;
        int actual = hero.hCalcGoldDrop(12);
        assertEquals(expected,hero.hCalcGoldDrop(12), .0001);
        actual = hero.hCalcGoldDrop();
        assertNotNull(actual);    
    }
        
    }
    
    @Test
    public void levelUpTest(){
        Hero Bob = new Hero(20, 20, 20, 2, 5000);
		Bob.levelUp();
		assertEquals(3, Bob.getLevel());
    }
    
    @Test
    public void usePotionTest(){
        Hero Bob = new Hero(20, 20, 20, 2, 5000, 1);
        Bob.usePotion();
	assertEquals(5200, Bob.getHp());
    }
    
    @Test
    public void EnemyAttackTest(){
        Hero mew = new Hero(5,5,30,5,5000);
        Enemy mewTwo = new Enemy(5,5,500,5);
        mewTwo.attack(mew);
        assertEquals(mew.getHp(), 4998);
        mew.attack(mewTwo);
        System.out.println(mewTwo.getHp(), 498);
    }
    
    @Test
    public void EnemyDropGoldTest(){
        int drop = 0;
       int myLevel = 10;
       int min = 10;
       int max = 26;
       
       drop = ((myLevel / 3) * (min + (int)(Math.random() * ((max - min) + 1))));
        
        Enemy doucher = new Enemy(5, 5, 500, 5);
        int newGold = doucher.calcGoldDropped();
        assertEquals(calcGoldDropped(newGold), drop);
        System.out.println("Gold dropped is" + doucher.calcGoldDropped());
    }
}
