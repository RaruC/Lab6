package Lab6;

import java.util.Date;

public class Patient extends Person
{
    public String id;
    public Date accepted;
    public String[] sickness;
    public String[] prescriptions;
    public String[] allergies;
    public String[] specialReqs;

    
	@SuppressWarnings("deprecation")
	public int age()
    {
        return accepted.getYear() - birthDate.getYear();
    }
}
