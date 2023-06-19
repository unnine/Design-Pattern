package composit.before.handler;

public class SessionClearingLogoutHandler implements LogoutHandler {

    @Override
    public void logout() {
        System.out.println("Clear Session.");
    }
}