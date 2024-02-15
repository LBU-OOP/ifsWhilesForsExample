public class Week3
{

    public static void main(String[] args)
    {
        System.out.println("in static");
        Week3 obj = new Week3();
        obj.go();

    }

    public void go()
    {
        System.out.println("first line of actual code");
        printstar(10);

        int big;
        big = biggest(10,10);
        System.out.println("Biggest is "+big);
    }

    public void printstar(int num)
    {
        //for count = 0 to 9 step 1
        int count;
        for(count = num-1; count >= 0; count--  )
        {
            System.out.println(count);
        }
        System.out.println();
        count = num-1;
        while(count >= 0)
        {
            System.out.println(count);
            count--;
        }
    }

    public int biggest(int num1, int num2)
    {
        if(num1 > num2)
        {
            return num1;
        }
        else if(num2 > num1)
        {
            return num2;
        }
        return 0;
    }
}