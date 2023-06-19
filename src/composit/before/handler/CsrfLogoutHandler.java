package composit.before.handler;

public class CsrfLogoutHandler implements LogoutHandler {

    @Override
    public void logout() {
        System.out.println("Delete CSRF Token.");
    }
}