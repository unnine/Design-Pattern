package composite.before.handler;

public class HeaderWriterLogoutHandler implements LogoutHandler {

    @Override
    public void logout() {
        System.out.println("Clear Header.");
    }
}