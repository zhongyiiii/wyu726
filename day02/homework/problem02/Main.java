package day02.homework.problem02;

public class Main {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("Tom");
		Person p3 = new Person("Tom", "male");
		Person p4 = new Person("Tom", "male", 18);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		
	}
}
