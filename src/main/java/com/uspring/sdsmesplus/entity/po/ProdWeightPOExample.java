package com.uspring.sdsmesplus.entity.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProdWeightPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProdWeightPOExample() {
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

        public Criteria andPwlIdIsNull() {
            addCriterion("pwl_id is null");
            return (Criteria) this;
        }

        public Criteria andPwlIdIsNotNull() {
            addCriterion("pwl_id is not null");
            return (Criteria) this;
        }

        public Criteria andPwlIdEqualTo(Integer value) {
            addCriterion("pwl_id =", value, "pwlId");
            return (Criteria) this;
        }

        public Criteria andPwlIdNotEqualTo(Integer value) {
            addCriterion("pwl_id <>", value, "pwlId");
            return (Criteria) this;
        }

        public Criteria andPwlIdGreaterThan(Integer value) {
            addCriterion("pwl_id >", value, "pwlId");
            return (Criteria) this;
        }

        public Criteria andPwlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pwl_id >=", value, "pwlId");
            return (Criteria) this;
        }

        public Criteria andPwlIdLessThan(Integer value) {
            addCriterion("pwl_id <", value, "pwlId");
            return (Criteria) this;
        }

        public Criteria andPwlIdLessThanOrEqualTo(Integer value) {
            addCriterion("pwl_id <=", value, "pwlId");
            return (Criteria) this;
        }

        public Criteria andPwlIdIn(List<Integer> values) {
            addCriterion("pwl_id in", values, "pwlId");
            return (Criteria) this;
        }

        public Criteria andPwlIdNotIn(List<Integer> values) {
            addCriterion("pwl_id not in", values, "pwlId");
            return (Criteria) this;
        }

        public Criteria andPwlIdBetween(Integer value1, Integer value2) {
            addCriterion("pwl_id between", value1, value2, "pwlId");
            return (Criteria) this;
        }

        public Criteria andPwlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pwl_id not between", value1, value2, "pwlId");
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

        public Criteria andProdRfidIsNull() {
            addCriterion("prod_rfid is null");
            return (Criteria) this;
        }

        public Criteria andProdRfidIsNotNull() {
            addCriterion("prod_rfid is not null");
            return (Criteria) this;
        }

        public Criteria andProdRfidEqualTo(String value) {
            addCriterion("prod_rfid =", value, "prodRfid");
            return (Criteria) this;
        }

        public Criteria andProdRfidNotEqualTo(String value) {
            addCriterion("prod_rfid <>", value, "prodRfid");
            return (Criteria) this;
        }

        public Criteria andProdRfidGreaterThan(String value) {
            addCriterion("prod_rfid >", value, "prodRfid");
            return (Criteria) this;
        }

        public Criteria andProdRfidGreaterThanOrEqualTo(String value) {
            addCriterion("prod_rfid >=", value, "prodRfid");
            return (Criteria) this;
        }

        public Criteria andProdRfidLessThan(String value) {
            addCriterion("prod_rfid <", value, "prodRfid");
            return (Criteria) this;
        }

        public Criteria andProdRfidLessThanOrEqualTo(String value) {
            addCriterion("prod_rfid <=", value, "prodRfid");
            return (Criteria) this;
        }

        public Criteria andProdRfidLike(String value) {
            addCriterion("prod_rfid like", value, "prodRfid");
            return (Criteria) this;
        }

        public Criteria andProdRfidNotLike(String value) {
            addCriterion("prod_rfid not like", value, "prodRfid");
            return (Criteria) this;
        }

        public Criteria andProdRfidIn(List<String> values) {
            addCriterion("prod_rfid in", values, "prodRfid");
            return (Criteria) this;
        }

        public Criteria andProdRfidNotIn(List<String> values) {
            addCriterion("prod_rfid not in", values, "prodRfid");
            return (Criteria) this;
        }

        public Criteria andProdRfidBetween(String value1, String value2) {
            addCriterion("prod_rfid between", value1, value2, "prodRfid");
            return (Criteria) this;
        }

        public Criteria andProdRfidNotBetween(String value1, String value2) {
            addCriterion("prod_rfid not between", value1, value2, "prodRfid");
            return (Criteria) this;
        }

        public Criteria andProdWeightIsNull() {
            addCriterion("prod_weight is null");
            return (Criteria) this;
        }

        public Criteria andProdWeightIsNotNull() {
            addCriterion("prod_weight is not null");
            return (Criteria) this;
        }

        public Criteria andProdWeightEqualTo(BigDecimal value) {
            addCriterion("prod_weight =", value, "prodWeight");
            return (Criteria) this;
        }

        public Criteria andProdWeightNotEqualTo(BigDecimal value) {
            addCriterion("prod_weight <>", value, "prodWeight");
            return (Criteria) this;
        }

        public Criteria andProdWeightGreaterThan(BigDecimal value) {
            addCriterion("prod_weight >", value, "prodWeight");
            return (Criteria) this;
        }

        public Criteria andProdWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("prod_weight >=", value, "prodWeight");
            return (Criteria) this;
        }

        public Criteria andProdWeightLessThan(BigDecimal value) {
            addCriterion("prod_weight <", value, "prodWeight");
            return (Criteria) this;
        }

        public Criteria andProdWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("prod_weight <=", value, "prodWeight");
            return (Criteria) this;
        }

        public Criteria andProdWeightIn(List<BigDecimal> values) {
            addCriterion("prod_weight in", values, "prodWeight");
            return (Criteria) this;
        }

        public Criteria andProdWeightNotIn(List<BigDecimal> values) {
            addCriterion("prod_weight not in", values, "prodWeight");
            return (Criteria) this;
        }

        public Criteria andProdWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("prod_weight between", value1, value2, "prodWeight");
            return (Criteria) this;
        }

        public Criteria andProdWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("prod_weight not between", value1, value2, "prodWeight");
            return (Criteria) this;
        }

        public Criteria andProdTimeIsNull() {
            addCriterion("prod_time is null");
            return (Criteria) this;
        }

        public Criteria andProdTimeIsNotNull() {
            addCriterion("prod_time is not null");
            return (Criteria) this;
        }

        public Criteria andProdTimeEqualTo(Date value) {
            addCriterion("prod_time =", value, "prodTime");
            return (Criteria) this;
        }

        public Criteria andProdTimeNotEqualTo(Date value) {
            addCriterion("prod_time <>", value, "prodTime");
            return (Criteria) this;
        }

        public Criteria andProdTimeGreaterThan(Date value) {
            addCriterion("prod_time >", value, "prodTime");
            return (Criteria) this;
        }

        public Criteria andProdTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("prod_time >=", value, "prodTime");
            return (Criteria) this;
        }

        public Criteria andProdTimeLessThan(Date value) {
            addCriterion("prod_time <", value, "prodTime");
            return (Criteria) this;
        }

        public Criteria andProdTimeLessThanOrEqualTo(Date value) {
            addCriterion("prod_time <=", value, "prodTime");
            return (Criteria) this;
        }

        public Criteria andProdTimeIn(List<Date> values) {
            addCriterion("prod_time in", values, "prodTime");
            return (Criteria) this;
        }

        public Criteria andProdTimeNotIn(List<Date> values) {
            addCriterion("prod_time not in", values, "prodTime");
            return (Criteria) this;
        }

        public Criteria andProdTimeBetween(Date value1, Date value2) {
            addCriterion("prod_time between", value1, value2, "prodTime");
            return (Criteria) this;
        }

        public Criteria andProdTimeNotBetween(Date value1, Date value2) {
            addCriterion("prod_time not between", value1, value2, "prodTime");
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