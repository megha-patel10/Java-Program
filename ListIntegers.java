class ListIntegers{
    public static void main(String args[]){
        if(args.length!=3){
            System.out.println("ERROR:::TOO FEW ARGUMENT");
            System.out.println("i.e. java ListIntegers <range1> <range2> <divisibleNumber>");
            System.out.println("<range1> - Enter number where you want to start");
            System.out.println("<range2> - Enter number where you want to end");
            System.out.println("<divisibleNumber> - Enter number by which you want to check");
            System.exit(0);
        }
        int range1 = Integer.parseInt(args[0]);
        int range2 = Integer.parseInt(args[1]);
        int divisibleNumber = Integer.parseInt(args[2]);
        for(int i = range1; i <= range2; i++)
        {
            if(i % divisibleNumber == 0)
                System.out.println(i);
        }
    }
}