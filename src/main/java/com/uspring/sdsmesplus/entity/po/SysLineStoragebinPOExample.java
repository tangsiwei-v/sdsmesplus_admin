package com.uspring.sdsmesplus.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysLineStoragebinPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysLineStoragebinPOExample() {
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

        public Criteria andLinbinIdIsNull() {
            addCriterion("linbin_id is null");
            return (Criteria) this;
        }

        public Criteria andLinbinIdIsNotNull() {
            addCriterion("linbin_id is not null");
            return (Criteria) this;
        }

        public Criteria andLinbinIdEqualTo(Integer value) {
            addCriterion("linbin_id =", value, "linbinId");
            return (Criteria) this;
        }

        public Criteria andLinbinIdNotEqualTo(Integer value) {
            addCriterion("linbin_id <>", value, "linbinId");
            return (Criteria) this;
        }

        public Criteria andLinbinIdGreaterThan(Integer value) {
            addCriterion("linbin_id >", value, "linbinId");
            return (Criteria) this;
        }

        public Criteria andLinbinIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("linbin_id >=", value, "linbinId");
            return (Criteria) this;
        }

        public Criteria andLinbinIdLessThan(Integer value) {
            addCriterion("linbin_id <", value, "linbinId");
            return (Criteria) this;
        }

        public Criteria andLinbinIdLessThanOrEqualTo(Integer value) {
            addCriterion("linbin_id <=", value, "linbinId");
            return (Criteria) this;
        }

        public Criteria andLinbinIdIn(List<Integer> values) {
            addCriterion("linbin_id in", values, "linbinId");
            return (Criteria) this;
        }

        public Criteria andLinbinIdNotIn(List<Integer> values) {
            addCriterion("linbin_id not in", values, "linbinId");
            return (Criteria) this;
        }

        public Criteria andLinbinIdBetween(Integer value1, Integer value2) {
            addCriterion("linbin_id between", value1, value2, "linbinId");
            return (Criteria) this;
        }

        public Criteria andLinbinIdNotBetween(Integer value1, Integer value2) {
            addCriterion("linbin_id not between", value1, value2, "linbinId");
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

        public Criteria andBinIdIsNull() {
            addCriterion("bin_id is null");
            return (Criteria) this;
        }

        public Criteria andBinIdIsNotNull() {
            addCriterion("bin_id is not null");
            return (Criteria) this;
        }

        public Criteria andBinIdEqualTo(Integer value) {
            addCriterion("bin_id =", value, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdNotEqualTo(Integer value) {
            addCriterion("bin_id <>", value, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdGreaterThan(Integer value) {
            addCriterion("bin_id >", value, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bin_id >=", value, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdLessThan(Integer value) {
            addCriterion("bin_id <", value, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdLessThanOrEqualTo(Integer value) {
            addCriterion("bin_id <=", value, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdIn(List<Integer> values) {
            addCriterion("bin_id in", values, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdNotIn(List<Integer> values) {
            addCriterion("bin_id not in", values, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdBetween(Integer value1, Integer value2) {
            addCriterion("bin_id between", value1, value2, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bin_id not between", value1, value2, "binId");
            return (Criteria) this;
        }

        public Criteria andBinCodeIsNull() {
            addCriterion("bin_code is null");
            return (Criteria) this;
        }

        public Criteria andBinCodeIsNotNull() {
            addCriterion("bin_code is not null");
            return (Criteria) this;
        }

        public Criteria andBinCodeEqualTo(String value) {
            addCriterion("bin_code =", value, "binCode");
            return (Criteria) this;
        }

        public Criteria andBinCodeNotEqualTo(String value) {
            addCriterion("bin_code <>", value, "binCode");
            return (Criteria) this;
        }

        public Criteria andBinCodeGreaterThan(String value) {
            addCriterion("bin_code >", value, "binCode");
            return (Criteria) this;
        }

        public Criteria andBinCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bin_code >=", value, "binCode");
            return (Criteria) this;
        }

        public Criteria andBinCodeLessThan(String value) {
            addCriterion("bin_code <", value, "binCode");
            return (Criteria) this;
        }

        public Criteria andBinCodeLessThanOrEqualTo(String value) {
            addCriterion("bin_code <=", value, "binCode");
            return (Criteria) this;
        }

        public Criteria andBinCodeLike(String value) {
            addCriterion("bin_code like", value, "binCode");
            return (Criteria) this;
        }

        public Criteria andBinCodeNotLike(String value) {
            addCriterion("bin_code not like", value, "binCode");
            return (Criteria) this;
        }

        public Criteria andBinCodeIn(List<String> values) {
            addCriterion("bin_code in", values, "binCode");
            return (Criteria) this;
        }

        public Criteria andBinCodeNotIn(List<String> values) {
            addCriterion("bin_code not in", values, "binCode");
            return (Criteria) this;
        }

        public Criteria andBinCodeBetween(String value1, String value2) {
            addCriterion("bin_code between", value1, value2, "binCode");
            return (Criteria) this;
        }

        public Criteria andBinCodeNotBetween(String value1, String value2) {
            addCriterion("bin_code not between", value1, value2, "binCode");
            return (Criteria) this;
        }

        public Criteria andStorageTypeIsNull() {
            addCriterion("storage_type is null");
            return (Criteria) this;
        }

        public Criteria andStorageTypeIsNotNull() {
            addCriterion("storage_type is not null");
            return (Criteria) this;
        }

        public Criteria andStorageTypeEqualTo(String value) {
            addCriterion("storage_type =", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeNotEqualTo(String value) {
            addCriterion("storage_type <>", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeGreaterThan(String value) {
            addCriterion("storage_type >", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("storage_type >=", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeLessThan(String value) {
            addCriterion("storage_type <", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeLessThanOrEqualTo(String value) {
            addCriterion("storage_type <=", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeLike(String value) {
            addCriterion("storage_type like", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeNotLike(String value) {
            addCriterion("storage_type not like", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeIn(List<String> values) {
            addCriterion("storage_type in", values, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeNotIn(List<String> values) {
            addCriterion("storage_type not in", values, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeBetween(String value1, String value2) {
            addCriterion("storage_type between", value1, value2, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeNotBetween(String value1, String value2) {
            addCriterion("storage_type not between", value1, value2, "storageType");
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