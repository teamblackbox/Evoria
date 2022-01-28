package ui;

import java.util.Scanner;
import java.util.LinkedList;

public class Dialogue {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        printDialogue(new Entity());
        System.out.println("Thanks and stuff.");
    }
    static class Entity {
        private String name;
        private Mood mood;
        private LinkedList<String> dialogue;

        private enum Mood {
            INDIFFERENT,
            HAPPY,
            SAD,
            ANGRY
        }
        public Entity() {
            this.name = "Test";
            this.mood = Mood.INDIFFERENT;
            this.dialogue = new LinkedList<>();
            dialogue.add(0, "What's up?");
            dialogue.add(1, "Do you like potatoes?");
            dialogue.add(2, "Go away.");
            dialogue.add(3, "Seriously... go away.");
            dialogue.add(4, "What the hell are you still doing here?");
            dialogue.add(5, "GO THE FUCK AWAY YOU ASSHOLE!!!");
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        // public void setMood(String mood) {
        //     this.mood = mood;
        // }
        public String getMood() {
            return mood.toString();
        }
        public LinkedList<String> getDialogue() {
            return dialogue;
        }
    }
    public static void printDialogue(Entity entity) {
        for(int i = 0; i < entity.getDialogue().size(); i++) {
            System.out.println(entity.getName() + ": ");
            try {
                printSentence(entity.getDialogue().get(i));
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }
    public static void printSentence(String sentence) throws InterruptedException {
        char index;
        char lastIndex = ' ';
        System.out.print("--> \"");
        for(int i = 0; i < sentence.length(); i++) {
            if(lastIndex == '.') {
                Thread.sleep(350);
            } else if(lastIndex == ',') {
                Thread.sleep(170);
            } else if(Character.isUpperCase(lastIndex)) {
                Thread.sleep(5);
            }
            index = sentence.charAt(i);
            lastIndex = index;
            System.out.print(index);
            Thread.sleep(65);
        }
        System.out.print("\"\nContinue...");
        s.nextLine();
        clear();
    }
    private static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}