public class Main
{

    public static void main(String[] args)
    {
        double average1 = getAverage(40, 50);
        double average2 = getAverage(1,2,3);
        double average3 = getAverage('a', 'c');

        System.out.println("average1: "+ average1);
        System.out.println("average2: "+ average2);
        System.out.println("average3: "+ average3);


    }
    public static double getAverage(double one, double two)
    {
        return  (one + two)/2.0;
    }
    public static double getAverage(double first, double second, double third)
    {
        return  (first+second+third)/3.0;
    }
    public static char getAverage(char first, char second)
    {
        return (char)(((int)first +(int)second)/2);
    }
}
