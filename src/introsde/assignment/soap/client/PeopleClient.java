package introsde.assignment.soap.client;

import java.util.List;

import introsde.assignment.soap.webservice.PeopleService;
import introsde.assignment.soap.webservice.People;
import introsde.assignment.soap.webservice.Person;

public class PeopleClient{
    public static void main(String[] args) throws Exception {
        PeopleService service = new PeopleService();
        People people = service.getPeopleImplementationPort();
        Person p = people.readPerson(1);
        List<Person> pList = people.getPeopleList();
        System.out.println("Result ==> "+p);
        System.out.println("Result ==> "+pList);
        System.out.println("First Person in the list ==> "+pList.get(0).getFirstname());
    }
}