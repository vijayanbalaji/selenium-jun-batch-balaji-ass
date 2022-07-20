package week1.day2;

public class myCar {
	
		public void applyBreak(){
			System.out.println("applyBreak");
		}
		
		public void stop() {
				System.out.println("stop it");
				}

		public void applyGear() {
				System.out.println("apply gear");
				}
		public void switchOnAc() {
			System.out.println("swith ON Ac");
		}
		public void Acclerate() {
			System.out.println("accelerate");
		}
		public static void main(String[] args) {
			myCar c=new myCar();
			c.applyBreak();
			c.applyGear();
			c.switchOnAc();
			c.Acclerate();

}
}
