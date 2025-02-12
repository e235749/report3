package jp.ac.uryukyu.ie.e235749;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    void attackWithWeaponSkillTest() {
        Warrior warrior = new Warrior("戦士", 100, 30);
        Enemy enemy = new Enemy("モンスター", 100, 10);

        int expectedDamage = (int) (warrior.getAttack() * 1.5);
        int initialEnemyHP = enemy.getHitPoint();

        for (int i = 1; i <= 3; i++) {
            warrior.attackWithWeaponSkill(enemy);
            assertEquals(initialEnemyHP - i * expectedDamage, enemy.getHitPoint(), "ダメージが期待通りではありません。");
        }
    }
}
