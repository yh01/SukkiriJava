package extend;

public class SuperHero extends Hero{
	private boolean flying;
	public SuperHero(){
		super("a");
		System.out.println("SuperHeroのコンストラクタが動作");
	}

	public void fly(){
		this.setFlying(true);
		System.out.println("飛び上がる");
	}
	public void land(){
		this.setFlying(false);
		System.out.println("着地");
	}
	public boolean isFlying() {
		return flying;
	}
	public void setFlying(boolean flying) {
		this.flying = flying;
	}
	public void run(){
		System.out.println("撤退");
	}
	public void attack(Matango m){
		System.out.println(this.name + "の攻撃");
			super.attack(m);
		if(this.flying){
			super.attack(m);
		}
	}
}
