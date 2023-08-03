package strategy.after.auth;

public class HttpHeaderJwtResolver implements HttpJwtResolver {

    @Override
    public String getJwtFromRequest() {
        return "jwt of authorization header";
    }
}