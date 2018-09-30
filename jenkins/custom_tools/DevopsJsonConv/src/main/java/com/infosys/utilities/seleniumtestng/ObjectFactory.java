/***********************************************************************************************
*
* Copyright 2018 Infosys Ltd.
* Use of this source code is governed by MIT license that can be found in the LICENSE file or at
* https://opensource.org/licenses/MIT.
*
***********************************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.03 at 02:28:31 PM IST 
//


package com.infosys.utilities.seleniumtestng;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the selenium package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: selenium
     * 
     */
   

    /**
     * Create an instance of {@link Testng }
     * 
     */
    public Testng createTestngResults() {
        return new Testng();
    }

    /**
     * Create an instance of {@link Testng.Suite }
     * 
     */
    public Testng.Suite createTestngResultsSuite() {
        return new Testng.Suite();
    }

    /**
     * Create an instance of {@link Testng.Suite.Test }
     * 
     */
    public Testng.Suite.Test createTestngResultsSuiteTest() {
        return new Testng.Suite.Test();
    }

    /**
     * Create an instance of {@link Testng.Suite.Test.Class }
     * 
     */
    public Testng.Suite.Test.Class createTestngResultsSuiteTestClass() {
        return new Testng.Suite.Test.Class();
    }

    /**
     * Create an instance of {@link Testng.Suite.Test.Class.TestMethod }
     * 
     */
    public Testng.Suite.Test.Class.TestMethod createTestngResultsSuiteTestClassTestMethod() {
        return new Testng.Suite.Test.Class.TestMethod();
    }

}
