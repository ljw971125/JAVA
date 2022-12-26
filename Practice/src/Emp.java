
public class Emp {
String id;//사번
String name;//이름
int year;//근무년수
int salary;//연봉

public Emp() {
	
}
public Emp(String id, String name, int year) {
	this.id = id;//생성자 함수
	this.name = name;
	this.year = year;
	calSalary();
	
}
int calSalary(int year) {
	int salary=0;
	if(year<1) {
		salary=30000000;
	}else if(year<3) {
		salary=33000000;
	}else if(year<5) {
		salary=40000000;
	}else if(year<8) {
		salary=50000000;
	}else {
		salary=99000000;
	}
	return salary;
}
void calSalary() {
	int salary=0;
	if(year<1) {
		salary=30000000;
	}else if(year<3) {
		salary=33000000;
	}else if(year<5) {
		salary=40000000;
	}else if(year<8) {
		salary=50000000;
	}else {
		salary=99000000;
	}
}
	int calMonthSalary(){
		return salary/12;
		
	}
	int calMonthSalary(int salary) {
		return salary/12;
	}
	void print() {
		System.out.println("사번:"+id);
		System.out.println("이름:"+name);
		System.out.println("근무년수:"+id);
		System.out.println("연봉:"+salary);
		System.out.println("월급여:"+calMonthSalary());
		
		
	}
}

