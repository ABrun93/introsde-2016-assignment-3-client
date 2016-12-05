package introsde.assignment.soap.client;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

import introsde.assignment.soap.webservice.PeopleService;
import introsde.assignment.soap.webservice.People;
import introsde.assignment.soap.webservice.Person;
import introsde.assignment.soap.webservice.Person.HealthProfile;
import introsde.assignment.soap.webservice.Measure;
import introsde.assignment.soap.webservice.MeasureType;

public class PeopleClient
{
	// File for log
	static final String LOG_FILE = "client.log";
	static String log_text = "";
	
    public static void main(String[] args) throws Exception 
    {    	
    	FileWriter log_writer = new FileWriter(LOG_FILE);
    	
    	PeopleService service = new PeopleService();
        People people = service.getPeopleImplementationPort();
        
        System.out.println("Introsde-2016-Assignment-3-Client");
        log_text += "Introsde-2016-Assignment-3-Client\n";
        System.out.println(service.getWSDLDocumentLocation());
        log_text += "Url server: " + service.getWSDLDocumentLocation() + "\n";
        System.out.println("=================================================");
        log_text += "\n=================================================\n\n";
        
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
		    	
    	BufferedWriter buffer = new BufferedWriter(log_writer);
		buffer.write(log_text);
		buffer.flush();

    }

	/*  readPersonList() */
    private static void execMethod1(People people) 
    {
    	System.out.println("1: List of perosn");
    	log_text += "1: List of perosn\n";
    	System.out.println("readPersonList()");
    	log_text += "readPersonList()\n";
    	
        List<Person> pList = people.getPeopleList();        
        
        for(Person p: pList)
        {
        	System.out.println("\t--> " + p.getFirstname() + " " + p.getLastname() + " " + p.getBirthdate());
        	log_text += "\t--> " + p.getFirstname() + " " + p.getLastname() + " " + p.getBirthdate() + "\n";
        }        
        
        System.out.println("=================================================");
        log_text += "\n=================================================\n\n";
	}
    
    /* readPerson(Long id) */
    private static void execMethod2(People people) 
    {
    	System.out.println("2: Person by id");
    	log_text += "2: Person by id\n";
    	System.out.println("readPerson(int id)");
    	log_text += "readPerson(int id) -> readPerson(1)\n";
    	
    	Person p = people.readPerson(1);
        
        System.out.println("\t--> " + p.getFirstname() + " " + p.getLastname() + " " + p.getBirthdate());
        log_text += "\t--> " + p.getFirstname() + " " + p.getLastname() + " " + p.getBirthdate() + "\n";
        
        System.out.println("=================================================");
        log_text += "\n=================================================\n\n";
	}
    
    /* updatePerson(Person p) */
    private static void execMethod3(People people) 
    {
        System.out.println("3: Update person");
        log_text += "3: Update person\n";
        System.out.println("updatePerson(Person p)");
    	log_text += "updatePerson(Person p) -> updatePerson(Person with id 1)\n";
        
        Person p = people.readPerson(1);
        
        System.out.println("\t--> Before: " + p.getFirstname() + " " + p.getLastname() + " " + p.getBirthdate());
        log_text += "\t--> Before: " + p.getFirstname() + " " + p.getLastname() + " " + p.getBirthdate() + "\n";
        
        p.setFirstname("Nuovo"); 
        int i = people.updatePerson(p);
        
        Person p1 = people.readPerson(i);        
        System.out.println("\t--> After: " + p1.getFirstname() + " " + p1.getLastname() + " " + p1.getBirthdate());
        log_text += "\t--> After: " + p1.getFirstname() + " " + p1.getLastname() + " " + p1.getBirthdate() + "\n";
        
        System.out.println("=================================================");
        log_text += "\n=================================================\n\n";
	}
    
    /* createPerson(Person p) */
    private static void execMethod4(People people) 
    {
    	System.out.println("4: Create person");
    	log_text += "4: Create person\n";
    	System.out.println("createPerson(Person p)");
    	log_text += "createPerson(Person p) -> createPerson(new Person)\n";
        
        Person p = makePerson(7, "Chuck", "Norris", "1945-01-01");
        
        HealthProfile h = new HealthProfile();
        List<Measure> m = h.getMeasure();
        m.add(makeMeasure(7, (float) 1.72, "1978-09-02", makeMeasureType(1, people)));
        m.add(makeMeasure(8, 75, "1978-09-02", makeMeasureType(2, people)));               
        p.setHealthProfile(h);
        
        int i = people.createPerson(p);
        
        Person p1 = people.readPerson(i);
        System.out.println("\t--> " + p1.getFirstname() + " " + p1.getLastname() + " " + p1.getBirthdate());
        log_text += "\t--> " + p1.getFirstname() + " " + p1.getLastname() + " " + p1.getBirthdate() + "\n";
        
        /* TODO: Inserire anche le misure con la nuova persona
	        Measure m3 = people.readMeasure(7, makeMeasureType(1, people).getType(), 7);
	        System.out.println("\t\t--> " + m3.getIdMeasure() + " " + m3.getValue());
	        
	        m3 = people.readMeasure(7, makeMeasureType(2, people).getType(), 8);
	        System.out.println("\t\t--> " + m3.getIdMeasure() + " " + m3.getValue());
        */
        
        System.out.println("=================================================");
        log_text += "\n=================================================\n\n";
	}
    
