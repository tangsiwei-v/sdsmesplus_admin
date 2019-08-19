package com.uspring.sdsmesplus.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProdBoxLogPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProdBoxLogPOExample() {
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

        public Criteria andBlIdIsNull() {
            addCriterion("bl_id is null");
            return (Criteria) this;
        }

        public Criteria andBlIdIsNotNull() {
            addCriterion("bl_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlIdEqualTo(Integer value) {
            addCriterion("bl_id =", value, "blId");
            return (Criteria) this;
        }

        public Criteria andBlIdNotEqualTo(Integer value) {
            addCriterion("bl_id <>", value, "blId");
            return (Criteria) this;
        }

        public Criteria andBlIdGreaterThan(Integer value) {
            addCriterion("bl_id >", value, "blId");
            return (Criteria) this;
        }

        public Criteria andBlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bl_id >=", value, "blId");
            return (Criteria) this;
        }

        public Criteria andBlIdLessThan(Integer value) {
            addCriterion("bl_id <", value, "blId");
            return (Criteria) this;
        }

        public Criteria andBlIdLessThanOrEqualTo(Integer value) {
            addCriterion("bl_id <=", value, "blId");
            return (Criteria) this;
        }

        public Criteria andBlIdIn(List<Integer> values) {
            addCriterion("bl_id in", values, "blId");
            return (Criteria) this;
        }

        public Criteria andBlIdNotIn(List<Integer> values) {
            addCriterion("bl_id not in", values, "blId");
            return (Criteria) this;
        }

        public Criteria andBlIdBetween(Integer value1, Integer value2) {
            addCriterion("bl_id between", value1, value2, "blId");
            return (Criteria) this;
        }

        public Criteria andBlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bl_id not between", value1, value2, "blId");
            return (Criteria) this;
        }

        public Criteria andPoCodeIsNull() {
            addCriterion("po_code is null");
            return (Criteria) this;
        }

        public Criteria andPoCodeIsNotNull() {
            addCriterion("po_code is not null");
            return (Criteria) this;
        }

        public Criteria andPoCodeEqualTo(String value) {
            addCriterion("po_code =", value, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeNotEqualTo(String value) {
            addCriterion("po_code <>", value, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeGreaterThan(String value) {
            addCriterion("po_code >", value, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeGreaterThanOrEqualTo(String value) {
            addCriterion("po_code >=", value, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeLessThan(String value) {
            addCriterion("po_code <", value, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeLessThanOrEqualTo(String value) {
            addCriterion("po_code <=", value, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeLike(String value) {
            addCriterion("po_code like", value, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeNotLike(String value) {
            addCriterion("po_code not like", value, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeIn(List<String> values) {
            addCriterion("po_code in", values, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeNotIn(List<String> values) {
            addCriterion("po_code not in", values, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeBetween(String value1, String value2) {
            addCriterion("po_code between", value1, value2, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeNotBetween(String value1, String value2) {
            addCriterion("po_code not between", value1, value2, "poCode");
            return (Criteria) this;
        }

        public Criteria andLineIdIsNull() {
            addCriterion("line_id is null");
            return (Criteria) this;
        }

        public Criteria andLineIdIsNotNull() {
            addCriterion("line_id is not null");
            return (Criteria) this;
        }

        public Criteria andLineIdEqualTo(Integer value) {
            addCriterion("line_id =", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotEqualTo(Integer value) {
            addCriterion("line_id <>", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdGreaterThan(Integer value) {
            addCriterion("line_id >", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("line_id >=", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdLessThan(Integer value) {
            addCriterion("line_id <", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdLessThanOrEqualTo(Integer value) {
            addCriterion("line_id <=", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdIn(List<Integer> values) {
            addCriterion("line_id in", values, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotIn(List<Integer> values) {
            addCriterion("line_id not in", values, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdBetween(Integer value1, Integer value2) {
            addCriterion("line_id between", value1, value2, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("line_id not between", value1, value2, "lineId");
            return (Criteria) this;
        }

        public Criteria andProdCodeIsNull() {
            addCriterion("prod_code is null");
            return (Criteria) this;
        }

        public Criteria andProdCodeIsNotNull() {
            addCriterion("prod_code is not null");
            return (Criteria) this;
        }

        public Criteria andProdCodeEqualTo(String value) {
            addCriterion("prod_code =", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeNotEqualTo(String value) {
            addCriterion("prod_code <>", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeGreaterThan(String value) {
            addCriterion("prod_code >", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("prod_code >=", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeLessThan(String value) {
            addCriterion("prod_code <", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeLessThanOrEqualTo(String value) {
            addCriterion("prod_code <=", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeLike(String value) {
            addCriterion("prod_code like", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeNotLike(String value) {
            addCriterion("prod_code not like", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeIn(List<String> values) {
            addCriterion("prod_code in", values, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeNotIn(List<String> values) {
            addCriterion("prod_code not in", values, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeBetween(String value1, String value2) {
            addCriterion("prod_code between", value1, value2, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeNotBetween(String value1, String value2) {
            addCriterion("prod_code not between", value1, value2, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdNameIsNull() {
            addCriterion("prod_name is null");
            return (Criteria) this;
        }

        public Criteria andProdNameIsNotNull() {
            addCriterion("prod_name is not null");
            return (Criteria) this;
        }

        public Criteria andProdNameEqualTo(String value) {
            addCriterion("prod_name =", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotEqualTo(String value) {
            addCriterion("prod_name <>", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameGreaterThan(String value) {
            addCriterion("prod_name >", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameGreaterThanOrEqualTo(String value) {
            addCriterion("prod_name >=", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameLessThan(String value) {
            addCriterion("prod_name <", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameLessThanOrEqualTo(String value) {
            addCriterion("prod_name <=", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameLike(String value) {
            addCriterion("prod_name like", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotLike(String value) {
            addCriterion("prod_name not like", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameIn(List<String> values) {
            addCriterion("prod_name in", values, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotIn(List<String> values) {
            addCriterion("prod_name not in", values, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameBetween(String value1, String value2) {
            addCriterion("prod_name between", value1, value2, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotBetween(String value1, String value2) {
            addCriterion("prod_name not between", value1, value2, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdTuhaoIsNull() {
            addCriterion("prod_tuhao is null");
            return (Criteria) this;
        }

        public Criteria andProdTuhaoIsNotNull() {
            addCriterion("prod_tuhao is not null");
            return (Criteria) this;
        }

        public Criteria andProdTuhaoEqualTo(String value) {
            addCriterion("prod_tuhao =", value, "prodTuhao");
            return (Criteria) this;
        }

        public Criteria andProdTuhaoNotEqualTo(String value) {
            addCriterion("prod_tuhao <>", value, "prodTuhao");
            return (Criteria) this;
        }

        public Criteria andProdTuhaoGreaterThan(String value) {
            addCriterion("prod_tuhao >", value, "prodTuhao");
            return (Criteria) this;
        }

        public Criteria andProdTuhaoGreaterThanOrEqualTo(String value) {
            addCriterion("prod_tuhao >=", value, "prodTuhao");
            return (Criteria) this;
        }

        public Criteria andProdTuhaoLessThan(String value) {
            addCriterion("prod_tuhao <", value, "prodTuhao");
            return (Criteria) this;
        }

        public Criteria andProdTuhaoLessThanOrEqualTo(String value) {
            addCriterion("prod_tuhao <=", value, "prodTuhao");
            return (Criteria) this;
        }

        public Criteria andProdTuhaoLike(String value) {
            addCriterion("prod_tuhao like", value, "prodTuhao");
            return (Criteria) this;
        }

        public Criteria andProdTuhaoNotLike(String value) {
            addCriterion("prod_tuhao not like", value, "prodTuhao");
            return (Criteria) this;
        }

        public Criteria andProdTuhaoIn(List<String> values) {
            addCriterion("prod_tuhao in", values, "prodTuhao");
            return (Criteria) this;
        }

        public Criteria andProdTuhaoNotIn(List<String> values) {
            addCriterion("prod_tuhao not in", values, "prodTuhao");
            return (Criteria) this;
        }

        public Criteria andProdTuhaoBetween(String value1, String value2) {
            addCriterion("prod_tuhao between", value1, value2, "prodTuhao");
            return (Criteria) this;
        }

        public Criteria andProdTuhaoNotBetween(String value1, String value2) {
            addCriterion("prod_tuhao not between", value1, value2, "prodTuhao");
            return (Criteria) this;
        }

        public Criteria andProdFurnaceNoIsNull() {
            addCriterion("prod_furnace_no is null");
            return (Criteria) this;
        }

        public Criteria andProdFurnaceNoIsNotNull() {
            addCriterion("prod_furnace_no is not null");
            return (Criteria) this;
        }

        public Criteria andProdFurnaceNoEqualTo(String value) {
            addCriterion("prod_furnace_no =", value, "prodFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andProdFurnaceNoNotEqualTo(String value) {
            addCriterion("prod_furnace_no <>", value, "prodFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andProdFurnaceNoGreaterThan(String value) {
            addCriterion("prod_furnace_no >", value, "prodFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andProdFurnaceNoGreaterThanOrEqualTo(String value) {
            addCriterion("prod_furnace_no >=", value, "prodFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andProdFurnaceNoLessThan(String value) {
            addCriterion("prod_furnace_no <", value, "prodFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andProdFurnaceNoLessThanOrEqualTo(String value) {
            addCriterion("prod_furnace_no <=", value, "prodFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andProdFurnaceNoLike(String value) {
            addCriterion("prod_furnace_no like", value, "prodFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andProdFurnaceNoNotLike(String value) {
            addCriterion("prod_furnace_no not like", value, "prodFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andProdFurnaceNoIn(List<String> values) {
            addCriterion("prod_furnace_no in", values, "prodFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andProdFurnaceNoNotIn(List<String> values) {
            addCriterion("prod_furnace_no not in", values, "prodFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andProdFurnaceNoBetween(String value1, String value2) {
            addCriterion("prod_furnace_no between", value1, value2, "prodFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andProdFurnaceNoNotBetween(String value1, String value2) {
            addCriterion("prod_furnace_no not between", value1, value2, "prodFurnaceNo");
            return (Criteria) this;
        }

        public Criteria andProdGlevelIsNull() {
            addCriterion("prod_glevel is null");
            return (Criteria) this;
        }

        public Criteria andProdGlevelIsNotNull() {
            addCriterion("prod_glevel is not null");
            return (Criteria) this;
        }

        public Criteria andProdGlevelEqualTo(String value) {
            addCriterion("prod_glevel =", value, "prodGlevel");
            return (Criteria) this;
        }

        public Criteria andProdGlevelNotEqualTo(String value) {
            addCriterion("prod_glevel <>", value, "prodGlevel");
            return (Criteria) this;
        }

        public Criteria andProdGlevelGreaterThan(String value) {
            addCriterion("prod_glevel >", value, "prodGlevel");
            return (Criteria) this;
        }

        public Criteria andProdGlevelGreaterThanOrEqualTo(String value) {
            addCriterion("prod_glevel >=", value, "prodGlevel");
            return (Criteria) this;
        }

        public Criteria andProdGlevelLessThan(String value) {
            addCriterion("prod_glevel <", value, "prodGlevel");
            return (Criteria) this;
        }

        public Criteria andProdGlevelLessThanOrEqualTo(String value) {
            addCriterion("prod_glevel <=", value, "prodGlevel");
            return (Criteria) this;
        }

        public Criteria andProdGlevelLike(String value) {
            addCriterion("prod_glevel like", value, "prodGlevel");
            return (Criteria) this;
        }

        public Criteria andProdGlevelNotLike(String value) {
            addCriterion("prod_glevel not like", value, "prodGlevel");
            return (Criteria) this;
        }

        public Criteria andProdGlevelIn(List<String> values) {
            addCriterion("prod_glevel in", values, "prodGlevel");
            return (Criteria) this;
        }

        public Criteria andProdGlevelNotIn(List<String> values) {
            addCriterion("prod_glevel not in", values, "prodGlevel");
            return (Criteria) this;
        }

        public Criteria andProdGlevelBetween(String value1, String value2) {
            addCriterion("prod_glevel between", value1, value2, "prodGlevel");
            return (Criteria) this;
        }

        public Criteria andProdGlevelNotBetween(String value1, String value2) {
            addCriterion("prod_glevel not between", value1, value2, "prodGlevel");
            return (Criteria) this;
        }

        public Criteria andProdBatchCodeIsNull() {
            addCriterion("prod_batch_code is null");
            return (Criteria) this;
        }

        public Criteria andProdBatchCodeIsNotNull() {
            addCriterion("prod_batch_code is not null");
            return (Criteria) this;
        }

        public Criteria andProdBatchCodeEqualTo(String value) {
            addCriterion("prod_batch_code =", value, "prodBatchCode");
            return (Criteria) this;
        }

        public Criteria andProdBatchCodeNotEqualTo(String value) {
            addCriterion("prod_batch_code <>", value, "prodBatchCode");
            return (Criteria) this;
        }

        public Criteria andProdBatchCodeGreaterThan(String value) {
            addCriterion("prod_batch_code >", value, "prodBatchCode");
            return (Criteria) this;
        }

        public Criteria andProdBatchCodeGreaterThanOrEqualTo(String value) {
            addCriterion("prod_batch_code >=", value, "prodBatchCode");
            return (Criteria) this;
        }

        public Criteria andProdBatchCodeLessThan(String value) {
            addCriterion("prod_batch_code <", value, "prodBatchCode");
            return (Criteria) this;
        }

        public Criteria andProdBatchCodeLessThanOrEqualTo(String value) {
            addCriterion("prod_batch_code <=", value, "prodBatchCode");
            return (Criteria) this;
        }

        public Criteria andProdBatchCodeLike(String value) {
            addCriterion("prod_batch_code like", value, "prodBatchCode");
            return (Criteria) this;
        }

        public Criteria andProdBatchCodeNotLike(String value) {
            addCriterion("prod_batch_code not like", value, "prodBatchCode");
            return (Criteria) this;
        }

        public Criteria andProdBatchCodeIn(List<String> values) {
            addCriterion("prod_batch_code in", values, "prodBatchCode");
            return (Criteria) this;
        }

        public Criteria andProdBatchCodeNotIn(List<String> values) {
            addCriterion("prod_batch_code not in", values, "prodBatchCode");
            return (Criteria) this;
        }

        public Criteria andProdBatchCodeBetween(String value1, String value2) {
            addCriterion("prod_batch_code between", value1, value2, "prodBatchCode");
            return (Criteria) this;
        }

        public Criteria andProdBatchCodeNotBetween(String value1, String value2) {
            addCriterion("prod_batch_code not between", value1, value2, "prodBatchCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeIsNull() {
            addCriterion("customer_code is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeIsNotNull() {
            addCriterion("customer_code is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeEqualTo(String value) {
            addCriterion("customer_code =", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotEqualTo(String value) {
            addCriterion("customer_code <>", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeGreaterThan(String value) {
            addCriterion("customer_code >", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("customer_code >=", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLessThan(String value) {
            addCriterion("customer_code <", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLessThanOrEqualTo(String value) {
            addCriterion("customer_code <=", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLike(String value) {
            addCriterion("customer_code like", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotLike(String value) {
            addCriterion("customer_code not like", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeIn(List<String> values) {
            addCriterion("customer_code in", values, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotIn(List<String> values) {
            addCriterion("customer_code not in", values, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeBetween(String value1, String value2) {
            addCriterion("customer_code between", value1, value2, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotBetween(String value1, String value2) {
            addCriterion("customer_code not between", value1, value2, "customerCode");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeIsNull() {
            addCriterion("box_barcode is null");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeIsNotNull() {
            addCriterion("box_barcode is not null");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeEqualTo(String value) {
            addCriterion("box_barcode =", value, "boxBarcode");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeNotEqualTo(String value) {
            addCriterion("box_barcode <>", value, "boxBarcode");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeGreaterThan(String value) {
            addCriterion("box_barcode >", value, "boxBarcode");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("box_barcode >=", value, "boxBarcode");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeLessThan(String value) {
            addCriterion("box_barcode <", value, "boxBarcode");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeLessThanOrEqualTo(String value) {
            addCriterion("box_barcode <=", value, "boxBarcode");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeLike(String value) {
            addCriterion("box_barcode like", value, "boxBarcode");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeNotLike(String value) {
            addCriterion("box_barcode not like", value, "boxBarcode");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeIn(List<String> values) {
            addCriterion("box_barcode in", values, "boxBarcode");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeNotIn(List<String> values) {
            addCriterion("box_barcode not in", values, "boxBarcode");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeBetween(String value1, String value2) {
            addCriterion("box_barcode between", value1, value2, "boxBarcode");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeNotBetween(String value1, String value2) {
            addCriterion("box_barcode not between", value1, value2, "boxBarcode");
            return (Criteria) this;
        }

        public Criteria andBoxQuanIsNull() {
            addCriterion("box_quan is null");
            return (Criteria) this;
        }

        public Criteria andBoxQuanIsNotNull() {
            addCriterion("box_quan is not null");
            return (Criteria) this;
        }

        public Criteria andBoxQuanEqualTo(Integer value) {
            addCriterion("box_quan =", value, "boxQuan");
            return (Criteria) this;
        }

        public Criteria andBoxQuanNotEqualTo(Integer value) {
            addCriterion("box_quan <>", value, "boxQuan");
            return (Criteria) this;
        }

        public Criteria andBoxQuanGreaterThan(Integer value) {
            addCriterion("box_quan >", value, "boxQuan");
            return (Criteria) this;
        }

        public Criteria andBoxQuanGreaterThanOrEqualTo(Integer value) {
            addCriterion("box_quan >=", value, "boxQuan");
            return (Criteria) this;
        }

        public Criteria andBoxQuanLessThan(Integer value) {
            addCriterion("box_quan <", value, "boxQuan");
            return (Criteria) this;
        }

        public Criteria andBoxQuanLessThanOrEqualTo(Integer value) {
            addCriterion("box_quan <=", value, "boxQuan");
            return (Criteria) this;
        }

        public Criteria andBoxQuanIn(List<Integer> values) {
            addCriterion("box_quan in", values, "boxQuan");
            return (Criteria) this;
        }

        public Criteria andBoxQuanNotIn(List<Integer> values) {
            addCriterion("box_quan not in", values, "boxQuan");
            return (Criteria) this;
        }

        public Criteria andBoxQuanBetween(Integer value1, Integer value2) {
            addCriterion("box_quan between", value1, value2, "boxQuan");
            return (Criteria) this;
        }

        public Criteria andBoxQuanNotBetween(Integer value1, Integer value2) {
            addCriterion("box_quan not between", value1, value2, "boxQuan");
            return (Criteria) this;
        }

        public Criteria andEmpNumberIsNull() {
            addCriterion("emp_number is null");
            return (Criteria) this;
        }

        public Criteria andEmpNumberIsNotNull() {
            addCriterion("emp_number is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNumberEqualTo(String value) {
            addCriterion("emp_number =", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberNotEqualTo(String value) {
            addCriterion("emp_number <>", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberGreaterThan(String value) {
            addCriterion("emp_number >", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberGreaterThanOrEqualTo(String value) {
            addCriterion("emp_number >=", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberLessThan(String value) {
            addCriterion("emp_number <", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberLessThanOrEqualTo(String value) {
            addCriterion("emp_number <=", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberLike(String value) {
            addCriterion("emp_number like", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberNotLike(String value) {
            addCriterion("emp_number not like", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberIn(List<String> values) {
            addCriterion("emp_number in", values, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberNotIn(List<String> values) {
            addCriterion("emp_number not in", values, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberBetween(String value1, String value2) {
            addCriterion("emp_number between", value1, value2, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberNotBetween(String value1, String value2) {
            addCriterion("emp_number not between", value1, value2, "empNumber");
            return (Criteria) this;
        }

        public Criteria andIsWipIsNull() {
            addCriterion("is_wip is null");
            return (Criteria) this;
        }

        public Criteria andIsWipIsNotNull() {
            addCriterion("is_wip is not null");
            return (Criteria) this;
        }

        public Criteria andIsWipEqualTo(Boolean value) {
            addCriterion("is_wip =", value, "isWip");
            return (Criteria) this;
        }

        public Criteria andIsWipNotEqualTo(Boolean value) {
            addCriterion("is_wip <>", value, "isWip");
            return (Criteria) this;
        }

        public Criteria andIsWipGreaterThan(Boolean value) {
            addCriterion("is_wip >", value, "isWip");
            return (Criteria) this;
        }

        public Criteria andIsWipGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_wip >=", value, "isWip");
            return (Criteria) this;
        }

        public Criteria andIsWipLessThan(Boolean value) {
            addCriterion("is_wip <", value, "isWip");
            return (Criteria) this;
        }

        public Criteria andIsWipLessThanOrEqualTo(Boolean value) {
            addCriterion("is_wip <=", value, "isWip");
            return (Criteria) this;
        }

        public Criteria andIsWipIn(List<Boolean> values) {
            addCriterion("is_wip in", values, "isWip");
            return (Criteria) this;
        }

        public Criteria andIsWipNotIn(List<Boolean> values) {
            addCriterion("is_wip not in", values, "isWip");
            return (Criteria) this;
        }

        public Criteria andIsWipBetween(Boolean value1, Boolean value2) {
            addCriterion("is_wip between", value1, value2, "isWip");
            return (Criteria) this;
        }

        public Criteria andIsWipNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_wip not between", value1, value2, "isWip");
            return (Criteria) this;
        }

        public Criteria andOpDeviceIsNull() {
            addCriterion("op_device is null");
            return (Criteria) this;
        }

        public Criteria andOpDeviceIsNotNull() {
            addCriterion("op_device is not null");
            return (Criteria) this;
        }

        public Criteria andOpDeviceEqualTo(String value) {
            addCriterion("op_device =", value, "opDevice");
            return (Criteria) this;
        }

        public Criteria andOpDeviceNotEqualTo(String value) {
            addCriterion("op_device <>", value, "opDevice");
            return (Criteria) this;
        }

        public Criteria andOpDeviceGreaterThan(String value) {
            addCriterion("op_device >", value, "opDevice");
            return (Criteria) this;
        }

        public Criteria andOpDeviceGreaterThanOrEqualTo(String value) {
            addCriterion("op_device >=", value, "opDevice");
            return (Criteria) this;
        }

        public Criteria andOpDeviceLessThan(String value) {
            addCriterion("op_device <", value, "opDevice");
            return (Criteria) this;
        }

        public Criteria andOpDeviceLessThanOrEqualTo(String value) {
            addCriterion("op_device <=", value, "opDevice");
            return (Criteria) this;
        }

        public Criteria andOpDeviceLike(String value) {
            addCriterion("op_device like", value, "opDevice");
            return (Criteria) this;
        }

        public Criteria andOpDeviceNotLike(String value) {
            addCriterion("op_device not like", value, "opDevice");
            return (Criteria) this;
        }

        public Criteria andOpDeviceIn(List<String> values) {
            addCriterion("op_device in", values, "opDevice");
            return (Criteria) this;
        }

        public Criteria andOpDeviceNotIn(List<String> values) {
            addCriterion("op_device not in", values, "opDevice");
            return (Criteria) this;
        }

        public Criteria andOpDeviceBetween(String value1, String value2) {
            addCriterion("op_device between", value1, value2, "opDevice");
            return (Criteria) this;
        }

        public Criteria andOpDeviceNotBetween(String value1, String value2) {
            addCriterion("op_device not between", value1, value2, "opDevice");
            return (Criteria) this;
        }

        public Criteria andOpNoIsNull() {
            addCriterion("op_no is null");
            return (Criteria) this;
        }

        public Criteria andOpNoIsNotNull() {
            addCriterion("op_no is not null");
            return (Criteria) this;
        }

        public Criteria andOpNoEqualTo(String value) {
            addCriterion("op_no =", value, "opNo");
            return (Criteria) this;
        }

        public Criteria andOpNoNotEqualTo(String value) {
            addCriterion("op_no <>", value, "opNo");
            return (Criteria) this;
        }

        public Criteria andOpNoGreaterThan(String value) {
            addCriterion("op_no >", value, "opNo");
            return (Criteria) this;
        }

        public Criteria andOpNoGreaterThanOrEqualTo(String value) {
            addCriterion("op_no >=", value, "opNo");
            return (Criteria) this;
        }

        public Criteria andOpNoLessThan(String value) {
            addCriterion("op_no <", value, "opNo");
            return (Criteria) this;
        }

        public Criteria andOpNoLessThanOrEqualTo(String value) {
            addCriterion("op_no <=", value, "opNo");
            return (Criteria) this;
        }

        public Criteria andOpNoLike(String value) {
            addCriterion("op_no like", value, "opNo");
            return (Criteria) this;
        }

        public Criteria andOpNoNotLike(String value) {
            addCriterion("op_no not like", value, "opNo");
            return (Criteria) this;
        }

        public Criteria andOpNoIn(List<String> values) {
            addCriterion("op_no in", values, "opNo");
            return (Criteria) this;
        }

        public Criteria andOpNoNotIn(List<String> values) {
            addCriterion("op_no not in", values, "opNo");
            return (Criteria) this;
        }

        public Criteria andOpNoBetween(String value1, String value2) {
            addCriterion("op_no between", value1, value2, "opNo");
            return (Criteria) this;
        }

        public Criteria andOpNoNotBetween(String value1, String value2) {
            addCriterion("op_no not between", value1, value2, "opNo");
            return (Criteria) this;
        }

        public Criteria andOpDescIsNull() {
            addCriterion("op_desc is null");
            return (Criteria) this;
        }

        public Criteria andOpDescIsNotNull() {
            addCriterion("op_desc is not null");
            return (Criteria) this;
        }

        public Criteria andOpDescEqualTo(String value) {
            addCriterion("op_desc =", value, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpDescNotEqualTo(String value) {
            addCriterion("op_desc <>", value, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpDescGreaterThan(String value) {
            addCriterion("op_desc >", value, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpDescGreaterThanOrEqualTo(String value) {
            addCriterion("op_desc >=", value, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpDescLessThan(String value) {
            addCriterion("op_desc <", value, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpDescLessThanOrEqualTo(String value) {
            addCriterion("op_desc <=", value, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpDescLike(String value) {
            addCriterion("op_desc like", value, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpDescNotLike(String value) {
            addCriterion("op_desc not like", value, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpDescIn(List<String> values) {
            addCriterion("op_desc in", values, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpDescNotIn(List<String> values) {
            addCriterion("op_desc not in", values, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpDescBetween(String value1, String value2) {
            addCriterion("op_desc between", value1, value2, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpDescNotBetween(String value1, String value2) {
            addCriterion("op_desc not between", value1, value2, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpWorkstationIsNull() {
            addCriterion("op_workstation is null");
            return (Criteria) this;
        }

        public Criteria andOpWorkstationIsNotNull() {
            addCriterion("op_workstation is not null");
            return (Criteria) this;
        }

        public Criteria andOpWorkstationEqualTo(String value) {
            addCriterion("op_workstation =", value, "opWorkstation");
            return (Criteria) this;
        }

        public Criteria andOpWorkstationNotEqualTo(String value) {
            addCriterion("op_workstation <>", value, "opWorkstation");
            return (Criteria) this;
        }

        public Criteria andOpWorkstationGreaterThan(String value) {
            addCriterion("op_workstation >", value, "opWorkstation");
            return (Criteria) this;
        }

        public Criteria andOpWorkstationGreaterThanOrEqualTo(String value) {
            addCriterion("op_workstation >=", value, "opWorkstation");
            return (Criteria) this;
        }

        public Criteria andOpWorkstationLessThan(String value) {
            addCriterion("op_workstation <", value, "opWorkstation");
            return (Criteria) this;
        }

        public Criteria andOpWorkstationLessThanOrEqualTo(String value) {
            addCriterion("op_workstation <=", value, "opWorkstation");
            return (Criteria) this;
        }

        public Criteria andOpWorkstationLike(String value) {
            addCriterion("op_workstation like", value, "opWorkstation");
            return (Criteria) this;
        }

        public Criteria andOpWorkstationNotLike(String value) {
            addCriterion("op_workstation not like", value, "opWorkstation");
            return (Criteria) this;
        }

        public Criteria andOpWorkstationIn(List<String> values) {
            addCriterion("op_workstation in", values, "opWorkstation");
            return (Criteria) this;
        }

        public Criteria andOpWorkstationNotIn(List<String> values) {
            addCriterion("op_workstation not in", values, "opWorkstation");
            return (Criteria) this;
        }

        public Criteria andOpWorkstationBetween(String value1, String value2) {
            addCriterion("op_workstation between", value1, value2, "opWorkstation");
            return (Criteria) this;
        }

        public Criteria andOpWorkstationNotBetween(String value1, String value2) {
            addCriterion("op_workstation not between", value1, value2, "opWorkstation");
            return (Criteria) this;
        }

        public Criteria andIsFeededIsNull() {
            addCriterion("is_feeded is null");
            return (Criteria) this;
        }

        public Criteria andIsFeededIsNotNull() {
            addCriterion("is_feeded is not null");
            return (Criteria) this;
        }

        public Criteria andIsFeededEqualTo(Boolean value) {
            addCriterion("is_feeded =", value, "isFeeded");
            return (Criteria) this;
        }

        public Criteria andIsFeededNotEqualTo(Boolean value) {
            addCriterion("is_feeded <>", value, "isFeeded");
            return (Criteria) this;
        }

        public Criteria andIsFeededGreaterThan(Boolean value) {
            addCriterion("is_feeded >", value, "isFeeded");
            return (Criteria) this;
        }

        public Criteria andIsFeededGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_feeded >=", value, "isFeeded");
            return (Criteria) this;
        }

        public Criteria andIsFeededLessThan(Boolean value) {
            addCriterion("is_feeded <", value, "isFeeded");
            return (Criteria) this;
        }

        public Criteria andIsFeededLessThanOrEqualTo(Boolean value) {
            addCriterion("is_feeded <=", value, "isFeeded");
            return (Criteria) this;
        }

        public Criteria andIsFeededIn(List<Boolean> values) {
            addCriterion("is_feeded in", values, "isFeeded");
            return (Criteria) this;
        }

        public Criteria andIsFeededNotIn(List<Boolean> values) {
            addCriterion("is_feeded not in", values, "isFeeded");
            return (Criteria) this;
        }

        public Criteria andIsFeededBetween(Boolean value1, Boolean value2) {
            addCriterion("is_feeded between", value1, value2, "isFeeded");
            return (Criteria) this;
        }

        public Criteria andIsFeededNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_feeded not between", value1, value2, "isFeeded");
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