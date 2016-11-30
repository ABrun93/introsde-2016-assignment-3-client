
package introsde.assignment.soap.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per readMeasureTypeResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="readMeasureTypeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://webservice.soap.assignment.introsde/}measureType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readMeasureTypeResponse", propOrder = {
    "measureType"
})
public class ReadMeasureTypeResponse {

    @XmlElement(namespace = "http://webservice.soap.assignment.introsde/")
    protected MeasureType measureType;

    /**
     * Recupera il valore della proprietà measureType.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getMeasureType() {
        return measureType;
    }

    /**
     * Imposta il valore della proprietà measureType.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setMeasureType(MeasureType value) {
        this.measureType = value;
    }

}
