
public class Student {
	private int id;
	private String name;
	private double firstsub;
	private double secondsub;
	private double thirdsub;
	public Student(int id, String name, double firstsub, double secondsub,
			double thirdsub) {
		super();
		this.id = id;
		this.name = name;
		this.firstsub = firstsub;
		this.secondsub = secondsub;
		this.thirdsub = thirdsub;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFirstsub() {
		return firstsub;
	}
	public void setFirstsub(double firstsub) {
		this.firstsub = firstsub;
	}
	public double getSecondsub() {
		return secondsub;
	}
	public void setSecondsub(double secondsub) {
		this.secondsub = secondsub;
	}
	public double getThirdsub() {
		return thirdsub;
	}
	public void setThirdsub(double thirdsub) {
		this.thirdsub = thirdsub;
	}
	
	public double Average()
	{
		return (firstsub + secondsub + thirdsub)/3;
	}
	
	public String toString()
	{
		return "Id: "+id+", Name: "+name+", FirstSubject: "+firstsub+", SecondSubject: "+secondsub+", ThirdSubject: "+thirdsub+ ", Avareage: "+Average();
		
	}
	
	
}
