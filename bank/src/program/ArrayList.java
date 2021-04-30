package program;

public class ArrayList {
	int num=0;
	int [] myList = new int[5];	

	
	public boolean isEmpty( ) {
    	if(num== 0)
        	return true;
       else
       		return false;
	}
	
	public boolean isFull( ) {
	   if(num== myList.length)
	        return true;
	   else
	        return false;
	}
	
	public void addFirst(int newData) {
		 if (isEmpty( )) {
	       	 myList[0]=newData;                                                                              
	       	 num++;
		 } 
		 else if(isFull( )) {                                    
	    	  System.out.println("List is full");
	     }
	     else {	
	    	 for(int i=num;i>0;i--) {
	    		 myList[i]=myList[i-1];
	    	 }
	    	 myList[0]=newData;                                      
	  	     num++;
	     }     
	}
	
	public void addBtw(int index,int newData) {
		if (isEmpty( )) {
	       	 myList[0]=newData;                                                                              
	       	 num++;
		 } 
		 else if(isFull( )) {                                    
	    	  System.out.println("List is full");
	     }
	     else {	
	    	 int temp = newData;
	    	 for(int i=num;i>index;i--) {
	    		 myList[i]=myList[i-1];
	    	 }
	    	 myList[index]=newData;                                      
	  	     num++;
	     }     
	}
	
	public void addLast(int newData) {
		 if (isEmpty( )) {
	       	 myList[0]=newData;                                                                              
	       	 num++;
		 }  	 
	     else if(isFull( )) {                                    
	    	  System.out.println("List is full");
	     }
	     else {	
	    	  myList[num]=newData;                                      
	  	      num++;
	     }     
	}	

	public void removeFirst(){           
		if (isEmpty( ))                                                             	
			System.out.println("List is empty");         	
		else
	        //System.out.println(myList[0]);
			for(int i=1;i<num;i++) {
				myList[i-1]=myList[i];
			}
		num--;         
	} 
	
	public void removeBtw(int index) {
		if (isEmpty( ))                                                             	
			System.out.println("List is empty");         	
		else
	        //System.out.println(myList[0]);
			for(int i=index;i<num;i++) {
				myList[i]=myList[i+1];
			}
		num--;         
	} 
	
	public void removeLast(){           
		if (isEmpty( ))                                                             	
			System.out.println("List is empty");         	
		else
	        System.out.println(myList[num]);
		num--;         
	} 
	
	public void Display( ){
	   for (int i=0; i <num; i++) 
	        System.out.println(myList[i]);  	
	} 
	  
	
	public boolean search(int target)
	{
	   for (int i=0; i <num; i++) 
	           if (myList[i]==(target))  
		      	return true;                                                                         
	    return false;                                                     
	}
	
	public void edit(int index,int newData) {
		if (isEmpty( ))                                                             	
			System.out.println("List is empty");      
		else
			myList[index]=newData;	
	}
	
	public int getNum() {
		return num;
	}
	



}
