package com.uspring.sdsmesplus.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PlanOrderPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlanOrderPOExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andPoIdIsNull() {
            addCriterion("po_id is null");
            return (Criteria) this;
        }

        public Criteria andPoIdIsNotNull() {
            addCriterion("po_id is not null");
            return (Criteria) this;
        }

        public Criteria andPoIdEqualTo(Integer value) {
            addCriterion("po_id =", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdNotEqualTo(Integer value) {
            addCriterion("po_id <>", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdGreaterThan(Integer value) {
            addCriterion("po_id >", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("po_id >=", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdLessThan(Integer value) {
            addCriterion("po_id <", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdLessThanOrEqualTo(Integer value) {
            addCriterion("po_id <=", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdIn(List<Integer> values) {
            addCriterion("po_id in", values, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdNotIn(List<Integer> values) {
            addCriterion("po_id not in", values, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdBetween(Integer value1, Integer value2) {
            addCriterion("po_id between", value1, value2, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("po_id not between", value1, value2, "poId");
            return (Criteria) this;
        }

        public Criteria andFcCodeIsNull() {
            addCriterion("fc_code is null");
            return (Criteria) this;
        }

        public Criteria andFcCodeIsNotNull() {
            addCriterion("fc_code is not null");
            return (Criteria) this;
        }

        public Criteria andFcCodeEqualTo(String value) {
            addCriterion("fc_code =", value, "fcCode");
            return (Criteria) this;
        }

        public Criteria andFcCodeNotEqualTo(String value) {
            addCriterion("fc_code <>", value, "fcCode");
            return (Criteria) this;
        }

        public Criteria andFcCodeGreaterThan(String value) {
            addCriterion("fc_code >", value, "fcCode");
            return (Criteria) this;
        }

        public Criteria andFcCodeGreaterThanOrEqualTo(String value) {
            addCriterion("fc_code >=", value, "fcCode");
            return (Criteria) this;
        }

        public Criteria andFcCodeLessThan(String value) {
            addCriterion("fc_code <", value, "fcCode");
            return (Criteria) this;
        }

        public Criteria andFcCodeLessThanOrEqualTo(String value) {
            addCriterion("fc_code <=", value, "fcCode");
            return (Criteria) this;
        }

        public Criteria andFcCodeLike(String value) {
            addCriterion("fc_code like", value, "fcCode");
            return (Criteria) this;
        }

        public Criteria andFcCodeNotLike(String value) {
            addCriterion("fc_code not like", value, "fcCode");
            return (Criteria) this;
        }

        public Criteria andFcCodeIn(List<String> values) {
            addCriterion("fc_code in", values, "fcCode");
            return (Criteria) this;
        }

        public Criteria andFcCodeNotIn(List<String> values) {
            addCriterion("fc_code not in", values, "fcCode");
            return (Criteria) this;
        }

        public Criteria andFcCodeBetween(String value1, String value2) {
            addCriterion("fc_code between", value1, value2, "fcCode");
            return (Criteria) this;
        }

        public Criteria andFcCodeNotBetween(String value1, String value2) {
            addCriterion("fc_code not between", value1, value2, "fcCode");
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

        public Criteria andCustomerCodeIsNull() {
            addCriterion("customer_code is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeIsNotNull() {
            addCriterion("customer_code is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeEqualTo(String value) {
            addCriterion("customer_code =", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotEqualTo(String value) {
            addCriterion("customer_code <>", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeGreaterThan(String value) {
            addCriterion("customer_code >", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("customer_code >=", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLessThan(String value) {
            addCriterion("customer_code <", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLessThanOrEqualTo(String value) {
            addCriterion("customer_code <=", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLike(String value) {
            addCriterion("customer_code like", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotLike(String value) {
            addCriterion("customer_code not like", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeIn(List<String> values) {
            addCriterion("customer_code in", values, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotIn(List<String> values) {
            addCriterion("customer_code not in", values, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeBetween(String value1, String value2) {
            addCriterion("customer_code between", value1, value2, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotBetween(String value1, String value2) {
            addCriterion("customer_code not between", value1, value2, "customerCode");
            return (Criteria) this;
        }

        public Criteria andPoStartDateIsNull() {
            addCriterion("po_start_date is null");
            return (Criteria) this;
        }

        public Criteria andPoStartDateIsNotNull() {
            addCriterion("po_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andPoStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("po_start_date =", value, "poStartDate");
            return (Criteria) this;
        }

        public Criteria andPoStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("po_start_date <>", value, "poStartDate");
            return (Criteria) this;
        }

        public Criteria andPoStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("po_start_date >", value, "poStartDate");
            return (Criteria) this;
        }

        public Criteria andPoStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("po_start_date >=", value, "poStartDate");
            return (Criteria) this;
        }

        public Criteria andPoStartDateLessThan(Date value) {
            addCriterionForJDBCDate("po_start_date <", value, "poStartDate");
            return (Criteria) this;
        }

        public Criteria andPoStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("po_start_date <=", value, "poStartDate");
            return (Criteria) this;
        }

        public Criteria andPoStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("po_start_date in", values, "poStartDate");
            return (Criteria) this;
        }

        public Criteria andPoStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("po_start_date not in", values, "poStartDate");
            return (Criteria) this;
        }

        public Criteria andPoStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("po_start_date between", value1, value2, "poStartDate");
            return (Criteria) this;
        }

        public Criteria andPoStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("po_start_date not between", value1, value2, "poStartDate");
            return (Criteria) this;
        }

        public Criteria andPoStartTimeIsNull() {
            addCriterion("po_start_time is null");
            return (Criteria) this;
        }

        public Criteria andPoStartTimeIsNotNull() {
            addCriterion("po_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andPoStartTimeEqualTo(Date value) {
            addCriterionForJDBCTime("po_start_time =", value, "poStartTime");
            return (Criteria) this;
        }

        public Criteria andPoStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("po_start_time <>", value, "poStartTime");
            return (Criteria) this;
        }

        public Criteria andPoStartTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("po_start_time >", value, "poStartTime");
            return (Criteria) this;
        }

        public Criteria andPoStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("po_start_time >=", value, "poStartTime");
            return (Criteria) this;
        }

        public Criteria andPoStartTimeLessThan(Date value) {
            addCriterionForJDBCTime("po_start_time <", value, "poStartTime");
            return (Criteria) this;
        }

        public Criteria andPoStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("po_start_time <=", value, "poStartTime");
            return (Criteria) this;
        }

        public Criteria andPoStartTimeIn(List<Date> values) {
            addCriterionForJDBCTime("po_start_time in", values, "poStartTime");
            return (Criteria) this;
        }

        public Criteria andPoStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("po_start_time not in", values, "poStartTime");
            return (Criteria) this;
        }

        public Criteria andPoStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("po_start_time between", value1, value2, "poStartTime");
            return (Criteria) this;
        }

        public Criteria andPoStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("po_start_time not between", value1, value2, "poStartTime");
            return (Criteria) this;
        }

        public Criteria andPoEndDateIsNull() {
            addCriterion("po_end_date is null");
            return (Criteria) this;
        }

        public Criteria andPoEndDateIsNotNull() {
            addCriterion("po_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andPoEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("po_end_date =", value, "poEndDate");
            return (Criteria) this;
        }

        public Criteria andPoEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("po_end_date <>", value, "poEndDate");
            return (Criteria) this;
        }

        public Criteria andPoEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("po_end_date >", value, "poEndDate");
            return (Criteria) this;
        }

        public Criteria andPoEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("po_end_date >=", value, "poEndDate");
            return (Criteria) this;
        }

        public Criteria andPoEndDateLessThan(Date value) {
            addCriterionForJDBCDate("po_end_date <", value, "poEndDate");
            return (Criteria) this;
        }

        public Criteria andPoEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("po_end_date <=", value, "poEndDate");
            return (Criteria) this;
        }

        public Criteria andPoEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("po_end_date in", values, "poEndDate");
            return (Criteria) this;
        }

        public Criteria andPoEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("po_end_date not in", values, "poEndDate");
            return (Criteria) this;
        }

        public Criteria andPoEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("po_end_date between", value1, value2, "poEndDate");
            return (Criteria) this;
        }

        public Criteria andPoEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("po_end_date not between", value1, value2, "poEndDate");
            return (Criteria) this;
        }

        public Criteria andPoEndTimeIsNull() {
            addCriterion("po_end_time is null");
            return (Criteria) this;
        }

        public Criteria andPoEndTimeIsNotNull() {
            addCriterion("po_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andPoEndTimeEqualTo(Date value) {
            addCriterionForJDBCTime("po_end_time =", value, "poEndTime");
            return (Criteria) this;
        }

        public Criteria andPoEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("po_end_time <>", value, "poEndTime");
            return (Criteria) this;
        }

        public Criteria andPoEndTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("po_end_time >", value, "poEndTime");
            return (Criteria) this;
        }

        public Criteria andPoEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("po_end_time >=", value, "poEndTime");
            return (Criteria) this;
        }

        public Criteria andPoEndTimeLessThan(Date value) {
            addCriterionForJDBCTime("po_end_time <", value, "poEndTime");
            return (Criteria) this;
        }

        public Criteria andPoEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("po_end_time <=", value, "poEndTime");
            return (Criteria) this;
        }

        public Criteria andPoEndTimeIn(List<Date> values) {
            addCriterionForJDBCTime("po_end_time in", values, "poEndTime");
            return (Criteria) this;
        }

        public Criteria andPoEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("po_end_time not in", values, "poEndTime");
            return (Criteria) this;
        }

        public Criteria andPoEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("po_end_time between", value1, value2, "poEndTime");
            return (Criteria) this;
        }

        public Criteria andPoEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("po_end_time not between", value1, value2, "poEndTime");
            return (Criteria) this;
        }

        public Criteria andPoStartDatetimeIsNull() {
            addCriterion("po_start_datetime is null");
            return (Criteria) this;
        }

        public Criteria andPoStartDatetimeIsNotNull() {
            addCriterion("po_start_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andPoStartDatetimeEqualTo(Date value) {
            addCriterion("po_start_datetime =", value, "poStartDatetime");
            return (Criteria) this;
        }

        public Criteria andPoStartDatetimeNotEqualTo(Date value) {
            addCriterion("po_start_datetime <>", value, "poStartDatetime");
            return (Criteria) this;
        }

        public Criteria andPoStartDatetimeGreaterThan(Date value) {
            addCriterion("po_start_datetime >", value, "poStartDatetime");
            return (Criteria) this;
        }

        public Criteria andPoStartDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("po_start_datetime >=", value, "poStartDatetime");
            return (Criteria) this;
        }

        public Criteria andPoStartDatetimeLessThan(Date value) {
            addCriterion("po_start_datetime <", value, "poStartDatetime");
            return (Criteria) this;
        }

        public Criteria andPoStartDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("po_start_datetime <=", value, "poStartDatetime");
            return (Criteria) this;
        }

        public Criteria andPoStartDatetimeIn(List<Date> values) {
            addCriterion("po_start_datetime in", values, "poStartDatetime");
            return (Criteria) this;
        }

        public Criteria andPoStartDatetimeNotIn(List<Date> values) {
            addCriterion("po_start_datetime not in", values, "poStartDatetime");
            return (Criteria) this;
        }

        public Criteria andPoStartDatetimeBetween(Date value1, Date value2) {
            addCriterion("po_start_datetime between", value1, value2, "poStartDatetime");
            return (Criteria) this;
        }

        public Criteria andPoStartDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("po_start_datetime not between", value1, value2, "poStartDatetime");
            return (Criteria) this;
        }

        public Criteria andPoEndDatetimeIsNull() {
            addCriterion("po_end_datetime is null");
            return (Criteria) this;
        }

        public Criteria andPoEndDatetimeIsNotNull() {
            addCriterion("po_end_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andPoEndDatetimeEqualTo(Date value) {
            addCriterion("po_end_datetime =", value, "poEndDatetime");
            return (Criteria) this;
        }

        public Criteria andPoEndDatetimeNotEqualTo(Date value) {
            addCriterion("po_end_datetime <>", value, "poEndDatetime");
            return (Criteria) this;
        }

        public Criteria andPoEndDatetimeGreaterThan(Date value) {
            addCriterion("po_end_datetime >", value, "poEndDatetime");
            return (Criteria) this;
        }

        public Criteria andPoEndDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("po_end_datetime >=", value, "poEndDatetime");
            return (Criteria) this;
        }

        public Criteria andPoEndDatetimeLessThan(Date value) {
            addCriterion("po_end_datetime <", value, "poEndDatetime");
            return (Criteria) this;
        }

        public Criteria andPoEndDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("po_end_datetime <=", value, "poEndDatetime");
            return (Criteria) this;
        }

        public Criteria andPoEndDatetimeIn(List<Date> values) {
            addCriterion("po_end_datetime in", values, "poEndDatetime");
            return (Criteria) this;
        }

        public Criteria andPoEndDatetimeNotIn(List<Date> values) {
            addCriterion("po_end_datetime not in", values, "poEndDatetime");
            return (Criteria) this;
        }

        public Criteria andPoEndDatetimeBetween(Date value1, Date value2) {
            addCriterion("po_end_datetime between", value1, value2, "poEndDatetime");
            return (Criteria) this;
        }

        public Criteria andPoEndDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("po_end_datetime not between", value1, value2, "poEndDatetime");
            return (Criteria) this;
        }

        public Criteria andPoCountIsNull() {
            addCriterion("po_count is null");
            return (Criteria) this;
        }

        public Criteria andPoCountIsNotNull() {
            addCriterion("po_count is not null");
            return (Criteria) this;
        }

        public Criteria andPoCountEqualTo(Integer value) {
            addCriterion("po_count =", value, "poCount");
            return (Criteria) this;
        }

        public Criteria andPoCountNotEqualTo(Integer value) {
            addCriterion("po_count <>", value, "poCount");
            return (Criteria) this;
        }

        public Criteria andPoCountGreaterThan(Integer value) {
            addCriterion("po_count >", value, "poCount");
            return (Criteria) this;
        }

        public Criteria andPoCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("po_count >=", value, "poCount");
            return (Criteria) this;
        }

        public Criteria andPoCountLessThan(Integer value) {
            addCriterion("po_count <", value, "poCount");
            return (Criteria) this;
        }

        public Criteria andPoCountLessThanOrEqualTo(Integer value) {
            addCriterion("po_count <=", value, "poCount");
            return (Criteria) this;
        }

        public Criteria andPoCountIn(List<Integer> values) {
            addCriterion("po_count in", values, "poCount");
            return (Criteria) this;
        }

        public Criteria andPoCountNotIn(List<Integer> values) {
            addCriterion("po_count not in", values, "poCount");
            return (Criteria) this;
        }

        public Criteria andPoCountBetween(Integer value1, Integer value2) {
            addCriterion("po_count between", value1, value2, "poCount");
            return (Criteria) this;
        }

        public Criteria andPoCountNotBetween(Integer value1, Integer value2) {
            addCriterion("po_count not between", value1, value2, "poCount");
            return (Criteria) this;
        }

        public Criteria andPoCountUnitIsNull() {
            addCriterion("po_count_unit is null");
            return (Criteria) this;
        }

        public Criteria andPoCountUnitIsNotNull() {
            addCriterion("po_count_unit is not null");
            return (Criteria) this;
        }

        public Criteria andPoCountUnitEqualTo(String value) {
            addCriterion("po_count_unit =", value, "poCountUnit");
            return (Criteria) this;
        }

        public Criteria andPoCountUnitNotEqualTo(String value) {
            addCriterion("po_count_unit <>", value, "poCountUnit");
            return (Criteria) this;
        }

        public Criteria andPoCountUnitGreaterThan(String value) {
            addCriterion("po_count_unit >", value, "poCountUnit");
            return (Criteria) this;
        }

        public Criteria andPoCountUnitGreaterThanOrEqualTo(String value) {
            addCriterion("po_count_unit >=", value, "poCountUnit");
            return (Criteria) this;
        }

        public Criteria andPoCountUnitLessThan(String value) {
            addCriterion("po_count_unit <", value, "poCountUnit");
            return (Criteria) this;
        }

        public Criteria andPoCountUnitLessThanOrEqualTo(String value) {
            addCriterion("po_count_unit <=", value, "poCountUnit");
            return (Criteria) this;
        }

        public Criteria andPoCountUnitLike(String value) {
            addCriterion("po_count_unit like", value, "poCountUnit");
            return (Criteria) this;
        }

        public Criteria andPoCountUnitNotLike(String value) {
            addCriterion("po_count_unit not like", value, "poCountUnit");
            return (Criteria) this;
        }

        public Criteria andPoCountUnitIn(List<String> values) {
            addCriterion("po_count_unit in", values, "poCountUnit");
            return (Criteria) this;
        }

        public Criteria andPoCountUnitNotIn(List<String> values) {
            addCriterion("po_count_unit not in", values, "poCountUnit");
            return (Criteria) this;
        }

        public Criteria andPoCountUnitBetween(String value1, String value2) {
            addCriterion("po_count_unit between", value1, value2, "poCountUnit");
            return (Criteria) this;
        }

        public Criteria andPoCountUnitNotBetween(String value1, String value2) {
            addCriterion("po_count_unit not between", value1, value2, "poCountUnit");
            return (Criteria) this;
        }

        public Criteria andPoCustMatcodeIsNull() {
            addCriterion("po_cust_matcode is null");
            return (Criteria) this;
        }

        public Criteria andPoCustMatcodeIsNotNull() {
            addCriterion("po_cust_matcode is not null");
            return (Criteria) this;
        }

        public Criteria andPoCustMatcodeEqualTo(String value) {
            addCriterion("po_cust_matcode =", value, "poCustMatcode");
            return (Criteria) this;
        }

        public Criteria andPoCustMatcodeNotEqualTo(String value) {
            addCriterion("po_cust_matcode <>", value, "poCustMatcode");
            return (Criteria) this;
        }

        public Criteria andPoCustMatcodeGreaterThan(String value) {
            addCriterion("po_cust_matcode >", value, "poCustMatcode");
            return (Criteria) this;
        }

        public Criteria andPoCustMatcodeGreaterThanOrEqualTo(String value) {
            addCriterion("po_cust_matcode >=", value, "poCustMatcode");
            return (Criteria) this;
        }

        public Criteria andPoCustMatcodeLessThan(String value) {
            addCriterion("po_cust_matcode <", value, "poCustMatcode");
            return (Criteria) this;
        }

        public Criteria andPoCustMatcodeLessThanOrEqualTo(String value) {
            addCriterion("po_cust_matcode <=", value, "poCustMatcode");
            return (Criteria) this;
        }

        public Criteria andPoCustMatcodeLike(String value) {
            addCriterion("po_cust_matcode like", value, "poCustMatcode");
            return (Criteria) this;
        }

        public Criteria andPoCustMatcodeNotLike(String value) {
            addCriterion("po_cust_matcode not like", value, "poCustMatcode");
            return (Criteria) this;
        }

        public Criteria andPoCustMatcodeIn(List<String> values) {
            addCriterion("po_cust_matcode in", values, "poCustMatcode");
            return (Criteria) this;
        }

        public Criteria andPoCustMatcodeNotIn(List<String> values) {
            addCriterion("po_cust_matcode not in", values, "poCustMatcode");
            return (Criteria) this;
        }

        public Criteria andPoCustMatcodeBetween(String value1, String value2) {
            addCriterion("po_cust_matcode between", value1, value2, "poCustMatcode");
            return (Criteria) this;
        }

        public Criteria andPoCustMatcodeNotBetween(String value1, String value2) {
            addCriterion("po_cust_matcode not between", value1, value2, "poCustMatcode");
            return (Criteria) this;
        }

        public Criteria andPoProdVersionIsNull() {
            addCriterion("po_prod_version is null");
            return (Criteria) this;
        }

        public Criteria andPoProdVersionIsNotNull() {
            addCriterion("po_prod_version is not null");
            return (Criteria) this;
        }

        public Criteria andPoProdVersionEqualTo(String value) {
            addCriterion("po_prod_version =", value, "poProdVersion");
            return (Criteria) this;
        }

        public Criteria andPoProdVersionNotEqualTo(String value) {
            addCriterion("po_prod_version <>", value, "poProdVersion");
            return (Criteria) this;
        }

        public Criteria andPoProdVersionGreaterThan(String value) {
            addCriterion("po_prod_version >", value, "poProdVersion");
            return (Criteria) this;
        }

        public Criteria andPoProdVersionGreaterThanOrEqualTo(String value) {
            addCriterion("po_prod_version >=", value, "poProdVersion");
            return (Criteria) this;
        }

        public Criteria andPoProdVersionLessThan(String value) {
            addCriterion("po_prod_version <", value, "poProdVersion");
            return (Criteria) this;
        }

        public Criteria andPoProdVersionLessThanOrEqualTo(String value) {
            addCriterion("po_prod_version <=", value, "poProdVersion");
            return (Criteria) this;
        }

        public Criteria andPoProdVersionLike(String value) {
            addCriterion("po_prod_version like", value, "poProdVersion");
            return (Criteria) this;
        }

        public Criteria andPoProdVersionNotLike(String value) {
            addCriterion("po_prod_version not like", value, "poProdVersion");
            return (Criteria) this;
        }

        public Criteria andPoProdVersionIn(List<String> values) {
            addCriterion("po_prod_version in", values, "poProdVersion");
            return (Criteria) this;
        }

        public Criteria andPoProdVersionNotIn(List<String> values) {
            addCriterion("po_prod_version not in", values, "poProdVersion");
            return (Criteria) this;
        }

        public Criteria andPoProdVersionBetween(String value1, String value2) {
            addCriterion("po_prod_version between", value1, value2, "poProdVersion");
            return (Criteria) this;
        }

        public Criteria andPoProdVersionNotBetween(String value1, String value2) {
            addCriterion("po_prod_version not between", value1, value2, "poProdVersion");
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

        public Criteria andPoStatusIsNull() {
            addCriterion("po_status is null");
            return (Criteria) this;
        }

        public Criteria andPoStatusIsNotNull() {
            addCriterion("po_status is not null");
            return (Criteria) this;
        }

        public Criteria andPoStatusEqualTo(String value) {
            addCriterion("po_status =", value, "poStatus");
            return (Criteria) this;
        }

        public Criteria andPoStatusNotEqualTo(String value) {
            addCriterion("po_status <>", value, "poStatus");
            return (Criteria) this;
        }

        public Criteria andPoStatusGreaterThan(String value) {
            addCriterion("po_status >", value, "poStatus");
            return (Criteria) this;
        }

        public Criteria andPoStatusGreaterThanOrEqualTo(String value) {
            addCriterion("po_status >=", value, "poStatus");
            return (Criteria) this;
        }

        public Criteria andPoStatusLessThan(String value) {
            addCriterion("po_status <", value, "poStatus");
            return (Criteria) this;
        }

        public Criteria andPoStatusLessThanOrEqualTo(String value) {
            addCriterion("po_status <=", value, "poStatus");
            return (Criteria) this;
        }

        public Criteria andPoStatusLike(String value) {
            addCriterion("po_status like", value, "poStatus");
            return (Criteria) this;
        }

        public Criteria andPoStatusNotLike(String value) {
            addCriterion("po_status not like", value, "poStatus");
            return (Criteria) this;
        }

        public Criteria andPoStatusIn(List<String> values) {
            addCriterion("po_status in", values, "poStatus");
            return (Criteria) this;
        }

        public Criteria andPoStatusNotIn(List<String> values) {
            addCriterion("po_status not in", values, "poStatus");
            return (Criteria) this;
        }

        public Criteria andPoStatusBetween(String value1, String value2) {
            addCriterion("po_status between", value1, value2, "poStatus");
            return (Criteria) this;
        }

        public Criteria andPoStatusNotBetween(String value1, String value2) {
            addCriterion("po_status not between", value1, value2, "poStatus");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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