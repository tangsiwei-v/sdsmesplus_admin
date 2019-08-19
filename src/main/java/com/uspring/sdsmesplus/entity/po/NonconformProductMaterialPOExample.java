package com.uspring.sdsmesplus.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NonconformProductMaterialPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NonconformProductMaterialPOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andNplmIdIsNull() {
            addCriterion("nplm_id is null");
            return (Criteria) this;
        }

        public Criteria andNplmIdIsNotNull() {
            addCriterion("nplm_id is not null");
            return (Criteria) this;
        }

        public Criteria andNplmIdEqualTo(Integer value) {
            addCriterion("nplm_id =", value, "nplmId");
            return (Criteria) this;
        }

        public Criteria andNplmIdNotEqualTo(Integer value) {
            addCriterion("nplm_id <>", value, "nplmId");
            return (Criteria) this;
        }

        public Criteria andNplmIdGreaterThan(Integer value) {
            addCriterion("nplm_id >", value, "nplmId");
            return (Criteria) this;
        }

        public Criteria andNplmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("nplm_id >=", value, "nplmId");
            return (Criteria) this;
        }

        public Criteria andNplmIdLessThan(Integer value) {
            addCriterion("nplm_id <", value, "nplmId");
            return (Criteria) this;
        }

        public Criteria andNplmIdLessThanOrEqualTo(Integer value) {
            addCriterion("nplm_id <=", value, "nplmId");
            return (Criteria) this;
        }

        public Criteria andNplmIdIn(List<Integer> values) {
            addCriterion("nplm_id in", values, "nplmId");
            return (Criteria) this;
        }

        public Criteria andNplmIdNotIn(List<Integer> values) {
            addCriterion("nplm_id not in", values, "nplmId");
            return (Criteria) this;
        }

        public Criteria andNplmIdBetween(Integer value1, Integer value2) {
            addCriterion("nplm_id between", value1, value2, "nplmId");
            return (Criteria) this;
        }

        public Criteria andNplmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("nplm_id not between", value1, value2, "nplmId");
            return (Criteria) this;
        }

        public Criteria andNplIdIsNull() {
            addCriterion("npl_id is null");
            return (Criteria) this;
        }

        public Criteria andNplIdIsNotNull() {
            addCriterion("npl_id is not null");
            return (Criteria) this;
        }

        public Criteria andNplIdEqualTo(Integer value) {
            addCriterion("npl_id =", value, "nplId");
            return (Criteria) this;
        }

        public Criteria andNplIdNotEqualTo(Integer value) {
            addCriterion("npl_id <>", value, "nplId");
            return (Criteria) this;
        }

        public Criteria andNplIdGreaterThan(Integer value) {
            addCriterion("npl_id >", value, "nplId");
            return (Criteria) this;
        }

        public Criteria andNplIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("npl_id >=", value, "nplId");
            return (Criteria) this;
        }

        public Criteria andNplIdLessThan(Integer value) {
            addCriterion("npl_id <", value, "nplId");
            return (Criteria) this;
        }

        public Criteria andNplIdLessThanOrEqualTo(Integer value) {
            addCriterion("npl_id <=", value, "nplId");
            return (Criteria) this;
        }

        public Criteria andNplIdIn(List<Integer> values) {
            addCriterion("npl_id in", values, "nplId");
            return (Criteria) this;
        }

        public Criteria andNplIdNotIn(List<Integer> values) {
            addCriterion("npl_id not in", values, "nplId");
            return (Criteria) this;
        }

        public Criteria andNplIdBetween(Integer value1, Integer value2) {
            addCriterion("npl_id between", value1, value2, "nplId");
            return (Criteria) this;
        }

        public Criteria andNplIdNotBetween(Integer value1, Integer value2) {
            addCriterion("npl_id not between", value1, value2, "nplId");
            return (Criteria) this;
        }

        public Criteria andNplBarcodeIsNull() {
            addCriterion("npl_barcode is null");
            return (Criteria) this;
        }

        public Criteria andNplBarcodeIsNotNull() {
            addCriterion("npl_barcode is not null");
            return (Criteria) this;
        }

        public Criteria andNplBarcodeEqualTo(String value) {
            addCriterion("npl_barcode =", value, "nplBarcode");
            return (Criteria) this;
        }

        public Criteria andNplBarcodeNotEqualTo(String value) {
            addCriterion("npl_barcode <>", value, "nplBarcode");
            return (Criteria) this;
        }

        public Criteria andNplBarcodeGreaterThan(String value) {
            addCriterion("npl_barcode >", value, "nplBarcode");
            return (Criteria) this;
        }

        public Criteria andNplBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("npl_barcode >=", value, "nplBarcode");
            return (Criteria) this;
        }

        public Criteria andNplBarcodeLessThan(String value) {
            addCriterion("npl_barcode <", value, "nplBarcode");
            return (Criteria) this;
        }

        public Criteria andNplBarcodeLessThanOrEqualTo(String value) {
            addCriterion("npl_barcode <=", value, "nplBarcode");
            return (Criteria) this;
        }

        public Criteria andNplBarcodeLike(String value) {
            addCriterion("npl_barcode like", value, "nplBarcode");
            return (Criteria) this;
        }

        public Criteria andNplBarcodeNotLike(String value) {
            addCriterion("npl_barcode not like", value, "nplBarcode");
            return (Criteria) this;
        }

        public Criteria andNplBarcodeIn(List<String> values) {
            addCriterion("npl_barcode in", values, "nplBarcode");
            return (Criteria) this;
        }

        public Criteria andNplBarcodeNotIn(List<String> values) {
            addCriterion("npl_barcode not in", values, "nplBarcode");
            return (Criteria) this;
        }

        public Criteria andNplBarcodeBetween(String value1, String value2) {
            addCriterion("npl_barcode between", value1, value2, "nplBarcode");
            return (Criteria) this;
        }

        public Criteria andNplBarcodeNotBetween(String value1, String value2) {
            addCriterion("npl_barcode not between", value1, value2, "nplBarcode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeIsNull() {
            addCriterion("material_code is null");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeIsNotNull() {
            addCriterion("material_code is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeEqualTo(String value) {
            addCriterion("material_code =", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotEqualTo(String value) {
            addCriterion("material_code <>", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeGreaterThan(String value) {
            addCriterion("material_code >", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeGreaterThanOrEqualTo(String value) {
            addCriterion("material_code >=", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLessThan(String value) {
            addCriterion("material_code <", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLessThanOrEqualTo(String value) {
            addCriterion("material_code <=", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLike(String value) {
            addCriterion("material_code like", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotLike(String value) {
            addCriterion("material_code not like", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeIn(List<String> values) {
            addCriterion("material_code in", values, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotIn(List<String> values) {
            addCriterion("material_code not in", values, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeBetween(String value1, String value2) {
            addCriterion("material_code between", value1, value2, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotBetween(String value1, String value2) {
            addCriterion("material_code not between", value1, value2, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBoxCodeIsNull() {
            addCriterion("material_box_code is null");
            return (Criteria) this;
        }

        public Criteria andMaterialBoxCodeIsNotNull() {
            addCriterion("material_box_code is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialBoxCodeEqualTo(String value) {
            addCriterion("material_box_code =", value, "materialBoxCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBoxCodeNotEqualTo(String value) {
            addCriterion("material_box_code <>", value, "materialBoxCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBoxCodeGreaterThan(String value) {
            addCriterion("material_box_code >", value, "materialBoxCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBoxCodeGreaterThanOrEqualTo(String value) {
            addCriterion("material_box_code >=", value, "materialBoxCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBoxCodeLessThan(String value) {
            addCriterion("material_box_code <", value, "materialBoxCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBoxCodeLessThanOrEqualTo(String value) {
            addCriterion("material_box_code <=", value, "materialBoxCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBoxCodeLike(String value) {
            addCriterion("material_box_code like", value, "materialBoxCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBoxCodeNotLike(String value) {
            addCriterion("material_box_code not like", value, "materialBoxCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBoxCodeIn(List<String> values) {
            addCriterion("material_box_code in", values, "materialBoxCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBoxCodeNotIn(List<String> values) {
            addCriterion("material_box_code not in", values, "materialBoxCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBoxCodeBetween(String value1, String value2) {
            addCriterion("material_box_code between", value1, value2, "materialBoxCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBoxCodeNotBetween(String value1, String value2) {
            addCriterion("material_box_code not between", value1, value2, "materialBoxCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBoxQrcodeIsNull() {
            addCriterion("material_box_qrcode is null");
            return (Criteria) this;
        }

        public Criteria andMaterialBoxQrcodeIsNotNull() {
            addCriterion("material_box_qrcode is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialBoxQrcodeEqualTo(String value) {
            addCriterion("material_box_qrcode =", value, "materialBoxQrcode");
            return (Criteria) this;
        }

        public Criteria andMaterialBoxQrcodeNotEqualTo(String value) {
            addCriterion("material_box_qrcode <>", value, "materialBoxQrcode");
            return (Criteria) this;
        }

        public Criteria andMaterialBoxQrcodeGreaterThan(String value) {
            addCriterion("material_box_qrcode >", value, "materialBoxQrcode");
            return (Criteria) this;
        }

        public Criteria andMaterialBoxQrcodeGreaterThanOrEqualTo(String value) {
            addCriterion("material_box_qrcode >=", value, "materialBoxQrcode");
            return (Criteria) this;
        }

        public Criteria andMaterialBoxQrcodeLessThan(String value) {
            addCriterion("material_box_qrcode <", value, "materialBoxQrcode");
            return (Criteria) this;
        }

        public Criteria andMaterialBoxQrcodeLessThanOrEqualTo(String value) {
            addCriterion("material_box_qrcode <=", value, "materialBoxQrcode");
            return (Criteria) this;
        }

        public Criteria andMaterialBoxQrcodeLike(String value) {
            addCriterion("material_box_qrcode like", value, "materialBoxQrcode");
            return (Criteria) this;
        }

        public Criteria andMaterialBoxQrcodeNotLike(String value) {
            addCriterion("material_box_qrcode not like", value, "materialBoxQrcode");
            return (Criteria) this;
        }

        public Criteria andMaterialBoxQrcodeIn(List<String> values) {
            addCriterion("material_box_qrcode in", values, "materialBoxQrcode");
            return (Criteria) this;
        }

        public Criteria andMaterialBoxQrcodeNotIn(List<String> values) {
            addCriterion("material_box_qrcode not in", values, "materialBoxQrcode");
            return (Criteria) this;
        }

        public Criteria andMaterialBoxQrcodeBetween(String value1, String value2) {
            addCriterion("material_box_qrcode between", value1, value2, "materialBoxQrcode");
            return (Criteria) this;
        }

        public Criteria andMaterialBoxQrcodeNotBetween(String value1, String value2) {
            addCriterion("material_box_qrcode not between", value1, value2, "materialBoxQrcode");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchCodeIsNull() {
            addCriterion("material_batch_code is null");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchCodeIsNotNull() {
            addCriterion("material_batch_code is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchCodeEqualTo(String value) {
            addCriterion("material_batch_code =", value, "materialBatchCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchCodeNotEqualTo(String value) {
            addCriterion("material_batch_code <>", value, "materialBatchCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchCodeGreaterThan(String value) {
            addCriterion("material_batch_code >", value, "materialBatchCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchCodeGreaterThanOrEqualTo(String value) {
            addCriterion("material_batch_code >=", value, "materialBatchCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchCodeLessThan(String value) {
            addCriterion("material_batch_code <", value, "materialBatchCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchCodeLessThanOrEqualTo(String value) {
            addCriterion("material_batch_code <=", value, "materialBatchCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchCodeLike(String value) {
            addCriterion("material_batch_code like", value, "materialBatchCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchCodeNotLike(String value) {
            addCriterion("material_batch_code not like", value, "materialBatchCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchCodeIn(List<String> values) {
            addCriterion("material_batch_code in", values, "materialBatchCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchCodeNotIn(List<String> values) {
            addCriterion("material_batch_code not in", values, "materialBatchCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchCodeBetween(String value1, String value2) {
            addCriterion("material_batch_code between", value1, value2, "materialBatchCode");
            return (Criteria) this;
        }

        public Criteria andMaterialBatchCodeNotBetween(String value1, String value2) {
            addCriterion("material_batch_code not between", value1, value2, "materialBatchCode");
            return (Criteria) this;
        }

        public Criteria andMaterialFurnaceNoIsNull() {
            addCriterion("material_furnace_no is null");
            return (Criteria) this;
        }

        public Criteria andMaterialFurnaceNoIsNotNull() {
            addCriterion("material_furnace_no is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialFurnaceNoEqualTo(String value) {
            addCriterion("material_furnace_no =", value, "materialFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMaterialFurnaceNoNotEqualTo(String value) {
            addCriterion("material_furnace_no <>", value, "materialFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMaterialFurnaceNoGreaterThan(String value) {
            addCriterion("material_furnace_no >", value, "materialFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMaterialFurnaceNoGreaterThanOrEqualTo(String value) {
            addCriterion("material_furnace_no >=", value, "materialFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMaterialFurnaceNoLessThan(String value) {
            addCriterion("material_furnace_no <", value, "materialFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMaterialFurnaceNoLessThanOrEqualTo(String value) {
            addCriterion("material_furnace_no <=", value, "materialFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMaterialFurnaceNoLike(String value) {
            addCriterion("material_furnace_no like", value, "materialFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMaterialFurnaceNoNotLike(String value) {
            addCriterion("material_furnace_no not like", value, "materialFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMaterialFurnaceNoIn(List<String> values) {
            addCriterion("material_furnace_no in", values, "materialFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMaterialFurnaceNoNotIn(List<String> values) {
            addCriterion("material_furnace_no not in", values, "materialFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMaterialFurnaceNoBetween(String value1, String value2) {
            addCriterion("material_furnace_no between", value1, value2, "materialFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMaterialFurnaceNoNotBetween(String value1, String value2) {
            addCriterion("material_furnace_no not between", value1, value2, "materialFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMaterialGlevelIsNull() {
            addCriterion("material_glevel is null");
            return (Criteria) this;
        }

        public Criteria andMaterialGlevelIsNotNull() {
            addCriterion("material_glevel is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialGlevelEqualTo(String value) {
            addCriterion("material_glevel =", value, "materialGlevel");
            return (Criteria) this;
        }

        public Criteria andMaterialGlevelNotEqualTo(String value) {
            addCriterion("material_glevel <>", value, "materialGlevel");
            return (Criteria) this;
        }

        public Criteria andMaterialGlevelGreaterThan(String value) {
            addCriterion("material_glevel >", value, "materialGlevel");
            return (Criteria) this;
        }

        public Criteria andMaterialGlevelGreaterThanOrEqualTo(String value) {
            addCriterion("material_glevel >=", value, "materialGlevel");
            return (Criteria) this;
        }

        public Criteria andMaterialGlevelLessThan(String value) {
            addCriterion("material_glevel <", value, "materialGlevel");
            return (Criteria) this;
        }

        public Criteria andMaterialGlevelLessThanOrEqualTo(String value) {
            addCriterion("material_glevel <=", value, "materialGlevel");
            return (Criteria) this;
        }

        public Criteria andMaterialGlevelLike(String value) {
            addCriterion("material_glevel like", value, "materialGlevel");
            return (Criteria) this;
        }

        public Criteria andMaterialGlevelNotLike(String value) {
            addCriterion("material_glevel not like", value, "materialGlevel");
            return (Criteria) this;
        }

        public Criteria andMaterialGlevelIn(List<String> values) {
            addCriterion("material_glevel in", values, "materialGlevel");
            return (Criteria) this;
        }

        public Criteria andMaterialGlevelNotIn(List<String> values) {
            addCriterion("material_glevel not in", values, "materialGlevel");
            return (Criteria) this;
        }

        public Criteria andMaterialGlevelBetween(String value1, String value2) {
            addCriterion("material_glevel between", value1, value2, "materialGlevel");
            return (Criteria) this;
        }

        public Criteria andMaterialGlevelNotBetween(String value1, String value2) {
            addCriterion("material_glevel not between", value1, value2, "materialGlevel");
            return (Criteria) this;
        }

        public Criteria andMaterialQtyIsNull() {
            addCriterion("material_qty is null");
            return (Criteria) this;
        }

        public Criteria andMaterialQtyIsNotNull() {
            addCriterion("material_qty is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialQtyEqualTo(Integer value) {
            addCriterion("material_qty =", value, "materialQty");
            return (Criteria) this;
        }

        public Criteria andMaterialQtyNotEqualTo(Integer value) {
            addCriterion("material_qty <>", value, "materialQty");
            return (Criteria) this;
        }

        public Criteria andMaterialQtyGreaterThan(Integer value) {
            addCriterion("material_qty >", value, "materialQty");
            return (Criteria) this;
        }

        public Criteria andMaterialQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("material_qty >=", value, "materialQty");
            return (Criteria) this;
        }

        public Criteria andMaterialQtyLessThan(Integer value) {
            addCriterion("material_qty <", value, "materialQty");
            return (Criteria) this;
        }

        public Criteria andMaterialQtyLessThanOrEqualTo(Integer value) {
            addCriterion("material_qty <=", value, "materialQty");
            return (Criteria) this;
        }

        public Criteria andMaterialQtyIn(List<Integer> values) {
            addCriterion("material_qty in", values, "materialQty");
            return (Criteria) this;
        }

        public Criteria andMaterialQtyNotIn(List<Integer> values) {
            addCriterion("material_qty not in", values, "materialQty");
            return (Criteria) this;
        }

        public Criteria andMaterialQtyBetween(Integer value1, Integer value2) {
            addCriterion("material_qty between", value1, value2, "materialQty");
            return (Criteria) this;
        }

        public Criteria andMaterialQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("material_qty not between", value1, value2, "materialQty");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}