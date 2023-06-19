package composite.before.handler;

import java.util.List;

public class SessionLogoutHandler implements LogoutHandler {

    private final List<LogoutHandler> subHandlers;

    public SessionLogoutHandler(List<LogoutHandler> subHandlers) {
        this.subHandlers = subHandlers;
    }

    @Override
    public void logout() {
        System.out.println("Clear Session.");

        for (LogoutHandler subHandler : subHandlers) {
            subHandler.logout();
        }
    }
}