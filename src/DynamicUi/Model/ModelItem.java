/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DynamicUi.Model;


public class ModelItem {

 
    public String getExamName() {
        return examName;
    }

  
    public void setExamName(String examName) {
        this.examName = examName;
    }

    public String getExamID() {
        return examID;
    }

   
    public void setExamID(String examID) {
        this.examID = examID;
    }

    public ModelItem(String examName, String examID) {
        this.examName = examName;
        this.examID = examID;
    }
    

    public ModelItem() {
    }
    
    private String examName;
    private String examID;
}
