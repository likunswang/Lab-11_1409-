
/**
 * Write a description of class Canada here.
 *
 * @author Luke
 * @version 13.Oct.2017
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Canada
{
    // instance variables - replace the example below with your own

    public static final int NO_SUCH_PROVINCE = -1;
    private ArrayList<ProvinceTerritory> provinces;
    /**
     * Constructor for objects of class Canada
     */
    public Canada()
    {

        provinces = new ArrayList<ProvinceTerritory>();

        provinces.add(new ProvinceTerritory("British Columbia", 4400057));
        provinces.add(new ProvinceTerritory("Alberta", 3645257));
        provinces.add(new ProvinceTerritory("Manitoba", 1208268));
        provinces.add(new ProvinceTerritory("New Brunswick", 751171));
        provinces.add(new ProvinceTerritory("Newfoundland and Labrador", 514536));
        provinces.add(new ProvinceTerritory("Northwest Territories", 41462));
        provinces.add(new ProvinceTerritory("Nova Scotia", 921727));
        provinces.add(new ProvinceTerritory("Nunavut", 31906));
        provinces.add(new ProvinceTerritory("Ontario", 12851821));
        provinces.add(new ProvinceTerritory("Prince Edward Island", 140204));
        provinces.add(new ProvinceTerritory("Quebec", 7903001));
        provinces.add(new ProvinceTerritory("Saskatchewan", 1033381));
        provinces.add(new ProvinceTerritory("Yukon", 33897));

    }

    /**
     * @return total population in Canada
     */
    public int getTotalPopulation()
    {
        Iterator<ProvinceTerritory> it = provinces.iterator();
        int totalPopulation = 0;
        while(it.hasNext())
        {
            ProvinceTerritory p = it.next();
            totalPopulation += p.getPopulation();
        }
        return totalPopulation;
    }

    /**
     * @return the name of the province/territory that has the lowest population
     */
    public String getLowestPopulation()
    {   
        Iterator<ProvinceTerritory> it = provinces.iterator();
        int lowestPopulation = provinces.get(0).getPopulation();
        String lowestProvince = null;
        while(it.hasNext())
        {
            ProvinceTerritory p = it.next();
            if(lowestPopulation > p.getPopulation())
            {
                lowestPopulation = p.getPopulation();
                lowestProvince = p.getName();
            }
        }
        return lowestProvince;
    }

    /**
     * @param  province name in Canada e.g. British Columbia
     * @param Alberta
     * @param Manitoba
     * @param New Brunswick
     * @param Newfoundland and Labrador
     * @param Northwest Territories
     * @param Nova Scotia
     * @param Ontario
     * @param Prince Edward Island
     * @param Quebec
     * @param Saskatchewan
     * @param Yukon
     * @return the population of the province
     */

    /**
     * @param  province name in Canada e.g. British Columbia
     * @param Alberta
     * @param Manitoba
     * @param New Brunswick
     * @param Newfoundland and Labrador
     * @param Northwest Territories
     * @param Nova Scotia
     * @param Ontario
     * @param Prince Edward Island
     * @param Quebec
     * @param Saskatchewan
     * @param Yukon
     * 
     * @return the population of the province, if the return value is -1, it means there's no such province.
     */
    public int getPopulation(String province)
    {
        int NO_SUCH_PROVINCE = -1;
        Iterator<ProvinceTerritory> it = provinces.iterator();

        while(it.hasNext())
        {
            ProvinceTerritory p = it.next();
            if(province.equalsIgnoreCase(p.getName()))
            {
                return p.getPopulation();
            }
        }
        return NO_SUCH_PROVINCE;

    }

    /**
     * @return a String of provinces names whose population is between minimum and maximum entered;
     */
    public String[] getProvincesWithPopulationBetween(int min, int max)
    {
        Iterator<ProvinceTerritory> it = provinces.iterator();
        String[] matchingProvinces;
        int totalMatchNumber = 0;

        while(it.hasNext())
        {
            ProvinceTerritory p = it.next();
            if(p.getPopulation() >= min && p.getPopulation() <= max)
            {
                totalMatchNumber++;
            }
        }
        matchingProvinces = new String[totalMatchNumber];
        int i = 0;
        
        Iterator<ProvinceTerritory> ita =provinces.iterator();
        while(ita.hasNext())
        {
            ProvinceTerritory p = ita.next();
            if(p.getPopulation() >= min && p.getPopulation() <= max)
            {
                matchingProvinces[i] = (p.getName());
                i++;
            }
        }
        return matchingProvinces;
    }

    /**
     * @param name of the province in Canada
     * @return true the name entered matches with the province name in canada, else, false
     */
    public boolean isProvinceInCanada(String name)
    {
        Iterator<ProvinceTerritory> it = provinces.iterator();

        while(it.hasNext())
        {
            ProvinceTerritory p = it.next();
            if(p.getName().equalsIgnoreCase(name))
            {
                return true;
            }
        }
        return false;
    }

    /**
     * @param a string
     * @return returns an array of the names of all provinces/territories whose name contains the string entered
     */
    public String[] getProvincesWhoseNameContains(String substring)
    {
        Iterator<ProvinceTerritory> it = provinces.iterator();

        String[] matchingProvinces;

        int numberOfMatchingProvinces = 0;

        substring = substring.toLowerCase();

        while(it.hasNext())
        {
            ProvinceTerritory p = it.next();
            if(p.getName().toLowerCase().contains(substring))
            {
                numberOfMatchingProvinces++;
            }
        }
        matchingProvinces = new String[numberOfMatchingProvinces];
        int index = 0;
        
        Iterator<ProvinceTerritory> ita = provinces.iterator();
        while(ita.hasNext())
        {
            ProvinceTerritory pa = ita.next();
            if(pa.getName().toLowerCase().contains(substring))
            {
                matchingProvinces[index] = pa.getName();
                index++;
            }
        }
        return matchingProvinces;
    }

    /**
     * @param a string
     * @return returns an array of the names of all provinces/territories whose name contains the string entered
     */
    public ProvinceTerritory[] getMoreProvincesWhoseNameContains(String substring)
    {
        ProvinceTerritory[] matchingProvinces;
        substring = substring.toLowerCase();
        int numberOfMatchingProvinces = 0;
        Iterator<ProvinceTerritory> it = provinces.iterator();

        substring = substring.toLowerCase();

        while(it.hasNext())
        {
            ProvinceTerritory p = it.next();
            if(p.getName().toLowerCase().contains(substring))
            {
                numberOfMatchingProvinces++;
            }
        }
        matchingProvinces = new ProvinceTerritory [numberOfMatchingProvinces];
        int index = 0;
        Iterator<ProvinceTerritory> ita = provinces.iterator();
        while(ita.hasNext())
        {
            ProvinceTerritory p = ita.next();
            if(p.getName().toLowerCase().contains(substring))
            {
                matchingProvinces[index] = new ProvinceTerritory(p.getName(), p.getPopulation());
                index++;
            }
        }
        return matchingProvinces;
    }

    /**
     * @param a charater
     * @return returns an array of the names of all provinces/territories whose name starts with the letter(charater) entered
     */
    public String[] getProvincesWhoseNameStartsWith(char letter)
    {
        String[] matchingProvinces;
        String substring = String.valueOf(letter);
        substring = substring.toLowerCase();

        int numberOfMatchingProvinces = 0;
        Iterator<ProvinceTerritory> it = provinces.iterator();

        while(it.hasNext())
        {
            ProvinceTerritory p = it.next();
            if(p.getName().toLowerCase().startsWith(substring))
            {
                numberOfMatchingProvinces++;
            }
        }
        matchingProvinces = new String[numberOfMatchingProvinces];
        int index = 0;
        
        Iterator<ProvinceTerritory> ita = provinces.iterator();

        while(ita.hasNext())
        {
            ProvinceTerritory p = ita.next();
            if(p.getName().toLowerCase().startsWith(substring))
            {
                matchingProvinces[index] = new String(p.getName());
                index++;
            }
        }
        return matchingProvinces;
    }

}

