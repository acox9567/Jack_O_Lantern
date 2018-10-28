//Alexander Cox
//Monday, October 26, 2018

import java.util.Scanner;

public class Runner {
    public static void main(String[] args)
    {
        JackOLantern lantern = new JackOLantern(10,20);

        lantern.fill("O");
        lantern.edit(" ",2,4);
        lantern.edit(" ",3,4);
        lantern.edit(" ",2,5);
        lantern.edit(" ",3,5);
        lantern.edit(" ",2,6);
        lantern.edit(" ",3,6);
        lantern.edit(" ",2,7);
        lantern.edit(" ",3,7);
        lantern.edit(" ",2,12);
        lantern.edit(" ",3,12);
        lantern.edit(" ",2,13);
        lantern.edit(" ",3,13);
        lantern.edit(" ",2,14);
        lantern.edit(" ",3,14);
        lantern.edit(" ",2,15);
        lantern.edit(" ",3,15);
        lantern.edit("V",6,4);
        lantern.edit("V",6,5);
        lantern.edit("V",6,6);
        lantern.edit("V",6,7);
        lantern.edit("V",6,8);
        lantern.edit("V",6,9);
        lantern.edit("V",6,10);
        lantern.edit("V",6,11);
        lantern.edit("V",6,12);
        lantern.edit("V",6,13);
        lantern.edit("V",6,14);
        lantern.edit("V",6,15);
        lantern.edit(" ",7,4);
        lantern.edit(" ",7,5);
        lantern.edit(" ",7,6);
        lantern.edit(" ",7,7);
        lantern.edit(" ",7,8);
        lantern.edit(" ",7,9);
        lantern.edit(" ",7,10);
        lantern.edit(" ",7,11);
        lantern.edit(" ",7,12);
        lantern.edit(" ",7,13);
        lantern.edit(" ",7,14);
        lantern.edit(" ",7,15);

        System.out.print(lantern.toString());
    }
}