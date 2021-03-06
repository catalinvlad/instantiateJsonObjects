//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package schemabindings31._int.icao.iwxxm._3;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import schemabindings31.net.opengis.gml.v_3_2_1.TimeInstantPropertyType;
import schemabindings31.net.opengis.gml.v_3_2_1.TimePeriodPropertyType;


/**
 * <p>Java class for TAFType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TAFType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://icao.int/iwxxm/3.0}ReportType">
 *       &lt;sequence>
 *         &lt;element name="issueTime" type="{http://www.opengis.net/gml/3.2}TimeInstantPropertyType"/>
 *         &lt;element name="aerodrome" type="{http://icao.int/iwxxm/3.0}AirportHeliportPropertyType"/>
 *         &lt;element name="validPeriod" type="{http://www.opengis.net/gml/3.2}TimePeriodPropertyType" minOccurs="0"/>
 *         &lt;element name="cancelledReportValidPeriod" type="{http://www.opengis.net/gml/3.2}TimePeriodPropertyType" minOccurs="0"/>
 *         &lt;element name="baseForecast" type="{http://icao.int/iwxxm/3.0}MeteorologicalAerodromeForecastPropertyType" minOccurs="0"/>
 *         &lt;element name="changeForecast" type="{http://icao.int/iwxxm/3.0}MeteorologicalAerodromeForecastPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://icao.int/iwxxm/3.0}ExtensionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isCancelReport" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAFType", propOrder = {
    "issueTime",
    "aerodrome",
    "validPeriod",
    "cancelledReportValidPeriod",
    "baseForecast",
    "changeForecast",
    "extension"
})
public class TAFType
    extends ReportType
{

    @XmlElement(required = true)
    protected TimeInstantPropertyType issueTime;
    @XmlElement(required = true)
    protected AirportHeliportPropertyType aerodrome;
    protected TimePeriodPropertyType validPeriod;
    protected TimePeriodPropertyType cancelledReportValidPeriod;
    protected MeteorologicalAerodromeForecastPropertyType baseForecast;
    protected List<MeteorologicalAerodromeForecastPropertyType> changeForecast;
    protected List<ExtensionType> extension;
    @XmlAttribute(name = "isCancelReport")
    protected Boolean isCancelReport;

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
     * Gets the value of the validPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public TimePeriodPropertyType getValidPeriod() {
        return validPeriod;
    }

    /**
     * Sets the value of the validPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public void setValidPeriod(TimePeriodPropertyType value) {
        this.validPeriod = value;
    }

    public boolean isSetValidPeriod() {
        return (this.validPeriod!= null);
    }

    /**
     * Gets the value of the cancelledReportValidPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public TimePeriodPropertyType getCancelledReportValidPeriod() {
        return cancelledReportValidPeriod;
    }

    /**
     * Sets the value of the cancelledReportValidPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public void setCancelledReportValidPeriod(TimePeriodPropertyType value) {
        this.cancelledReportValidPeriod = value;
    }

    public boolean isSetCancelledReportValidPeriod() {
        return (this.cancelledReportValidPeriod!= null);
    }

    /**
     * Gets the value of the baseForecast property.
     * 
     * @return
     *     possible object is
     *     {@link MeteorologicalAerodromeForecastPropertyType }
     *     
     */
    public MeteorologicalAerodromeForecastPropertyType getBaseForecast() {
        return baseForecast;
    }

    /**
     * Sets the value of the baseForecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeteorologicalAerodromeForecastPropertyType }
     *     
     */
    public void setBaseForecast(MeteorologicalAerodromeForecastPropertyType value) {
        this.baseForecast = value;
    }

    public boolean isSetBaseForecast() {
        return (this.baseForecast!= null);
    }

    /**
     * Gets the value of the changeForecast property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeForecast property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeForecast().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeteorologicalAerodromeForecastPropertyType }
     * 
     * 
     */
    public List<MeteorologicalAerodromeForecastPropertyType> getChangeForecast() {
        if (changeForecast == null) {
            changeForecast = new ArrayList<MeteorologicalAerodromeForecastPropertyType>();
        }
        return this.changeForecast;
    }

    public boolean isSetChangeForecast() {
        return ((this.changeForecast!= null)&&(!this.changeForecast.isEmpty()));
    }

    public void unsetChangeForecast() {
        this.changeForecast = null;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionType }
     * 
     * 
     */
    public List<ExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<ExtensionType>();
        }
        return this.extension;
    }

    public boolean isSetExtension() {
        return ((this.extension!= null)&&(!this.extension.isEmpty()));
    }

    public void unsetExtension() {
        this.extension = null;
    }

    /**
     * Gets the value of the isCancelReport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsCancelReport() {
        return isCancelReport;
    }

    /**
     * Sets the value of the isCancelReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCancelReport(boolean value) {
        this.isCancelReport = value;
    }

    public boolean isSetIsCancelReport() {
        return (this.isCancelReport!= null);
    }

    public void unsetIsCancelReport() {
        this.isCancelReport = null;
    }

}
