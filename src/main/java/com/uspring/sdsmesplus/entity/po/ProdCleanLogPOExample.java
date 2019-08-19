package com.uspring.sdsmesplus.entity.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProdCleanLogPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProdCleanLogPOExample() {
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

        public Criteria andClIdIsNull() {
            addCriterion("cl_id is null");
            return (Criteria) this;
        }

        public Criteria andClIdIsNotNull() {
            addCriterion("cl_id is not null");
            return (Criteria) this;
        }

        public Criteria andClIdEqualTo(Integer value) {
            addCriterion("cl_id =", value, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdNotEqualTo(Integer value) {
            addCriterion("cl_id <>", value, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdGreaterThan(Integer value) {
            addCriterion("cl_id >", value, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cl_id >=", value, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdLessThan(Integer value) {
            addCriterion("cl_id <", value, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdLessThanOrEqualTo(Integer value) {
            addCriterion("cl_id <=", value, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdIn(List<Integer> values) {
            addCriterion("cl_id in", values, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdNotIn(List<Integer> values) {
            addCriterion("cl_id not in", values, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdBetween(Integer value1, Integer value2) {
            addCriterion("cl_id between", value1, value2, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cl_id not between", value1, value2, "clId");
            return (Criteria) this;
        }

        public Criteria andClCodeIsNull() {
            addCriterion("cl_code is null");
            return (Criteria) this;
        }

        public Criteria andClCodeIsNotNull() {
            addCriterion("cl_code is not null");
            return (Criteria) this;
        }

        public Criteria andClCodeEqualTo(String value) {
            addCriterion("cl_code =", value, "clCode");
            return (Criteria) this;
        }

        public Criteria andClCodeNotEqualTo(String value) {
            addCriterion("cl_code <>", value, "clCode");
            return (Criteria) this;
        }

        public Criteria andClCodeGreaterThan(String value) {
            addCriterion("cl_code >", value, "clCode");
            return (Criteria) this;
        }

        public Criteria andClCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cl_code >=", value, "clCode");
            return (Criteria) this;
        }

        public Criteria andClCodeLessThan(String value) {
            addCriterion("cl_code <", value, "clCode");
            return (Criteria) this;
        }

        public Criteria andClCodeLessThanOrEqualTo(String value) {
            addCriterion("cl_code <=", value, "clCode");
            return (Criteria) this;
        }

        public Criteria andClCodeLike(String value) {
            addCriterion("cl_code like", value, "clCode");
            return (Criteria) this;
        }

        public Criteria andClCodeNotLike(String value) {
            addCriterion("cl_code not like", value, "clCode");
            return (Criteria) this;
        }

        public Criteria andClCodeIn(List<String> values) {
            addCriterion("cl_code in", values, "clCode");
            return (Criteria) this;
        }

        public Criteria andClCodeNotIn(List<String> values) {
            addCriterion("cl_code not in", values, "clCode");
            return (Criteria) this;
        }

        public Criteria andClCodeBetween(String value1, String value2) {
            addCriterion("cl_code between", value1, value2, "clCode");
            return (Criteria) this;
        }

        public Criteria andClCodeNotBetween(String value1, String value2) {
            addCriterion("cl_code not between", value1, value2, "clCode");
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

        public Criteria andMatCodeIsNull() {
            addCriterion("mat_code is null");
            return (Criteria) this;
        }

        public Criteria andMatCodeIsNotNull() {
            addCriterion("mat_code is not null");
            return (Criteria) this;
        }

        public Criteria andMatCodeEqualTo(String value) {
            addCriterion("mat_code =", value, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatCodeNotEqualTo(String value) {
            addCriterion("mat_code <>", value, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatCodeGreaterThan(String value) {
            addCriterion("mat_code >", value, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatCodeGreaterThanOrEqualTo(String value) {
            addCriterion("mat_code >=", value, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatCodeLessThan(String value) {
            addCriterion("mat_code <", value, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatCodeLessThanOrEqualTo(String value) {
            addCriterion("mat_code <=", value, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatCodeLike(String value) {
            addCriterion("mat_code like", value, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatCodeNotLike(String value) {
            addCriterion("mat_code not like", value, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatCodeIn(List<String> values) {
            addCriterion("mat_code in", values, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatCodeNotIn(List<String> values) {
            addCriterion("mat_code not in", values, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatCodeBetween(String value1, String value2) {
            addCriterion("mat_code between", value1, value2, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatCodeNotBetween(String value1, String value2) {
            addCriterion("mat_code not between", value1, value2, "matCode");
            return (Criteria) this;
        }

        public Criteria andMatNameIsNull() {
            addCriterion("mat_name is null");
            return (Criteria) this;
        }

        public Criteria andMatNameIsNotNull() {
            addCriterion("mat_name is not null");
            return (Criteria) this;
        }

        public Criteria andMatNameEqualTo(String value) {
            addCriterion("mat_name =", value, "matName");
            return (Criteria) this;
        }

        public Criteria andMatNameNotEqualTo(String value) {
            addCriterion("mat_name <>", value, "matName");
            return (Criteria) this;
        }

        public Criteria andMatNameGreaterThan(String value) {
            addCriterion("mat_name >", value, "matName");
            return (Criteria) this;
        }

        public Criteria andMatNameGreaterThanOrEqualTo(String value) {
            addCriterion("mat_name >=", value, "matName");
            return (Criteria) this;
        }

        public Criteria andMatNameLessThan(String value) {
            addCriterion("mat_name <", value, "matName");
            return (Criteria) this;
        }

        public Criteria andMatNameLessThanOrEqualTo(String value) {
            addCriterion("mat_name <=", value, "matName");
            return (Criteria) this;
        }

        public Criteria andMatNameLike(String value) {
            addCriterion("mat_name like", value, "matName");
            return (Criteria) this;
        }

        public Criteria andMatNameNotLike(String value) {
            addCriterion("mat_name not like", value, "matName");
            return (Criteria) this;
        }

        public Criteria andMatNameIn(List<String> values) {
            addCriterion("mat_name in", values, "matName");
            return (Criteria) this;
        }

        public Criteria andMatNameNotIn(List<String> values) {
            addCriterion("mat_name not in", values, "matName");
            return (Criteria) this;
        }

        public Criteria andMatNameBetween(String value1, String value2) {
            addCriterion("mat_name between", value1, value2, "matName");
            return (Criteria) this;
        }

        public Criteria andMatNameNotBetween(String value1, String value2) {
            addCriterion("mat_name not between", value1, value2, "matName");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeOldIsNull() {
            addCriterion("box_barcode_old is null");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeOldIsNotNull() {
            addCriterion("box_barcode_old is not null");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeOldEqualTo(String value) {
            addCriterion("box_barcode_old =", value, "boxBarcodeOld");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeOldNotEqualTo(String value) {
            addCriterion("box_barcode_old <>", value, "boxBarcodeOld");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeOldGreaterThan(String value) {
            addCriterion("box_barcode_old >", value, "boxBarcodeOld");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeOldGreaterThanOrEqualTo(String value) {
            addCriterion("box_barcode_old >=", value, "boxBarcodeOld");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeOldLessThan(String value) {
            addCriterion("box_barcode_old <", value, "boxBarcodeOld");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeOldLessThanOrEqualTo(String value) {
            addCriterion("box_barcode_old <=", value, "boxBarcodeOld");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeOldLike(String value) {
            addCriterion("box_barcode_old like", value, "boxBarcodeOld");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeOldNotLike(String value) {
            addCriterion("box_barcode_old not like", value, "boxBarcodeOld");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeOldIn(List<String> values) {
            addCriterion("box_barcode_old in", values, "boxBarcodeOld");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeOldNotIn(List<String> values) {
            addCriterion("box_barcode_old not in", values, "boxBarcodeOld");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeOldBetween(String value1, String value2) {
            addCriterion("box_barcode_old between", value1, value2, "boxBarcodeOld");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeOldNotBetween(String value1, String value2) {
            addCriterion("box_barcode_old not between", value1, value2, "boxBarcodeOld");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeNewIsNull() {
            addCriterion("box_barcode_new is null");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeNewIsNotNull() {
            addCriterion("box_barcode_new is not null");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeNewEqualTo(String value) {
            addCriterion("box_barcode_new =", value, "boxBarcodeNew");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeNewNotEqualTo(String value) {
            addCriterion("box_barcode_new <>", value, "boxBarcodeNew");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeNewGreaterThan(String value) {
            addCriterion("box_barcode_new >", value, "boxBarcodeNew");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeNewGreaterThanOrEqualTo(String value) {
            addCriterion("box_barcode_new >=", value, "boxBarcodeNew");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeNewLessThan(String value) {
            addCriterion("box_barcode_new <", value, "boxBarcodeNew");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeNewLessThanOrEqualTo(String value) {
            addCriterion("box_barcode_new <=", value, "boxBarcodeNew");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeNewLike(String value) {
            addCriterion("box_barcode_new like", value, "boxBarcodeNew");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeNewNotLike(String value) {
            addCriterion("box_barcode_new not like", value, "boxBarcodeNew");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeNewIn(List<String> values) {
            addCriterion("box_barcode_new in", values, "boxBarcodeNew");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeNewNotIn(List<String> values) {
            addCriterion("box_barcode_new not in", values, "boxBarcodeNew");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeNewBetween(String value1, String value2) {
            addCriterion("box_barcode_new between", value1, value2, "boxBarcodeNew");
            return (Criteria) this;
        }

        public Criteria andBoxBarcodeNewNotBetween(String value1, String value2) {
            addCriterion("box_barcode_new not between", value1, value2, "boxBarcodeNew");
            return (Criteria) this;
        }

        public Criteria andClUsedCountIsNull() {
            addCriterion("cl_used_count is null");
            return (Criteria) this;
        }

        public Criteria andClUsedCountIsNotNull() {
            addCriterion("cl_used_count is not null");
            return (Criteria) this;
        }

        public Criteria andClUsedCountEqualTo(BigDecimal value) {
            addCriterion("cl_used_count =", value, "clUsedCount");
            return (Criteria) this;
        }

        public Criteria andClUsedCountNotEqualTo(BigDecimal value) {
            addCriterion("cl_used_count <>", value, "clUsedCount");
            return (Criteria) this;
        }

        public Criteria andClUsedCountGreaterThan(BigDecimal value) {
            addCriterion("cl_used_count >", value, "clUsedCount");
            return (Criteria) this;
        }

        public Criteria andClUsedCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cl_used_count >=", value, "clUsedCount");
            return (Criteria) this;
        }

        public Criteria andClUsedCountLessThan(BigDecimal value) {
            addCriterion("cl_used_count <", value, "clUsedCount");
            return (Criteria) this;
        }

        public Criteria andClUsedCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cl_used_count <=", value, "clUsedCount");
            return (Criteria) this;
        }

        public Criteria andClUsedCountIn(List<BigDecimal> values) {
            addCriterion("cl_used_count in", values, "clUsedCount");
            return (Criteria) this;
        }

        public Criteria andClUsedCountNotIn(List<BigDecimal> values) {
            addCriterion("cl_used_count not in", values, "clUsedCount");
            return (Criteria) this;
        }

        public Criteria andClUsedCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cl_used_count between", value1, value2, "clUsedCount");
            return (Criteria) this;
        }

        public Criteria andClUsedCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cl_used_count not between", value1, value2, "clUsedCount");
            return (Criteria) this;
        }

        public Criteria andClRestCountIsNull() {
            addCriterion("cl_rest_count is null");
            return (Criteria) this;
        }

        public Criteria andClRestCountIsNotNull() {
            addCriterion("cl_rest_count is not null");
            return (Criteria) this;
        }

        public Criteria andClRestCountEqualTo(BigDecimal value) {
            addCriterion("cl_rest_count =", value, "clRestCount");
            return (Criteria) this;
        }

        public Criteria andClRestCountNotEqualTo(BigDecimal value) {
            addCriterion("cl_rest_count <>", value, "clRestCount");
            return (Criteria) this;
        }

        public Criteria andClRestCountGreaterThan(BigDecimal value) {
            addCriterion("cl_rest_count >", value, "clRestCount");
            return (Criteria) this;
        }

        public Criteria andClRestCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cl_rest_count >=", value, "clRestCount");
            return (Criteria) this;
        }

        public Criteria andClRestCountLessThan(BigDecimal value) {
            addCriterion("cl_rest_count <", value, "clRestCount");
            return (Criteria) this;
        }

        public Criteria andClRestCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cl_rest_count <=", value, "clRestCount");
            return (Criteria) this;
        }

        public Criteria andClRestCountIn(List<BigDecimal> values) {
            addCriterion("cl_rest_count in", values, "clRestCount");
            return (Criteria) this;
        }

        public Criteria andClRestCountNotIn(List<BigDecimal> values) {
            addCriterion("cl_rest_count not in", values, "clRestCount");
            return (Criteria) this;
        }

        public Criteria andClRestCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cl_rest_count between", value1, value2, "clRestCount");
            return (Criteria) this;
        }

        public Criteria andClRestCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cl_rest_count not between", value1, value2, "clRestCount");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedIsNull() {
            addCriterion("is_confirmed is null");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedIsNotNull() {
            addCriterion("is_confirmed is not null");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedEqualTo(Boolean value) {
            addCriterion("is_confirmed =", value, "isConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedNotEqualTo(Boolean value) {
            addCriterion("is_confirmed <>", value, "isConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedGreaterThan(Boolean value) {
            addCriterion("is_confirmed >", value, "isConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_confirmed >=", value, "isConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedLessThan(Boolean value) {
            addCriterion("is_confirmed <", value, "isConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_confirmed <=", value, "isConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedIn(List<Boolean> values) {
            addCriterion("is_confirmed in", values, "isConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedNotIn(List<Boolean> values) {
            addCriterion("is_confirmed not in", values, "isConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_confirmed between", value1, value2, "isConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsConfirmedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_confirmed not between", value1, value2, "isConfirmed");
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