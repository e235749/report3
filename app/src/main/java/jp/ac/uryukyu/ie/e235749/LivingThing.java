package jp.ac.uryukyu.ie.e235749;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃を指定する
     * @param name 名前
     * @param maximumHP 最大HP
     * @param attack 攻撃力
     */

    public LivingThing(String name, int maximumHP, int attack){
        this.name = name;
        this.hitPoint = maximumHP;
        this.attack = attack;
        this.dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }
    public int getHitPoint() {
        return hitPoint;
    }
    public boolean isDead(){
        return dead;
    }
    public String getName(){
        return name;
    }    
    public void attack(LivingThing opponent){
        if (dead){
            System.out.println(name + "は死亡しているため、攻撃できない！");
        }else {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }


}
