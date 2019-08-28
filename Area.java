package FirstWeekDay3;
import java.util.Scanner;
public class Area {
    public static void main(String[]args){
        Scanner rectangle = new Scanner(System.in);
        System.out.print("Length");
        int length = rectangle.nextInt();
        System.out.print("Width");
        int width = rectangle.nextInt();
        int area = length*width;
        System.out.print("The area of rectangle is:"+area);



    }
}
