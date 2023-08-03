package strategy.after.auth;

public class HttpCookieJwtResolver implements HttpJwtResolver {

    @Override
    public String getJwtFromRequest() {
        return "jwt of cookie";
    }
}