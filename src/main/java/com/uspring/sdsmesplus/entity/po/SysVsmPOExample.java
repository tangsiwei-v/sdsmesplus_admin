package com.uspring.sdsmesplus.entity.po;

import java.util.ArrayList;
import java.util.List;

public class SysVsmPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysVsmPOExample() {
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

        public Criteria andVsmIdIsNull() {
            addCriterion("vsm_id is null");
            return (Criteria) this;
        }

        public Criteria andVsmIdIsNotNull() {
            addCriterion("vsm_id is not null");
            return (Criteria) this;
        }

        public Criteria andVsmIdEqualTo(Integer value) {
            addCriterion("vsm_id =", value, "vsmId");
            return (Criteria) this;
        }

        public Criteria andVsmIdNotEqualTo(Integer value) {
            addCriterion("vsm_id <>", value, "vsmId");
            return (Criteria) this;
        }

        public Criteria andVsmIdGreaterThan(Integer value) {
            addCriterion("vsm_id >", value, "vsmId");
            return (Criteria) this;
        }

        public Criteria andVsmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vsm_id >=", value, "vsmId");
            return (Criteria) this;
        }

        public Criteria andVsmIdLessThan(Integer value) {
            addCriterion("vsm_id <", value, "vsmId");
            return (Criteria) this;
        }

        public Criteria andVsmIdLessThanOrEqualTo(Integer value) {
            addCriterion("vsm_id <=", value, "vsmId");
            return (Criteria) this;
        }

        public Criteria andVsmIdIn(List<Integer> values) {
            addCriterion("vsm_id in", values, "vsmId");
            return (Criteria) this;
        }

        public Criteria andVsmIdNotIn(List<Integer> values) {
            addCriterion("vsm_id not in", values, "vsmId");
            return (Criteria) this;
        }

        public Criteria andVsmIdBetween(Integer value1, Integer value2) {
            addCriterion("vsm_id between", value1, value2, "vsmId");
            return (Criteria) this;
        }

        public Criteria andVsmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vsm_id not between", value1, value2, "vsmId");
            return (Criteria) this;
        }

        public Criteria andVsmNameIsNull() {
            addCriterion("vsm_name is null");
            return (Criteria) this;
        }

        public Criteria andVsmNameIsNotNull() {
            addCriterion("vsm_name is not null");
            return (Criteria) this;
        }

        public Criteria andVsmNameEqualTo(String value) {
            addCriterion("vsm_name =", value, "vsmName");
            return (Criteria) this;
        }

        public Criteria andVsmNameNotEqualTo(String value) {
            addCriterion("vsm_name <>", value, "vsmName");
            return (Criteria) this;
        }

        public Criteria andVsmNameGreaterThan(String value) {
            addCriterion("vsm_name >", value, "vsmName");
            return (Criteria) this;
        }

        public Criteria andVsmNameGreaterThanOrEqualTo(String value) {
            addCriterion("vsm_name >=", value, "vsmName");
            return (Criteria) this;
        }

        public Criteria andVsmNameLessThan(String value) {
            addCriterion("vsm_name <", value, "vsmName");
            return (Criteria) this;
        }

        public Criteria andVsmNameLessThanOrEqualTo(String value) {
            addCriterion("vsm_name <=", value, "vsmName");
            return (Criteria) this;
        }

        public Criteria andVsmNameLike(String value) {
            addCriterion("vsm_name like", value, "vsmName");
            return (Criteria) this;
        }

        public Criteria andVsmNameNotLike(String value) {
            addCriterion("vsm_name not like", value, "vsmName");
            return (Criteria) this;
        }

        public Criteria andVsmNameIn(List<String> values) {
            addCriterion("vsm_name in", values, "vsmName");
            return (Criteria) this;
        }

        public Criteria andVsmNameNotIn(List<String> values) {
            addCriterion("vsm_name not in", values, "vsmName");
            return (Criteria) this;
        }

        public Criteria andVsmNameBetween(String value1, String value2) {
            addCriterion("vsm_name between", value1, value2, "vsmName");
            return (Criteria) this;
        }

        public Criteria andVsmNameNotBetween(String value1, String value2) {
            addCriterion("vsm_name not between", value1, value2, "vsmName");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andVsmSdsIdIsNull() {
            addCriterion("vsm_sds_id is null");
            return (Criteria) this;
        }

        public Criteria andVsmSdsIdIsNotNull() {
            addCriterion("vsm_sds_id is not null");
            return (Criteria) this;
        }

        public Criteria andVsmSdsIdEqualTo(String value) {
            addCriterion("vsm_sds_id =", value, "vsmSdsId");
            return (Criteria) this;
        }

        public Criteria andVsmSdsIdNotEqualTo(String value) {
            addCriterion("vsm_sds_id <>", value, "vsmSdsId");
            return (Criteria) this;
        }

        public Criteria andVsmSdsIdGreaterThan(String value) {
            addCriterion("vsm_sds_id >", value, "vsmSdsId");
            return (Criteria) this;
        }

        public Criteria andVsmSdsIdGreaterThanOrEqualTo(String value) {
            addCriterion("vsm_sds_id >=", value, "vsmSdsId");
            return (Criteria) this;
        }

        public Criteria andVsmSdsIdLessThan(String value) {
            addCriterion("vsm_sds_id <", value, "vsmSdsId");
            return (Criteria) this;
        }

        public Criteria andVsmSdsIdLessThanOrEqualTo(String value) {
            addCriterion("vsm_sds_id <=", value, "vsmSdsId");
            return (Criteria) this;
        }

        public Criteria andVsmSdsIdLike(String value) {
            addCriterion("vsm_sds_id like", value, "vsmSdsId");
            return (Criteria) this;
        }

        public Criteria andVsmSdsIdNotLike(String value) {
            addCriterion("vsm_sds_id not like", value, "vsmSdsId");
            return (Criteria) this;
        }

        public Criteria andVsmSdsIdIn(List<String> values) {
            addCriterion("vsm_sds_id in", values, "vsmSdsId");
            return (Criteria) this;
        }

        public Criteria andVsmSdsIdNotIn(List<String> values) {
            addCriterion("vsm_sds_id not in", values, "vsmSdsId");
            return (Criteria) this;
        }

        public Criteria andVsmSdsIdBetween(String value1, String value2) {
            addCriterion("vsm_sds_id between", value1, value2, "vsmSdsId");
            return (Criteria) this;
        }

        public Criteria andVsmSdsIdNotBetween(String value1, String value2) {
            addCriterion("vsm_sds_id not between", value1, value2, "vsmSdsId");
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