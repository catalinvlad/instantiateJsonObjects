//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package schemabindings31.aero.aixm.schema._5_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElevatedCurvePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElevatedCurvePropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}ElevatedCurve"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElevatedCurvePropertyType", propOrder = {
    "elevatedCurve"
})
public class ElevatedCurvePropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "ElevatedCurve", required = true)
    protected ElevatedCurveType elevatedCurve;

    /**
     * Gets the value of the elevatedCurve property.
     * 
     * @return
     *     possible object is
     *     {@link ElevatedCurveType }
     *     
     */
    public ElevatedCurveType getElevatedCurve() {
        return elevatedCurve;
    }

    /**
     * Sets the value of the elevatedCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElevatedCurveType }
     *     
     */
    public void setElevatedCurve(ElevatedCurveType value) {
        this.elevatedCurve = value;
    }

    public boolean isSetElevatedCurve() {
        return (this.elevatedCurve!= null);
    }

}
