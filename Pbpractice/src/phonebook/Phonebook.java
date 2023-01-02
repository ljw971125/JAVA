package phonebook;

public class Phonebook {

	String name;
	String hp;
	String memo;
	
	public Phonebook() {
	// TODO Auto-generated constructor stub
	}

	public Phonebook(String name, String hp, String memo) {
		this.name=name;
		this.hp=hp;
		this.memo=memo;
	}

	@Override
	public String toString() {
		return "Phonebook [name=" + name + ", hp=" + hp + ", memo=" + memo + "]";
	}

	
	
	

}
