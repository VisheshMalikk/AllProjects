package MethodChainingConcept;

public class HomePage {
	
	public HomePage sendFriendRequest() {
		System.out.println("Friend Request sent .. ");
		return this;
	}
	
	public HomePage sendMessage() {
		System.out.println("Message sent");
		return this;
	}
	
	// Note : The return 'this' in the code allows for method chaining, a technique where multiple method calls can be linked together in a single statement.
	// In Java, 'this' refers to the current object of the class
	// By returning 'this' the method returns the instance of the class(i.e the current object) that invoked the method.
	// Purpose of return this : 1) Enables calling multiple methods on the same object in a single statement
	//                          2) Makes the code more concise and readable
	
	
	
}
