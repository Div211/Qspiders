public class bank {
     public static void main (String[]args) {
    	 ATM ref = new ATM();
    	 System.out.println("current balance");
    	 System.out.println(ref.getPaisa());
    	 ref.withdraw();
    	 ref.setWithdrawPaisa(ref.withdraw);
    	 System.out.println(ref.getPaisa());
    	 ref.setDepositPaisa(ref.deposit);
    	 ref.deposit();
    	 System.out.println(ref.getPaisa());
     }
}
class ATM {
	private double paisa =98765.00;
	double withdraw = 10000;
	double deposit= 7789;
	 public double getPaisa(){
		 return paisa;
	 }
	 public void setWithdrawPaisa(double paisa) {
		 this.paisa-=paisa;
	 }
	 public void setDepositPaisa(double paisa) {
		 this.paisa+=paisa;
	 }
	 public void deposit() {
		System.out.println("After Deposits....");
	}
	public  void withdraw() {
		System.out.println("After Withdraw....");
	}
}