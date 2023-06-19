package composite.before;

import composite.before.handler.*;

import java.util.ArrayList;
import java.util.List;

public class LogoutSuccessHandler {

    public void tokenBasedLogout() {
        List<LogoutHandler> subHandlers = new ArrayList<>();
        subHandlers.add(new HeaderWriterLogoutHandler());
        subHandlers.add(new CsrfLogoutHandler());

        LogoutHandler handler = new TokenBasedLogoutHandler(subHandlers);
        handler.logout();
    }

    public void sessionBasedLogout() {
        List<LogoutHandler> subHandlersOfTokenBasesLogoutHandler = new ArrayList<>();
        subHandlersOfTokenBasesLogoutHandler.add(new HeaderWriterLogoutHandler());
        subHandlersOfTokenBasesLogoutHandler.add(new CsrfLogoutHandler());

        List<LogoutHandler> subHandlersOfSessionBasedLogoutHandler = new ArrayList<>();
        subHandlersOfSessionBasedLogoutHandler.add(new CookieClearingLogoutHandler(new HeaderWriterLogoutHandler()));
        subHandlersOfSessionBasedLogoutHandler.add(new TokenBasedLogoutHandler(subHandlersOfTokenBasesLogoutHandler));

        SessionLogoutHandler sessionLogoutHandler = new SessionLogoutHandler(subHandlersOfSessionBasedLogoutHandler);
        sessionLogoutHandler.logout();
    }

}
