package com.uspring.sdsmesplus.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class sysMatFpCodeRulePOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public sysMatFpCodeRulePOExample() {
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

        public Criteria andMfpcIdIsNull() {
            addCriterion("mfpc_id is null");
            return (Criteria) this;
        }

        public Criteria andMfpcIdIsNotNull() {
            addCriterion("mfpc_id is not null");
            return (Criteria) this;
        }

        public Criteria andMfpcIdEqualTo(Integer value) {
            addCriterion("mfpc_id =", value, "mfpcId");
            return (Criteria) this;
        }

        public Criteria andMfpcIdNotEqualTo(Integer value) {
            addCriterion("mfpc_id <>", value, "mfpcId");
            return (Criteria) this;
        }

        public Criteria andMfpcIdGreaterThan(Integer value) {
            addCriterion("mfpc_id >", value, "mfpcId");
            return (Criteria) this;
        }

        public Criteria andMfpcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mfpc_id >=", value, "mfpcId");
            return (Criteria) this;
        }

        public Criteria andMfpcIdLessThan(Integer value) {
            addCriterion("mfpc_id <", value, "mfpcId");
            return (Criteria) this;
        }

        public Criteria andMfpcIdLessThanOrEqualTo(Integer value) {
            addCriterion("mfpc_id <=", value, "mfpcId");
            return (Criteria) this;
        }

        public Criteria andMfpcIdIn(List<Integer> values) {
            addCriterion("mfpc_id in", values, "mfpcId");
            return (Criteria) this;
        }

        public Criteria andMfpcIdNotIn(List<Integer> values) {
            addCriterion("mfpc_id not in", values, "mfpcId");
            return (Criteria) this;
        }

        public Criteria andMfpcIdBetween(Integer value1, Integer value2) {
            addCriterion("mfpc_id between", value1, value2, "mfpcId");
            return (Criteria) this;
        }

        public Criteria andMfpcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mfpc_id not between", value1, value2, "mfpcId");
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

        public Criteria andCodeNameIsNull() {
            addCriterion("code_name is null");
            return (Criteria) this;
        }

        public Criteria andCodeNameIsNotNull() {
            addCriterion("code_name is not null");
            return (Criteria) this;
        }

        public Criteria andCodeNameEqualTo(String value) {
            addCriterion("code_name =", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameNotEqualTo(String value) {
            addCriterion("code_name <>", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameGreaterThan(String value) {
            addCriterion("code_name >", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameGreaterThanOrEqualTo(String value) {
            addCriterion("code_name >=", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameLessThan(String value) {
            addCriterion("code_name <", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameLessThanOrEqualTo(String value) {
            addCriterion("code_name <=", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameLike(String value) {
            addCriterion("code_name like", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameNotLike(String value) {
            addCriterion("code_name not like", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameIn(List<String> values) {
            addCriterion("code_name in", values, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameNotIn(List<String> values) {
            addCriterion("code_name not in", values, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameBetween(String value1, String value2) {
            addCriterion("code_name between", value1, value2, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameNotBetween(String value1, String value2) {
            addCriterion("code_name not between", value1, value2, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeLengthIsNull() {
            addCriterion("code_length is null");
            return (Criteria) this;
        }

        public Criteria andCodeLengthIsNotNull() {
            addCriterion("code_length is not null");
            return (Criteria) this;
        }

        public Criteria andCodeLengthEqualTo(Integer value) {
            addCriterion("code_length =", value, "codeLength");
            return (Criteria) this;
        }

        public Criteria andCodeLengthNotEqualTo(Integer value) {
            addCriterion("code_length <>", value, "codeLength");
            return (Criteria) this;
        }

        public Criteria andCodeLengthGreaterThan(Integer value) {
            addCriterion("code_length >", value, "codeLength");
            return (Criteria) this;
        }

        public Criteria andCodeLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("code_length >=", value, "codeLength");
            return (Criteria) this;
        }

        public Criteria andCodeLengthLessThan(Integer value) {
            addCriterion("code_length <", value, "codeLength");
            return (Criteria) this;
        }

        public Criteria andCodeLengthLessThanOrEqualTo(Integer value) {
            addCriterion("code_length <=", value, "codeLength");
            return (Criteria) this;
        }

        public Criteria andCodeLengthIn(List<Integer> values) {
            addCriterion("code_length in", values, "codeLength");
            return (Criteria) this;
        }

        public Criteria andCodeLengthNotIn(List<Integer> values) {
            addCriterion("code_length not in", values, "codeLength");
            return (Criteria) this;
        }

        public Criteria andCodeLengthBetween(Integer value1, Integer value2) {
            addCriterion("code_length between", value1, value2, "codeLength");
            return (Criteria) this;
        }

        public Criteria andCodeLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("code_length not between", value1, value2, "codeLength");
            return (Criteria) this;
        }

        public Criteria andCodeStartIsNull() {
            addCriterion("code_start is null");
            return (Criteria) this;
        }

        public Criteria andCodeStartIsNotNull() {
            addCriterion("code_start is not null");
            return (Criteria) this;
        }

        public Criteria andCodeStartEqualTo(String value) {
            addCriterion("code_start =", value, "codeStart");
            return (Criteria) this;
        }

        public Criteria andCodeStartNotEqualTo(String value) {
            addCriterion("code_start <>", value, "codeStart");
            return (Criteria) this;
        }

        public Criteria andCodeStartGreaterThan(String value) {
            addCriterion("code_start >", value, "codeStart");
            return (Criteria) this;
        }

        public Criteria andCodeStartGreaterThanOrEqualTo(String value) {
            addCriterion("code_start >=", value, "codeStart");
            return (Criteria) this;
        }

        public Criteria andCodeStartLessThan(String value) {
            addCriterion("code_start <", value, "codeStart");
            return (Criteria) this;
        }

        public Criteria andCodeStartLessThanOrEqualTo(String value) {
            addCriterion("code_start <=", value, "codeStart");
            return (Criteria) this;
        }

        public Criteria andCodeStartLike(String value) {
            addCriterion("code_start like", value, "codeStart");
            return (Criteria) this;
        }

        public Criteria andCodeStartNotLike(String value) {
            addCriterion("code_start not like", value, "codeStart");
            return (Criteria) this;
        }

        public Criteria andCodeStartIn(List<String> values) {
            addCriterion("code_start in", values, "codeStart");
            return (Criteria) this;
        }

        public Criteria andCodeStartNotIn(List<String> values) {
            addCriterion("code_start not in", values, "codeStart");
            return (Criteria) this;
        }

        public Criteria andCodeStartBetween(String value1, String value2) {
            addCriterion("code_start between", value1, value2, "codeStart");
            return (Criteria) this;
        }

        public Criteria andCodeStartNotBetween(String value1, String value2) {
            addCriterion("code_start not between", value1, value2, "codeStart");
            return (Criteria) this;
        }

        public Criteria andCodeRegexIsNull() {
            addCriterion("code_regex is null");
            return (Criteria) this;
        }

        public Criteria andCodeRegexIsNotNull() {
            addCriterion("code_regex is not null");
            return (Criteria) this;
        }

        public Criteria andCodeRegexEqualTo(String value) {
            addCriterion("code_regex =", value, "codeRegex");
            return (Criteria) this;
        }

        public Criteria andCodeRegexNotEqualTo(String value) {
            addCriterion("code_regex <>", value, "codeRegex");
            return (Criteria) this;
        }

        public Criteria andCodeRegexGreaterThan(String value) {
            addCriterion("code_regex >", value, "codeRegex");
            return (Criteria) this;
        }

        public Criteria andCodeRegexGreaterThanOrEqualTo(String value) {
            addCriterion("code_regex >=", value, "codeRegex");
            return (Criteria) this;
        }

        public Criteria andCodeRegexLessThan(String value) {
            addCriterion("code_regex <", value, "codeRegex");
            return (Criteria) this;
        }

        public Criteria andCodeRegexLessThanOrEqualTo(String value) {
            addCriterion("code_regex <=", value, "codeRegex");
            return (Criteria) this;
        }

        public Criteria andCodeRegexLike(String value) {
            addCriterion("code_regex like", value, "codeRegex");
            return (Criteria) this;
        }

        public Criteria andCodeRegexNotLike(String value) {
            addCriterion("code_regex not like", value, "codeRegex");
            return (Criteria) this;
        }

        public Criteria andCodeRegexIn(List<String> values) {
            addCriterion("code_regex in", values, "codeRegex");
            return (Criteria) this;
        }

        public Criteria andCodeRegexNotIn(List<String> values) {
            addCriterion("code_regex not in", values, "codeRegex");
            return (Criteria) this;
        }

        public Criteria andCodeRegexBetween(String value1, String value2) {
            addCriterion("code_regex between", value1, value2, "codeRegex");
            return (Criteria) this;
        }

        public Criteria andCodeRegexNotBetween(String value1, String value2) {
            addCriterion("code_regex not between", value1, value2, "codeRegex");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNull() {
            addCriterion("is_active is null");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNotNull() {
            addCriterion("is_active is not null");
            return (Criteria) this;
        }

        public Criteria andIsActiveEqualTo(Boolean value) {
            addCriterion("is_active =", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotEqualTo(Boolean value) {
            addCriterion("is_active <>", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThan(Boolean value) {
            addCriterion("is_active >", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_active >=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThan(Boolean value) {
            addCriterion("is_active <", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThanOrEqualTo(Boolean value) {
            addCriterion("is_active <=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveIn(List<Boolean> values) {
            addCriterion("is_active in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotIn(List<Boolean> values) {
            addCriterion("is_active not in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveBetween(Boolean value1, Boolean value2) {
            addCriterion("is_active between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_active not between", value1, value2, "isActive");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Boolean value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Boolean value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Boolean value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Boolean value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Boolean> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Boolean> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
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