package templatemethod.before.auth;

public class HttpJwtFilter {

    public String getJwt(boolean fromCookie) {
        if (fromCookie) {
            return getJwtFromRequestCookie();
        }
        return getJwtFromRequestHeader();
    }

    private String getJwtFromRequestCookie() {
        return "jwt of cookie";
    }

    private String getJwtFromRequestHeader() {
        return "jwt of authorization header";
    }

}