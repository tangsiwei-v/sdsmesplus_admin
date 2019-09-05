package com.uspring.sdsmesplus.entity.po;

import java.util.ArrayList;
import java.util.List;

public class DictTypePOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictTypePOExample() {
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

        public Criteria andDtCodeIsNull() {
            addCriterion("dt_code is null");
            return (Criteria) this;
        }

        public Criteria andDtCodeIsNotNull() {
            addCriterion("dt_code is not null");
            return (Criteria) this;
        }

        public Criteria andDtCodeEqualTo(String value) {
            addCriterion("dt_code =", value, "dtCode");
            return (Criteria) this;
        }

        public Criteria andDtCodeNotEqualTo(String value) {
            addCriterion("dt_code <>", value, "dtCode");
            return (Criteria) this;
        }

        public Criteria andDtCodeGreaterThan(String value) {
            addCriterion("dt_code >", value, "dtCode");
            return (Criteria) this;
        }

        public Criteria andDtCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dt_code >=", value, "dtCode");
            return (Criteria) this;
        }

        public Criteria andDtCodeLessThan(String value) {
            addCriterion("dt_code <", value, "dtCode");
            return (Criteria) this;
        }

        public Criteria andDtCodeLessThanOrEqualTo(String value) {
            addCriterion("dt_code <=", value, "dtCode");
            return (Criteria) this;
        }

        public Criteria andDtCodeLike(String value) {
            addCriterion("dt_code like", value, "dtCode");
            return (Criteria) this;
        }

        public Criteria andDtCodeNotLike(String value) {
            addCriterion("dt_code not like", value, "dtCode");
            return (Criteria) this;
        }

        public Criteria andDtCodeIn(List<String> values) {
            addCriterion("dt_code in", values, "dtCode");
            return (Criteria) this;
        }

        public Criteria andDtCodeNotIn(List<String> values) {
            addCriterion("dt_code not in", values, "dtCode");
            return (Criteria) this;
        }

        public Criteria andDtCodeBetween(String value1, String value2) {
            addCriterion("dt_code between", value1, value2, "dtCode");
            return (Criteria) this;
        }

        public Criteria andDtCodeNotBetween(String value1, String value2) {
            addCriterion("dt_code not between", value1, value2, "dtCode");
            return (Criteria) this;
        }

        public Criteria andDtNameIsNull() {
            addCriterion("dt_name is null");
            return (Criteria) this;
        }

        public Criteria andDtNameIsNotNull() {
            addCriterion("dt_name is not null");
            return (Criteria) this;
        }

        public Criteria andDtNameEqualTo(String value) {
            addCriterion("dt_name =", value, "dtName");
            return (Criteria) this;
        }

        public Criteria andDtNameNotEqualTo(String value) {
            addCriterion("dt_name <>", value, "dtName");
            return (Criteria) this;
        }

        public Criteria andDtNameGreaterThan(String value) {
            addCriterion("dt_name >", value, "dtName");
            return (Criteria) this;
        }

        public Criteria andDtNameGreaterThanOrEqualTo(String value) {
            addCriterion("dt_name >=", value, "dtName");
            return (Criteria) this;
        }

        public Criteria andDtNameLessThan(String value) {
            addCriterion("dt_name <", value, "dtName");
            return (Criteria) this;
        }

        public Criteria andDtNameLessThanOrEqualTo(String value) {
            addCriterion("dt_name <=", value, "dtName");
            return (Criteria) this;
        }

        public Criteria andDtNameLike(String value) {
            addCriterion("dt_name like", value, "dtName");
            return (Criteria) this;
        }

        public Criteria andDtNameNotLike(String value) {
            addCriterion("dt_name not like", value, "dtName");
            return (Criteria) this;
        }

        public Criteria andDtNameIn(List<String> values) {
            addCriterion("dt_name in", values, "dtName");
            return (Criteria) this;
        }

        public Criteria andDtNameNotIn(List<String> values) {
            addCriterion("dt_name not in", values, "dtName");
            return (Criteria) this;
        }

        public Criteria andDtNameBetween(String value1, String value2) {
            addCriterion("dt_name between", value1, value2, "dtName");
            return (Criteria) this;
        }

        public Criteria andDtNameNotBetween(String value1, String value2) {
            addCriterion("dt_name not between", value1, value2, "dtName");
            return (Criteria) this;
        }

        public Criteria andHasChildIsNull() {
            addCriterion("has_child is null");
            return (Criteria) this;
        }

        public Criteria andHasChildIsNotNull() {
            addCriterion("has_child is not null");
            return (Criteria) this;
        }

        public Criteria andHasChildEqualTo(Boolean value) {
            addCriterion("has_child =", value, "hasChild");
            return (Criteria) this;
        }

        public Criteria andHasChildNotEqualTo(Boolean value) {
            addCriterion("has_child <>", value, "hasChild");
            return (Criteria) this;
        }

        public Criteria andHasChildGreaterThan(Boolean value) {
            addCriterion("has_child >", value, "hasChild");
            return (Criteria) this;
        }

        public Criteria andHasChildGreaterThanOrEqualTo(Boolean value) {
            addCriterion("has_child >=", value, "hasChild");
            return (Criteria) this;
        }

        public Criteria andHasChildLessThan(Boolean value) {
            addCriterion("has_child <", value, "hasChild");
            return (Criteria) this;
        }

        public Criteria andHasChildLessThanOrEqualTo(Boolean value) {
            addCriterion("has_child <=", value, "hasChild");
            return (Criteria) this;
        }

        public Criteria andHasChildIn(List<Boolean> values) {
            addCriterion("has_child in", values, "hasChild");
            return (Criteria) this;
        }

        public Criteria andHasChildNotIn(List<Boolean> values) {
            addCriterion("has_child not in", values, "hasChild");
            return (Criteria) this;
        }

        public Criteria andHasChildBetween(Boolean value1, Boolean value2) {
            addCriterion("has_child between", value1, value2, "hasChild");
            return (Criteria) this;
        }

        public Criteria andHasChildNotBetween(Boolean value1, Boolean value2) {
            addCriterion("has_child not between", value1, value2, "hasChild");
            return (Criteria) this;
        }

        public Criteria andParentCodeIsNull() {
            addCriterion("parent_code is null");
            return (Criteria) this;
        }

        public Criteria andParentCodeIsNotNull() {
            addCriterion("parent_code is not null");
            return (Criteria) this;
        }

        public Criteria andParentCodeEqualTo(String value) {
            addCriterion("parent_code =", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotEqualTo(String value) {
            addCriterion("parent_code <>", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeGreaterThan(String value) {
            addCriterion("parent_code >", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("parent_code >=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLessThan(String value) {
            addCriterion("parent_code <", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLessThanOrEqualTo(String value) {
            addCriterion("parent_code <=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLike(String value) {
            addCriterion("parent_code like", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotLike(String value) {
            addCriterion("parent_code not like", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeIn(List<String> values) {
            addCriterion("parent_code in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotIn(List<String> values) {
            addCriterion("parent_code not in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeBetween(String value1, String value2) {
            addCriterion("parent_code between", value1, value2, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotBetween(String value1, String value2) {
            addCriterion("parent_code not between", value1, value2, "parentCode");
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