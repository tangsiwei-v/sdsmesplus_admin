package com.uspring.sdsmesplus.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DeviceVerifyLogPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceVerifyLogPOExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andDvIdIsNull() {
            addCriterion("dv_id is null");
            return (Criteria) this;
        }

        public Criteria andDvIdIsNotNull() {
            addCriterion("dv_id is not null");
            return (Criteria) this;
        }

        public Criteria andDvIdEqualTo(Integer value) {
            addCriterion("dv_id =", value, "dvId");
            return (Criteria) this;
        }

        public Criteria andDvIdNotEqualTo(Integer value) {
            addCriterion("dv_id <>", value, "dvId");
            return (Criteria) this;
        }

        public Criteria andDvIdGreaterThan(Integer value) {
            addCriterion("dv_id >", value, "dvId");
            return (Criteria) this;
        }

        public Criteria andDvIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dv_id >=", value, "dvId");
            return (Criteria) this;
        }

        public Criteria andDvIdLessThan(Integer value) {
            addCriterion("dv_id <", value, "dvId");
            return (Criteria) this;
        }

        public Criteria andDvIdLessThanOrEqualTo(Integer value) {
            addCriterion("dv_id <=", value, "dvId");
            return (Criteria) this;
        }

        public Criteria andDvIdIn(List<Integer> values) {
            addCriterion("dv_id in", values, "dvId");
            return (Criteria) this;
        }

        public Criteria andDvIdNotIn(List<Integer> values) {
            addCriterion("dv_id not in", values, "dvId");
            return (Criteria) this;
        }

        public Criteria andDvIdBetween(Integer value1, Integer value2) {
            addCriterion("dv_id between", value1, value2, "dvId");
            return (Criteria) this;
        }

        public Criteria andDvIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dv_id not between", value1, value2, "dvId");
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

        public Criteria andShiftDateIsNull() {
            addCriterion("shift_date is null");
            return (Criteria) this;
        }

        public Criteria andShiftDateIsNotNull() {
            addCriterion("shift_date is not null");
            return (Criteria) this;
        }

        public Criteria andShiftDateEqualTo(Date value) {
            addCriterionForJDBCDate("shift_date =", value, "shiftDate");
            return (Criteria) this;
        }

        public Criteria andShiftDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("shift_date <>", value, "shiftDate");
            return (Criteria) this;
        }

        public Criteria andShiftDateGreaterThan(Date value) {
            addCriterionForJDBCDate("shift_date >", value, "shiftDate");
            return (Criteria) this;
        }

        public Criteria andShiftDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shift_date >=", value, "shiftDate");
            return (Criteria) this;
        }

        public Criteria andShiftDateLessThan(Date value) {
            addCriterionForJDBCDate("shift_date <", value, "shiftDate");
            return (Criteria) this;
        }

        public Criteria andShiftDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shift_date <=", value, "shiftDate");
            return (Criteria) this;
        }

        public Criteria andShiftDateIn(List<Date> values) {
            addCriterionForJDBCDate("shift_date in", values, "shiftDate");
            return (Criteria) this;
        }

        public Criteria andShiftDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("shift_date not in", values, "shiftDate");
            return (Criteria) this;
        }

        public Criteria andShiftDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shift_date between", value1, value2, "shiftDate");
            return (Criteria) this;
        }

        public Criteria andShiftDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shift_date not between", value1, value2, "shiftDate");
            return (Criteria) this;
        }

        public Criteria andShiftIdIsNull() {
            addCriterion("shift_id is null");
            return (Criteria) this;
        }

        public Criteria andShiftIdIsNotNull() {
            addCriterion("shift_id is not null");
            return (Criteria) this;
        }

        public Criteria andShiftIdEqualTo(String value) {
            addCriterion("shift_id =", value, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdNotEqualTo(String value) {
            addCriterion("shift_id <>", value, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdGreaterThan(String value) {
            addCriterion("shift_id >", value, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdGreaterThanOrEqualTo(String value) {
            addCriterion("shift_id >=", value, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdLessThan(String value) {
            addCriterion("shift_id <", value, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdLessThanOrEqualTo(String value) {
            addCriterion("shift_id <=", value, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdLike(String value) {
            addCriterion("shift_id like", value, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdNotLike(String value) {
            addCriterion("shift_id not like", value, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdIn(List<String> values) {
            addCriterion("shift_id in", values, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdNotIn(List<String> values) {
            addCriterion("shift_id not in", values, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdBetween(String value1, String value2) {
            addCriterion("shift_id between", value1, value2, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdNotBetween(String value1, String value2) {
            addCriterion("shift_id not between", value1, value2, "shiftId");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNull() {
            addCriterion("order_code is null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNotNull() {
            addCriterion("order_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeEqualTo(String value) {
            addCriterion("order_code =", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotEqualTo(String value) {
            addCriterion("order_code <>", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThan(String value) {
            addCriterion("order_code >", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("order_code >=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThan(String value) {
            addCriterion("order_code <", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("order_code <=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLike(String value) {
            addCriterion("order_code like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotLike(String value) {
            addCriterion("order_code not like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIn(List<String> values) {
            addCriterion("order_code in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotIn(List<String> values) {
            addCriterion("order_code not in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeBetween(String value1, String value2) {
            addCriterion("order_code between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotBetween(String value1, String value2) {
            addCriterion("order_code not between", value1, value2, "orderCode");
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

        public Criteria andDvDeviceIsNull() {
            addCriterion("dv_device is null");
            return (Criteria) this;
        }

        public Criteria andDvDeviceIsNotNull() {
            addCriterion("dv_device is not null");
            return (Criteria) this;
        }

        public Criteria andDvDeviceEqualTo(String value) {
            addCriterion("dv_device =", value, "dvDevice");
            return (Criteria) this;
        }

        public Criteria andDvDeviceNotEqualTo(String value) {
            addCriterion("dv_device <>", value, "dvDevice");
            return (Criteria) this;
        }

        public Criteria andDvDeviceGreaterThan(String value) {
            addCriterion("dv_device >", value, "dvDevice");
            return (Criteria) this;
        }

        public Criteria andDvDeviceGreaterThanOrEqualTo(String value) {
            addCriterion("dv_device >=", value, "dvDevice");
            return (Criteria) this;
        }

        public Criteria andDvDeviceLessThan(String value) {
            addCriterion("dv_device <", value, "dvDevice");
            return (Criteria) this;
        }

        public Criteria andDvDeviceLessThanOrEqualTo(String value) {
            addCriterion("dv_device <=", value, "dvDevice");
            return (Criteria) this;
        }

        public Criteria andDvDeviceLike(String value) {
            addCriterion("dv_device like", value, "dvDevice");
            return (Criteria) this;
        }

        public Criteria andDvDeviceNotLike(String value) {
            addCriterion("dv_device not like", value, "dvDevice");
            return (Criteria) this;
        }

        public Criteria andDvDeviceIn(List<String> values) {
            addCriterion("dv_device in", values, "dvDevice");
            return (Criteria) this;
        }

        public Criteria andDvDeviceNotIn(List<String> values) {
            addCriterion("dv_device not in", values, "dvDevice");
            return (Criteria) this;
        }

        public Criteria andDvDeviceBetween(String value1, String value2) {
            addCriterion("dv_device between", value1, value2, "dvDevice");
            return (Criteria) this;
        }

        public Criteria andDvDeviceNotBetween(String value1, String value2) {
            addCriterion("dv_device not between", value1, value2, "dvDevice");
            return (Criteria) this;
        }

        public Criteria andDvProcedureIsNull() {
            addCriterion("dv_procedure is null");
            return (Criteria) this;
        }

        public Criteria andDvProcedureIsNotNull() {
            addCriterion("dv_procedure is not null");
            return (Criteria) this;
        }

        public Criteria andDvProcedureEqualTo(String value) {
            addCriterion("dv_procedure =", value, "dvProcedure");
            return (Criteria) this;
        }

        public Criteria andDvProcedureNotEqualTo(String value) {
            addCriterion("dv_procedure <>", value, "dvProcedure");
            return (Criteria) this;
        }

        public Criteria andDvProcedureGreaterThan(String value) {
            addCriterion("dv_procedure >", value, "dvProcedure");
            return (Criteria) this;
        }

        public Criteria andDvProcedureGreaterThanOrEqualTo(String value) {
            addCriterion("dv_procedure >=", value, "dvProcedure");
            return (Criteria) this;
        }

        public Criteria andDvProcedureLessThan(String value) {
            addCriterion("dv_procedure <", value, "dvProcedure");
            return (Criteria) this;
        }

        public Criteria andDvProcedureLessThanOrEqualTo(String value) {
            addCriterion("dv_procedure <=", value, "dvProcedure");
            return (Criteria) this;
        }

        public Criteria andDvProcedureLike(String value) {
            addCriterion("dv_procedure like", value, "dvProcedure");
            return (Criteria) this;
        }

        public Criteria andDvProcedureNotLike(String value) {
            addCriterion("dv_procedure not like", value, "dvProcedure");
            return (Criteria) this;
        }

        public Criteria andDvProcedureIn(List<String> values) {
            addCriterion("dv_procedure in", values, "dvProcedure");
            return (Criteria) this;
        }

        public Criteria andDvProcedureNotIn(List<String> values) {
            addCriterion("dv_procedure not in", values, "dvProcedure");
            return (Criteria) this;
        }

        public Criteria andDvProcedureBetween(String value1, String value2) {
            addCriterion("dv_procedure between", value1, value2, "dvProcedure");
            return (Criteria) this;
        }

        public Criteria andDvProcedureNotBetween(String value1, String value2) {
            addCriterion("dv_procedure not between", value1, value2, "dvProcedure");
            return (Criteria) this;
        }

        public Criteria andDvItemIsNull() {
            addCriterion("dv_item is null");
            return (Criteria) this;
        }

        public Criteria andDvItemIsNotNull() {
            addCriterion("dv_item is not null");
            return (Criteria) this;
        }

        public Criteria andDvItemEqualTo(String value) {
            addCriterion("dv_item =", value, "dvItem");
            return (Criteria) this;
        }

        public Criteria andDvItemNotEqualTo(String value) {
            addCriterion("dv_item <>", value, "dvItem");
            return (Criteria) this;
        }

        public Criteria andDvItemGreaterThan(String value) {
            addCriterion("dv_item >", value, "dvItem");
            return (Criteria) this;
        }

        public Criteria andDvItemGreaterThanOrEqualTo(String value) {
            addCriterion("dv_item >=", value, "dvItem");
            return (Criteria) this;
        }

        public Criteria andDvItemLessThan(String value) {
            addCriterion("dv_item <", value, "dvItem");
            return (Criteria) this;
        }

        public Criteria andDvItemLessThanOrEqualTo(String value) {
            addCriterion("dv_item <=", value, "dvItem");
            return (Criteria) this;
        }

        public Criteria andDvItemLike(String value) {
            addCriterion("dv_item like", value, "dvItem");
            return (Criteria) this;
        }

        public Criteria andDvItemNotLike(String value) {
            addCriterion("dv_item not like", value, "dvItem");
            return (Criteria) this;
        }

        public Criteria andDvItemIn(List<String> values) {
            addCriterion("dv_item in", values, "dvItem");
            return (Criteria) this;
        }

        public Criteria andDvItemNotIn(List<String> values) {
            addCriterion("dv_item not in", values, "dvItem");
            return (Criteria) this;
        }

        public Criteria andDvItemBetween(String value1, String value2) {
            addCriterion("dv_item between", value1, value2, "dvItem");
            return (Criteria) this;
        }

        public Criteria andDvItemNotBetween(String value1, String value2) {
            addCriterion("dv_item not between", value1, value2, "dvItem");
            return (Criteria) this;
        }

        public Criteria andDvRequirementIsNull() {
            addCriterion("dv_requirement is null");
            return (Criteria) this;
        }

        public Criteria andDvRequirementIsNotNull() {
            addCriterion("dv_requirement is not null");
            return (Criteria) this;
        }

        public Criteria andDvRequirementEqualTo(String value) {
            addCriterion("dv_requirement =", value, "dvRequirement");
            return (Criteria) this;
        }

        public Criteria andDvRequirementNotEqualTo(String value) {
            addCriterion("dv_requirement <>", value, "dvRequirement");
            return (Criteria) this;
        }

        public Criteria andDvRequirementGreaterThan(String value) {
            addCriterion("dv_requirement >", value, "dvRequirement");
            return (Criteria) this;
        }

        public Criteria andDvRequirementGreaterThanOrEqualTo(String value) {
            addCriterion("dv_requirement >=", value, "dvRequirement");
            return (Criteria) this;
        }

        public Criteria andDvRequirementLessThan(String value) {
            addCriterion("dv_requirement <", value, "dvRequirement");
            return (Criteria) this;
        }

        public Criteria andDvRequirementLessThanOrEqualTo(String value) {
            addCriterion("dv_requirement <=", value, "dvRequirement");
            return (Criteria) this;
        }

        public Criteria andDvRequirementLike(String value) {
            addCriterion("dv_requirement like", value, "dvRequirement");
            return (Criteria) this;
        }

        public Criteria andDvRequirementNotLike(String value) {
            addCriterion("dv_requirement not like", value, "dvRequirement");
            return (Criteria) this;
        }

        public Criteria andDvRequirementIn(List<String> values) {
            addCriterion("dv_requirement in", values, "dvRequirement");
            return (Criteria) this;
        }

        public Criteria andDvRequirementNotIn(List<String> values) {
            addCriterion("dv_requirement not in", values, "dvRequirement");
            return (Criteria) this;
        }

        public Criteria andDvRequirementBetween(String value1, String value2) {
            addCriterion("dv_requirement between", value1, value2, "dvRequirement");
            return (Criteria) this;
        }

        public Criteria andDvRequirementNotBetween(String value1, String value2) {
            addCriterion("dv_requirement not between", value1, value2, "dvRequirement");
            return (Criteria) this;
        }

        public Criteria andDvResultIsNull() {
            addCriterion("dv_result is null");
            return (Criteria) this;
        }

        public Criteria andDvResultIsNotNull() {
            addCriterion("dv_result is not null");
            return (Criteria) this;
        }

        public Criteria andDvResultEqualTo(String value) {
            addCriterion("dv_result =", value, "dvResult");
            return (Criteria) this;
        }

        public Criteria andDvResultNotEqualTo(String value) {
            addCriterion("dv_result <>", value, "dvResult");
            return (Criteria) this;
        }

        public Criteria andDvResultGreaterThan(String value) {
            addCriterion("dv_result >", value, "dvResult");
            return (Criteria) this;
        }

        public Criteria andDvResultGreaterThanOrEqualTo(String value) {
            addCriterion("dv_result >=", value, "dvResult");
            return (Criteria) this;
        }

        public Criteria andDvResultLessThan(String value) {
            addCriterion("dv_result <", value, "dvResult");
            return (Criteria) this;
        }

        public Criteria andDvResultLessThanOrEqualTo(String value) {
            addCriterion("dv_result <=", value, "dvResult");
            return (Criteria) this;
        }

        public Criteria andDvResultLike(String value) {
            addCriterion("dv_result like", value, "dvResult");
            return (Criteria) this;
        }

        public Criteria andDvResultNotLike(String value) {
            addCriterion("dv_result not like", value, "dvResult");
            return (Criteria) this;
        }

        public Criteria andDvResultIn(List<String> values) {
            addCriterion("dv_result in", values, "dvResult");
            return (Criteria) this;
        }

        public Criteria andDvResultNotIn(List<String> values) {
            addCriterion("dv_result not in", values, "dvResult");
            return (Criteria) this;
        }

        public Criteria andDvResultBetween(String value1, String value2) {
            addCriterion("dv_result between", value1, value2, "dvResult");
            return (Criteria) this;
        }

        public Criteria andDvResultNotBetween(String value1, String value2) {
            addCriterion("dv_result not between", value1, value2, "dvResult");
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

        public Criteria andDvPersonIsNull() {
            addCriterion("dv_person is null");
            return (Criteria) this;
        }

        public Criteria andDvPersonIsNotNull() {
            addCriterion("dv_person is not null");
            return (Criteria) this;
        }

        public Criteria andDvPersonEqualTo(String value) {
            addCriterion("dv_person =", value, "dvPerson");
            return (Criteria) this;
        }

        public Criteria andDvPersonNotEqualTo(String value) {
            addCriterion("dv_person <>", value, "dvPerson");
            return (Criteria) this;
        }

        public Criteria andDvPersonGreaterThan(String value) {
            addCriterion("dv_person >", value, "dvPerson");
            return (Criteria) this;
        }

        public Criteria andDvPersonGreaterThanOrEqualTo(String value) {
            addCriterion("dv_person >=", value, "dvPerson");
            return (Criteria) this;
        }

        public Criteria andDvPersonLessThan(String value) {
            addCriterion("dv_person <", value, "dvPerson");
            return (Criteria) this;
        }

        public Criteria andDvPersonLessThanOrEqualTo(String value) {
            addCriterion("dv_person <=", value, "dvPerson");
            return (Criteria) this;
        }

        public Criteria andDvPersonLike(String value) {
            addCriterion("dv_person like", value, "dvPerson");
            return (Criteria) this;
        }

        public Criteria andDvPersonNotLike(String value) {
            addCriterion("dv_person not like", value, "dvPerson");
            return (Criteria) this;
        }

        public Criteria andDvPersonIn(List<String> values) {
            addCriterion("dv_person in", values, "dvPerson");
            return (Criteria) this;
        }

        public Criteria andDvPersonNotIn(List<String> values) {
            addCriterion("dv_person not in", values, "dvPerson");
            return (Criteria) this;
        }

        public Criteria andDvPersonBetween(String value1, String value2) {
            addCriterion("dv_person between", value1, value2, "dvPerson");
            return (Criteria) this;
        }

        public Criteria andDvPersonNotBetween(String value1, String value2) {
            addCriterion("dv_person not between", value1, value2, "dvPerson");
            return (Criteria) this;
        }

        public Criteria andDvAuthorizerIsNull() {
            addCriterion("dv_authorizer is null");
            return (Criteria) this;
        }

        public Criteria andDvAuthorizerIsNotNull() {
            addCriterion("dv_authorizer is not null");
            return (Criteria) this;
        }

        public Criteria andDvAuthorizerEqualTo(String value) {
            addCriterion("dv_authorizer =", value, "dvAuthorizer");
            return (Criteria) this;
        }

        public Criteria andDvAuthorizerNotEqualTo(String value) {
            addCriterion("dv_authorizer <>", value, "dvAuthorizer");
            return (Criteria) this;
        }

        public Criteria andDvAuthorizerGreaterThan(String value) {
            addCriterion("dv_authorizer >", value, "dvAuthorizer");
            return (Criteria) this;
        }

        public Criteria andDvAuthorizerGreaterThanOrEqualTo(String value) {
            addCriterion("dv_authorizer >=", value, "dvAuthorizer");
            return (Criteria) this;
        }

        public Criteria andDvAuthorizerLessThan(String value) {
            addCriterion("dv_authorizer <", value, "dvAuthorizer");
            return (Criteria) this;
        }

        public Criteria andDvAuthorizerLessThanOrEqualTo(String value) {
            addCriterion("dv_authorizer <=", value, "dvAuthorizer");
            return (Criteria) this;
        }

        public Criteria andDvAuthorizerLike(String value) {
            addCriterion("dv_authorizer like", value, "dvAuthorizer");
            return (Criteria) this;
        }

        public Criteria andDvAuthorizerNotLike(String value) {
            addCriterion("dv_authorizer not like", value, "dvAuthorizer");
            return (Criteria) this;
        }

        public Criteria andDvAuthorizerIn(List<String> values) {
            addCriterion("dv_authorizer in", values, "dvAuthorizer");
            return (Criteria) this;
        }

        public Criteria andDvAuthorizerNotIn(List<String> values) {
            addCriterion("dv_authorizer not in", values, "dvAuthorizer");
            return (Criteria) this;
        }

        public Criteria andDvAuthorizerBetween(String value1, String value2) {
            addCriterion("dv_authorizer between", value1, value2, "dvAuthorizer");
            return (Criteria) this;
        }

        public Criteria andDvAuthorizerNotBetween(String value1, String value2) {
            addCriterion("dv_authorizer not between", value1, value2, "dvAuthorizer");
            return (Criteria) this;
        }

        public Criteria andDvAuthTimeIsNull() {
            addCriterion("dv_auth_time is null");
            return (Criteria) this;
        }

        public Criteria andDvAuthTimeIsNotNull() {
            addCriterion("dv_auth_time is not null");
            return (Criteria) this;
        }

        public Criteria andDvAuthTimeEqualTo(Date value) {
            addCriterion("dv_auth_time =", value, "dvAuthTime");
            return (Criteria) this;
        }

        public Criteria andDvAuthTimeNotEqualTo(Date value) {
            addCriterion("dv_auth_time <>", value, "dvAuthTime");
            return (Criteria) this;
        }

        public Criteria andDvAuthTimeGreaterThan(Date value) {
            addCriterion("dv_auth_time >", value, "dvAuthTime");
            return (Criteria) this;
        }

        public Criteria andDvAuthTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dv_auth_time >=", value, "dvAuthTime");
            return (Criteria) this;
        }

        public Criteria andDvAuthTimeLessThan(Date value) {
            addCriterion("dv_auth_time <", value, "dvAuthTime");
            return (Criteria) this;
        }

        public Criteria andDvAuthTimeLessThanOrEqualTo(Date value) {
            addCriterion("dv_auth_time <=", value, "dvAuthTime");
            return (Criteria) this;
        }

        public Criteria andDvAuthTimeIn(List<Date> values) {
            addCriterion("dv_auth_time in", values, "dvAuthTime");
            return (Criteria) this;
        }

        public Criteria andDvAuthTimeNotIn(List<Date> values) {
            addCriterion("dv_auth_time not in", values, "dvAuthTime");
            return (Criteria) this;
        }

        public Criteria andDvAuthTimeBetween(Date value1, Date value2) {
            addCriterion("dv_auth_time between", value1, value2, "dvAuthTime");
            return (Criteria) this;
        }

        public Criteria andDvAuthTimeNotBetween(Date value1, Date value2) {
            addCriterion("dv_auth_time not between", value1, value2, "dvAuthTime");
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