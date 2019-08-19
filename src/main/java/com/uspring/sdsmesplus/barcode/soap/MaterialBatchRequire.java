
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
 *         &lt;element name="materials" type="{http://tempuri.org/}ArrayOfMaterialRequireDetail" minOccurs="0"/>
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
    "materials"
})
@XmlRootElement(name = "MaterialBatchRequire")
public class MaterialBatchRequire {

    protected ArrayOfMaterialRequireDetail materials;

    /**
     * ��ȡmaterials���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMaterialRequireDetail }
     *     
     */
    public ArrayOfMaterialRequireDetail getMaterials() {
        return materials;
    }

    /**
     * ����materials���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMaterialRequireDetail }
     *     
     */
    public void setMaterials(ArrayOfMaterialRequireDetail value) {
        this.materials = value;
    }

}
