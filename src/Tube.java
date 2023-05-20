public class Tube implements Instruments
{
    private String diameter;

    public String getDiameter()
    {
        return diameter;
    }

    public void setDiameter(String diameter)
    {
        this.diameter = diameter;
    }

    @Override
    public void play()
    {
        diameter = "10";
        System.out.println("Играет труба с диаметром " + diameter);
    }

}