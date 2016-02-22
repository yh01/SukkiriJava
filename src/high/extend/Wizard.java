package high.extend;

public class Wizard {
	String name;
	private int hp;
	private int mp;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name == null){
			throw new IllegalArgumentException();
		}
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		if(hp == 0){
			throw new IllegalArgumentException();
		}else if(hp <= 0){
			hp = 0;
		}
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		if(mp == 0){
			throw new IllegalArgumentException();
		}else if(mp <= 0){
			mp = 0;
		}
		this.mp = mp;
	}
	private Wand wand;
	void heal(Hero h){
		int basePoint = 10;
		int recovePoint = (int) (basePoint * this.wand.getPower());

		h.setHp(h.getHp() + recovePoint);
		System.out.println(h.getName() + "のhp"+ recovePoint + "回復");
	}

}
