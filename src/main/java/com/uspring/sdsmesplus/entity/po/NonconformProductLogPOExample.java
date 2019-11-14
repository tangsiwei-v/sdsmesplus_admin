package com.uspring.sdsmesplus.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NonconformProductLogPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NonconformProductLogPOExample() {
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

        public Criteria andNplIdIsNull() {
            addCriterion("npl_id is null");
            return (Criteria) this;
        }

        public Criteria andNplIdIsNotNull() {
            addCriterion("npl_id is not null");
            return (Criteria) this;
        }

        public Criteria andNplIdEqualTo(Integer value) {
            addCriterion("npl_id =", value, "nplId");
            return (Criteria) this;
        }

        public Criteria andNplIdNotEqualTo(Integer value) {
            addCriterion("npl_id <>", value, "nplId");
            return (Criteria) this;
        }

        public Criteria andNplIdGreaterThan(Integer value) {
            addCriterion("npl_id >", value, "nplId");
            return (Criteria) this;
        }

        public Criteria andNplIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("npl_id >=", value, "nplId");
            return (Criteria) this;
        }

        public Criteria andNplIdLessThan(Integer value) {
            addCriterion("npl_id <", value, "nplId");
            return (Criteria) this;
        }

        public Criteria andNplIdLessThanOrEqualTo(Integer value) {
            addCriterion("npl_id <=", value, "nplId");
            return (Criteria) this;
        }

        public Criteria andNplIdIn(List<Integer> values) {
            addCriterion("npl_id in", values, "nplId");
            return (Criteria) this;
        }

        public Criteria andNplIdNotIn(List<Integer> values) {
            addCriterion("npl_id not in", values, "nplId");
            return (Criteria) this;
        }

        public Criteria andNplIdBetween(Integer value1, Integer value2) {
            addCriterion("npl_id between", value1, value2, "nplId");
            return (Criteria) this;
        }

        public Criteria andNplIdNotBetween(Integer value1, Integer value2) {
            addCriterion("npl_id not between", value1, value2, "nplId");
            return (Criteria) this;
        }

        public Criteria andNplBarcodeIsNull() {
            addCriterion("npl_barcode is null");
            return (Criteria) this;
        }

        public Criteria andNplBarcodeIsNotNull() {
            addCriterion("npl_barcode is not null");
            return (Criteria) this;
        }

        public Criteria andNplBarcodeEqualTo(String value) {
            addCriterion("npl_barcode =", value, "nplBarcode");
            return (Criteria) this;
        }

        public Criteria andNplBarcodeNotEqualTo(String value) {
            addCriterion("npl_barcode <>", value, "nplBarcode");
            return (Criteria) this;
        }

        public Criteria andNplBarcodeGreaterThan(String value) {
            addCriterion("npl_barcode >", value, "nplBarcode");
            return (Criteria) this;
        }

        public Criteria andNplBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("npl_barcode >=", value, "nplBarcode");
            return (Criteria) this;
        }

        public Criteria andNplBarcodeLessThan(String value) {
            addCriterion("npl_barcode <", value, "nplBarcode");
            return (Criteria) this;
        }

        public Criteria andNplBarcodeLessThanOrEqualTo(String value) {
            addCriterion("npl_barcode <=", value, "nplBarcode");
            return (Criteria) this;
        }

        public Criteria andNplBarcodeLike(String value) {
            addCriterion("npl_barcode like", value, "nplBarcode");
            return (Criteria) this;
        }

        public Criteria andNplBarcodeNotLike(String value) {
            addCriterion("npl_barcode not like", value, "nplBarcode");
            return (Criteria) this;
        }

        public Criteria andNplBarcodeIn(List<String> values) {
            addCriterion("npl_barcode in", values, "nplBarcode");
            return (Criteria) this;
        }

        public Criteria andNplBarcodeNotIn(List<String> values) {
            addCriterion("npl_barcode not in", values, "nplBarcode");
            return (Criteria) this;
        }

        public Criteria andNplBarcodeBetween(String value1, String value2) {
            addCriterion("npl_barcode between", value1, value2, "nplBarcode");
            return (Criteria) this;
        }

        public Criteria andNplBarcodeNotBetween(String value1, String value2) {
            addCriterion("npl_barcode not between", value1, value2, "nplBarcode");
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

        public Criteria andShopCodeIsNull() {
            addCriterion("shop_code is null");
            return (Criteria) this;
        }

        public Criteria andShopCodeIsNotNull() {
            addCriterion("shop_code is not null");
            return (Criteria) this;
        }

        public Criteria andShopCodeEqualTo(String value) {
            addCriterion("shop_code =", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeNotEqualTo(String value) {
            addCriterion("shop_code <>", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeGreaterThan(String value) {
            addCriterion("shop_code >", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeGreaterThanOrEqualTo(String value) {
            addCriterion("shop_code >=", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeLessThan(String value) {
            addCriterion("shop_code <", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeLessThanOrEqualTo(String value) {
            addCriterion("shop_code <=", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeLike(String value) {
            addCriterion("shop_code like", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeNotLike(String value) {
            addCriterion("shop_code not like", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeIn(List<String> values) {
            addCriterion("shop_code in", values, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeNotIn(List<String> values) {
            addCriterion("shop_code not in", values, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeBetween(String value1, String value2) {
            addCriterion("shop_code between", value1, value2, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeNotBetween(String value1, String value2) {
            addCriterion("shop_code not between", value1, value2, "shopCode");
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

        public Criteria andLineCodeIsNull() {
            addCriterion("line_code is null");
            return (Criteria) this;
        }

        public Criteria andLineCodeIsNotNull() {
            addCriterion("line_code is not null");
            return (Criteria) this;
        }

        public Criteria andLineCodeEqualTo(String value) {
            addCriterion("line_code =", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeNotEqualTo(String value) {
            addCriterion("line_code <>", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeGreaterThan(String value) {
            addCriterion("line_code >", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeGreaterThanOrEqualTo(String value) {
            addCriterion("line_code >=", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeLessThan(String value) {
            addCriterion("line_code <", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeLessThanOrEqualTo(String value) {
            addCriterion("line_code <=", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeLike(String value) {
            addCriterion("line_code like", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeNotLike(String value) {
            addCriterion("line_code not like", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeIn(List<String> values) {
            addCriterion("line_code in", values, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeNotIn(List<String> values) {
            addCriterion("line_code not in", values, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeBetween(String value1, String value2) {
            addCriterion("line_code between", value1, value2, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeNotBetween(String value1, String value2) {
            addCriterion("line_code not between", value1, value2, "lineCode");
            return (Criteria) this;
        }

        public Criteria andProdDateIsNull() {
            addCriterion("prod_date is null");
            return (Criteria) this;
        }

        public Criteria andProdDateIsNotNull() {
            addCriterion("prod_date is not null");
            return (Criteria) this;
        }

        public Criteria andProdDateEqualTo(Date value) {
            addCriterion("prod_date =", value, "prodDate");
            return (Criteria) this;
        }

        public Criteria andProdDateNotEqualTo(Date value) {
            addCriterion("prod_date <>", value, "prodDate");
            return (Criteria) this;
        }

        public Criteria andProdDateGreaterThan(Date value) {
            addCriterion("prod_date >", value, "prodDate");
            return (Criteria) this;
        }

        public Criteria andProdDateGreaterThanOrEqualTo(Date value) {
            addCriterion("prod_date >=", value, "prodDate");
            return (Criteria) this;
        }

        public Criteria andProdDateLessThan(Date value) {
            addCriterion("prod_date <", value, "prodDate");
            return (Criteria) this;
        }

        public Criteria andProdDateLessThanOrEqualTo(Date value) {
            addCriterion("prod_date <=", value, "prodDate");
            return (Criteria) this;
        }

        public Criteria andProdDateIn(List<Date> values) {
            addCriterion("prod_date in", values, "prodDate");
            return (Criteria) this;
        }

        public Criteria andProdDateNotIn(List<Date> values) {
            addCriterion("prod_date not in", values, "prodDate");
            return (Criteria) this;
        }

        public Criteria andProdDateBetween(Date value1, Date value2) {
            addCriterion("prod_date between", value1, value2, "prodDate");
            return (Criteria) this;
        }

        public Criteria andProdDateNotBetween(Date value1, Date value2) {
            addCriterion("prod_date not between", value1, value2, "prodDate");
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

        public Criteria andShiftCodeIsNull() {
            addCriterion("shift_code is null");
            return (Criteria) this;
        }

        public Criteria andShiftCodeIsNotNull() {
            addCriterion("shift_code is not null");
            return (Criteria) this;
        }

        public Criteria andShiftCodeEqualTo(String value) {
            addCriterion("shift_code =", value, "shiftCode");
            return (Criteria) this;
        }

        public Criteria andShiftCodeNotEqualTo(String value) {
            addCriterion("shift_code <>", value, "shiftCode");
            return (Criteria) this;
        }

        public Criteria andShiftCodeGreaterThan(String value) {
            addCriterion("shift_code >", value, "shiftCode");
            return (Criteria) this;
        }

        public Criteria andShiftCodeGreaterThanOrEqualTo(String value) {
            addCriterion("shift_code >=", value, "shiftCode");
            return (Criteria) this;
        }

        public Criteria andShiftCodeLessThan(String value) {
            addCriterion("shift_code <", value, "shiftCode");
            return (Criteria) this;
        }

        public Criteria andShiftCodeLessThanOrEqualTo(String value) {
            addCriterion("shift_code <=", value, "shiftCode");
            return (Criteria) this;
        }

        public Criteria andShiftCodeLike(String value) {
            addCriterion("shift_code like", value, "shiftCode");
            return (Criteria) this;
        }

        public Criteria andShiftCodeNotLike(String value) {
            addCriterion("shift_code not like", value, "shiftCode");
            return (Criteria) this;
        }

        public Criteria andShiftCodeIn(List<String> values) {
            addCriterion("shift_code in", values, "shiftCode");
            return (Criteria) this;
        }

        public Criteria andShiftCodeNotIn(List<String> values) {
            addCriterion("shift_code not in", values, "shiftCode");
            return (Criteria) this;
        }

        public Criteria andShiftCodeBetween(String value1, String value2) {
            addCriterion("shift_code between", value1, value2, "shiftCode");
            return (Criteria) this;
        }

        public Criteria andShiftCodeNotBetween(String value1, String value2) {
            addCriterion("shift_code not between", value1, value2, "shiftCode");
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

        public Criteria andProdTuhaoIsNull() {
            addCriterion("prod_tuhao is null");
            return (Criteria) this;
        }

        public Criteria andProdTuhaoIsNotNull() {
            addCriterion("prod_tuhao is not null");
            return (Criteria) this;
        }

        public Criteria andProdTuhaoEqualTo(String value) {
            addCriterion("prod_tuhao =", value, "prodTuhao");
            return (Criteria) this;
        }

        public Criteria andProdTuhaoNotEqualTo(String value) {
            addCriterion("prod_tuhao <>", value, "prodTuhao");
            return (Criteria) this;
        }

        public Criteria andProdTuhaoGreaterThan(String value) {
            addCriterion("prod_tuhao >", value, "prodTuhao");
            return (Criteria) this;
        }

        public Criteria andProdTuhaoGreaterThanOrEqualTo(String value) {
            addCriterion("prod_tuhao >=", value, "prodTuhao");
            return (Criteria) this;
        }

        public Criteria andProdTuhaoLessThan(String value) {
            addCriterion("prod_tuhao <", value, "prodTuhao");
            return (Criteria) this;
        }

        public Criteria andProdTuhaoLessThanOrEqualTo(String value) {
            addCriterion("prod_tuhao <=", value, "prodTuhao");
            return (Criteria) this;
        }

        public Criteria andProdTuhaoLike(String value) {
            addCriterion("prod_tuhao like", value, "prodTuhao");
            return (Criteria) this;
        }

        public Criteria andProdTuhaoNotLike(String value) {
            addCriterion("prod_tuhao not like", value, "prodTuhao");
            return (Criteria) this;
        }

        public Criteria andProdTuhaoIn(List<String> values) {
            addCriterion("prod_tuhao in", values, "prodTuhao");
            return (Criteria) this;
        }

        public Criteria andProdTuhaoNotIn(List<String> values) {
            addCriterion("prod_tuhao not in", values, "prodTuhao");
            return (Criteria) this;
        }

        public Criteria andProdTuhaoBetween(String value1, String value2) {
            addCriterion("prod_tuhao between", value1, value2, "prodTuhao");
            return (Criteria) this;
        }

        public Criteria andProdTuhaoNotBetween(String value1, String value2) {
            addCriterion("prod_tuhao not between", value1, value2, "prodTuhao");
            return (Criteria) this;
        }

        public Criteria andProdNameIsNull() {
            addCriterion("prod_name is null");
            return (Criteria) this;
        }

        public Criteria andProdNameIsNotNull() {
            addCriterion("prod_name is not null");
            return (Criteria) this;
        }

        public Criteria andProdNameEqualTo(String value) {
            addCriterion("prod_name =", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotEqualTo(String value) {
            addCriterion("prod_name <>", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameGreaterThan(String value) {
            addCriterion("prod_name >", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameGreaterThanOrEqualTo(String value) {
            addCriterion("prod_name >=", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameLessThan(String value) {
            addCriterion("prod_name <", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameLessThanOrEqualTo(String value) {
            addCriterion("prod_name <=", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameLike(String value) {
            addCriterion("prod_name like", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotLike(String value) {
            addCriterion("prod_name not like", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameIn(List<String> values) {
            addCriterion("prod_name in", values, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotIn(List<String> values) {
            addCriterion("prod_name not in", values, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameBetween(String value1, String value2) {
            addCriterion("prod_name between", value1, value2, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotBetween(String value1, String value2) {
            addCriterion("prod_name not between", value1, value2, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdBatchCodeIsNull() {
            addCriterion("prod_batch_code is null");
            return (Criteria) this;
        }

        public Criteria andProdBatchCodeIsNotNull() {
            addCriterion("prod_batch_code is not null");
            return (Criteria) this;
        }

        public Criteria andProdBatchCodeEqualTo(String value) {
            addCriterion("prod_batch_code =", value, "prodBatchCode");
            return (Criteria) this;
        }

        public Criteria andProdBatchCodeNotEqualTo(String value) {
            addCriterion("prod_batch_code <>", value, "prodBatchCode");
            return (Criteria) this;
        }

        public Criteria andProdBatchCodeGreaterThan(String value) {
            addCriterion("prod_batch_code >", value, "prodBatchCode");
            return (Criteria) this;
        }

        public Criteria andProdBatchCodeGreaterThanOrEqualTo(String value) {
            addCriterion("prod_batch_code >=", value, "prodBatchCode");
            return (Criteria) this;
        }

        public Criteria andProdBatchCodeLessThan(String value) {
            addCriterion("prod_batch_code <", value, "prodBatchCode");
            return (Criteria) this;
        }

        public Criteria andProdBatchCodeLessThanOrEqualTo(String value) {
            addCriterion("prod_batch_code <=", value, "prodBatchCode");
            return (Criteria) this;
        }

        public Criteria andProdBatchCodeLike(String value) {
            addCriterion("prod_batch_code like", value, "prodBatchCode");
            return (Criteria) this;
        }

        public Criteria andProdBatchCodeNotLike(String value) {
            addCriterion("prod_batch_code not like", value, "prodBatchCode");
            return (Criteria) this;
        }

        public Criteria andProdBatchCodeIn(List<String> values) {
            addCriterion("prod_batch_code in", values, "prodBatchCode");
            return (Criteria) this;
        }

        public Criteria andProdBatchCodeNotIn(List<String> values) {
            addCriterion("prod_batch_code not in", values, "prodBatchCode");
            return (Criteria) this;
        }

        public Criteria andProdBatchCodeBetween(String value1, String value2) {
            addCriterion("prod_batch_code between", value1, value2, "prodBatchCode");
            return (Criteria) this;
        }

        public Criteria andProdBatchCodeNotBetween(String value1, String value2) {
            addCriterion("prod_batch_code not between", value1, value2, "prodBatchCode");
            return (Criteria) this;
        }

        public Criteria andProdOrderCodeIsNull() {
            addCriterion("prod_order_code is null");
            return (Criteria) this;
        }

        public Criteria andProdOrderCodeIsNotNull() {
            addCriterion("prod_order_code is not null");
            return (Criteria) this;
        }

        public Criteria andProdOrderCodeEqualTo(String value) {
            addCriterion("prod_order_code =", value, "prodOrderCode");
            return (Criteria) this;
        }

        public Criteria andProdOrderCodeNotEqualTo(String value) {
            addCriterion("prod_order_code <>", value, "prodOrderCode");
            return (Criteria) this;
        }

        public Criteria andProdOrderCodeGreaterThan(String value) {
            addCriterion("prod_order_code >", value, "prodOrderCode");
            return (Criteria) this;
        }

        public Criteria andProdOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("prod_order_code >=", value, "prodOrderCode");
            return (Criteria) this;
        }

        public Criteria andProdOrderCodeLessThan(String value) {
            addCriterion("prod_order_code <", value, "prodOrderCode");
            return (Criteria) this;
        }

        public Criteria andProdOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("prod_order_code <=", value, "prodOrderCode");
            return (Criteria) this;
        }

        public Criteria andProdOrderCodeLike(String value) {
            addCriterion("prod_order_code like", value, "prodOrderCode");
            return (Criteria) this;
        }

        public Criteria andProdOrderCodeNotLike(String value) {
            addCriterion("prod_order_code not like", value, "prodOrderCode");
            return (Criteria) this;
        }

        public Criteria andProdOrderCodeIn(List<String> values) {
            addCriterion("prod_order_code in", values, "prodOrderCode");
            return (Criteria) this;
        }

        public Criteria andProdOrderCodeNotIn(List<String> values) {
            addCriterion("prod_order_code not in", values, "prodOrderCode");
            return (Criteria) this;
        }

        public Criteria andProdOrderCodeBetween(String value1, String value2) {
            addCriterion("prod_order_code between", value1, value2, "prodOrderCode");
            return (Criteria) this;
        }

        public Criteria andProdOrderCodeNotBetween(String value1, String value2) {
            addCriterion("prod_order_code not between", value1, value2, "prodOrderCode");
            return (Criteria) this;
        }

        public Criteria andProdBarcodeIsNull() {
            addCriterion("prod_barcode is null");
            return (Criteria) this;
        }

        public Criteria andProdBarcodeIsNotNull() {
            addCriterion("prod_barcode is not null");
            return (Criteria) this;
        }

        public Criteria andProdBarcodeEqualTo(String value) {
            addCriterion("prod_barcode =", value, "prodBarcode");
            return (Criteria) this;
        }

        public Criteria andProdBarcodeNotEqualTo(String value) {
            addCriterion("prod_barcode <>", value, "prodBarcode");
            return (Criteria) this;
        }

        public Criteria andProdBarcodeGreaterThan(String value) {
            addCriterion("prod_barcode >", value, "prodBarcode");
            return (Criteria) this;
        }

        public Criteria andProdBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("prod_barcode >=", value, "prodBarcode");
            return (Criteria) this;
        }

        public Criteria andProdBarcodeLessThan(String value) {
            addCriterion("prod_barcode <", value, "prodBarcode");
            return (Criteria) this;
        }

        public Criteria andProdBarcodeLessThanOrEqualTo(String value) {
            addCriterion("prod_barcode <=", value, "prodBarcode");
            return (Criteria) this;
        }

        public Criteria andProdBarcodeLike(String value) {
            addCriterion("prod_barcode like", value, "prodBarcode");
            return (Criteria) this;
        }

        public Criteria andProdBarcodeNotLike(String value) {
            addCriterion("prod_barcode not like", value, "prodBarcode");
            return (Criteria) this;
        }

        public Criteria andProdBarcodeIn(List<String> values) {
            addCriterion("prod_barcode in", values, "prodBarcode");
            return (Criteria) this;
        }

        public Criteria andProdBarcodeNotIn(List<String> values) {
            addCriterion("prod_barcode not in", values, "prodBarcode");
            return (Criteria) this;
        }

        public Criteria andProdBarcodeBetween(String value1, String value2) {
            addCriterion("prod_barcode between", value1, value2, "prodBarcode");
            return (Criteria) this;
        }

        public Criteria andProdBarcodeNotBetween(String value1, String value2) {
            addCriterion("prod_barcode not between", value1, value2, "prodBarcode");
            return (Criteria) this;
        }

        public Criteria andNplFindOpIsNull() {
            addCriterion("npl_find_op is null");
            return (Criteria) this;
        }

        public Criteria andNplFindOpIsNotNull() {
            addCriterion("npl_find_op is not null");
            return (Criteria) this;
        }

        public Criteria andNplFindOpEqualTo(String value) {
            addCriterion("npl_find_op =", value, "nplFindOp");
            return (Criteria) this;
        }

        public Criteria andNplFindOpNotEqualTo(String value) {
            addCriterion("npl_find_op <>", value, "nplFindOp");
            return (Criteria) this;
        }

        public Criteria andNplFindOpGreaterThan(String value) {
            addCriterion("npl_find_op >", value, "nplFindOp");
            return (Criteria) this;
        }

        public Criteria andNplFindOpGreaterThanOrEqualTo(String value) {
            addCriterion("npl_find_op >=", value, "nplFindOp");
            return (Criteria) this;
        }

        public Criteria andNplFindOpLessThan(String value) {
            addCriterion("npl_find_op <", value, "nplFindOp");
            return (Criteria) this;
        }

        public Criteria andNplFindOpLessThanOrEqualTo(String value) {
            addCriterion("npl_find_op <=", value, "nplFindOp");
            return (Criteria) this;
        }

        public Criteria andNplFindOpLike(String value) {
            addCriterion("npl_find_op like", value, "nplFindOp");
            return (Criteria) this;
        }

        public Criteria andNplFindOpNotLike(String value) {
            addCriterion("npl_find_op not like", value, "nplFindOp");
            return (Criteria) this;
        }

        public Criteria andNplFindOpIn(List<String> values) {
            addCriterion("npl_find_op in", values, "nplFindOp");
            return (Criteria) this;
        }

        public Criteria andNplFindOpNotIn(List<String> values) {
            addCriterion("npl_find_op not in", values, "nplFindOp");
            return (Criteria) this;
        }

        public Criteria andNplFindOpBetween(String value1, String value2) {
            addCriterion("npl_find_op between", value1, value2, "nplFindOp");
            return (Criteria) this;
        }

        public Criteria andNplFindOpNotBetween(String value1, String value2) {
            addCriterion("npl_find_op not between", value1, value2, "nplFindOp");
            return (Criteria) this;
        }

        public Criteria andNplFindOpNameIsNull() {
            addCriterion("npl_find_op_name is null");
            return (Criteria) this;
        }

        public Criteria andNplFindOpNameIsNotNull() {
            addCriterion("npl_find_op_name is not null");
            return (Criteria) this;
        }

        public Criteria andNplFindOpNameEqualTo(String value) {
            addCriterion("npl_find_op_name =", value, "nplFindOpName");
            return (Criteria) this;
        }

        public Criteria andNplFindOpNameNotEqualTo(String value) {
            addCriterion("npl_find_op_name <>", value, "nplFindOpName");
            return (Criteria) this;
        }

        public Criteria andNplFindOpNameGreaterThan(String value) {
            addCriterion("npl_find_op_name >", value, "nplFindOpName");
            return (Criteria) this;
        }

        public Criteria andNplFindOpNameGreaterThanOrEqualTo(String value) {
            addCriterion("npl_find_op_name >=", value, "nplFindOpName");
            return (Criteria) this;
        }

        public Criteria andNplFindOpNameLessThan(String value) {
            addCriterion("npl_find_op_name <", value, "nplFindOpName");
            return (Criteria) this;
        }

        public Criteria andNplFindOpNameLessThanOrEqualTo(String value) {
            addCriterion("npl_find_op_name <=", value, "nplFindOpName");
            return (Criteria) this;
        }

        public Criteria andNplFindOpNameLike(String value) {
            addCriterion("npl_find_op_name like", value, "nplFindOpName");
            return (Criteria) this;
        }

        public Criteria andNplFindOpNameNotLike(String value) {
            addCriterion("npl_find_op_name not like", value, "nplFindOpName");
            return (Criteria) this;
        }

        public Criteria andNplFindOpNameIn(List<String> values) {
            addCriterion("npl_find_op_name in", values, "nplFindOpName");
            return (Criteria) this;
        }

        public Criteria andNplFindOpNameNotIn(List<String> values) {
            addCriterion("npl_find_op_name not in", values, "nplFindOpName");
            return (Criteria) this;
        }

        public Criteria andNplFindOpNameBetween(String value1, String value2) {
            addCriterion("npl_find_op_name between", value1, value2, "nplFindOpName");
            return (Criteria) this;
        }

        public Criteria andNplFindOpNameNotBetween(String value1, String value2) {
            addCriterion("npl_find_op_name not between", value1, value2, "nplFindOpName");
            return (Criteria) this;
        }

        public Criteria andNplProdOpIsNull() {
            addCriterion("npl_prod_op is null");
            return (Criteria) this;
        }

        public Criteria andNplProdOpIsNotNull() {
            addCriterion("npl_prod_op is not null");
            return (Criteria) this;
        }

        public Criteria andNplProdOpEqualTo(String value) {
            addCriterion("npl_prod_op =", value, "nplProdOp");
            return (Criteria) this;
        }

        public Criteria andNplProdOpNotEqualTo(String value) {
            addCriterion("npl_prod_op <>", value, "nplProdOp");
            return (Criteria) this;
        }

        public Criteria andNplProdOpGreaterThan(String value) {
            addCriterion("npl_prod_op >", value, "nplProdOp");
            return (Criteria) this;
        }

        public Criteria andNplProdOpGreaterThanOrEqualTo(String value) {
            addCriterion("npl_prod_op >=", value, "nplProdOp");
            return (Criteria) this;
        }

        public Criteria andNplProdOpLessThan(String value) {
            addCriterion("npl_prod_op <", value, "nplProdOp");
            return (Criteria) this;
        }

        public Criteria andNplProdOpLessThanOrEqualTo(String value) {
            addCriterion("npl_prod_op <=", value, "nplProdOp");
            return (Criteria) this;
        }

        public Criteria andNplProdOpLike(String value) {
            addCriterion("npl_prod_op like", value, "nplProdOp");
            return (Criteria) this;
        }

        public Criteria andNplProdOpNotLike(String value) {
            addCriterion("npl_prod_op not like", value, "nplProdOp");
            return (Criteria) this;
        }

        public Criteria andNplProdOpIn(List<String> values) {
            addCriterion("npl_prod_op in", values, "nplProdOp");
            return (Criteria) this;
        }

        public Criteria andNplProdOpNotIn(List<String> values) {
            addCriterion("npl_prod_op not in", values, "nplProdOp");
            return (Criteria) this;
        }

        public Criteria andNplProdOpBetween(String value1, String value2) {
            addCriterion("npl_prod_op between", value1, value2, "nplProdOp");
            return (Criteria) this;
        }

        public Criteria andNplProdOpNotBetween(String value1, String value2) {
            addCriterion("npl_prod_op not between", value1, value2, "nplProdOp");
            return (Criteria) this;
        }

        public Criteria andNplProdOpNameIsNull() {
            addCriterion("npl_prod_op_name is null");
            return (Criteria) this;
        }

        public Criteria andNplProdOpNameIsNotNull() {
            addCriterion("npl_prod_op_name is not null");
            return (Criteria) this;
        }

        public Criteria andNplProdOpNameEqualTo(String value) {
            addCriterion("npl_prod_op_name =", value, "nplProdOpName");
            return (Criteria) this;
        }

        public Criteria andNplProdOpNameNotEqualTo(String value) {
            addCriterion("npl_prod_op_name <>", value, "nplProdOpName");
            return (Criteria) this;
        }

        public Criteria andNplProdOpNameGreaterThan(String value) {
            addCriterion("npl_prod_op_name >", value, "nplProdOpName");
            return (Criteria) this;
        }

        public Criteria andNplProdOpNameGreaterThanOrEqualTo(String value) {
            addCriterion("npl_prod_op_name >=", value, "nplProdOpName");
            return (Criteria) this;
        }

        public Criteria andNplProdOpNameLessThan(String value) {
            addCriterion("npl_prod_op_name <", value, "nplProdOpName");
            return (Criteria) this;
        }

        public Criteria andNplProdOpNameLessThanOrEqualTo(String value) {
            addCriterion("npl_prod_op_name <=", value, "nplProdOpName");
            return (Criteria) this;
        }

        public Criteria andNplProdOpNameLike(String value) {
            addCriterion("npl_prod_op_name like", value, "nplProdOpName");
            return (Criteria) this;
        }

        public Criteria andNplProdOpNameNotLike(String value) {
            addCriterion("npl_prod_op_name not like", value, "nplProdOpName");
            return (Criteria) this;
        }

        public Criteria andNplProdOpNameIn(List<String> values) {
            addCriterion("npl_prod_op_name in", values, "nplProdOpName");
            return (Criteria) this;
        }

        public Criteria andNplProdOpNameNotIn(List<String> values) {
            addCriterion("npl_prod_op_name not in", values, "nplProdOpName");
            return (Criteria) this;
        }

        public Criteria andNplProdOpNameBetween(String value1, String value2) {
            addCriterion("npl_prod_op_name between", value1, value2, "nplProdOpName");
            return (Criteria) this;
        }

        public Criteria andNplProdOpNameNotBetween(String value1, String value2) {
            addCriterion("npl_prod_op_name not between", value1, value2, "nplProdOpName");
            return (Criteria) this;
        }

        public Criteria andNplWorkcenterIsNull() {
            addCriterion("npl_workcenter is null");
            return (Criteria) this;
        }

        public Criteria andNplWorkcenterIsNotNull() {
            addCriterion("npl_workcenter is not null");
            return (Criteria) this;
        }

        public Criteria andNplWorkcenterEqualTo(String value) {
            addCriterion("npl_workcenter =", value, "nplWorkcenter");
            return (Criteria) this;
        }

        public Criteria andNplWorkcenterNotEqualTo(String value) {
            addCriterion("npl_workcenter <>", value, "nplWorkcenter");
            return (Criteria) this;
        }

        public Criteria andNplWorkcenterGreaterThan(String value) {
            addCriterion("npl_workcenter >", value, "nplWorkcenter");
            return (Criteria) this;
        }

        public Criteria andNplWorkcenterGreaterThanOrEqualTo(String value) {
            addCriterion("npl_workcenter >=", value, "nplWorkcenter");
            return (Criteria) this;
        }

        public Criteria andNplWorkcenterLessThan(String value) {
            addCriterion("npl_workcenter <", value, "nplWorkcenter");
            return (Criteria) this;
        }

        public Criteria andNplWorkcenterLessThanOrEqualTo(String value) {
            addCriterion("npl_workcenter <=", value, "nplWorkcenter");
            return (Criteria) this;
        }

        public Criteria andNplWorkcenterLike(String value) {
            addCriterion("npl_workcenter like", value, "nplWorkcenter");
            return (Criteria) this;
        }

        public Criteria andNplWorkcenterNotLike(String value) {
            addCriterion("npl_workcenter not like", value, "nplWorkcenter");
            return (Criteria) this;
        }

        public Criteria andNplWorkcenterIn(List<String> values) {
            addCriterion("npl_workcenter in", values, "nplWorkcenter");
            return (Criteria) this;
        }

        public Criteria andNplWorkcenterNotIn(List<String> values) {
            addCriterion("npl_workcenter not in", values, "nplWorkcenter");
            return (Criteria) this;
        }

        public Criteria andNplWorkcenterBetween(String value1, String value2) {
            addCriterion("npl_workcenter between", value1, value2, "nplWorkcenter");
            return (Criteria) this;
        }

        public Criteria andNplWorkcenterNotBetween(String value1, String value2) {
            addCriterion("npl_workcenter not between", value1, value2, "nplWorkcenter");
            return (Criteria) this;
        }

        public Criteria andNplWorkcenterNameIsNull() {
            addCriterion("npl_workcenter_name is null");
            return (Criteria) this;
        }

        public Criteria andNplWorkcenterNameIsNotNull() {
            addCriterion("npl_workcenter_name is not null");
            return (Criteria) this;
        }

        public Criteria andNplWorkcenterNameEqualTo(String value) {
            addCriterion("npl_workcenter_name =", value, "nplWorkcenterName");
            return (Criteria) this;
        }

        public Criteria andNplWorkcenterNameNotEqualTo(String value) {
            addCriterion("npl_workcenter_name <>", value, "nplWorkcenterName");
            return (Criteria) this;
        }

        public Criteria andNplWorkcenterNameGreaterThan(String value) {
            addCriterion("npl_workcenter_name >", value, "nplWorkcenterName");
            return (Criteria) this;
        }

        public Criteria andNplWorkcenterNameGreaterThanOrEqualTo(String value) {
            addCriterion("npl_workcenter_name >=", value, "nplWorkcenterName");
            return (Criteria) this;
        }

        public Criteria andNplWorkcenterNameLessThan(String value) {
            addCriterion("npl_workcenter_name <", value, "nplWorkcenterName");
            return (Criteria) this;
        }

        public Criteria andNplWorkcenterNameLessThanOrEqualTo(String value) {
            addCriterion("npl_workcenter_name <=", value, "nplWorkcenterName");
            return (Criteria) this;
        }

        public Criteria andNplWorkcenterNameLike(String value) {
            addCriterion("npl_workcenter_name like", value, "nplWorkcenterName");
            return (Criteria) this;
        }

        public Criteria andNplWorkcenterNameNotLike(String value) {
            addCriterion("npl_workcenter_name not like", value, "nplWorkcenterName");
            return (Criteria) this;
        }

        public Criteria andNplWorkcenterNameIn(List<String> values) {
            addCriterion("npl_workcenter_name in", values, "nplWorkcenterName");
            return (Criteria) this;
        }

        public Criteria andNplWorkcenterNameNotIn(List<String> values) {
            addCriterion("npl_workcenter_name not in", values, "nplWorkcenterName");
            return (Criteria) this;
        }

        public Criteria andNplWorkcenterNameBetween(String value1, String value2) {
            addCriterion("npl_workcenter_name between", value1, value2, "nplWorkcenterName");
            return (Criteria) this;
        }

        public Criteria andNplWorkcenterNameNotBetween(String value1, String value2) {
            addCriterion("npl_workcenter_name not between", value1, value2, "nplWorkcenterName");
            return (Criteria) this;
        }

        public Criteria andNplDefectIsNull() {
            addCriterion("npl_defect is null");
            return (Criteria) this;
        }

        public Criteria andNplDefectIsNotNull() {
            addCriterion("npl_defect is not null");
            return (Criteria) this;
        }

        public Criteria andNplDefectEqualTo(String value) {
            addCriterion("npl_defect =", value, "nplDefect");
            return (Criteria) this;
        }

        public Criteria andNplDefectNotEqualTo(String value) {
            addCriterion("npl_defect <>", value, "nplDefect");
            return (Criteria) this;
        }

        public Criteria andNplDefectGreaterThan(String value) {
            addCriterion("npl_defect >", value, "nplDefect");
            return (Criteria) this;
        }

        public Criteria andNplDefectGreaterThanOrEqualTo(String value) {
            addCriterion("npl_defect >=", value, "nplDefect");
            return (Criteria) this;
        }

        public Criteria andNplDefectLessThan(String value) {
            addCriterion("npl_defect <", value, "nplDefect");
            return (Criteria) this;
        }

        public Criteria andNplDefectLessThanOrEqualTo(String value) {
            addCriterion("npl_defect <=", value, "nplDefect");
            return (Criteria) this;
        }

        public Criteria andNplDefectLike(String value) {
            addCriterion("npl_defect like", value, "nplDefect");
            return (Criteria) this;
        }

        public Criteria andNplDefectNotLike(String value) {
            addCriterion("npl_defect not like", value, "nplDefect");
            return (Criteria) this;
        }

        public Criteria andNplDefectIn(List<String> values) {
            addCriterion("npl_defect in", values, "nplDefect");
            return (Criteria) this;
        }

        public Criteria andNplDefectNotIn(List<String> values) {
            addCriterion("npl_defect not in", values, "nplDefect");
            return (Criteria) this;
        }

        public Criteria andNplDefectBetween(String value1, String value2) {
            addCriterion("npl_defect between", value1, value2, "nplDefect");
            return (Criteria) this;
        }

        public Criteria andNplDefectNotBetween(String value1, String value2) {
            addCriterion("npl_defect not between", value1, value2, "nplDefect");
            return (Criteria) this;
        }

        public Criteria andNplDefectDescIsNull() {
            addCriterion("npl_defect_desc is null");
            return (Criteria) this;
        }

        public Criteria andNplDefectDescIsNotNull() {
            addCriterion("npl_defect_desc is not null");
            return (Criteria) this;
        }

        public Criteria andNplDefectDescEqualTo(String value) {
            addCriterion("npl_defect_desc =", value, "nplDefectDesc");
            return (Criteria) this;
        }

        public Criteria andNplDefectDescNotEqualTo(String value) {
            addCriterion("npl_defect_desc <>", value, "nplDefectDesc");
            return (Criteria) this;
        }

        public Criteria andNplDefectDescGreaterThan(String value) {
            addCriterion("npl_defect_desc >", value, "nplDefectDesc");
            return (Criteria) this;
        }

        public Criteria andNplDefectDescGreaterThanOrEqualTo(String value) {
            addCriterion("npl_defect_desc >=", value, "nplDefectDesc");
            return (Criteria) this;
        }

        public Criteria andNplDefectDescLessThan(String value) {
            addCriterion("npl_defect_desc <", value, "nplDefectDesc");
            return (Criteria) this;
        }

        public Criteria andNplDefectDescLessThanOrEqualTo(String value) {
            addCriterion("npl_defect_desc <=", value, "nplDefectDesc");
            return (Criteria) this;
        }

        public Criteria andNplDefectDescLike(String value) {
            addCriterion("npl_defect_desc like", value, "nplDefectDesc");
            return (Criteria) this;
        }

        public Criteria andNplDefectDescNotLike(String value) {
            addCriterion("npl_defect_desc not like", value, "nplDefectDesc");
            return (Criteria) this;
        }

        public Criteria andNplDefectDescIn(List<String> values) {
            addCriterion("npl_defect_desc in", values, "nplDefectDesc");
            return (Criteria) this;
        }

        public Criteria andNplDefectDescNotIn(List<String> values) {
            addCriterion("npl_defect_desc not in", values, "nplDefectDesc");
            return (Criteria) this;
        }

        public Criteria andNplDefectDescBetween(String value1, String value2) {
            addCriterion("npl_defect_desc between", value1, value2, "nplDefectDesc");
            return (Criteria) this;
        }

        public Criteria andNplDefectDescNotBetween(String value1, String value2) {
            addCriterion("npl_defect_desc not between", value1, value2, "nplDefectDesc");
            return (Criteria) this;
        }

        public Criteria andNplCostCenterIsNull() {
            addCriterion("npl_cost_center is null");
            return (Criteria) this;
        }

        public Criteria andNplCostCenterIsNotNull() {
            addCriterion("npl_cost_center is not null");
            return (Criteria) this;
        }

        public Criteria andNplCostCenterEqualTo(String value) {
            addCriterion("npl_cost_center =", value, "nplCostCenter");
            return (Criteria) this;
        }

        public Criteria andNplCostCenterNotEqualTo(String value) {
            addCriterion("npl_cost_center <>", value, "nplCostCenter");
            return (Criteria) this;
        }

        public Criteria andNplCostCenterGreaterThan(String value) {
            addCriterion("npl_cost_center >", value, "nplCostCenter");
            return (Criteria) this;
        }

        public Criteria andNplCostCenterGreaterThanOrEqualTo(String value) {
            addCriterion("npl_cost_center >=", value, "nplCostCenter");
            return (Criteria) this;
        }

        public Criteria andNplCostCenterLessThan(String value) {
            addCriterion("npl_cost_center <", value, "nplCostCenter");
            return (Criteria) this;
        }

        public Criteria andNplCostCenterLessThanOrEqualTo(String value) {
            addCriterion("npl_cost_center <=", value, "nplCostCenter");
            return (Criteria) this;
        }

        public Criteria andNplCostCenterLike(String value) {
            addCriterion("npl_cost_center like", value, "nplCostCenter");
            return (Criteria) this;
        }

        public Criteria andNplCostCenterNotLike(String value) {
            addCriterion("npl_cost_center not like", value, "nplCostCenter");
            return (Criteria) this;
        }

        public Criteria andNplCostCenterIn(List<String> values) {
            addCriterion("npl_cost_center in", values, "nplCostCenter");
            return (Criteria) this;
        }

        public Criteria andNplCostCenterNotIn(List<String> values) {
            addCriterion("npl_cost_center not in", values, "nplCostCenter");
            return (Criteria) this;
        }

        public Criteria andNplCostCenterBetween(String value1, String value2) {
            addCriterion("npl_cost_center between", value1, value2, "nplCostCenter");
            return (Criteria) this;
        }

        public Criteria andNplCostCenterNotBetween(String value1, String value2) {
            addCriterion("npl_cost_center not between", value1, value2, "nplCostCenter");
            return (Criteria) this;
        }

        public Criteria andNplCostCenterNameIsNull() {
            addCriterion("npl_cost_center_name is null");
            return (Criteria) this;
        }

        public Criteria andNplCostCenterNameIsNotNull() {
            addCriterion("npl_cost_center_name is not null");
            return (Criteria) this;
        }

        public Criteria andNplCostCenterNameEqualTo(String value) {
            addCriterion("npl_cost_center_name =", value, "nplCostCenterName");
            return (Criteria) this;
        }

        public Criteria andNplCostCenterNameNotEqualTo(String value) {
            addCriterion("npl_cost_center_name <>", value, "nplCostCenterName");
            return (Criteria) this;
        }

        public Criteria andNplCostCenterNameGreaterThan(String value) {
            addCriterion("npl_cost_center_name >", value, "nplCostCenterName");
            return (Criteria) this;
        }

        public Criteria andNplCostCenterNameGreaterThanOrEqualTo(String value) {
            addCriterion("npl_cost_center_name >=", value, "nplCostCenterName");
            return (Criteria) this;
        }

        public Criteria andNplCostCenterNameLessThan(String value) {
            addCriterion("npl_cost_center_name <", value, "nplCostCenterName");
            return (Criteria) this;
        }

        public Criteria andNplCostCenterNameLessThanOrEqualTo(String value) {
            addCriterion("npl_cost_center_name <=", value, "nplCostCenterName");
            return (Criteria) this;
        }

        public Criteria andNplCostCenterNameLike(String value) {
            addCriterion("npl_cost_center_name like", value, "nplCostCenterName");
            return (Criteria) this;
        }

        public Criteria andNplCostCenterNameNotLike(String value) {
            addCriterion("npl_cost_center_name not like", value, "nplCostCenterName");
            return (Criteria) this;
        }

        public Criteria andNplCostCenterNameIn(List<String> values) {
            addCriterion("npl_cost_center_name in", values, "nplCostCenterName");
            return (Criteria) this;
        }

        public Criteria andNplCostCenterNameNotIn(List<String> values) {
            addCriterion("npl_cost_center_name not in", values, "nplCostCenterName");
            return (Criteria) this;
        }

        public Criteria andNplCostCenterNameBetween(String value1, String value2) {
            addCriterion("npl_cost_center_name between", value1, value2, "nplCostCenterName");
            return (Criteria) this;
        }

        public Criteria andNplCostCenterNameNotBetween(String value1, String value2) {
            addCriterion("npl_cost_center_name not between", value1, value2, "nplCostCenterName");
            return (Criteria) this;
        }

        public Criteria andNplQtyIsNull() {
            addCriterion("npl_qty is null");
            return (Criteria) this;
        }

        public Criteria andNplQtyIsNotNull() {
            addCriterion("npl_qty is not null");
            return (Criteria) this;
        }

        public Criteria andNplQtyEqualTo(Integer value) {
            addCriterion("npl_qty =", value, "nplQty");
            return (Criteria) this;
        }

        public Criteria andNplQtyNotEqualTo(Integer value) {
            addCriterion("npl_qty <>", value, "nplQty");
            return (Criteria) this;
        }

        public Criteria andNplQtyGreaterThan(Integer value) {
            addCriterion("npl_qty >", value, "nplQty");
            return (Criteria) this;
        }

        public Criteria andNplQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("npl_qty >=", value, "nplQty");
            return (Criteria) this;
        }

        public Criteria andNplQtyLessThan(Integer value) {
            addCriterion("npl_qty <", value, "nplQty");
            return (Criteria) this;
        }

        public Criteria andNplQtyLessThanOrEqualTo(Integer value) {
            addCriterion("npl_qty <=", value, "nplQty");
            return (Criteria) this;
        }

        public Criteria andNplQtyIn(List<Integer> values) {
            addCriterion("npl_qty in", values, "nplQty");
            return (Criteria) this;
        }

        public Criteria andNplQtyNotIn(List<Integer> values) {
            addCriterion("npl_qty not in", values, "nplQty");
            return (Criteria) this;
        }

        public Criteria andNplQtyBetween(Integer value1, Integer value2) {
            addCriterion("npl_qty between", value1, value2, "nplQty");
            return (Criteria) this;
        }

        public Criteria andNplQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("npl_qty not between", value1, value2, "nplQty");
            return (Criteria) this;
        }

        public Criteria andNplBatchStatusIsNull() {
            addCriterion("npl_batch_status is null");
            return (Criteria) this;
        }

        public Criteria andNplBatchStatusIsNotNull() {
            addCriterion("npl_batch_status is not null");
            return (Criteria) this;
        }

        public Criteria andNplBatchStatusEqualTo(String value) {
            addCriterion("npl_batch_status =", value, "nplBatchStatus");
            return (Criteria) this;
        }

        public Criteria andNplBatchStatusNotEqualTo(String value) {
            addCriterion("npl_batch_status <>", value, "nplBatchStatus");
            return (Criteria) this;
        }

        public Criteria andNplBatchStatusGreaterThan(String value) {
            addCriterion("npl_batch_status >", value, "nplBatchStatus");
            return (Criteria) this;
        }

        public Criteria andNplBatchStatusGreaterThanOrEqualTo(String value) {
            addCriterion("npl_batch_status >=", value, "nplBatchStatus");
            return (Criteria) this;
        }

        public Criteria andNplBatchStatusLessThan(String value) {
            addCriterion("npl_batch_status <", value, "nplBatchStatus");
            return (Criteria) this;
        }

        public Criteria andNplBatchStatusLessThanOrEqualTo(String value) {
            addCriterion("npl_batch_status <=", value, "nplBatchStatus");
            return (Criteria) this;
        }

        public Criteria andNplBatchStatusLike(String value) {
            addCriterion("npl_batch_status like", value, "nplBatchStatus");
            return (Criteria) this;
        }

        public Criteria andNplBatchStatusNotLike(String value) {
            addCriterion("npl_batch_status not like", value, "nplBatchStatus");
            return (Criteria) this;
        }

        public Criteria andNplBatchStatusIn(List<String> values) {
            addCriterion("npl_batch_status in", values, "nplBatchStatus");
            return (Criteria) this;
        }

        public Criteria andNplBatchStatusNotIn(List<String> values) {
            addCriterion("npl_batch_status not in", values, "nplBatchStatus");
            return (Criteria) this;
        }

        public Criteria andNplBatchStatusBetween(String value1, String value2) {
            addCriterion("npl_batch_status between", value1, value2, "nplBatchStatus");
            return (Criteria) this;
        }

        public Criteria andNplBatchStatusNotBetween(String value1, String value2) {
            addCriterion("npl_batch_status not between", value1, value2, "nplBatchStatus");
            return (Criteria) this;
        }

        public Criteria andNplIsTestPartIsNull() {
            addCriterion("npl_is_test_part is null");
            return (Criteria) this;
        }

        public Criteria andNplIsTestPartIsNotNull() {
            addCriterion("npl_is_test_part is not null");
            return (Criteria) this;
        }

        public Criteria andNplIsTestPartEqualTo(Boolean value) {
            addCriterion("npl_is_test_part =", value, "nplIsTestPart");
            return (Criteria) this;
        }

        public Criteria andNplIsTestPartNotEqualTo(Boolean value) {
            addCriterion("npl_is_test_part <>", value, "nplIsTestPart");
            return (Criteria) this;
        }

        public Criteria andNplIsTestPartGreaterThan(Boolean value) {
            addCriterion("npl_is_test_part >", value, "nplIsTestPart");
            return (Criteria) this;
        }

        public Criteria andNplIsTestPartGreaterThanOrEqualTo(Boolean value) {
            addCriterion("npl_is_test_part >=", value, "nplIsTestPart");
            return (Criteria) this;
        }

        public Criteria andNplIsTestPartLessThan(Boolean value) {
            addCriterion("npl_is_test_part <", value, "nplIsTestPart");
            return (Criteria) this;
        }

        public Criteria andNplIsTestPartLessThanOrEqualTo(Boolean value) {
            addCriterion("npl_is_test_part <=", value, "nplIsTestPart");
            return (Criteria) this;
        }

        public Criteria andNplIsTestPartIn(List<Boolean> values) {
            addCriterion("npl_is_test_part in", values, "nplIsTestPart");
            return (Criteria) this;
        }

        public Criteria andNplIsTestPartNotIn(List<Boolean> values) {
            addCriterion("npl_is_test_part not in", values, "nplIsTestPart");
            return (Criteria) this;
        }

        public Criteria andNplIsTestPartBetween(Boolean value1, Boolean value2) {
            addCriterion("npl_is_test_part between", value1, value2, "nplIsTestPart");
            return (Criteria) this;
        }

        public Criteria andNplIsTestPartNotBetween(Boolean value1, Boolean value2) {
            addCriterion("npl_is_test_part not between", value1, value2, "nplIsTestPart");
            return (Criteria) this;
        }

        public Criteria andNplDeviceCodeIsNull() {
            addCriterion("npl_device_code is null");
            return (Criteria) this;
        }

        public Criteria andNplDeviceCodeIsNotNull() {
            addCriterion("npl_device_code is not null");
            return (Criteria) this;
        }

        public Criteria andNplDeviceCodeEqualTo(String value) {
            addCriterion("npl_device_code =", value, "nplDeviceCode");
            return (Criteria) this;
        }

        public Criteria andNplDeviceCodeNotEqualTo(String value) {
            addCriterion("npl_device_code <>", value, "nplDeviceCode");
            return (Criteria) this;
        }

        public Criteria andNplDeviceCodeGreaterThan(String value) {
            addCriterion("npl_device_code >", value, "nplDeviceCode");
            return (Criteria) this;
        }

        public Criteria andNplDeviceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("npl_device_code >=", value, "nplDeviceCode");
            return (Criteria) this;
        }

        public Criteria andNplDeviceCodeLessThan(String value) {
            addCriterion("npl_device_code <", value, "nplDeviceCode");
            return (Criteria) this;
        }

        public Criteria andNplDeviceCodeLessThanOrEqualTo(String value) {
            addCriterion("npl_device_code <=", value, "nplDeviceCode");
            return (Criteria) this;
        }

        public Criteria andNplDeviceCodeLike(String value) {
            addCriterion("npl_device_code like", value, "nplDeviceCode");
            return (Criteria) this;
        }

        public Criteria andNplDeviceCodeNotLike(String value) {
            addCriterion("npl_device_code not like", value, "nplDeviceCode");
            return (Criteria) this;
        }

        public Criteria andNplDeviceCodeIn(List<String> values) {
            addCriterion("npl_device_code in", values, "nplDeviceCode");
            return (Criteria) this;
        }

        public Criteria andNplDeviceCodeNotIn(List<String> values) {
            addCriterion("npl_device_code not in", values, "nplDeviceCode");
            return (Criteria) this;
        }

        public Criteria andNplDeviceCodeBetween(String value1, String value2) {
            addCriterion("npl_device_code between", value1, value2, "nplDeviceCode");
            return (Criteria) this;
        }

        public Criteria andNplDeviceCodeNotBetween(String value1, String value2) {
            addCriterion("npl_device_code not between", value1, value2, "nplDeviceCode");
            return (Criteria) this;
        }

        public Criteria andNplDutyTypeIsNull() {
            addCriterion("npl_duty_type is null");
            return (Criteria) this;
        }

        public Criteria andNplDutyTypeIsNotNull() {
            addCriterion("npl_duty_type is not null");
            return (Criteria) this;
        }

        public Criteria andNplDutyTypeEqualTo(String value) {
            addCriterion("npl_duty_type =", value, "nplDutyType");
            return (Criteria) this;
        }

        public Criteria andNplDutyTypeNotEqualTo(String value) {
            addCriterion("npl_duty_type <>", value, "nplDutyType");
            return (Criteria) this;
        }

        public Criteria andNplDutyTypeGreaterThan(String value) {
            addCriterion("npl_duty_type >", value, "nplDutyType");
            return (Criteria) this;
        }

        public Criteria andNplDutyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("npl_duty_type >=", value, "nplDutyType");
            return (Criteria) this;
        }

        public Criteria andNplDutyTypeLessThan(String value) {
            addCriterion("npl_duty_type <", value, "nplDutyType");
            return (Criteria) this;
        }

        public Criteria andNplDutyTypeLessThanOrEqualTo(String value) {
            addCriterion("npl_duty_type <=", value, "nplDutyType");
            return (Criteria) this;
        }

        public Criteria andNplDutyTypeLike(String value) {
            addCriterion("npl_duty_type like", value, "nplDutyType");
            return (Criteria) this;
        }

        public Criteria andNplDutyTypeNotLike(String value) {
            addCriterion("npl_duty_type not like", value, "nplDutyType");
            return (Criteria) this;
        }

        public Criteria andNplDutyTypeIn(List<String> values) {
            addCriterion("npl_duty_type in", values, "nplDutyType");
            return (Criteria) this;
        }

        public Criteria andNplDutyTypeNotIn(List<String> values) {
            addCriterion("npl_duty_type not in", values, "nplDutyType");
            return (Criteria) this;
        }

        public Criteria andNplDutyTypeBetween(String value1, String value2) {
            addCriterion("npl_duty_type between", value1, value2, "nplDutyType");
            return (Criteria) this;
        }

        public Criteria andNplDutyTypeNotBetween(String value1, String value2) {
            addCriterion("npl_duty_type not between", value1, value2, "nplDutyType");
            return (Criteria) this;
        }

        public Criteria andNplReviewResultIsNull() {
            addCriterion("npl_review_result is null");
            return (Criteria) this;
        }

        public Criteria andNplReviewResultIsNotNull() {
            addCriterion("npl_review_result is not null");
            return (Criteria) this;
        }

        public Criteria andNplReviewResultEqualTo(String value) {
            addCriterion("npl_review_result =", value, "nplReviewResult");
            return (Criteria) this;
        }

        public Criteria andNplReviewResultNotEqualTo(String value) {
            addCriterion("npl_review_result <>", value, "nplReviewResult");
            return (Criteria) this;
        }

        public Criteria andNplReviewResultGreaterThan(String value) {
            addCriterion("npl_review_result >", value, "nplReviewResult");
            return (Criteria) this;
        }

        public Criteria andNplReviewResultGreaterThanOrEqualTo(String value) {
            addCriterion("npl_review_result >=", value, "nplReviewResult");
            return (Criteria) this;
        }

        public Criteria andNplReviewResultLessThan(String value) {
            addCriterion("npl_review_result <", value, "nplReviewResult");
            return (Criteria) this;
        }

        public Criteria andNplReviewResultLessThanOrEqualTo(String value) {
            addCriterion("npl_review_result <=", value, "nplReviewResult");
            return (Criteria) this;
        }

        public Criteria andNplReviewResultLike(String value) {
            addCriterion("npl_review_result like", value, "nplReviewResult");
            return (Criteria) this;
        }

        public Criteria andNplReviewResultNotLike(String value) {
            addCriterion("npl_review_result not like", value, "nplReviewResult");
            return (Criteria) this;
        }

        public Criteria andNplReviewResultIn(List<String> values) {
            addCriterion("npl_review_result in", values, "nplReviewResult");
            return (Criteria) this;
        }

        public Criteria andNplReviewResultNotIn(List<String> values) {
            addCriterion("npl_review_result not in", values, "nplReviewResult");
            return (Criteria) this;
        }

        public Criteria andNplReviewResultBetween(String value1, String value2) {
            addCriterion("npl_review_result between", value1, value2, "nplReviewResult");
            return (Criteria) this;
        }

        public Criteria andNplReviewResultNotBetween(String value1, String value2) {
            addCriterion("npl_review_result not between", value1, value2, "nplReviewResult");
            return (Criteria) this;
        }

        public Criteria andNplIsAssemblyIsNull() {
            addCriterion("npl_is_assembly is null");
            return (Criteria) this;
        }

        public Criteria andNplIsAssemblyIsNotNull() {
            addCriterion("npl_is_assembly is not null");
            return (Criteria) this;
        }

        public Criteria andNplIsAssemblyEqualTo(Boolean value) {
            addCriterion("npl_is_assembly =", value, "nplIsAssembly");
            return (Criteria) this;
        }

        public Criteria andNplIsAssemblyNotEqualTo(Boolean value) {
            addCriterion("npl_is_assembly <>", value, "nplIsAssembly");
            return (Criteria) this;
        }

        public Criteria andNplIsAssemblyGreaterThan(Boolean value) {
            addCriterion("npl_is_assembly >", value, "nplIsAssembly");
            return (Criteria) this;
        }

        public Criteria andNplIsAssemblyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("npl_is_assembly >=", value, "nplIsAssembly");
            return (Criteria) this;
        }

        public Criteria andNplIsAssemblyLessThan(Boolean value) {
            addCriterion("npl_is_assembly <", value, "nplIsAssembly");
            return (Criteria) this;
        }

        public Criteria andNplIsAssemblyLessThanOrEqualTo(Boolean value) {
            addCriterion("npl_is_assembly <=", value, "nplIsAssembly");
            return (Criteria) this;
        }

        public Criteria andNplIsAssemblyIn(List<Boolean> values) {
            addCriterion("npl_is_assembly in", values, "nplIsAssembly");
            return (Criteria) this;
        }

        public Criteria andNplIsAssemblyNotIn(List<Boolean> values) {
            addCriterion("npl_is_assembly not in", values, "nplIsAssembly");
            return (Criteria) this;
        }

        public Criteria andNplIsAssemblyBetween(Boolean value1, Boolean value2) {
            addCriterion("npl_is_assembly between", value1, value2, "nplIsAssembly");
            return (Criteria) this;
        }

        public Criteria andNplIsAssemblyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("npl_is_assembly not between", value1, value2, "nplIsAssembly");
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

        public Criteria andCreatePersonNoIsNull() {
            addCriterion("create_person_no is null");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNoIsNotNull() {
            addCriterion("create_person_no is not null");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNoEqualTo(String value) {
            addCriterion("create_person_no =", value, "createPersonNo");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNoNotEqualTo(String value) {
            addCriterion("create_person_no <>", value, "createPersonNo");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNoGreaterThan(String value) {
            addCriterion("create_person_no >", value, "createPersonNo");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNoGreaterThanOrEqualTo(String value) {
            addCriterion("create_person_no >=", value, "createPersonNo");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNoLessThan(String value) {
            addCriterion("create_person_no <", value, "createPersonNo");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNoLessThanOrEqualTo(String value) {
            addCriterion("create_person_no <=", value, "createPersonNo");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNoLike(String value) {
            addCriterion("create_person_no like", value, "createPersonNo");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNoNotLike(String value) {
            addCriterion("create_person_no not like", value, "createPersonNo");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNoIn(List<String> values) {
            addCriterion("create_person_no in", values, "createPersonNo");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNoNotIn(List<String> values) {
            addCriterion("create_person_no not in", values, "createPersonNo");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNoBetween(String value1, String value2) {
            addCriterion("create_person_no between", value1, value2, "createPersonNo");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNoNotBetween(String value1, String value2) {
            addCriterion("create_person_no not between", value1, value2, "createPersonNo");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNameIsNull() {
            addCriterion("create_person_name is null");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNameIsNotNull() {
            addCriterion("create_person_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNameEqualTo(String value) {
            addCriterion("create_person_name =", value, "createPersonName");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNameNotEqualTo(String value) {
            addCriterion("create_person_name <>", value, "createPersonName");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNameGreaterThan(String value) {
            addCriterion("create_person_name >", value, "createPersonName");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("create_person_name >=", value, "createPersonName");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNameLessThan(String value) {
            addCriterion("create_person_name <", value, "createPersonName");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNameLessThanOrEqualTo(String value) {
            addCriterion("create_person_name <=", value, "createPersonName");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNameLike(String value) {
            addCriterion("create_person_name like", value, "createPersonName");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNameNotLike(String value) {
            addCriterion("create_person_name not like", value, "createPersonName");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNameIn(List<String> values) {
            addCriterion("create_person_name in", values, "createPersonName");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNameNotIn(List<String> values) {
            addCriterion("create_person_name not in", values, "createPersonName");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNameBetween(String value1, String value2) {
            addCriterion("create_person_name between", value1, value2, "createPersonName");
            return (Criteria) this;
        }

        public Criteria andCreatePersonNameNotBetween(String value1, String value2) {
            addCriterion("create_person_name not between", value1, value2, "createPersonName");
            return (Criteria) this;
        }

        public Criteria andNplNoteIsNull() {
            addCriterion("npl_note is null");
            return (Criteria) this;
        }

        public Criteria andNplNoteIsNotNull() {
            addCriterion("npl_note is not null");
            return (Criteria) this;
        }

        public Criteria andNplNoteEqualTo(String value) {
            addCriterion("npl_note =", value, "nplNote");
            return (Criteria) this;
        }

        public Criteria andNplNoteNotEqualTo(String value) {
            addCriterion("npl_note <>", value, "nplNote");
            return (Criteria) this;
        }

        public Criteria andNplNoteGreaterThan(String value) {
            addCriterion("npl_note >", value, "nplNote");
            return (Criteria) this;
        }

        public Criteria andNplNoteGreaterThanOrEqualTo(String value) {
            addCriterion("npl_note >=", value, "nplNote");
            return (Criteria) this;
        }

        public Criteria andNplNoteLessThan(String value) {
            addCriterion("npl_note <", value, "nplNote");
            return (Criteria) this;
        }

        public Criteria andNplNoteLessThanOrEqualTo(String value) {
            addCriterion("npl_note <=", value, "nplNote");
            return (Criteria) this;
        }

        public Criteria andNplNoteLike(String value) {
            addCriterion("npl_note like", value, "nplNote");
            return (Criteria) this;
        }

        public Criteria andNplNoteNotLike(String value) {
            addCriterion("npl_note not like", value, "nplNote");
            return (Criteria) this;
        }

        public Criteria andNplNoteIn(List<String> values) {
            addCriterion("npl_note in", values, "nplNote");
            return (Criteria) this;
        }

        public Criteria andNplNoteNotIn(List<String> values) {
            addCriterion("npl_note not in", values, "nplNote");
            return (Criteria) this;
        }

        public Criteria andNplNoteBetween(String value1, String value2) {
            addCriterion("npl_note between", value1, value2, "nplNote");
            return (Criteria) this;
        }

        public Criteria andNplNoteNotBetween(String value1, String value2) {
            addCriterion("npl_note not between", value1, value2, "nplNote");
            return (Criteria) this;
        }

        public Criteria andNplStatusIsNull() {
            addCriterion("npl_status is null");
            return (Criteria) this;
        }

        public Criteria andNplStatusIsNotNull() {
            addCriterion("npl_status is not null");
            return (Criteria) this;
        }

        public Criteria andNplStatusEqualTo(String value) {
            addCriterion("npl_status =", value, "nplStatus");
            return (Criteria) this;
        }

        public Criteria andNplStatusNotEqualTo(String value) {
            addCriterion("npl_status <>", value, "nplStatus");
            return (Criteria) this;
        }

        public Criteria andNplStatusGreaterThan(String value) {
            addCriterion("npl_status >", value, "nplStatus");
            return (Criteria) this;
        }

        public Criteria andNplStatusGreaterThanOrEqualTo(String value) {
            addCriterion("npl_status >=", value, "nplStatus");
            return (Criteria) this;
        }

        public Criteria andNplStatusLessThan(String value) {
            addCriterion("npl_status <", value, "nplStatus");
            return (Criteria) this;
        }

        public Criteria andNplStatusLessThanOrEqualTo(String value) {
            addCriterion("npl_status <=", value, "nplStatus");
            return (Criteria) this;
        }

        public Criteria andNplStatusLike(String value) {
            addCriterion("npl_status like", value, "nplStatus");
            return (Criteria) this;
        }

        public Criteria andNplStatusNotLike(String value) {
            addCriterion("npl_status not like", value, "nplStatus");
            return (Criteria) this;
        }

        public Criteria andNplStatusIn(List<String> values) {
            addCriterion("npl_status in", values, "nplStatus");
            return (Criteria) this;
        }

        public Criteria andNplStatusNotIn(List<String> values) {
            addCriterion("npl_status not in", values, "nplStatus");
            return (Criteria) this;
        }

        public Criteria andNplStatusBetween(String value1, String value2) {
            addCriterion("npl_status between", value1, value2, "nplStatus");
            return (Criteria) this;
        }

        public Criteria andNplStatusNotBetween(String value1, String value2) {
            addCriterion("npl_status not between", value1, value2, "nplStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNoIsNull() {
            addCriterion("confirm_person_no is null");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNoIsNotNull() {
            addCriterion("confirm_person_no is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNoEqualTo(String value) {
            addCriterion("confirm_person_no =", value, "confirmPersonNo");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNoNotEqualTo(String value) {
            addCriterion("confirm_person_no <>", value, "confirmPersonNo");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNoGreaterThan(String value) {
            addCriterion("confirm_person_no >", value, "confirmPersonNo");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNoGreaterThanOrEqualTo(String value) {
            addCriterion("confirm_person_no >=", value, "confirmPersonNo");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNoLessThan(String value) {
            addCriterion("confirm_person_no <", value, "confirmPersonNo");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNoLessThanOrEqualTo(String value) {
            addCriterion("confirm_person_no <=", value, "confirmPersonNo");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNoLike(String value) {
            addCriterion("confirm_person_no like", value, "confirmPersonNo");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNoNotLike(String value) {
            addCriterion("confirm_person_no not like", value, "confirmPersonNo");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNoIn(List<String> values) {
            addCriterion("confirm_person_no in", values, "confirmPersonNo");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNoNotIn(List<String> values) {
            addCriterion("confirm_person_no not in", values, "confirmPersonNo");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNoBetween(String value1, String value2) {
            addCriterion("confirm_person_no between", value1, value2, "confirmPersonNo");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNoNotBetween(String value1, String value2) {
            addCriterion("confirm_person_no not between", value1, value2, "confirmPersonNo");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNameIsNull() {
            addCriterion("confirm_person_name is null");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNameIsNotNull() {
            addCriterion("confirm_person_name is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNameEqualTo(String value) {
            addCriterion("confirm_person_name =", value, "confirmPersonName");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNameNotEqualTo(String value) {
            addCriterion("confirm_person_name <>", value, "confirmPersonName");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNameGreaterThan(String value) {
            addCriterion("confirm_person_name >", value, "confirmPersonName");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("confirm_person_name >=", value, "confirmPersonName");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNameLessThan(String value) {
            addCriterion("confirm_person_name <", value, "confirmPersonName");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNameLessThanOrEqualTo(String value) {
            addCriterion("confirm_person_name <=", value, "confirmPersonName");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNameLike(String value) {
            addCriterion("confirm_person_name like", value, "confirmPersonName");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNameNotLike(String value) {
            addCriterion("confirm_person_name not like", value, "confirmPersonName");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNameIn(List<String> values) {
            addCriterion("confirm_person_name in", values, "confirmPersonName");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNameNotIn(List<String> values) {
            addCriterion("confirm_person_name not in", values, "confirmPersonName");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNameBetween(String value1, String value2) {
            addCriterion("confirm_person_name between", value1, value2, "confirmPersonName");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNameNotBetween(String value1, String value2) {
            addCriterion("confirm_person_name not between", value1, value2, "confirmPersonName");
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