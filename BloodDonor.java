public class BloodDonor extends Service
{
    private String bloodGroup; 

    public BloodDonor(String name, String bloodGroup, String phone) 
    {
        super(name,"",phone); 
        this.bloodGroup = bloodGroup;
    }
    public void setBloodGroup(String bloodGroup)
    {
        this.bloodGroup=bloodGroup;
    }
    public String getBloodGroup()
    {
        return bloodGroup;
    }

   public String getInfo() 
	{
		return "BLOOD DONOR NAME: " + getName() + 
			"\nBLOOD GROUP: " + getBloodGroup() +
			"\nPHONE: " + getPhone() + "\n";
	}
}


