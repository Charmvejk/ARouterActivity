package com.example.arouteractivity;

public class RouteRule {

    static RouteRule mRouteRule;

    public static RouteRule getInstance() {
        if (mRouteRule == null) {
            mRouteRule = new RouteRule();
        }
        return mRouteRule;
    }


}
