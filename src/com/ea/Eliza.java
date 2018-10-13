package com.ea;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Eliza {


    public Eliza() {
        System.out.println("What is your problem? Enter your response here or Q to quit");
    }

    public String change(String word) {

        String[] stringArray = word.split(" ");
        HashMap<String, String> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        String finalString = "";

        map.put("i", "you");
        map.put("me", "you");
        map.put("my", "your");
        map.put("am", "are");

        for (String str : stringArray) {
            if (map.containsKey(str)) {
                list.add(map.get(str));
            } else {
                list.add(str);
            }
        }
        for (String value : list) {
            finalString += value + " ";
        }
       // System.out.println(qualifiers() +" "+finalString);
        return "";
    }
    public String hedges() {

        String[] hedges = {"Please tell me more",
                "Many of my patients tell me the same thing",
                "It is getting late, maybe we had better quit"};
        int length = hedges.length;
        int rand = (int) (Math.random() * length);

        return hedges[rand];
    }
    public String qualifiers() {

        String[] qualifiers = {"Why do you say that",
                "You seem to think that",
                "So, you are concerned that"};
        int length = qualifiers.length;
        int rand = (int) (Math.random() * length);
        return qualifiers[rand];
    }

    public String randResponse(String string){

        String [] rand ={qualifiers(),hedges(),change(string)};
        Random random = new Random();
        int ranNum =random.nextInt(2);
        return rand[ranNum];
    }

}
