public class Main {
    public static void main(String[] args)
    {
        int[] num = new int[10];

        for(int i = 0; i < num.length; i++)
        {
            num[i] = num.length-1-i;
        }
        for (int x:num)
        {
            System.out.println("array[" + x + "] = " + num[x]);
        }
    }
}