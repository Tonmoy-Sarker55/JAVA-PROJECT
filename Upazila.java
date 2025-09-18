import java.util.*;

public class Upazila
{
    private String name;
    private Hospital[] hospitals;
    private int hospitalCount;

    private Thana thana;
    private FireService fireService;

    private BloodDonor[] donors;
    private int donorCount;

    public Upazila(String name) 
    {
        this.name = name;
        this.hospitals = new Hospital[10]; 
        this.donors = new BloodDonor[10];  
        this.hospitalCount = 0;
        this.donorCount = 0;
    }

    public String getName() 
    { 
        return name; 
    }

    
    public void addHospital(Hospital h) 
    {
        if (hospitalCount == hospitals.length) 
        {
            
            Hospital[] newHospitals = new Hospital[hospitals.length * 2];
            for (int i = 0; i < hospitals.length; i++) {
                newHospitals[i] = hospitals[i];
            }
            hospitals = newHospitals;
        }
        hospitals[hospitalCount++] = h;
    }

    public Hospital[] getHospitals() 
    {
        Hospital[] result = new Hospital[hospitalCount];
        for (int i = 0; i < hospitalCount; i++) 
        {
            result[i] = hospitals[i];
        }
        return result;
    }
    public void setThana(Thana t) 
    { 
        this.thana = t; 
    }
    public Thana getThana() 
    { 
        return thana; 
    }
    public void setFireService(FireService f) 
    { 
        this.fireService = f; 
    }

    public FireService getFireService() 
    { 
        return fireService; 
    }
    public void addDonor(BloodDonor d) 
    {
        if (donorCount == donors.length) 
        {
            BloodDonor[] newDonors = new BloodDonor[donors.length * 2];
            for (int i = 0; i < donors.length; i++) 
            {
                newDonors[i] = donors[i];
            }
            donors = newDonors;
        }
        donors[donorCount++] = d;
    }

    public BloodDonor[] getDonors() 
    {
        BloodDonor[] result = new BloodDonor[donorCount];
        for (int i = 0; i < donorCount; i++) 
        {
            result[i] = donors[i];
        }
        return result;
    }
}



