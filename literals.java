//Literals in Java are a synthetic representation of boolean, character, numeric, or string data. 
//They are a means of expressing particular values within a program. 
//They are constant values that directly appear in a program and can be assigned now to a variable.

class Literals
{
    public static void main(String[] args) {

        int num = 0b101; //binary
        int num2 = 0x1E; //hexadecimal
        int num3 = 10_0_00_000; //counting zeros
        double num4 = 13e5; //exponentials
        float num5 = 1.2e3f;
        char ch = 'a'; //character is treated as an interger. It can be incremented. Can take an iteger value
        ch++;
        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(ch);
    }
}
//booleans cannot take integer values