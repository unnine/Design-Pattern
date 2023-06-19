package composite.after.handler;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeLogoutHandler implements LogoutHandler {

    private final String message;
    private final List<LogoutHandler> handlers;

    public CompositeLogoutHandler(String message, LogoutHandler... handlers) {
        this.message = message;
        this.handlers = Arrays.asList(handlers);
    }

    @Override
    public void logout() {
        System.out.println(message);

        for (LogoutHandler handler : handlers) {
            handler.logout();
        }
    }
}
