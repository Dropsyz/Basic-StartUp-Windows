public class Main {
    public static void main(String[] args) {
        idAndPassword idAndPassword = new idAndPassword();
        loginPage LoginPage = new loginPage(idAndPassword.getLoginInfo());
    }
}