/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cypher.listfiles;

import java.io.File;

/**
 *
 * @author angel
 */
public class ExampleListFiles {

    public static void main(String[] args) {
        String[] pathnames;
        File f = new File("/Users/angel/Desktop");
        pathnames = f.list();
        for (String pathname : pathnames) {
            System.out.println(pathname);
        }
    }
}
