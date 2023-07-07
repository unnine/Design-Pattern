package templatemethod.after.auth;

public class HttpCookieJwtFilter extends HttpJwtFilter {

    @Override
    protected String getJwtFromRequest() {
        return "jwt of cookie";
    }
}