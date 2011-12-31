package org.jboss.ironjacamar.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.ironjacamar.api.SecurityType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> securityType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:27.07-07:00
 */
public class SecurityTypeImpl<T> implements Child<T>, SecurityType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public SecurityTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public SecurityTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityType ElementName: javaee:emptyType ElementType : application
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>application</code> element 
    * @return the current instance of <code>SecurityType<T></code> 
    */
   public SecurityType<T> application()
   {
      childNode.getOrCreate("application");
      return this;
   }

   /**
    * Removes the <code>application</code> element 
    * @return the current instance of <code>SecurityType<T></code> 
    */
   public Boolean isApplication()
   {
      return childNode.getSingle("application") != null;
   }

   /**
    * Removes the <code>application</code> element 
    * @return the current instance of <code>SecurityType<T></code> 
    */
   public SecurityType<T> removeApplication()
   {
      childNode.removeChild("application");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityType ElementName: xsd:token ElementType : security-domain
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>security-domain</code> element
    * @param securityDomain the value for the element <code>security-domain</code> 
    * @return the current instance of <code>SecurityType<T></code> 
    */
   public SecurityType<T> securityDomain(String securityDomain)
   {
      childNode.getOrCreate("security-domain").text(securityDomain);
      return this;
   }

   /**
    * Returns the <code>security-domain</code> element
    * @return the node defined for the element <code>security-domain</code> 
    */
   public String getSecurityDomain()
   {
      return childNode.getTextValueForPatternName("security-domain");
   }

   /**
    * Removes the <code>security-domain</code> element 
    * @return the current instance of <code>SecurityType<T></code> 
    */
   public SecurityType<T> removeSecurityDomain()
   {
      childNode.removeChildren("security-domain");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityType ElementName: xsd:token ElementType : security-domain-and-application
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>security-domain-and-application</code> element
    * @param securityDomainAndApplication the value for the element <code>security-domain-and-application</code> 
    * @return the current instance of <code>SecurityType<T></code> 
    */
   public SecurityType<T> securityDomainAndApplication(String securityDomainAndApplication)
   {
      childNode.getOrCreate("security-domain-and-application").text(securityDomainAndApplication);
      return this;
   }

   /**
    * Returns the <code>security-domain-and-application</code> element
    * @return the node defined for the element <code>security-domain-and-application</code> 
    */
   public String getSecurityDomainAndApplication()
   {
      return childNode.getTextValueForPatternName("security-domain-and-application");
   }

   /**
    * Removes the <code>security-domain-and-application</code> element 
    * @return the current instance of <code>SecurityType<T></code> 
    */
   public SecurityType<T> removeSecurityDomainAndApplication()
   {
      childNode.removeChildren("security-domain-and-application");
      return this;
   }
}