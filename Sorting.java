class Sorting
{
	public static void main(String args[])
	{
		if(args.length == 0){
            System.out.println("ERROR:::TOO FEW ARGUEMENT");
            System.out.println("i.e. java Sorting <Number1> <Number2> ...<Numbern>");
            System.out.println("<Number> \n any real value");
			System.out.println("i.e. <java sort 25 3 12 >");
            System.exit(0);
        }
		int num=args.length;
		int a[]=new int [num];
		for(int i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(a[i]<a[j])
				{
					int tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
				}
			}
		}
		for(int i=0;i<num;i++)
		{
			System.out.println(a[i]);
		}
	}


}