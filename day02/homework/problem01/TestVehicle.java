package day02.homework.problem01;

public class TestVehicle {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.setSpeed(120);
		v.setSize(100);
		System.out.println("Vehicle的大小是："+v.getSize());
		System.out.println("Vehicle的速度是："+v.getSpeed());
		
		v.speedDown();
		v.speedUp();
		
	}

}
