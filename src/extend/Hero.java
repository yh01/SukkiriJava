package extend;
/**
 *
 */

/**
 * @author internous
 *
 */
public class Hero {
	public String name;
	private int hp = 100;

	public Hero(String n){
		this.name = n;
	}
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	void run(){
		System.out.println(this.name + "は、逃げ出した");
		System.out.println( "Gameover");
		System.out.println( "最終HPは" + this.hp + "でした");
	}

	public void attack(Matango m){
		m.hp-=5;
		System.out.println(this.name+"は攻撃した。敵に5のダメージ");
	}

	void sleep(){
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した");
	}
	final void sit(int sec){
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った");
		System.out.println( "HPが" + sec + "ポイント回復した");
	}
	void slip(){
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ");
		System.out.println( "5のダメージ");
	}

	public String getName(){
		return this.name;
	}
	public void setName(String name) {
		if(name == null){
			throw new IllegalArgumentException("名前が空なので処理中断");
		}
		if(name.length() <= 1){
			throw new IllegalArgumentException("名前が短いので処理中断");
		}
		if(name.length() >= 8){
			throw new IllegalArgumentException("名前が長いので処理中断");
		}
		this.name = name;

	}

}
