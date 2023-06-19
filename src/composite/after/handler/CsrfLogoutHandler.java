package composite.after.handler;

public class CsrfLogoutHandler implements LogoutHandler {

    @Override
    public void logout() {
        System.out.println("Revoke CSRF Token.");
    }
}
