package strategy.after;

import strategy.after.auth.HttpCookieJwtResolver;
import strategy.after.auth.HttpHeaderJwtResolver;
import strategy.after.auth.HttpJwtFilter;

public class Main {

    public static void main(String[] args) {
        HttpJwtFilter httpCookieJwtFilter = new HttpJwtFilter(new HttpCookieJwtResolver());
        HttpJwtFilter httpHeaderJwtFilter = new HttpJwtFilter(new HttpHeaderJwtResolver());

        String jwtFromRequestCookie = httpCookieJwtFilter.getJwt();
        String jwtFromRequestHeader = httpHeaderJwtFilter.getJwt();
    }

}