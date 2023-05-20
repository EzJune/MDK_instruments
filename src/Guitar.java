public class Guitar implements Instruments
{
    private int cordNumber;

    public int getCordNumber()
    {
        return cordNumber;
    }

    public void setCordNumber(int cordNumber)
    {
        this.cordNumber = cordNumber;
    }

    @Override
    public void play()
    {
        String cordNumber = "ДО-мажор";
        System.out.println("Играет гитара на аккорде " + cordNumber);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Guitar)) return false;

        Guitar guitar = (Guitar) o;

        return cordNumber == guitar.cordNumber;
    }

    @Override
    public int hashCode()
    {
        return cordNumber;
    }

    @Override
    public String toString()
    {
        return "Guitar{" +
                "cordNumber=" + cordNumber +
                '}';
    }
}
