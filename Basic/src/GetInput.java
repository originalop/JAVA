import java.io.*;
class GetInput
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        String name=br.readLine();
        System.out.print("Enter your sex: ");
        char sex=br.readLine().charAt(0);// It only accept single character. If you type `M` and press `enter` button then it add `M\n` into input. Next line value won't be accepted. When you get input into character, it get ASCII value, so you have to convert into character before displaying output.
        // Accept integer value from keyboard.
        System.out.print("Enter your age: ");
        String tempAge=br.readLine();
        int age=Integer.parseInt(tempAge);// Convert String into integer
        System.out.print("Enter your weight: ");
        String tempWeight=br.readLine();
        float weight=Float.parseFloat(tempWeight);
        System.out.println("Your name is: "+name);
        System.out.println("Your age is: "+age);
        System.out.println("Your sex is: "+sex);
        System.out.println("Your weight is: "+weight);
    }
}