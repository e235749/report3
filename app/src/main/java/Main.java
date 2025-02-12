import jp.ac.uryukyu.ie.e235749.*;

public class Main {
    public static void main(String[] args){
        // HeroをWarriorに変更
        //Hero hero = new Hero("勇者", 10, 5);
        Warrior warrior = new Warrior("戦士", 20, 5);
        Enemy enemy = new Enemy("スライム", 10, 3);

        //System.out.printf("%s vs. %s\n", hero.getName(), enemy.getName());
        System.out.printf("%s vs. %s\n", warrior.getName(), enemy.getName());

        int turn = 0;
        while( warrior.isDead() == false && enemy.isDead() == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            warrior.attackWithWeaponSkill(enemy); // 通常攻撃からスキル攻撃へ変更
            enemy.attack(warrior);
        }
        // while( hero.isDead() == false && enemy.isDead() == false ){
        //     turn++;
        //     System.out.printf("%dターン目開始！\n", turn);
        //     hero.attack(enemy);
        //     enemy.attack(hero);
        System.out.println("戦闘終了");
    }
}
