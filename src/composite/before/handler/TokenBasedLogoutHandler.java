package composite.before.handler;

import java.util.List;

public class TokenBasedLogoutHandler implements LogoutHandler {

    private final List<LogoutHandler> subHandlers;

    public TokenBasedLogoutHandler(List<LogoutHandler> subHandlers) {
        this.subHandlers = subHandlers;
    }

    @Override
    public void logout() {
        System.out.println("Revoke Token.");

        for (LogoutHandler subHandler : subHandlers) {
            subHandler.logout();
        }
    }
}