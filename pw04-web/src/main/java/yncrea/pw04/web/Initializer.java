package yncrea.pw04.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


import java.util.Map;
import java.util.Scanner;
import yncrea.pw04.config.AppConfig;
import yncrea.pw04.config.DBConfig;
import yncrea.pw04.web.config.WebConfig;

public class Initializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        Class[] conf = new Class[2];
        conf[0] = AppConfig.class;
        conf[1] = DBConfig.class;
        return conf;
    }

    protected Class<?>[] getServletConfigClasses() {
        Class[] webconf = new Class[1];
        webconf[0] = WebConfig.class;
        return webconf;
    }

    protected String[] getServletMappings() {
        String[] mapping = new String[1];
        mapping[0] = "/";
        return mapping;
    }
}
