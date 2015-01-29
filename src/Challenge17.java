// Ayman Alghamdi
public class Challenge17 {
	public static void main(String[] args) {

		int SharesNum = 1000; // 
		double ShAmountPurch = 32.87;//The shares price when purchased 
		double ShMoney4Purch = SharesNum * ShAmountPurch;//The total amount for the shares when purchased
		double ShAmountSold = 33.92;// The shares price when sold
		double ShMoney4Sold = SharesNum * ShAmountSold;//The total amount for the shares when sold
		double SBAmountPurch = ShMoney4Purch * .02;//The amount giving to the broker for purchased
		double SBAmountSold = SharesNum * ShAmountSold * .02;//The amount giving to the broker for sold
		double SBprofit = SBAmountPurch + SBAmountSold;//The total profit for the broker 
		double Netprofit = ShMoney4Sold - ShMoney4Purch - SBprofit;//The net profit for Joy

		System.out
				.printf("Joy Purchased %d shares for $ %.2f. He paid for"
				+ " his broker $ %.2f for the purchase. \n After two weeks Joy sold his shares"
				+ " for $ %.2f , and paid $ %.2f commission for his broker.\n "
				+ "The net profet for Joy was for %.2f $, that means he lost.    ",
				SharesNum, ShMoney4Purch, SBAmountPurch, ShMoney4Sold, SBAmountSold, Netprofit );
	}
}
