package com.cf.training.jenkins.testpmd;

/**
 * Hello world!
 *
 */
public class App{ 

    //Unused field
    private int abc;

    private String ip = "127.0.0.1";

    public void test() {

        String[] field = {"a", "b", "c", "s", "e"};

        String s = "";
        for (int i = 0; i < field.length; ++i) {
            s = s + field[i];
        }

        System.out.println(ip);

    }

}
