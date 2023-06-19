package composit.before.handler;

public class CookieClearingLogoutHandler implements LogoutHandler {

    @Override
    public void logout() {
        System.out.println("Clear Cookie.");
    }
}