package strategy.before;

import templatemethod.before.auth.HttpJwtFilter;

public class Main {

    public static void main(String[] args) {
        HttpJwtFilter httpJwtFilter = new HttpJwtFilter();
        String jwtFromRequestCookie = httpJwtFilter.getJwt(true);
        String jwtFromRequestHeader = httpJwtFilter.getJwt(false);
    }

}