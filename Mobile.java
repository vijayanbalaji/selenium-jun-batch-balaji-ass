package week1.day2;

public class Mobile {
		
		public void Call() {
				System.out.println("call");
		}

		public void sendMessage() {
			System.out.println("send message");
		}
	public void shareDocment() {
			System.out.println("share docment");
		}

	public static void main(String[] args) {
		Mobile mob=new Mobile();
		mob.Call();
		mob.shareDocment();
		mob.sendMessage();
	}




	}

