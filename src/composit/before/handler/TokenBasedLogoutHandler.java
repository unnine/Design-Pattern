package composit.before.handler;

public class TokenBasedLogoutHandler implements LogoutHandler {

    @Override
    public void logout() {
        System.out.println("Revoke Token.");
    }
}