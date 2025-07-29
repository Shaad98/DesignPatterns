public class DeveloperSupplyImpl {
    
    public static Developer  getDeveloper(String type)
    {
        if(type.trim().toLowerCase().equals("web"))
        {
            return new WebDeveloper();
        }
        else if(type.trim().toLowerCase().equals("android")){
            return new AndroidDeveloper();
        }else{
            return null;
        }
    }
}
