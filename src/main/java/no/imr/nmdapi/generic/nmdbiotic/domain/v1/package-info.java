
@javax.xml.bind.annotation.XmlSchema(namespace = "http://www.imr.no/formats/nmdbiotic/v1", elementFormDefault = javax.xml.bind.annotation.XmlNsForm.QUALIFIED, xmlns = {
    @javax.xml.bind.annotation.XmlNs(namespaceURI = "http://www.imr.no/formats/nmdbiotic/v1", prefix = "")
})
@XmlJavaTypeAdapters({
        @XmlJavaTypeAdapter(value = no.imr.nmdapi.generic.nmdbiotic.domain.v1.adapters.BigDecimalAdapter.class, type = java.math.BigDecimal.class),
        @XmlJavaTypeAdapter(value = no.imr.nmdapi.generic.nmdbiotic.domain.v1.adapters.BigIntegerAdapter.class, type = java.math.BigInteger.class)
})
package no.imr.nmdapi.generic.nmdbiotic.domain.v1;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
