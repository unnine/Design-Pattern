package templatemethod.after.auth;

public class HttpHeaderJwtFilter extends HttpJwtFilter {

    @Override
    protected String getJwtFromRequest() {
        return "jwt of authorization header";
    }
}