//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.16 at 01:43:14 AM EDT 
//


package org.pentaho.platform.repository2.unified.exportManifest.bindings;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.pentaho.platform.repository2.unified.exportManifest.bindings package. 
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

    private final static QName _ExportManifest_QNAME = new QName("http://www.pentaho.com/schema/", "ExportManifest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.pentaho.platform.repository2.unified.exportManifest.bindings
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EntityAcl }
     * 
     */
    public EntityAcl createEntityAcl() {
        return new EntityAcl();
    }

    /**
     * Create an instance of {@link Parameters }
     * 
     */
    public Parameters createParameters() {
        return new Parameters();
    }

    /**
     * Create an instance of {@link Parameters.Entries }
     * 
     */
    public Parameters.Entries createParametersEntries() {
        return new Parameters.Entries();
    }

    /**
     * Create an instance of {@link ExportManifestDto }
     * 
     */
    public ExportManifestDto createExportManifestDto() {
        return new ExportManifestDto();
    }

    /**
     * Create an instance of {@link EntityMetaData }
     * 
     */
    public EntityMetaData createEntityMetaData() {
        return new EntityMetaData();
    }

    /**
     * Create an instance of {@link ExportManifestProperty }
     * 
     */
    public ExportManifestProperty createExportManifestProperty() {
        return new ExportManifestProperty();
    }

    /**
     * Create an instance of {@link CustomProperty }
     * 
     */
    public CustomProperty createCustomProperty() {
        return new CustomProperty();
    }

    /**
     * Create an instance of {@link ExportManifestDatasource }
     * 
     */
    public ExportManifestDatasource createExportManifestDatasource() {
        return new ExportManifestDatasource();
    }

    /**
     * Create an instance of {@link ExportManifestEntityDto }
     * 
     */
    public ExportManifestEntityDto createExportManifestEntityDto() {
        return new ExportManifestEntityDto();
    }

    /**
     * Create an instance of {@link ExportManifestMetadata }
     * 
     */
    public ExportManifestMetadata createExportManifestMetadata() {
        return new ExportManifestMetadata();
    }

    /**
     * Create an instance of {@link ExportManifestMondrian }
     * 
     */
    public ExportManifestMondrian createExportManifestMondrian() {
        return new ExportManifestMondrian();
    }

    /**
     * Create an instance of {@link EntityAcl.Aces }
     * 
     */
    public EntityAcl.Aces createEntityAclAces() {
        return new EntityAcl.Aces();
    }

    /**
     * Create an instance of {@link Parameters.Entries.Entry }
     * 
     */
    public Parameters.Entries.Entry createParametersEntriesEntry() {
        return new Parameters.Entries.Entry();
    }

    /**
     * Create an instance of {@link ExportManifestDto.ExportManifestInformation }
     * 
     */
    public ExportManifestDto.ExportManifestInformation createExportManifestDtoExportManifestInformation() {
        return new ExportManifestDto.ExportManifestInformation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportManifestDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pentaho.com/schema/", name = "ExportManifest")
    public JAXBElement<ExportManifestDto> createExportManifest(ExportManifestDto value) {
        return new JAXBElement<ExportManifestDto>(_ExportManifest_QNAME, ExportManifestDto.class, null, value);
    }

}
