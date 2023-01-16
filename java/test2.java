import java.util.Scanner;

public class test2
{
    public static void main(String[] args)
    {
    // scanner (= input)
    //define once
    Scanner scanner_name = new Scanner(System.in);
    
    
    //checking input value
    String keyboard_string = scanner_name.next();
        if (keyboard_string.equals("a") || keyboard_string.equals("A"))
        {
        System.out.print("pressed\n");
        }

    

    
    //strings scanner
    String test_string_val1 = scanner_name.nextLine();
    System.out.print("test1"+test_string_val1);
    
    String test_string_val2 = scanner_name.nextLine();
    System.out.print("test2"+test_string_val2);
    
    
    //int scanner
    int test_int_val2 = scanner_name.nextInt();
    System.out.print("test3"+test_int_val2);
    
    
    //arrays (only one dimension)
    int[] int_array = {1,2,3,4};
    System.out.print("int_array "+int_array[3]);
    
    String[] string_array = new String[4];
    string_array[0] = "A";
    string_array[1] = "B";
    string_array[2] = "C";
    string_array[3] = "D";
    System.out.print("string_array "+string_array[3]);
    
    
    //arrays (two dimension)
    int[][] sec_dimension_int_array = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
    System.out.print("sec_dimension_int_array "+sec_dimension_int_array[3][3]);
    
    String[][] rows_columns_string_array = new String[4][4];
    rows_columns_string_array[0][0] = "A";
    rows_columns_string_array[1][1] = "B";
    rows_columns_string_array[2][2] = "C";
    rows_columns_string_array[3][3] = "D";
    System.out.print("rows_columns_array "+rows_columns_string_array[3][3]);
    
    

    //////////////////////////////////////////////string functions//////////////////////////////////////////////
    //this returns length of value
    //test_value.length();
    
    //this returns the value which is positioning in "0"
    //test_value.charAt(0);
    
    //this returns the position of "A"
    //test_value.indexOf("A");
    
    //this returns is the value empty
    //test_value.isEmpty();
    
    //this function make strings to Upper text
    //test_value.toUpperCase();
    
    //this function make strings to Lower text
    //test_value.toLowerCase();
    
    //this function delete all of void string
    //ex : "h e l l o" -> "hello"
    //test_value.trim();
    
    //this function replace texts
    //replace(oldchar,newchar) -> old to new
    //test_value.replace("A","a");
    
    
    //////////////////////////////////////////////making functions//////////////////////////////////////////////
    hello("name",5);
    }
    
    //////////////////////////////////////////////making functions//////////////////////////////////////////////
    static void hello(String name, int age)
    {
    System.out.print("hello"+name+age);
    }
}