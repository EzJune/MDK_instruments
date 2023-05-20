import java.util.Objects;

public class Drums implements Instruments
{
    private String size;


    public String getSize()
    {
        return size;
    }

    public void setSize(String size)
    {
        this.size = size;

    }

    @Override
    public void play()
    {
        size = "12";
        System.out.println("Играет барабан с размером" + " " + size);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Drums)) return false;

        Drums drums = (Drums) o;

        return Objects.equals(size, drums.size);
    }

    @Override
    public int hashCode()
    {
        return size != null ? size.hashCode() : 0;
    }

    @Override
    public String toString()
    {
        return "Drum{" +
                "size='" + size + '\'' + '}';
    }
}
