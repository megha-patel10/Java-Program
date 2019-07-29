class NumberConverter
{
	public static void main(String agrs[])
	{
		if(args.length != 2){
            System.out.println("ERROR:::TOO FEW ARGUEMENT");
            System.out.println("i.e. java NumberConverter <numberType> <numberValue>");
            System.out.println("<numberType> \n 1.Decimal to Binary \n 2.Binary to Decimal");
			System.out.println("<numberValue> \n Any value ");
			System.out.println("i.e. javac NumberConverter 1 10");
            System.exit(0);
        }
		int numberType=Integer.parseInt(args[0]);
		int numberValue=Integer.parseInt(args[1]);
		int[] binary = new int[50];
		int i=0;
		if(numberType==1)
		{
			while(numberValue>0)
			{
				binary[i]=numberValue%2;
				numberValue=numberValue/2;
				i++;
			}
		   
			for(int j=i-1;j>=0;j--)
			{
				System.out.println(binary[j]);
			}
		}
		else if(numberType==2)
		{
			int flag=1;
			int binaryNumber=Integer.parseInt(args[1]);
			int decimal=0;
			while(binaryNumber!=0)
			{
				int reminder=binaryNumber%10;
				binaryNumber=binaryNumber/10;
				if(reminder==0 || reminder==1)
				{
					decimal = decimal+ reminder + Mathpow(2,i);
					i++;
					flag=1;
				}
				else
				{
					System.out.println("Binary number contain only 0's and 1's");
				}
			}
			if(flag==1)
			{
				System.out.println("Decimal number is:" + decimal);
			}
		}
		else
		{
			System.out.println("Invalid Choice");
		}
	}
}