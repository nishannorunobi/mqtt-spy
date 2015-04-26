//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.26 at 11:22:48 PM BST 
//


package pl.baczkowicz.mqttspy.common.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Copyable;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.builder.CopyBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBCopyBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBEqualsBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBHashCodeBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBToStringBuilder;


/**
 * <p>Java class for ReconnectionSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReconnectionSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RetryInterval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Resubscribe" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconnectionSettings", propOrder = {
    "retryInterval",
    "resubscribe"
})
public class ReconnectionSettings implements CopyTo, Copyable, Equals, HashCode, ToString
{

    @XmlElement(name = "RetryInterval")
    protected int retryInterval;
    @XmlElement(name = "Resubscribe")
    protected boolean resubscribe;

    /**
     * Default no-arg constructor
     * 
     */
    public ReconnectionSettings() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ReconnectionSettings(final int retryInterval, final boolean resubscribe) {
        this.retryInterval = retryInterval;
        this.resubscribe = resubscribe;
    }

    /**
     * Gets the value of the retryInterval property.
     * 
     */
    public int getRetryInterval() {
        return retryInterval;
    }

    /**
     * Sets the value of the retryInterval property.
     * 
     */
    public void setRetryInterval(int value) {
        this.retryInterval = value;
    }

    /**
     * Gets the value of the resubscribe property.
     * 
     */
    public boolean isResubscribe() {
        return resubscribe;
    }

    /**
     * Sets the value of the resubscribe property.
     * 
     */
    public void setResubscribe(boolean value) {
        this.resubscribe = value;
    }

    public void toString(ToStringBuilder toStringBuilder) {
        {
            int theRetryInterval;
            theRetryInterval = this.getRetryInterval();
            toStringBuilder.append("retryInterval", theRetryInterval);
        }
        {
            boolean theResubscribe;
            theResubscribe = this.isResubscribe();
            toStringBuilder.append("resubscribe", theResubscribe);
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof ReconnectionSettings)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        final ReconnectionSettings that = ((ReconnectionSettings) object);
        equalsBuilder.append(this.getRetryInterval(), that.getRetryInterval());
        equalsBuilder.append(this.isResubscribe(), that.isResubscribe());
    }

    public boolean equals(Object object) {
        if (!(object instanceof ReconnectionSettings)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EqualsBuilder equalsBuilder = new JAXBEqualsBuilder();
        equals(object, equalsBuilder);
        return equalsBuilder.isEquals();
    }

    public void hashCode(HashCodeBuilder hashCodeBuilder) {
        hashCodeBuilder.append(this.getRetryInterval());
        hashCodeBuilder.append(this.isResubscribe());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        final ReconnectionSettings copy = ((target == null)?((ReconnectionSettings) createCopy()):((ReconnectionSettings) target));
        {
            int sourceRetryInterval;
            sourceRetryInterval = this.getRetryInterval();
            int copyRetryInterval = ((int) copyBuilder.copy(sourceRetryInterval));
            copy.setRetryInterval(copyRetryInterval);
        }
        {
            boolean sourceResubscribe;
            sourceResubscribe = this.isResubscribe();
            boolean copyResubscribe = ((boolean) copyBuilder.copy(sourceResubscribe));
            copy.setResubscribe(copyResubscribe);
        }
        return copy;
    }

    public Object copyTo(Object target) {
        final CopyBuilder copyBuilder = new JAXBCopyBuilder();
        return copyTo(target, copyBuilder);
    }

    public Object createCopy() {
        return new ReconnectionSettings();
    }

}
