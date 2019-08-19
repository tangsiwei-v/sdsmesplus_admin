package com.uspring.sdsmesplus.entity.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PlanOrderProPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlanOrderProPOExample() {
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

        public Criteria andPlopIdIsNull() {
            addCriterion("plop_id is null");
            return (Criteria) this;
        }

        public Criteria andPlopIdIsNotNull() {
            addCriterion("plop_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlopIdEqualTo(Integer value) {
            addCriterion("plop_id =", value, "plopId");
            return (Criteria) this;
        }

        public Criteria andPlopIdNotEqualTo(Integer value) {
            addCriterion("plop_id <>", value, "plopId");
            return (Criteria) this;
        }

        public Criteria andPlopIdGreaterThan(Integer value) {
            addCriterion("plop_id >", value, "plopId");
            return (Criteria) this;
        }

        public Criteria andPlopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("plop_id >=", value, "plopId");
            return (Criteria) this;
        }

        public Criteria andPlopIdLessThan(Integer value) {
            addCriterion("plop_id <", value, "plopId");
            return (Criteria) this;
        }

        public Criteria andPlopIdLessThanOrEqualTo(Integer value) {
            addCriterion("plop_id <=", value, "plopId");
            return (Criteria) this;
        }

        public Criteria andPlopIdIn(List<Integer> values) {
            addCriterion("plop_id in", values, "plopId");
            return (Criteria) this;
        }

        public Criteria andPlopIdNotIn(List<Integer> values) {
            addCriterion("plop_id not in", values, "plopId");
            return (Criteria) this;
        }

        public Criteria andPlopIdBetween(Integer value1, Integer value2) {
            addCriterion("plop_id between", value1, value2, "plopId");
            return (Criteria) this;
        }

        public Criteria andPlopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("plop_id not between", value1, value2, "plopId");
            return (Criteria) this;
        }

        public Criteria andPoCodeIsNull() {
            addCriterion("po_code is null");
            return (Criteria) this;
        }

        public Criteria andPoCodeIsNotNull() {
            addCriterion("po_code is not null");
            return (Criteria) this;
        }

        public Criteria andPoCodeEqualTo(String value) {
            addCriterion("po_code =", value, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeNotEqualTo(String value) {
            addCriterion("po_code <>", value, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeGreaterThan(String value) {
            addCriterion("po_code >", value, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeGreaterThanOrEqualTo(String value) {
            addCriterion("po_code >=", value, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeLessThan(String value) {
            addCriterion("po_code <", value, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeLessThanOrEqualTo(String value) {
            addCriterion("po_code <=", value, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeLike(String value) {
            addCriterion("po_code like", value, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeNotLike(String value) {
            addCriterion("po_code not like", value, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeIn(List<String> values) {
            addCriterion("po_code in", values, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeNotIn(List<String> values) {
            addCriterion("po_code not in", values, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeBetween(String value1, String value2) {
            addCriterion("po_code between", value1, value2, "poCode");
            return (Criteria) this;
        }

        public Criteria andPoCodeNotBetween(String value1, String value2) {
            addCriterion("po_code not between", value1, value2, "poCode");
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

        public Criteria andOpWorkstationIsNull() {
            addCriterion("op_workstation is null");
            return (Criteria) this;
        }

        public Criteria andOpWorkstationIsNotNull() {
            addCriterion("op_workstation is not null");
            return (Criteria) this;
        }

        public Criteria andOpWorkstationEqualTo(String value) {
            addCriterion("op_workstation =", value, "opWorkstation");
            return (Criteria) this;
        }

        public Criteria andOpWorkstationNotEqualTo(String value) {
            addCriterion("op_workstation <>", value, "opWorkstation");
            return (Criteria) this;
        }

        public Criteria andOpWorkstationGreaterThan(String value) {
            addCriterion("op_workstation >", value, "opWorkstation");
            return (Criteria) this;
        }

        public Criteria andOpWorkstationGreaterThanOrEqualTo(String value) {
            addCriterion("op_workstation >=", value, "opWorkstation");
            return (Criteria) this;
        }

        public Criteria andOpWorkstationLessThan(String value) {
            addCriterion("op_workstation <", value, "opWorkstation");
            return (Criteria) this;
        }

        public Criteria andOpWorkstationLessThanOrEqualTo(String value) {
            addCriterion("op_workstation <=", value, "opWorkstation");
            return (Criteria) this;
        }

        public Criteria andOpWorkstationLike(String value) {
            addCriterion("op_workstation like", value, "opWorkstation");
            return (Criteria) this;
        }

        public Criteria andOpWorkstationNotLike(String value) {
            addCriterion("op_workstation not like", value, "opWorkstation");
            return (Criteria) this;
        }

        public Criteria andOpWorkstationIn(List<String> values) {
            addCriterion("op_workstation in", values, "opWorkstation");
            return (Criteria) this;
        }

        public Criteria andOpWorkstationNotIn(List<String> values) {
            addCriterion("op_workstation not in", values, "opWorkstation");
            return (Criteria) this;
        }

        public Criteria andOpWorkstationBetween(String value1, String value2) {
            addCriterion("op_workstation between", value1, value2, "opWorkstation");
            return (Criteria) this;
        }

        public Criteria andOpWorkstationNotBetween(String value1, String value2) {
            addCriterion("op_workstation not between", value1, value2, "opWorkstation");
            return (Criteria) this;
        }

        public Criteria andOpControlIsNull() {
            addCriterion("op_control is null");
            return (Criteria) this;
        }

        public Criteria andOpControlIsNotNull() {
            addCriterion("op_control is not null");
            return (Criteria) this;
        }

        public Criteria andOpControlEqualTo(String value) {
            addCriterion("op_control =", value, "opControl");
            return (Criteria) this;
        }

        public Criteria andOpControlNotEqualTo(String value) {
            addCriterion("op_control <>", value, "opControl");
            return (Criteria) this;
        }

        public Criteria andOpControlGreaterThan(String value) {
            addCriterion("op_control >", value, "opControl");
            return (Criteria) this;
        }

        public Criteria andOpControlGreaterThanOrEqualTo(String value) {
            addCriterion("op_control >=", value, "opControl");
            return (Criteria) this;
        }

        public Criteria andOpControlLessThan(String value) {
            addCriterion("op_control <", value, "opControl");
            return (Criteria) this;
        }

        public Criteria andOpControlLessThanOrEqualTo(String value) {
            addCriterion("op_control <=", value, "opControl");
            return (Criteria) this;
        }

        public Criteria andOpControlLike(String value) {
            addCriterion("op_control like", value, "opControl");
            return (Criteria) this;
        }

        public Criteria andOpControlNotLike(String value) {
            addCriterion("op_control not like", value, "opControl");
            return (Criteria) this;
        }

        public Criteria andOpControlIn(List<String> values) {
            addCriterion("op_control in", values, "opControl");
            return (Criteria) this;
        }

        public Criteria andOpControlNotIn(List<String> values) {
            addCriterion("op_control not in", values, "opControl");
            return (Criteria) this;
        }

        public Criteria andOpControlBetween(String value1, String value2) {
            addCriterion("op_control between", value1, value2, "opControl");
            return (Criteria) this;
        }

        public Criteria andOpControlNotBetween(String value1, String value2) {
            addCriterion("op_control not between", value1, value2, "opControl");
            return (Criteria) this;
        }

        public Criteria andOpDescIsNull() {
            addCriterion("op_desc is null");
            return (Criteria) this;
        }

        public Criteria andOpDescIsNotNull() {
            addCriterion("op_desc is not null");
            return (Criteria) this;
        }

        public Criteria andOpDescEqualTo(String value) {
            addCriterion("op_desc =", value, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpDescNotEqualTo(String value) {
            addCriterion("op_desc <>", value, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpDescGreaterThan(String value) {
            addCriterion("op_desc >", value, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpDescGreaterThanOrEqualTo(String value) {
            addCriterion("op_desc >=", value, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpDescLessThan(String value) {
            addCriterion("op_desc <", value, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpDescLessThanOrEqualTo(String value) {
            addCriterion("op_desc <=", value, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpDescLike(String value) {
            addCriterion("op_desc like", value, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpDescNotLike(String value) {
            addCriterion("op_desc not like", value, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpDescIn(List<String> values) {
            addCriterion("op_desc in", values, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpDescNotIn(List<String> values) {
            addCriterion("op_desc not in", values, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpDescBetween(String value1, String value2) {
            addCriterion("op_desc between", value1, value2, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpDescNotBetween(String value1, String value2) {
            addCriterion("op_desc not between", value1, value2, "opDesc");
            return (Criteria) this;
        }

        public Criteria andOpManHourIsNull() {
            addCriterion("op_man_hour is null");
            return (Criteria) this;
        }

        public Criteria andOpManHourIsNotNull() {
            addCriterion("op_man_hour is not null");
            return (Criteria) this;
        }

        public Criteria andOpManHourEqualTo(BigDecimal value) {
            addCriterion("op_man_hour =", value, "opManHour");
            return (Criteria) this;
        }

        public Criteria andOpManHourNotEqualTo(BigDecimal value) {
            addCriterion("op_man_hour <>", value, "opManHour");
            return (Criteria) this;
        }

        public Criteria andOpManHourGreaterThan(BigDecimal value) {
            addCriterion("op_man_hour >", value, "opManHour");
            return (Criteria) this;
        }

        public Criteria andOpManHourGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("op_man_hour >=", value, "opManHour");
            return (Criteria) this;
        }

        public Criteria andOpManHourLessThan(BigDecimal value) {
            addCriterion("op_man_hour <", value, "opManHour");
            return (Criteria) this;
        }

        public Criteria andOpManHourLessThanOrEqualTo(BigDecimal value) {
            addCriterion("op_man_hour <=", value, "opManHour");
            return (Criteria) this;
        }

        public Criteria andOpManHourIn(List<BigDecimal> values) {
            addCriterion("op_man_hour in", values, "opManHour");
            return (Criteria) this;
        }

        public Criteria andOpManHourNotIn(List<BigDecimal> values) {
            addCriterion("op_man_hour not in", values, "opManHour");
            return (Criteria) this;
        }

        public Criteria andOpManHourBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("op_man_hour between", value1, value2, "opManHour");
            return (Criteria) this;
        }

        public Criteria andOpManHourNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("op_man_hour not between", value1, value2, "opManHour");
            return (Criteria) this;
        }

        public Criteria andOpMachineHourIsNull() {
            addCriterion("op_machine_hour is null");
            return (Criteria) this;
        }

        public Criteria andOpMachineHourIsNotNull() {
            addCriterion("op_machine_hour is not null");
            return (Criteria) this;
        }

        public Criteria andOpMachineHourEqualTo(BigDecimal value) {
            addCriterion("op_machine_hour =", value, "opMachineHour");
            return (Criteria) this;
        }

        public Criteria andOpMachineHourNotEqualTo(BigDecimal value) {
            addCriterion("op_machine_hour <>", value, "opMachineHour");
            return (Criteria) this;
        }

        public Criteria andOpMachineHourGreaterThan(BigDecimal value) {
            addCriterion("op_machine_hour >", value, "opMachineHour");
            return (Criteria) this;
        }

        public Criteria andOpMachineHourGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("op_machine_hour >=", value, "opMachineHour");
            return (Criteria) this;
        }

        public Criteria andOpMachineHourLessThan(BigDecimal value) {
            addCriterion("op_machine_hour <", value, "opMachineHour");
            return (Criteria) this;
        }

        public Criteria andOpMachineHourLessThanOrEqualTo(BigDecimal value) {
            addCriterion("op_machine_hour <=", value, "opMachineHour");
            return (Criteria) this;
        }

        public Criteria andOpMachineHourIn(List<BigDecimal> values) {
            addCriterion("op_machine_hour in", values, "opMachineHour");
            return (Criteria) this;
        }

        public Criteria andOpMachineHourNotIn(List<BigDecimal> values) {
            addCriterion("op_machine_hour not in", values, "opMachineHour");
            return (Criteria) this;
        }

        public Criteria andOpMachineHourBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("op_machine_hour between", value1, value2, "opMachineHour");
            return (Criteria) this;
        }

        public Criteria andOpMachineHourNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("op_machine_hour not between", value1, value2, "opMachineHour");
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