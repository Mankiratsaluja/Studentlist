/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentlist;

/**
 *
 * @author owner
 */
public class PartTimeStudent extends Student {
    private int NumCourses;
    public int getNumCourses(){
        return NumCourses;
    } 

    public void PartTimeStudent(int NumCourses) {
        this.NumCourses = NumCourses;
    }
    
}
