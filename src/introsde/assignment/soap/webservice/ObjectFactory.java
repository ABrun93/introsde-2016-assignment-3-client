
package introsde.assignment.soap.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.assignment.soap.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetPeopleList_QNAME = new QName("http://webservice.soap.assignment.introsde/", "getPeopleList");
    private final static QName _UpdatePerson_QNAME = new QName("http://webservice.soap.assignment.introsde/", "updatePerson");
    private final static QName _UpdateMeasureResponse_QNAME = new QName("http://webservice.soap.assignment.introsde/", "updateMeasureResponse");
    private final static QName _Person_QNAME = new QName("http://webservice.soap.assignment.introsde/", "person");
    private final static QName _ReadPerson_QNAME = new QName("http://webservice.soap.assignment.introsde/", "readPerson");
    private final static QName _GetPeopleListResponse_QNAME = new QName("http://webservice.soap.assignment.introsde/", "getPeopleListResponse");
    private final static QName _Measure_QNAME = new QName("http://webservice.soap.assignment.introsde/", "measure");
    private final static QName _ReadMeasure_QNAME = new QName("http://webservice.soap.assignment.introsde/", "readMeasure");
    private final static QName _ReadPersonResponse_QNAME = new QName("http://webservice.soap.assignment.introsde/", "readPersonResponse");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://webservice.soap.assignment.introsde/", "updatePersonResponse");
    private final static QName _GetMeasureTypeListResponse_QNAME = new QName("http://webservice.soap.assignment.introsde/", "getMeasureTypeListResponse");
    private final static QName _ReadMeasureTypeResponse_QNAME = new QName("http://webservice.soap.assignment.introsde/", "readMeasureTypeResponse");
    private final static QName _CreatePerson_QNAME = new QName("http://webservice.soap.assignment.introsde/", "createPerson");
    private final static QName _DeletePerson_QNAME = new QName("http://webservice.soap.assignment.introsde/", "deletePerson");
    private final static QName _CreatePersonResponse_QNAME = new QName("http://webservice.soap.assignment.introsde/", "createPersonResponse");
    private final static QName _DeleteMeasureResponse_QNAME = new QName("http://webservice.soap.assignment.introsde/", "deleteMeasureResponse");
    private final static QName _MeasureType_QNAME = new QName("http://webservice.soap.assignment.introsde/", "measureType");
    private final static QName _CreateMeasureResponse_QNAME = new QName("http://webservice.soap.assignment.introsde/", "createMeasureResponse");
    private final static QName _CreateMeasure_QNAME = new QName("http://webservice.soap.assignment.introsde/", "createMeasure");
    private final static QName _UpdateMeasure_QNAME = new QName("http://webservice.soap.assignment.introsde/", "updateMeasure");
    private final static QName _DeletePersonResponse_QNAME = new QName("http://webservice.soap.assignment.introsde/", "deletePersonResponse");
    private final static QName _ReadMeasureType_QNAME = new QName("http://webservice.soap.assignment.introsde/", "readMeasureType");
    private final static QName _GetMeasureHistory_QNAME = new QName("http://webservice.soap.assignment.introsde/", "getMeasureHistory");
    private final static QName _GetMeasureHistoryResponse_QNAME = new QName("http://webservice.soap.assignment.introsde/", "getMeasureHistoryResponse");
    private final static QName _DeleteMeasure_QNAME = new QName("http://webservice.soap.assignment.introsde/", "deleteMeasure");
    private final static QName _ReadMeasureResponse_QNAME = new QName("http://webservice.soap.assignment.introsde/", "readMeasureResponse");
    private final static QName _GetMeasureTypeList_QNAME = new QName("http://webservice.soap.assignment.introsde/", "getMeasureTypeList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.assignment.soap.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link GetMeasureTypeList }
     * 
     */
    public GetMeasureTypeList createGetMeasureTypeList() {
        return new GetMeasureTypeList();
    }

    /**
     * Create an instance of {@link DeleteMeasure }
     * 
     */
    public DeleteMeasure createDeleteMeasure() {
        return new DeleteMeasure();
    }

    /**
     * Create an instance of {@link ReadMeasureResponse }
     * 
     */
    public ReadMeasureResponse createReadMeasureResponse() {
        return new ReadMeasureResponse();
    }

    /**
     * Create an instance of {@link GetMeasureHistoryResponse }
     * 
     */
    public GetMeasureHistoryResponse createGetMeasureHistoryResponse() {
        return new GetMeasureHistoryResponse();
    }

    /**
     * Create an instance of {@link GetMeasureHistory }
     * 
     */
    public GetMeasureHistory createGetMeasureHistory() {
        return new GetMeasureHistory();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link ReadMeasureType }
     * 
     */
    public ReadMeasureType createReadMeasureType() {
        return new ReadMeasureType();
    }

    /**
     * Create an instance of {@link CreateMeasure }
     * 
     */
    public CreateMeasure createCreateMeasure() {
        return new CreateMeasure();
    }

    /**
     * Create an instance of {@link UpdateMeasure }
     * 
     */
    public UpdateMeasure createUpdateMeasure() {
        return new UpdateMeasure();
    }

    /**
     * Create an instance of {@link CreateMeasureResponse }
     * 
     */
    public CreateMeasureResponse createCreateMeasureResponse() {
        return new CreateMeasureResponse();
    }

    /**
     * Create an instance of {@link DeleteMeasureResponse }
     * 
     */
    public DeleteMeasureResponse createDeleteMeasureResponse() {
        return new DeleteMeasureResponse();
    }

    /**
     * Create an instance of {@link MeasureType }
     * 
     */
    public MeasureType createMeasureType() {
        return new MeasureType();
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link CreatePersonResponse }
     * 
     */
    public CreatePersonResponse createCreatePersonResponse() {
        return new CreatePersonResponse();
    }

    /**
     * Create an instance of {@link CreatePerson }
     * 
     */
    public CreatePerson createCreatePerson() {
        return new CreatePerson();
    }

    /**
     * Create an instance of {@link GetMeasureTypeListResponse }
     * 
     */
    public GetMeasureTypeListResponse createGetMeasureTypeListResponse() {
        return new GetMeasureTypeListResponse();
    }

    /**
     * Create an instance of {@link ReadMeasureTypeResponse }
     * 
     */
    public ReadMeasureTypeResponse createReadMeasureTypeResponse() {
        return new ReadMeasureTypeResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link Measure }
     * 
     */
    public Measure createMeasure() {
        return new Measure();
    }

    /**
     * Create an instance of {@link ReadMeasure }
     * 
     */
    public ReadMeasure createReadMeasure() {
        return new ReadMeasure();
    }

    /**
     * Create an instance of {@link ReadPersonResponse }
     * 
     */
    public ReadPersonResponse createReadPersonResponse() {
        return new ReadPersonResponse();
    }

    /**
     * Create an instance of {@link GetPeopleListResponse }
     * 
     */
    public GetPeopleListResponse createGetPeopleListResponse() {
        return new GetPeopleListResponse();
    }

    /**
     * Create an instance of {@link ReadPerson }
     * 
     */
    public ReadPerson createReadPerson() {
        return new ReadPerson();
    }

    /**
     * Create an instance of {@link UpdateMeasureResponse }
     * 
     */
    public UpdateMeasureResponse createUpdateMeasureResponse() {
        return new UpdateMeasureResponse();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link GetPeopleList }
     * 
     */
    public GetPeopleList createGetPeopleList() {
        return new GetPeopleList();
    }

    /**
     * Create an instance of {@link Person.HealthProfile }
     * 
     */
    public Person.HealthProfile createPersonHealthProfile() {
        return new Person.HealthProfile();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPeopleList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soap.assignment.introsde/", name = "getPeopleList")
    public JAXBElement<GetPeopleList> createGetPeopleList(GetPeopleList value) {
        return new JAXBElement<GetPeopleList>(_GetPeopleList_QNAME, GetPeopleList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soap.assignment.introsde/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soap.assignment.introsde/", name = "updateMeasureResponse")
    public JAXBElement<UpdateMeasureResponse> createUpdateMeasureResponse(UpdateMeasureResponse value) {
        return new JAXBElement<UpdateMeasureResponse>(_UpdateMeasureResponse_QNAME, UpdateMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soap.assignment.introsde/", name = "person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soap.assignment.introsde/", name = "readPerson")
    public JAXBElement<ReadPerson> createReadPerson(ReadPerson value) {
        return new JAXBElement<ReadPerson>(_ReadPerson_QNAME, ReadPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPeopleListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soap.assignment.introsde/", name = "getPeopleListResponse")
    public JAXBElement<GetPeopleListResponse> createGetPeopleListResponse(GetPeopleListResponse value) {
        return new JAXBElement<GetPeopleListResponse>(_GetPeopleListResponse_QNAME, GetPeopleListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Measure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soap.assignment.introsde/", name = "measure")
    public JAXBElement<Measure> createMeasure(Measure value) {
        return new JAXBElement<Measure>(_Measure_QNAME, Measure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soap.assignment.introsde/", name = "readMeasure")
    public JAXBElement<ReadMeasure> createReadMeasure(ReadMeasure value) {
        return new JAXBElement<ReadMeasure>(_ReadMeasure_QNAME, ReadMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soap.assignment.introsde/", name = "readPersonResponse")
    public JAXBElement<ReadPersonResponse> createReadPersonResponse(ReadPersonResponse value) {
        return new JAXBElement<ReadPersonResponse>(_ReadPersonResponse_QNAME, ReadPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soap.assignment.introsde/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureTypeListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soap.assignment.introsde/", name = "getMeasureTypeListResponse")
    public JAXBElement<GetMeasureTypeListResponse> createGetMeasureTypeListResponse(GetMeasureTypeListResponse value) {
        return new JAXBElement<GetMeasureTypeListResponse>(_GetMeasureTypeListResponse_QNAME, GetMeasureTypeListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soap.assignment.introsde/", name = "readMeasureTypeResponse")
    public JAXBElement<ReadMeasureTypeResponse> createReadMeasureTypeResponse(ReadMeasureTypeResponse value) {
        return new JAXBElement<ReadMeasureTypeResponse>(_ReadMeasureTypeResponse_QNAME, ReadMeasureTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soap.assignment.introsde/", name = "createPerson")
    public JAXBElement<CreatePerson> createCreatePerson(CreatePerson value) {
        return new JAXBElement<CreatePerson>(_CreatePerson_QNAME, CreatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soap.assignment.introsde/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<DeletePerson>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soap.assignment.introsde/", name = "createPersonResponse")
    public JAXBElement<CreatePersonResponse> createCreatePersonResponse(CreatePersonResponse value) {
        return new JAXBElement<CreatePersonResponse>(_CreatePersonResponse_QNAME, CreatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soap.assignment.introsde/", name = "deleteMeasureResponse")
    public JAXBElement<DeleteMeasureResponse> createDeleteMeasureResponse(DeleteMeasureResponse value) {
        return new JAXBElement<DeleteMeasureResponse>(_DeleteMeasureResponse_QNAME, DeleteMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soap.assignment.introsde/", name = "measureType")
    public JAXBElement<MeasureType> createMeasureType(MeasureType value) {
        return new JAXBElement<MeasureType>(_MeasureType_QNAME, MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soap.assignment.introsde/", name = "createMeasureResponse")
    public JAXBElement<CreateMeasureResponse> createCreateMeasureResponse(CreateMeasureResponse value) {
        return new JAXBElement<CreateMeasureResponse>(_CreateMeasureResponse_QNAME, CreateMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soap.assignment.introsde/", name = "createMeasure")
    public JAXBElement<CreateMeasure> createCreateMeasure(CreateMeasure value) {
        return new JAXBElement<CreateMeasure>(_CreateMeasure_QNAME, CreateMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soap.assignment.introsde/", name = "updateMeasure")
    public JAXBElement<UpdateMeasure> createUpdateMeasure(UpdateMeasure value) {
        return new JAXBElement<UpdateMeasure>(_UpdateMeasure_QNAME, UpdateMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soap.assignment.introsde/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<DeletePersonResponse>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soap.assignment.introsde/", name = "readMeasureType")
    public JAXBElement<ReadMeasureType> createReadMeasureType(ReadMeasureType value) {
        return new JAXBElement<ReadMeasureType>(_ReadMeasureType_QNAME, ReadMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soap.assignment.introsde/", name = "getMeasureHistory")
    public JAXBElement<GetMeasureHistory> createGetMeasureHistory(GetMeasureHistory value) {
        return new JAXBElement<GetMeasureHistory>(_GetMeasureHistory_QNAME, GetMeasureHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soap.assignment.introsde/", name = "getMeasureHistoryResponse")
    public JAXBElement<GetMeasureHistoryResponse> createGetMeasureHistoryResponse(GetMeasureHistoryResponse value) {
        return new JAXBElement<GetMeasureHistoryResponse>(_GetMeasureHistoryResponse_QNAME, GetMeasureHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soap.assignment.introsde/", name = "deleteMeasure")
    public JAXBElement<DeleteMeasure> createDeleteMeasure(DeleteMeasure value) {
        return new JAXBElement<DeleteMeasure>(_DeleteMeasure_QNAME, DeleteMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soap.assignment.introsde/", name = "readMeasureResponse")
    public JAXBElement<ReadMeasureResponse> createReadMeasureResponse(ReadMeasureResponse value) {
        return new JAXBElement<ReadMeasureResponse>(_ReadMeasureResponse_QNAME, ReadMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureTypeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soap.assignment.introsde/", name = "getMeasureTypeList")
    public JAXBElement<GetMeasureTypeList> createGetMeasureTypeList(GetMeasureTypeList value) {
        return new JAXBElement<GetMeasureTypeList>(_GetMeasureTypeList_QNAME, GetMeasureTypeList.class, null, value);
    }

}
