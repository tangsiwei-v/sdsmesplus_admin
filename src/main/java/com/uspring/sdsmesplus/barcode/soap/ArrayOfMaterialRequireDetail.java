
package com.uspring.sdsmesplus.barcode.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfMaterialRequireDetail complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMaterialRequireDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaterialRequireDetail" type="{http://tempuri.org/}MaterialRequireDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMaterialRequireDetail", propOrder = {
    "materialRequireDetail"
})
public class ArrayOfMaterialRequireDetail {

    @XmlElement(name = "MaterialRequireDetail", nillable = true)
    protected List<MaterialRequireDetail> materialRequireDetail;

    /**
     * Gets the value of the materialRequireDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialRequireDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialRequireDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialRequireDetail }
     * 
     * 
     */
    public List<MaterialRequireDetail> getMaterialRequireDetail() {
        if (materialRequireDetail == null) {
            materialRequireDetail = new ArrayList<MaterialRequireDetail>();
        }
        return this.materialRequireDetail;
    }

}
