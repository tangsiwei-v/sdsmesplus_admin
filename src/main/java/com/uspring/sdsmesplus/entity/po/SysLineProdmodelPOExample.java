package com.uspring.sdsmesplus.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysLineProdmodelPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysLineProdmodelPOExample() {
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

        public Criteria andLinemodIdIsNull() {
            addCriterion("linemod_id is null");
            return (Criteria) this;
        }

        public Criteria andLinemodIdIsNotNull() {
            addCriterion("linemod_id is not null");
            return (Criteria) this;
        }

        public Criteria andLinemodIdEqualTo(Integer value) {
            addCriterion("linemod_id =", value, "linemodId");
            return (Criteria) this;
        }

        public Criteria andLinemodIdNotEqualTo(Integer value) {
            addCriterion("linemod_id <>", value, "linemodId");
            return (Criteria) this;
        }

        public Criteria andLinemodIdGreaterThan(Integer value) {
            addCriterion("linemod_id >", value, "linemodId");
            return (Criteria) this;
        }

        public Criteria andLinemodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("linemod_id >=", value, "linemodId");
            return (Criteria) this;
        }

        public Criteria andLinemodIdLessThan(Integer value) {
            addCriterion("linemod_id <", value, "linemodId");
            return (Criteria) this;
        }

        public Criteria andLinemodIdLessThanOrEqualTo(Integer value) {
            addCriterion("linemod_id <=", value, "linemodId");
            return (Criteria) this;
        }

        public Criteria andLinemodIdIn(List<Integer> values) {
            addCriterion("linemod_id in", values, "linemodId");
            return (Criteria) this;
        }

        public Criteria andLinemodIdNotIn(List<Integer> values) {
            addCriterion("linemod_id not in", values, "linemodId");
            return (Criteria) this;
        }

        public Criteria andLinemodIdBetween(Integer value1, Integer value2) {
            addCriterion("linemod_id between", value1, value2, "linemodId");
            return (Criteria) this;
        }

        public Criteria andLinemodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("linemod_id not between", value1, value2, "linemodId");
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

        public Criteria andProdModelIsNull() {
            addCriterion("prod_model is null");
            return (Criteria) this;
        }

        public Criteria andProdModelIsNotNull() {
            addCriterion("prod_model is not null");
            return (Criteria) this;
        }

        public Criteria andProdModelEqualTo(String value) {
            addCriterion("prod_model =", value, "prodModel");
            return (Criteria) this;
        }

        public Criteria andProdModelNotEqualTo(String value) {
            addCriterion("prod_model <>", value, "prodModel");
            return (Criteria) this;
        }

        public Criteria andProdModelGreaterThan(String value) {
            addCriterion("prod_model >", value, "prodModel");
            return (Criteria) this;
        }

        public Criteria andProdModelGreaterThanOrEqualTo(String value) {
            addCriterion("prod_model >=", value, "prodModel");
            return (Criteria) this;
        }

        public Criteria andProdModelLessThan(String value) {
            addCriterion("prod_model <", value, "prodModel");
            return (Criteria) this;
        }

        public Criteria andProdModelLessThanOrEqualTo(String value) {
            addCriterion("prod_model <=", value, "prodModel");
            return (Criteria) this;
        }

        public Criteria andProdModelLike(String value) {
            addCriterion("prod_model like", value, "prodModel");
            return (Criteria) this;
        }

        public Criteria andProdModelNotLike(String value) {
            addCriterion("prod_model not like", value, "prodModel");
            return (Criteria) this;
        }

        public Criteria andProdModelIn(List<String> values) {
            addCriterion("prod_model in", values, "prodModel");
            return (Criteria) this;
        }

        public Criteria andProdModelNotIn(List<String> values) {
            addCriterion("prod_model not in", values, "prodModel");
            return (Criteria) this;
        }

        public Criteria andProdModelBetween(String value1, String value2) {
            addCriterion("prod_model between", value1, value2, "prodModel");
            return (Criteria) this;
        }

        public Criteria andProdModelNotBetween(String value1, String value2) {
            addCriterion("prod_model not between", value1, value2, "prodModel");
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