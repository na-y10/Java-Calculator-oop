class Calculator
{

    int number1 = 0;

    int number2 = 0;

    public int sum()
    {
        return  number1 + number2;
    }

    public int subtract()
    {
        return  number1 - number2 ;
    }

    public int multiply()
    {
        return  number1 * number2;
    }

    public float divide()
    {
        if(number2 == 0 )
        {
            System.out.println("Warning : Can not divide by zero");
            return -1;
        }
        return (float) number1 / number2;
    }

    public boolean isEqual()
    {
        return  ( number1 == number2);
    }
}
