package com.uspring.sdsmesplus.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DevicePOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DevicePOExample() {
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

        public Criteria andDevIdIsNull() {
            addCriterion("dev_id is null");
            return (Criteria) this;
        }

        public Criteria andDevIdIsNotNull() {
            addCriterion("dev_id is not null");
            return (Criteria) this;
        }

        public Criteria andDevIdEqualTo(Integer value) {
            addCriterion("dev_id =", value, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdNotEqualTo(Integer value) {
            addCriterion("dev_id <>", value, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdGreaterThan(Integer value) {
            addCriterion("dev_id >", value, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dev_id >=", value, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdLessThan(Integer value) {
            addCriterion("dev_id <", value, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdLessThanOrEqualTo(Integer value) {
            addCriterion("dev_id <=", value, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdIn(List<Integer> values) {
            addCriterion("dev_id in", values, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdNotIn(List<Integer> values) {
            addCriterion("dev_id not in", values, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdBetween(Integer value1, Integer value2) {
            addCriterion("dev_id between", value1, value2, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dev_id not between", value1, value2, "devId");
            return (Criteria) this;
        }

        public Criteria andDevCodeIsNull() {
            addCriterion("dev_code is null");
            return (Criteria) this;
        }

        public Criteria andDevCodeIsNotNull() {
            addCriterion("dev_code is not null");
            return (Criteria) this;
        }

        public Criteria andDevCodeEqualTo(String value) {
            addCriterion("dev_code =", value, "devCode");
            return (Criteria) this;
        }

        public Criteria andDevCodeNotEqualTo(String value) {
            addCriterion("dev_code <>", value, "devCode");
            return (Criteria) this;
        }

        public Criteria andDevCodeGreaterThan(String value) {
            addCriterion("dev_code >", value, "devCode");
            return (Criteria) this;
        }

        public Criteria andDevCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dev_code >=", value, "devCode");
            return (Criteria) this;
        }

        public Criteria andDevCodeLessThan(String value) {
            addCriterion("dev_code <", value, "devCode");
            return (Criteria) this;
        }

        public Criteria andDevCodeLessThanOrEqualTo(String value) {
            addCriterion("dev_code <=", value, "devCode");
            return (Criteria) this;
        }

        public Criteria andDevCodeLike(String value) {
            addCriterion("dev_code like", value, "devCode");
            return (Criteria) this;
        }

        public Criteria andDevCodeNotLike(String value) {
            addCriterion("dev_code not like", value, "devCode");
            return (Criteria) this;
        }

        public Criteria andDevCodeIn(List<String> values) {
            addCriterion("dev_code in", values, "devCode");
            return (Criteria) this;
        }

        public Criteria andDevCodeNotIn(List<String> values) {
            addCriterion("dev_code not in", values, "devCode");
            return (Criteria) this;
        }

        public Criteria andDevCodeBetween(String value1, String value2) {
            addCriterion("dev_code between", value1, value2, "devCode");
            return (Criteria) this;
        }

        public Criteria andDevCodeNotBetween(String value1, String value2) {
            addCriterion("dev_code not between", value1, value2, "devCode");
            return (Criteria) this;
        }

        public Criteria andDevNameIsNull() {
            addCriterion("dev_name is null");
            return (Criteria) this;
        }

        public Criteria andDevNameIsNotNull() {
            addCriterion("dev_name is not null");
            return (Criteria) this;
        }

        public Criteria andDevNameEqualTo(String value) {
            addCriterion("dev_name =", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameNotEqualTo(String value) {
            addCriterion("dev_name <>", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameGreaterThan(String value) {
            addCriterion("dev_name >", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameGreaterThanOrEqualTo(String value) {
            addCriterion("dev_name >=", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameLessThan(String value) {
            addCriterion("dev_name <", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameLessThanOrEqualTo(String value) {
            addCriterion("dev_name <=", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameLike(String value) {
            addCriterion("dev_name like", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameNotLike(String value) {
            addCriterion("dev_name not like", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameIn(List<String> values) {
            addCriterion("dev_name in", values, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameNotIn(List<String> values) {
            addCriterion("dev_name not in", values, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameBetween(String value1, String value2) {
            addCriterion("dev_name between", value1, value2, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameNotBetween(String value1, String value2) {
            addCriterion("dev_name not between", value1, value2, "devName");
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

        public Criteria andDevSizeIsNull() {
            addCriterion("dev_size is null");
            return (Criteria) this;
        }

        public Criteria andDevSizeIsNotNull() {
            addCriterion("dev_size is not null");
            return (Criteria) this;
        }

        public Criteria andDevSizeEqualTo(String value) {
            addCriterion("dev_size =", value, "devSize");
            return (Criteria) this;
        }

        public Criteria andDevSizeNotEqualTo(String value) {
            addCriterion("dev_size <>", value, "devSize");
            return (Criteria) this;
        }

        public Criteria andDevSizeGreaterThan(String value) {
            addCriterion("dev_size >", value, "devSize");
            return (Criteria) this;
        }

        public Criteria andDevSizeGreaterThanOrEqualTo(String value) {
            addCriterion("dev_size >=", value, "devSize");
            return (Criteria) this;
        }

        public Criteria andDevSizeLessThan(String value) {
            addCriterion("dev_size <", value, "devSize");
            return (Criteria) this;
        }

        public Criteria andDevSizeLessThanOrEqualTo(String value) {
            addCriterion("dev_size <=", value, "devSize");
            return (Criteria) this;
        }

        public Criteria andDevSizeLike(String value) {
            addCriterion("dev_size like", value, "devSize");
            return (Criteria) this;
        }

        public Criteria andDevSizeNotLike(String value) {
            addCriterion("dev_size not like", value, "devSize");
            return (Criteria) this;
        }

        public Criteria andDevSizeIn(List<String> values) {
            addCriterion("dev_size in", values, "devSize");
            return (Criteria) this;
        }

        public Criteria andDevSizeNotIn(List<String> values) {
            addCriterion("dev_size not in", values, "devSize");
            return (Criteria) this;
        }

        public Criteria andDevSizeBetween(String value1, String value2) {
            addCriterion("dev_size between", value1, value2, "devSize");
            return (Criteria) this;
        }

        public Criteria andDevSizeNotBetween(String value1, String value2) {
            addCriterion("dev_size not between", value1, value2, "devSize");
            return (Criteria) this;
        }

        public Criteria andDevProcedureIsNull() {
            addCriterion("dev_procedure is null");
            return (Criteria) this;
        }

        public Criteria andDevProcedureIsNotNull() {
            addCriterion("dev_procedure is not null");
            return (Criteria) this;
        }

        public Criteria andDevProcedureEqualTo(String value) {
            addCriterion("dev_procedure =", value, "devProcedure");
            return (Criteria) this;
        }

        public Criteria andDevProcedureNotEqualTo(String value) {
            addCriterion("dev_procedure <>", value, "devProcedure");
            return (Criteria) this;
        }

        public Criteria andDevProcedureGreaterThan(String value) {
            addCriterion("dev_procedure >", value, "devProcedure");
            return (Criteria) this;
        }

        public Criteria andDevProcedureGreaterThanOrEqualTo(String value) {
            addCriterion("dev_procedure >=", value, "devProcedure");
            return (Criteria) this;
        }

        public Criteria andDevProcedureLessThan(String value) {
            addCriterion("dev_procedure <", value, "devProcedure");
            return (Criteria) this;
        }

        public Criteria andDevProcedureLessThanOrEqualTo(String value) {
            addCriterion("dev_procedure <=", value, "devProcedure");
            return (Criteria) this;
        }

        public Criteria andDevProcedureLike(String value) {
            addCriterion("dev_procedure like", value, "devProcedure");
            return (Criteria) this;
        }

        public Criteria andDevProcedureNotLike(String value) {
            addCriterion("dev_procedure not like", value, "devProcedure");
            return (Criteria) this;
        }

        public Criteria andDevProcedureIn(List<String> values) {
            addCriterion("dev_procedure in", values, "devProcedure");
            return (Criteria) this;
        }

        public Criteria andDevProcedureNotIn(List<String> values) {
            addCriterion("dev_procedure not in", values, "devProcedure");
            return (Criteria) this;
        }

        public Criteria andDevProcedureBetween(String value1, String value2) {
            addCriterion("dev_procedure between", value1, value2, "devProcedure");
            return (Criteria) this;
        }

        public Criteria andDevProcedureNotBetween(String value1, String value2) {
            addCriterion("dev_procedure not between", value1, value2, "devProcedure");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andDevLocImgIsNull() {
            addCriterion("dev_loc_img is null");
            return (Criteria) this;
        }

        public Criteria andDevLocImgIsNotNull() {
            addCriterion("dev_loc_img is not null");
            return (Criteria) this;
        }

        public Criteria andDevLocImgEqualTo(String value) {
            addCriterion("dev_loc_img =", value, "devLocImg");
            return (Criteria) this;
        }

        public Criteria andDevLocImgNotEqualTo(String value) {
            addCriterion("dev_loc_img <>", value, "devLocImg");
            return (Criteria) this;
        }

        public Criteria andDevLocImgGreaterThan(String value) {
            addCriterion("dev_loc_img >", value, "devLocImg");
            return (Criteria) this;
        }

        public Criteria andDevLocImgGreaterThanOrEqualTo(String value) {
            addCriterion("dev_loc_img >=", value, "devLocImg");
            return (Criteria) this;
        }

        public Criteria andDevLocImgLessThan(String value) {
            addCriterion("dev_loc_img <", value, "devLocImg");
            return (Criteria) this;
        }

        public Criteria andDevLocImgLessThanOrEqualTo(String value) {
            addCriterion("dev_loc_img <=", value, "devLocImg");
            return (Criteria) this;
        }

        public Criteria andDevLocImgLike(String value) {
            addCriterion("dev_loc_img like", value, "devLocImg");
            return (Criteria) this;
        }

        public Criteria andDevLocImgNotLike(String value) {
            addCriterion("dev_loc_img not like", value, "devLocImg");
            return (Criteria) this;
        }

        public Criteria andDevLocImgIn(List<String> values) {
            addCriterion("dev_loc_img in", values, "devLocImg");
            return (Criteria) this;
        }

        public Criteria andDevLocImgNotIn(List<String> values) {
            addCriterion("dev_loc_img not in", values, "devLocImg");
            return (Criteria) this;
        }

        public Criteria andDevLocImgBetween(String value1, String value2) {
            addCriterion("dev_loc_img between", value1, value2, "devLocImg");
            return (Criteria) this;
        }

        public Criteria andDevLocImgNotBetween(String value1, String value2) {
            addCriterion("dev_loc_img not between", value1, value2, "devLocImg");
            return (Criteria) this;
        }

        public Criteria andDevBarcodeImgIsNull() {
            addCriterion("dev_barcode_img is null");
            return (Criteria) this;
        }

        public Criteria andDevBarcodeImgIsNotNull() {
            addCriterion("dev_barcode_img is not null");
            return (Criteria) this;
        }

        public Criteria andDevBarcodeImgEqualTo(String value) {
            addCriterion("dev_barcode_img =", value, "devBarcodeImg");
            return (Criteria) this;
        }

        public Criteria andDevBarcodeImgNotEqualTo(String value) {
            addCriterion("dev_barcode_img <>", value, "devBarcodeImg");
            return (Criteria) this;
        }

        public Criteria andDevBarcodeImgGreaterThan(String value) {
            addCriterion("dev_barcode_img >", value, "devBarcodeImg");
            return (Criteria) this;
        }

        public Criteria andDevBarcodeImgGreaterThanOrEqualTo(String value) {
            addCriterion("dev_barcode_img >=", value, "devBarcodeImg");
            return (Criteria) this;
        }

        public Criteria andDevBarcodeImgLessThan(String value) {
            addCriterion("dev_barcode_img <", value, "devBarcodeImg");
            return (Criteria) this;
        }

        public Criteria andDevBarcodeImgLessThanOrEqualTo(String value) {
            addCriterion("dev_barcode_img <=", value, "devBarcodeImg");
            return (Criteria) this;
        }

        public Criteria andDevBarcodeImgLike(String value) {
            addCriterion("dev_barcode_img like", value, "devBarcodeImg");
            return (Criteria) this;
        }

        public Criteria andDevBarcodeImgNotLike(String value) {
            addCriterion("dev_barcode_img not like", value, "devBarcodeImg");
            return (Criteria) this;
        }

        public Criteria andDevBarcodeImgIn(List<String> values) {
            addCriterion("dev_barcode_img in", values, "devBarcodeImg");
            return (Criteria) this;
        }

        public Criteria andDevBarcodeImgNotIn(List<String> values) {
            addCriterion("dev_barcode_img not in", values, "devBarcodeImg");
            return (Criteria) this;
        }

        public Criteria andDevBarcodeImgBetween(String value1, String value2) {
            addCriterion("dev_barcode_img between", value1, value2, "devBarcodeImg");
            return (Criteria) this;
        }

        public Criteria andDevBarcodeImgNotBetween(String value1, String value2) {
            addCriterion("dev_barcode_img not between", value1, value2, "devBarcodeImg");
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