package kill;

/**
 * Created by tnal on 2016/11/13.
 */
public class MainTest {
    public static void main(String[] args){
        HeroTest hero = new HeroTest("勇者", 10, 5);
        EnemyTest enemy = new EnemyTest("スライム", 6, 3);

        System.out.printf("%s vs. %s\n", hero.getName(), enemy.getName());

        int turn = 0;
        while( !hero.isDead() && !enemy.isDead() ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            hero.attack(enemy);
            enemy.attack(hero);
        }
        System.out.println("戦闘終了");
    }
}