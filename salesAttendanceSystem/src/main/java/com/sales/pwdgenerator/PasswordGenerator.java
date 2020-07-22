package com.sales.pwdgenerator;

import java.security.SecureRandom;

public class PasswordGenerator {

    private static SecureRandom random = new SecureRandom();

    /** different dictionaries used */
    private static final String ALPHA_CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String ALPHA = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMERIC = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*_=+-/";

    /**
     * Method will generate random string based on the parameters
     * 
     * @param len
     *            the length of the random string
     * @param dic
     *            the dictionary used to generate the password
     * @return the random password
     */
    public static String generatePassword() {
    	
    	
    	String dic=	ALPHA_CAPS + ALPHA;
    String result = "";
    for (int i = 0; i < 10; i++) {
        int index = random.nextInt(dic.length());
        result += dic.charAt(index);
    }
    return result;
    }

  /*  public static void main(String[] args) {
    System.out.println("Password Generator Examples");
    System.out.println();

    int len = 10;
    System.out.println("Alphanumeric password, length " + len + " chars: ");
    String password = generatePassword();
    System.out.println(password);
    System.out.println();

    len = 20;
    System.out.println("Alphanumeric + special password, length " + len + " chars: ");
    password = generatePassword(len, ALPHA_CAPS + ALPHA + SPECIAL_CHARS);
    System.out.println(password);
    System.out.println();

    len = 15;
    System.out.println("Alphanumeric + numeric + special password, length " + len + " chars: ");
    password = generatePassword(len, ALPHA_CAPS + ALPHA + SPECIAL_CHARS + NUMERIC);
    System.out.println(password);
    System.out.println();*/
    }
