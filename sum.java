class Sum
{
    public void add(int num1,int num2)
    {
        int add=num1+num2;
        System.out.println("Integer Sum="+add);
    }
    public void add(float num1,float num2)
    {
        float add=num1+num2;
        System.out.println("float Sum="+add);
    }
    public static void main(String args[])
    {
        Sum s= new Sum();
        s.add(56.3f,89.56f);
    }
}