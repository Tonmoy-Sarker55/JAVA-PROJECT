public class FireService extends Service
{
    public FireService(String name, String address, String phone) 
    {
        super(name, address, phone);
    }

    public String getInfo() 
    {
        return "FIRE SERVICE: " + getName()+
               "\nADDRESS: "+getAddress()+
               "\nPHONE: "+getPhone();

    }
}