package com.uspring.sdsmesplus.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProdBatchLogPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProdBatchLogPOExample() {
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

        public Criteria andBatchIdIsNull() {
            addCriterion("batch_id is null");
            return (Criteria) this;
        }

        public Criteria andBatchIdIsNotNull() {
            addCriterion("batch_id is not null");
            return (Criteria) this;
        }

        public Criteria andBatchIdEqualTo(Integer value) {
            addCriterion("batch_id =", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotEqualTo(Integer value) {
            addCriterion("batch_id <>", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThan(Integer value) {
            addCriterion("batch_id >", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("batch_id >=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThan(Integer value) {
            addCriterion("batch_id <", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThanOrEqualTo(Integer value) {
            addCriterion("batch_id <=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdIn(List<Integer> values) {
            addCriterion("batch_id in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotIn(List<Integer> values) {
            addCriterion("batch_id not in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdBetween(Integer value1, Integer value2) {
            addCriterion("batch_id between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("batch_id not between", value1, value2, "batchId");
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

        public Criteria andFcCodeIsNull() {
            addCriterion("fc_code is null");
            return (Criteria) this;
        }

        public Criteria andFcCodeIsNotNull() {
            addCriterion("fc_code is not null");
            return (Criteria) this;
        }

        public Criteria andFcCodeEqualTo(String value) {
            addCriterion("fc_code =", value, "fcCode");
            return (Criteria) this;
        }

        public Criteria andFcCodeNotEqualTo(String value) {
            addCriterion("fc_code <>", value, "fcCode");
            return (Criteria) this;
        }

        public Criteria andFcCodeGreaterThan(String value) {
            addCriterion("fc_code >", value, "fcCode");
            return (Criteria) this;
        }

        public Criteria andFcCodeGreaterThanOrEqualTo(String value) {
            addCriterion("fc_code >=", value, "fcCode");
            return (Criteria) this;
        }

        public Criteria andFcCodeLessThan(String value) {
            addCriterion("fc_code <", value, "fcCode");
            return (Criteria) this;
        }

        public Criteria andFcCodeLessThanOrEqualTo(String value) {
            addCriterion("fc_code <=", value, "fcCode");
            return (Criteria) this;
        }

        public Criteria andFcCodeLike(String value) {
            addCriterion("fc_code like", value, "fcCode");
            return (Criteria) this;
        }

        public Criteria andFcCodeNotLike(String value) {
            addCriterion("fc_code not like", value, "fcCode");
            return (Criteria) this;
        }

        public Criteria andFcCodeIn(List<String> values) {
            addCriterion("fc_code in", values, "fcCode");
            return (Criteria) this;
        }

        public Criteria andFcCodeNotIn(List<String> values) {
            addCriterion("fc_code not in", values, "fcCode");
            return (Criteria) this;
        }

        public Criteria andFcCodeBetween(String value1, String value2) {
            addCriterion("fc_code between", value1, value2, "fcCode");
            return (Criteria) this;
        }

        public Criteria andFcCodeNotBetween(String value1, String value2) {
            addCriterion("fc_code not between", value1, value2, "fcCode");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNull() {
            addCriterion("supplier is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNotNull() {
            addCriterion("supplier is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEqualTo(String value) {
            addCriterion("supplier =", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotEqualTo(String value) {
            addCriterion("supplier <>", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThan(String value) {
            addCriterion("supplier >", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("supplier >=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThan(String value) {
            addCriterion("supplier <", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThanOrEqualTo(String value) {
            addCriterion("supplier <=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLike(String value) {
            addCriterion("supplier like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotLike(String value) {
            addCriterion("supplier not like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierIn(List<String> values) {
            addCriterion("supplier in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotIn(List<String> values) {
            addCriterion("supplier not in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierBetween(String value1, String value2) {
            addCriterion("supplier between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotBetween(String value1, String value2) {
            addCriterion("supplier not between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierBatchCodeIsNull() {
            addCriterion("supplier_batch_code is null");
            return (Criteria) this;
        }

        public Criteria andSupplierBatchCodeIsNotNull() {
            addCriterion("supplier_batch_code is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierBatchCodeEqualTo(String value) {
            addCriterion("supplier_batch_code =", value, "supplierBatchCode");
            return (Criteria) this;
        }

        public Criteria andSupplierBatchCodeNotEqualTo(String value) {
            addCriterion("supplier_batch_code <>", value, "supplierBatchCode");
            return (Criteria) this;
        }

        public Criteria andSupplierBatchCodeGreaterThan(String value) {
            addCriterion("supplier_batch_code >", value, "supplierBatchCode");
            return (Criteria) this;
        }

        public Criteria andSupplierBatchCodeGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_batch_code >=", value, "supplierBatchCode");
            return (Criteria) this;
        }

        public Criteria andSupplierBatchCodeLessThan(String value) {
            addCriterion("supplier_batch_code <", value, "supplierBatchCode");
            return (Criteria) this;
        }

        public Criteria andSupplierBatchCodeLessThanOrEqualTo(String value) {
            addCriterion("supplier_batch_code <=", value, "supplierBatchCode");
            return (Criteria) this;
        }

        public Criteria andSupplierBatchCodeLike(String value) {
            addCriterion("supplier_batch_code like", value, "supplierBatchCode");
            return (Criteria) this;
        }

        public Criteria andSupplierBatchCodeNotLike(String value) {
            addCriterion("supplier_batch_code not like", value, "supplierBatchCode");
            return (Criteria) this;
        }

        public Criteria andSupplierBatchCodeIn(List<String> values) {
            addCriterion("supplier_batch_code in", values, "supplierBatchCode");
            return (Criteria) this;
        }

        public Criteria andSupplierBatchCodeNotIn(List<String> values) {
            addCriterion("supplier_batch_code not in", values, "supplierBatchCode");
            return (Criteria) this;
        }

        public Criteria andSupplierBatchCodeBetween(String value1, String value2) {
            addCriterion("supplier_batch_code between", value1, value2, "supplierBatchCode");
            return (Criteria) this;
        }

        public Criteria andSupplierBatchCodeNotBetween(String value1, String value2) {
            addCriterion("supplier_batch_code not between", value1, value2, "supplierBatchCode");
            return (Criteria) this;
        }

        public Criteria andProductDateIsNull() {
            addCriterion("product_date is null");
            return (Criteria) this;
        }

        public Criteria andProductDateIsNotNull() {
            addCriterion("product_date is not null");
            return (Criteria) this;
        }

        public Criteria andProductDateEqualTo(String value) {
            addCriterion("product_date =", value, "productDate");
            return (Criteria) this;
        }

        public Criteria andProductDateNotEqualTo(String value) {
            addCriterion("product_date <>", value, "productDate");
            return (Criteria) this;
        }

        public Criteria andProductDateGreaterThan(String value) {
            addCriterion("product_date >", value, "productDate");
            return (Criteria) this;
        }

        public Criteria andProductDateGreaterThanOrEqualTo(String value) {
            addCriterion("product_date >=", value, "productDate");
            return (Criteria) this;
        }

        public Criteria andProductDateLessThan(String value) {
            addCriterion("product_date <", value, "productDate");
            return (Criteria) this;
        }

        public Criteria andProductDateLessThanOrEqualTo(String value) {
            addCriterion("product_date <=", value, "productDate");
            return (Criteria) this;
        }

        public Criteria andProductDateLike(String value) {
            addCriterion("product_date like", value, "productDate");
            return (Criteria) this;
        }

        public Criteria andProductDateNotLike(String value) {
            addCriterion("product_date not like", value, "productDate");
            return (Criteria) this;
        }

        public Criteria andProductDateIn(List<String> values) {
            addCriterion("product_date in", values, "productDate");
            return (Criteria) this;
        }

        public Criteria andProductDateNotIn(List<String> values) {
            addCriterion("product_date not in", values, "productDate");
            return (Criteria) this;
        }

        public Criteria andProductDateBetween(String value1, String value2) {
            addCriterion("product_date between", value1, value2, "productDate");
            return (Criteria) this;
        }

        public Criteria andProductDateNotBetween(String value1, String value2) {
            addCriterion("product_date not between", value1, value2, "productDate");
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

        public Criteria andMaterialVersionIsNull() {
            addCriterion("material_version is null");
            return (Criteria) this;
        }

        public Criteria andMaterialVersionIsNotNull() {
            addCriterion("material_version is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialVersionEqualTo(String value) {
            addCriterion("material_version =", value, "materialVersion");
            return (Criteria) this;
        }

        public Criteria andMaterialVersionNotEqualTo(String value) {
            addCriterion("material_version <>", value, "materialVersion");
            return (Criteria) this;
        }

        public Criteria andMaterialVersionGreaterThan(String value) {
            addCriterion("material_version >", value, "materialVersion");
            return (Criteria) this;
        }

        public Criteria andMaterialVersionGreaterThanOrEqualTo(String value) {
            addCriterion("material_version >=", value, "materialVersion");
            return (Criteria) this;
        }

        public Criteria andMaterialVersionLessThan(String value) {
            addCriterion("material_version <", value, "materialVersion");
            return (Criteria) this;
        }

        public Criteria andMaterialVersionLessThanOrEqualTo(String value) {
            addCriterion("material_version <=", value, "materialVersion");
            return (Criteria) this;
        }

        public Criteria andMaterialVersionLike(String value) {
            addCriterion("material_version like", value, "materialVersion");
            return (Criteria) this;
        }

        public Criteria andMaterialVersionNotLike(String value) {
            addCriterion("material_version not like", value, "materialVersion");
            return (Criteria) this;
        }

        public Criteria andMaterialVersionIn(List<String> values) {
            addCriterion("material_version in", values, "materialVersion");
            return (Criteria) this;
        }

        public Criteria andMaterialVersionNotIn(List<String> values) {
            addCriterion("material_version not in", values, "materialVersion");
            return (Criteria) this;
        }

        public Criteria andMaterialVersionBetween(String value1, String value2) {
            addCriterion("material_version between", value1, value2, "materialVersion");
            return (Criteria) this;
        }

        public Criteria andMaterialVersionNotBetween(String value1, String value2) {
            addCriterion("material_version not between", value1, value2, "materialVersion");
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