package com.uspring.sdsmesplus.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysLinePOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysLinePOExample() {
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

        public Criteria andLineNameIsNull() {
            addCriterion("line_name is null");
            return (Criteria) this;
        }

        public Criteria andLineNameIsNotNull() {
            addCriterion("line_name is not null");
            return (Criteria) this;
        }

        public Criteria andLineNameEqualTo(String value) {
            addCriterion("line_name =", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameNotEqualTo(String value) {
            addCriterion("line_name <>", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameGreaterThan(String value) {
            addCriterion("line_name >", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameGreaterThanOrEqualTo(String value) {
            addCriterion("line_name >=", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameLessThan(String value) {
            addCriterion("line_name <", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameLessThanOrEqualTo(String value) {
            addCriterion("line_name <=", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameLike(String value) {
            addCriterion("line_name like", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameNotLike(String value) {
            addCriterion("line_name not like", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameIn(List<String> values) {
            addCriterion("line_name in", values, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameNotIn(List<String> values) {
            addCriterion("line_name not in", values, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameBetween(String value1, String value2) {
            addCriterion("line_name between", value1, value2, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameNotBetween(String value1, String value2) {
            addCriterion("line_name not between", value1, value2, "lineName");
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

        public Criteria andLineTypeIsNull() {
            addCriterion("line_type is null");
            return (Criteria) this;
        }

        public Criteria andLineTypeIsNotNull() {
            addCriterion("line_type is not null");
            return (Criteria) this;
        }

        public Criteria andLineTypeEqualTo(String value) {
            addCriterion("line_type =", value, "lineType");
            return (Criteria) this;
        }

        public Criteria andLineTypeNotEqualTo(String value) {
            addCriterion("line_type <>", value, "lineType");
            return (Criteria) this;
        }

        public Criteria andLineTypeGreaterThan(String value) {
            addCriterion("line_type >", value, "lineType");
            return (Criteria) this;
        }

        public Criteria andLineTypeGreaterThanOrEqualTo(String value) {
            addCriterion("line_type >=", value, "lineType");
            return (Criteria) this;
        }

        public Criteria andLineTypeLessThan(String value) {
            addCriterion("line_type <", value, "lineType");
            return (Criteria) this;
        }

        public Criteria andLineTypeLessThanOrEqualTo(String value) {
            addCriterion("line_type <=", value, "lineType");
            return (Criteria) this;
        }

        public Criteria andLineTypeLike(String value) {
            addCriterion("line_type like", value, "lineType");
            return (Criteria) this;
        }

        public Criteria andLineTypeNotLike(String value) {
            addCriterion("line_type not like", value, "lineType");
            return (Criteria) this;
        }

        public Criteria andLineTypeIn(List<String> values) {
            addCriterion("line_type in", values, "lineType");
            return (Criteria) this;
        }

        public Criteria andLineTypeNotIn(List<String> values) {
            addCriterion("line_type not in", values, "lineType");
            return (Criteria) this;
        }

        public Criteria andLineTypeBetween(String value1, String value2) {
            addCriterion("line_type between", value1, value2, "lineType");
            return (Criteria) this;
        }

        public Criteria andLineTypeNotBetween(String value1, String value2) {
            addCriterion("line_type not between", value1, value2, "lineType");
            return (Criteria) this;
        }

        public Criteria andLineBarcodeIdIsNull() {
            addCriterion("line_barcode_id is null");
            return (Criteria) this;
        }

        public Criteria andLineBarcodeIdIsNotNull() {
            addCriterion("line_barcode_id is not null");
            return (Criteria) this;
        }

        public Criteria andLineBarcodeIdEqualTo(String value) {
            addCriterion("line_barcode_id =", value, "lineBarcodeId");
            return (Criteria) this;
        }

        public Criteria andLineBarcodeIdNotEqualTo(String value) {
            addCriterion("line_barcode_id <>", value, "lineBarcodeId");
            return (Criteria) this;
        }

        public Criteria andLineBarcodeIdGreaterThan(String value) {
            addCriterion("line_barcode_id >", value, "lineBarcodeId");
            return (Criteria) this;
        }

        public Criteria andLineBarcodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("line_barcode_id >=", value, "lineBarcodeId");
            return (Criteria) this;
        }

        public Criteria andLineBarcodeIdLessThan(String value) {
            addCriterion("line_barcode_id <", value, "lineBarcodeId");
            return (Criteria) this;
        }

        public Criteria andLineBarcodeIdLessThanOrEqualTo(String value) {
            addCriterion("line_barcode_id <=", value, "lineBarcodeId");
            return (Criteria) this;
        }

        public Criteria andLineBarcodeIdLike(String value) {
            addCriterion("line_barcode_id like", value, "lineBarcodeId");
            return (Criteria) this;
        }

        public Criteria andLineBarcodeIdNotLike(String value) {
            addCriterion("line_barcode_id not like", value, "lineBarcodeId");
            return (Criteria) this;
        }

        public Criteria andLineBarcodeIdIn(List<String> values) {
            addCriterion("line_barcode_id in", values, "lineBarcodeId");
            return (Criteria) this;
        }

        public Criteria andLineBarcodeIdNotIn(List<String> values) {
            addCriterion("line_barcode_id not in", values, "lineBarcodeId");
            return (Criteria) this;
        }

        public Criteria andLineBarcodeIdBetween(String value1, String value2) {
            addCriterion("line_barcode_id between", value1, value2, "lineBarcodeId");
            return (Criteria) this;
        }

        public Criteria andLineBarcodeIdNotBetween(String value1, String value2) {
            addCriterion("line_barcode_id not between", value1, value2, "lineBarcodeId");
            return (Criteria) this;
        }

        public Criteria andLineBarcodeCodeIsNull() {
            addCriterion("line_barcode_code is null");
            return (Criteria) this;
        }

        public Criteria andLineBarcodeCodeIsNotNull() {
            addCriterion("line_barcode_code is not null");
            return (Criteria) this;
        }

        public Criteria andLineBarcodeCodeEqualTo(String value) {
            addCriterion("line_barcode_code =", value, "lineBarcodeCode");
            return (Criteria) this;
        }

        public Criteria andLineBarcodeCodeNotEqualTo(String value) {
            addCriterion("line_barcode_code <>", value, "lineBarcodeCode");
            return (Criteria) this;
        }

        public Criteria andLineBarcodeCodeGreaterThan(String value) {
            addCriterion("line_barcode_code >", value, "lineBarcodeCode");
            return (Criteria) this;
        }

        public Criteria andLineBarcodeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("line_barcode_code >=", value, "lineBarcodeCode");
            return (Criteria) this;
        }

        public Criteria andLineBarcodeCodeLessThan(String value) {
            addCriterion("line_barcode_code <", value, "lineBarcodeCode");
            return (Criteria) this;
        }

        public Criteria andLineBarcodeCodeLessThanOrEqualTo(String value) {
            addCriterion("line_barcode_code <=", value, "lineBarcodeCode");
            return (Criteria) this;
        }

        public Criteria andLineBarcodeCodeLike(String value) {
            addCriterion("line_barcode_code like", value, "lineBarcodeCode");
            return (Criteria) this;
        }

        public Criteria andLineBarcodeCodeNotLike(String value) {
            addCriterion("line_barcode_code not like", value, "lineBarcodeCode");
            return (Criteria) this;
        }

        public Criteria andLineBarcodeCodeIn(List<String> values) {
            addCriterion("line_barcode_code in", values, "lineBarcodeCode");
            return (Criteria) this;
        }

        public Criteria andLineBarcodeCodeNotIn(List<String> values) {
            addCriterion("line_barcode_code not in", values, "lineBarcodeCode");
            return (Criteria) this;
        }

        public Criteria andLineBarcodeCodeBetween(String value1, String value2) {
            addCriterion("line_barcode_code between", value1, value2, "lineBarcodeCode");
            return (Criteria) this;
        }

        public Criteria andLineBarcodeCodeNotBetween(String value1, String value2) {
            addCriterion("line_barcode_code not between", value1, value2, "lineBarcodeCode");
            return (Criteria) this;
        }

        public Criteria andLineSapCodeIsNull() {
            addCriterion("line_sap_code is null");
            return (Criteria) this;
        }

        public Criteria andLineSapCodeIsNotNull() {
            addCriterion("line_sap_code is not null");
            return (Criteria) this;
        }

        public Criteria andLineSapCodeEqualTo(String value) {
            addCriterion("line_sap_code =", value, "lineSapCode");
            return (Criteria) this;
        }

        public Criteria andLineSapCodeNotEqualTo(String value) {
            addCriterion("line_sap_code <>", value, "lineSapCode");
            return (Criteria) this;
        }

        public Criteria andLineSapCodeGreaterThan(String value) {
            addCriterion("line_sap_code >", value, "lineSapCode");
            return (Criteria) this;
        }

        public Criteria andLineSapCodeGreaterThanOrEqualTo(String value) {
            addCriterion("line_sap_code >=", value, "lineSapCode");
            return (Criteria) this;
        }

        public Criteria andLineSapCodeLessThan(String value) {
            addCriterion("line_sap_code <", value, "lineSapCode");
            return (Criteria) this;
        }

        public Criteria andLineSapCodeLessThanOrEqualTo(String value) {
            addCriterion("line_sap_code <=", value, "lineSapCode");
            return (Criteria) this;
        }

        public Criteria andLineSapCodeLike(String value) {
            addCriterion("line_sap_code like", value, "lineSapCode");
            return (Criteria) this;
        }

        public Criteria andLineSapCodeNotLike(String value) {
            addCriterion("line_sap_code not like", value, "lineSapCode");
            return (Criteria) this;
        }

        public Criteria andLineSapCodeIn(List<String> values) {
            addCriterion("line_sap_code in", values, "lineSapCode");
            return (Criteria) this;
        }

        public Criteria andLineSapCodeNotIn(List<String> values) {
            addCriterion("line_sap_code not in", values, "lineSapCode");
            return (Criteria) this;
        }

        public Criteria andLineSapCodeBetween(String value1, String value2) {
            addCriterion("line_sap_code between", value1, value2, "lineSapCode");
            return (Criteria) this;
        }

        public Criteria andLineSapCodeNotBetween(String value1, String value2) {
            addCriterion("line_sap_code not between", value1, value2, "lineSapCode");
            return (Criteria) this;
        }

        public Criteria andLineMpmlinkCodeIsNull() {
            addCriterion("line_mpmlink_code is null");
            return (Criteria) this;
        }

        public Criteria andLineMpmlinkCodeIsNotNull() {
            addCriterion("line_mpmlink_code is not null");
            return (Criteria) this;
        }

        public Criteria andLineMpmlinkCodeEqualTo(String value) {
            addCriterion("line_mpmlink_code =", value, "lineMpmlinkCode");
            return (Criteria) this;
        }

        public Criteria andLineMpmlinkCodeNotEqualTo(String value) {
            addCriterion("line_mpmlink_code <>", value, "lineMpmlinkCode");
            return (Criteria) this;
        }

        public Criteria andLineMpmlinkCodeGreaterThan(String value) {
            addCriterion("line_mpmlink_code >", value, "lineMpmlinkCode");
            return (Criteria) this;
        }

        public Criteria andLineMpmlinkCodeGreaterThanOrEqualTo(String value) {
            addCriterion("line_mpmlink_code >=", value, "lineMpmlinkCode");
            return (Criteria) this;
        }

        public Criteria andLineMpmlinkCodeLessThan(String value) {
            addCriterion("line_mpmlink_code <", value, "lineMpmlinkCode");
            return (Criteria) this;
        }

        public Criteria andLineMpmlinkCodeLessThanOrEqualTo(String value) {
            addCriterion("line_mpmlink_code <=", value, "lineMpmlinkCode");
            return (Criteria) this;
        }

        public Criteria andLineMpmlinkCodeLike(String value) {
            addCriterion("line_mpmlink_code like", value, "lineMpmlinkCode");
            return (Criteria) this;
        }

        public Criteria andLineMpmlinkCodeNotLike(String value) {
            addCriterion("line_mpmlink_code not like", value, "lineMpmlinkCode");
            return (Criteria) this;
        }

        public Criteria andLineMpmlinkCodeIn(List<String> values) {
            addCriterion("line_mpmlink_code in", values, "lineMpmlinkCode");
            return (Criteria) this;
        }

        public Criteria andLineMpmlinkCodeNotIn(List<String> values) {
            addCriterion("line_mpmlink_code not in", values, "lineMpmlinkCode");
            return (Criteria) this;
        }

        public Criteria andLineMpmlinkCodeBetween(String value1, String value2) {
            addCriterion("line_mpmlink_code between", value1, value2, "lineMpmlinkCode");
            return (Criteria) this;
        }

        public Criteria andLineMpmlinkCodeNotBetween(String value1, String value2) {
            addCriterion("line_mpmlink_code not between", value1, value2, "lineMpmlinkCode");
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