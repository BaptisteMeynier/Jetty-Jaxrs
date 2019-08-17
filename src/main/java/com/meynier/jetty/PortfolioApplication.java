package com.meynier.jetty;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Set;

@ApplicationPath("")
public class PortfolioApplication extends Application {
    @Override
    public Set<Object> getSingletons() {
        return Set.of(PortfolioResource.class);
    }
}
