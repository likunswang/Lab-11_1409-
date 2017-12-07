
/**
 * Write a description of class ProvinceTerritory here.
 *
 * @author Luke
 * @version Oct.13.2017
 */
public class ProvinceTerritory
{
    // instance variables - replace the example below with your own
    private String name;
    private int population;
    /**
     * @return name of the province
     */
    public String getName()
    {
        return name;
    }
    /**
     * @return population of the province
     */
    public int getPopulation()
    {
        return population;
    }
    /**
     * @param name of province
     */
    public void setName(String setName)
    {
        if(setName != null)
        {
            name = setName;
        }
        else
        {
            System.out.println("Error,Name cannot be empty.");
        }
    }
    /**
     * @param population of province
     */
    public void setPopulation(int setPopulation)
    {
        if(setPopulation >= 0)
        {
            population = setPopulation;
        }
        else
        {
            System.out.println("Error, population cannot be negative.");
        }
    }
    
    /**
     * @param name of province
     * @param population of province
     */
    public ProvinceTerritory(String name, int population)
    {
        if(name != null && population >= 0)
        {
            this.name = name;
            this.population = population;
        }
    }
}
