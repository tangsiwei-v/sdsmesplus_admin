package com.uspring.sdsmesplus.entity.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProdProductMaterialPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProdProductMaterialPOExample() {
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

        public Criteria andPmbIdIsNull() {
            addCriterion("pmb_id is null");
            return (Criteria) this;
        }

        public Criteria andPmbIdIsNotNull() {
            addCriterion("pmb_id is not null");
            return (Criteria) this;
        }

        public Criteria andPmbIdEqualTo(Integer value) {
            addCriterion("pmb_id =", value, "pmbId");
            return (Criteria) this;
        }

        public Criteria andPmbIdNotEqualTo(Integer value) {
            addCriterion("pmb_id <>", value, "pmbId");
            return (Criteria) this;
        }

        public Criteria andPmbIdGreaterThan(Integer value) {
            addCriterion("pmb_id >", value, "pmbId");
            return (Criteria) this;
        }

        public Criteria andPmbIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pmb_id >=", value, "pmbId");
            return (Criteria) this;
        }

        public Criteria andPmbIdLessThan(Integer value) {
            addCriterion("pmb_id <", value, "pmbId");
            return (Criteria) this;
        }

        public Criteria andPmbIdLessThanOrEqualTo(Integer value) {
            addCriterion("pmb_id <=", value, "pmbId");
            return (Criteria) this;
        }

        public Criteria andPmbIdIn(List<Integer> values) {
            addCriterion("pmb_id in", values, "pmbId");
            return (Criteria) this;
        }

        public Criteria andPmbIdNotIn(List<Integer> values) {
            addCriterion("pmb_id not in", values, "pmbId");
            return (Criteria) this;
        }

        public Criteria andPmbIdBetween(Integer value1, Integer value2) {
            addCriterion("pmb_id between", value1, value2, "pmbId");
            return (Criteria) this;
        }

        public Criteria andPmbIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pmb_id not between", value1, value2, "pmbId");
            return (Criteria) this;
        }

        public Criteria andFpIdIsNull() {
            addCriterion("fp_id is null");
            return (Criteria) this;
        }

        public Criteria andFpIdIsNotNull() {
            addCriterion("fp_id is not null");
            return (Criteria) this;
        }

        public Criteria andFpIdEqualTo(Integer value) {
            addCriterion("fp_id =", value, "fpId");
            return (Criteria) this;
        }

        public Criteria andFpIdNotEqualTo(Integer value) {
            addCriterion("fp_id <>", value, "fpId");
            return (Criteria) this;
        }

        public Criteria andFpIdGreaterThan(Integer value) {
            addCriterion("fp_id >", value, "fpId");
            return (Criteria) this;
        }

        public Criteria andFpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fp_id >=", value, "fpId");
            return (Criteria) this;
        }

        public Criteria andFpIdLessThan(Integer value) {
            addCriterion("fp_id <", value, "fpId");
            return (Criteria) this;
        }

        public Criteria andFpIdLessThanOrEqualTo(Integer value) {
            addCriterion("fp_id <=", value, "fpId");
            return (Criteria) this;
        }

        public Criteria andFpIdIn(List<Integer> values) {
            addCriterion("fp_id in", values, "fpId");
            return (Criteria) this;
        }

        public Criteria andFpIdNotIn(List<Integer> values) {
            addCriterion("fp_id not in", values, "fpId");
            return (Criteria) this;
        }

        public Criteria andFpIdBetween(Integer value1, Integer value2) {
            addCriterion("fp_id between", value1, value2, "fpId");
            return (Criteria) this;
        }

        public Criteria andFpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fp_id not between", value1, value2, "fpId");
            return (Criteria) this;
        }

        public Criteria andFpBarcodeIsNull() {
            addCriterion("fp_barcode is null");
            return (Criteria) this;
        }

        public Criteria andFpBarcodeIsNotNull() {
            addCriterion("fp_barcode is not null");
            return (Criteria) this;
        }

        public Criteria andFpBarcodeEqualTo(String value) {
            addCriterion("fp_barcode =", value, "fpBarcode");
            return (Criteria) this;
        }

        public Criteria andFpBarcodeNotEqualTo(String value) {
            addCriterion("fp_barcode <>", value, "fpBarcode");
            return (Criteria) this;
        }

        public Criteria andFpBarcodeGreaterThan(String value) {
            addCriterion("fp_barcode >", value, "fpBarcode");
            return (Criteria) this;
        }

        public Criteria andFpBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("fp_barcode >=", value, "fpBarcode");
            return (Criteria) this;
        }

        public Criteria andFpBarcodeLessThan(String value) {
            addCriterion("fp_barcode <", value, "fpBarcode");
            return (Criteria) this;
        }

        public Criteria andFpBarcodeLessThanOrEqualTo(String value) {
            addCriterion("fp_barcode <=", value, "fpBarcode");
            return (Criteria) this;
        }

        public Criteria andFpBarcodeLike(String value) {
            addCriterion("fp_barcode like", value, "fpBarcode");
            return (Criteria) this;
        }

        public Criteria andFpBarcodeNotLike(String value) {
            addCriterion("fp_barcode not like", value, "fpBarcode");
            return (Criteria) this;
        }

        public Criteria andFpBarcodeIn(List<String> values) {
            addCriterion("fp_barcode in", values, "fpBarcode");
            return (Criteria) this;
        }

        public Criteria andFpBarcodeNotIn(List<String> values) {
            addCriterion("fp_barcode not in", values, "fpBarcode");
            return (Criteria) this;
        }

        public Criteria andFpBarcodeBetween(String value1, String value2) {
            addCriterion("fp_barcode between", value1, value2, "fpBarcode");
            return (Criteria) this;
        }

        public Criteria andFpBarcodeNotBetween(String value1, String value2) {
            addCriterion("fp_barcode not between", value1, value2, "fpBarcode");
            return (Criteria) this;
        }

        public Criteria andMatCodeIsNull() {
            addCriterion("mat_code is null");
            return (Criteria) this;
        }

        public Criteria andMatCodeIsNotNull() {
            addCriterion("mat_code is not null");
            return (Criteria) this;
        }

        public Criteria andMatCodeEqualTo(String value) {
            addCriterion("mat_code =", value, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatCodeNotEqualTo(String value) {
            addCriterion("mat_code <>", value, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatCodeGreaterThan(String value) {
            addCriterion("mat_code >", value, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatCodeGreaterThanOrEqualTo(String value) {
            addCriterion("mat_code >=", value, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatCodeLessThan(String value) {
            addCriterion("mat_code <", value, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatCodeLessThanOrEqualTo(String value) {
            addCriterion("mat_code <=", value, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatCodeLike(String value) {
            addCriterion("mat_code like", value, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatCodeNotLike(String value) {
            addCriterion("mat_code not like", value, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatCodeIn(List<String> values) {
            addCriterion("mat_code in", values, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatCodeNotIn(List<String> values) {
            addCriterion("mat_code not in", values, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatCodeBetween(String value1, String value2) {
            addCriterion("mat_code between", value1, value2, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatCodeNotBetween(String value1, String value2) {
            addCriterion("mat_code not between", value1, value2, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatTuhaoIsNull() {
            addCriterion("mat_tuhao is null");
            return (Criteria) this;
        }

        public Criteria andMatTuhaoIsNotNull() {
            addCriterion("mat_tuhao is not null");
            return (Criteria) this;
        }

        public Criteria andMatTuhaoEqualTo(String value) {
            addCriterion("mat_tuhao =", value, "matTuhao");
            return (Criteria) this;
        }

        public Criteria andMatTuhaoNotEqualTo(String value) {
            addCriterion("mat_tuhao <>", value, "matTuhao");
            return (Criteria) this;
        }

        public Criteria andMatTuhaoGreaterThan(String value) {
            addCriterion("mat_tuhao >", value, "matTuhao");
            return (Criteria) this;
        }

        public Criteria andMatTuhaoGreaterThanOrEqualTo(String value) {
            addCriterion("mat_tuhao >=", value, "matTuhao");
            return (Criteria) this;
        }

        public Criteria andMatTuhaoLessThan(String value) {
            addCriterion("mat_tuhao <", value, "matTuhao");
            return (Criteria) this;
        }

        public Criteria andMatTuhaoLessThanOrEqualTo(String value) {
            addCriterion("mat_tuhao <=", value, "matTuhao");
            return (Criteria) this;
        }

        public Criteria andMatTuhaoLike(String value) {
            addCriterion("mat_tuhao like", value, "matTuhao");
            return (Criteria) this;
        }

        public Criteria andMatTuhaoNotLike(String value) {
            addCriterion("mat_tuhao not like", value, "matTuhao");
            return (Criteria) this;
        }

        public Criteria andMatTuhaoIn(List<String> values) {
            addCriterion("mat_tuhao in", values, "matTuhao");
            return (Criteria) this;
        }

        public Criteria andMatTuhaoNotIn(List<String> values) {
            addCriterion("mat_tuhao not in", values, "matTuhao");
            return (Criteria) this;
        }

        public Criteria andMatTuhaoBetween(String value1, String value2) {
            addCriterion("mat_tuhao between", value1, value2, "matTuhao");
            return (Criteria) this;
        }

        public Criteria andMatTuhaoNotBetween(String value1, String value2) {
            addCriterion("mat_tuhao not between", value1, value2, "matTuhao");
            return (Criteria) this;
        }

        public Criteria andMatBatchNoIsNull() {
            addCriterion("mat_batch_no is null");
            return (Criteria) this;
        }

        public Criteria andMatBatchNoIsNotNull() {
            addCriterion("mat_batch_no is not null");
            return (Criteria) this;
        }

        public Criteria andMatBatchNoEqualTo(String value) {
            addCriterion("mat_batch_no =", value, "matBatchNo");
            return (Criteria) this;
        }

        public Criteria andMatBatchNoNotEqualTo(String value) {
            addCriterion("mat_batch_no <>", value, "matBatchNo");
            return (Criteria) this;
        }

        public Criteria andMatBatchNoGreaterThan(String value) {
            addCriterion("mat_batch_no >", value, "matBatchNo");
            return (Criteria) this;
        }

        public Criteria andMatBatchNoGreaterThanOrEqualTo(String value) {
            addCriterion("mat_batch_no >=", value, "matBatchNo");
            return (Criteria) this;
        }

        public Criteria andMatBatchNoLessThan(String value) {
            addCriterion("mat_batch_no <", value, "matBatchNo");
            return (Criteria) this;
        }

        public Criteria andMatBatchNoLessThanOrEqualTo(String value) {
            addCriterion("mat_batch_no <=", value, "matBatchNo");
            return (Criteria) this;
        }

        public Criteria andMatBatchNoLike(String value) {
            addCriterion("mat_batch_no like", value, "matBatchNo");
            return (Criteria) this;
        }

        public Criteria andMatBatchNoNotLike(String value) {
            addCriterion("mat_batch_no not like", value, "matBatchNo");
            return (Criteria) this;
        }

        public Criteria andMatBatchNoIn(List<String> values) {
            addCriterion("mat_batch_no in", values, "matBatchNo");
            return (Criteria) this;
        }

        public Criteria andMatBatchNoNotIn(List<String> values) {
            addCriterion("mat_batch_no not in", values, "matBatchNo");
            return (Criteria) this;
        }

        public Criteria andMatBatchNoBetween(String value1, String value2) {
            addCriterion("mat_batch_no between", value1, value2, "matBatchNo");
            return (Criteria) this;
        }

        public Criteria andMatBatchNoNotBetween(String value1, String value2) {
            addCriterion("mat_batch_no not between", value1, value2, "matBatchNo");
            return (Criteria) this;
        }

        public Criteria andMatFurnaceNoIsNull() {
            addCriterion("mat_furnace_no is null");
            return (Criteria) this;
        }

        public Criteria andMatFurnaceNoIsNotNull() {
            addCriterion("mat_furnace_no is not null");
            return (Criteria) this;
        }

        public Criteria andMatFurnaceNoEqualTo(String value) {
            addCriterion("mat_furnace_no =", value, "matFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMatFurnaceNoNotEqualTo(String value) {
            addCriterion("mat_furnace_no <>", value, "matFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMatFurnaceNoGreaterThan(String value) {
            addCriterion("mat_furnace_no >", value, "matFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMatFurnaceNoGreaterThanOrEqualTo(String value) {
            addCriterion("mat_furnace_no >=", value, "matFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMatFurnaceNoLessThan(String value) {
            addCriterion("mat_furnace_no <", value, "matFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMatFurnaceNoLessThanOrEqualTo(String value) {
            addCriterion("mat_furnace_no <=", value, "matFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMatFurnaceNoLike(String value) {
            addCriterion("mat_furnace_no like", value, "matFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMatFurnaceNoNotLike(String value) {
            addCriterion("mat_furnace_no not like", value, "matFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMatFurnaceNoIn(List<String> values) {
            addCriterion("mat_furnace_no in", values, "matFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMatFurnaceNoNotIn(List<String> values) {
            addCriterion("mat_furnace_no not in", values, "matFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMatFurnaceNoBetween(String value1, String value2) {
            addCriterion("mat_furnace_no between", value1, value2, "matFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMatFurnaceNoNotBetween(String value1, String value2) {
            addCriterion("mat_furnace_no not between", value1, value2, "matFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andMatGlevelIsNull() {
            addCriterion("mat_glevel is null");
            return (Criteria) this;
        }

        public Criteria andMatGlevelIsNotNull() {
            addCriterion("mat_glevel is not null");
            return (Criteria) this;
        }

        public Criteria andMatGlevelEqualTo(String value) {
            addCriterion("mat_glevel =", value, "matGlevel");
            return (Criteria) this;
        }

        public Criteria andMatGlevelNotEqualTo(String value) {
            addCriterion("mat_glevel <>", value, "matGlevel");
            return (Criteria) this;
        }

        public Criteria andMatGlevelGreaterThan(String value) {
            addCriterion("mat_glevel >", value, "matGlevel");
            return (Criteria) this;
        }

        public Criteria andMatGlevelGreaterThanOrEqualTo(String value) {
            addCriterion("mat_glevel >=", value, "matGlevel");
            return (Criteria) this;
        }

        public Criteria andMatGlevelLessThan(String value) {
            addCriterion("mat_glevel <", value, "matGlevel");
            return (Criteria) this;
        }

        public Criteria andMatGlevelLessThanOrEqualTo(String value) {
            addCriterion("mat_glevel <=", value, "matGlevel");
            return (Criteria) this;
        }

        public Criteria andMatGlevelLike(String value) {
            addCriterion("mat_glevel like", value, "matGlevel");
            return (Criteria) this;
        }

        public Criteria andMatGlevelNotLike(String value) {
            addCriterion("mat_glevel not like", value, "matGlevel");
            return (Criteria) this;
        }

        public Criteria andMatGlevelIn(List<String> values) {
            addCriterion("mat_glevel in", values, "matGlevel");
            return (Criteria) this;
        }

        public Criteria andMatGlevelNotIn(List<String> values) {
            addCriterion("mat_glevel not in", values, "matGlevel");
            return (Criteria) this;
        }

        public Criteria andMatGlevelBetween(String value1, String value2) {
            addCriterion("mat_glevel between", value1, value2, "matGlevel");
            return (Criteria) this;
        }

        public Criteria andMatGlevelNotBetween(String value1, String value2) {
            addCriterion("mat_glevel not between", value1, value2, "matGlevel");
            return (Criteria) this;
        }

        public Criteria andMatBarcodeIsNull() {
            addCriterion("mat_barcode is null");
            return (Criteria) this;
        }

        public Criteria andMatBarcodeIsNotNull() {
            addCriterion("mat_barcode is not null");
            return (Criteria) this;
        }

        public Criteria andMatBarcodeEqualTo(String value) {
            addCriterion("mat_barcode =", value, "matBarcode");
            return (Criteria) this;
        }

        public Criteria andMatBarcodeNotEqualTo(String value) {
            addCriterion("mat_barcode <>", value, "matBarcode");
            return (Criteria) this;
        }

        public Criteria andMatBarcodeGreaterThan(String value) {
            addCriterion("mat_barcode >", value, "matBarcode");
            return (Criteria) this;
        }

        public Criteria andMatBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("mat_barcode >=", value, "matBarcode");
            return (Criteria) this;
        }

        public Criteria andMatBarcodeLessThan(String value) {
            addCriterion("mat_barcode <", value, "matBarcode");
            return (Criteria) this;
        }

        public Criteria andMatBarcodeLessThanOrEqualTo(String value) {
            addCriterion("mat_barcode <=", value, "matBarcode");
            return (Criteria) this;
        }

        public Criteria andMatBarcodeLike(String value) {
            addCriterion("mat_barcode like", value, "matBarcode");
            return (Criteria) this;
        }

        public Criteria andMatBarcodeNotLike(String value) {
            addCriterion("mat_barcode not like", value, "matBarcode");
            return (Criteria) this;
        }

        public Criteria andMatBarcodeIn(List<String> values) {
            addCriterion("mat_barcode in", values, "matBarcode");
            return (Criteria) this;
        }

        public Criteria andMatBarcodeNotIn(List<String> values) {
            addCriterion("mat_barcode not in", values, "matBarcode");
            return (Criteria) this;
        }

        public Criteria andMatBarcodeBetween(String value1, String value2) {
            addCriterion("mat_barcode between", value1, value2, "matBarcode");
            return (Criteria) this;
        }

        public Criteria andMatBarcodeNotBetween(String value1, String value2) {
            addCriterion("mat_barcode not between", value1, value2, "matBarcode");
            return (Criteria) this;
        }

        public Criteria andMatBoxBarcodeIsNull() {
            addCriterion("mat_box_barcode is null");
            return (Criteria) this;
        }

        public Criteria andMatBoxBarcodeIsNotNull() {
            addCriterion("mat_box_barcode is not null");
            return (Criteria) this;
        }

        public Criteria andMatBoxBarcodeEqualTo(String value) {
            addCriterion("mat_box_barcode =", value, "matBoxBarcode");
            return (Criteria) this;
        }

        public Criteria andMatBoxBarcodeNotEqualTo(String value) {
            addCriterion("mat_box_barcode <>", value, "matBoxBarcode");
            return (Criteria) this;
        }

        public Criteria andMatBoxBarcodeGreaterThan(String value) {
            addCriterion("mat_box_barcode >", value, "matBoxBarcode");
            return (Criteria) this;
        }

        public Criteria andMatBoxBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("mat_box_barcode >=", value, "matBoxBarcode");
            return (Criteria) this;
        }

        public Criteria andMatBoxBarcodeLessThan(String value) {
            addCriterion("mat_box_barcode <", value, "matBoxBarcode");
            return (Criteria) this;
        }

        public Criteria andMatBoxBarcodeLessThanOrEqualTo(String value) {
            addCriterion("mat_box_barcode <=", value, "matBoxBarcode");
            return (Criteria) this;
        }

        public Criteria andMatBoxBarcodeLike(String value) {
            addCriterion("mat_box_barcode like", value, "matBoxBarcode");
            return (Criteria) this;
        }

        public Criteria andMatBoxBarcodeNotLike(String value) {
            addCriterion("mat_box_barcode not like", value, "matBoxBarcode");
            return (Criteria) this;
        }

        public Criteria andMatBoxBarcodeIn(List<String> values) {
            addCriterion("mat_box_barcode in", values, "matBoxBarcode");
            return (Criteria) this;
        }

        public Criteria andMatBoxBarcodeNotIn(List<String> values) {
            addCriterion("mat_box_barcode not in", values, "matBoxBarcode");
            return (Criteria) this;
        }

        public Criteria andMatBoxBarcodeBetween(String value1, String value2) {
            addCriterion("mat_box_barcode between", value1, value2, "matBoxBarcode");
            return (Criteria) this;
        }

        public Criteria andMatBoxBarcodeNotBetween(String value1, String value2) {
            addCriterion("mat_box_barcode not between", value1, value2, "matBoxBarcode");
            return (Criteria) this;
        }

        public Criteria andMatCountIsNull() {
            addCriterion("mat_count is null");
            return (Criteria) this;
        }

        public Criteria andMatCountIsNotNull() {
            addCriterion("mat_count is not null");
            return (Criteria) this;
        }

        public Criteria andMatCountEqualTo(BigDecimal value) {
            addCriterion("mat_count =", value, "matCount");
            return (Criteria) this;
        }

        public Criteria andMatCountNotEqualTo(BigDecimal value) {
            addCriterion("mat_count <>", value, "matCount");
            return (Criteria) this;
        }

        public Criteria andMatCountGreaterThan(BigDecimal value) {
            addCriterion("mat_count >", value, "matCount");
            return (Criteria) this;
        }

        public Criteria andMatCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mat_count >=", value, "matCount");
            return (Criteria) this;
        }

        public Criteria andMatCountLessThan(BigDecimal value) {
            addCriterion("mat_count <", value, "matCount");
            return (Criteria) this;
        }

        public Criteria andMatCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mat_count <=", value, "matCount");
            return (Criteria) this;
        }

        public Criteria andMatCountIn(List<BigDecimal> values) {
            addCriterion("mat_count in", values, "matCount");
            return (Criteria) this;
        }

        public Criteria andMatCountNotIn(List<BigDecimal> values) {
            addCriterion("mat_count not in", values, "matCount");
            return (Criteria) this;
        }

        public Criteria andMatCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mat_count between", value1, value2, "matCount");
            return (Criteria) this;
        }

        public Criteria andMatCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mat_count not between", value1, value2, "matCount");
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