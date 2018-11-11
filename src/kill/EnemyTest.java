package kill;

public class EnemyTest extends LivingThingTest{

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     */
    public EnemyTest (String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);
    }


    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */

    @Override
    public void wounded(int damage){
        cal_damage(damage);
        if( this.getHitPoint() < 0 ) {
            this.setDead(true);
            System.out.printf("モンスター%sは倒れた。\n", this.getName());
        }
    }
}