public class Hospital extends Service
{
    public Hospital(String name, String address, String phone) 
    {
        super(name, address, phone);
    }

    public String getInfo() 
    {
        return "HOSPITAL NAME: " + getName()+
               "\nADDRESS: "+getAddress()+
               "\nPHONE: "+getPhone();

    }
}