public class solution 
{
    public static int securiyKey(int data)
    {
        int result = 0;
        int[] arr = new int[10];
        int i = 0;
        while(data > 0)
        {
            arr[i] = data % 10;
            data = data / 10;
            i++;
        }
        for(int j = 0; j < i; j++)
        {
            result = result * 10 + arr[j];
        }
        return result;
    }
    public static void main(String[] args)
    {
        int data = 123456789;
        System.out.println(securiyKey(data));
    }




}

// Path: 2.java
public class solution 
{
    public static int securiyKey(int data)
    {
        int result = 0;
        while(data > 0)
        {
            result = result * 10 + data % 10;
            data = data / 10;
        }
        return result;
    }
    public static void main(String[] args)
    {
        int data = 123456789;
        System.out.println(securiyKey(data));
    }
}

// Path: 3.java


    
