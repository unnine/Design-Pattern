package composite.after;

import composite.after.handler.CompositeLogoutHandler;
import composite.after.handler.CsrfLogoutHandler;
import composite.after.handler.HeaderWriterLogoutHandler;
import composite.after.handler.LogoutHandler;

public class LogoutSuccessHandler {

    public void tokenBasedLogout() {
        CompositeLogoutHandler tokenBasedLogoutHandler = new CompositeLogoutHandler(
                "Clear Token",
                new HeaderWriterLogoutHandler(),
                new CsrfLogoutHandler()
        );

        tokenBasedLogoutHandler.logout();
    }

    public void sessionBasedLogout() {
        LogoutHandler cookieClearingLogoutHandler = new CompositeLogoutHandler(
                "Clear Cookie",
                new HeaderWriterLogoutHandler()
        );

        LogoutHandler tokenBasedLogoutHandler = new CompositeLogoutHandler(
                "Revoke Token.",
                new HeaderWriterLogoutHandler(),
                new CsrfLogoutHandler()
        );

        LogoutHandler sessionLogoutHandler = new CompositeLogoutHandler(
                "Clear Session.",
                cookieClearingLogoutHandler,
                tokenBasedLogoutHandler
        );

        sessionLogoutHandler.logout();
    }

}
