package strategy.after.auth;

public class HttpJwtFilter {

    private final HttpJwtResolver httpJwtResolver;

    public HttpJwtFilter(HttpJwtResolver httpJwtResolver) {
        this.httpJwtResolver = httpJwtResolver;
    }

    public String getJwt() {
        return httpJwtResolver.getJwtFromRequest();
    }

}