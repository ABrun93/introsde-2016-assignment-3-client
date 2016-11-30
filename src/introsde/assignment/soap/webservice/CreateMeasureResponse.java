
package introsde.assignment.soap.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per createMeasureResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="createMeasureResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="measure" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createMeasureResponse", propOrder = {
    "measure"
})
public class CreateMeasureResponse {

    protected int measure;

    /**
     * Recupera il valore della proprietà measure.
     * 
     */
    public int getMeasure() {
        return measure;
    }

    /**
     * Imposta il valore della proprietà measure.
     * 
     */
    public void setMeasure(int value) {
        this.measure = value;
    }

}
