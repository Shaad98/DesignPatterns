public class Main{
    public static void main(String[] args) {
        User user = User
                        .builder()
                        .id(12)
                        .name("Shaad Bangi")
                        .email("shaadbangi04@gmail.com")
                        .build();
        System.out.println(user);
    }
}