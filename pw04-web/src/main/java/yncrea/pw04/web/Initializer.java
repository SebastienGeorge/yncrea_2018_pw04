package yncrea.pw04.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


import java.util.Scanner;
import yncrea.pw04.config.AppConfig;
import yncrea.pw04.config.DBConfig;

public class Initializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {

        return new Class[0];
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    protected String[] getServletMappings() {
        String [ ] mapping = new String [ 2000];
        Scanner in = new Scanner(System.in);
        System.out.println("Entrez le mapping de votre servlet");
        for (int  i = 0; i < 2000; i++)
        {

            mapping[ i ] = "/"+in.next();

        }
        return mapping;
    }
}
