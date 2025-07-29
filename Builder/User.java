public class User {
    
    private int id;
    private String name;
    private String email;



    private User(UserBuilder userBuilder){
        this.name = userBuilder.name;
        this.email = userBuilder.email;
        this.id = userBuilder.id;
    }

    
    
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
    }



    public static UserBuilder builder()
    {
        return new UserBuilder();
    }

    public static class UserBuilder{

        private int id;
        private String name;
        private String email;
            
        public UserBuilder id(int id)
        {
            this.id = id;
            return this;
        }

        public UserBuilder name(String name)
        {
            this.name = name;
            return this;
        }

        public UserBuilder email(String email)
        {
            this.email = email;
            return this;
        }


        public User build(){
            return new User(this);
        }
    }
    
}
