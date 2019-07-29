class AnagramString{
	public static void main(String args[]){
		if(args.length!=2)
		{
			System.out.println("Too few arguements");
			System.out.println("i.e. java AnagramString <String1> <String2>");
			System.exit(0);
		}
		
		String first = args[0];
		String second = args[1];
		int a1[] = new int[127];
		int a2[] = new int[127];
		int flag = 0;
		if(first.length() != second.length())
		{
			System.out.println("Strings are not an anagram.");
		}
		else
		{
			int i,j;
			for(i=0;i<first.length();i++)
			{
				a1[first.codePointAt(i)]++;
			}
			for(j=0;j<second.length();j++)
			{
				a2[second.codePointAt(j)]++;
			}
			int StringLength = a1.length;
			for(i=0;i<StringLength;i++)
			{
				if(a1[i] == a2[i])
				{
					 flag = 1;
				}
				else
				{
					flag = 0;
					break;
				}
			}
			if(flag == 1)
			{
				System.out.println("Strings are anagram.");
			}
			else
			{
				System.out.println("Strings are not anagram.");
			}	
		}	
	}
}