package Other;

import Day1.AccessModifiersProtectedParent;

public class AccessModifiersProtectedChildAnotherPackage extends AccessModifiersProtectedParent{
	
	public static void main(String args[])
    {
		AccessModifiersProtectedChildAnotherPackage child = new AccessModifiersProtectedChildAnotherPackage();
		child.display();
    }

}
