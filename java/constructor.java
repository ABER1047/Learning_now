public class constructor
{
String name;
int age;

//a single copy (all instance shares the values which are created by this class)
static int total_const_num = 0;

    constructor(String name, int age)
    {
    this.name = name;
    this.age = age;
    total_const_num ++;
    }
}