    /* deletePerson(Long id) */
    private static void execMethod5(People people) 
    {
    	System.out.println("5: Delete person 7");
    	log_text += "5: Delete person 7\n";
    	System.out.println("deletePerson(int id)");
    	log_text += "deletePerson(int id) -> deletePerson(7)\n";
        
        List<Person> pList = people.getPeopleList();
        
        System.out.println("\t--> Before:");
        log_text += "\t--> Before:\n";
        
        for(Person p1: pList)
        {
        	System.out.println("\t\t--> " + p1.getFirstname() + " " + p1.getLastname() + " " + p1.getBirthdate());
        	log_text += "\t\t--> " + p1.getFirstname() + " " + p1.getLastname() + " " + p1.getBirthdate() + "\n";
        }
        
        people.deletePerson(7);
        
        pList = people.getPeopleList();
        System.out.println("\t--> After:");
        log_text += "\t--> After:\n";
        
        for(Person p2: pList)
        {
        	System.out.println("\t\t--> " + p2.getFirstname() + " " + p2.getLastname() + " " + p2.getBirthdate());
        	log_text += "\t\t--> " + p2.getFirstname() + " " + p2.getLastname() + " " + p2.getBirthdate() + "\n";
        }
       
        System.out.println("=================================================");
        log_text += "\n=================================================\n\n";
	}
    
    /* readPersonHistory(Long id, String measureType) */
    private static void execMethod6(People people) 
    {
        System.out.println("6: History");
        log_text += "6: History\n";
        System.out.println("readPersonHistory(Long id, String measureType)");
    	log_text += "readPersonHistory(Long id, String measureType) -> readPersonHistory(1, \"height\")\n";
        
        List<Measure> mList = people.getMeasureHistory(1, "height");
        
        for(Measure m: mList)
        {
        	System.out.println("\t--> " + m.getIdMeasure() + " " + m.getValue());
        	log_text += "\t--> " + m.getIdMeasure() + " " + m.getValue() + "\n";
        }
        
        System.out.println("=================================================");
        log_text += "\n=================================================\n\n";
		
	}
    
    /* readMeasureTypes() */
    private static void execMethod7(People people) 
    {
        System.out.println("7: List of MeasureType");
        log_text += "7: List of MeasureType\n";
        System.out.println("readMeasureTypes()");
    	log_text += "readMeasureTypes()\n";
        
        List<MeasureType> mTList = people.getMeasureTypeList();
        
        for(MeasureType mT: mTList)
        {
        	System.out.println("\t--> " + mT.getIdMeasureType() + " " + mT.getType());
        	log_text += "\t--> " + mT.getIdMeasureType() + " " + mT.getType() + "\n";
        }
        
        System.out.println("=================================================");
        log_text += "\n=================================================\n\n";
		
	}
    
    /* readPersonMeasure(Long id, String measureType, Long mid) */
    private static void execMethod8(People people) 
    {
        System.out.println("8: Read measure");
        log_text += "8: Read measure\n";
        System.out.println("readPersonMeasure(Long id, String measureType, Long mid)");
    	log_text += "readPersonMeasure(Long id, String measureType, Long mid) -> readPersonMeasure(1, \"height\", 1)\n";
        
        Measure m = people.readMeasure(1, "height", 1);
        System.out.println("\t--> " + m.getIdMeasure() + " " + m.getValue());
        log_text += "\t--> " + m.getIdMeasure() + " " + m.getValue() + "\n";
        
        System.out.println("=================================================");
        log_text += "\n=================================================\n\n";
		
	}
    
    /* savePersonMeasure(Long id, Measure m) */
    private static void execMethod9(People people) 
    {
        System.out.println("9: Create measure");
        log_text += "9: Create measure\n";
        System.out.println("savePersonMeasure(Long id, Measure m)");
    	log_text += "savePersonMeasure(Long id, Measure m) -> savePersonMeasure(1, new Measure)\n";
        
        Measure tmp = makeMeasure(17, (float) 1.72, "2011-12-09", makeMeasureType(1, people));
        int i = people.createMeasure(1, tmp);
        
        Measure m = people.readMeasure(1, makeMeasureType(1, people).getType(), i);
        System.out.println("\t--> " + m.getIdMeasure() + " " + m.getValue());
        log_text += "\t--> " + m.getIdMeasure() + " " + m.getValue() + "\n";
        
        System.out.println("=================================================");
        log_text += "\n=================================================\n\n";
		
	}
    
    /* updatePersonMeasure(Long id, Measure m) */
    private static void execMethod10(People people) 
    {
        System.out.println("10: Update measure");
        log_text += "10: Update measure\n";
        System.out.println("updatePersonMeasure(Long id, Measure m)");
    	log_text += "updatePersonMeasure(Long id, Measure m) -> updatePersonMeasure(1, Measure mod) \n";
        
        Measure m = people.readMeasure(1, "height", 17);
        System.out.println("\t--> Before: " + m.getIdMeasure() + " " + m.getValue());
        log_text += "\t--> Before: " + m.getIdMeasure() + " " + m.getValue() + "\n";
        
        m.setValue((float) 1.81);
        int i = people.updateMeasure(1, m);
        
        Measure m1 = people.readMeasure(1, "height", i);
        
        System.out.println("\t--> After: " + m1.getIdMeasure() + " " + m1.getValue());
        log_text += "\t--> After: " + m1.getIdMeasure() + " " + m1.getValue() + "\n";
        
        System.out.println("=================================================");
        log_text += "\n=================================================\n\n";
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