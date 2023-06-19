package composite.before;

public class Main {

    public static void main(String[] args) {
        LogoutSuccessHandler successHandler = new LogoutSuccessHandler();
        successHandler.tokenBasedLogout();
        System.out.println();
        successHandler.sessionBasedLogout();
    }

}