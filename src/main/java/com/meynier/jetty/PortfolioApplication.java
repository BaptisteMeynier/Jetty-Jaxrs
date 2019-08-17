package com.meynier.jetty;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Set;

public class PortfolioApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        return Set.of(PortfolioResource.class);
    }
}
