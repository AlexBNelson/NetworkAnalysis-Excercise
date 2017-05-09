/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topcoderproblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import static topcoderproblem.TopCoderProblem.edges;

/**
 *
 * @author Alex Nelson
 */
public class Tree {
    
    private final int id;
    private ArrayList branches;
    
   public Tree(int ID){
       
       id=ID;
       HashMap<Integer, Integer> h=TopCoderProblem.edges;
       branches=new ArrayList();
       
       
       System.out.println(ID);
       
      if(TopCoderProblem.recMap.contains(id)){
          System.out.println(TopCoderProblem.recMap);
            branches=null;
           System.out.println("check");
       }
       else{
          
           
        Iterator it = h.entrySet().iterator();
        
       while(it.hasNext()){
           
           Map.Entry pair = (Map.Entry)it.next();
           
          
           
           if(id==toInt(pair.getKey())&&!TopCoderProblem.recMap.contains(toInt(pair.getValue()))){
               //need to nullify individual edges if already incorporated into teh tree strucutre, otherwise will duplicating edges
               
               TopCoderProblem.recMap.add(id);
               
               branches.add(new Tree(toInt(pair.getValue())));
               
               
               
           }
           else if(id==toInt(pair.getValue())&&!TopCoderProblem.recMap.contains(toInt(pair.getKey())))
           {
               TopCoderProblem.recMap.add(id);
               if(TopCoderProblem.recMap.contains(toInt(pair.getKey()))){}
               else{
               branches.add(new Tree(toInt(pair.getKey())));}
               
               
           }
           else{}
           
       }
   }}
    
   private static int toInt(Object o){
        return Integer.valueOf(o.toString());
    }
   
   public ArrayList getBranches(){
       return branches;
   }
   
   public int getID(){
       return id;
   }
   
  
}
