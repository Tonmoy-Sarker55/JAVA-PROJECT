public class Thana extends Service
{
    public Thana(String name, String address, String phone) 
    {
        super(name, address, phone);
    }

    
    public String getInfo() 
    {
        return "THANA NAME: " + getName()+
               "\nTHANA ADDRESS: "+getAddress()+
               "\nTHANA PHONE: "+getPhone();
    }
}