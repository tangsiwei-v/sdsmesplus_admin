
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="material" type="{http://tempuri.org/}MaterialRequireDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "material"
})
@XmlRootElement(name = "MaterialRequire")
public class MaterialRequire {

    protected MaterialRequireDetail material;

    /**
     * ��ȡmaterial���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MaterialRequireDetail }
     *     
     */
    public MaterialRequireDetail getMaterial() {
        return material;
    }

    /**
     * ����material���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MaterialRequireDetail }
     *     
     */
    public void setMaterial(MaterialRequireDetail value) {
        this.material = value;
    }

}
