package phonebook;
public class Phone1 {
	String name;
	String hp;
	String memo;
	
	public Phone1() {
	// TODO Auto-generated constructor stub
	}

	public Phone1(String name, String hp, String memo) {
		this.name=name;
		this.hp=hp;
		this.memo=memo;
	}

	@Override
	public String toString() {
		return "Phonebook [name=" + name + ", hp=" + hp + ", memo=" + memo + "]";
	}

	
	
	

}
