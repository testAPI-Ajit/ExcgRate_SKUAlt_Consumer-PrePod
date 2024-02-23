
package in.kpmg.iocl.skuapi;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the in.kpmg.iocl.skuapi package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: in.kpmg.iocl.skuapi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SkuAltConversionRequest }
     * 
     */
    public SkuAltConversionRequest createSkuAltConversionRequest() {
        return new SkuAltConversionRequest();
    }

    /**
     * Create an instance of {@link SkuAltConversionResponse }
     * 
     */
    public SkuAltConversionResponse createSkuAltConversionResponse() {
        return new SkuAltConversionResponse();
    }

    /**
     * Create an instance of {@link SkuAltConversion }
     * 
     */
    public SkuAltConversion createSkuAltConversion() {
        return new SkuAltConversion();
    }

}
