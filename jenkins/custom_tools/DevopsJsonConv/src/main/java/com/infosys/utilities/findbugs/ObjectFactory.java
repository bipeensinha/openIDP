/***********************************************************************************************
*
* Copyright 2018 Infosys Ltd.
* Use of this source code is governed by MIT license that can be found in the LICENSE file or at
* https://opensource.org/licenses/MIT.
*
***********************************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-146 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.09 at 05:31:15 PM IST 
//

package com.infosys.utilities.findbugs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.infosys.Utils.Findbugs package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _BugCollectionBugInstanceField_QNAME = new QName("", "Field");
	private final static QName _BugCollectionBugInstanceLongMessage_QNAME = new QName("", "LongMessage");
	private final static QName _BugCollectionBugInstanceMethod_QNAME = new QName("", "Method");
	private final static QName _BugCollectionBugInstanceString_QNAME = new QName("", "String");
	private final static QName _BugCollectionBugInstanceType_QNAME = new QName("", "Type");
	private final static QName _BugCollectionBugInstanceClass_QNAME = new QName("", "Class");
	private final static QName _BugCollectionBugInstanceProperty_QNAME = new QName("", "Property");
	private final static QName _BugCollectionBugInstanceInt_QNAME = new QName("", "Int");
	private final static QName _BugCollectionBugInstanceLocalVariable_QNAME = new QName("", "LocalVariable");
	private final static QName _BugCollectionBugInstanceSourceLine_QNAME = new QName("", "SourceLine");
	private final static QName _BugCollectionBugInstanceShortMessage_QNAME = new QName("", "ShortMessage");
	private final static QName _BugCollectionBugInstanceMethodSourceLineMessage_QNAME = new QName("", "Message");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.infosys.Utils.Findbugs
	 * 
	 */
	

	/**
	 * Create an instance of {@link BugCollection }
	 * 
	 */
	public BugCollection createBugCollection() {
		return new BugCollection();
	}

	/**
	 * Create an instance of {@link BugCollection.BugInstance.Int }
	 * 
	 */
	public BugCollection.BugInstance.Int createBugCollectionBugInstanceInt() {
		return new BugCollection.BugInstance.Int();
	}

	/**
	 * Create an instance of {@link BugCollection.BugInstance.Field }
	 * 
	 */
	public BugCollection.BugInstance.Field createBugCollectionBugInstanceField() {
		return new BugCollection.BugInstance.Field();
	}

	/**
	 * Create an instance of {@link BugCollection.BugCode }
	 * 
	 */
	public BugCollection.BugCode createBugCollectionBugCode() {
		return new BugCollection.BugCode();
	}

	/**
	 * Create an instance of {@link BugCollection.FindBugsSummary.PackageStats }
	 * 
	 */
	public BugCollection.FindBugsSummary.PackageStats createBugCollectionFindBugsSummaryPackageStats() {
		return new BugCollection.FindBugsSummary.PackageStats();
	}

	/**
	 * Create an instance of {@link BugCollection.BugInstance.String }
	 * 
	 */
	public BugCollection.BugInstance.String createBugCollectionBugInstanceString() {
		return new BugCollection.BugInstance.String();
	}

	/**
	 * Create an instance of {@link BugCollection.Project }
	 * 
	 */
	public BugCollection.Project createBugCollectionProject() {
		return new BugCollection.Project();
	}

	/**
	 * Create an instance of {@link BugCollection.BugInstance.Class.SourceLine }
	 * 
	 */
	public BugCollection.BugInstance.Class.SourceLine createBugCollectionBugInstanceClassSourceLine() {
		return new BugCollection.BugInstance.Class.SourceLine();
	}

	/**
	 * Create an instance of
	 * {@link BugCollection.FindBugsSummary.FindBugsProfile.ClassProfile }
	 * 
	 */
	public BugCollection.FindBugsSummary.FindBugsProfile.ClassProfile createBugCollectionFindBugsSummaryFindBugsProfileClassProfile() {
		return new BugCollection.FindBugsSummary.FindBugsProfile.ClassProfile();
	}

	/**
	 * Create an instance of {@link BugCollection.BugInstance.Type }
	 * 
	 */
	public BugCollection.BugInstance.Type createBugCollectionBugInstanceType() {
		return new BugCollection.BugInstance.Type();
	}

	/**
	 * Create an instance of
	 * {@link BugCollection.FindBugsSummary.PackageStats.ClassStats }
	 * 
	 */
	public BugCollection.FindBugsSummary.PackageStats.ClassStats createBugCollectionFindBugsSummaryPackageStatsClassStats() {
		return new BugCollection.FindBugsSummary.PackageStats.ClassStats();
	}

	/**
	 * Create an instance of {@link BugCollection.BugPattern }
	 * 
	 */
	public BugCollection.BugPattern createBugCollectionBugPattern() {
		return new BugCollection.BugPattern();
	}

	/**
	 * Create an instance of {@link BugCollection.BugInstance.Method }
	 * 
	 */
	public BugCollection.BugInstance.Method createBugCollectionBugInstanceMethod() {
		return new BugCollection.BugInstance.Method();
	}

	/**
	 * Create an instance of {@link BugCollection.FindBugsSummary.FileStats }
	 * 
	 */
	public BugCollection.FindBugsSummary.FileStats createBugCollectionFindBugsSummaryFileStats() {
		return new BugCollection.FindBugsSummary.FileStats();
	}

	/**
	 * Create an instance of
	 * {@link BugCollection.FindBugsSummary.FindBugsProfile }
	 * 
	 */
	public BugCollection.FindBugsSummary.FindBugsProfile createBugCollectionFindBugsSummaryFindBugsProfile() {
		return new BugCollection.FindBugsSummary.FindBugsProfile();
	}

	/**
	 * Create an instance of {@link BugCollection.BugInstance.LocalVariable }
	 * 
	 */
	public BugCollection.BugInstance.LocalVariable createBugCollectionBugInstanceLocalVariable() {
		return new BugCollection.BugInstance.LocalVariable();
	}

	/**
	 * Create an instance of {@link BugCollection.FindBugsSummary }
	 * 
	 */
	public BugCollection.FindBugsSummary createBugCollectionFindBugsSummary() {
		return new BugCollection.FindBugsSummary();
	}

	/**
	 * Create an instance of {@link BugCollection.Errors }
	 * 
	 */
	public BugCollection.Errors createBugCollectionErrors() {
		return new BugCollection.Errors();
	}

	/**
	 * Create an instance of {@link BugCollection.BugCategory }
	 * 
	 */
	public BugCollection.BugCategory createBugCollectionBugCategory() {
		return new BugCollection.BugCategory();
	}

	/**
	 * Create an instance of {@link BugCollection.BugInstance.Class }
	 * 
	 */
	public BugCollection.BugInstance.Class createBugCollectionBugInstanceClass() {
		return new BugCollection.BugInstance.Class();
	}

	/**
	 * Create an instance of {@link BugCollection.BugInstance.Field.SourceLine }
	 * 
	 */
	public BugCollection.BugInstance.Field.SourceLine createBugCollectionBugInstanceFieldSourceLine() {
		return new BugCollection.BugInstance.Field.SourceLine();
	}

	/**
	 * Create an instance of {@link BugCollection.BugInstance }
	 * 
	 */
	public BugCollection.BugInstance createBugCollectionBugInstance() {
		return new BugCollection.BugInstance();
	}

	/**
	 * Create an instance of {@link BugCollection.BugInstance.Type.SourceLine }
	 * 
	 */
	public BugCollection.BugInstance.Type.SourceLine createBugCollectionBugInstanceTypeSourceLine() {
		return new BugCollection.BugInstance.Type.SourceLine();
	}

	/**
	 * Create an instance of {@link BugCollection.BugInstance.Property }
	 * 
	 */
	public BugCollection.BugInstance.Property createBugCollectionBugInstanceProperty() {
		return new BugCollection.BugInstance.Property();
	}

	/**
	 * Create an instance of
	 * {@link BugCollection.BugInstance.Method.SourceLine }
	 * 
	 */
	public BugCollection.BugInstance.Method.SourceLine createBugCollectionBugInstanceMethodSourceLine() {
		return new BugCollection.BugInstance.Method.SourceLine();
	}

	/**
	 * Create an instance of {@link BugCollection.BugInstance.SourceLine }
	 * 
	 */
	public BugCollection.BugInstance.SourceLine createBugCollectionBugInstanceSourceLine() {
		return new BugCollection.BugInstance.SourceLine();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link BugCollection.BugInstance.Field }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "Field", scope = BugCollection.BugInstance.class)
	public JAXBElement<BugCollection.BugInstance.Field> createBugCollectionBugInstanceField(
			BugCollection.BugInstance.Field value) {
		return new JAXBElement<BugCollection.BugInstance.Field>(_BugCollectionBugInstanceField_QNAME,
				BugCollection.BugInstance.Field.class, BugCollection.BugInstance.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link java.lang.String }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "LongMessage", scope = BugCollection.BugInstance.class)
	public JAXBElement<java.lang.String> createBugCollectionBugInstanceLongMessage(java.lang.String value) {
		return new JAXBElement<java.lang.String>(_BugCollectionBugInstanceLongMessage_QNAME, java.lang.String.class,
				BugCollection.BugInstance.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link BugCollection.BugInstance.Method }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "Method", scope = BugCollection.BugInstance.class)
	public JAXBElement<BugCollection.BugInstance.Method> createBugCollectionBugInstanceMethod(
			BugCollection.BugInstance.Method value) {
		return new JAXBElement<BugCollection.BugInstance.Method>(_BugCollectionBugInstanceMethod_QNAME,
				BugCollection.BugInstance.Method.class, BugCollection.BugInstance.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link BugCollection.BugInstance.String }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "String", scope = BugCollection.BugInstance.class)
	public JAXBElement<BugCollection.BugInstance.String> createBugCollectionBugInstanceString(
			BugCollection.BugInstance.String value) {
		return new JAXBElement<BugCollection.BugInstance.String>(_BugCollectionBugInstanceString_QNAME,
				BugCollection.BugInstance.String.class, BugCollection.BugInstance.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link BugCollection.BugInstance.Type }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "Type", scope = BugCollection.BugInstance.class)
	public JAXBElement<BugCollection.BugInstance.Type> createBugCollectionBugInstanceType(
			BugCollection.BugInstance.Type value) {
		return new JAXBElement<BugCollection.BugInstance.Type>(_BugCollectionBugInstanceType_QNAME,
				BugCollection.BugInstance.Type.class, BugCollection.BugInstance.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link BugCollection.BugInstance.Class }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "Class", scope = BugCollection.BugInstance.class)
	public JAXBElement<BugCollection.BugInstance.Class> createBugCollectionBugInstanceClass(
			BugCollection.BugInstance.Class value) {
		return new JAXBElement<BugCollection.BugInstance.Class>(_BugCollectionBugInstanceClass_QNAME,
				BugCollection.BugInstance.Class.class, BugCollection.BugInstance.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link BugCollection.BugInstance.Property }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "Property", scope = BugCollection.BugInstance.class)
	public JAXBElement<BugCollection.BugInstance.Property> createBugCollectionBugInstanceProperty(
			BugCollection.BugInstance.Property value) {
		return new JAXBElement<BugCollection.BugInstance.Property>(_BugCollectionBugInstanceProperty_QNAME,
				BugCollection.BugInstance.Property.class, BugCollection.BugInstance.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link BugCollection.BugInstance.Int }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "Int", scope = BugCollection.BugInstance.class)
	public JAXBElement<BugCollection.BugInstance.Int> createBugCollectionBugInstanceInt(
			BugCollection.BugInstance.Int value) {
		return new JAXBElement<BugCollection.BugInstance.Int>(_BugCollectionBugInstanceInt_QNAME,
				BugCollection.BugInstance.Int.class, BugCollection.BugInstance.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link BugCollection.BugInstance.LocalVariable }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "LocalVariable", scope = BugCollection.BugInstance.class)
	public JAXBElement<BugCollection.BugInstance.LocalVariable> createBugCollectionBugInstanceLocalVariable(
			BugCollection.BugInstance.LocalVariable value) {
		return new JAXBElement<BugCollection.BugInstance.LocalVariable>(_BugCollectionBugInstanceLocalVariable_QNAME,
				BugCollection.BugInstance.LocalVariable.class, BugCollection.BugInstance.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link BugCollection.BugInstance.SourceLine }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "SourceLine", scope = BugCollection.BugInstance.class)
	public JAXBElement<BugCollection.BugInstance.SourceLine> createBugCollectionBugInstanceSourceLine(
			BugCollection.BugInstance.SourceLine value) {
		return new JAXBElement<BugCollection.BugInstance.SourceLine>(_BugCollectionBugInstanceSourceLine_QNAME,
				BugCollection.BugInstance.SourceLine.class, BugCollection.BugInstance.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link java.lang.String }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "ShortMessage", scope = BugCollection.BugInstance.class)
	public JAXBElement<java.lang.String> createBugCollectionBugInstanceShortMessage(java.lang.String value) {
		return new JAXBElement<java.lang.String>(_BugCollectionBugInstanceShortMessage_QNAME, java.lang.String.class,
				BugCollection.BugInstance.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link java.lang.String }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "Message", scope = BugCollection.BugInstance.Method.SourceLine.class)
	public JAXBElement<java.lang.String> createBugCollectionBugInstanceMethodSourceLineMessage(java.lang.String value) {
		return new JAXBElement<java.lang.String>(_BugCollectionBugInstanceMethodSourceLineMessage_QNAME,
				java.lang.String.class, BugCollection.BugInstance.Method.SourceLine.class, value);
	}

}
