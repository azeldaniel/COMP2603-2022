//LAB 5 

public class StudentApp {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Beatrix Kiddo");

		Student s2 = new Student("Dominic Toretto");

		Undergraduate u1 = new Undergraduate();
		u1.setName("Barry Allen");
		u1.setMajor("Forensics");
		u1.setMinor("Athletics");
		u1.setCredits(25);

		Undergraduate u2 = new Undergraduate();
		u2.setName("John Rambo");
		u2.setMajor("Conflict Analysis");
		u2.setMinor("International Affairs");
		u2.setCredits(20);

		Undergraduate u3 = new Undergraduate();
		u3.setName("Ellen Ripley");
		u3.setMajor("Astrobiology");
		u3.setMinor("Conflict Analysis");
		u3.setCredits(15);

		Postgraduate p1 = new Postgraduate("John McClain", "Prof. Asp Pirin", "How to Die Hard");
		Postgraduate p2 = new Postgraduate("Brian Mills", "Dr. No Kia", "Mobile Usage Patterns in Hostage Situations");

		s1.calculateFees();
		s2.calculateFees();
		u1.calculateFees();
		u2.calculateFees();
		u3.calculateFees();
		p1.calculateFees();
		p2.calculateFees();

		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(u1.toString());
		System.out.println(u2.toString());
		System.out.println(u3.toString());
		System.out.println(p1.toString());
		System.out.println(p2.toString());

		p1.setStatus("Full Time");
		p2.setStatus("Part Time");
		// u1.setStatus("Full Time"); compilation error
		u2.setCredits(25);
		u3.setCredits(20);

		System.out.println("------------");

		s1.calculateFees();
		s2.calculateFees();
		u1.calculateFees();
		u2.calculateFees();
		u3.calculateFees();
		p1.calculateFees();
		p2.calculateFees();

		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(u1.toString());
		System.out.println(u2.toString());
		System.out.println(u3.toString());
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}
}
