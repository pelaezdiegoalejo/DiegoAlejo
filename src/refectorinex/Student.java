/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refectorinex;

import java.util.Date;

/**
 *
 * @author 1695812
 */
public class Student extends Person{
    String student_id;
    
    public Student(String nom, String preNom, Date datenaissance){
        this.setLastName(nom);        
        this.setFirstName(preNom);
        this.setDateBirth(datenaissance);
        this.student_id=createStudentId(nom,preNom,datenaissance);
       
    }
    public String createStudentId(String lName,String fName,Date date){
        String end = concatDate(date);
        return lName.substring(0,3)+fName.charAt(0)+end;
    }
    private String concatDate(Date date){
        return date.getYear()+ "-"+date.getMonth();
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public void study() {
        System.out.println("I study.");
    }
}
