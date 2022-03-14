/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8.m1;

/**
 *
 * @author azeldaniel
 */
public class Camper {
    private String firstName;
    private String lastName;
    private String campType;
    private String ageGroup;
    private java.util.ArrayList<String> activities;
    private java.util.ArrayList<String> mentors;
    
    public Camper(String fName, String lName, String cType){
        firstName = fName;
        lastName = lName;
        campType = cType;
        activities = new java.util.ArrayList<>();
        mentors = new java.util.ArrayList<>();
    }
    
    public void setAgeGroup(String ageGp){
        ageGroup = ageGp;
    }
    public void setActivities(java.util.List<String> acts){
     if(acts != null)
         activities = new java.util.ArrayList<String>(acts);
    }
    
    public void setMentors(java.util.List<String> ments){
     if(ments != null)
         mentors = new java.util.ArrayList<String>(ments);
    }
    public String toString(){
        return "firstName: " + firstName + "\n"+
                "lastName: " + lastName + "\n"+
                "camp type: " + campType + "\n" +
                "age group: " + ageGroup + "\n"+
                "activities: " + activities + "\n"+
                "mentors: " + mentors;
    }
}