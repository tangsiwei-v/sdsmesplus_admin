package com.uspring.sdsmesplus.entity.po;

import java.util.ArrayList;
import java.util.List;

public class SysProcedureProcessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysProcedureProcessExample() {
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

        public Criteria andSpIdIsNull() {
            addCriterion("sp_id is null");
            return (Criteria) this;
        }

        public Criteria andSpIdIsNotNull() {
            addCriterion("sp_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpIdEqualTo(Integer value) {
            addCriterion("sp_id =", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdNotEqualTo(Integer value) {
            addCriterion("sp_id <>", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdGreaterThan(Integer value) {
            addCriterion("sp_id >", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_id >=", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdLessThan(Integer value) {
            addCriterion("sp_id <", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdLessThanOrEqualTo(Integer value) {
            addCriterion("sp_id <=", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdIn(List<Integer> values) {
            addCriterion("sp_id in", values, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdNotIn(List<Integer> values) {
            addCriterion("sp_id not in", values, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdBetween(Integer value1, Integer value2) {
            addCriterion("sp_id between", value1, value2, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_id not between", value1, value2, "spId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdIsNull() {
            addCriterion("procedure_id is null");
            return (Criteria) this;
        }

        public Criteria andProcedureIdIsNotNull() {
            addCriterion("procedure_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcedureIdEqualTo(String value) {
            addCriterion("procedure_id =", value, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdNotEqualTo(String value) {
            addCriterion("procedure_id <>", value, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdGreaterThan(String value) {
            addCriterion("procedure_id >", value, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdGreaterThanOrEqualTo(String value) {
            addCriterion("procedure_id >=", value, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdLessThan(String value) {
            addCriterion("procedure_id <", value, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdLessThanOrEqualTo(String value) {
            addCriterion("procedure_id <=", value, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdLike(String value) {
            addCriterion("procedure_id like", value, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdNotLike(String value) {
            addCriterion("procedure_id not like", value, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdIn(List<String> values) {
            addCriterion("procedure_id in", values, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdNotIn(List<String> values) {
            addCriterion("procedure_id not in", values, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdBetween(String value1, String value2) {
            addCriterion("procedure_id between", value1, value2, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcedureIdNotBetween(String value1, String value2) {
            addCriterion("procedure_id not between", value1, value2, "procedureId");
            return (Criteria) this;
        }

        public Criteria andProcessCodeIsNull() {
            addCriterion("process_code is null");
            return (Criteria) this;
        }

        public Criteria andProcessCodeIsNotNull() {
            addCriterion("process_code is not null");
            return (Criteria) this;
        }

        public Criteria andProcessCodeEqualTo(String value) {
            addCriterion("process_code =", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeNotEqualTo(String value) {
            addCriterion("process_code <>", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeGreaterThan(String value) {
            addCriterion("process_code >", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeGreaterThanOrEqualTo(String value) {
            addCriterion("process_code >=", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeLessThan(String value) {
            addCriterion("process_code <", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeLessThanOrEqualTo(String value) {
            addCriterion("process_code <=", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeLike(String value) {
            addCriterion("process_code like", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeNotLike(String value) {
            addCriterion("process_code not like", value, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeIn(List<String> values) {
            addCriterion("process_code in", values, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeNotIn(List<String> values) {
            addCriterion("process_code not in", values, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeBetween(String value1, String value2) {
            addCriterion("process_code between", value1, value2, "processCode");
            return (Criteria) this;
        }

        public Criteria andProcessCodeNotBetween(String value1, String value2) {
            addCriterion("process_code not between", value1, value2, "processCode");
            return (Criteria) this;
        }

        public Criteria andSpIsShowIsNull() {
            addCriterion("sp_is_show is null");
            return (Criteria) this;
        }

        public Criteria andSpIsShowIsNotNull() {
            addCriterion("sp_is_show is not null");
            return (Criteria) this;
        }

        public Criteria andSpIsShowEqualTo(Boolean value) {
            addCriterion("sp_is_show =", value, "spIsShow");
            return (Criteria) this;
        }

        public Criteria andSpIsShowNotEqualTo(Boolean value) {
            addCriterion("sp_is_show <>", value, "spIsShow");
            return (Criteria) this;
        }

        public Criteria andSpIsShowGreaterThan(Boolean value) {
            addCriterion("sp_is_show >", value, "spIsShow");
            return (Criteria) this;
        }

        public Criteria andSpIsShowGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sp_is_show >=", value, "spIsShow");
            return (Criteria) this;
        }

        public Criteria andSpIsShowLessThan(Boolean value) {
            addCriterion("sp_is_show <", value, "spIsShow");
            return (Criteria) this;
        }

        public Criteria andSpIsShowLessThanOrEqualTo(Boolean value) {
            addCriterion("sp_is_show <=", value, "spIsShow");
            return (Criteria) this;
        }

        public Criteria andSpIsShowIn(List<Boolean> values) {
            addCriterion("sp_is_show in", values, "spIsShow");
            return (Criteria) this;
        }

        public Criteria andSpIsShowNotIn(List<Boolean> values) {
            addCriterion("sp_is_show not in", values, "spIsShow");
            return (Criteria) this;
        }

        public Criteria andSpIsShowBetween(Boolean value1, Boolean value2) {
            addCriterion("sp_is_show between", value1, value2, "spIsShow");
            return (Criteria) this;
        }

        public Criteria andSpIsShowNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sp_is_show not between", value1, value2, "spIsShow");
            return (Criteria) this;
        }

        public Criteria andSpTypeIsNull() {
            addCriterion("sp_type is null");
            return (Criteria) this;
        }

        public Criteria andSpTypeIsNotNull() {
            addCriterion("sp_type is not null");
            return (Criteria) this;
        }

        public Criteria andSpTypeEqualTo(String value) {
            addCriterion("sp_type =", value, "spType");
            return (Criteria) this;
        }

        public Criteria andSpTypeNotEqualTo(String value) {
            addCriterion("sp_type <>", value, "spType");
            return (Criteria) this;
        }

        public Criteria andSpTypeGreaterThan(String value) {
            addCriterion("sp_type >", value, "spType");
            return (Criteria) this;
        }

        public Criteria andSpTypeGreaterThanOrEqualTo(String value) {
            addCriterion("sp_type >=", value, "spType");
            return (Criteria) this;
        }

        public Criteria andSpTypeLessThan(String value) {
            addCriterion("sp_type <", value, "spType");
            return (Criteria) this;
        }

        public Criteria andSpTypeLessThanOrEqualTo(String value) {
            addCriterion("sp_type <=", value, "spType");
            return (Criteria) this;
        }

        public Criteria andSpTypeLike(String value) {
            addCriterion("sp_type like", value, "spType");
            return (Criteria) this;
        }

        public Criteria andSpTypeNotLike(String value) {
            addCriterion("sp_type not like", value, "spType");
            return (Criteria) this;
        }

        public Criteria andSpTypeIn(List<String> values) {
            addCriterion("sp_type in", values, "spType");
            return (Criteria) this;
        }

        public Criteria andSpTypeNotIn(List<String> values) {
            addCriterion("sp_type not in", values, "spType");
            return (Criteria) this;
        }

        public Criteria andSpTypeBetween(String value1, String value2) {
            addCriterion("sp_type between", value1, value2, "spType");
            return (Criteria) this;
        }

        public Criteria andSpTypeNotBetween(String value1, String value2) {
            addCriterion("sp_type not between", value1, value2, "spType");
            return (Criteria) this;
        }

        public Criteria andSpNameIsNull() {
            addCriterion("sp_name is null");
            return (Criteria) this;
        }

        public Criteria andSpNameIsNotNull() {
            addCriterion("sp_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpNameEqualTo(String value) {
            addCriterion("sp_name =", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameNotEqualTo(String value) {
            addCriterion("sp_name <>", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameGreaterThan(String value) {
            addCriterion("sp_name >", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameGreaterThanOrEqualTo(String value) {
            addCriterion("sp_name >=", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameLessThan(String value) {
            addCriterion("sp_name <", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameLessThanOrEqualTo(String value) {
            addCriterion("sp_name <=", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameLike(String value) {
            addCriterion("sp_name like", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameNotLike(String value) {
            addCriterion("sp_name not like", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameIn(List<String> values) {
            addCriterion("sp_name in", values, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameNotIn(List<String> values) {
            addCriterion("sp_name not in", values, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameBetween(String value1, String value2) {
            addCriterion("sp_name between", value1, value2, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameNotBetween(String value1, String value2) {
            addCriterion("sp_name not between", value1, value2, "spName");
            return (Criteria) this;
        }

        public Criteria andSpIsQualityIsNull() {
            addCriterion("sp_is_quality is null");
            return (Criteria) this;
        }

        public Criteria andSpIsQualityIsNotNull() {
            addCriterion("sp_is_quality is not null");
            return (Criteria) this;
        }

        public Criteria andSpIsQualityEqualTo(Boolean value) {
            addCriterion("sp_is_quality =", value, "spIsQuality");
            return (Criteria) this;
        }

        public Criteria andSpIsQualityNotEqualTo(Boolean value) {
            addCriterion("sp_is_quality <>", value, "spIsQuality");
            return (Criteria) this;
        }

        public Criteria andSpIsQualityGreaterThan(Boolean value) {
            addCriterion("sp_is_quality >", value, "spIsQuality");
            return (Criteria) this;
        }

        public Criteria andSpIsQualityGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sp_is_quality >=", value, "spIsQuality");
            return (Criteria) this;
        }

        public Criteria andSpIsQualityLessThan(Boolean value) {
            addCriterion("sp_is_quality <", value, "spIsQuality");
            return (Criteria) this;
        }

        public Criteria andSpIsQualityLessThanOrEqualTo(Boolean value) {
            addCriterion("sp_is_quality <=", value, "spIsQuality");
            return (Criteria) this;
        }

        public Criteria andSpIsQualityIn(List<Boolean> values) {
            addCriterion("sp_is_quality in", values, "spIsQuality");
            return (Criteria) this;
        }

        public Criteria andSpIsQualityNotIn(List<Boolean> values) {
            addCriterion("sp_is_quality not in", values, "spIsQuality");
            return (Criteria) this;
        }

        public Criteria andSpIsQualityBetween(Boolean value1, Boolean value2) {
            addCriterion("sp_is_quality between", value1, value2, "spIsQuality");
            return (Criteria) this;
        }

        public Criteria andSpIsQualityNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sp_is_quality not between", value1, value2, "spIsQuality");
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