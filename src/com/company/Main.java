package com.company;

public class Main {

    public static void main(String[] args) {

        TeamMember dina = new TeamMember("Dina", "Python","sushi", "blue", "EG", new Pet("Hermit Crab", "Turbo"));

        TeamMember tyler = new TeamMember("Tyler", "Nodejs","sushi", "blue", "Ravens");

        TeamMember shane = new TeamMember("Shane", "React","Ribeye", "red", "Manchester United", new Pet("Dog", "Bailey"));

        TeamMember calder = new TeamMember("Calder", "English","Pizza", "purple", "Atlanta United", new Pet("Dog", "Riley"));

        TeamMember[] teamArray = { dina, tyler, calder, shane };

        for (TeamMember member: teamArray) {
            System.out.println(member.getName() + "\n");
        }

    }
}