
public class StaticMember {
	private String first;
	private String last;
	
	private static int members=0;
	
	public StaticMember(String fn,String ln) {
		first=fn;
		last=ln;
		members++;
		
		System.out.printf("constructors for %s %s, members in the club: %d\n",first,last,members);
	}

}
