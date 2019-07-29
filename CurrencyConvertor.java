class CurrencyConvertor{
	
	public static void main(String args[]){
		if(args.length!=2){
			System.out.println("Error: CurrencyConvertor some input needed\ni.e. CurrencyConvertor <currencyType> <currencyValue>");
			System.out.println("currencyType : \n 1)USD 2 INR \n 2)INR 2 USD");
			System.out.println("currencyValue is any real number");
			System.exit(0);
		}
		int currencyType=Integer.parseInt(args[0]);
		double currencyValue=Double.parseDouble(args[1]);
		double rate=70;
		if(currencyType==1){
			System.out.println("$"+currencyValue+" = "+(currencyValue*rate)+" INR");
		}
		else{
			System.out.println(currencyValue+" INR = $"+(currencyValue/rate));
		}
	}
}	