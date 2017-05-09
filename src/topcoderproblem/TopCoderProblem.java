/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topcoderproblem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Alex Nelson
 */
public class TopCoderProblem {
    public static HashMap<Integer, Integer> edges=null;
    public static HashMap canonMap;
    public static ArrayList<Integer> recMap=new ArrayList<Integer>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
            setUp();
            System.out.println(edges); 
            
             Tree tree=new Tree(17);
             
             
             
             
             
            
              
             
            
    
    }
    
    public static int toInt(Object o){
        return Integer.valueOf(o.toString());
    }
    
    public static void setUp(){
        File file=new File("C:\\Users\\Alex Nelson\\Documents\\NetBeansProjects\\TopCoderProblem\\src\\topcoderproblem\\adjnoun.gml");
  FileReader reader=null;
        String str=null;
        try{  
        reader = new FileReader(file);
        char[] chars = new char[(int) file.length()];
        
        reader.read(chars);
        
        str = new String(chars);
        reader.close();}
        catch(Exception e){
            e.printStackTrace();}
        
        
        Scanner sc = new Scanner(str);
        
        ArrayList arr=new ArrayList();
        
        while(sc.hasNext()){
        
            arr.add(sc.next());
        }
        
        HashMap<Integer, String> nodeArr=new HashMap<Integer, String>();
        
        HashMap<Integer, Integer> edgeArr=new HashMap<Integer, Integer>();
        
        ArrayList vertArr=new ArrayList();
        
         
        for(int i=0; i<arr.size();i++){
            
            if((arr.get(i)).toString().equals("node")){
                String st=arr.get(i+5).toString();
                
                Integer itn=Integer.valueOf((arr.get(i+3)).toString());
               nodeArr.put(itn, st);
            
            
            }
            if(arr.get(i).toString().equals("edge")){
                Integer source=Integer.valueOf(arr.get(i+3).toString());
                Integer target=Integer.valueOf(arr.get(i+5).toString());
                vertArr.add(source);
                vertArr.add(target);
                edgeArr.put(source, target);
            }}
        
                      

            HashMap<Integer, Integer> freqArr=new HashMap<Integer, Integer>();
              edges=edgeArr;
             
               
           for(int i=0; i<nodeArr.size(); i++){
               int count=0;
               for(int j=0; j<vertArr.size(); j++){
                   if(Integer.valueOf(vertArr.get(j).toString())==i){
                       count++;
                   }
               }
               freqArr.put(i, count);
           } 
        
         ArrayList valArr=new ArrayList();
         valArr.ensureCapacity(200);  
           
            
           
            for(int i=0; i<freqArr.size();i++){
                valArr.add(freqArr.get(i));
                
            }
            
            
            ArrayList sortArr=new ArrayList();
            int biggest=0;
           for(int i=0; i<valArr.size();i++){
               if(toInt(valArr.get(i))>biggest){
                   sortArr.add(valArr.get(i));
                   biggest=toInt(valArr.get(i));
               }
               else{
                   int j=0;
                   boolean flag=true;
                   while(flag){
                       if(toInt(valArr.get(i))<toInt(sortArr.get(j))){
                           sortArr.add(j, valArr.get(i));
                           break;
                       }
                       else{
                           j++;
                       }
                   }
               }
               }
           
          
                       
           HashMap sortMap=new HashMap<Integer, Integer>();
           
           
           
           for(int i=0; i<sortArr.size(); i++){
               sortMap.put(i, toInt(sortArr.get(i)));
           }
                   
                
             canonMap=freqArr;
    }
    
    

           
          
               
           
                  
        
        
        }

       
    
    
        
        
        
        
        
        
        
   
    

