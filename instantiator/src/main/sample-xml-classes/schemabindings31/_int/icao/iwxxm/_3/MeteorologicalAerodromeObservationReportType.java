//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package schemabindings31._int.icao.iwxxm._3;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import schemabindings31.net.opengis.gml.v_3_2_1.TimeInstantPropertyType;


/**
 * <p>Java class for MeteorologicalAerodromeObservationReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeteorologicalAerodromeObservationReportType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://icao.int/iwxxm/3.0}ReportType">
 *       &lt;sequence>
 *         &lt;element name="issueTime" type="{http://www.opengis.net/gml/3.2}TimeInstantPropertyType"/>
 *         &lt;element name="aerodrome" type="{http://icao.int/iwxxm/3.0}AirportHeliportPropertyType"/>
 *         &lt;element name="observationTime" type="{http://www.opengis.net/gml/3.2}TimeInstantPropertyType"/>
 *         &lt;element name="observation" type="{http://icao.int/iwxxm/3.0}MeteorologicalAerodromeObservationPropertyType" minOccurs="0"/>
 *         &lt;element name="trendForecast" type="{http://icao.int/iwxxm/3.0}MeteorologicalAerodromeTrendForecastPropertyType" maxOccurs="3" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="automatedStation" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeteorologicalAerodromeObservationReportType", propOrder = {
    "issueTime",
    "aerodrome",
    "observationTime",
    "observation",
    "trendForecast"
})
@XmlSeeAlso({
    METARType.class,
    SPECIType.class
})
public abstract class MeteorologicalAerodromeObservationReportType
    extends ReportType
{

    @XmlElement(required = true)
    protected TimeInstantPropertyType issueTime;
    @XmlElement(required = true)
    protected AirportHeliportPropertyType aerodrome;
    @XmlElement(required = true)
    protected TimeInstantPropertyType observationTime;
    @XmlElementRef(name = "observation", namespace = "http://icao.int/iwxxm/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<MeteorologicalAerodromeObservationPropertyType> observation;
    @XmlElement(nillable = true)
    protected List<MeteorologicalAerodromeTrendForecastPropertyType> trendForecast;
    @XmlAttribute(name = "automatedStation")
    protected Boolean automatedStation;

    /**
     * Gets the value of the issueTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public TimeInstantPropertyType getIssueTime() {
        return issueTime;
    }

    /**
     * Sets the value of the issueTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public void setIssueTime(TimeInstantPropertyType value) {
        this.issueTime = value;
    }

    public boolean isSetIssueTime() {
        return (this.issueTime!= null);
    }

    /**
     * Gets the value of the aerodrome property.
     * 
     * @return
     *     possible object is
     *     {@link AirportHeliportPropertyType }
     *     
     */
    public AirportHeliportPropertyType getAerodrome() {
        return aerodrome;
    }

    /**
     * Sets the value of the aerodrome property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportHeliportPropertyType }
     *     
     */
    public void setAerodrome(AirportHeliportPropertyType value) {
        this.aerodrome = value;
    }

    public boolean isSetAerodrome() {
        return (this.aerodrome!= null);
    }

    /**
     * Gets the value of the observationTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public TimeInstantPropertyType getObservationTime() {
        return observationTime;
    }

    /**
     * Sets the value of the observationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public void setObservationTime(TimeInstantPropertyType value) {
        this.observationTime = value;
    }

    public boolean isSetObservationTime() {
        return (this.observationTime!= null);
    }

    /**
     * Gets the value of the observation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MeteorologicalAerodromeObservationPropertyType }{@code >}
     *     
     */
    public JAXBElement<MeteorologicalAerodromeObservationPropertyType> getObservation() {
        return observation;
    }

    /**
     * Sets the value of the observation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeteorologicalAerodromeObservationPropertyType }{@code >}
     *     
     */
    public void setObservation(JAXBElement<MeteorologicalAerodromeObservationPropertyType> value) {
        this.observation = value;
    }

    public boolean isSetObservation() {
        return (this.observation!= null);
    }

    /**
     * Gets the value of the trendForecast property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trendForecast property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrendForecast().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeteorologicalAerodromeTrendForecastPropertyType }
     * 
     * 
     */
    public List<MeteorologicalAerodromeTrendForecastPropertyType> getTrendForecast() {
        if (trendForecast == null) {
            trendForecast = new ArrayList<MeteorologicalAerodromeTrendForecastPropertyType>();
        }
        return this.trendForecast;
    }

    public boolean isSetTrendForecast() {
        return ((this.trendForecast!= null)&&(!this.trendForecast.isEmpty()));
    }

    public void unsetTrendForecast() {
        this.trendForecast = null;
    }

    /**
     * Gets the value of the automatedStation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAutomatedStation() {
        return automatedStation;
    }

    /**
     * Sets the value of the automatedStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomatedStation(boolean value) {
        this.automatedStation = value;
    }

    public boolean isSetAutomatedStation() {
        return (this.automatedStation!= null);
    }

    public void unsetAutomatedStation() {
        this.automatedStation = null;
    }

}
