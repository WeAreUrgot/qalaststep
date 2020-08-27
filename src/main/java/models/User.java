package models;

public class User {
    private String email;
    private String password;

    public static class Builder{
        private User newbieUser;
        public Builder() {
            newbieUser = new User();
        }
        public Builder withEmail(String email) {
            newbieUser.email = email;
            return this;
        }
        public Builder withPassword(String password) {
            newbieUser.password = password;
            return this;
        }

        public User build() {
            return newbieUser;
        }
    }
    public String getMail() {
        return email;
    }
    public String getPass() {
        return password;
    }
}
