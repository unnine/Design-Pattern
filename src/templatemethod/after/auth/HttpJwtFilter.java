package templatemethod.after.auth;

public abstract class HttpJwtFilter {

    public String getJwt() {
        return getJwtFromRequest();
    }

    protected abstract String getJwtFromRequest();

}