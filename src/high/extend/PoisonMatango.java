package high.extend;

public class PoisonMatango extends Matango{
	private int poizonAtk = 5;
	public PoisonMatango(char n){
		super(n);
	}
	public int getPoizonAtk() {
		return poizonAtk;
	}
	public void attack(Hero h){
		super.attack(h);
		if(poizonAtk != 0){
			System.out.println("毒をまく");
			int dmg = h.getHp() / 5;
			h.setHp( h.getHp() - dmg);
			System.out.println(dmg + "のダメージ");
			this.poizonAtk--;
		}else if(poizonAtk == 0){
			System.out.println("毒がありません");
		}
	}
}
