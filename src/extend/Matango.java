package extend;
/**
 *
 */

/**
 * @author internous
 *
 */
public class Matango {
	int hp = 50;
	private char suffix;
	public Matango(char suffix){
		this.suffix = suffix;
	}
	public void attack(Hero h){
		System.out.println("きのこ"+ this.suffix + "の攻撃");
		System.out.println("10ダメ");
		h.setHp(h.getHp() - 10);
	}

	void run(){
		System.out.println("お化けきのこ" + this.suffix + "は逃げ出した");
	}


	void ifDie(){
		if(this.hp == 0){
			System.out.println("お化けきのこ" + this.suffix + "死亡");
		}
	}
}
