package com.uspring.sdsmesplus.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProdMatFpCodeLogPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProdMatFpCodeLogPOExample() {
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

        public Criteria andMfpclIdIsNull() {
            addCriterion("mfpcl_id is null");
            return (Criteria) this;
        }

        public Criteria andMfpclIdIsNotNull() {
            addCriterion("mfpcl_id is not null");
            return (Criteria) this;
        }

        public Criteria andMfpclIdEqualTo(Integer value) {
            addCriterion("mfpcl_id =", value, "mfpclId");
            return (Criteria) this;
        }

        public Criteria andMfpclIdNotEqualTo(Integer value) {
            addCriterion("mfpcl_id <>", value, "mfpclId");
            return (Criteria) this;
        }

        public Criteria andMfpclIdGreaterThan(Integer value) {
            addCriterion("mfpcl_id >", value, "mfpclId");
            return (Criteria) this;
        }

        public Criteria andMfpclIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mfpcl_id >=", value, "mfpclId");
            return (Criteria) this;
        }

        public Criteria andMfpclIdLessThan(Integer value) {
            addCriterion("mfpcl_id <", value, "mfpclId");
            return (Criteria) this;
        }

        public Criteria andMfpclIdLessThanOrEqualTo(Integer value) {
            addCriterion("mfpcl_id <=", value, "mfpclId");
            return (Criteria) this;
        }

        public Criteria andMfpclIdIn(List<Integer> values) {
            addCriterion("mfpcl_id in", values, "mfpclId");
            return (Criteria) this;
        }

        public Criteria andMfpclIdNotIn(List<Integer> values) {
            addCriterion("mfpcl_id not in", values, "mfpclId");
            return (Criteria) this;
        }

        public Criteria andMfpclIdBetween(Integer value1, Integer value2) {
            addCriterion("mfpcl_id between", value1, value2, "mfpclId");
            return (Criteria) this;
        }

        public Criteria andMfpclIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mfpcl_id not between", value1, value2, "mfpclId");
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

        public Criteria andProdFpcodeIsNull() {
            addCriterion("prod_fpcode is null");
            return (Criteria) this;
        }

        public Criteria andProdFpcodeIsNotNull() {
            addCriterion("prod_fpcode is not null");
            return (Criteria) this;
        }

        public Criteria andProdFpcodeEqualTo(String value) {
            addCriterion("prod_fpcode =", value, "prodFpcode");
            return (Criteria) this;
        }

        public Criteria andProdFpcodeNotEqualTo(String value) {
            addCriterion("prod_fpcode <>", value, "prodFpcode");
            return (Criteria) this;
        }

        public Criteria andProdFpcodeGreaterThan(String value) {
            addCriterion("prod_fpcode >", value, "prodFpcode");
            return (Criteria) this;
        }

        public Criteria andProdFpcodeGreaterThanOrEqualTo(String value) {
            addCriterion("prod_fpcode >=", value, "prodFpcode");
            return (Criteria) this;
        }

        public Criteria andProdFpcodeLessThan(String value) {
            addCriterion("prod_fpcode <", value, "prodFpcode");
            return (Criteria) this;
        }

        public Criteria andProdFpcodeLessThanOrEqualTo(String value) {
            addCriterion("prod_fpcode <=", value, "prodFpcode");
            return (Criteria) this;
        }

        public Criteria andProdFpcodeLike(String value) {
            addCriterion("prod_fpcode like", value, "prodFpcode");
            return (Criteria) this;
        }

        public Criteria andProdFpcodeNotLike(String value) {
            addCriterion("prod_fpcode not like", value, "prodFpcode");
            return (Criteria) this;
        }

        public Criteria andProdFpcodeIn(List<String> values) {
            addCriterion("prod_fpcode in", values, "prodFpcode");
            return (Criteria) this;
        }

        public Criteria andProdFpcodeNotIn(List<String> values) {
            addCriterion("prod_fpcode not in", values, "prodFpcode");
            return (Criteria) this;
        }

        public Criteria andProdFpcodeBetween(String value1, String value2) {
            addCriterion("prod_fpcode between", value1, value2, "prodFpcode");
            return (Criteria) this;
        }

        public Criteria andProdFpcodeNotBetween(String value1, String value2) {
            addCriterion("prod_fpcode not between", value1, value2, "prodFpcode");
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

        public Criteria andCodeValueIsNull() {
            addCriterion("code_value is null");
            return (Criteria) this;
        }

        public Criteria andCodeValueIsNotNull() {
            addCriterion("code_value is not null");
            return (Criteria) this;
        }

        public Criteria andCodeValueEqualTo(String value) {
            addCriterion("code_value =", value, "codeValue");
            return (Criteria) this;
        }

        public Criteria andCodeValueNotEqualTo(String value) {
            addCriterion("code_value <>", value, "codeValue");
            return (Criteria) this;
        }

        public Criteria andCodeValueGreaterThan(String value) {
            addCriterion("code_value >", value, "codeValue");
            return (Criteria) this;
        }

        public Criteria andCodeValueGreaterThanOrEqualTo(String value) {
            addCriterion("code_value >=", value, "codeValue");
            return (Criteria) this;
        }

        public Criteria andCodeValueLessThan(String value) {
            addCriterion("code_value <", value, "codeValue");
            return (Criteria) this;
        }

        public Criteria andCodeValueLessThanOrEqualTo(String value) {
            addCriterion("code_value <=", value, "codeValue");
            return (Criteria) this;
        }

        public Criteria andCodeValueLike(String value) {
            addCriterion("code_value like", value, "codeValue");
            return (Criteria) this;
        }

        public Criteria andCodeValueNotLike(String value) {
            addCriterion("code_value not like", value, "codeValue");
            return (Criteria) this;
        }

        public Criteria andCodeValueIn(List<String> values) {
            addCriterion("code_value in", values, "codeValue");
            return (Criteria) this;
        }

        public Criteria andCodeValueNotIn(List<String> values) {
            addCriterion("code_value not in", values, "codeValue");
            return (Criteria) this;
        }

        public Criteria andCodeValueBetween(String value1, String value2) {
            addCriterion("code_value between", value1, value2, "codeValue");
            return (Criteria) this;
        }

        public Criteria andCodeValueNotBetween(String value1, String value2) {
            addCriterion("code_value not between", value1, value2, "codeValue");
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