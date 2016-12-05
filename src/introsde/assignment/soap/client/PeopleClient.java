package introsde.assignment.soap.client;

import java.util.List;

import javax.xml.ws.Holder;

import introsde.assignment.soap.webservice.PeopleService;
import introsde.assignment.soap.webservice.People;
import introsde.assignment.soap.webservice.Person;
import introsde.assignment.soap.webservice.Person.HealthProfile;
import introsde.assignment.soap.webservice.Measure;
import introsde.assignment.soap.webservice.MeasureType;

public class PeopleClient
{
    public static void main(String[] args) throws Exception 
    {
        PeopleService service = new PeopleService();
        People people = service.getPeopleImplementationPort();
        
        execMethod1(people);
       
        execMethod2(people);
        
        execMethod3(people);
        
        execMethod4(people);
        
        execMethod5(people);
        
        execMethod6(people);
        
        execMethod7(people);
        
        execMethod8(people);
        
        execMethod9(people);
        
        execMethod10(people);
        
        clean(people);

    }

	/*  readPersonList() */
    private static void execMethod1(People people) 
    {
    	System.out.println("1: List of perosn");
        
        List<Person> pList = people.getPeopleList();        
        
        for(Person p: pList)
        {
        	System.out.println("\t--> " + p.getFirstname() + " " + p.getLastname() + " " + p.getBirthdate());
        }        
        
        System.out.println("=================================================");		
	}
    
    /* readPerson(Long id) */
    private static void execMethod2(People people) 
    {
    	System.out.println("2: Person by id");
    	
    	Person p = people.readPerson(1);
        
        System.out.println("\t--> " + p.getFirstname() + " " + p.getLastname() + " " + p.getBirthdate());
        
        System.out.println("=================================================");		
	}
    
    /* updatePerson(Person p) */
    private static void execMethod3(People people) 
    {
        System.out.println("3: Update person");
        
        Person p = people.readPerson(1);
        
        System.out.println("\t--> Before: " + p.getFirstname() + " " + p.getLastname() + " " + p.getBirthdate());
        
        p.setFirstname("Nuovo"); 
        int i = people.updatePerson(p);
        
        Person p1 = people.readPerson(i);        
        System.out.println("\t--> After: " + p1.getFirstname() + " " + p1.getLastname() + " " + p1.getBirthdate());
        
        System.out.println("=================================================");		
	}
    
    /* createPerson(Person p) */
    private static void execMethod4(People people) 
    {
    	System.out.println("4: Create person");
        
        Person p = makePerson(7, "Chuck", "Norris", "1945-01-01");
        
        HealthProfile h = new HealthProfile();
        List<Measure> m = h.getMeasure();
        m.add(makeMeasure(7, (float) 1.72, "1978-09-02", makeMeasureType(1, people)));
        m.add(makeMeasure(8, 75, "1978-09-02", makeMeasureType(2, people)));               
        p.setHealthProfile(h);
        
        int i = people.createPerson(p);
        
        Person p1 = people.readPerson(i);
        System.out.println("\t--> " + p1.getFirstname() + " " + p1.getLastname() + " " + p1.getBirthdate());
        
        /* TODO: Inserire anche le misure con la nuova persona
	        Measure m3 = people.readMeasure(7, makeMeasureType(1, people).getType(), 7);
	        System.out.println("\t\t--> " + m3.getIdMeasure() + " " + m3.getValue());
	        
	        m3 = people.readMeasure(7, makeMeasureType(2, people).getType(), 8);
	        System.out.println("\t\t--> " + m3.getIdMeasure() + " " + m3.getValue());
        */
        
        System.out.println("=================================================");		
	}
    
    /* deletePerson(Long id) */
    private static void execMethod5(People people) 
    {
    	System.out.println("5: Delete person 7");
        
        List<Person> pList = people.getPeopleList();
        
        System.out.println("\t--> Before:");
        for(Person p1: pList)
        {
        	System.out.println("\t\t--> " + p1.getFirstname() + " " + p1.getLastname() + " " + p1.getBirthdate());
        }
        
        people.deletePerson(7);
        
        pList = people.getPeopleList();
        System.out.println("\t--> After:");
        for(Person p2: pList)
        {
        	System.out.println("\t\t--> " + p2.getFirstname() + " " + p2.getLastname() + " " + p2.getBirthdate());
        }
       
        System.out.println("=================================================");		
	}
    
    /* readPersonHistory(Long id, String measureType) */
    private static void execMethod6(People people) 
    {
        System.out.println("6: History");
        
        List<Measure> mList = people.getMeasureHistory(1, "height");
        
        for(Measure m: mList)
        {
        	System.out.println("\t--> " + m.getIdMeasure() + " " + m.getValue());
        }
        
        System.out.println("=================================================");
		
	}
    
    /* readMeasureTypes() */
    private static void execMethod7(People people) 
    {
        System.out.println("7: List of MeasureType");
        
        List<MeasureType> mTList = people.getMeasureTypeList();
        
        for(MeasureType mT: mTList)
        {
        	System.out.println("\t--> " + mT.getIdMeasureType() + " " + mT.getType());
        }
        
        System.out.println("=================================================");
		
	}
    
    /* readPersonMeasure(Long id, String measureType, Long mid) */
    private static void execMethod8(People people) 
    {
        System.out.println("8: Read measure");
        
        Measure m = people.readMeasure(1, "height", 1);
        System.out.println("\t--> " + m.getIdMeasure() + " " + m.getValue());
        
        System.out.println("=================================================");
		
	}
    
    /* savePersonMeasure(Long id, Measure m) */
    private static void execMethod9(People people) 
    {
        System.out.println("9: Create measure");
        
        Person p = people.readPerson(1);
        Measure tmp = makeMeasure(17, (float) 1.72, "2011-12-09", makeMeasureType(1, people));
        int i = people.createMeasure(1, tmp);
        
        Measure m = people.readMeasure(1, makeMeasureType(1, people).getType(), i);
        System.out.println("\t--> " + m.getIdMeasure() + " " + m.getValue());
        
        System.out.println("=================================================");
		
	}
    
    /* updatePersonMeasure(Long id, Measure m) */
    private static void execMethod10(People people) 
    {
        System.out.println("10: Update measure");
        
        Measure m = people.readMeasure(1, "height", 17);
        System.out.println("\t--> Before: " + m.getIdMeasure() + " " + m.getValue());
        
        m.setValue((float) 1.81);
        int i = people.updateMeasure(1, m);
        
        Measure m1 = people.readMeasure(1, "height", i);
        
        System.out.println("\t--> After: " + m1.getIdMeasure() + " " + m1.getValue());
        
        System.out.println("=================================================");		
	}
    
    private static void clean(People people) {
    	// Restore the initial conditions
        Person p = people.readPerson(1);
        p.setFirstname("Giorgio"); 
        people.updatePerson(p);
        
        people.deleteMeasure(17);
		
	}

	public static Person makePerson(int id, String fname, String lname, String date)
    {
    	Person p = new Person();
        
    	p.setIdPerson(id);
        p.setFirstname(fname);
        p.setLastname(lname);
        p.setBirthdate(date);
        
    	return p;
    }
    
    public static Measure makeMeasure(int id, float value, String date, MeasureType mType)
    {
    	Measure m = new Measure();
    	
    	m.setIdMeasure(id);
    	m.setValue(value);
    	m.setDate(date);
    	m.setMeasureType(mType);
    	
    	return m;
    }
    
    public static MeasureType makeMeasureType(int id, People people)
    {    	
    	return people.readMeasureType(id);
    }
}