/*
 * JBoss, Home of Professional Open Source
 *
 * Copyright 2010, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @authors tag. All rights reserved.
 * See the copyright.txt in the distribution for a full listing
 * of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU General Public License, v. 2.0.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License,
 * v. 2.0 along with this distribution; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 */
package org.mobicents.slee.resource.diameter.sh.events.avp.userdata;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import net.java.slee.resource.diameter.sh.events.avp.userdata.PublicIdentity;
import net.java.slee.resource.diameter.sh.events.avp.userdata.ShDataExtension;
import net.java.slee.resource.diameter.sh.events.avp.userdata.ShDataExtension2;


/**
 * <p>Java class for tSh-Data-Extension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tSh-Data-Extension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegisteredIdentities" type="{}tPublicIdentity" minOccurs="0"/>
 *         &lt;element name="ImplicitIdentities" type="{}tPublicIdentity" minOccurs="0"/>
 *         &lt;element name="AllIdentities" type="{}tPublicIdentity" minOccurs="0"/>
 *         &lt;element name="AliasIdentities" type="{}tPublicIdentity" minOccurs="0"/>
 *         &lt;element name="AliasesRepositoryData" type="{}tTransparentData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Extension" type="{}tSh-Data-Extension2" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @author <a href="mailto:brainslog@gmail.com"> Alexandre Mendonca </a>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tSh-Data-Extension", propOrder = {
    "registeredIdentities",
    "implicitIdentities",
    "allIdentities",
    "aliasIdentities",
    "aliasesRepositoryData",
    "extension",
    "any"
})
public class TShDataExtension implements ShDataExtension {

    @XmlElement(name = "RegisteredIdentities")
    protected PublicIdentity registeredIdentities;
    @XmlElement(name = "ImplicitIdentities")
    protected PublicIdentity implicitIdentities;
    @XmlElement(name = "AllIdentities")
    protected PublicIdentity allIdentities;
    @XmlElement(name = "AliasIdentities")
    protected PublicIdentity aliasIdentities;
    @XmlElement(name = "AliasesRepositoryData")
    protected List<TTransparentData> aliasesRepositoryData;
    @XmlElement(name = "Extension")
    protected ShDataExtension2 extension;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShDataExtension#getRegisteredIdentities()
     */
    public PublicIdentity getRegisteredIdentities() {
        return registeredIdentities;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShDataExtension#setRegisteredIdentities(org.mobicents.slee.resource.diameter.sh.events.avp.userdata.PublicIdentity)
     */
    public void setRegisteredIdentities(PublicIdentity value) {
        this.registeredIdentities = value;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShDataExtension#getImplicitIdentities()
     */
    public PublicIdentity getImplicitIdentities() {
        return implicitIdentities;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShDataExtension#setImplicitIdentities(org.mobicents.slee.resource.diameter.sh.events.avp.userdata.PublicIdentity)
     */
    public void setImplicitIdentities(PublicIdentity value) {
        this.implicitIdentities = value;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShDataExtension#getAllIdentities()
     */
    public PublicIdentity getAllIdentities() {
        return allIdentities;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShDataExtension#setAllIdentities(org.mobicents.slee.resource.diameter.sh.events.avp.userdata.PublicIdentity)
     */
    public void setAllIdentities(PublicIdentity value) {
        this.allIdentities = value;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShDataExtension#getAliasIdentities()
     */
    public PublicIdentity getAliasIdentities() {
        return aliasIdentities;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShDataExtension#setAliasIdentities(org.mobicents.slee.resource.diameter.sh.events.avp.userdata.PublicIdentity)
     */
    public void setAliasIdentities(PublicIdentity value) {
        this.aliasIdentities = value;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShDataExtension#getAliasesRepositoryData()
     */
    public List<TTransparentData> getAliasesRepositoryData() {
        if (aliasesRepositoryData == null) {
            aliasesRepositoryData = new ArrayList<TTransparentData>();
        }
        return this.aliasesRepositoryData;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShDataExtension#getExtension()
     */
    public ShDataExtension2 getExtension() {
        return extension;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShDataExtension#setExtension(org.mobicents.slee.resource.diameter.sh.events.avp.userdata.TShDataExtension2)
     */
    public void setExtension(ShDataExtension2 value) {
        this.extension = value;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShDataExtension#getAny()
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
