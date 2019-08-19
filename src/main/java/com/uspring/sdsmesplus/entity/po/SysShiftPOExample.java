package com.uspring.sdsmesplus.entity.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SysShiftPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysShiftPOExample() {
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

        public Criteria andSfIdIsNull() {
            addCriterion("sf_id is null");
            return (Criteria) this;
        }

        public Criteria andSfIdIsNotNull() {
            addCriterion("sf_id is not null");
            return (Criteria) this;
        }

        public Criteria andSfIdEqualTo(Integer value) {
            addCriterion("sf_id =", value, "sfId");
            return (Criteria) this;
        }

        public Criteria andSfIdNotEqualTo(Integer value) {
            addCriterion("sf_id <>", value, "sfId");
            return (Criteria) this;
        }

        public Criteria andSfIdGreaterThan(Integer value) {
            addCriterion("sf_id >", value, "sfId");
            return (Criteria) this;
        }

        public Criteria andSfIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sf_id >=", value, "sfId");
            return (Criteria) this;
        }

        public Criteria andSfIdLessThan(Integer value) {
            addCriterion("sf_id <", value, "sfId");
            return (Criteria) this;
        }

        public Criteria andSfIdLessThanOrEqualTo(Integer value) {
            addCriterion("sf_id <=", value, "sfId");
            return (Criteria) this;
        }

        public Criteria andSfIdIn(List<Integer> values) {
            addCriterion("sf_id in", values, "sfId");
            return (Criteria) this;
        }

        public Criteria andSfIdNotIn(List<Integer> values) {
            addCriterion("sf_id not in", values, "sfId");
            return (Criteria) this;
        }

        public Criteria andSfIdBetween(Integer value1, Integer value2) {
            addCriterion("sf_id between", value1, value2, "sfId");
            return (Criteria) this;
        }

        public Criteria andSfIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sf_id not between", value1, value2, "sfId");
            return (Criteria) this;
        }

        public Criteria andSfCodeIsNull() {
            addCriterion("sf_code is null");
            return (Criteria) this;
        }

        public Criteria andSfCodeIsNotNull() {
            addCriterion("sf_code is not null");
            return (Criteria) this;
        }

        public Criteria andSfCodeEqualTo(String value) {
            addCriterion("sf_code =", value, "sfCode");
            return (Criteria) this;
        }

        public Criteria andSfCodeNotEqualTo(String value) {
            addCriterion("sf_code <>", value, "sfCode");
            return (Criteria) this;
        }

        public Criteria andSfCodeGreaterThan(String value) {
            addCriterion("sf_code >", value, "sfCode");
            return (Criteria) this;
        }

        public Criteria andSfCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sf_code >=", value, "sfCode");
            return (Criteria) this;
        }

        public Criteria andSfCodeLessThan(String value) {
            addCriterion("sf_code <", value, "sfCode");
            return (Criteria) this;
        }

        public Criteria andSfCodeLessThanOrEqualTo(String value) {
            addCriterion("sf_code <=", value, "sfCode");
            return (Criteria) this;
        }

        public Criteria andSfCodeLike(String value) {
            addCriterion("sf_code like", value, "sfCode");
            return (Criteria) this;
        }

        public Criteria andSfCodeNotLike(String value) {
            addCriterion("sf_code not like", value, "sfCode");
            return (Criteria) this;
        }

        public Criteria andSfCodeIn(List<String> values) {
            addCriterion("sf_code in", values, "sfCode");
            return (Criteria) this;
        }

        public Criteria andSfCodeNotIn(List<String> values) {
            addCriterion("sf_code not in", values, "sfCode");
            return (Criteria) this;
        }

        public Criteria andSfCodeBetween(String value1, String value2) {
            addCriterion("sf_code between", value1, value2, "sfCode");
            return (Criteria) this;
        }

        public Criteria andSfCodeNotBetween(String value1, String value2) {
            addCriterion("sf_code not between", value1, value2, "sfCode");
            return (Criteria) this;
        }

        public Criteria andSfNameIsNull() {
            addCriterion("sf_name is null");
            return (Criteria) this;
        }

        public Criteria andSfNameIsNotNull() {
            addCriterion("sf_name is not null");
            return (Criteria) this;
        }

        public Criteria andSfNameEqualTo(String value) {
            addCriterion("sf_name =", value, "sfName");
            return (Criteria) this;
        }

        public Criteria andSfNameNotEqualTo(String value) {
            addCriterion("sf_name <>", value, "sfName");
            return (Criteria) this;
        }

        public Criteria andSfNameGreaterThan(String value) {
            addCriterion("sf_name >", value, "sfName");
            return (Criteria) this;
        }

        public Criteria andSfNameGreaterThanOrEqualTo(String value) {
            addCriterion("sf_name >=", value, "sfName");
            return (Criteria) this;
        }

        public Criteria andSfNameLessThan(String value) {
            addCriterion("sf_name <", value, "sfName");
            return (Criteria) this;
        }

        public Criteria andSfNameLessThanOrEqualTo(String value) {
            addCriterion("sf_name <=", value, "sfName");
            return (Criteria) this;
        }

        public Criteria andSfNameLike(String value) {
            addCriterion("sf_name like", value, "sfName");
            return (Criteria) this;
        }

        public Criteria andSfNameNotLike(String value) {
            addCriterion("sf_name not like", value, "sfName");
            return (Criteria) this;
        }

        public Criteria andSfNameIn(List<String> values) {
            addCriterion("sf_name in", values, "sfName");
            return (Criteria) this;
        }

        public Criteria andSfNameNotIn(List<String> values) {
            addCriterion("sf_name not in", values, "sfName");
            return (Criteria) this;
        }

        public Criteria andSfNameBetween(String value1, String value2) {
            addCriterion("sf_name between", value1, value2, "sfName");
            return (Criteria) this;
        }

        public Criteria andSfNameNotBetween(String value1, String value2) {
            addCriterion("sf_name not between", value1, value2, "sfName");
            return (Criteria) this;
        }

        public Criteria andSfStartHourIsNull() {
            addCriterion("sf_start_hour is null");
            return (Criteria) this;
        }

        public Criteria andSfStartHourIsNotNull() {
            addCriterion("sf_start_hour is not null");
            return (Criteria) this;
        }

        public Criteria andSfStartHourEqualTo(Integer value) {
            addCriterion("sf_start_hour =", value, "sfStartHour");
            return (Criteria) this;
        }

        public Criteria andSfStartHourNotEqualTo(Integer value) {
            addCriterion("sf_start_hour <>", value, "sfStartHour");
            return (Criteria) this;
        }

        public Criteria andSfStartHourGreaterThan(Integer value) {
            addCriterion("sf_start_hour >", value, "sfStartHour");
            return (Criteria) this;
        }

        public Criteria andSfStartHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("sf_start_hour >=", value, "sfStartHour");
            return (Criteria) this;
        }

        public Criteria andSfStartHourLessThan(Integer value) {
            addCriterion("sf_start_hour <", value, "sfStartHour");
            return (Criteria) this;
        }

        public Criteria andSfStartHourLessThanOrEqualTo(Integer value) {
            addCriterion("sf_start_hour <=", value, "sfStartHour");
            return (Criteria) this;
        }

        public Criteria andSfStartHourIn(List<Integer> values) {
            addCriterion("sf_start_hour in", values, "sfStartHour");
            return (Criteria) this;
        }

        public Criteria andSfStartHourNotIn(List<Integer> values) {
            addCriterion("sf_start_hour not in", values, "sfStartHour");
            return (Criteria) this;
        }

        public Criteria andSfStartHourBetween(Integer value1, Integer value2) {
            addCriterion("sf_start_hour between", value1, value2, "sfStartHour");
            return (Criteria) this;
        }

        public Criteria andSfStartHourNotBetween(Integer value1, Integer value2) {
            addCriterion("sf_start_hour not between", value1, value2, "sfStartHour");
            return (Criteria) this;
        }

        public Criteria andSfStartMinuteIsNull() {
            addCriterion("sf_start_minute is null");
            return (Criteria) this;
        }

        public Criteria andSfStartMinuteIsNotNull() {
            addCriterion("sf_start_minute is not null");
            return (Criteria) this;
        }

        public Criteria andSfStartMinuteEqualTo(Integer value) {
            addCriterion("sf_start_minute =", value, "sfStartMinute");
            return (Criteria) this;
        }

        public Criteria andSfStartMinuteNotEqualTo(Integer value) {
            addCriterion("sf_start_minute <>", value, "sfStartMinute");
            return (Criteria) this;
        }

        public Criteria andSfStartMinuteGreaterThan(Integer value) {
            addCriterion("sf_start_minute >", value, "sfStartMinute");
            return (Criteria) this;
        }

        public Criteria andSfStartMinuteGreaterThanOrEqualTo(Integer value) {
            addCriterion("sf_start_minute >=", value, "sfStartMinute");
            return (Criteria) this;
        }

        public Criteria andSfStartMinuteLessThan(Integer value) {
            addCriterion("sf_start_minute <", value, "sfStartMinute");
            return (Criteria) this;
        }

        public Criteria andSfStartMinuteLessThanOrEqualTo(Integer value) {
            addCriterion("sf_start_minute <=", value, "sfStartMinute");
            return (Criteria) this;
        }

        public Criteria andSfStartMinuteIn(List<Integer> values) {
            addCriterion("sf_start_minute in", values, "sfStartMinute");
            return (Criteria) this;
        }

        public Criteria andSfStartMinuteNotIn(List<Integer> values) {
            addCriterion("sf_start_minute not in", values, "sfStartMinute");
            return (Criteria) this;
        }

        public Criteria andSfStartMinuteBetween(Integer value1, Integer value2) {
            addCriterion("sf_start_minute between", value1, value2, "sfStartMinute");
            return (Criteria) this;
        }

        public Criteria andSfStartMinuteNotBetween(Integer value1, Integer value2) {
            addCriterion("sf_start_minute not between", value1, value2, "sfStartMinute");
            return (Criteria) this;
        }

        public Criteria andSfEndHourIsNull() {
            addCriterion("sf_end_hour is null");
            return (Criteria) this;
        }

        public Criteria andSfEndHourIsNotNull() {
            addCriterion("sf_end_hour is not null");
            return (Criteria) this;
        }

        public Criteria andSfEndHourEqualTo(Integer value) {
            addCriterion("sf_end_hour =", value, "sfEndHour");
            return (Criteria) this;
        }

        public Criteria andSfEndHourNotEqualTo(Integer value) {
            addCriterion("sf_end_hour <>", value, "sfEndHour");
            return (Criteria) this;
        }

        public Criteria andSfEndHourGreaterThan(Integer value) {
            addCriterion("sf_end_hour >", value, "sfEndHour");
            return (Criteria) this;
        }

        public Criteria andSfEndHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("sf_end_hour >=", value, "sfEndHour");
            return (Criteria) this;
        }

        public Criteria andSfEndHourLessThan(Integer value) {
            addCriterion("sf_end_hour <", value, "sfEndHour");
            return (Criteria) this;
        }

        public Criteria andSfEndHourLessThanOrEqualTo(Integer value) {
            addCriterion("sf_end_hour <=", value, "sfEndHour");
            return (Criteria) this;
        }

        public Criteria andSfEndHourIn(List<Integer> values) {
            addCriterion("sf_end_hour in", values, "sfEndHour");
            return (Criteria) this;
        }

        public Criteria andSfEndHourNotIn(List<Integer> values) {
            addCriterion("sf_end_hour not in", values, "sfEndHour");
            return (Criteria) this;
        }

        public Criteria andSfEndHourBetween(Integer value1, Integer value2) {
            addCriterion("sf_end_hour between", value1, value2, "sfEndHour");
            return (Criteria) this;
        }

        public Criteria andSfEndHourNotBetween(Integer value1, Integer value2) {
            addCriterion("sf_end_hour not between", value1, value2, "sfEndHour");
            return (Criteria) this;
        }

        public Criteria andSfEndMinuteIsNull() {
            addCriterion("sf_end_minute is null");
            return (Criteria) this;
        }

        public Criteria andSfEndMinuteIsNotNull() {
            addCriterion("sf_end_minute is not null");
            return (Criteria) this;
        }

        public Criteria andSfEndMinuteEqualTo(Integer value) {
            addCriterion("sf_end_minute =", value, "sfEndMinute");
            return (Criteria) this;
        }

        public Criteria andSfEndMinuteNotEqualTo(Integer value) {
            addCriterion("sf_end_minute <>", value, "sfEndMinute");
            return (Criteria) this;
        }

        public Criteria andSfEndMinuteGreaterThan(Integer value) {
            addCriterion("sf_end_minute >", value, "sfEndMinute");
            return (Criteria) this;
        }

        public Criteria andSfEndMinuteGreaterThanOrEqualTo(Integer value) {
            addCriterion("sf_end_minute >=", value, "sfEndMinute");
            return (Criteria) this;
        }

        public Criteria andSfEndMinuteLessThan(Integer value) {
            addCriterion("sf_end_minute <", value, "sfEndMinute");
            return (Criteria) this;
        }

        public Criteria andSfEndMinuteLessThanOrEqualTo(Integer value) {
            addCriterion("sf_end_minute <=", value, "sfEndMinute");
            return (Criteria) this;
        }

        public Criteria andSfEndMinuteIn(List<Integer> values) {
            addCriterion("sf_end_minute in", values, "sfEndMinute");
            return (Criteria) this;
        }

        public Criteria andSfEndMinuteNotIn(List<Integer> values) {
            addCriterion("sf_end_minute not in", values, "sfEndMinute");
            return (Criteria) this;
        }

        public Criteria andSfEndMinuteBetween(Integer value1, Integer value2) {
            addCriterion("sf_end_minute between", value1, value2, "sfEndMinute");
            return (Criteria) this;
        }

        public Criteria andSfEndMinuteNotBetween(Integer value1, Integer value2) {
            addCriterion("sf_end_minute not between", value1, value2, "sfEndMinute");
            return (Criteria) this;
        }

        public Criteria andSfHourIsNull() {
            addCriterion("sf_hour is null");
            return (Criteria) this;
        }

        public Criteria andSfHourIsNotNull() {
            addCriterion("sf_hour is not null");
            return (Criteria) this;
        }

        public Criteria andSfHourEqualTo(BigDecimal value) {
            addCriterion("sf_hour =", value, "sfHour");
            return (Criteria) this;
        }

        public Criteria andSfHourNotEqualTo(BigDecimal value) {
            addCriterion("sf_hour <>", value, "sfHour");
            return (Criteria) this;
        }

        public Criteria andSfHourGreaterThan(BigDecimal value) {
            addCriterion("sf_hour >", value, "sfHour");
            return (Criteria) this;
        }

        public Criteria andSfHourGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sf_hour >=", value, "sfHour");
            return (Criteria) this;
        }

        public Criteria andSfHourLessThan(BigDecimal value) {
            addCriterion("sf_hour <", value, "sfHour");
            return (Criteria) this;
        }

        public Criteria andSfHourLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sf_hour <=", value, "sfHour");
            return (Criteria) this;
        }

        public Criteria andSfHourIn(List<BigDecimal> values) {
            addCriterion("sf_hour in", values, "sfHour");
            return (Criteria) this;
        }

        public Criteria andSfHourNotIn(List<BigDecimal> values) {
            addCriterion("sf_hour not in", values, "sfHour");
            return (Criteria) this;
        }

        public Criteria andSfHourBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sf_hour between", value1, value2, "sfHour");
            return (Criteria) this;
        }

        public Criteria andSfHourNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sf_hour not between", value1, value2, "sfHour");
            return (Criteria) this;
        }

        public Criteria andSfSpanDayIsNull() {
            addCriterion("sf_span_day is null");
            return (Criteria) this;
        }

        public Criteria andSfSpanDayIsNotNull() {
            addCriterion("sf_span_day is not null");
            return (Criteria) this;
        }

        public Criteria andSfSpanDayEqualTo(Integer value) {
            addCriterion("sf_span_day =", value, "sfSpanDay");
            return (Criteria) this;
        }

        public Criteria andSfSpanDayNotEqualTo(Integer value) {
            addCriterion("sf_span_day <>", value, "sfSpanDay");
            return (Criteria) this;
        }

        public Criteria andSfSpanDayGreaterThan(Integer value) {
            addCriterion("sf_span_day >", value, "sfSpanDay");
            return (Criteria) this;
        }

        public Criteria andSfSpanDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("sf_span_day >=", value, "sfSpanDay");
            return (Criteria) this;
        }

        public Criteria andSfSpanDayLessThan(Integer value) {
            addCriterion("sf_span_day <", value, "sfSpanDay");
            return (Criteria) this;
        }

        public Criteria andSfSpanDayLessThanOrEqualTo(Integer value) {
            addCriterion("sf_span_day <=", value, "sfSpanDay");
            return (Criteria) this;
        }

        public Criteria andSfSpanDayIn(List<Integer> values) {
            addCriterion("sf_span_day in", values, "sfSpanDay");
            return (Criteria) this;
        }

        public Criteria andSfSpanDayNotIn(List<Integer> values) {
            addCriterion("sf_span_day not in", values, "sfSpanDay");
            return (Criteria) this;
        }

        public Criteria andSfSpanDayBetween(Integer value1, Integer value2) {
            addCriterion("sf_span_day between", value1, value2, "sfSpanDay");
            return (Criteria) this;
        }

        public Criteria andSfSpanDayNotBetween(Integer value1, Integer value2) {
            addCriterion("sf_span_day not between", value1, value2, "sfSpanDay");
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