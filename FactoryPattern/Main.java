public class Main {
    public static void main(String[] args) {
        Developer dev1 = DeveloperSupplyImpl.getDeveloper("web");
        System.out.println(dev1.developerType());
        System.out.println(dev1.developerSalary());

        Developer dev2 = DeveloperSupplyImpl.getDeveloper("android");
        System.out.println(dev2.developerType());
        System.out.println(dev2.developerSalary());
    }
}
