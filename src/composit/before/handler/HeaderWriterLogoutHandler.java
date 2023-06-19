package composit.before.handler;

public class HeaderWriterLogoutHandler implements LogoutHandler {

    @Override
    public void logout() {
        System.out.println("Set header.");
    }
}