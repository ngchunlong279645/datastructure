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
	
	public void addFirst(String firstName, String lastName, int age, char gender, String email, int accNum, int phoneNum, String accType) {
		if (isEmpty( )) {
	       	 myList[0]=new Person(firstName,lastName,age,gender,email,accNum,phoneNum,accType);                                                                    
	       	 num++;
		 }
		else if(isFull( )) {                                    
	    	  System.out.println("List is full");
	     }
	     else {	
	    	 for(int i=num;i>0;i--) {
	    		 myList[i]=myList[i-1];
	    	 }
	    	 myList[0]=new Person(firstName,lastName,age,gender,email,accNum,phoneNum,accType);                                  
	  	     num++;
	     }     
	}
	
	public void addBtw(int index,String firstName, String lastName, int age, char gender, String email, int accNum, int phoneNum, String accType) {
		if (isEmpty( )) {
	       	 myList[0]=new Person(firstName,lastName,age,gender,email,accNum,phoneNum,accType);                                                                                
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
	    	 myList[index]=new Person(firstName,lastName,age,gender,email,accNum,phoneNum,accType);                                         
	  	     num++;
	     }     
	}
	
	public void addLast(String firstName, String lastName, int age, char gender, String email, int accNum, int phoneNum, String accType) {
		 if (isEmpty( )) {
	       	 myList[0]=new Person(firstName,lastName,age,gender,email,accNum,phoneNum,accType);                                                                              
	       	 num++;
		 }  	 
	     else if(isFull( )) {                                    
	    	  System.out.println("List is full");
	     }
	     else {	
	    	  myList[num]=new Person(firstName,lastName,age,gender,email,accNum,phoneNum,accType);                                  
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
		  System.out.println("\nFirst Name ="+myList[index].getFirstName());
		  System.out.println("\nLast Name ="+myList[index].getLastName());
		  System.out.println("Age = "+myList[index].getAge());
		  System.out.println("Gender = "+myList[index].getGender());
		  System.out.println("\nEmail ="+myList[index].getEmail());
		  System.out.println("\nAccount Number ="+myList[index].getAccNum());
		  System.out.println("\nPhone Number ="+myList[index].getPhoneNum());
		  System.out.println("\nAccount Type ="+myList[index].getAccType());
	}
	
	public void edit(int index,String firstName, String lastName, int age, char gender, String email, int accNum, int phoneNum, String accType) {
		if (isEmpty( ))                                                             	
			System.out.println("List is empty");      
		else
			myList[index]=new Person(firstName,lastName,age,gender,email,accNum,phoneNum,accType);  
	}

    public void displayRecord(){
    if(num!=0) {	
    	for (int i= 0; i< num; i++){
    		System.out.println("\nNO : "+i);
    		System.out.println("First Name ="+myList[i].getFirstName());
    		System.out.println("Last Name ="+myList[i].getLastName());
    		System.out.println("Age = "+myList[i].getAge());
    		System.out.println("Gender = "+myList[i].getGender());
    		System.out.println("Email = "+myList[i].getEmail());
    		System.out.println("Account Number = "+myList[i].getAccNum());
    		System.out.println("Phone Number = "+myList[i].getPhoneNum());
    		System.out.println("Account Type = "+myList[i].getAccType());
    		
    	}
    }
    else {
    	System.out.println("Empty list");
    	}
	}
    
    }


