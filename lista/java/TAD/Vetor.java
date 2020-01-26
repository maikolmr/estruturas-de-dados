import java.util.*;

public class Vetor {
	
	public static void main(String args[]) {
       Vector v = new Vector(5);
  
       for(int i=0; i < 10; i++)          	
       	  v.add(i/2, new Integer(i));   
       	  	
       for(int i=1; i <= v.size(); i++)
          v.add(v.size()-i, v.remove(0)); 
       	         	
       for(int i=0; i < v.size(); i++)
         System.out.print(v.get(i) + " - ");
         
       //System.out.println(v.get(10) + " ");  	  	
       
       //v.add(0, "C"); v.add(0, "E"); v.add(0, "A");
       //v.add(0, "R"); v.add(0, "A");
    }

//EXEMPLOS ..........
       
/*for(int i=1; i <= size(); i++)
        insertAtRank(size()-i, removeAtRank(0)); 
        
//  for(int i=0; i < 10;)
//      v.add(i/3, new Integer(i++)); 

  for(int i=1; i < VL.size(); i++) 
      	VL.add(VL.size()-i, VL.remove(i));         
        
//Object x = new Character('0');
//if(v.get(0).equals(x)) System.out.println("Teste ...");
   */
}

