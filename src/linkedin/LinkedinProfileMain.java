package linkedin;

public class LinkedinProfileMain {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// create instance of class or instantiating class or create an object//
		Linkedinprofile supervisor = new Linkedinprofile();
		Linkedinprofile qaEngineer = new Linkedinprofile();
		
		// assign value to attributes of object//

		supervisor.name = "himallal";
		supervisor.career = "engineer";
		supervisor.currentWorkPlace = "canadapost";
		
		
		//invoking the method//
		
		supervisor.work();
	}

}
