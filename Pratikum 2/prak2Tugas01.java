public class prak2Tugas01
{
public static void main (String[]args)
{
        int num1 = 3;
        int num2 = 2;
        float num3 = 3;
        float num4 = 2;
               
        int hsl1 = num1 + num2;
        int hsl2 = num1 - num2;
        int hsl3 = num1 * num2;
        float hsl4 = num3 / num4;
        int hsl5 = num1 % num2;

        System.out.println ("berikut hasil outputnya : ");       
        System.out.println ("num1 + num2 " + num1 + "+" + num2 + "=" + hsl1);
        System.out.println ("num1 - num2 " + num1 + "-" + num2 + "=" + hsl2);
        System.out.println ("num1 * num2 " + num1 + "*" + num2 + "=" + hsl3);
        System.out.println ("num3 / num4 " + num3 + "/" + num4 + "=" + hsl4);
        System.out.println ("num1 % num2 " + num1 + "%" + num2 + "=" + hsl5);
        }
}
