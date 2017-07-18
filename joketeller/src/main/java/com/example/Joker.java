package com.example;

public class Joker {
    public static String[] jokes = {
        "The future, the present and the past walked into a bar. Things got a little tense.",
        "I just found out I'm colorblind. The diagnosis came completely out of the purple.",
        "My dad died when we couldn't remember his blood type. As he died, he kept insisting for us to \"be positive,\" but it's hard without him.",
        "Did you hear about the man who jumped off a bridge in France? He was in Sein.",
        "What is the name of an Asian pilot who died in a plane crash? Sum Ting Wong.",
        "A termite walks into a bar and says, \"Where is the bar tender?\"",
        "I recently got a new Korean mechanic but it's hard to understand him - he speaks with a Hyundai Accent!",
        "People don't get my puns. They think they're funny.",
        "Atheism is a non-prophet organization.",
        "I saw an ad for burial plots, and thought to myself this is the last thing I need."
    };

    public static String getJoke() {
        int randPosition = (int) (Math.random()*(jokes.length-1));
        return jokes[randPosition];
    }
}
