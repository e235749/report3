package jp.ac.uryukyu.ie.e235749;

public class Warrior extends Hero {
    public Warrior(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }

    public void attackWithWeaponSkill(LivingThing opponent){
        if (isDead()){
            System.out.println(getName() + "は死亡しているため、攻撃できない！");
        }else{
            int damage = (int) (getAttack()*1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
}