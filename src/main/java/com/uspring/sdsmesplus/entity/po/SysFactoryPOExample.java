package com.uspring.sdsmesplus.entity.po;

import java.util.ArrayList;
import java.util.List;

public class SysFactoryPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFactoryPOExample() {
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

        public Criteria andFcNameIsNull() {
            addCriterion("fc_name is null");
            return (Criteria) this;
        }

        public Criteria andFcNameIsNotNull() {
            addCriterion("fc_name is not null");
            return (Criteria) this;
        }

        public Criteria andFcNameEqualTo(String value) {
            addCriterion("fc_name =", value, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcNameNotEqualTo(String value) {
            addCriterion("fc_name <>", value, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcNameGreaterThan(String value) {
            addCriterion("fc_name >", value, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcNameGreaterThanOrEqualTo(String value) {
            addCriterion("fc_name >=", value, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcNameLessThan(String value) {
            addCriterion("fc_name <", value, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcNameLessThanOrEqualTo(String value) {
            addCriterion("fc_name <=", value, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcNameLike(String value) {
            addCriterion("fc_name like", value, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcNameNotLike(String value) {
            addCriterion("fc_name not like", value, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcNameIn(List<String> values) {
            addCriterion("fc_name in", values, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcNameNotIn(List<String> values) {
            addCriterion("fc_name not in", values, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcNameBetween(String value1, String value2) {
            addCriterion("fc_name between", value1, value2, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcNameNotBetween(String value1, String value2) {
            addCriterion("fc_name not between", value1, value2, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcAddressIsNull() {
            addCriterion("fc_address is null");
            return (Criteria) this;
        }

        public Criteria andFcAddressIsNotNull() {
            addCriterion("fc_address is not null");
            return (Criteria) this;
        }

        public Criteria andFcAddressEqualTo(String value) {
            addCriterion("fc_address =", value, "fcAddress");
            return (Criteria) this;
        }

        public Criteria andFcAddressNotEqualTo(String value) {
            addCriterion("fc_address <>", value, "fcAddress");
            return (Criteria) this;
        }

        public Criteria andFcAddressGreaterThan(String value) {
            addCriterion("fc_address >", value, "fcAddress");
            return (Criteria) this;
        }

        public Criteria andFcAddressGreaterThanOrEqualTo(String value) {
            addCriterion("fc_address >=", value, "fcAddress");
            return (Criteria) this;
        }

        public Criteria andFcAddressLessThan(String value) {
            addCriterion("fc_address <", value, "fcAddress");
            return (Criteria) this;
        }

        public Criteria andFcAddressLessThanOrEqualTo(String value) {
            addCriterion("fc_address <=", value, "fcAddress");
            return (Criteria) this;
        }

        public Criteria andFcAddressLike(String value) {
            addCriterion("fc_address like", value, "fcAddress");
            return (Criteria) this;
        }

        public Criteria andFcAddressNotLike(String value) {
            addCriterion("fc_address not like", value, "fcAddress");
            return (Criteria) this;
        }

        public Criteria andFcAddressIn(List<String> values) {
            addCriterion("fc_address in", values, "fcAddress");
            return (Criteria) this;
        }

        public Criteria andFcAddressNotIn(List<String> values) {
            addCriterion("fc_address not in", values, "fcAddress");
            return (Criteria) this;
        }

        public Criteria andFcAddressBetween(String value1, String value2) {
            addCriterion("fc_address between", value1, value2, "fcAddress");
            return (Criteria) this;
        }

        public Criteria andFcAddressNotBetween(String value1, String value2) {
            addCriterion("fc_address not between", value1, value2, "fcAddress");
            return (Criteria) this;
        }

        public Criteria andFcDomainIsNull() {
            addCriterion("fc_domain is null");
            return (Criteria) this;
        }

        public Criteria andFcDomainIsNotNull() {
            addCriterion("fc_domain is not null");
            return (Criteria) this;
        }

        public Criteria andFcDomainEqualTo(String value) {
            addCriterion("fc_domain =", value, "fcDomain");
            return (Criteria) this;
        }

        public Criteria andFcDomainNotEqualTo(String value) {
            addCriterion("fc_domain <>", value, "fcDomain");
            return (Criteria) this;
        }

        public Criteria andFcDomainGreaterThan(String value) {
            addCriterion("fc_domain >", value, "fcDomain");
            return (Criteria) this;
        }

        public Criteria andFcDomainGreaterThanOrEqualTo(String value) {
            addCriterion("fc_domain >=", value, "fcDomain");
            return (Criteria) this;
        }

        public Criteria andFcDomainLessThan(String value) {
            addCriterion("fc_domain <", value, "fcDomain");
            return (Criteria) this;
        }

        public Criteria andFcDomainLessThanOrEqualTo(String value) {
            addCriterion("fc_domain <=", value, "fcDomain");
            return (Criteria) this;
        }

        public Criteria andFcDomainLike(String value) {
            addCriterion("fc_domain like", value, "fcDomain");
            return (Criteria) this;
        }

        public Criteria andFcDomainNotLike(String value) {
            addCriterion("fc_domain not like", value, "fcDomain");
            return (Criteria) this;
        }

        public Criteria andFcDomainIn(List<String> values) {
            addCriterion("fc_domain in", values, "fcDomain");
            return (Criteria) this;
        }

        public Criteria andFcDomainNotIn(List<String> values) {
            addCriterion("fc_domain not in", values, "fcDomain");
            return (Criteria) this;
        }

        public Criteria andFcDomainBetween(String value1, String value2) {
            addCriterion("fc_domain between", value1, value2, "fcDomain");
            return (Criteria) this;
        }

        public Criteria andFcDomainNotBetween(String value1, String value2) {
            addCriterion("fc_domain not between", value1, value2, "fcDomain");
            return (Criteria) this;
        }

        public Criteria andFcSdsIdIsNull() {
            addCriterion("fc_sds_id is null");
            return (Criteria) this;
        }

        public Criteria andFcSdsIdIsNotNull() {
            addCriterion("fc_sds_id is not null");
            return (Criteria) this;
        }

        public Criteria andFcSdsIdEqualTo(String value) {
            addCriterion("fc_sds_id =", value, "fcSdsId");
            return (Criteria) this;
        }

        public Criteria andFcSdsIdNotEqualTo(String value) {
            addCriterion("fc_sds_id <>", value, "fcSdsId");
            return (Criteria) this;
        }

        public Criteria andFcSdsIdGreaterThan(String value) {
            addCriterion("fc_sds_id >", value, "fcSdsId");
            return (Criteria) this;
        }

        public Criteria andFcSdsIdGreaterThanOrEqualTo(String value) {
            addCriterion("fc_sds_id >=", value, "fcSdsId");
            return (Criteria) this;
        }

        public Criteria andFcSdsIdLessThan(String value) {
            addCriterion("fc_sds_id <", value, "fcSdsId");
            return (Criteria) this;
        }

        public Criteria andFcSdsIdLessThanOrEqualTo(String value) {
            addCriterion("fc_sds_id <=", value, "fcSdsId");
            return (Criteria) this;
        }

        public Criteria andFcSdsIdLike(String value) {
            addCriterion("fc_sds_id like", value, "fcSdsId");
            return (Criteria) this;
        }

        public Criteria andFcSdsIdNotLike(String value) {
            addCriterion("fc_sds_id not like", value, "fcSdsId");
            return (Criteria) this;
        }

        public Criteria andFcSdsIdIn(List<String> values) {
            addCriterion("fc_sds_id in", values, "fcSdsId");
            return (Criteria) this;
        }

        public Criteria andFcSdsIdNotIn(List<String> values) {
            addCriterion("fc_sds_id not in", values, "fcSdsId");
            return (Criteria) this;
        }

        public Criteria andFcSdsIdBetween(String value1, String value2) {
            addCriterion("fc_sds_id between", value1, value2, "fcSdsId");
            return (Criteria) this;
        }

        public Criteria andFcSdsIdNotBetween(String value1, String value2) {
            addCriterion("fc_sds_id not between", value1, value2, "fcSdsId");
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