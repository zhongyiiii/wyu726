package day02.homework.problem02;

public class Person {
	private String name;
	private Integer age;
	private String gender;
	
	public Person() {
		super();
	}
	
	public Person(String name) {
		this.name = name;
		System.out.println("name:"+this.name);
	}
	
	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
		System.out.println("name:"+this.name+"..."+gender);
	}
	
	public Person(String name, String gender, Integer age) {
		this.age = age;
		this.name = name;
		this.gender = gender;
		System.out.println("name:"+this.name+"..."+gender+"..."+gender);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
}
