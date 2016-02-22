package high.extend;
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
	Cleric(String name, int hp,int mp) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	public Cleric(String name, int hp) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.hp = hp;
		this.name = name;
		this.mp = MP;
	}
	public Cleric(String name) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.hp = HP;
		this.name = name;
		this.mp = MP;
	}

	void state(){
		System.out.println("名前：" + this.name);
		System.out.println("hp：" + this.hp);
		System.out.println("mp：" + this.mp);
	}
}
