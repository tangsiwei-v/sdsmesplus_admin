package com.uspring.sdsmesplus.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysPrinterTmplPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysPrinterTmplPOExample() {
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

        public Criteria andPtmplIdIsNull() {
            addCriterion("ptmpl_id is null");
            return (Criteria) this;
        }

        public Criteria andPtmplIdIsNotNull() {
            addCriterion("ptmpl_id is not null");
            return (Criteria) this;
        }

        public Criteria andPtmplIdEqualTo(Integer value) {
            addCriterion("ptmpl_id =", value, "ptmplId");
            return (Criteria) this;
        }

        public Criteria andPtmplIdNotEqualTo(Integer value) {
            addCriterion("ptmpl_id <>", value, "ptmplId");
            return (Criteria) this;
        }

        public Criteria andPtmplIdGreaterThan(Integer value) {
            addCriterion("ptmpl_id >", value, "ptmplId");
            return (Criteria) this;
        }

        public Criteria andPtmplIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ptmpl_id >=", value, "ptmplId");
            return (Criteria) this;
        }

        public Criteria andPtmplIdLessThan(Integer value) {
            addCriterion("ptmpl_id <", value, "ptmplId");
            return (Criteria) this;
        }

        public Criteria andPtmplIdLessThanOrEqualTo(Integer value) {
            addCriterion("ptmpl_id <=", value, "ptmplId");
            return (Criteria) this;
        }

        public Criteria andPtmplIdIn(List<Integer> values) {
            addCriterion("ptmpl_id in", values, "ptmplId");
            return (Criteria) this;
        }

        public Criteria andPtmplIdNotIn(List<Integer> values) {
            addCriterion("ptmpl_id not in", values, "ptmplId");
            return (Criteria) this;
        }

        public Criteria andPtmplIdBetween(Integer value1, Integer value2) {
            addCriterion("ptmpl_id between", value1, value2, "ptmplId");
            return (Criteria) this;
        }

        public Criteria andPtmplIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ptmpl_id not between", value1, value2, "ptmplId");
            return (Criteria) this;
        }

        public Criteria andFcIdIsNull() {
            addCriterion("fc_id is null");
            return (Criteria) this;
        }

        public Criteria andFcIdIsNotNull() {
            addCriterion("fc_id is not null");
            return (Criteria) this;
        }

        public Criteria andFcIdEqualTo(Integer value) {
            addCriterion("fc_id =", value, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdNotEqualTo(Integer value) {
            addCriterion("fc_id <>", value, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdGreaterThan(Integer value) {
            addCriterion("fc_id >", value, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fc_id >=", value, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdLessThan(Integer value) {
            addCriterion("fc_id <", value, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdLessThanOrEqualTo(Integer value) {
            addCriterion("fc_id <=", value, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdIn(List<Integer> values) {
            addCriterion("fc_id in", values, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdNotIn(List<Integer> values) {
            addCriterion("fc_id not in", values, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdBetween(Integer value1, Integer value2) {
            addCriterion("fc_id between", value1, value2, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fc_id not between", value1, value2, "fcId");
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

        public Criteria andPtmplSizeIsNull() {
            addCriterion("ptmpl_size is null");
            return (Criteria) this;
        }

        public Criteria andPtmplSizeIsNotNull() {
            addCriterion("ptmpl_size is not null");
            return (Criteria) this;
        }

        public Criteria andPtmplSizeEqualTo(Integer value) {
            addCriterion("ptmpl_size =", value, "ptmplSize");
            return (Criteria) this;
        }

        public Criteria andPtmplSizeNotEqualTo(Integer value) {
            addCriterion("ptmpl_size <>", value, "ptmplSize");
            return (Criteria) this;
        }

        public Criteria andPtmplSizeGreaterThan(Integer value) {
            addCriterion("ptmpl_size >", value, "ptmplSize");
            return (Criteria) this;
        }

        public Criteria andPtmplSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ptmpl_size >=", value, "ptmplSize");
            return (Criteria) this;
        }

        public Criteria andPtmplSizeLessThan(Integer value) {
            addCriterion("ptmpl_size <", value, "ptmplSize");
            return (Criteria) this;
        }

        public Criteria andPtmplSizeLessThanOrEqualTo(Integer value) {
            addCriterion("ptmpl_size <=", value, "ptmplSize");
            return (Criteria) this;
        }

        public Criteria andPtmplSizeIn(List<Integer> values) {
            addCriterion("ptmpl_size in", values, "ptmplSize");
            return (Criteria) this;
        }

        public Criteria andPtmplSizeNotIn(List<Integer> values) {
            addCriterion("ptmpl_size not in", values, "ptmplSize");
            return (Criteria) this;
        }

        public Criteria andPtmplSizeBetween(Integer value1, Integer value2) {
            addCriterion("ptmpl_size between", value1, value2, "ptmplSize");
            return (Criteria) this;
        }

        public Criteria andPtmplSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("ptmpl_size not between", value1, value2, "ptmplSize");
            return (Criteria) this;
        }

        public Criteria andPtmplRegexIsNull() {
            addCriterion("ptmpl_regex is null");
            return (Criteria) this;
        }

        public Criteria andPtmplRegexIsNotNull() {
            addCriterion("ptmpl_regex is not null");
            return (Criteria) this;
        }

        public Criteria andPtmplRegexEqualTo(String value) {
            addCriterion("ptmpl_regex =", value, "ptmplRegex");
            return (Criteria) this;
        }

        public Criteria andPtmplRegexNotEqualTo(String value) {
            addCriterion("ptmpl_regex <>", value, "ptmplRegex");
            return (Criteria) this;
        }

        public Criteria andPtmplRegexGreaterThan(String value) {
            addCriterion("ptmpl_regex >", value, "ptmplRegex");
            return (Criteria) this;
        }

        public Criteria andPtmplRegexGreaterThanOrEqualTo(String value) {
            addCriterion("ptmpl_regex >=", value, "ptmplRegex");
            return (Criteria) this;
        }

        public Criteria andPtmplRegexLessThan(String value) {
            addCriterion("ptmpl_regex <", value, "ptmplRegex");
            return (Criteria) this;
        }

        public Criteria andPtmplRegexLessThanOrEqualTo(String value) {
            addCriterion("ptmpl_regex <=", value, "ptmplRegex");
            return (Criteria) this;
        }

        public Criteria andPtmplRegexLike(String value) {
            addCriterion("ptmpl_regex like", value, "ptmplRegex");
            return (Criteria) this;
        }

        public Criteria andPtmplRegexNotLike(String value) {
            addCriterion("ptmpl_regex not like", value, "ptmplRegex");
            return (Criteria) this;
        }

        public Criteria andPtmplRegexIn(List<String> values) {
            addCriterion("ptmpl_regex in", values, "ptmplRegex");
            return (Criteria) this;
        }

        public Criteria andPtmplRegexNotIn(List<String> values) {
            addCriterion("ptmpl_regex not in", values, "ptmplRegex");
            return (Criteria) this;
        }

        public Criteria andPtmplRegexBetween(String value1, String value2) {
            addCriterion("ptmpl_regex between", value1, value2, "ptmplRegex");
            return (Criteria) this;
        }

        public Criteria andPtmplRegexNotBetween(String value1, String value2) {
            addCriterion("ptmpl_regex not between", value1, value2, "ptmplRegex");
            return (Criteria) this;
        }

        public Criteria andPtmplFileNameIsNull() {
            addCriterion("ptmpl_file_name is null");
            return (Criteria) this;
        }

        public Criteria andPtmplFileNameIsNotNull() {
            addCriterion("ptmpl_file_name is not null");
            return (Criteria) this;
        }

        public Criteria andPtmplFileNameEqualTo(String value) {
            addCriterion("ptmpl_file_name =", value, "ptmplFileName");
            return (Criteria) this;
        }

        public Criteria andPtmplFileNameNotEqualTo(String value) {
            addCriterion("ptmpl_file_name <>", value, "ptmplFileName");
            return (Criteria) this;
        }

        public Criteria andPtmplFileNameGreaterThan(String value) {
            addCriterion("ptmpl_file_name >", value, "ptmplFileName");
            return (Criteria) this;
        }

        public Criteria andPtmplFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("ptmpl_file_name >=", value, "ptmplFileName");
            return (Criteria) this;
        }

        public Criteria andPtmplFileNameLessThan(String value) {
            addCriterion("ptmpl_file_name <", value, "ptmplFileName");
            return (Criteria) this;
        }

        public Criteria andPtmplFileNameLessThanOrEqualTo(String value) {
            addCriterion("ptmpl_file_name <=", value, "ptmplFileName");
            return (Criteria) this;
        }

        public Criteria andPtmplFileNameLike(String value) {
            addCriterion("ptmpl_file_name like", value, "ptmplFileName");
            return (Criteria) this;
        }

        public Criteria andPtmplFileNameNotLike(String value) {
            addCriterion("ptmpl_file_name not like", value, "ptmplFileName");
            return (Criteria) this;
        }

        public Criteria andPtmplFileNameIn(List<String> values) {
            addCriterion("ptmpl_file_name in", values, "ptmplFileName");
            return (Criteria) this;
        }

        public Criteria andPtmplFileNameNotIn(List<String> values) {
            addCriterion("ptmpl_file_name not in", values, "ptmplFileName");
            return (Criteria) this;
        }

        public Criteria andPtmplFileNameBetween(String value1, String value2) {
            addCriterion("ptmpl_file_name between", value1, value2, "ptmplFileName");
            return (Criteria) this;
        }

        public Criteria andPtmplFileNameNotBetween(String value1, String value2) {
            addCriterion("ptmpl_file_name not between", value1, value2, "ptmplFileName");
            return (Criteria) this;
        }

        public Criteria andPtCounterMinIsNull() {
            addCriterion("pt_counter_min is null");
            return (Criteria) this;
        }

        public Criteria andPtCounterMinIsNotNull() {
            addCriterion("pt_counter_min is not null");
            return (Criteria) this;
        }

        public Criteria andPtCounterMinEqualTo(Integer value) {
            addCriterion("pt_counter_min =", value, "ptCounterMin");
            return (Criteria) this;
        }

        public Criteria andPtCounterMinNotEqualTo(Integer value) {
            addCriterion("pt_counter_min <>", value, "ptCounterMin");
            return (Criteria) this;
        }

        public Criteria andPtCounterMinGreaterThan(Integer value) {
            addCriterion("pt_counter_min >", value, "ptCounterMin");
            return (Criteria) this;
        }

        public Criteria andPtCounterMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("pt_counter_min >=", value, "ptCounterMin");
            return (Criteria) this;
        }

        public Criteria andPtCounterMinLessThan(Integer value) {
            addCriterion("pt_counter_min <", value, "ptCounterMin");
            return (Criteria) this;
        }

        public Criteria andPtCounterMinLessThanOrEqualTo(Integer value) {
            addCriterion("pt_counter_min <=", value, "ptCounterMin");
            return (Criteria) this;
        }

        public Criteria andPtCounterMinIn(List<Integer> values) {
            addCriterion("pt_counter_min in", values, "ptCounterMin");
            return (Criteria) this;
        }

        public Criteria andPtCounterMinNotIn(List<Integer> values) {
            addCriterion("pt_counter_min not in", values, "ptCounterMin");
            return (Criteria) this;
        }

        public Criteria andPtCounterMinBetween(Integer value1, Integer value2) {
            addCriterion("pt_counter_min between", value1, value2, "ptCounterMin");
            return (Criteria) this;
        }

        public Criteria andPtCounterMinNotBetween(Integer value1, Integer value2) {
            addCriterion("pt_counter_min not between", value1, value2, "ptCounterMin");
            return (Criteria) this;
        }

        public Criteria andPtCounterMaxIsNull() {
            addCriterion("pt_counter_max is null");
            return (Criteria) this;
        }

        public Criteria andPtCounterMaxIsNotNull() {
            addCriterion("pt_counter_max is not null");
            return (Criteria) this;
        }

        public Criteria andPtCounterMaxEqualTo(Integer value) {
            addCriterion("pt_counter_max =", value, "ptCounterMax");
            return (Criteria) this;
        }

        public Criteria andPtCounterMaxNotEqualTo(Integer value) {
            addCriterion("pt_counter_max <>", value, "ptCounterMax");
            return (Criteria) this;
        }

        public Criteria andPtCounterMaxGreaterThan(Integer value) {
            addCriterion("pt_counter_max >", value, "ptCounterMax");
            return (Criteria) this;
        }

        public Criteria andPtCounterMaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("pt_counter_max >=", value, "ptCounterMax");
            return (Criteria) this;
        }

        public Criteria andPtCounterMaxLessThan(Integer value) {
            addCriterion("pt_counter_max <", value, "ptCounterMax");
            return (Criteria) this;
        }

        public Criteria andPtCounterMaxLessThanOrEqualTo(Integer value) {
            addCriterion("pt_counter_max <=", value, "ptCounterMax");
            return (Criteria) this;
        }

        public Criteria andPtCounterMaxIn(List<Integer> values) {
            addCriterion("pt_counter_max in", values, "ptCounterMax");
            return (Criteria) this;
        }

        public Criteria andPtCounterMaxNotIn(List<Integer> values) {
            addCriterion("pt_counter_max not in", values, "ptCounterMax");
            return (Criteria) this;
        }

        public Criteria andPtCounterMaxBetween(Integer value1, Integer value2) {
            addCriterion("pt_counter_max between", value1, value2, "ptCounterMax");
            return (Criteria) this;
        }

        public Criteria andPtCounterMaxNotBetween(Integer value1, Integer value2) {
            addCriterion("pt_counter_max not between", value1, value2, "ptCounterMax");
            return (Criteria) this;
        }

        public Criteria andPtCounterResetTypeIsNull() {
            addCriterion("pt_counter_reset_type is null");
            return (Criteria) this;
        }

        public Criteria andPtCounterResetTypeIsNotNull() {
            addCriterion("pt_counter_reset_type is not null");
            return (Criteria) this;
        }

        public Criteria andPtCounterResetTypeEqualTo(String value) {
            addCriterion("pt_counter_reset_type =", value, "ptCounterResetType");
            return (Criteria) this;
        }

        public Criteria andPtCounterResetTypeNotEqualTo(String value) {
            addCriterion("pt_counter_reset_type <>", value, "ptCounterResetType");
            return (Criteria) this;
        }

        public Criteria andPtCounterResetTypeGreaterThan(String value) {
            addCriterion("pt_counter_reset_type >", value, "ptCounterResetType");
            return (Criteria) this;
        }

        public Criteria andPtCounterResetTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pt_counter_reset_type >=", value, "ptCounterResetType");
            return (Criteria) this;
        }

        public Criteria andPtCounterResetTypeLessThan(String value) {
            addCriterion("pt_counter_reset_type <", value, "ptCounterResetType");
            return (Criteria) this;
        }

        public Criteria andPtCounterResetTypeLessThanOrEqualTo(String value) {
            addCriterion("pt_counter_reset_type <=", value, "ptCounterResetType");
            return (Criteria) this;
        }

        public Criteria andPtCounterResetTypeLike(String value) {
            addCriterion("pt_counter_reset_type like", value, "ptCounterResetType");
            return (Criteria) this;
        }

        public Criteria andPtCounterResetTypeNotLike(String value) {
            addCriterion("pt_counter_reset_type not like", value, "ptCounterResetType");
            return (Criteria) this;
        }

        public Criteria andPtCounterResetTypeIn(List<String> values) {
            addCriterion("pt_counter_reset_type in", values, "ptCounterResetType");
            return (Criteria) this;
        }

        public Criteria andPtCounterResetTypeNotIn(List<String> values) {
            addCriterion("pt_counter_reset_type not in", values, "ptCounterResetType");
            return (Criteria) this;
        }

        public Criteria andPtCounterResetTypeBetween(String value1, String value2) {
            addCriterion("pt_counter_reset_type between", value1, value2, "ptCounterResetType");
            return (Criteria) this;
        }

        public Criteria andPtCounterResetTypeNotBetween(String value1, String value2) {
            addCriterion("pt_counter_reset_type not between", value1, value2, "ptCounterResetType");
            return (Criteria) this;
        }

        public Criteria andPtCounterValueIsNull() {
            addCriterion("pt_counter_value is null");
            return (Criteria) this;
        }

        public Criteria andPtCounterValueIsNotNull() {
            addCriterion("pt_counter_value is not null");
            return (Criteria) this;
        }

        public Criteria andPtCounterValueEqualTo(Integer value) {
            addCriterion("pt_counter_value =", value, "ptCounterValue");
            return (Criteria) this;
        }

        public Criteria andPtCounterValueNotEqualTo(Integer value) {
            addCriterion("pt_counter_value <>", value, "ptCounterValue");
            return (Criteria) this;
        }

        public Criteria andPtCounterValueGreaterThan(Integer value) {
            addCriterion("pt_counter_value >", value, "ptCounterValue");
            return (Criteria) this;
        }

        public Criteria andPtCounterValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("pt_counter_value >=", value, "ptCounterValue");
            return (Criteria) this;
        }

        public Criteria andPtCounterValueLessThan(Integer value) {
            addCriterion("pt_counter_value <", value, "ptCounterValue");
            return (Criteria) this;
        }

        public Criteria andPtCounterValueLessThanOrEqualTo(Integer value) {
            addCriterion("pt_counter_value <=", value, "ptCounterValue");
            return (Criteria) this;
        }

        public Criteria andPtCounterValueIn(List<Integer> values) {
            addCriterion("pt_counter_value in", values, "ptCounterValue");
            return (Criteria) this;
        }

        public Criteria andPtCounterValueNotIn(List<Integer> values) {
            addCriterion("pt_counter_value not in", values, "ptCounterValue");
            return (Criteria) this;
        }

        public Criteria andPtCounterValueBetween(Integer value1, Integer value2) {
            addCriterion("pt_counter_value between", value1, value2, "ptCounterValue");
            return (Criteria) this;
        }

        public Criteria andPtCounterValueNotBetween(Integer value1, Integer value2) {
            addCriterion("pt_counter_value not between", value1, value2, "ptCounterValue");
            return (Criteria) this;
        }

        public Criteria andPtCounterTimeIsNull() {
            addCriterion("pt_counter_time is null");
            return (Criteria) this;
        }

        public Criteria andPtCounterTimeIsNotNull() {
            addCriterion("pt_counter_time is not null");
            return (Criteria) this;
        }

        public Criteria andPtCounterTimeEqualTo(Date value) {
            addCriterion("pt_counter_time =", value, "ptCounterTime");
            return (Criteria) this;
        }

        public Criteria andPtCounterTimeNotEqualTo(Date value) {
            addCriterion("pt_counter_time <>", value, "ptCounterTime");
            return (Criteria) this;
        }

        public Criteria andPtCounterTimeGreaterThan(Date value) {
            addCriterion("pt_counter_time >", value, "ptCounterTime");
            return (Criteria) this;
        }

        public Criteria andPtCounterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pt_counter_time >=", value, "ptCounterTime");
            return (Criteria) this;
        }

        public Criteria andPtCounterTimeLessThan(Date value) {
            addCriterion("pt_counter_time <", value, "ptCounterTime");
            return (Criteria) this;
        }

        public Criteria andPtCounterTimeLessThanOrEqualTo(Date value) {
            addCriterion("pt_counter_time <=", value, "ptCounterTime");
            return (Criteria) this;
        }

        public Criteria andPtCounterTimeIn(List<Date> values) {
            addCriterion("pt_counter_time in", values, "ptCounterTime");
            return (Criteria) this;
        }

        public Criteria andPtCounterTimeNotIn(List<Date> values) {
            addCriterion("pt_counter_time not in", values, "ptCounterTime");
            return (Criteria) this;
        }

        public Criteria andPtCounterTimeBetween(Date value1, Date value2) {
            addCriterion("pt_counter_time between", value1, value2, "ptCounterTime");
            return (Criteria) this;
        }

        public Criteria andPtCounterTimeNotBetween(Date value1, Date value2) {
            addCriterion("pt_counter_time not between", value1, value2, "ptCounterTime");
            return (Criteria) this;
        }

        public Criteria andPtFileUpdatetimeIsNull() {
            addCriterion("pt_file_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andPtFileUpdatetimeIsNotNull() {
            addCriterion("pt_file_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andPtFileUpdatetimeEqualTo(Date value) {
            addCriterion("pt_file_updatetime =", value, "ptFileUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPtFileUpdatetimeNotEqualTo(Date value) {
            addCriterion("pt_file_updatetime <>", value, "ptFileUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPtFileUpdatetimeGreaterThan(Date value) {
            addCriterion("pt_file_updatetime >", value, "ptFileUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPtFileUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pt_file_updatetime >=", value, "ptFileUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPtFileUpdatetimeLessThan(Date value) {
            addCriterion("pt_file_updatetime <", value, "ptFileUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPtFileUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("pt_file_updatetime <=", value, "ptFileUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPtFileUpdatetimeIn(List<Date> values) {
            addCriterion("pt_file_updatetime in", values, "ptFileUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPtFileUpdatetimeNotIn(List<Date> values) {
            addCriterion("pt_file_updatetime not in", values, "ptFileUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPtFileUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("pt_file_updatetime between", value1, value2, "ptFileUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPtFileUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("pt_file_updatetime not between", value1, value2, "ptFileUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCheckPersonIsNull() {
            addCriterion("check_person is null");
            return (Criteria) this;
        }

        public Criteria andCheckPersonIsNotNull() {
            addCriterion("check_person is not null");
            return (Criteria) this;
        }

        public Criteria andCheckPersonEqualTo(String value) {
            addCriterion("check_person =", value, "checkPerson");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNotEqualTo(String value) {
            addCriterion("check_person <>", value, "checkPerson");
            return (Criteria) this;
        }

        public Criteria andCheckPersonGreaterThan(String value) {
            addCriterion("check_person >", value, "checkPerson");
            return (Criteria) this;
        }

        public Criteria andCheckPersonGreaterThanOrEqualTo(String value) {
            addCriterion("check_person >=", value, "checkPerson");
            return (Criteria) this;
        }

        public Criteria andCheckPersonLessThan(String value) {
            addCriterion("check_person <", value, "checkPerson");
            return (Criteria) this;
        }

        public Criteria andCheckPersonLessThanOrEqualTo(String value) {
            addCriterion("check_person <=", value, "checkPerson");
            return (Criteria) this;
        }

        public Criteria andCheckPersonLike(String value) {
            addCriterion("check_person like", value, "checkPerson");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNotLike(String value) {
            addCriterion("check_person not like", value, "checkPerson");
            return (Criteria) this;
        }

        public Criteria andCheckPersonIn(List<String> values) {
            addCriterion("check_person in", values, "checkPerson");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNotIn(List<String> values) {
            addCriterion("check_person not in", values, "checkPerson");
            return (Criteria) this;
        }

        public Criteria andCheckPersonBetween(String value1, String value2) {
            addCriterion("check_person between", value1, value2, "checkPerson");
            return (Criteria) this;
        }

        public Criteria andCheckPersonNotBetween(String value1, String value2) {
            addCriterion("check_person not between", value1, value2, "checkPerson");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("check_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("check_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(Date value) {
            addCriterion("check_time =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(Date value) {
            addCriterion("check_time <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(Date value) {
            addCriterion("check_time >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("check_time >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(Date value) {
            addCriterion("check_time <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("check_time <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<Date> values) {
            addCriterion("check_time in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<Date> values) {
            addCriterion("check_time not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(Date value1, Date value2) {
            addCriterion("check_time between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("check_time not between", value1, value2, "checkTime");
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