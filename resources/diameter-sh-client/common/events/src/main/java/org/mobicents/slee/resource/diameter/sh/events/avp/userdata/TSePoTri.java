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

import net.java.slee.resource.diameter.sh.events.avp.userdata.Header;
import net.java.slee.resource.diameter.sh.events.avp.userdata.SePoTri;
import net.java.slee.resource.diameter.sh.events.avp.userdata.SePoTriExtension;
import net.java.slee.resource.diameter.sh.events.avp.userdata.SessionDescription;


/**
 * <p>Java class for tSePoTri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tSePoTri">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConditionNegated" type="{}tBool" minOccurs="0"/>
 *         &lt;element name="Group" type="{}tGroupID" maxOccurs="unbounded"/>
 *         &lt;choice>
 *           &lt;element name="RequestURI" type="{}tString"/>
 *           &lt;element name="Method" type="{}tString"/>
 *           &lt;element name="SIPHeader" type="{}tHeader"/>
 *           &lt;element name="SessionCase" type="{}tDirectionOfRequest"/>
 *           &lt;element name="SessionDescription" type="{}tSessionDescription"/>
 *         &lt;/choice>
 *         &lt;element name="Extension" type="{}tSePoTriExtension" minOccurs="0"/>
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
@XmlType(name = "tSePoTri", propOrder = {
    "conditionNegated",
    "group",
    "requestURI",
    "method",
    "sipHeader",
    "sessionCase",
    "sessionDescription",
    "extension",
    "any"
})
public class TSePoTri implements SePoTri {

    @XmlElement(name = "ConditionNegated")
    protected Boolean conditionNegated;
    @XmlElement(name = "Group", type = Integer.class)
    protected List<Integer> group;
    @XmlElement(name = "RequestURI")
    protected String requestURI;
    @XmlElement(name = "Method")
    protected String method;
    @XmlElement(name = "SIPHeader")
    protected Header sipHeader;
    @XmlElement(name = "SessionCase")
    protected Short sessionCase;
    @XmlElement(name = "SessionDescription")
    protected SessionDescription sessionDescription;
    @XmlElement(name = "Extension")
    protected SePoTriExtension extension;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.SePoTri#isConditionNegated()
     */
    public Boolean isConditionNegated() {
        return conditionNegated;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.SePoTri#setConditionNegated(java.lang.Boolean)
     */
    public void setConditionNegated(Boolean value) {
        this.conditionNegated = value;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.SePoTri#getGroup()
     */
    public List<Integer> getGroup() {
        if (group == null) {
            group = new ArrayList<Integer>();
        }
        return this.group;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.SePoTri#getRequestURI()
     */
    public String getRequestURI() {
        return requestURI;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.SePoTri#setRequestURI(java.lang.String)
     */
    public void setRequestURI(String value) {
        this.requestURI = value;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.SePoTri#getMethod()
     */
    public String getMethod() {
        return method;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.SePoTri#setMethod(java.lang.String)
     */
    public void setMethod(String value) {
        this.method = value;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.SePoTri#getSIPHeader()
     */
    public Header getSIPHeader() {
        return sipHeader;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.SePoTri#setSIPHeader(org.mobicents.slee.resource.diameter.sh.events.avp.userdata.Header)
     */
    public void setSIPHeader(Header value) {
        this.sipHeader = value;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.SePoTri#getSessionCase()
     */
    public Short getSessionCase() {
        return sessionCase;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.SePoTri#setSessionCase(java.lang.Short)
     */
    public void setSessionCase(Short value) {
        this.sessionCase = value;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.SePoTri#getSessionDescription()
     */
    public SessionDescription getSessionDescription() {
        return sessionDescription;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.SePoTri#setSessionDescription(org.mobicents.slee.resource.diameter.sh.events.avp.userdata.TSessionDescription)
     */
    public void setSessionDescription(SessionDescription value) {
        this.sessionDescription = value;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.SePoTri#getExtension()
     */
    public SePoTriExtension getExtension() {
        return extension;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.SePoTri#setExtension(org.mobicents.slee.resource.diameter.sh.events.avp.userdata.TSePoTriExtension)
     */
    public void setExtension(SePoTriExtension value) {
        this.extension = value;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.SePoTri#getAny()
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
