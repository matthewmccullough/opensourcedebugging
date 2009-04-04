
package com.ambientideas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCarShow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCarShow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CarShow" type="{http://DefaultNamespace}CarShow" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCarShow", propOrder = {
    "carShow"
})
public class ArrayOfCarShow {

    @XmlElement(name = "CarShow", nillable = true)
    protected List<CarShow_Type> carShow;

    /**
     * Gets the value of the carShow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carShow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarShow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarShow_Type }
     * 
     * 
     */
    public List<CarShow_Type> getCarShow() {
        if (carShow == null) {
            carShow = new ArrayList<CarShow_Type>();
        }
        return this.carShow;
    }

    public String toString() {
        String result = new String();
        for (CarShow_Type cst : getCarShow()) {
            result = result + cst + "\r\n";
        }

        return result;
    }

}
