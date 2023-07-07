package templatemethod.after;

import templatemethod.after.auth.HttpCookieJwtFilter;
import templatemethod.after.auth.HttpHeaderJwtFilter;
import templatemethod.after.auth.HttpJwtFilter;

public class Main {

    public static void main(String[] args) {
        HttpJwtFilter httpCookieJwtFilter = new HttpCookieJwtFilter();
        HttpJwtFilter httpHeaderJwtFilter = new HttpHeaderJwtFilter();

        String jwtFromRequestCookie = httpCookieJwtFilter.getJwt();
        String jwtFromRequestHeader = httpHeaderJwtFilter.getJwt();
    }

}