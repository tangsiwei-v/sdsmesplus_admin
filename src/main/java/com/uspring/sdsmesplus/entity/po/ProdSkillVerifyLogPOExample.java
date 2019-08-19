package com.uspring.sdsmesplus.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProdSkillVerifyLogPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProdSkillVerifyLogPOExample() {
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

        public Criteria andSvIdIsNull() {
            addCriterion("sv_id is null");
            return (Criteria) this;
        }

        public Criteria andSvIdIsNotNull() {
            addCriterion("sv_id is not null");
            return (Criteria) this;
        }

        public Criteria andSvIdEqualTo(Integer value) {
            addCriterion("sv_id =", value, "svId");
            return (Criteria) this;
        }

        public Criteria andSvIdNotEqualTo(Integer value) {
            addCriterion("sv_id <>", value, "svId");
            return (Criteria) this;
        }

        public Criteria andSvIdGreaterThan(Integer value) {
            addCriterion("sv_id >", value, "svId");
            return (Criteria) this;
        }

        public Criteria andSvIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sv_id >=", value, "svId");
            return (Criteria) this;
        }

        public Criteria andSvIdLessThan(Integer value) {
            addCriterion("sv_id <", value, "svId");
            return (Criteria) this;
        }

        public Criteria andSvIdLessThanOrEqualTo(Integer value) {
            addCriterion("sv_id <=", value, "svId");
            return (Criteria) this;
        }

        public Criteria andSvIdIn(List<Integer> values) {
            addCriterion("sv_id in", values, "svId");
            return (Criteria) this;
        }

        public Criteria andSvIdNotIn(List<Integer> values) {
            addCriterion("sv_id not in", values, "svId");
            return (Criteria) this;
        }

        public Criteria andSvIdBetween(Integer value1, Integer value2) {
            addCriterion("sv_id between", value1, value2, "svId");
            return (Criteria) this;
        }

        public Criteria andSvIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sv_id not between", value1, value2, "svId");
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

        public Criteria andShiftIdEqualTo(Integer value) {
            addCriterion("shift_id =", value, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdNotEqualTo(Integer value) {
            addCriterion("shift_id <>", value, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdGreaterThan(Integer value) {
            addCriterion("shift_id >", value, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shift_id >=", value, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdLessThan(Integer value) {
            addCriterion("shift_id <", value, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdLessThanOrEqualTo(Integer value) {
            addCriterion("shift_id <=", value, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdIn(List<Integer> values) {
            addCriterion("shift_id in", values, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdNotIn(List<Integer> values) {
            addCriterion("shift_id not in", values, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdBetween(Integer value1, Integer value2) {
            addCriterion("shift_id between", value1, value2, "shiftId");
            return (Criteria) this;
        }

        public Criteria andShiftIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andSvProcedureIsNull() {
            addCriterion("sv_procedure is null");
            return (Criteria) this;
        }

        public Criteria andSvProcedureIsNotNull() {
            addCriterion("sv_procedure is not null");
            return (Criteria) this;
        }

        public Criteria andSvProcedureEqualTo(String value) {
            addCriterion("sv_procedure =", value, "svProcedure");
            return (Criteria) this;
        }

        public Criteria andSvProcedureNotEqualTo(String value) {
            addCriterion("sv_procedure <>", value, "svProcedure");
            return (Criteria) this;
        }

        public Criteria andSvProcedureGreaterThan(String value) {
            addCriterion("sv_procedure >", value, "svProcedure");
            return (Criteria) this;
        }

        public Criteria andSvProcedureGreaterThanOrEqualTo(String value) {
            addCriterion("sv_procedure >=", value, "svProcedure");
            return (Criteria) this;
        }

        public Criteria andSvProcedureLessThan(String value) {
            addCriterion("sv_procedure <", value, "svProcedure");
            return (Criteria) this;
        }

        public Criteria andSvProcedureLessThanOrEqualTo(String value) {
            addCriterion("sv_procedure <=", value, "svProcedure");
            return (Criteria) this;
        }

        public Criteria andSvProcedureLike(String value) {
            addCriterion("sv_procedure like", value, "svProcedure");
            return (Criteria) this;
        }

        public Criteria andSvProcedureNotLike(String value) {
            addCriterion("sv_procedure not like", value, "svProcedure");
            return (Criteria) this;
        }

        public Criteria andSvProcedureIn(List<String> values) {
            addCriterion("sv_procedure in", values, "svProcedure");
            return (Criteria) this;
        }

        public Criteria andSvProcedureNotIn(List<String> values) {
            addCriterion("sv_procedure not in", values, "svProcedure");
            return (Criteria) this;
        }

        public Criteria andSvProcedureBetween(String value1, String value2) {
            addCriterion("sv_procedure between", value1, value2, "svProcedure");
            return (Criteria) this;
        }

        public Criteria andSvProcedureNotBetween(String value1, String value2) {
            addCriterion("sv_procedure not between", value1, value2, "svProcedure");
            return (Criteria) this;
        }

        public Criteria andSvMachineIsNull() {
            addCriterion("sv_machine is null");
            return (Criteria) this;
        }

        public Criteria andSvMachineIsNotNull() {
            addCriterion("sv_machine is not null");
            return (Criteria) this;
        }

        public Criteria andSvMachineEqualTo(String value) {
            addCriterion("sv_machine =", value, "svMachine");
            return (Criteria) this;
        }

        public Criteria andSvMachineNotEqualTo(String value) {
            addCriterion("sv_machine <>", value, "svMachine");
            return (Criteria) this;
        }

        public Criteria andSvMachineGreaterThan(String value) {
            addCriterion("sv_machine >", value, "svMachine");
            return (Criteria) this;
        }

        public Criteria andSvMachineGreaterThanOrEqualTo(String value) {
            addCriterion("sv_machine >=", value, "svMachine");
            return (Criteria) this;
        }

        public Criteria andSvMachineLessThan(String value) {
            addCriterion("sv_machine <", value, "svMachine");
            return (Criteria) this;
        }

        public Criteria andSvMachineLessThanOrEqualTo(String value) {
            addCriterion("sv_machine <=", value, "svMachine");
            return (Criteria) this;
        }

        public Criteria andSvMachineLike(String value) {
            addCriterion("sv_machine like", value, "svMachine");
            return (Criteria) this;
        }

        public Criteria andSvMachineNotLike(String value) {
            addCriterion("sv_machine not like", value, "svMachine");
            return (Criteria) this;
        }

        public Criteria andSvMachineIn(List<String> values) {
            addCriterion("sv_machine in", values, "svMachine");
            return (Criteria) this;
        }

        public Criteria andSvMachineNotIn(List<String> values) {
            addCriterion("sv_machine not in", values, "svMachine");
            return (Criteria) this;
        }

        public Criteria andSvMachineBetween(String value1, String value2) {
            addCriterion("sv_machine between", value1, value2, "svMachine");
            return (Criteria) this;
        }

        public Criteria andSvMachineNotBetween(String value1, String value2) {
            addCriterion("sv_machine not between", value1, value2, "svMachine");
            return (Criteria) this;
        }

        public Criteria andSvSkillNeedIsNull() {
            addCriterion("sv_skill_need is null");
            return (Criteria) this;
        }

        public Criteria andSvSkillNeedIsNotNull() {
            addCriterion("sv_skill_need is not null");
            return (Criteria) this;
        }

        public Criteria andSvSkillNeedEqualTo(String value) {
            addCriterion("sv_skill_need =", value, "svSkillNeed");
            return (Criteria) this;
        }

        public Criteria andSvSkillNeedNotEqualTo(String value) {
            addCriterion("sv_skill_need <>", value, "svSkillNeed");
            return (Criteria) this;
        }

        public Criteria andSvSkillNeedGreaterThan(String value) {
            addCriterion("sv_skill_need >", value, "svSkillNeed");
            return (Criteria) this;
        }

        public Criteria andSvSkillNeedGreaterThanOrEqualTo(String value) {
            addCriterion("sv_skill_need >=", value, "svSkillNeed");
            return (Criteria) this;
        }

        public Criteria andSvSkillNeedLessThan(String value) {
            addCriterion("sv_skill_need <", value, "svSkillNeed");
            return (Criteria) this;
        }

        public Criteria andSvSkillNeedLessThanOrEqualTo(String value) {
            addCriterion("sv_skill_need <=", value, "svSkillNeed");
            return (Criteria) this;
        }

        public Criteria andSvSkillNeedLike(String value) {
            addCriterion("sv_skill_need like", value, "svSkillNeed");
            return (Criteria) this;
        }

        public Criteria andSvSkillNeedNotLike(String value) {
            addCriterion("sv_skill_need not like", value, "svSkillNeed");
            return (Criteria) this;
        }

        public Criteria andSvSkillNeedIn(List<String> values) {
            addCriterion("sv_skill_need in", values, "svSkillNeed");
            return (Criteria) this;
        }

        public Criteria andSvSkillNeedNotIn(List<String> values) {
            addCriterion("sv_skill_need not in", values, "svSkillNeed");
            return (Criteria) this;
        }

        public Criteria andSvSkillNeedBetween(String value1, String value2) {
            addCriterion("sv_skill_need between", value1, value2, "svSkillNeed");
            return (Criteria) this;
        }

        public Criteria andSvSkillNeedNotBetween(String value1, String value2) {
            addCriterion("sv_skill_need not between", value1, value2, "svSkillNeed");
            return (Criteria) this;
        }

        public Criteria andSvSkillRealIsNull() {
            addCriterion("sv_skill_real is null");
            return (Criteria) this;
        }

        public Criteria andSvSkillRealIsNotNull() {
            addCriterion("sv_skill_real is not null");
            return (Criteria) this;
        }

        public Criteria andSvSkillRealEqualTo(String value) {
            addCriterion("sv_skill_real =", value, "svSkillReal");
            return (Criteria) this;
        }

        public Criteria andSvSkillRealNotEqualTo(String value) {
            addCriterion("sv_skill_real <>", value, "svSkillReal");
            return (Criteria) this;
        }

        public Criteria andSvSkillRealGreaterThan(String value) {
            addCriterion("sv_skill_real >", value, "svSkillReal");
            return (Criteria) this;
        }

        public Criteria andSvSkillRealGreaterThanOrEqualTo(String value) {
            addCriterion("sv_skill_real >=", value, "svSkillReal");
            return (Criteria) this;
        }

        public Criteria andSvSkillRealLessThan(String value) {
            addCriterion("sv_skill_real <", value, "svSkillReal");
            return (Criteria) this;
        }

        public Criteria andSvSkillRealLessThanOrEqualTo(String value) {
            addCriterion("sv_skill_real <=", value, "svSkillReal");
            return (Criteria) this;
        }

        public Criteria andSvSkillRealLike(String value) {
            addCriterion("sv_skill_real like", value, "svSkillReal");
            return (Criteria) this;
        }

        public Criteria andSvSkillRealNotLike(String value) {
            addCriterion("sv_skill_real not like", value, "svSkillReal");
            return (Criteria) this;
        }

        public Criteria andSvSkillRealIn(List<String> values) {
            addCriterion("sv_skill_real in", values, "svSkillReal");
            return (Criteria) this;
        }

        public Criteria andSvSkillRealNotIn(List<String> values) {
            addCriterion("sv_skill_real not in", values, "svSkillReal");
            return (Criteria) this;
        }

        public Criteria andSvSkillRealBetween(String value1, String value2) {
            addCriterion("sv_skill_real between", value1, value2, "svSkillReal");
            return (Criteria) this;
        }

        public Criteria andSvSkillRealNotBetween(String value1, String value2) {
            addCriterion("sv_skill_real not between", value1, value2, "svSkillReal");
            return (Criteria) this;
        }

        public Criteria andEmpNumberIsNull() {
            addCriterion("emp_number is null");
            return (Criteria) this;
        }

        public Criteria andEmpNumberIsNotNull() {
            addCriterion("emp_number is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNumberEqualTo(String value) {
            addCriterion("emp_number =", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberNotEqualTo(String value) {
            addCriterion("emp_number <>", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberGreaterThan(String value) {
            addCriterion("emp_number >", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberGreaterThanOrEqualTo(String value) {
            addCriterion("emp_number >=", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberLessThan(String value) {
            addCriterion("emp_number <", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberLessThanOrEqualTo(String value) {
            addCriterion("emp_number <=", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberLike(String value) {
            addCriterion("emp_number like", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberNotLike(String value) {
            addCriterion("emp_number not like", value, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberIn(List<String> values) {
            addCriterion("emp_number in", values, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberNotIn(List<String> values) {
            addCriterion("emp_number not in", values, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberBetween(String value1, String value2) {
            addCriterion("emp_number between", value1, value2, "empNumber");
            return (Criteria) this;
        }

        public Criteria andEmpNumberNotBetween(String value1, String value2) {
            addCriterion("emp_number not between", value1, value2, "empNumber");
            return (Criteria) this;
        }

        public Criteria andSvResultIsNull() {
            addCriterion("sv_result is null");
            return (Criteria) this;
        }

        public Criteria andSvResultIsNotNull() {
            addCriterion("sv_result is not null");
            return (Criteria) this;
        }

        public Criteria andSvResultEqualTo(String value) {
            addCriterion("sv_result =", value, "svResult");
            return (Criteria) this;
        }

        public Criteria andSvResultNotEqualTo(String value) {
            addCriterion("sv_result <>", value, "svResult");
            return (Criteria) this;
        }

        public Criteria andSvResultGreaterThan(String value) {
            addCriterion("sv_result >", value, "svResult");
            return (Criteria) this;
        }

        public Criteria andSvResultGreaterThanOrEqualTo(String value) {
            addCriterion("sv_result >=", value, "svResult");
            return (Criteria) this;
        }

        public Criteria andSvResultLessThan(String value) {
            addCriterion("sv_result <", value, "svResult");
            return (Criteria) this;
        }

        public Criteria andSvResultLessThanOrEqualTo(String value) {
            addCriterion("sv_result <=", value, "svResult");
            return (Criteria) this;
        }

        public Criteria andSvResultLike(String value) {
            addCriterion("sv_result like", value, "svResult");
            return (Criteria) this;
        }

        public Criteria andSvResultNotLike(String value) {
            addCriterion("sv_result not like", value, "svResult");
            return (Criteria) this;
        }

        public Criteria andSvResultIn(List<String> values) {
            addCriterion("sv_result in", values, "svResult");
            return (Criteria) this;
        }

        public Criteria andSvResultNotIn(List<String> values) {
            addCriterion("sv_result not in", values, "svResult");
            return (Criteria) this;
        }

        public Criteria andSvResultBetween(String value1, String value2) {
            addCriterion("sv_result between", value1, value2, "svResult");
            return (Criteria) this;
        }

        public Criteria andSvResultNotBetween(String value1, String value2) {
            addCriterion("sv_result not between", value1, value2, "svResult");
            return (Criteria) this;
        }

        public Criteria andSvAuthorizerIsNull() {
            addCriterion("sv_authorizer is null");
            return (Criteria) this;
        }

        public Criteria andSvAuthorizerIsNotNull() {
            addCriterion("sv_authorizer is not null");
            return (Criteria) this;
        }

        public Criteria andSvAuthorizerEqualTo(String value) {
            addCriterion("sv_authorizer =", value, "svAuthorizer");
            return (Criteria) this;
        }

        public Criteria andSvAuthorizerNotEqualTo(String value) {
            addCriterion("sv_authorizer <>", value, "svAuthorizer");
            return (Criteria) this;
        }

        public Criteria andSvAuthorizerGreaterThan(String value) {
            addCriterion("sv_authorizer >", value, "svAuthorizer");
            return (Criteria) this;
        }

        public Criteria andSvAuthorizerGreaterThanOrEqualTo(String value) {
            addCriterion("sv_authorizer >=", value, "svAuthorizer");
            return (Criteria) this;
        }

        public Criteria andSvAuthorizerLessThan(String value) {
            addCriterion("sv_authorizer <", value, "svAuthorizer");
            return (Criteria) this;
        }

        public Criteria andSvAuthorizerLessThanOrEqualTo(String value) {
            addCriterion("sv_authorizer <=", value, "svAuthorizer");
            return (Criteria) this;
        }

        public Criteria andSvAuthorizerLike(String value) {
            addCriterion("sv_authorizer like", value, "svAuthorizer");
            return (Criteria) this;
        }

        public Criteria andSvAuthorizerNotLike(String value) {
            addCriterion("sv_authorizer not like", value, "svAuthorizer");
            return (Criteria) this;
        }

        public Criteria andSvAuthorizerIn(List<String> values) {
            addCriterion("sv_authorizer in", values, "svAuthorizer");
            return (Criteria) this;
        }

        public Criteria andSvAuthorizerNotIn(List<String> values) {
            addCriterion("sv_authorizer not in", values, "svAuthorizer");
            return (Criteria) this;
        }

        public Criteria andSvAuthorizerBetween(String value1, String value2) {
            addCriterion("sv_authorizer between", value1, value2, "svAuthorizer");
            return (Criteria) this;
        }

        public Criteria andSvAuthorizerNotBetween(String value1, String value2) {
            addCriterion("sv_authorizer not between", value1, value2, "svAuthorizer");
            return (Criteria) this;
        }

        public Criteria andSvAuthTimeIsNull() {
            addCriterion("sv_auth_time is null");
            return (Criteria) this;
        }

        public Criteria andSvAuthTimeIsNotNull() {
            addCriterion("sv_auth_time is not null");
            return (Criteria) this;
        }

        public Criteria andSvAuthTimeEqualTo(Date value) {
            addCriterion("sv_auth_time =", value, "svAuthTime");
            return (Criteria) this;
        }

        public Criteria andSvAuthTimeNotEqualTo(Date value) {
            addCriterion("sv_auth_time <>", value, "svAuthTime");
            return (Criteria) this;
        }

        public Criteria andSvAuthTimeGreaterThan(Date value) {
            addCriterion("sv_auth_time >", value, "svAuthTime");
            return (Criteria) this;
        }

        public Criteria andSvAuthTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sv_auth_time >=", value, "svAuthTime");
            return (Criteria) this;
        }

        public Criteria andSvAuthTimeLessThan(Date value) {
            addCriterion("sv_auth_time <", value, "svAuthTime");
            return (Criteria) this;
        }

        public Criteria andSvAuthTimeLessThanOrEqualTo(Date value) {
            addCriterion("sv_auth_time <=", value, "svAuthTime");
            return (Criteria) this;
        }

        public Criteria andSvAuthTimeIn(List<Date> values) {
            addCriterion("sv_auth_time in", values, "svAuthTime");
            return (Criteria) this;
        }

        public Criteria andSvAuthTimeNotIn(List<Date> values) {
            addCriterion("sv_auth_time not in", values, "svAuthTime");
            return (Criteria) this;
        }

        public Criteria andSvAuthTimeBetween(Date value1, Date value2) {
            addCriterion("sv_auth_time between", value1, value2, "svAuthTime");
            return (Criteria) this;
        }

        public Criteria andSvAuthTimeNotBetween(Date value1, Date value2) {
            addCriterion("sv_auth_time not between", value1, value2, "svAuthTime");
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