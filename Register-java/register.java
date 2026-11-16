class register {
    private String username;
    private String email;
    private String password;

    public void register(String username, String email, String password) {
        if(username == null || username.length() < 3) {
            System.out.println("Error: Username must be at least 3 characters.");
            return;
        }
        if(email == null || !email.contains("@")) {
            System.out.println("Error: Invalid email format.");
            return;
        }
        if(password == null || password.length() < 6) {
            System.out.println("Error: Password must be at least 6 characters.");
            return;
        }
        this.username = username;
        this.email = email;
        this.password = password;
        System.out.println("User '" + this.username + "' registered successfully!");
    }

    public static void main(String[] args) {
        register user = new register();
        user.register("al", "alice@gmail.com", "pass123");
        user.register("alice", "alicemail.com", "pass123");
        user.register("alice", "alice@mail.com", "secret123");
    }
}