package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Prithee {
    String sonnet = "Shall I compare thee to a summer’s day?\n" +
            "Thou art more lovely and more temperate:\n" +
            "Rough winds do shake the darling buds of May,\n" +
            "And summer’s lease hath all too short a date;\n" +
            "Sometime too hot the eye of heaven shines,\n" +
            "And often is his gold complexion dimm’d;\n" +
            "And every fair from fair sometime declines,\n" +
            "By chance or nature’s changing course untrimm'd;\n" +
            "But thy eternal summer shall not fade,\n" +
            "Nor lose possession of that fair thou ow’st;\n" +
            "Nor shall death brag thou wander’st in his shade,\n" +
            "When in eternal lines to time thou grow’st:\n" +
            "   So long as men can breathe or eyes can see,\n" +
            "   So long lives this, and this gives life to thee.\n";
    int rightCount;
    int wrongCount;
    int randomNum;
    Scanner scanner;
    ArrayList<String> sonnetWords;


    public Prithee() {
        sonnetWords = new ArrayList<>(Arrays.asList(sonnet.split(" ")));
        this.rightCount = 0;
        this.wrongCount = 0;
        this.scanner = new Scanner(System.in);
        this.randomNum = -1;
    }



}
