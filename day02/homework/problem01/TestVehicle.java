package day02.homework.problem01;

public class TestVehicle {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.setSpeed(120);
		v.setSize(100);
		System.out.println("Vehicle�Ĵ�С�ǣ�"+v.getSize());
		System.out.println("Vehicle���ٶ��ǣ�"+v.getSpeed());
		
		v.speedDown();
		v.speedUp();
		
	}

}
