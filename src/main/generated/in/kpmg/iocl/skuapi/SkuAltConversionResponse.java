
package in.kpmg.iocl.skuapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="sku_alt_conversion" type="{http://www.kpmg.in/iocl/SKUapi}sku_alt_conversion" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "isSuccess",
    "skuAltConversion"
})
@XmlRootElement(name = "Sku_alt_conversionResponse")
public class SkuAltConversionResponse {

    protected boolean isSuccess;
    @XmlElement(name = "sku_alt_conversion", required = true)
    protected List<SkuAltConversion> skuAltConversion;

    /**
     * Gets the value of the isSuccess property.
     * 
     */
    public boolean isIsSuccess() {
        return isSuccess;
    }

    /**
     * Sets the value of the isSuccess property.
     * 
     */
    public void setIsSuccess(boolean value) {
        this.isSuccess = value;
    }

    /**
     * Gets the value of the skuAltConversion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the skuAltConversion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSkuAltConversion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SkuAltConversion }
     * 
     * 
     */
    public List<SkuAltConversion> getSkuAltConversion() {
        if (skuAltConversion == null) {
            skuAltConversion = new ArrayList<SkuAltConversion>();
        }
        return this.skuAltConversion;
    }

}
