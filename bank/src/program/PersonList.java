package program;

public class PersonList {
	private Person [] myList;
	//private Person [] temp;
	private int num;

	public PersonList(int size){
		myList = new Person[size];
	//	temp = new Person[1];
		num = 0;
	}
	
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
	
	public void addFirst(String name, int age, char gender) {
		if (isEmpty( )) {
	       	 myList[0]=new Person(name,age,gender);                                                                    
	       	 num++;
		 }
		else if(isFull( )) {                                    
	    	  System.out.println("List is full");
	     }
	     else {	
	    	 for(int i=num;i>0;i--) {
	    		 myList[i]=myList[i-1];
	    	 }
	    	 myList[0]=new Person(name,age,gender);                                  
	  	     num++;
	     }     
	}
	
	public void addBtw(int index,String name, int age, char gender) {
		if (isEmpty( )) {
	       	 myList[0]=new Person(name,age,gender);                                                                                
	       	 num++;
		 } 
		 else if(isFull( )) {                                    
	    	  System.out.println("List is full");
	     }
	     else {	
	    	 //temp[0] = new Person(name,age,gender);   
	    	 for(int i=num;i>index;i--) {
	    		 myList[i]=myList[i-1];
	    	 }
	    	 myList[index]=new Person(name,age,gender);                                         
	  	     num++;
	     }     
	}
	
	public void addLast(String name, int age, char gender) {
		 if (isEmpty( )) {
	       	 myList[0]=new Person(name,age,gender);                                                                              
	       	 num++;
		 }  	 
	     else if(isFull( )) {                                    
	    	  System.out.println("List is full");
	     }
	     else {	
	    	  myList[num]=new Person(name,age,gender);                                  
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
			num--;	         
	} 
	
	public void search(int index){
		  System.out.println("\nName ="+myList[index].getName());
		  System.out.println("Age = "+myList[index].getAge());
		  System.out.println("Gender = "+myList[index].getGender());                                               
	}
	
	public void edit(int index,String name, int age, char gender) {
		if (isEmpty( ))                                                             	
			System.out.println("List is empty");      
		else
			myList[index]=new Person(name,age,gender);  
	}

    public void displayRecord(){
    if(num!=0) {	
    	for (int i= 0; i< num; i++){
    		System.out.println("\nNO : "+i);
    		System.out.println("Name ="+myList[i].getName());
    		System.out.println("Age = "+myList[i].getAge());
    		System.out.println("Gender = "+myList[i].getGender());
    	}
    }
    else {
    	System.out.println("Empty list");
    	}
	}
    }


