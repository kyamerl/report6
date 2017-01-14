package jp.ac.uryukyu.ie.e165721;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by e165721 on 2017/01/13.
 */

public class EnemyTest {
    /**
     * 「死んでる状態では攻撃できない」ことを確認。
     * @throws Exception
     */
    //@org.junit.Test
    @Test
    public void attack() throws Exception {
        int heroHP = 10;
        Hero hero = new Hero("テスト勇者", heroHP, 5);
        Enemy enemy = new Enemy("テストスライム", 6, 3);
        enemy.setDead(true);
        for(int i=0; i<10; i++) {
            enemy.attack(hero); //乱数で0ダメージとなることもあるため、複数回実行してみる。
        }
        assertEquals(heroHP, hero.getHitPoint());
    }


}