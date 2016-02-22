package RPG;
import java.util.Random;

/**
 *
 */

/**
 * @author internous
 *
 */
public class Cleric {
	String name;
	int hp=50,mp=10;
	final int HP = 50;
	final int MP = 10;

	void selfAid(){
		this.mp = MP;
		this.mp -=5;
		this.hp = HP;
		System.out.println(this.name +"のhpが全回復した。");
		System.out.println("現在の" + this.name + "のHP:" + this.hp);
		System.out.println("現在の" + this.name + "のMP:" + this.mp);
	}

	void pray(int sec){
		System.out.println(this.name +"は" + sec + "秒間天に祈った");
		int recover = new Random().nextInt(3) + sec;

		int recoverActual = Math.min(this.MP - this.mp, recover);
		this.mp += recoverActual;
		System.out.println(this.name +"のmpが" + recoverActual + "回復した");
		System.out.println("現在の" + this.name + "のMP:" + this.mp);
	}
}
