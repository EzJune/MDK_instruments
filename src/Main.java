public class Main
{
    public static void main(String[] args)
    {
        Instruments[] instruments = new Instruments[3];
        instruments[0] = new Guitar();
        instruments[1] = new Drums();
        instruments[2] = new Tube();

        for (Instruments instrument : instruments)
        {
            instrument.play();
        }
    }
}