package RPG;
/**
 *
 */

/**
 * @author internous
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	// TODO 自動生成されたメソッド・スタブ
		//勇者よ、この仮想世界に生まれよ
		 //1.勇者作成
		Hero h = new Hero();
		 //2.フィールドを初期値にセット
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者" + h.name + "を生み出しました");

		//cleric作成
		 //1.作成
		Cleric c = new Cleric();
		c.name = "田中";
		c.hp = 50;
		c.mp = 10;

		//お化けきのこよ、この仮想世界に生まれよ
		 //お化けきのこA
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		//お化けきのこB
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		//勇者とお化けきのこ、行動する
		c.selfAid();
		c.pray(1);
		//勇者よ、戦え
		//お化けきのこよ、逃げろ

	}

}
