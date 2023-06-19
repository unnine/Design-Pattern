package composite.before.handler;

public class CookieClearingLogoutHandler implements LogoutHandler {

    private final LogoutHandler subHandler;

    public CookieClearingLogoutHandler(LogoutHandler subHandler) {
        this.subHandler = subHandler;
    }

    @Override
    public void logout() {
        System.out.println("Clear Cookie.");

        subHandler.logout();
    }
}