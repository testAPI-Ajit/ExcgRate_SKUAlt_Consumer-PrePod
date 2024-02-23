
package in.kpmg.iocl.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for allExchange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="allExchange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="effective_date" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="exchange_type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="from_currency_ratio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="to_currency_ratio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="from_currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="to_currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="exchange_rate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "allExchange", propOrder = {
    "effectiveDate",
    "exchangeType",
    "fromCurrencyRatio",
    "toCurrencyRatio",
    "fromCurrency",
    "toCurrency",
    "exchangeRate"
})
public class AllExchange {

    @XmlElement(name = "effective_date", required = true)
    protected String effectiveDate;
    @XmlElement(name = "exchange_type", required = true)
    protected String exchangeType;
    @XmlElement(name = "from_currency_ratio", required = true)
    protected String fromCurrencyRatio;
    @XmlElement(name = "to_currency_ratio", required = true)
    protected String toCurrencyRatio;
    @XmlElement(name = "from_currency", required = true)
    protected String fromCurrency;
    @XmlElement(name = "to_currency", required = true)
    protected String toCurrency;
    @XmlElement(name = "exchange_rate", required = true)
    protected String exchangeRate;

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDate(String value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the exchangeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeType() {
        return exchangeType;
    }

    /**
     * Sets the value of the exchangeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeType(String value) {
        this.exchangeType = value;
    }

    /**
     * Gets the value of the fromCurrencyRatio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCurrencyRatio() {
        return fromCurrencyRatio;
    }

    /**
     * Sets the value of the fromCurrencyRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCurrencyRatio(String value) {
        this.fromCurrencyRatio = value;
    }

    /**
     * Gets the value of the toCurrencyRatio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCurrencyRatio() {
        return toCurrencyRatio;
    }

    /**
     * Sets the value of the toCurrencyRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCurrencyRatio(String value) {
        this.toCurrencyRatio = value;
    }

    /**
     * Gets the value of the fromCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCurrency() {
        return fromCurrency;
    }

    /**
     * Sets the value of the fromCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCurrency(String value) {
        this.fromCurrency = value;
    }

    /**
     * Gets the value of the toCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCurrency() {
        return toCurrency;
    }

    /**
     * Sets the value of the toCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCurrency(String value) {
        this.toCurrency = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeRate(String value) {
        this.exchangeRate = value;
    }

}
