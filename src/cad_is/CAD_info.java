/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cad_is;

/**
 CAD_info is the main Class of the Project that has the main method which
 helps in displaying the forms related to the project.
 */
public class CAD_info {

    /**
     * @param args the command line arguments
     */
    
    public CAD_info() { //non-parameterized Constructor
    }

    public static void main(String[] args) {
        // TODO code application logic here
        SplashScreen splash = new SplashScreen(); //creating object of SplashScreen
        splash.setVisible(true); // making SplashScreen Visible
        
        try{
            for (int i = 0; i<=100; i++){
                Thread.sleep(20); //thread for 20 milliseconds
                splash.loading.setText(Integer.toString(i)+"%");
                splash.progressbar.setValue(i);
                if (i==100){
                    new First_Interface().setVisible(true);
                    splash.dispose();
                }
            }
        }catch(Exception ex){
            
        }
    }
    public int binarySearch(int arr[], int low, int high, int key) 
    { 
         /**
            
            It takes sorted array, initial value in the array, final value 
            in the array and the value that is to be searched in the array. 
            It search the data in the array based on the principle of Binary Search.
        */
        
            
        while (low <= high) {
            
        int mid = (low + high) / 2;
       
        if (arr[mid] < key) {
            low = mid + 1;
           
           
        } else if (arr[mid] > key) {
            high = mid - 1;
           
        } else if (arr[mid] == key) {
           
            return mid;
            
            
        }
    }
    return -1;
}
    
}
