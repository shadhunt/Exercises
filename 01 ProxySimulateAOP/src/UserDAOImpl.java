
public class UserDAOImpl implements UserDAO {
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		this.user=user;
		System.out.println("save user!");
	}	
}
