package utilisateur;


public class test {
	public static void main(String[] args) {
		User a = new User();
		User b = new User("Adélaïde", "Armand");
		
		System.out.println(User.listId);
		a.addSelection();
		System.out.println(a.selection);
		
	}
}
