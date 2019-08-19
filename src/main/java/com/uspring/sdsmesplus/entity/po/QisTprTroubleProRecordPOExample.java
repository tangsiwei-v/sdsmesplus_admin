package com.uspring.sdsmesplus.entity.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QisTprTroubleProRecordPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QisTprTroubleProRecordPOExample() {
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

        public Criteria andTprIdIsNull() {
            addCriterion("tpr_ID is null");
            return (Criteria) this;
        }

        public Criteria andTprIdIsNotNull() {
            addCriterion("tpr_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTprIdEqualTo(Integer value) {
            addCriterion("tpr_ID =", value, "tprId");
            return (Criteria) this;
        }

        public Criteria andTprIdNotEqualTo(Integer value) {
            addCriterion("tpr_ID <>", value, "tprId");
            return (Criteria) this;
        }

        public Criteria andTprIdGreaterThan(Integer value) {
            addCriterion("tpr_ID >", value, "tprId");
            return (Criteria) this;
        }

        public Criteria andTprIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tpr_ID >=", value, "tprId");
            return (Criteria) this;
        }

        public Criteria andTprIdLessThan(Integer value) {
            addCriterion("tpr_ID <", value, "tprId");
            return (Criteria) this;
        }

        public Criteria andTprIdLessThanOrEqualTo(Integer value) {
            addCriterion("tpr_ID <=", value, "tprId");
            return (Criteria) this;
        }

        public Criteria andTprIdIn(List<Integer> values) {
            addCriterion("tpr_ID in", values, "tprId");
            return (Criteria) this;
        }

        public Criteria andTprIdNotIn(List<Integer> values) {
            addCriterion("tpr_ID not in", values, "tprId");
            return (Criteria) this;
        }

        public Criteria andTprIdBetween(Integer value1, Integer value2) {
            addCriterion("tpr_ID between", value1, value2, "tprId");
            return (Criteria) this;
        }

        public Criteria andTprIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tpr_ID not between", value1, value2, "tprId");
            return (Criteria) this;
        }

        public Criteria andTprTroprorecordnoIsNull() {
            addCriterion("tpr_TroProRecordNo is null");
            return (Criteria) this;
        }

        public Criteria andTprTroprorecordnoIsNotNull() {
            addCriterion("tpr_TroProRecordNo is not null");
            return (Criteria) this;
        }

        public Criteria andTprTroprorecordnoEqualTo(String value) {
            addCriterion("tpr_TroProRecordNo =", value, "tprTroprorecordno");
            return (Criteria) this;
        }

        public Criteria andTprTroprorecordnoNotEqualTo(String value) {
            addCriterion("tpr_TroProRecordNo <>", value, "tprTroprorecordno");
            return (Criteria) this;
        }

        public Criteria andTprTroprorecordnoGreaterThan(String value) {
            addCriterion("tpr_TroProRecordNo >", value, "tprTroprorecordno");
            return (Criteria) this;
        }

        public Criteria andTprTroprorecordnoGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_TroProRecordNo >=", value, "tprTroprorecordno");
            return (Criteria) this;
        }

        public Criteria andTprTroprorecordnoLessThan(String value) {
            addCriterion("tpr_TroProRecordNo <", value, "tprTroprorecordno");
            return (Criteria) this;
        }

        public Criteria andTprTroprorecordnoLessThanOrEqualTo(String value) {
            addCriterion("tpr_TroProRecordNo <=", value, "tprTroprorecordno");
            return (Criteria) this;
        }

        public Criteria andTprTroprorecordnoLike(String value) {
            addCriterion("tpr_TroProRecordNo like", value, "tprTroprorecordno");
            return (Criteria) this;
        }

        public Criteria andTprTroprorecordnoNotLike(String value) {
            addCriterion("tpr_TroProRecordNo not like", value, "tprTroprorecordno");
            return (Criteria) this;
        }

        public Criteria andTprTroprorecordnoIn(List<String> values) {
            addCriterion("tpr_TroProRecordNo in", values, "tprTroprorecordno");
            return (Criteria) this;
        }

        public Criteria andTprTroprorecordnoNotIn(List<String> values) {
            addCriterion("tpr_TroProRecordNo not in", values, "tprTroprorecordno");
            return (Criteria) this;
        }

        public Criteria andTprTroprorecordnoBetween(String value1, String value2) {
            addCriterion("tpr_TroProRecordNo between", value1, value2, "tprTroprorecordno");
            return (Criteria) this;
        }

        public Criteria andTprTroprorecordnoNotBetween(String value1, String value2) {
            addCriterion("tpr_TroProRecordNo not between", value1, value2, "tprTroprorecordno");
            return (Criteria) this;
        }

        public Criteria andTprDomainIsNull() {
            addCriterion("tpr_Domain is null");
            return (Criteria) this;
        }

        public Criteria andTprDomainIsNotNull() {
            addCriterion("tpr_Domain is not null");
            return (Criteria) this;
        }

        public Criteria andTprDomainEqualTo(String value) {
            addCriterion("tpr_Domain =", value, "tprDomain");
            return (Criteria) this;
        }

        public Criteria andTprDomainNotEqualTo(String value) {
            addCriterion("tpr_Domain <>", value, "tprDomain");
            return (Criteria) this;
        }

        public Criteria andTprDomainGreaterThan(String value) {
            addCriterion("tpr_Domain >", value, "tprDomain");
            return (Criteria) this;
        }

        public Criteria andTprDomainGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_Domain >=", value, "tprDomain");
            return (Criteria) this;
        }

        public Criteria andTprDomainLessThan(String value) {
            addCriterion("tpr_Domain <", value, "tprDomain");
            return (Criteria) this;
        }

        public Criteria andTprDomainLessThanOrEqualTo(String value) {
            addCriterion("tpr_Domain <=", value, "tprDomain");
            return (Criteria) this;
        }

        public Criteria andTprDomainLike(String value) {
            addCriterion("tpr_Domain like", value, "tprDomain");
            return (Criteria) this;
        }

        public Criteria andTprDomainNotLike(String value) {
            addCriterion("tpr_Domain not like", value, "tprDomain");
            return (Criteria) this;
        }

        public Criteria andTprDomainIn(List<String> values) {
            addCriterion("tpr_Domain in", values, "tprDomain");
            return (Criteria) this;
        }

        public Criteria andTprDomainNotIn(List<String> values) {
            addCriterion("tpr_Domain not in", values, "tprDomain");
            return (Criteria) this;
        }

        public Criteria andTprDomainBetween(String value1, String value2) {
            addCriterion("tpr_Domain between", value1, value2, "tprDomain");
            return (Criteria) this;
        }

        public Criteria andTprDomainNotBetween(String value1, String value2) {
            addCriterion("tpr_Domain not between", value1, value2, "tprDomain");
            return (Criteria) this;
        }

        public Criteria andTprSiteIsNull() {
            addCriterion("tpr_Site is null");
            return (Criteria) this;
        }

        public Criteria andTprSiteIsNotNull() {
            addCriterion("tpr_Site is not null");
            return (Criteria) this;
        }

        public Criteria andTprSiteEqualTo(String value) {
            addCriterion("tpr_Site =", value, "tprSite");
            return (Criteria) this;
        }

        public Criteria andTprSiteNotEqualTo(String value) {
            addCriterion("tpr_Site <>", value, "tprSite");
            return (Criteria) this;
        }

        public Criteria andTprSiteGreaterThan(String value) {
            addCriterion("tpr_Site >", value, "tprSite");
            return (Criteria) this;
        }

        public Criteria andTprSiteGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_Site >=", value, "tprSite");
            return (Criteria) this;
        }

        public Criteria andTprSiteLessThan(String value) {
            addCriterion("tpr_Site <", value, "tprSite");
            return (Criteria) this;
        }

        public Criteria andTprSiteLessThanOrEqualTo(String value) {
            addCriterion("tpr_Site <=", value, "tprSite");
            return (Criteria) this;
        }

        public Criteria andTprSiteLike(String value) {
            addCriterion("tpr_Site like", value, "tprSite");
            return (Criteria) this;
        }

        public Criteria andTprSiteNotLike(String value) {
            addCriterion("tpr_Site not like", value, "tprSite");
            return (Criteria) this;
        }

        public Criteria andTprSiteIn(List<String> values) {
            addCriterion("tpr_Site in", values, "tprSite");
            return (Criteria) this;
        }

        public Criteria andTprSiteNotIn(List<String> values) {
            addCriterion("tpr_Site not in", values, "tprSite");
            return (Criteria) this;
        }

        public Criteria andTprSiteBetween(String value1, String value2) {
            addCriterion("tpr_Site between", value1, value2, "tprSite");
            return (Criteria) this;
        }

        public Criteria andTprSiteNotBetween(String value1, String value2) {
            addCriterion("tpr_Site not between", value1, value2, "tprSite");
            return (Criteria) this;
        }

        public Criteria andTprWorkshopIsNull() {
            addCriterion("tpr_Workshop is null");
            return (Criteria) this;
        }

        public Criteria andTprWorkshopIsNotNull() {
            addCriterion("tpr_Workshop is not null");
            return (Criteria) this;
        }

        public Criteria andTprWorkshopEqualTo(String value) {
            addCriterion("tpr_Workshop =", value, "tprWorkshop");
            return (Criteria) this;
        }

        public Criteria andTprWorkshopNotEqualTo(String value) {
            addCriterion("tpr_Workshop <>", value, "tprWorkshop");
            return (Criteria) this;
        }

        public Criteria andTprWorkshopGreaterThan(String value) {
            addCriterion("tpr_Workshop >", value, "tprWorkshop");
            return (Criteria) this;
        }

        public Criteria andTprWorkshopGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_Workshop >=", value, "tprWorkshop");
            return (Criteria) this;
        }

        public Criteria andTprWorkshopLessThan(String value) {
            addCriterion("tpr_Workshop <", value, "tprWorkshop");
            return (Criteria) this;
        }

        public Criteria andTprWorkshopLessThanOrEqualTo(String value) {
            addCriterion("tpr_Workshop <=", value, "tprWorkshop");
            return (Criteria) this;
        }

        public Criteria andTprWorkshopLike(String value) {
            addCriterion("tpr_Workshop like", value, "tprWorkshop");
            return (Criteria) this;
        }

        public Criteria andTprWorkshopNotLike(String value) {
            addCriterion("tpr_Workshop not like", value, "tprWorkshop");
            return (Criteria) this;
        }

        public Criteria andTprWorkshopIn(List<String> values) {
            addCriterion("tpr_Workshop in", values, "tprWorkshop");
            return (Criteria) this;
        }

        public Criteria andTprWorkshopNotIn(List<String> values) {
            addCriterion("tpr_Workshop not in", values, "tprWorkshop");
            return (Criteria) this;
        }

        public Criteria andTprWorkshopBetween(String value1, String value2) {
            addCriterion("tpr_Workshop between", value1, value2, "tprWorkshop");
            return (Criteria) this;
        }

        public Criteria andTprWorkshopNotBetween(String value1, String value2) {
            addCriterion("tpr_Workshop not between", value1, value2, "tprWorkshop");
            return (Criteria) this;
        }

        public Criteria andTprProductlineIsNull() {
            addCriterion("tpr_ProductLine is null");
            return (Criteria) this;
        }

        public Criteria andTprProductlineIsNotNull() {
            addCriterion("tpr_ProductLine is not null");
            return (Criteria) this;
        }

        public Criteria andTprProductlineEqualTo(String value) {
            addCriterion("tpr_ProductLine =", value, "tprProductline");
            return (Criteria) this;
        }

        public Criteria andTprProductlineNotEqualTo(String value) {
            addCriterion("tpr_ProductLine <>", value, "tprProductline");
            return (Criteria) this;
        }

        public Criteria andTprProductlineGreaterThan(String value) {
            addCriterion("tpr_ProductLine >", value, "tprProductline");
            return (Criteria) this;
        }

        public Criteria andTprProductlineGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_ProductLine >=", value, "tprProductline");
            return (Criteria) this;
        }

        public Criteria andTprProductlineLessThan(String value) {
            addCriterion("tpr_ProductLine <", value, "tprProductline");
            return (Criteria) this;
        }

        public Criteria andTprProductlineLessThanOrEqualTo(String value) {
            addCriterion("tpr_ProductLine <=", value, "tprProductline");
            return (Criteria) this;
        }

        public Criteria andTprProductlineLike(String value) {
            addCriterion("tpr_ProductLine like", value, "tprProductline");
            return (Criteria) this;
        }

        public Criteria andTprProductlineNotLike(String value) {
            addCriterion("tpr_ProductLine not like", value, "tprProductline");
            return (Criteria) this;
        }

        public Criteria andTprProductlineIn(List<String> values) {
            addCriterion("tpr_ProductLine in", values, "tprProductline");
            return (Criteria) this;
        }

        public Criteria andTprProductlineNotIn(List<String> values) {
            addCriterion("tpr_ProductLine not in", values, "tprProductline");
            return (Criteria) this;
        }

        public Criteria andTprProductlineBetween(String value1, String value2) {
            addCriterion("tpr_ProductLine between", value1, value2, "tprProductline");
            return (Criteria) this;
        }

        public Criteria andTprProductlineNotBetween(String value1, String value2) {
            addCriterion("tpr_ProductLine not between", value1, value2, "tprProductline");
            return (Criteria) this;
        }

        public Criteria andTprProductdateIsNull() {
            addCriterion("tpr_ProductDate is null");
            return (Criteria) this;
        }

        public Criteria andTprProductdateIsNotNull() {
            addCriterion("tpr_ProductDate is not null");
            return (Criteria) this;
        }

        public Criteria andTprProductdateEqualTo(Date value) {
            addCriterion("tpr_ProductDate =", value, "tprProductdate");
            return (Criteria) this;
        }

        public Criteria andTprProductdateNotEqualTo(Date value) {
            addCriterion("tpr_ProductDate <>", value, "tprProductdate");
            return (Criteria) this;
        }

        public Criteria andTprProductdateGreaterThan(Date value) {
            addCriterion("tpr_ProductDate >", value, "tprProductdate");
            return (Criteria) this;
        }

        public Criteria andTprProductdateGreaterThanOrEqualTo(Date value) {
            addCriterion("tpr_ProductDate >=", value, "tprProductdate");
            return (Criteria) this;
        }

        public Criteria andTprProductdateLessThan(Date value) {
            addCriterion("tpr_ProductDate <", value, "tprProductdate");
            return (Criteria) this;
        }

        public Criteria andTprProductdateLessThanOrEqualTo(Date value) {
            addCriterion("tpr_ProductDate <=", value, "tprProductdate");
            return (Criteria) this;
        }

        public Criteria andTprProductdateIn(List<Date> values) {
            addCriterion("tpr_ProductDate in", values, "tprProductdate");
            return (Criteria) this;
        }

        public Criteria andTprProductdateNotIn(List<Date> values) {
            addCriterion("tpr_ProductDate not in", values, "tprProductdate");
            return (Criteria) this;
        }

        public Criteria andTprProductdateBetween(Date value1, Date value2) {
            addCriterion("tpr_ProductDate between", value1, value2, "tprProductdate");
            return (Criteria) this;
        }

        public Criteria andTprProductdateNotBetween(Date value1, Date value2) {
            addCriterion("tpr_ProductDate not between", value1, value2, "tprProductdate");
            return (Criteria) this;
        }

        public Criteria andTprShiftIsNull() {
            addCriterion("tpr_Shift is null");
            return (Criteria) this;
        }

        public Criteria andTprShiftIsNotNull() {
            addCriterion("tpr_Shift is not null");
            return (Criteria) this;
        }

        public Criteria andTprShiftEqualTo(String value) {
            addCriterion("tpr_Shift =", value, "tprShift");
            return (Criteria) this;
        }

        public Criteria andTprShiftNotEqualTo(String value) {
            addCriterion("tpr_Shift <>", value, "tprShift");
            return (Criteria) this;
        }

        public Criteria andTprShiftGreaterThan(String value) {
            addCriterion("tpr_Shift >", value, "tprShift");
            return (Criteria) this;
        }

        public Criteria andTprShiftGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_Shift >=", value, "tprShift");
            return (Criteria) this;
        }

        public Criteria andTprShiftLessThan(String value) {
            addCriterion("tpr_Shift <", value, "tprShift");
            return (Criteria) this;
        }

        public Criteria andTprShiftLessThanOrEqualTo(String value) {
            addCriterion("tpr_Shift <=", value, "tprShift");
            return (Criteria) this;
        }

        public Criteria andTprShiftLike(String value) {
            addCriterion("tpr_Shift like", value, "tprShift");
            return (Criteria) this;
        }

        public Criteria andTprShiftNotLike(String value) {
            addCriterion("tpr_Shift not like", value, "tprShift");
            return (Criteria) this;
        }

        public Criteria andTprShiftIn(List<String> values) {
            addCriterion("tpr_Shift in", values, "tprShift");
            return (Criteria) this;
        }

        public Criteria andTprShiftNotIn(List<String> values) {
            addCriterion("tpr_Shift not in", values, "tprShift");
            return (Criteria) this;
        }

        public Criteria andTprShiftBetween(String value1, String value2) {
            addCriterion("tpr_Shift between", value1, value2, "tprShift");
            return (Criteria) this;
        }

        public Criteria andTprShiftNotBetween(String value1, String value2) {
            addCriterion("tpr_Shift not between", value1, value2, "tprShift");
            return (Criteria) this;
        }

        public Criteria andTprEffectivedateIsNull() {
            addCriterion("tpr_EffectiveDate is null");
            return (Criteria) this;
        }

        public Criteria andTprEffectivedateIsNotNull() {
            addCriterion("tpr_EffectiveDate is not null");
            return (Criteria) this;
        }

        public Criteria andTprEffectivedateEqualTo(Date value) {
            addCriterion("tpr_EffectiveDate =", value, "tprEffectivedate");
            return (Criteria) this;
        }

        public Criteria andTprEffectivedateNotEqualTo(Date value) {
            addCriterion("tpr_EffectiveDate <>", value, "tprEffectivedate");
            return (Criteria) this;
        }

        public Criteria andTprEffectivedateGreaterThan(Date value) {
            addCriterion("tpr_EffectiveDate >", value, "tprEffectivedate");
            return (Criteria) this;
        }

        public Criteria andTprEffectivedateGreaterThanOrEqualTo(Date value) {
            addCriterion("tpr_EffectiveDate >=", value, "tprEffectivedate");
            return (Criteria) this;
        }

        public Criteria andTprEffectivedateLessThan(Date value) {
            addCriterion("tpr_EffectiveDate <", value, "tprEffectivedate");
            return (Criteria) this;
        }

        public Criteria andTprEffectivedateLessThanOrEqualTo(Date value) {
            addCriterion("tpr_EffectiveDate <=", value, "tprEffectivedate");
            return (Criteria) this;
        }

        public Criteria andTprEffectivedateIn(List<Date> values) {
            addCriterion("tpr_EffectiveDate in", values, "tprEffectivedate");
            return (Criteria) this;
        }

        public Criteria andTprEffectivedateNotIn(List<Date> values) {
            addCriterion("tpr_EffectiveDate not in", values, "tprEffectivedate");
            return (Criteria) this;
        }

        public Criteria andTprEffectivedateBetween(Date value1, Date value2) {
            addCriterion("tpr_EffectiveDate between", value1, value2, "tprEffectivedate");
            return (Criteria) this;
        }

        public Criteria andTprEffectivedateNotBetween(Date value1, Date value2) {
            addCriterion("tpr_EffectiveDate not between", value1, value2, "tprEffectivedate");
            return (Criteria) this;
        }

        public Criteria andTprPartIsNull() {
            addCriterion("tpr_Part is null");
            return (Criteria) this;
        }

        public Criteria andTprPartIsNotNull() {
            addCriterion("tpr_Part is not null");
            return (Criteria) this;
        }

        public Criteria andTprPartEqualTo(String value) {
            addCriterion("tpr_Part =", value, "tprPart");
            return (Criteria) this;
        }

        public Criteria andTprPartNotEqualTo(String value) {
            addCriterion("tpr_Part <>", value, "tprPart");
            return (Criteria) this;
        }

        public Criteria andTprPartGreaterThan(String value) {
            addCriterion("tpr_Part >", value, "tprPart");
            return (Criteria) this;
        }

        public Criteria andTprPartGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_Part >=", value, "tprPart");
            return (Criteria) this;
        }

        public Criteria andTprPartLessThan(String value) {
            addCriterion("tpr_Part <", value, "tprPart");
            return (Criteria) this;
        }

        public Criteria andTprPartLessThanOrEqualTo(String value) {
            addCriterion("tpr_Part <=", value, "tprPart");
            return (Criteria) this;
        }

        public Criteria andTprPartLike(String value) {
            addCriterion("tpr_Part like", value, "tprPart");
            return (Criteria) this;
        }

        public Criteria andTprPartNotLike(String value) {
            addCriterion("tpr_Part not like", value, "tprPart");
            return (Criteria) this;
        }

        public Criteria andTprPartIn(List<String> values) {
            addCriterion("tpr_Part in", values, "tprPart");
            return (Criteria) this;
        }

        public Criteria andTprPartNotIn(List<String> values) {
            addCriterion("tpr_Part not in", values, "tprPart");
            return (Criteria) this;
        }

        public Criteria andTprPartBetween(String value1, String value2) {
            addCriterion("tpr_Part between", value1, value2, "tprPart");
            return (Criteria) this;
        }

        public Criteria andTprPartNotBetween(String value1, String value2) {
            addCriterion("tpr_Part not between", value1, value2, "tprPart");
            return (Criteria) this;
        }

        public Criteria andTprPartcatalogIsNull() {
            addCriterion("tpr_PartCatalog is null");
            return (Criteria) this;
        }

        public Criteria andTprPartcatalogIsNotNull() {
            addCriterion("tpr_PartCatalog is not null");
            return (Criteria) this;
        }

        public Criteria andTprPartcatalogEqualTo(String value) {
            addCriterion("tpr_PartCatalog =", value, "tprPartcatalog");
            return (Criteria) this;
        }

        public Criteria andTprPartcatalogNotEqualTo(String value) {
            addCriterion("tpr_PartCatalog <>", value, "tprPartcatalog");
            return (Criteria) this;
        }

        public Criteria andTprPartcatalogGreaterThan(String value) {
            addCriterion("tpr_PartCatalog >", value, "tprPartcatalog");
            return (Criteria) this;
        }

        public Criteria andTprPartcatalogGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_PartCatalog >=", value, "tprPartcatalog");
            return (Criteria) this;
        }

        public Criteria andTprPartcatalogLessThan(String value) {
            addCriterion("tpr_PartCatalog <", value, "tprPartcatalog");
            return (Criteria) this;
        }

        public Criteria andTprPartcatalogLessThanOrEqualTo(String value) {
            addCriterion("tpr_PartCatalog <=", value, "tprPartcatalog");
            return (Criteria) this;
        }

        public Criteria andTprPartcatalogLike(String value) {
            addCriterion("tpr_PartCatalog like", value, "tprPartcatalog");
            return (Criteria) this;
        }

        public Criteria andTprPartcatalogNotLike(String value) {
            addCriterion("tpr_PartCatalog not like", value, "tprPartcatalog");
            return (Criteria) this;
        }

        public Criteria andTprPartcatalogIn(List<String> values) {
            addCriterion("tpr_PartCatalog in", values, "tprPartcatalog");
            return (Criteria) this;
        }

        public Criteria andTprPartcatalogNotIn(List<String> values) {
            addCriterion("tpr_PartCatalog not in", values, "tprPartcatalog");
            return (Criteria) this;
        }

        public Criteria andTprPartcatalogBetween(String value1, String value2) {
            addCriterion("tpr_PartCatalog between", value1, value2, "tprPartcatalog");
            return (Criteria) this;
        }

        public Criteria andTprPartcatalogNotBetween(String value1, String value2) {
            addCriterion("tpr_PartCatalog not between", value1, value2, "tprPartcatalog");
            return (Criteria) this;
        }

        public Criteria andTprQrcodeIsNull() {
            addCriterion("tpr_QRCode is null");
            return (Criteria) this;
        }

        public Criteria andTprQrcodeIsNotNull() {
            addCriterion("tpr_QRCode is not null");
            return (Criteria) this;
        }

        public Criteria andTprQrcodeEqualTo(String value) {
            addCriterion("tpr_QRCode =", value, "tprQrcode");
            return (Criteria) this;
        }

        public Criteria andTprQrcodeNotEqualTo(String value) {
            addCriterion("tpr_QRCode <>", value, "tprQrcode");
            return (Criteria) this;
        }

        public Criteria andTprQrcodeGreaterThan(String value) {
            addCriterion("tpr_QRCode >", value, "tprQrcode");
            return (Criteria) this;
        }

        public Criteria andTprQrcodeGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_QRCode >=", value, "tprQrcode");
            return (Criteria) this;
        }

        public Criteria andTprQrcodeLessThan(String value) {
            addCriterion("tpr_QRCode <", value, "tprQrcode");
            return (Criteria) this;
        }

        public Criteria andTprQrcodeLessThanOrEqualTo(String value) {
            addCriterion("tpr_QRCode <=", value, "tprQrcode");
            return (Criteria) this;
        }

        public Criteria andTprQrcodeLike(String value) {
            addCriterion("tpr_QRCode like", value, "tprQrcode");
            return (Criteria) this;
        }

        public Criteria andTprQrcodeNotLike(String value) {
            addCriterion("tpr_QRCode not like", value, "tprQrcode");
            return (Criteria) this;
        }

        public Criteria andTprQrcodeIn(List<String> values) {
            addCriterion("tpr_QRCode in", values, "tprQrcode");
            return (Criteria) this;
        }

        public Criteria andTprQrcodeNotIn(List<String> values) {
            addCriterion("tpr_QRCode not in", values, "tprQrcode");
            return (Criteria) this;
        }

        public Criteria andTprQrcodeBetween(String value1, String value2) {
            addCriterion("tpr_QRCode between", value1, value2, "tprQrcode");
            return (Criteria) this;
        }

        public Criteria andTprQrcodeNotBetween(String value1, String value2) {
            addCriterion("tpr_QRCode not between", value1, value2, "tprQrcode");
            return (Criteria) this;
        }

        public Criteria andTprRoutingIsNull() {
            addCriterion("tpr_Routing is null");
            return (Criteria) this;
        }

        public Criteria andTprRoutingIsNotNull() {
            addCriterion("tpr_Routing is not null");
            return (Criteria) this;
        }

        public Criteria andTprRoutingEqualTo(String value) {
            addCriterion("tpr_Routing =", value, "tprRouting");
            return (Criteria) this;
        }

        public Criteria andTprRoutingNotEqualTo(String value) {
            addCriterion("tpr_Routing <>", value, "tprRouting");
            return (Criteria) this;
        }

        public Criteria andTprRoutingGreaterThan(String value) {
            addCriterion("tpr_Routing >", value, "tprRouting");
            return (Criteria) this;
        }

        public Criteria andTprRoutingGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_Routing >=", value, "tprRouting");
            return (Criteria) this;
        }

        public Criteria andTprRoutingLessThan(String value) {
            addCriterion("tpr_Routing <", value, "tprRouting");
            return (Criteria) this;
        }

        public Criteria andTprRoutingLessThanOrEqualTo(String value) {
            addCriterion("tpr_Routing <=", value, "tprRouting");
            return (Criteria) this;
        }

        public Criteria andTprRoutingLike(String value) {
            addCriterion("tpr_Routing like", value, "tprRouting");
            return (Criteria) this;
        }

        public Criteria andTprRoutingNotLike(String value) {
            addCriterion("tpr_Routing not like", value, "tprRouting");
            return (Criteria) this;
        }

        public Criteria andTprRoutingIn(List<String> values) {
            addCriterion("tpr_Routing in", values, "tprRouting");
            return (Criteria) this;
        }

        public Criteria andTprRoutingNotIn(List<String> values) {
            addCriterion("tpr_Routing not in", values, "tprRouting");
            return (Criteria) this;
        }

        public Criteria andTprRoutingBetween(String value1, String value2) {
            addCriterion("tpr_Routing between", value1, value2, "tprRouting");
            return (Criteria) this;
        }

        public Criteria andTprRoutingNotBetween(String value1, String value2) {
            addCriterion("tpr_Routing not between", value1, value2, "tprRouting");
            return (Criteria) this;
        }

        public Criteria andTprMaterialcodeIsNull() {
            addCriterion("tpr_MaterialCode is null");
            return (Criteria) this;
        }

        public Criteria andTprMaterialcodeIsNotNull() {
            addCriterion("tpr_MaterialCode is not null");
            return (Criteria) this;
        }

        public Criteria andTprMaterialcodeEqualTo(String value) {
            addCriterion("tpr_MaterialCode =", value, "tprMaterialcode");
            return (Criteria) this;
        }

        public Criteria andTprMaterialcodeNotEqualTo(String value) {
            addCriterion("tpr_MaterialCode <>", value, "tprMaterialcode");
            return (Criteria) this;
        }

        public Criteria andTprMaterialcodeGreaterThan(String value) {
            addCriterion("tpr_MaterialCode >", value, "tprMaterialcode");
            return (Criteria) this;
        }

        public Criteria andTprMaterialcodeGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_MaterialCode >=", value, "tprMaterialcode");
            return (Criteria) this;
        }

        public Criteria andTprMaterialcodeLessThan(String value) {
            addCriterion("tpr_MaterialCode <", value, "tprMaterialcode");
            return (Criteria) this;
        }

        public Criteria andTprMaterialcodeLessThanOrEqualTo(String value) {
            addCriterion("tpr_MaterialCode <=", value, "tprMaterialcode");
            return (Criteria) this;
        }

        public Criteria andTprMaterialcodeLike(String value) {
            addCriterion("tpr_MaterialCode like", value, "tprMaterialcode");
            return (Criteria) this;
        }

        public Criteria andTprMaterialcodeNotLike(String value) {
            addCriterion("tpr_MaterialCode not like", value, "tprMaterialcode");
            return (Criteria) this;
        }

        public Criteria andTprMaterialcodeIn(List<String> values) {
            addCriterion("tpr_MaterialCode in", values, "tprMaterialcode");
            return (Criteria) this;
        }

        public Criteria andTprMaterialcodeNotIn(List<String> values) {
            addCriterion("tpr_MaterialCode not in", values, "tprMaterialcode");
            return (Criteria) this;
        }

        public Criteria andTprMaterialcodeBetween(String value1, String value2) {
            addCriterion("tpr_MaterialCode between", value1, value2, "tprMaterialcode");
            return (Criteria) this;
        }

        public Criteria andTprMaterialcodeNotBetween(String value1, String value2) {
            addCriterion("tpr_MaterialCode not between", value1, value2, "tprMaterialcode");
            return (Criteria) this;
        }

        public Criteria andTprBoxbarcodenoIsNull() {
            addCriterion("tpr_BoxBarCodeNo is null");
            return (Criteria) this;
        }

        public Criteria andTprBoxbarcodenoIsNotNull() {
            addCriterion("tpr_BoxBarCodeNo is not null");
            return (Criteria) this;
        }

        public Criteria andTprBoxbarcodenoEqualTo(String value) {
            addCriterion("tpr_BoxBarCodeNo =", value, "tprBoxbarcodeno");
            return (Criteria) this;
        }

        public Criteria andTprBoxbarcodenoNotEqualTo(String value) {
            addCriterion("tpr_BoxBarCodeNo <>", value, "tprBoxbarcodeno");
            return (Criteria) this;
        }

        public Criteria andTprBoxbarcodenoGreaterThan(String value) {
            addCriterion("tpr_BoxBarCodeNo >", value, "tprBoxbarcodeno");
            return (Criteria) this;
        }

        public Criteria andTprBoxbarcodenoGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_BoxBarCodeNo >=", value, "tprBoxbarcodeno");
            return (Criteria) this;
        }

        public Criteria andTprBoxbarcodenoLessThan(String value) {
            addCriterion("tpr_BoxBarCodeNo <", value, "tprBoxbarcodeno");
            return (Criteria) this;
        }

        public Criteria andTprBoxbarcodenoLessThanOrEqualTo(String value) {
            addCriterion("tpr_BoxBarCodeNo <=", value, "tprBoxbarcodeno");
            return (Criteria) this;
        }

        public Criteria andTprBoxbarcodenoLike(String value) {
            addCriterion("tpr_BoxBarCodeNo like", value, "tprBoxbarcodeno");
            return (Criteria) this;
        }

        public Criteria andTprBoxbarcodenoNotLike(String value) {
            addCriterion("tpr_BoxBarCodeNo not like", value, "tprBoxbarcodeno");
            return (Criteria) this;
        }

        public Criteria andTprBoxbarcodenoIn(List<String> values) {
            addCriterion("tpr_BoxBarCodeNo in", values, "tprBoxbarcodeno");
            return (Criteria) this;
        }

        public Criteria andTprBoxbarcodenoNotIn(List<String> values) {
            addCriterion("tpr_BoxBarCodeNo not in", values, "tprBoxbarcodeno");
            return (Criteria) this;
        }

        public Criteria andTprBoxbarcodenoBetween(String value1, String value2) {
            addCriterion("tpr_BoxBarCodeNo between", value1, value2, "tprBoxbarcodeno");
            return (Criteria) this;
        }

        public Criteria andTprBoxbarcodenoNotBetween(String value1, String value2) {
            addCriterion("tpr_BoxBarCodeNo not between", value1, value2, "tprBoxbarcodeno");
            return (Criteria) this;
        }

        public Criteria andTprMaterialqrcodeIsNull() {
            addCriterion("tpr_MaterialQRCode is null");
            return (Criteria) this;
        }

        public Criteria andTprMaterialqrcodeIsNotNull() {
            addCriterion("tpr_MaterialQRCode is not null");
            return (Criteria) this;
        }

        public Criteria andTprMaterialqrcodeEqualTo(String value) {
            addCriterion("tpr_MaterialQRCode =", value, "tprMaterialqrcode");
            return (Criteria) this;
        }

        public Criteria andTprMaterialqrcodeNotEqualTo(String value) {
            addCriterion("tpr_MaterialQRCode <>", value, "tprMaterialqrcode");
            return (Criteria) this;
        }

        public Criteria andTprMaterialqrcodeGreaterThan(String value) {
            addCriterion("tpr_MaterialQRCode >", value, "tprMaterialqrcode");
            return (Criteria) this;
        }

        public Criteria andTprMaterialqrcodeGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_MaterialQRCode >=", value, "tprMaterialqrcode");
            return (Criteria) this;
        }

        public Criteria andTprMaterialqrcodeLessThan(String value) {
            addCriterion("tpr_MaterialQRCode <", value, "tprMaterialqrcode");
            return (Criteria) this;
        }

        public Criteria andTprMaterialqrcodeLessThanOrEqualTo(String value) {
            addCriterion("tpr_MaterialQRCode <=", value, "tprMaterialqrcode");
            return (Criteria) this;
        }

        public Criteria andTprMaterialqrcodeLike(String value) {
            addCriterion("tpr_MaterialQRCode like", value, "tprMaterialqrcode");
            return (Criteria) this;
        }

        public Criteria andTprMaterialqrcodeNotLike(String value) {
            addCriterion("tpr_MaterialQRCode not like", value, "tprMaterialqrcode");
            return (Criteria) this;
        }

        public Criteria andTprMaterialqrcodeIn(List<String> values) {
            addCriterion("tpr_MaterialQRCode in", values, "tprMaterialqrcode");
            return (Criteria) this;
        }

        public Criteria andTprMaterialqrcodeNotIn(List<String> values) {
            addCriterion("tpr_MaterialQRCode not in", values, "tprMaterialqrcode");
            return (Criteria) this;
        }

        public Criteria andTprMaterialqrcodeBetween(String value1, String value2) {
            addCriterion("tpr_MaterialQRCode between", value1, value2, "tprMaterialqrcode");
            return (Criteria) this;
        }

        public Criteria andTprMaterialqrcodeNotBetween(String value1, String value2) {
            addCriterion("tpr_MaterialQRCode not between", value1, value2, "tprMaterialqrcode");
            return (Criteria) this;
        }

        public Criteria andTprLotIsNull() {
            addCriterion("tpr_Lot is null");
            return (Criteria) this;
        }

        public Criteria andTprLotIsNotNull() {
            addCriterion("tpr_Lot is not null");
            return (Criteria) this;
        }

        public Criteria andTprLotEqualTo(String value) {
            addCriterion("tpr_Lot =", value, "tprLot");
            return (Criteria) this;
        }

        public Criteria andTprLotNotEqualTo(String value) {
            addCriterion("tpr_Lot <>", value, "tprLot");
            return (Criteria) this;
        }

        public Criteria andTprLotGreaterThan(String value) {
            addCriterion("tpr_Lot >", value, "tprLot");
            return (Criteria) this;
        }

        public Criteria andTprLotGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_Lot >=", value, "tprLot");
            return (Criteria) this;
        }

        public Criteria andTprLotLessThan(String value) {
            addCriterion("tpr_Lot <", value, "tprLot");
            return (Criteria) this;
        }

        public Criteria andTprLotLessThanOrEqualTo(String value) {
            addCriterion("tpr_Lot <=", value, "tprLot");
            return (Criteria) this;
        }

        public Criteria andTprLotLike(String value) {
            addCriterion("tpr_Lot like", value, "tprLot");
            return (Criteria) this;
        }

        public Criteria andTprLotNotLike(String value) {
            addCriterion("tpr_Lot not like", value, "tprLot");
            return (Criteria) this;
        }

        public Criteria andTprLotIn(List<String> values) {
            addCriterion("tpr_Lot in", values, "tprLot");
            return (Criteria) this;
        }

        public Criteria andTprLotNotIn(List<String> values) {
            addCriterion("tpr_Lot not in", values, "tprLot");
            return (Criteria) this;
        }

        public Criteria andTprLotBetween(String value1, String value2) {
            addCriterion("tpr_Lot between", value1, value2, "tprLot");
            return (Criteria) this;
        }

        public Criteria andTprLotNotBetween(String value1, String value2) {
            addCriterion("tpr_Lot not between", value1, value2, "tprLot");
            return (Criteria) this;
        }

        public Criteria andTprRefIsNull() {
            addCriterion("tpr_Ref is null");
            return (Criteria) this;
        }

        public Criteria andTprRefIsNotNull() {
            addCriterion("tpr_Ref is not null");
            return (Criteria) this;
        }

        public Criteria andTprRefEqualTo(String value) {
            addCriterion("tpr_Ref =", value, "tprRef");
            return (Criteria) this;
        }

        public Criteria andTprRefNotEqualTo(String value) {
            addCriterion("tpr_Ref <>", value, "tprRef");
            return (Criteria) this;
        }

        public Criteria andTprRefGreaterThan(String value) {
            addCriterion("tpr_Ref >", value, "tprRef");
            return (Criteria) this;
        }

        public Criteria andTprRefGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_Ref >=", value, "tprRef");
            return (Criteria) this;
        }

        public Criteria andTprRefLessThan(String value) {
            addCriterion("tpr_Ref <", value, "tprRef");
            return (Criteria) this;
        }

        public Criteria andTprRefLessThanOrEqualTo(String value) {
            addCriterion("tpr_Ref <=", value, "tprRef");
            return (Criteria) this;
        }

        public Criteria andTprRefLike(String value) {
            addCriterion("tpr_Ref like", value, "tprRef");
            return (Criteria) this;
        }

        public Criteria andTprRefNotLike(String value) {
            addCriterion("tpr_Ref not like", value, "tprRef");
            return (Criteria) this;
        }

        public Criteria andTprRefIn(List<String> values) {
            addCriterion("tpr_Ref in", values, "tprRef");
            return (Criteria) this;
        }

        public Criteria andTprRefNotIn(List<String> values) {
            addCriterion("tpr_Ref not in", values, "tprRef");
            return (Criteria) this;
        }

        public Criteria andTprRefBetween(String value1, String value2) {
            addCriterion("tpr_Ref between", value1, value2, "tprRef");
            return (Criteria) this;
        }

        public Criteria andTprRefNotBetween(String value1, String value2) {
            addCriterion("tpr_Ref not between", value1, value2, "tprRef");
            return (Criteria) this;
        }

        public Criteria andTprFurnacenoIsNull() {
            addCriterion("tpr_FurnaceNo is null");
            return (Criteria) this;
        }

        public Criteria andTprFurnacenoIsNotNull() {
            addCriterion("tpr_FurnaceNo is not null");
            return (Criteria) this;
        }

        public Criteria andTprFurnacenoEqualTo(String value) {
            addCriterion("tpr_FurnaceNo =", value, "tprFurnaceno");
            return (Criteria) this;
        }

        public Criteria andTprFurnacenoNotEqualTo(String value) {
            addCriterion("tpr_FurnaceNo <>", value, "tprFurnaceno");
            return (Criteria) this;
        }

        public Criteria andTprFurnacenoGreaterThan(String value) {
            addCriterion("tpr_FurnaceNo >", value, "tprFurnaceno");
            return (Criteria) this;
        }

        public Criteria andTprFurnacenoGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_FurnaceNo >=", value, "tprFurnaceno");
            return (Criteria) this;
        }

        public Criteria andTprFurnacenoLessThan(String value) {
            addCriterion("tpr_FurnaceNo <", value, "tprFurnaceno");
            return (Criteria) this;
        }

        public Criteria andTprFurnacenoLessThanOrEqualTo(String value) {
            addCriterion("tpr_FurnaceNo <=", value, "tprFurnaceno");
            return (Criteria) this;
        }

        public Criteria andTprFurnacenoLike(String value) {
            addCriterion("tpr_FurnaceNo like", value, "tprFurnaceno");
            return (Criteria) this;
        }

        public Criteria andTprFurnacenoNotLike(String value) {
            addCriterion("tpr_FurnaceNo not like", value, "tprFurnaceno");
            return (Criteria) this;
        }

        public Criteria andTprFurnacenoIn(List<String> values) {
            addCriterion("tpr_FurnaceNo in", values, "tprFurnaceno");
            return (Criteria) this;
        }

        public Criteria andTprFurnacenoNotIn(List<String> values) {
            addCriterion("tpr_FurnaceNo not in", values, "tprFurnaceno");
            return (Criteria) this;
        }

        public Criteria andTprFurnacenoBetween(String value1, String value2) {
            addCriterion("tpr_FurnaceNo between", value1, value2, "tprFurnaceno");
            return (Criteria) this;
        }

        public Criteria andTprFurnacenoNotBetween(String value1, String value2) {
            addCriterion("tpr_FurnaceNo not between", value1, value2, "tprFurnaceno");
            return (Criteria) this;
        }

        public Criteria andTprMetalmarkIsNull() {
            addCriterion("tpr_MetalMark is null");
            return (Criteria) this;
        }

        public Criteria andTprMetalmarkIsNotNull() {
            addCriterion("tpr_MetalMark is not null");
            return (Criteria) this;
        }

        public Criteria andTprMetalmarkEqualTo(String value) {
            addCriterion("tpr_MetalMark =", value, "tprMetalmark");
            return (Criteria) this;
        }

        public Criteria andTprMetalmarkNotEqualTo(String value) {
            addCriterion("tpr_MetalMark <>", value, "tprMetalmark");
            return (Criteria) this;
        }

        public Criteria andTprMetalmarkGreaterThan(String value) {
            addCriterion("tpr_MetalMark >", value, "tprMetalmark");
            return (Criteria) this;
        }

        public Criteria andTprMetalmarkGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_MetalMark >=", value, "tprMetalmark");
            return (Criteria) this;
        }

        public Criteria andTprMetalmarkLessThan(String value) {
            addCriterion("tpr_MetalMark <", value, "tprMetalmark");
            return (Criteria) this;
        }

        public Criteria andTprMetalmarkLessThanOrEqualTo(String value) {
            addCriterion("tpr_MetalMark <=", value, "tprMetalmark");
            return (Criteria) this;
        }

        public Criteria andTprMetalmarkLike(String value) {
            addCriterion("tpr_MetalMark like", value, "tprMetalmark");
            return (Criteria) this;
        }

        public Criteria andTprMetalmarkNotLike(String value) {
            addCriterion("tpr_MetalMark not like", value, "tprMetalmark");
            return (Criteria) this;
        }

        public Criteria andTprMetalmarkIn(List<String> values) {
            addCriterion("tpr_MetalMark in", values, "tprMetalmark");
            return (Criteria) this;
        }

        public Criteria andTprMetalmarkNotIn(List<String> values) {
            addCriterion("tpr_MetalMark not in", values, "tprMetalmark");
            return (Criteria) this;
        }

        public Criteria andTprMetalmarkBetween(String value1, String value2) {
            addCriterion("tpr_MetalMark between", value1, value2, "tprMetalmark");
            return (Criteria) this;
        }

        public Criteria andTprMetalmarkNotBetween(String value1, String value2) {
            addCriterion("tpr_MetalMark not between", value1, value2, "tprMetalmark");
            return (Criteria) this;
        }

        public Criteria andTprFindopIsNull() {
            addCriterion("tpr_FindOp is null");
            return (Criteria) this;
        }

        public Criteria andTprFindopIsNotNull() {
            addCriterion("tpr_FindOp is not null");
            return (Criteria) this;
        }

        public Criteria andTprFindopEqualTo(String value) {
            addCriterion("tpr_FindOp =", value, "tprFindop");
            return (Criteria) this;
        }

        public Criteria andTprFindopNotEqualTo(String value) {
            addCriterion("tpr_FindOp <>", value, "tprFindop");
            return (Criteria) this;
        }

        public Criteria andTprFindopGreaterThan(String value) {
            addCriterion("tpr_FindOp >", value, "tprFindop");
            return (Criteria) this;
        }

        public Criteria andTprFindopGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_FindOp >=", value, "tprFindop");
            return (Criteria) this;
        }

        public Criteria andTprFindopLessThan(String value) {
            addCriterion("tpr_FindOp <", value, "tprFindop");
            return (Criteria) this;
        }

        public Criteria andTprFindopLessThanOrEqualTo(String value) {
            addCriterion("tpr_FindOp <=", value, "tprFindop");
            return (Criteria) this;
        }

        public Criteria andTprFindopLike(String value) {
            addCriterion("tpr_FindOp like", value, "tprFindop");
            return (Criteria) this;
        }

        public Criteria andTprFindopNotLike(String value) {
            addCriterion("tpr_FindOp not like", value, "tprFindop");
            return (Criteria) this;
        }

        public Criteria andTprFindopIn(List<String> values) {
            addCriterion("tpr_FindOp in", values, "tprFindop");
            return (Criteria) this;
        }

        public Criteria andTprFindopNotIn(List<String> values) {
            addCriterion("tpr_FindOp not in", values, "tprFindop");
            return (Criteria) this;
        }

        public Criteria andTprFindopBetween(String value1, String value2) {
            addCriterion("tpr_FindOp between", value1, value2, "tprFindop");
            return (Criteria) this;
        }

        public Criteria andTprFindopNotBetween(String value1, String value2) {
            addCriterion("tpr_FindOp not between", value1, value2, "tprFindop");
            return (Criteria) this;
        }

        public Criteria andTprFindopnameIsNull() {
            addCriterion("tpr_FindOpName is null");
            return (Criteria) this;
        }

        public Criteria andTprFindopnameIsNotNull() {
            addCriterion("tpr_FindOpName is not null");
            return (Criteria) this;
        }

        public Criteria andTprFindopnameEqualTo(String value) {
            addCriterion("tpr_FindOpName =", value, "tprFindopname");
            return (Criteria) this;
        }

        public Criteria andTprFindopnameNotEqualTo(String value) {
            addCriterion("tpr_FindOpName <>", value, "tprFindopname");
            return (Criteria) this;
        }

        public Criteria andTprFindopnameGreaterThan(String value) {
            addCriterion("tpr_FindOpName >", value, "tprFindopname");
            return (Criteria) this;
        }

        public Criteria andTprFindopnameGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_FindOpName >=", value, "tprFindopname");
            return (Criteria) this;
        }

        public Criteria andTprFindopnameLessThan(String value) {
            addCriterion("tpr_FindOpName <", value, "tprFindopname");
            return (Criteria) this;
        }

        public Criteria andTprFindopnameLessThanOrEqualTo(String value) {
            addCriterion("tpr_FindOpName <=", value, "tprFindopname");
            return (Criteria) this;
        }

        public Criteria andTprFindopnameLike(String value) {
            addCriterion("tpr_FindOpName like", value, "tprFindopname");
            return (Criteria) this;
        }

        public Criteria andTprFindopnameNotLike(String value) {
            addCriterion("tpr_FindOpName not like", value, "tprFindopname");
            return (Criteria) this;
        }

        public Criteria andTprFindopnameIn(List<String> values) {
            addCriterion("tpr_FindOpName in", values, "tprFindopname");
            return (Criteria) this;
        }

        public Criteria andTprFindopnameNotIn(List<String> values) {
            addCriterion("tpr_FindOpName not in", values, "tprFindopname");
            return (Criteria) this;
        }

        public Criteria andTprFindopnameBetween(String value1, String value2) {
            addCriterion("tpr_FindOpName between", value1, value2, "tprFindopname");
            return (Criteria) this;
        }

        public Criteria andTprFindopnameNotBetween(String value1, String value2) {
            addCriterion("tpr_FindOpName not between", value1, value2, "tprFindopname");
            return (Criteria) this;
        }

        public Criteria andTprProduceopIsNull() {
            addCriterion("tpr_ProduceOp is null");
            return (Criteria) this;
        }

        public Criteria andTprProduceopIsNotNull() {
            addCriterion("tpr_ProduceOp is not null");
            return (Criteria) this;
        }

        public Criteria andTprProduceopEqualTo(String value) {
            addCriterion("tpr_ProduceOp =", value, "tprProduceop");
            return (Criteria) this;
        }

        public Criteria andTprProduceopNotEqualTo(String value) {
            addCriterion("tpr_ProduceOp <>", value, "tprProduceop");
            return (Criteria) this;
        }

        public Criteria andTprProduceopGreaterThan(String value) {
            addCriterion("tpr_ProduceOp >", value, "tprProduceop");
            return (Criteria) this;
        }

        public Criteria andTprProduceopGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_ProduceOp >=", value, "tprProduceop");
            return (Criteria) this;
        }

        public Criteria andTprProduceopLessThan(String value) {
            addCriterion("tpr_ProduceOp <", value, "tprProduceop");
            return (Criteria) this;
        }

        public Criteria andTprProduceopLessThanOrEqualTo(String value) {
            addCriterion("tpr_ProduceOp <=", value, "tprProduceop");
            return (Criteria) this;
        }

        public Criteria andTprProduceopLike(String value) {
            addCriterion("tpr_ProduceOp like", value, "tprProduceop");
            return (Criteria) this;
        }

        public Criteria andTprProduceopNotLike(String value) {
            addCriterion("tpr_ProduceOp not like", value, "tprProduceop");
            return (Criteria) this;
        }

        public Criteria andTprProduceopIn(List<String> values) {
            addCriterion("tpr_ProduceOp in", values, "tprProduceop");
            return (Criteria) this;
        }

        public Criteria andTprProduceopNotIn(List<String> values) {
            addCriterion("tpr_ProduceOp not in", values, "tprProduceop");
            return (Criteria) this;
        }

        public Criteria andTprProduceopBetween(String value1, String value2) {
            addCriterion("tpr_ProduceOp between", value1, value2, "tprProduceop");
            return (Criteria) this;
        }

        public Criteria andTprProduceopNotBetween(String value1, String value2) {
            addCriterion("tpr_ProduceOp not between", value1, value2, "tprProduceop");
            return (Criteria) this;
        }

        public Criteria andTprProduceopnameIsNull() {
            addCriterion("tpr_ProduceOpName is null");
            return (Criteria) this;
        }

        public Criteria andTprProduceopnameIsNotNull() {
            addCriterion("tpr_ProduceOpName is not null");
            return (Criteria) this;
        }

        public Criteria andTprProduceopnameEqualTo(String value) {
            addCriterion("tpr_ProduceOpName =", value, "tprProduceopname");
            return (Criteria) this;
        }

        public Criteria andTprProduceopnameNotEqualTo(String value) {
            addCriterion("tpr_ProduceOpName <>", value, "tprProduceopname");
            return (Criteria) this;
        }

        public Criteria andTprProduceopnameGreaterThan(String value) {
            addCriterion("tpr_ProduceOpName >", value, "tprProduceopname");
            return (Criteria) this;
        }

        public Criteria andTprProduceopnameGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_ProduceOpName >=", value, "tprProduceopname");
            return (Criteria) this;
        }

        public Criteria andTprProduceopnameLessThan(String value) {
            addCriterion("tpr_ProduceOpName <", value, "tprProduceopname");
            return (Criteria) this;
        }

        public Criteria andTprProduceopnameLessThanOrEqualTo(String value) {
            addCriterion("tpr_ProduceOpName <=", value, "tprProduceopname");
            return (Criteria) this;
        }

        public Criteria andTprProduceopnameLike(String value) {
            addCriterion("tpr_ProduceOpName like", value, "tprProduceopname");
            return (Criteria) this;
        }

        public Criteria andTprProduceopnameNotLike(String value) {
            addCriterion("tpr_ProduceOpName not like", value, "tprProduceopname");
            return (Criteria) this;
        }

        public Criteria andTprProduceopnameIn(List<String> values) {
            addCriterion("tpr_ProduceOpName in", values, "tprProduceopname");
            return (Criteria) this;
        }

        public Criteria andTprProduceopnameNotIn(List<String> values) {
            addCriterion("tpr_ProduceOpName not in", values, "tprProduceopname");
            return (Criteria) this;
        }

        public Criteria andTprProduceopnameBetween(String value1, String value2) {
            addCriterion("tpr_ProduceOpName between", value1, value2, "tprProduceopname");
            return (Criteria) this;
        }

        public Criteria andTprProduceopnameNotBetween(String value1, String value2) {
            addCriterion("tpr_ProduceOpName not between", value1, value2, "tprProduceopname");
            return (Criteria) this;
        }

        public Criteria andTprLocIsNull() {
            addCriterion("tpr_Loc is null");
            return (Criteria) this;
        }

        public Criteria andTprLocIsNotNull() {
            addCriterion("tpr_Loc is not null");
            return (Criteria) this;
        }

        public Criteria andTprLocEqualTo(String value) {
            addCriterion("tpr_Loc =", value, "tprLoc");
            return (Criteria) this;
        }

        public Criteria andTprLocNotEqualTo(String value) {
            addCriterion("tpr_Loc <>", value, "tprLoc");
            return (Criteria) this;
        }

        public Criteria andTprLocGreaterThan(String value) {
            addCriterion("tpr_Loc >", value, "tprLoc");
            return (Criteria) this;
        }

        public Criteria andTprLocGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_Loc >=", value, "tprLoc");
            return (Criteria) this;
        }

        public Criteria andTprLocLessThan(String value) {
            addCriterion("tpr_Loc <", value, "tprLoc");
            return (Criteria) this;
        }

        public Criteria andTprLocLessThanOrEqualTo(String value) {
            addCriterion("tpr_Loc <=", value, "tprLoc");
            return (Criteria) this;
        }

        public Criteria andTprLocLike(String value) {
            addCriterion("tpr_Loc like", value, "tprLoc");
            return (Criteria) this;
        }

        public Criteria andTprLocNotLike(String value) {
            addCriterion("tpr_Loc not like", value, "tprLoc");
            return (Criteria) this;
        }

        public Criteria andTprLocIn(List<String> values) {
            addCriterion("tpr_Loc in", values, "tprLoc");
            return (Criteria) this;
        }

        public Criteria andTprLocNotIn(List<String> values) {
            addCriterion("tpr_Loc not in", values, "tprLoc");
            return (Criteria) this;
        }

        public Criteria andTprLocBetween(String value1, String value2) {
            addCriterion("tpr_Loc between", value1, value2, "tprLoc");
            return (Criteria) this;
        }

        public Criteria andTprLocNotBetween(String value1, String value2) {
            addCriterion("tpr_Loc not between", value1, value2, "tprLoc");
            return (Criteria) this;
        }

        public Criteria andTprLocDescIsNull() {
            addCriterion("tpr_Loc_Desc is null");
            return (Criteria) this;
        }

        public Criteria andTprLocDescIsNotNull() {
            addCriterion("tpr_Loc_Desc is not null");
            return (Criteria) this;
        }

        public Criteria andTprLocDescEqualTo(String value) {
            addCriterion("tpr_Loc_Desc =", value, "tprLocDesc");
            return (Criteria) this;
        }

        public Criteria andTprLocDescNotEqualTo(String value) {
            addCriterion("tpr_Loc_Desc <>", value, "tprLocDesc");
            return (Criteria) this;
        }

        public Criteria andTprLocDescGreaterThan(String value) {
            addCriterion("tpr_Loc_Desc >", value, "tprLocDesc");
            return (Criteria) this;
        }

        public Criteria andTprLocDescGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_Loc_Desc >=", value, "tprLocDesc");
            return (Criteria) this;
        }

        public Criteria andTprLocDescLessThan(String value) {
            addCriterion("tpr_Loc_Desc <", value, "tprLocDesc");
            return (Criteria) this;
        }

        public Criteria andTprLocDescLessThanOrEqualTo(String value) {
            addCriterion("tpr_Loc_Desc <=", value, "tprLocDesc");
            return (Criteria) this;
        }

        public Criteria andTprLocDescLike(String value) {
            addCriterion("tpr_Loc_Desc like", value, "tprLocDesc");
            return (Criteria) this;
        }

        public Criteria andTprLocDescNotLike(String value) {
            addCriterion("tpr_Loc_Desc not like", value, "tprLocDesc");
            return (Criteria) this;
        }

        public Criteria andTprLocDescIn(List<String> values) {
            addCriterion("tpr_Loc_Desc in", values, "tprLocDesc");
            return (Criteria) this;
        }

        public Criteria andTprLocDescNotIn(List<String> values) {
            addCriterion("tpr_Loc_Desc not in", values, "tprLocDesc");
            return (Criteria) this;
        }

        public Criteria andTprLocDescBetween(String value1, String value2) {
            addCriterion("tpr_Loc_Desc between", value1, value2, "tprLocDesc");
            return (Criteria) this;
        }

        public Criteria andTprLocDescNotBetween(String value1, String value2) {
            addCriterion("tpr_Loc_Desc not between", value1, value2, "tprLocDesc");
            return (Criteria) this;
        }

        public Criteria andTprMchIsNull() {
            addCriterion("tpr_Mch is null");
            return (Criteria) this;
        }

        public Criteria andTprMchIsNotNull() {
            addCriterion("tpr_Mch is not null");
            return (Criteria) this;
        }

        public Criteria andTprMchEqualTo(String value) {
            addCriterion("tpr_Mch =", value, "tprMch");
            return (Criteria) this;
        }

        public Criteria andTprMchNotEqualTo(String value) {
            addCriterion("tpr_Mch <>", value, "tprMch");
            return (Criteria) this;
        }

        public Criteria andTprMchGreaterThan(String value) {
            addCriterion("tpr_Mch >", value, "tprMch");
            return (Criteria) this;
        }

        public Criteria andTprMchGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_Mch >=", value, "tprMch");
            return (Criteria) this;
        }

        public Criteria andTprMchLessThan(String value) {
            addCriterion("tpr_Mch <", value, "tprMch");
            return (Criteria) this;
        }

        public Criteria andTprMchLessThanOrEqualTo(String value) {
            addCriterion("tpr_Mch <=", value, "tprMch");
            return (Criteria) this;
        }

        public Criteria andTprMchLike(String value) {
            addCriterion("tpr_Mch like", value, "tprMch");
            return (Criteria) this;
        }

        public Criteria andTprMchNotLike(String value) {
            addCriterion("tpr_Mch not like", value, "tprMch");
            return (Criteria) this;
        }

        public Criteria andTprMchIn(List<String> values) {
            addCriterion("tpr_Mch in", values, "tprMch");
            return (Criteria) this;
        }

        public Criteria andTprMchNotIn(List<String> values) {
            addCriterion("tpr_Mch not in", values, "tprMch");
            return (Criteria) this;
        }

        public Criteria andTprMchBetween(String value1, String value2) {
            addCriterion("tpr_Mch between", value1, value2, "tprMch");
            return (Criteria) this;
        }

        public Criteria andTprMchNotBetween(String value1, String value2) {
            addCriterion("tpr_Mch not between", value1, value2, "tprMch");
            return (Criteria) this;
        }

        public Criteria andTprTroublecodesIsNull() {
            addCriterion("tpr_TroubleCodes is null");
            return (Criteria) this;
        }

        public Criteria andTprTroublecodesIsNotNull() {
            addCriterion("tpr_TroubleCodes is not null");
            return (Criteria) this;
        }

        public Criteria andTprTroublecodesEqualTo(String value) {
            addCriterion("tpr_TroubleCodes =", value, "tprTroublecodes");
            return (Criteria) this;
        }

        public Criteria andTprTroublecodesNotEqualTo(String value) {
            addCriterion("tpr_TroubleCodes <>", value, "tprTroublecodes");
            return (Criteria) this;
        }

        public Criteria andTprTroublecodesGreaterThan(String value) {
            addCriterion("tpr_TroubleCodes >", value, "tprTroublecodes");
            return (Criteria) this;
        }

        public Criteria andTprTroublecodesGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_TroubleCodes >=", value, "tprTroublecodes");
            return (Criteria) this;
        }

        public Criteria andTprTroublecodesLessThan(String value) {
            addCriterion("tpr_TroubleCodes <", value, "tprTroublecodes");
            return (Criteria) this;
        }

        public Criteria andTprTroublecodesLessThanOrEqualTo(String value) {
            addCriterion("tpr_TroubleCodes <=", value, "tprTroublecodes");
            return (Criteria) this;
        }

        public Criteria andTprTroublecodesLike(String value) {
            addCriterion("tpr_TroubleCodes like", value, "tprTroublecodes");
            return (Criteria) this;
        }

        public Criteria andTprTroublecodesNotLike(String value) {
            addCriterion("tpr_TroubleCodes not like", value, "tprTroublecodes");
            return (Criteria) this;
        }

        public Criteria andTprTroublecodesIn(List<String> values) {
            addCriterion("tpr_TroubleCodes in", values, "tprTroublecodes");
            return (Criteria) this;
        }

        public Criteria andTprTroublecodesNotIn(List<String> values) {
            addCriterion("tpr_TroubleCodes not in", values, "tprTroublecodes");
            return (Criteria) this;
        }

        public Criteria andTprTroublecodesBetween(String value1, String value2) {
            addCriterion("tpr_TroubleCodes between", value1, value2, "tprTroublecodes");
            return (Criteria) this;
        }

        public Criteria andTprTroublecodesNotBetween(String value1, String value2) {
            addCriterion("tpr_TroubleCodes not between", value1, value2, "tprTroublecodes");
            return (Criteria) this;
        }

        public Criteria andTprCostcenterIsNull() {
            addCriterion("tpr_CostCenter is null");
            return (Criteria) this;
        }

        public Criteria andTprCostcenterIsNotNull() {
            addCriterion("tpr_CostCenter is not null");
            return (Criteria) this;
        }

        public Criteria andTprCostcenterEqualTo(String value) {
            addCriterion("tpr_CostCenter =", value, "tprCostcenter");
            return (Criteria) this;
        }

        public Criteria andTprCostcenterNotEqualTo(String value) {
            addCriterion("tpr_CostCenter <>", value, "tprCostcenter");
            return (Criteria) this;
        }

        public Criteria andTprCostcenterGreaterThan(String value) {
            addCriterion("tpr_CostCenter >", value, "tprCostcenter");
            return (Criteria) this;
        }

        public Criteria andTprCostcenterGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_CostCenter >=", value, "tprCostcenter");
            return (Criteria) this;
        }

        public Criteria andTprCostcenterLessThan(String value) {
            addCriterion("tpr_CostCenter <", value, "tprCostcenter");
            return (Criteria) this;
        }

        public Criteria andTprCostcenterLessThanOrEqualTo(String value) {
            addCriterion("tpr_CostCenter <=", value, "tprCostcenter");
            return (Criteria) this;
        }

        public Criteria andTprCostcenterLike(String value) {
            addCriterion("tpr_CostCenter like", value, "tprCostcenter");
            return (Criteria) this;
        }

        public Criteria andTprCostcenterNotLike(String value) {
            addCriterion("tpr_CostCenter not like", value, "tprCostcenter");
            return (Criteria) this;
        }

        public Criteria andTprCostcenterIn(List<String> values) {
            addCriterion("tpr_CostCenter in", values, "tprCostcenter");
            return (Criteria) this;
        }

        public Criteria andTprCostcenterNotIn(List<String> values) {
            addCriterion("tpr_CostCenter not in", values, "tprCostcenter");
            return (Criteria) this;
        }

        public Criteria andTprCostcenterBetween(String value1, String value2) {
            addCriterion("tpr_CostCenter between", value1, value2, "tprCostcenter");
            return (Criteria) this;
        }

        public Criteria andTprCostcenterNotBetween(String value1, String value2) {
            addCriterion("tpr_CostCenter not between", value1, value2, "tprCostcenter");
            return (Criteria) this;
        }

        public Criteria andTprCostcenternameIsNull() {
            addCriterion("tpr_CostCenterName is null");
            return (Criteria) this;
        }

        public Criteria andTprCostcenternameIsNotNull() {
            addCriterion("tpr_CostCenterName is not null");
            return (Criteria) this;
        }

        public Criteria andTprCostcenternameEqualTo(String value) {
            addCriterion("tpr_CostCenterName =", value, "tprCostcentername");
            return (Criteria) this;
        }

        public Criteria andTprCostcenternameNotEqualTo(String value) {
            addCriterion("tpr_CostCenterName <>", value, "tprCostcentername");
            return (Criteria) this;
        }

        public Criteria andTprCostcenternameGreaterThan(String value) {
            addCriterion("tpr_CostCenterName >", value, "tprCostcentername");
            return (Criteria) this;
        }

        public Criteria andTprCostcenternameGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_CostCenterName >=", value, "tprCostcentername");
            return (Criteria) this;
        }

        public Criteria andTprCostcenternameLessThan(String value) {
            addCriterion("tpr_CostCenterName <", value, "tprCostcentername");
            return (Criteria) this;
        }

        public Criteria andTprCostcenternameLessThanOrEqualTo(String value) {
            addCriterion("tpr_CostCenterName <=", value, "tprCostcentername");
            return (Criteria) this;
        }

        public Criteria andTprCostcenternameLike(String value) {
            addCriterion("tpr_CostCenterName like", value, "tprCostcentername");
            return (Criteria) this;
        }

        public Criteria andTprCostcenternameNotLike(String value) {
            addCriterion("tpr_CostCenterName not like", value, "tprCostcentername");
            return (Criteria) this;
        }

        public Criteria andTprCostcenternameIn(List<String> values) {
            addCriterion("tpr_CostCenterName in", values, "tprCostcentername");
            return (Criteria) this;
        }

        public Criteria andTprCostcenternameNotIn(List<String> values) {
            addCriterion("tpr_CostCenterName not in", values, "tprCostcentername");
            return (Criteria) this;
        }

        public Criteria andTprCostcenternameBetween(String value1, String value2) {
            addCriterion("tpr_CostCenterName between", value1, value2, "tprCostcentername");
            return (Criteria) this;
        }

        public Criteria andTprCostcenternameNotBetween(String value1, String value2) {
            addCriterion("tpr_CostCenterName not between", value1, value2, "tprCostcentername");
            return (Criteria) this;
        }

        public Criteria andTprTroubleqtyIsNull() {
            addCriterion("tpr_TroubleQty is null");
            return (Criteria) this;
        }

        public Criteria andTprTroubleqtyIsNotNull() {
            addCriterion("tpr_TroubleQty is not null");
            return (Criteria) this;
        }

        public Criteria andTprTroubleqtyEqualTo(Integer value) {
            addCriterion("tpr_TroubleQty =", value, "tprTroubleqty");
            return (Criteria) this;
        }

        public Criteria andTprTroubleqtyNotEqualTo(Integer value) {
            addCriterion("tpr_TroubleQty <>", value, "tprTroubleqty");
            return (Criteria) this;
        }

        public Criteria andTprTroubleqtyGreaterThan(Integer value) {
            addCriterion("tpr_TroubleQty >", value, "tprTroubleqty");
            return (Criteria) this;
        }

        public Criteria andTprTroubleqtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("tpr_TroubleQty >=", value, "tprTroubleqty");
            return (Criteria) this;
        }

        public Criteria andTprTroubleqtyLessThan(Integer value) {
            addCriterion("tpr_TroubleQty <", value, "tprTroubleqty");
            return (Criteria) this;
        }

        public Criteria andTprTroubleqtyLessThanOrEqualTo(Integer value) {
            addCriterion("tpr_TroubleQty <=", value, "tprTroubleqty");
            return (Criteria) this;
        }

        public Criteria andTprTroubleqtyIn(List<Integer> values) {
            addCriterion("tpr_TroubleQty in", values, "tprTroubleqty");
            return (Criteria) this;
        }

        public Criteria andTprTroubleqtyNotIn(List<Integer> values) {
            addCriterion("tpr_TroubleQty not in", values, "tprTroubleqty");
            return (Criteria) this;
        }

        public Criteria andTprTroubleqtyBetween(Integer value1, Integer value2) {
            addCriterion("tpr_TroubleQty between", value1, value2, "tprTroubleqty");
            return (Criteria) this;
        }

        public Criteria andTprTroubleqtyNotBetween(Integer value1, Integer value2) {
            addCriterion("tpr_TroubleQty not between", value1, value2, "tprTroubleqty");
            return (Criteria) this;
        }

        public Criteria andTprBatchproductstatusIsNull() {
            addCriterion("tpr_BatchProductStatus is null");
            return (Criteria) this;
        }

        public Criteria andTprBatchproductstatusIsNotNull() {
            addCriterion("tpr_BatchProductStatus is not null");
            return (Criteria) this;
        }

        public Criteria andTprBatchproductstatusEqualTo(String value) {
            addCriterion("tpr_BatchProductStatus =", value, "tprBatchproductstatus");
            return (Criteria) this;
        }

        public Criteria andTprBatchproductstatusNotEqualTo(String value) {
            addCriterion("tpr_BatchProductStatus <>", value, "tprBatchproductstatus");
            return (Criteria) this;
        }

        public Criteria andTprBatchproductstatusGreaterThan(String value) {
            addCriterion("tpr_BatchProductStatus >", value, "tprBatchproductstatus");
            return (Criteria) this;
        }

        public Criteria andTprBatchproductstatusGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_BatchProductStatus >=", value, "tprBatchproductstatus");
            return (Criteria) this;
        }

        public Criteria andTprBatchproductstatusLessThan(String value) {
            addCriterion("tpr_BatchProductStatus <", value, "tprBatchproductstatus");
            return (Criteria) this;
        }

        public Criteria andTprBatchproductstatusLessThanOrEqualTo(String value) {
            addCriterion("tpr_BatchProductStatus <=", value, "tprBatchproductstatus");
            return (Criteria) this;
        }

        public Criteria andTprBatchproductstatusLike(String value) {
            addCriterion("tpr_BatchProductStatus like", value, "tprBatchproductstatus");
            return (Criteria) this;
        }

        public Criteria andTprBatchproductstatusNotLike(String value) {
            addCriterion("tpr_BatchProductStatus not like", value, "tprBatchproductstatus");
            return (Criteria) this;
        }

        public Criteria andTprBatchproductstatusIn(List<String> values) {
            addCriterion("tpr_BatchProductStatus in", values, "tprBatchproductstatus");
            return (Criteria) this;
        }

        public Criteria andTprBatchproductstatusNotIn(List<String> values) {
            addCriterion("tpr_BatchProductStatus not in", values, "tprBatchproductstatus");
            return (Criteria) this;
        }

        public Criteria andTprBatchproductstatusBetween(String value1, String value2) {
            addCriterion("tpr_BatchProductStatus between", value1, value2, "tprBatchproductstatus");
            return (Criteria) this;
        }

        public Criteria andTprBatchproductstatusNotBetween(String value1, String value2) {
            addCriterion("tpr_BatchProductStatus not between", value1, value2, "tprBatchproductstatus");
            return (Criteria) this;
        }

        public Criteria andTprIstestpartIsNull() {
            addCriterion("tpr_IsTestPart is null");
            return (Criteria) this;
        }

        public Criteria andTprIstestpartIsNotNull() {
            addCriterion("tpr_IsTestPart is not null");
            return (Criteria) this;
        }

        public Criteria andTprIstestpartEqualTo(Integer value) {
            addCriterion("tpr_IsTestPart =", value, "tprIstestpart");
            return (Criteria) this;
        }

        public Criteria andTprIstestpartNotEqualTo(Integer value) {
            addCriterion("tpr_IsTestPart <>", value, "tprIstestpart");
            return (Criteria) this;
        }

        public Criteria andTprIstestpartGreaterThan(Integer value) {
            addCriterion("tpr_IsTestPart >", value, "tprIstestpart");
            return (Criteria) this;
        }

        public Criteria andTprIstestpartGreaterThanOrEqualTo(Integer value) {
            addCriterion("tpr_IsTestPart >=", value, "tprIstestpart");
            return (Criteria) this;
        }

        public Criteria andTprIstestpartLessThan(Integer value) {
            addCriterion("tpr_IsTestPart <", value, "tprIstestpart");
            return (Criteria) this;
        }

        public Criteria andTprIstestpartLessThanOrEqualTo(Integer value) {
            addCriterion("tpr_IsTestPart <=", value, "tprIstestpart");
            return (Criteria) this;
        }

        public Criteria andTprIstestpartIn(List<Integer> values) {
            addCriterion("tpr_IsTestPart in", values, "tprIstestpart");
            return (Criteria) this;
        }

        public Criteria andTprIstestpartNotIn(List<Integer> values) {
            addCriterion("tpr_IsTestPart not in", values, "tprIstestpart");
            return (Criteria) this;
        }

        public Criteria andTprIstestpartBetween(Integer value1, Integer value2) {
            addCriterion("tpr_IsTestPart between", value1, value2, "tprIstestpart");
            return (Criteria) this;
        }

        public Criteria andTprIstestpartNotBetween(Integer value1, Integer value2) {
            addCriterion("tpr_IsTestPart not between", value1, value2, "tprIstestpart");
            return (Criteria) this;
        }

        public Criteria andTprEquipnoIsNull() {
            addCriterion("tpr_EquipNo is null");
            return (Criteria) this;
        }

        public Criteria andTprEquipnoIsNotNull() {
            addCriterion("tpr_EquipNo is not null");
            return (Criteria) this;
        }

        public Criteria andTprEquipnoEqualTo(String value) {
            addCriterion("tpr_EquipNo =", value, "tprEquipno");
            return (Criteria) this;
        }

        public Criteria andTprEquipnoNotEqualTo(String value) {
            addCriterion("tpr_EquipNo <>", value, "tprEquipno");
            return (Criteria) this;
        }

        public Criteria andTprEquipnoGreaterThan(String value) {
            addCriterion("tpr_EquipNo >", value, "tprEquipno");
            return (Criteria) this;
        }

        public Criteria andTprEquipnoGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_EquipNo >=", value, "tprEquipno");
            return (Criteria) this;
        }

        public Criteria andTprEquipnoLessThan(String value) {
            addCriterion("tpr_EquipNo <", value, "tprEquipno");
            return (Criteria) this;
        }

        public Criteria andTprEquipnoLessThanOrEqualTo(String value) {
            addCriterion("tpr_EquipNo <=", value, "tprEquipno");
            return (Criteria) this;
        }

        public Criteria andTprEquipnoLike(String value) {
            addCriterion("tpr_EquipNo like", value, "tprEquipno");
            return (Criteria) this;
        }

        public Criteria andTprEquipnoNotLike(String value) {
            addCriterion("tpr_EquipNo not like", value, "tprEquipno");
            return (Criteria) this;
        }

        public Criteria andTprEquipnoIn(List<String> values) {
            addCriterion("tpr_EquipNo in", values, "tprEquipno");
            return (Criteria) this;
        }

        public Criteria andTprEquipnoNotIn(List<String> values) {
            addCriterion("tpr_EquipNo not in", values, "tprEquipno");
            return (Criteria) this;
        }

        public Criteria andTprEquipnoBetween(String value1, String value2) {
            addCriterion("tpr_EquipNo between", value1, value2, "tprEquipno");
            return (Criteria) this;
        }

        public Criteria andTprEquipnoNotBetween(String value1, String value2) {
            addCriterion("tpr_EquipNo not between", value1, value2, "tprEquipno");
            return (Criteria) this;
        }

        public Criteria andTprCreatepersonIsNull() {
            addCriterion("tpr_CreatePerson is null");
            return (Criteria) this;
        }

        public Criteria andTprCreatepersonIsNotNull() {
            addCriterion("tpr_CreatePerson is not null");
            return (Criteria) this;
        }

        public Criteria andTprCreatepersonEqualTo(String value) {
            addCriterion("tpr_CreatePerson =", value, "tprCreateperson");
            return (Criteria) this;
        }

        public Criteria andTprCreatepersonNotEqualTo(String value) {
            addCriterion("tpr_CreatePerson <>", value, "tprCreateperson");
            return (Criteria) this;
        }

        public Criteria andTprCreatepersonGreaterThan(String value) {
            addCriterion("tpr_CreatePerson >", value, "tprCreateperson");
            return (Criteria) this;
        }

        public Criteria andTprCreatepersonGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_CreatePerson >=", value, "tprCreateperson");
            return (Criteria) this;
        }

        public Criteria andTprCreatepersonLessThan(String value) {
            addCriterion("tpr_CreatePerson <", value, "tprCreateperson");
            return (Criteria) this;
        }

        public Criteria andTprCreatepersonLessThanOrEqualTo(String value) {
            addCriterion("tpr_CreatePerson <=", value, "tprCreateperson");
            return (Criteria) this;
        }

        public Criteria andTprCreatepersonLike(String value) {
            addCriterion("tpr_CreatePerson like", value, "tprCreateperson");
            return (Criteria) this;
        }

        public Criteria andTprCreatepersonNotLike(String value) {
            addCriterion("tpr_CreatePerson not like", value, "tprCreateperson");
            return (Criteria) this;
        }

        public Criteria andTprCreatepersonIn(List<String> values) {
            addCriterion("tpr_CreatePerson in", values, "tprCreateperson");
            return (Criteria) this;
        }

        public Criteria andTprCreatepersonNotIn(List<String> values) {
            addCriterion("tpr_CreatePerson not in", values, "tprCreateperson");
            return (Criteria) this;
        }

        public Criteria andTprCreatepersonBetween(String value1, String value2) {
            addCriterion("tpr_CreatePerson between", value1, value2, "tprCreateperson");
            return (Criteria) this;
        }

        public Criteria andTprCreatepersonNotBetween(String value1, String value2) {
            addCriterion("tpr_CreatePerson not between", value1, value2, "tprCreateperson");
            return (Criteria) this;
        }

        public Criteria andTprCreatetimeIsNull() {
            addCriterion("tpr_CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andTprCreatetimeIsNotNull() {
            addCriterion("tpr_CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andTprCreatetimeEqualTo(Date value) {
            addCriterion("tpr_CreateTime =", value, "tprCreatetime");
            return (Criteria) this;
        }

        public Criteria andTprCreatetimeNotEqualTo(Date value) {
            addCriterion("tpr_CreateTime <>", value, "tprCreatetime");
            return (Criteria) this;
        }

        public Criteria andTprCreatetimeGreaterThan(Date value) {
            addCriterion("tpr_CreateTime >", value, "tprCreatetime");
            return (Criteria) this;
        }

        public Criteria andTprCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tpr_CreateTime >=", value, "tprCreatetime");
            return (Criteria) this;
        }

        public Criteria andTprCreatetimeLessThan(Date value) {
            addCriterion("tpr_CreateTime <", value, "tprCreatetime");
            return (Criteria) this;
        }

        public Criteria andTprCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("tpr_CreateTime <=", value, "tprCreatetime");
            return (Criteria) this;
        }

        public Criteria andTprCreatetimeIn(List<Date> values) {
            addCriterion("tpr_CreateTime in", values, "tprCreatetime");
            return (Criteria) this;
        }

        public Criteria andTprCreatetimeNotIn(List<Date> values) {
            addCriterion("tpr_CreateTime not in", values, "tprCreatetime");
            return (Criteria) this;
        }

        public Criteria andTprCreatetimeBetween(Date value1, Date value2) {
            addCriterion("tpr_CreateTime between", value1, value2, "tprCreatetime");
            return (Criteria) this;
        }

        public Criteria andTprCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("tpr_CreateTime not between", value1, value2, "tprCreatetime");
            return (Criteria) this;
        }

        public Criteria andTprMemoIsNull() {
            addCriterion("tpr_Memo is null");
            return (Criteria) this;
        }

        public Criteria andTprMemoIsNotNull() {
            addCriterion("tpr_Memo is not null");
            return (Criteria) this;
        }

        public Criteria andTprMemoEqualTo(String value) {
            addCriterion("tpr_Memo =", value, "tprMemo");
            return (Criteria) this;
        }

        public Criteria andTprMemoNotEqualTo(String value) {
            addCriterion("tpr_Memo <>", value, "tprMemo");
            return (Criteria) this;
        }

        public Criteria andTprMemoGreaterThan(String value) {
            addCriterion("tpr_Memo >", value, "tprMemo");
            return (Criteria) this;
        }

        public Criteria andTprMemoGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_Memo >=", value, "tprMemo");
            return (Criteria) this;
        }

        public Criteria andTprMemoLessThan(String value) {
            addCriterion("tpr_Memo <", value, "tprMemo");
            return (Criteria) this;
        }

        public Criteria andTprMemoLessThanOrEqualTo(String value) {
            addCriterion("tpr_Memo <=", value, "tprMemo");
            return (Criteria) this;
        }

        public Criteria andTprMemoLike(String value) {
            addCriterion("tpr_Memo like", value, "tprMemo");
            return (Criteria) this;
        }

        public Criteria andTprMemoNotLike(String value) {
            addCriterion("tpr_Memo not like", value, "tprMemo");
            return (Criteria) this;
        }

        public Criteria andTprMemoIn(List<String> values) {
            addCriterion("tpr_Memo in", values, "tprMemo");
            return (Criteria) this;
        }

        public Criteria andTprMemoNotIn(List<String> values) {
            addCriterion("tpr_Memo not in", values, "tprMemo");
            return (Criteria) this;
        }

        public Criteria andTprMemoBetween(String value1, String value2) {
            addCriterion("tpr_Memo between", value1, value2, "tprMemo");
            return (Criteria) this;
        }

        public Criteria andTprMemoNotBetween(String value1, String value2) {
            addCriterion("tpr_Memo not between", value1, value2, "tprMemo");
            return (Criteria) this;
        }

        public Criteria andTprDeleteflagIsNull() {
            addCriterion("tpr_DeleteFlag is null");
            return (Criteria) this;
        }

        public Criteria andTprDeleteflagIsNotNull() {
            addCriterion("tpr_DeleteFlag is not null");
            return (Criteria) this;
        }

        public Criteria andTprDeleteflagEqualTo(Integer value) {
            addCriterion("tpr_DeleteFlag =", value, "tprDeleteflag");
            return (Criteria) this;
        }

        public Criteria andTprDeleteflagNotEqualTo(Integer value) {
            addCriterion("tpr_DeleteFlag <>", value, "tprDeleteflag");
            return (Criteria) this;
        }

        public Criteria andTprDeleteflagGreaterThan(Integer value) {
            addCriterion("tpr_DeleteFlag >", value, "tprDeleteflag");
            return (Criteria) this;
        }

        public Criteria andTprDeleteflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("tpr_DeleteFlag >=", value, "tprDeleteflag");
            return (Criteria) this;
        }

        public Criteria andTprDeleteflagLessThan(Integer value) {
            addCriterion("tpr_DeleteFlag <", value, "tprDeleteflag");
            return (Criteria) this;
        }

        public Criteria andTprDeleteflagLessThanOrEqualTo(Integer value) {
            addCriterion("tpr_DeleteFlag <=", value, "tprDeleteflag");
            return (Criteria) this;
        }

        public Criteria andTprDeleteflagIn(List<Integer> values) {
            addCriterion("tpr_DeleteFlag in", values, "tprDeleteflag");
            return (Criteria) this;
        }

        public Criteria andTprDeleteflagNotIn(List<Integer> values) {
            addCriterion("tpr_DeleteFlag not in", values, "tprDeleteflag");
            return (Criteria) this;
        }

        public Criteria andTprDeleteflagBetween(Integer value1, Integer value2) {
            addCriterion("tpr_DeleteFlag between", value1, value2, "tprDeleteflag");
            return (Criteria) this;
        }

        public Criteria andTprDeleteflagNotBetween(Integer value1, Integer value2) {
            addCriterion("tpr_DeleteFlag not between", value1, value2, "tprDeleteflag");
            return (Criteria) this;
        }

        public Criteria andTprCurlocIsNull() {
            addCriterion("tpr_CurLoc is null");
            return (Criteria) this;
        }

        public Criteria andTprCurlocIsNotNull() {
            addCriterion("tpr_CurLoc is not null");
            return (Criteria) this;
        }

        public Criteria andTprCurlocEqualTo(String value) {
            addCriterion("tpr_CurLoc =", value, "tprCurloc");
            return (Criteria) this;
        }

        public Criteria andTprCurlocNotEqualTo(String value) {
            addCriterion("tpr_CurLoc <>", value, "tprCurloc");
            return (Criteria) this;
        }

        public Criteria andTprCurlocGreaterThan(String value) {
            addCriterion("tpr_CurLoc >", value, "tprCurloc");
            return (Criteria) this;
        }

        public Criteria andTprCurlocGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_CurLoc >=", value, "tprCurloc");
            return (Criteria) this;
        }

        public Criteria andTprCurlocLessThan(String value) {
            addCriterion("tpr_CurLoc <", value, "tprCurloc");
            return (Criteria) this;
        }

        public Criteria andTprCurlocLessThanOrEqualTo(String value) {
            addCriterion("tpr_CurLoc <=", value, "tprCurloc");
            return (Criteria) this;
        }

        public Criteria andTprCurlocLike(String value) {
            addCriterion("tpr_CurLoc like", value, "tprCurloc");
            return (Criteria) this;
        }

        public Criteria andTprCurlocNotLike(String value) {
            addCriterion("tpr_CurLoc not like", value, "tprCurloc");
            return (Criteria) this;
        }

        public Criteria andTprCurlocIn(List<String> values) {
            addCriterion("tpr_CurLoc in", values, "tprCurloc");
            return (Criteria) this;
        }

        public Criteria andTprCurlocNotIn(List<String> values) {
            addCriterion("tpr_CurLoc not in", values, "tprCurloc");
            return (Criteria) this;
        }

        public Criteria andTprCurlocBetween(String value1, String value2) {
            addCriterion("tpr_CurLoc between", value1, value2, "tprCurloc");
            return (Criteria) this;
        }

        public Criteria andTprCurlocNotBetween(String value1, String value2) {
            addCriterion("tpr_CurLoc not between", value1, value2, "tprCurloc");
            return (Criteria) this;
        }

        public Criteria andTprCursiteIsNull() {
            addCriterion("tpr_CurSite is null");
            return (Criteria) this;
        }

        public Criteria andTprCursiteIsNotNull() {
            addCriterion("tpr_CurSite is not null");
            return (Criteria) this;
        }

        public Criteria andTprCursiteEqualTo(String value) {
            addCriterion("tpr_CurSite =", value, "tprCursite");
            return (Criteria) this;
        }

        public Criteria andTprCursiteNotEqualTo(String value) {
            addCriterion("tpr_CurSite <>", value, "tprCursite");
            return (Criteria) this;
        }

        public Criteria andTprCursiteGreaterThan(String value) {
            addCriterion("tpr_CurSite >", value, "tprCursite");
            return (Criteria) this;
        }

        public Criteria andTprCursiteGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_CurSite >=", value, "tprCursite");
            return (Criteria) this;
        }

        public Criteria andTprCursiteLessThan(String value) {
            addCriterion("tpr_CurSite <", value, "tprCursite");
            return (Criteria) this;
        }

        public Criteria andTprCursiteLessThanOrEqualTo(String value) {
            addCriterion("tpr_CurSite <=", value, "tprCursite");
            return (Criteria) this;
        }

        public Criteria andTprCursiteLike(String value) {
            addCriterion("tpr_CurSite like", value, "tprCursite");
            return (Criteria) this;
        }

        public Criteria andTprCursiteNotLike(String value) {
            addCriterion("tpr_CurSite not like", value, "tprCursite");
            return (Criteria) this;
        }

        public Criteria andTprCursiteIn(List<String> values) {
            addCriterion("tpr_CurSite in", values, "tprCursite");
            return (Criteria) this;
        }

        public Criteria andTprCursiteNotIn(List<String> values) {
            addCriterion("tpr_CurSite not in", values, "tprCursite");
            return (Criteria) this;
        }

        public Criteria andTprCursiteBetween(String value1, String value2) {
            addCriterion("tpr_CurSite between", value1, value2, "tprCursite");
            return (Criteria) this;
        }

        public Criteria andTprCursiteNotBetween(String value1, String value2) {
            addCriterion("tpr_CurSite not between", value1, value2, "tprCursite");
            return (Criteria) this;
        }

        public Criteria andTprCurrefIsNull() {
            addCriterion("tpr_CurRef is null");
            return (Criteria) this;
        }

        public Criteria andTprCurrefIsNotNull() {
            addCriterion("tpr_CurRef is not null");
            return (Criteria) this;
        }

        public Criteria andTprCurrefEqualTo(String value) {
            addCriterion("tpr_CurRef =", value, "tprCurref");
            return (Criteria) this;
        }

        public Criteria andTprCurrefNotEqualTo(String value) {
            addCriterion("tpr_CurRef <>", value, "tprCurref");
            return (Criteria) this;
        }

        public Criteria andTprCurrefGreaterThan(String value) {
            addCriterion("tpr_CurRef >", value, "tprCurref");
            return (Criteria) this;
        }

        public Criteria andTprCurrefGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_CurRef >=", value, "tprCurref");
            return (Criteria) this;
        }

        public Criteria andTprCurrefLessThan(String value) {
            addCriterion("tpr_CurRef <", value, "tprCurref");
            return (Criteria) this;
        }

        public Criteria andTprCurrefLessThanOrEqualTo(String value) {
            addCriterion("tpr_CurRef <=", value, "tprCurref");
            return (Criteria) this;
        }

        public Criteria andTprCurrefLike(String value) {
            addCriterion("tpr_CurRef like", value, "tprCurref");
            return (Criteria) this;
        }

        public Criteria andTprCurrefNotLike(String value) {
            addCriterion("tpr_CurRef not like", value, "tprCurref");
            return (Criteria) this;
        }

        public Criteria andTprCurrefIn(List<String> values) {
            addCriterion("tpr_CurRef in", values, "tprCurref");
            return (Criteria) this;
        }

        public Criteria andTprCurrefNotIn(List<String> values) {
            addCriterion("tpr_CurRef not in", values, "tprCurref");
            return (Criteria) this;
        }

        public Criteria andTprCurrefBetween(String value1, String value2) {
            addCriterion("tpr_CurRef between", value1, value2, "tprCurref");
            return (Criteria) this;
        }

        public Criteria andTprCurrefNotBetween(String value1, String value2) {
            addCriterion("tpr_CurRef not between", value1, value2, "tprCurref");
            return (Criteria) this;
        }

        public Criteria andTprReviewresultIsNull() {
            addCriterion("tpr_ReviewResult is null");
            return (Criteria) this;
        }

        public Criteria andTprReviewresultIsNotNull() {
            addCriterion("tpr_ReviewResult is not null");
            return (Criteria) this;
        }

        public Criteria andTprReviewresultEqualTo(String value) {
            addCriterion("tpr_ReviewResult =", value, "tprReviewresult");
            return (Criteria) this;
        }

        public Criteria andTprReviewresultNotEqualTo(String value) {
            addCriterion("tpr_ReviewResult <>", value, "tprReviewresult");
            return (Criteria) this;
        }

        public Criteria andTprReviewresultGreaterThan(String value) {
            addCriterion("tpr_ReviewResult >", value, "tprReviewresult");
            return (Criteria) this;
        }

        public Criteria andTprReviewresultGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_ReviewResult >=", value, "tprReviewresult");
            return (Criteria) this;
        }

        public Criteria andTprReviewresultLessThan(String value) {
            addCriterion("tpr_ReviewResult <", value, "tprReviewresult");
            return (Criteria) this;
        }

        public Criteria andTprReviewresultLessThanOrEqualTo(String value) {
            addCriterion("tpr_ReviewResult <=", value, "tprReviewresult");
            return (Criteria) this;
        }

        public Criteria andTprReviewresultLike(String value) {
            addCriterion("tpr_ReviewResult like", value, "tprReviewresult");
            return (Criteria) this;
        }

        public Criteria andTprReviewresultNotLike(String value) {
            addCriterion("tpr_ReviewResult not like", value, "tprReviewresult");
            return (Criteria) this;
        }

        public Criteria andTprReviewresultIn(List<String> values) {
            addCriterion("tpr_ReviewResult in", values, "tprReviewresult");
            return (Criteria) this;
        }

        public Criteria andTprReviewresultNotIn(List<String> values) {
            addCriterion("tpr_ReviewResult not in", values, "tprReviewresult");
            return (Criteria) this;
        }

        public Criteria andTprReviewresultBetween(String value1, String value2) {
            addCriterion("tpr_ReviewResult between", value1, value2, "tprReviewresult");
            return (Criteria) this;
        }

        public Criteria andTprReviewresultNotBetween(String value1, String value2) {
            addCriterion("tpr_ReviewResult not between", value1, value2, "tprReviewresult");
            return (Criteria) this;
        }

        public Criteria andTprReviewtimeIsNull() {
            addCriterion("tpr_ReviewTime is null");
            return (Criteria) this;
        }

        public Criteria andTprReviewtimeIsNotNull() {
            addCriterion("tpr_ReviewTime is not null");
            return (Criteria) this;
        }

        public Criteria andTprReviewtimeEqualTo(Date value) {
            addCriterion("tpr_ReviewTime =", value, "tprReviewtime");
            return (Criteria) this;
        }

        public Criteria andTprReviewtimeNotEqualTo(Date value) {
            addCriterion("tpr_ReviewTime <>", value, "tprReviewtime");
            return (Criteria) this;
        }

        public Criteria andTprReviewtimeGreaterThan(Date value) {
            addCriterion("tpr_ReviewTime >", value, "tprReviewtime");
            return (Criteria) this;
        }

        public Criteria andTprReviewtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tpr_ReviewTime >=", value, "tprReviewtime");
            return (Criteria) this;
        }

        public Criteria andTprReviewtimeLessThan(Date value) {
            addCriterion("tpr_ReviewTime <", value, "tprReviewtime");
            return (Criteria) this;
        }

        public Criteria andTprReviewtimeLessThanOrEqualTo(Date value) {
            addCriterion("tpr_ReviewTime <=", value, "tprReviewtime");
            return (Criteria) this;
        }

        public Criteria andTprReviewtimeIn(List<Date> values) {
            addCriterion("tpr_ReviewTime in", values, "tprReviewtime");
            return (Criteria) this;
        }

        public Criteria andTprReviewtimeNotIn(List<Date> values) {
            addCriterion("tpr_ReviewTime not in", values, "tprReviewtime");
            return (Criteria) this;
        }

        public Criteria andTprReviewtimeBetween(Date value1, Date value2) {
            addCriterion("tpr_ReviewTime between", value1, value2, "tprReviewtime");
            return (Criteria) this;
        }

        public Criteria andTprReviewtimeNotBetween(Date value1, Date value2) {
            addCriterion("tpr_ReviewTime not between", value1, value2, "tprReviewtime");
            return (Criteria) this;
        }

        public Criteria andTprReviewpersonIsNull() {
            addCriterion("tpr_ReviewPerson is null");
            return (Criteria) this;
        }

        public Criteria andTprReviewpersonIsNotNull() {
            addCriterion("tpr_ReviewPerson is not null");
            return (Criteria) this;
        }

        public Criteria andTprReviewpersonEqualTo(String value) {
            addCriterion("tpr_ReviewPerson =", value, "tprReviewperson");
            return (Criteria) this;
        }

        public Criteria andTprReviewpersonNotEqualTo(String value) {
            addCriterion("tpr_ReviewPerson <>", value, "tprReviewperson");
            return (Criteria) this;
        }

        public Criteria andTprReviewpersonGreaterThan(String value) {
            addCriterion("tpr_ReviewPerson >", value, "tprReviewperson");
            return (Criteria) this;
        }

        public Criteria andTprReviewpersonGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_ReviewPerson >=", value, "tprReviewperson");
            return (Criteria) this;
        }

        public Criteria andTprReviewpersonLessThan(String value) {
            addCriterion("tpr_ReviewPerson <", value, "tprReviewperson");
            return (Criteria) this;
        }

        public Criteria andTprReviewpersonLessThanOrEqualTo(String value) {
            addCriterion("tpr_ReviewPerson <=", value, "tprReviewperson");
            return (Criteria) this;
        }

        public Criteria andTprReviewpersonLike(String value) {
            addCriterion("tpr_ReviewPerson like", value, "tprReviewperson");
            return (Criteria) this;
        }

        public Criteria andTprReviewpersonNotLike(String value) {
            addCriterion("tpr_ReviewPerson not like", value, "tprReviewperson");
            return (Criteria) this;
        }

        public Criteria andTprReviewpersonIn(List<String> values) {
            addCriterion("tpr_ReviewPerson in", values, "tprReviewperson");
            return (Criteria) this;
        }

        public Criteria andTprReviewpersonNotIn(List<String> values) {
            addCriterion("tpr_ReviewPerson not in", values, "tprReviewperson");
            return (Criteria) this;
        }

        public Criteria andTprReviewpersonBetween(String value1, String value2) {
            addCriterion("tpr_ReviewPerson between", value1, value2, "tprReviewperson");
            return (Criteria) this;
        }

        public Criteria andTprReviewpersonNotBetween(String value1, String value2) {
            addCriterion("tpr_ReviewPerson not between", value1, value2, "tprReviewperson");
            return (Criteria) this;
        }

        public Criteria andTrpReviewmemoIsNull() {
            addCriterion("trp_ReviewMemo is null");
            return (Criteria) this;
        }

        public Criteria andTrpReviewmemoIsNotNull() {
            addCriterion("trp_ReviewMemo is not null");
            return (Criteria) this;
        }

        public Criteria andTrpReviewmemoEqualTo(String value) {
            addCriterion("trp_ReviewMemo =", value, "trpReviewmemo");
            return (Criteria) this;
        }

        public Criteria andTrpReviewmemoNotEqualTo(String value) {
            addCriterion("trp_ReviewMemo <>", value, "trpReviewmemo");
            return (Criteria) this;
        }

        public Criteria andTrpReviewmemoGreaterThan(String value) {
            addCriterion("trp_ReviewMemo >", value, "trpReviewmemo");
            return (Criteria) this;
        }

        public Criteria andTrpReviewmemoGreaterThanOrEqualTo(String value) {
            addCriterion("trp_ReviewMemo >=", value, "trpReviewmemo");
            return (Criteria) this;
        }

        public Criteria andTrpReviewmemoLessThan(String value) {
            addCriterion("trp_ReviewMemo <", value, "trpReviewmemo");
            return (Criteria) this;
        }

        public Criteria andTrpReviewmemoLessThanOrEqualTo(String value) {
            addCriterion("trp_ReviewMemo <=", value, "trpReviewmemo");
            return (Criteria) this;
        }

        public Criteria andTrpReviewmemoLike(String value) {
            addCriterion("trp_ReviewMemo like", value, "trpReviewmemo");
            return (Criteria) this;
        }

        public Criteria andTrpReviewmemoNotLike(String value) {
            addCriterion("trp_ReviewMemo not like", value, "trpReviewmemo");
            return (Criteria) this;
        }

        public Criteria andTrpReviewmemoIn(List<String> values) {
            addCriterion("trp_ReviewMemo in", values, "trpReviewmemo");
            return (Criteria) this;
        }

        public Criteria andTrpReviewmemoNotIn(List<String> values) {
            addCriterion("trp_ReviewMemo not in", values, "trpReviewmemo");
            return (Criteria) this;
        }

        public Criteria andTrpReviewmemoBetween(String value1, String value2) {
            addCriterion("trp_ReviewMemo between", value1, value2, "trpReviewmemo");
            return (Criteria) this;
        }

        public Criteria andTrpReviewmemoNotBetween(String value1, String value2) {
            addCriterion("trp_ReviewMemo not between", value1, value2, "trpReviewmemo");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewresultIsNull() {
            addCriterion("tpr_QCReviewResult is null");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewresultIsNotNull() {
            addCriterion("tpr_QCReviewResult is not null");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewresultEqualTo(String value) {
            addCriterion("tpr_QCReviewResult =", value, "tprQcreviewresult");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewresultNotEqualTo(String value) {
            addCriterion("tpr_QCReviewResult <>", value, "tprQcreviewresult");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewresultGreaterThan(String value) {
            addCriterion("tpr_QCReviewResult >", value, "tprQcreviewresult");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewresultGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_QCReviewResult >=", value, "tprQcreviewresult");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewresultLessThan(String value) {
            addCriterion("tpr_QCReviewResult <", value, "tprQcreviewresult");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewresultLessThanOrEqualTo(String value) {
            addCriterion("tpr_QCReviewResult <=", value, "tprQcreviewresult");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewresultLike(String value) {
            addCriterion("tpr_QCReviewResult like", value, "tprQcreviewresult");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewresultNotLike(String value) {
            addCriterion("tpr_QCReviewResult not like", value, "tprQcreviewresult");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewresultIn(List<String> values) {
            addCriterion("tpr_QCReviewResult in", values, "tprQcreviewresult");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewresultNotIn(List<String> values) {
            addCriterion("tpr_QCReviewResult not in", values, "tprQcreviewresult");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewresultBetween(String value1, String value2) {
            addCriterion("tpr_QCReviewResult between", value1, value2, "tprQcreviewresult");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewresultNotBetween(String value1, String value2) {
            addCriterion("tpr_QCReviewResult not between", value1, value2, "tprQcreviewresult");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewtimeIsNull() {
            addCriterion("tpr_QCReviewTime is null");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewtimeIsNotNull() {
            addCriterion("tpr_QCReviewTime is not null");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewtimeEqualTo(Date value) {
            addCriterion("tpr_QCReviewTime =", value, "tprQcreviewtime");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewtimeNotEqualTo(Date value) {
            addCriterion("tpr_QCReviewTime <>", value, "tprQcreviewtime");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewtimeGreaterThan(Date value) {
            addCriterion("tpr_QCReviewTime >", value, "tprQcreviewtime");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tpr_QCReviewTime >=", value, "tprQcreviewtime");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewtimeLessThan(Date value) {
            addCriterion("tpr_QCReviewTime <", value, "tprQcreviewtime");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewtimeLessThanOrEqualTo(Date value) {
            addCriterion("tpr_QCReviewTime <=", value, "tprQcreviewtime");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewtimeIn(List<Date> values) {
            addCriterion("tpr_QCReviewTime in", values, "tprQcreviewtime");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewtimeNotIn(List<Date> values) {
            addCriterion("tpr_QCReviewTime not in", values, "tprQcreviewtime");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewtimeBetween(Date value1, Date value2) {
            addCriterion("tpr_QCReviewTime between", value1, value2, "tprQcreviewtime");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewtimeNotBetween(Date value1, Date value2) {
            addCriterion("tpr_QCReviewTime not between", value1, value2, "tprQcreviewtime");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewpersonIsNull() {
            addCriterion("tpr_QCReviewPerson is null");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewpersonIsNotNull() {
            addCriterion("tpr_QCReviewPerson is not null");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewpersonEqualTo(String value) {
            addCriterion("tpr_QCReviewPerson =", value, "tprQcreviewperson");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewpersonNotEqualTo(String value) {
            addCriterion("tpr_QCReviewPerson <>", value, "tprQcreviewperson");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewpersonGreaterThan(String value) {
            addCriterion("tpr_QCReviewPerson >", value, "tprQcreviewperson");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewpersonGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_QCReviewPerson >=", value, "tprQcreviewperson");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewpersonLessThan(String value) {
            addCriterion("tpr_QCReviewPerson <", value, "tprQcreviewperson");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewpersonLessThanOrEqualTo(String value) {
            addCriterion("tpr_QCReviewPerson <=", value, "tprQcreviewperson");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewpersonLike(String value) {
            addCriterion("tpr_QCReviewPerson like", value, "tprQcreviewperson");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewpersonNotLike(String value) {
            addCriterion("tpr_QCReviewPerson not like", value, "tprQcreviewperson");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewpersonIn(List<String> values) {
            addCriterion("tpr_QCReviewPerson in", values, "tprQcreviewperson");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewpersonNotIn(List<String> values) {
            addCriterion("tpr_QCReviewPerson not in", values, "tprQcreviewperson");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewpersonBetween(String value1, String value2) {
            addCriterion("tpr_QCReviewPerson between", value1, value2, "tprQcreviewperson");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewpersonNotBetween(String value1, String value2) {
            addCriterion("tpr_QCReviewPerson not between", value1, value2, "tprQcreviewperson");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewmemoIsNull() {
            addCriterion("tpr_QCReviewMemo is null");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewmemoIsNotNull() {
            addCriterion("tpr_QCReviewMemo is not null");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewmemoEqualTo(String value) {
            addCriterion("tpr_QCReviewMemo =", value, "tprQcreviewmemo");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewmemoNotEqualTo(String value) {
            addCriterion("tpr_QCReviewMemo <>", value, "tprQcreviewmemo");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewmemoGreaterThan(String value) {
            addCriterion("tpr_QCReviewMemo >", value, "tprQcreviewmemo");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewmemoGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_QCReviewMemo >=", value, "tprQcreviewmemo");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewmemoLessThan(String value) {
            addCriterion("tpr_QCReviewMemo <", value, "tprQcreviewmemo");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewmemoLessThanOrEqualTo(String value) {
            addCriterion("tpr_QCReviewMemo <=", value, "tprQcreviewmemo");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewmemoLike(String value) {
            addCriterion("tpr_QCReviewMemo like", value, "tprQcreviewmemo");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewmemoNotLike(String value) {
            addCriterion("tpr_QCReviewMemo not like", value, "tprQcreviewmemo");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewmemoIn(List<String> values) {
            addCriterion("tpr_QCReviewMemo in", values, "tprQcreviewmemo");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewmemoNotIn(List<String> values) {
            addCriterion("tpr_QCReviewMemo not in", values, "tprQcreviewmemo");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewmemoBetween(String value1, String value2) {
            addCriterion("tpr_QCReviewMemo between", value1, value2, "tprQcreviewmemo");
            return (Criteria) this;
        }

        public Criteria andTprQcreviewmemoNotBetween(String value1, String value2) {
            addCriterion("tpr_QCReviewMemo not between", value1, value2, "tprQcreviewmemo");
            return (Criteria) this;
        }

        public Criteria andTprOfflineprocessIsNull() {
            addCriterion("tpr_OfflineProcess is null");
            return (Criteria) this;
        }

        public Criteria andTprOfflineprocessIsNotNull() {
            addCriterion("tpr_OfflineProcess is not null");
            return (Criteria) this;
        }

        public Criteria andTprOfflineprocessEqualTo(Integer value) {
            addCriterion("tpr_OfflineProcess =", value, "tprOfflineprocess");
            return (Criteria) this;
        }

        public Criteria andTprOfflineprocessNotEqualTo(Integer value) {
            addCriterion("tpr_OfflineProcess <>", value, "tprOfflineprocess");
            return (Criteria) this;
        }

        public Criteria andTprOfflineprocessGreaterThan(Integer value) {
            addCriterion("tpr_OfflineProcess >", value, "tprOfflineprocess");
            return (Criteria) this;
        }

        public Criteria andTprOfflineprocessGreaterThanOrEqualTo(Integer value) {
            addCriterion("tpr_OfflineProcess >=", value, "tprOfflineprocess");
            return (Criteria) this;
        }

        public Criteria andTprOfflineprocessLessThan(Integer value) {
            addCriterion("tpr_OfflineProcess <", value, "tprOfflineprocess");
            return (Criteria) this;
        }

        public Criteria andTprOfflineprocessLessThanOrEqualTo(Integer value) {
            addCriterion("tpr_OfflineProcess <=", value, "tprOfflineprocess");
            return (Criteria) this;
        }

        public Criteria andTprOfflineprocessIn(List<Integer> values) {
            addCriterion("tpr_OfflineProcess in", values, "tprOfflineprocess");
            return (Criteria) this;
        }

        public Criteria andTprOfflineprocessNotIn(List<Integer> values) {
            addCriterion("tpr_OfflineProcess not in", values, "tprOfflineprocess");
            return (Criteria) this;
        }

        public Criteria andTprOfflineprocessBetween(Integer value1, Integer value2) {
            addCriterion("tpr_OfflineProcess between", value1, value2, "tprOfflineprocess");
            return (Criteria) this;
        }

        public Criteria andTprOfflineprocessNotBetween(Integer value1, Integer value2) {
            addCriterion("tpr_OfflineProcess not between", value1, value2, "tprOfflineprocess");
            return (Criteria) this;
        }

        public Criteria andTprFilenameIsNull() {
            addCriterion("tpr_FileName is null");
            return (Criteria) this;
        }

        public Criteria andTprFilenameIsNotNull() {
            addCriterion("tpr_FileName is not null");
            return (Criteria) this;
        }

        public Criteria andTprFilenameEqualTo(String value) {
            addCriterion("tpr_FileName =", value, "tprFilename");
            return (Criteria) this;
        }

        public Criteria andTprFilenameNotEqualTo(String value) {
            addCriterion("tpr_FileName <>", value, "tprFilename");
            return (Criteria) this;
        }

        public Criteria andTprFilenameGreaterThan(String value) {
            addCriterion("tpr_FileName >", value, "tprFilename");
            return (Criteria) this;
        }

        public Criteria andTprFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_FileName >=", value, "tprFilename");
            return (Criteria) this;
        }

        public Criteria andTprFilenameLessThan(String value) {
            addCriterion("tpr_FileName <", value, "tprFilename");
            return (Criteria) this;
        }

        public Criteria andTprFilenameLessThanOrEqualTo(String value) {
            addCriterion("tpr_FileName <=", value, "tprFilename");
            return (Criteria) this;
        }

        public Criteria andTprFilenameLike(String value) {
            addCriterion("tpr_FileName like", value, "tprFilename");
            return (Criteria) this;
        }

        public Criteria andTprFilenameNotLike(String value) {
            addCriterion("tpr_FileName not like", value, "tprFilename");
            return (Criteria) this;
        }

        public Criteria andTprFilenameIn(List<String> values) {
            addCriterion("tpr_FileName in", values, "tprFilename");
            return (Criteria) this;
        }

        public Criteria andTprFilenameNotIn(List<String> values) {
            addCriterion("tpr_FileName not in", values, "tprFilename");
            return (Criteria) this;
        }

        public Criteria andTprFilenameBetween(String value1, String value2) {
            addCriterion("tpr_FileName between", value1, value2, "tprFilename");
            return (Criteria) this;
        }

        public Criteria andTprFilenameNotBetween(String value1, String value2) {
            addCriterion("tpr_FileName not between", value1, value2, "tprFilename");
            return (Criteria) this;
        }

        public Criteria andTprResponsiblepartyIsNull() {
            addCriterion("tpr_ResponsibleParty is null");
            return (Criteria) this;
        }

        public Criteria andTprResponsiblepartyIsNotNull() {
            addCriterion("tpr_ResponsibleParty is not null");
            return (Criteria) this;
        }

        public Criteria andTprResponsiblepartyEqualTo(String value) {
            addCriterion("tpr_ResponsibleParty =", value, "tprResponsibleparty");
            return (Criteria) this;
        }

        public Criteria andTprResponsiblepartyNotEqualTo(String value) {
            addCriterion("tpr_ResponsibleParty <>", value, "tprResponsibleparty");
            return (Criteria) this;
        }

        public Criteria andTprResponsiblepartyGreaterThan(String value) {
            addCriterion("tpr_ResponsibleParty >", value, "tprResponsibleparty");
            return (Criteria) this;
        }

        public Criteria andTprResponsiblepartyGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_ResponsibleParty >=", value, "tprResponsibleparty");
            return (Criteria) this;
        }

        public Criteria andTprResponsiblepartyLessThan(String value) {
            addCriterion("tpr_ResponsibleParty <", value, "tprResponsibleparty");
            return (Criteria) this;
        }

        public Criteria andTprResponsiblepartyLessThanOrEqualTo(String value) {
            addCriterion("tpr_ResponsibleParty <=", value, "tprResponsibleparty");
            return (Criteria) this;
        }

        public Criteria andTprResponsiblepartyLike(String value) {
            addCriterion("tpr_ResponsibleParty like", value, "tprResponsibleparty");
            return (Criteria) this;
        }

        public Criteria andTprResponsiblepartyNotLike(String value) {
            addCriterion("tpr_ResponsibleParty not like", value, "tprResponsibleparty");
            return (Criteria) this;
        }

        public Criteria andTprResponsiblepartyIn(List<String> values) {
            addCriterion("tpr_ResponsibleParty in", values, "tprResponsibleparty");
            return (Criteria) this;
        }

        public Criteria andTprResponsiblepartyNotIn(List<String> values) {
            addCriterion("tpr_ResponsibleParty not in", values, "tprResponsibleparty");
            return (Criteria) this;
        }

        public Criteria andTprResponsiblepartyBetween(String value1, String value2) {
            addCriterion("tpr_ResponsibleParty between", value1, value2, "tprResponsibleparty");
            return (Criteria) this;
        }

        public Criteria andTprResponsiblepartyNotBetween(String value1, String value2) {
            addCriterion("tpr_ResponsibleParty not between", value1, value2, "tprResponsibleparty");
            return (Criteria) this;
        }

        public Criteria andTprDutytypeIsNull() {
            addCriterion("tpr_DutyType is null");
            return (Criteria) this;
        }

        public Criteria andTprDutytypeIsNotNull() {
            addCriterion("tpr_DutyType is not null");
            return (Criteria) this;
        }

        public Criteria andTprDutytypeEqualTo(String value) {
            addCriterion("tpr_DutyType =", value, "tprDutytype");
            return (Criteria) this;
        }

        public Criteria andTprDutytypeNotEqualTo(String value) {
            addCriterion("tpr_DutyType <>", value, "tprDutytype");
            return (Criteria) this;
        }

        public Criteria andTprDutytypeGreaterThan(String value) {
            addCriterion("tpr_DutyType >", value, "tprDutytype");
            return (Criteria) this;
        }

        public Criteria andTprDutytypeGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_DutyType >=", value, "tprDutytype");
            return (Criteria) this;
        }

        public Criteria andTprDutytypeLessThan(String value) {
            addCriterion("tpr_DutyType <", value, "tprDutytype");
            return (Criteria) this;
        }

        public Criteria andTprDutytypeLessThanOrEqualTo(String value) {
            addCriterion("tpr_DutyType <=", value, "tprDutytype");
            return (Criteria) this;
        }

        public Criteria andTprDutytypeLike(String value) {
            addCriterion("tpr_DutyType like", value, "tprDutytype");
            return (Criteria) this;
        }

        public Criteria andTprDutytypeNotLike(String value) {
            addCriterion("tpr_DutyType not like", value, "tprDutytype");
            return (Criteria) this;
        }

        public Criteria andTprDutytypeIn(List<String> values) {
            addCriterion("tpr_DutyType in", values, "tprDutytype");
            return (Criteria) this;
        }

        public Criteria andTprDutytypeNotIn(List<String> values) {
            addCriterion("tpr_DutyType not in", values, "tprDutytype");
            return (Criteria) this;
        }

        public Criteria andTprDutytypeBetween(String value1, String value2) {
            addCriterion("tpr_DutyType between", value1, value2, "tprDutytype");
            return (Criteria) this;
        }

        public Criteria andTprDutytypeNotBetween(String value1, String value2) {
            addCriterion("tpr_DutyType not between", value1, value2, "tprDutytype");
            return (Criteria) this;
        }

        public Criteria andTprDutyvendnoIsNull() {
            addCriterion("tpr_DutyVendNo is null");
            return (Criteria) this;
        }

        public Criteria andTprDutyvendnoIsNotNull() {
            addCriterion("tpr_DutyVendNo is not null");
            return (Criteria) this;
        }

        public Criteria andTprDutyvendnoEqualTo(String value) {
            addCriterion("tpr_DutyVendNo =", value, "tprDutyvendno");
            return (Criteria) this;
        }

        public Criteria andTprDutyvendnoNotEqualTo(String value) {
            addCriterion("tpr_DutyVendNo <>", value, "tprDutyvendno");
            return (Criteria) this;
        }

        public Criteria andTprDutyvendnoGreaterThan(String value) {
            addCriterion("tpr_DutyVendNo >", value, "tprDutyvendno");
            return (Criteria) this;
        }

        public Criteria andTprDutyvendnoGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_DutyVendNo >=", value, "tprDutyvendno");
            return (Criteria) this;
        }

        public Criteria andTprDutyvendnoLessThan(String value) {
            addCriterion("tpr_DutyVendNo <", value, "tprDutyvendno");
            return (Criteria) this;
        }

        public Criteria andTprDutyvendnoLessThanOrEqualTo(String value) {
            addCriterion("tpr_DutyVendNo <=", value, "tprDutyvendno");
            return (Criteria) this;
        }

        public Criteria andTprDutyvendnoLike(String value) {
            addCriterion("tpr_DutyVendNo like", value, "tprDutyvendno");
            return (Criteria) this;
        }

        public Criteria andTprDutyvendnoNotLike(String value) {
            addCriterion("tpr_DutyVendNo not like", value, "tprDutyvendno");
            return (Criteria) this;
        }

        public Criteria andTprDutyvendnoIn(List<String> values) {
            addCriterion("tpr_DutyVendNo in", values, "tprDutyvendno");
            return (Criteria) this;
        }

        public Criteria andTprDutyvendnoNotIn(List<String> values) {
            addCriterion("tpr_DutyVendNo not in", values, "tprDutyvendno");
            return (Criteria) this;
        }

        public Criteria andTprDutyvendnoBetween(String value1, String value2) {
            addCriterion("tpr_DutyVendNo between", value1, value2, "tprDutyvendno");
            return (Criteria) this;
        }

        public Criteria andTprDutyvendnoNotBetween(String value1, String value2) {
            addCriterion("tpr_DutyVendNo not between", value1, value2, "tprDutyvendno");
            return (Criteria) this;
        }

        public Criteria andTprDutyvenddomainIsNull() {
            addCriterion("tpr_DutyVendDomain is null");
            return (Criteria) this;
        }

        public Criteria andTprDutyvenddomainIsNotNull() {
            addCriterion("tpr_DutyVendDomain is not null");
            return (Criteria) this;
        }

        public Criteria andTprDutyvenddomainEqualTo(String value) {
            addCriterion("tpr_DutyVendDomain =", value, "tprDutyvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprDutyvenddomainNotEqualTo(String value) {
            addCriterion("tpr_DutyVendDomain <>", value, "tprDutyvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprDutyvenddomainGreaterThan(String value) {
            addCriterion("tpr_DutyVendDomain >", value, "tprDutyvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprDutyvenddomainGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_DutyVendDomain >=", value, "tprDutyvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprDutyvenddomainLessThan(String value) {
            addCriterion("tpr_DutyVendDomain <", value, "tprDutyvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprDutyvenddomainLessThanOrEqualTo(String value) {
            addCriterion("tpr_DutyVendDomain <=", value, "tprDutyvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprDutyvenddomainLike(String value) {
            addCriterion("tpr_DutyVendDomain like", value, "tprDutyvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprDutyvenddomainNotLike(String value) {
            addCriterion("tpr_DutyVendDomain not like", value, "tprDutyvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprDutyvenddomainIn(List<String> values) {
            addCriterion("tpr_DutyVendDomain in", values, "tprDutyvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprDutyvenddomainNotIn(List<String> values) {
            addCriterion("tpr_DutyVendDomain not in", values, "tprDutyvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprDutyvenddomainBetween(String value1, String value2) {
            addCriterion("tpr_DutyVendDomain between", value1, value2, "tprDutyvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprDutyvenddomainNotBetween(String value1, String value2) {
            addCriterion("tpr_DutyVendDomain not between", value1, value2, "tprDutyvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprPonbrIsNull() {
            addCriterion("tpr_poNbr is null");
            return (Criteria) this;
        }

        public Criteria andTprPonbrIsNotNull() {
            addCriterion("tpr_poNbr is not null");
            return (Criteria) this;
        }

        public Criteria andTprPonbrEqualTo(String value) {
            addCriterion("tpr_poNbr =", value, "tprPonbr");
            return (Criteria) this;
        }

        public Criteria andTprPonbrNotEqualTo(String value) {
            addCriterion("tpr_poNbr <>", value, "tprPonbr");
            return (Criteria) this;
        }

        public Criteria andTprPonbrGreaterThan(String value) {
            addCriterion("tpr_poNbr >", value, "tprPonbr");
            return (Criteria) this;
        }

        public Criteria andTprPonbrGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_poNbr >=", value, "tprPonbr");
            return (Criteria) this;
        }

        public Criteria andTprPonbrLessThan(String value) {
            addCriterion("tpr_poNbr <", value, "tprPonbr");
            return (Criteria) this;
        }

        public Criteria andTprPonbrLessThanOrEqualTo(String value) {
            addCriterion("tpr_poNbr <=", value, "tprPonbr");
            return (Criteria) this;
        }

        public Criteria andTprPonbrLike(String value) {
            addCriterion("tpr_poNbr like", value, "tprPonbr");
            return (Criteria) this;
        }

        public Criteria andTprPonbrNotLike(String value) {
            addCriterion("tpr_poNbr not like", value, "tprPonbr");
            return (Criteria) this;
        }

        public Criteria andTprPonbrIn(List<String> values) {
            addCriterion("tpr_poNbr in", values, "tprPonbr");
            return (Criteria) this;
        }

        public Criteria andTprPonbrNotIn(List<String> values) {
            addCriterion("tpr_poNbr not in", values, "tprPonbr");
            return (Criteria) this;
        }

        public Criteria andTprPonbrBetween(String value1, String value2) {
            addCriterion("tpr_poNbr between", value1, value2, "tprPonbr");
            return (Criteria) this;
        }

        public Criteria andTprPonbrNotBetween(String value1, String value2) {
            addCriterion("tpr_poNbr not between", value1, value2, "tprPonbr");
            return (Criteria) this;
        }

        public Criteria andTprPodlineIsNull() {
            addCriterion("tpr_podLine is null");
            return (Criteria) this;
        }

        public Criteria andTprPodlineIsNotNull() {
            addCriterion("tpr_podLine is not null");
            return (Criteria) this;
        }

        public Criteria andTprPodlineEqualTo(String value) {
            addCriterion("tpr_podLine =", value, "tprPodline");
            return (Criteria) this;
        }

        public Criteria andTprPodlineNotEqualTo(String value) {
            addCriterion("tpr_podLine <>", value, "tprPodline");
            return (Criteria) this;
        }

        public Criteria andTprPodlineGreaterThan(String value) {
            addCriterion("tpr_podLine >", value, "tprPodline");
            return (Criteria) this;
        }

        public Criteria andTprPodlineGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_podLine >=", value, "tprPodline");
            return (Criteria) this;
        }

        public Criteria andTprPodlineLessThan(String value) {
            addCriterion("tpr_podLine <", value, "tprPodline");
            return (Criteria) this;
        }

        public Criteria andTprPodlineLessThanOrEqualTo(String value) {
            addCriterion("tpr_podLine <=", value, "tprPodline");
            return (Criteria) this;
        }

        public Criteria andTprPodlineLike(String value) {
            addCriterion("tpr_podLine like", value, "tprPodline");
            return (Criteria) this;
        }

        public Criteria andTprPodlineNotLike(String value) {
            addCriterion("tpr_podLine not like", value, "tprPodline");
            return (Criteria) this;
        }

        public Criteria andTprPodlineIn(List<String> values) {
            addCriterion("tpr_podLine in", values, "tprPodline");
            return (Criteria) this;
        }

        public Criteria andTprPodlineNotIn(List<String> values) {
            addCriterion("tpr_podLine not in", values, "tprPodline");
            return (Criteria) this;
        }

        public Criteria andTprPodlineBetween(String value1, String value2) {
            addCriterion("tpr_podLine between", value1, value2, "tprPodline");
            return (Criteria) this;
        }

        public Criteria andTprPodlineNotBetween(String value1, String value2) {
            addCriterion("tpr_podLine not between", value1, value2, "tprPodline");
            return (Criteria) this;
        }

        public Criteria andTprPodpurcostIsNull() {
            addCriterion("tpr_podPurCost is null");
            return (Criteria) this;
        }

        public Criteria andTprPodpurcostIsNotNull() {
            addCriterion("tpr_podPurCost is not null");
            return (Criteria) this;
        }

        public Criteria andTprPodpurcostEqualTo(BigDecimal value) {
            addCriterion("tpr_podPurCost =", value, "tprPodpurcost");
            return (Criteria) this;
        }

        public Criteria andTprPodpurcostNotEqualTo(BigDecimal value) {
            addCriterion("tpr_podPurCost <>", value, "tprPodpurcost");
            return (Criteria) this;
        }

        public Criteria andTprPodpurcostGreaterThan(BigDecimal value) {
            addCriterion("tpr_podPurCost >", value, "tprPodpurcost");
            return (Criteria) this;
        }

        public Criteria andTprPodpurcostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tpr_podPurCost >=", value, "tprPodpurcost");
            return (Criteria) this;
        }

        public Criteria andTprPodpurcostLessThan(BigDecimal value) {
            addCriterion("tpr_podPurCost <", value, "tprPodpurcost");
            return (Criteria) this;
        }

        public Criteria andTprPodpurcostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tpr_podPurCost <=", value, "tprPodpurcost");
            return (Criteria) this;
        }

        public Criteria andTprPodpurcostIn(List<BigDecimal> values) {
            addCriterion("tpr_podPurCost in", values, "tprPodpurcost");
            return (Criteria) this;
        }

        public Criteria andTprPodpurcostNotIn(List<BigDecimal> values) {
            addCriterion("tpr_podPurCost not in", values, "tprPodpurcost");
            return (Criteria) this;
        }

        public Criteria andTprPodpurcostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tpr_podPurCost between", value1, value2, "tprPodpurcost");
            return (Criteria) this;
        }

        public Criteria andTprPodpurcostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tpr_podPurCost not between", value1, value2, "tprPodpurcost");
            return (Criteria) this;
        }

        public Criteria andTprDutywkctrIsNull() {
            addCriterion("tpr_DutyWkctr is null");
            return (Criteria) this;
        }

        public Criteria andTprDutywkctrIsNotNull() {
            addCriterion("tpr_DutyWkctr is not null");
            return (Criteria) this;
        }

        public Criteria andTprDutywkctrEqualTo(String value) {
            addCriterion("tpr_DutyWkctr =", value, "tprDutywkctr");
            return (Criteria) this;
        }

        public Criteria andTprDutywkctrNotEqualTo(String value) {
            addCriterion("tpr_DutyWkctr <>", value, "tprDutywkctr");
            return (Criteria) this;
        }

        public Criteria andTprDutywkctrGreaterThan(String value) {
            addCriterion("tpr_DutyWkctr >", value, "tprDutywkctr");
            return (Criteria) this;
        }

        public Criteria andTprDutywkctrGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_DutyWkctr >=", value, "tprDutywkctr");
            return (Criteria) this;
        }

        public Criteria andTprDutywkctrLessThan(String value) {
            addCriterion("tpr_DutyWkctr <", value, "tprDutywkctr");
            return (Criteria) this;
        }

        public Criteria andTprDutywkctrLessThanOrEqualTo(String value) {
            addCriterion("tpr_DutyWkctr <=", value, "tprDutywkctr");
            return (Criteria) this;
        }

        public Criteria andTprDutywkctrLike(String value) {
            addCriterion("tpr_DutyWkctr like", value, "tprDutywkctr");
            return (Criteria) this;
        }

        public Criteria andTprDutywkctrNotLike(String value) {
            addCriterion("tpr_DutyWkctr not like", value, "tprDutywkctr");
            return (Criteria) this;
        }

        public Criteria andTprDutywkctrIn(List<String> values) {
            addCriterion("tpr_DutyWkctr in", values, "tprDutywkctr");
            return (Criteria) this;
        }

        public Criteria andTprDutywkctrNotIn(List<String> values) {
            addCriterion("tpr_DutyWkctr not in", values, "tprDutywkctr");
            return (Criteria) this;
        }

        public Criteria andTprDutywkctrBetween(String value1, String value2) {
            addCriterion("tpr_DutyWkctr between", value1, value2, "tprDutywkctr");
            return (Criteria) this;
        }

        public Criteria andTprDutywkctrNotBetween(String value1, String value2) {
            addCriterion("tpr_DutyWkctr not between", value1, value2, "tprDutywkctr");
            return (Criteria) this;
        }

        public Criteria andTprDutywkctrnameIsNull() {
            addCriterion("tpr_DutyWkctrName is null");
            return (Criteria) this;
        }

        public Criteria andTprDutywkctrnameIsNotNull() {
            addCriterion("tpr_DutyWkctrName is not null");
            return (Criteria) this;
        }

        public Criteria andTprDutywkctrnameEqualTo(String value) {
            addCriterion("tpr_DutyWkctrName =", value, "tprDutywkctrname");
            return (Criteria) this;
        }

        public Criteria andTprDutywkctrnameNotEqualTo(String value) {
            addCriterion("tpr_DutyWkctrName <>", value, "tprDutywkctrname");
            return (Criteria) this;
        }

        public Criteria andTprDutywkctrnameGreaterThan(String value) {
            addCriterion("tpr_DutyWkctrName >", value, "tprDutywkctrname");
            return (Criteria) this;
        }

        public Criteria andTprDutywkctrnameGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_DutyWkctrName >=", value, "tprDutywkctrname");
            return (Criteria) this;
        }

        public Criteria andTprDutywkctrnameLessThan(String value) {
            addCriterion("tpr_DutyWkctrName <", value, "tprDutywkctrname");
            return (Criteria) this;
        }

        public Criteria andTprDutywkctrnameLessThanOrEqualTo(String value) {
            addCriterion("tpr_DutyWkctrName <=", value, "tprDutywkctrname");
            return (Criteria) this;
        }

        public Criteria andTprDutywkctrnameLike(String value) {
            addCriterion("tpr_DutyWkctrName like", value, "tprDutywkctrname");
            return (Criteria) this;
        }

        public Criteria andTprDutywkctrnameNotLike(String value) {
            addCriterion("tpr_DutyWkctrName not like", value, "tprDutywkctrname");
            return (Criteria) this;
        }

        public Criteria andTprDutywkctrnameIn(List<String> values) {
            addCriterion("tpr_DutyWkctrName in", values, "tprDutywkctrname");
            return (Criteria) this;
        }

        public Criteria andTprDutywkctrnameNotIn(List<String> values) {
            addCriterion("tpr_DutyWkctrName not in", values, "tprDutywkctrname");
            return (Criteria) this;
        }

        public Criteria andTprDutywkctrnameBetween(String value1, String value2) {
            addCriterion("tpr_DutyWkctrName between", value1, value2, "tprDutywkctrname");
            return (Criteria) this;
        }

        public Criteria andTprDutywkctrnameNotBetween(String value1, String value2) {
            addCriterion("tpr_DutyWkctrName not between", value1, value2, "tprDutywkctrname");
            return (Criteria) this;
        }

        public Criteria andTprDutyworkshopIsNull() {
            addCriterion("tpr_DutyWorkshop is null");
            return (Criteria) this;
        }

        public Criteria andTprDutyworkshopIsNotNull() {
            addCriterion("tpr_DutyWorkshop is not null");
            return (Criteria) this;
        }

        public Criteria andTprDutyworkshopEqualTo(String value) {
            addCriterion("tpr_DutyWorkshop =", value, "tprDutyworkshop");
            return (Criteria) this;
        }

        public Criteria andTprDutyworkshopNotEqualTo(String value) {
            addCriterion("tpr_DutyWorkshop <>", value, "tprDutyworkshop");
            return (Criteria) this;
        }

        public Criteria andTprDutyworkshopGreaterThan(String value) {
            addCriterion("tpr_DutyWorkshop >", value, "tprDutyworkshop");
            return (Criteria) this;
        }

        public Criteria andTprDutyworkshopGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_DutyWorkshop >=", value, "tprDutyworkshop");
            return (Criteria) this;
        }

        public Criteria andTprDutyworkshopLessThan(String value) {
            addCriterion("tpr_DutyWorkshop <", value, "tprDutyworkshop");
            return (Criteria) this;
        }

        public Criteria andTprDutyworkshopLessThanOrEqualTo(String value) {
            addCriterion("tpr_DutyWorkshop <=", value, "tprDutyworkshop");
            return (Criteria) this;
        }

        public Criteria andTprDutyworkshopLike(String value) {
            addCriterion("tpr_DutyWorkshop like", value, "tprDutyworkshop");
            return (Criteria) this;
        }

        public Criteria andTprDutyworkshopNotLike(String value) {
            addCriterion("tpr_DutyWorkshop not like", value, "tprDutyworkshop");
            return (Criteria) this;
        }

        public Criteria andTprDutyworkshopIn(List<String> values) {
            addCriterion("tpr_DutyWorkshop in", values, "tprDutyworkshop");
            return (Criteria) this;
        }

        public Criteria andTprDutyworkshopNotIn(List<String> values) {
            addCriterion("tpr_DutyWorkshop not in", values, "tprDutyworkshop");
            return (Criteria) this;
        }

        public Criteria andTprDutyworkshopBetween(String value1, String value2) {
            addCriterion("tpr_DutyWorkshop between", value1, value2, "tprDutyworkshop");
            return (Criteria) this;
        }

        public Criteria andTprDutyworkshopNotBetween(String value1, String value2) {
            addCriterion("tpr_DutyWorkshop not between", value1, value2, "tprDutyworkshop");
            return (Criteria) this;
        }

        public Criteria andTprDutydomainIsNull() {
            addCriterion("tpr_DutyDomain is null");
            return (Criteria) this;
        }

        public Criteria andTprDutydomainIsNotNull() {
            addCriterion("tpr_DutyDomain is not null");
            return (Criteria) this;
        }

        public Criteria andTprDutydomainEqualTo(String value) {
            addCriterion("tpr_DutyDomain =", value, "tprDutydomain");
            return (Criteria) this;
        }

        public Criteria andTprDutydomainNotEqualTo(String value) {
            addCriterion("tpr_DutyDomain <>", value, "tprDutydomain");
            return (Criteria) this;
        }

        public Criteria andTprDutydomainGreaterThan(String value) {
            addCriterion("tpr_DutyDomain >", value, "tprDutydomain");
            return (Criteria) this;
        }

        public Criteria andTprDutydomainGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_DutyDomain >=", value, "tprDutydomain");
            return (Criteria) this;
        }

        public Criteria andTprDutydomainLessThan(String value) {
            addCriterion("tpr_DutyDomain <", value, "tprDutydomain");
            return (Criteria) this;
        }

        public Criteria andTprDutydomainLessThanOrEqualTo(String value) {
            addCriterion("tpr_DutyDomain <=", value, "tprDutydomain");
            return (Criteria) this;
        }

        public Criteria andTprDutydomainLike(String value) {
            addCriterion("tpr_DutyDomain like", value, "tprDutydomain");
            return (Criteria) this;
        }

        public Criteria andTprDutydomainNotLike(String value) {
            addCriterion("tpr_DutyDomain not like", value, "tprDutydomain");
            return (Criteria) this;
        }

        public Criteria andTprDutydomainIn(List<String> values) {
            addCriterion("tpr_DutyDomain in", values, "tprDutydomain");
            return (Criteria) this;
        }

        public Criteria andTprDutydomainNotIn(List<String> values) {
            addCriterion("tpr_DutyDomain not in", values, "tprDutydomain");
            return (Criteria) this;
        }

        public Criteria andTprDutydomainBetween(String value1, String value2) {
            addCriterion("tpr_DutyDomain between", value1, value2, "tprDutydomain");
            return (Criteria) this;
        }

        public Criteria andTprDutydomainNotBetween(String value1, String value2) {
            addCriterion("tpr_DutyDomain not between", value1, value2, "tprDutydomain");
            return (Criteria) this;
        }

        public Criteria andTprDutysiteIsNull() {
            addCriterion("tpr_DutySite is null");
            return (Criteria) this;
        }

        public Criteria andTprDutysiteIsNotNull() {
            addCriterion("tpr_DutySite is not null");
            return (Criteria) this;
        }

        public Criteria andTprDutysiteEqualTo(String value) {
            addCriterion("tpr_DutySite =", value, "tprDutysite");
            return (Criteria) this;
        }

        public Criteria andTprDutysiteNotEqualTo(String value) {
            addCriterion("tpr_DutySite <>", value, "tprDutysite");
            return (Criteria) this;
        }

        public Criteria andTprDutysiteGreaterThan(String value) {
            addCriterion("tpr_DutySite >", value, "tprDutysite");
            return (Criteria) this;
        }

        public Criteria andTprDutysiteGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_DutySite >=", value, "tprDutysite");
            return (Criteria) this;
        }

        public Criteria andTprDutysiteLessThan(String value) {
            addCriterion("tpr_DutySite <", value, "tprDutysite");
            return (Criteria) this;
        }

        public Criteria andTprDutysiteLessThanOrEqualTo(String value) {
            addCriterion("tpr_DutySite <=", value, "tprDutysite");
            return (Criteria) this;
        }

        public Criteria andTprDutysiteLike(String value) {
            addCriterion("tpr_DutySite like", value, "tprDutysite");
            return (Criteria) this;
        }

        public Criteria andTprDutysiteNotLike(String value) {
            addCriterion("tpr_DutySite not like", value, "tprDutysite");
            return (Criteria) this;
        }

        public Criteria andTprDutysiteIn(List<String> values) {
            addCriterion("tpr_DutySite in", values, "tprDutysite");
            return (Criteria) this;
        }

        public Criteria andTprDutysiteNotIn(List<String> values) {
            addCriterion("tpr_DutySite not in", values, "tprDutysite");
            return (Criteria) this;
        }

        public Criteria andTprDutysiteBetween(String value1, String value2) {
            addCriterion("tpr_DutySite between", value1, value2, "tprDutysite");
            return (Criteria) this;
        }

        public Criteria andTprDutysiteNotBetween(String value1, String value2) {
            addCriterion("tpr_DutySite not between", value1, value2, "tprDutysite");
            return (Criteria) this;
        }

        public Criteria andTprDutycostcenterIsNull() {
            addCriterion("tpr_DutyCostCenter is null");
            return (Criteria) this;
        }

        public Criteria andTprDutycostcenterIsNotNull() {
            addCriterion("tpr_DutyCostCenter is not null");
            return (Criteria) this;
        }

        public Criteria andTprDutycostcenterEqualTo(String value) {
            addCriterion("tpr_DutyCostCenter =", value, "tprDutycostcenter");
            return (Criteria) this;
        }

        public Criteria andTprDutycostcenterNotEqualTo(String value) {
            addCriterion("tpr_DutyCostCenter <>", value, "tprDutycostcenter");
            return (Criteria) this;
        }

        public Criteria andTprDutycostcenterGreaterThan(String value) {
            addCriterion("tpr_DutyCostCenter >", value, "tprDutycostcenter");
            return (Criteria) this;
        }

        public Criteria andTprDutycostcenterGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_DutyCostCenter >=", value, "tprDutycostcenter");
            return (Criteria) this;
        }

        public Criteria andTprDutycostcenterLessThan(String value) {
            addCriterion("tpr_DutyCostCenter <", value, "tprDutycostcenter");
            return (Criteria) this;
        }

        public Criteria andTprDutycostcenterLessThanOrEqualTo(String value) {
            addCriterion("tpr_DutyCostCenter <=", value, "tprDutycostcenter");
            return (Criteria) this;
        }

        public Criteria andTprDutycostcenterLike(String value) {
            addCriterion("tpr_DutyCostCenter like", value, "tprDutycostcenter");
            return (Criteria) this;
        }

        public Criteria andTprDutycostcenterNotLike(String value) {
            addCriterion("tpr_DutyCostCenter not like", value, "tprDutycostcenter");
            return (Criteria) this;
        }

        public Criteria andTprDutycostcenterIn(List<String> values) {
            addCriterion("tpr_DutyCostCenter in", values, "tprDutycostcenter");
            return (Criteria) this;
        }

        public Criteria andTprDutycostcenterNotIn(List<String> values) {
            addCriterion("tpr_DutyCostCenter not in", values, "tprDutycostcenter");
            return (Criteria) this;
        }

        public Criteria andTprDutycostcenterBetween(String value1, String value2) {
            addCriterion("tpr_DutyCostCenter between", value1, value2, "tprDutycostcenter");
            return (Criteria) this;
        }

        public Criteria andTprDutycostcenterNotBetween(String value1, String value2) {
            addCriterion("tpr_DutyCostCenter not between", value1, value2, "tprDutycostcenter");
            return (Criteria) this;
        }

        public Criteria andTprDutycostcenternameIsNull() {
            addCriterion("tpr_DutyCostCenterName is null");
            return (Criteria) this;
        }

        public Criteria andTprDutycostcenternameIsNotNull() {
            addCriterion("tpr_DutyCostCenterName is not null");
            return (Criteria) this;
        }

        public Criteria andTprDutycostcenternameEqualTo(String value) {
            addCriterion("tpr_DutyCostCenterName =", value, "tprDutycostcentername");
            return (Criteria) this;
        }

        public Criteria andTprDutycostcenternameNotEqualTo(String value) {
            addCriterion("tpr_DutyCostCenterName <>", value, "tprDutycostcentername");
            return (Criteria) this;
        }

        public Criteria andTprDutycostcenternameGreaterThan(String value) {
            addCriterion("tpr_DutyCostCenterName >", value, "tprDutycostcentername");
            return (Criteria) this;
        }

        public Criteria andTprDutycostcenternameGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_DutyCostCenterName >=", value, "tprDutycostcentername");
            return (Criteria) this;
        }

        public Criteria andTprDutycostcenternameLessThan(String value) {
            addCriterion("tpr_DutyCostCenterName <", value, "tprDutycostcentername");
            return (Criteria) this;
        }

        public Criteria andTprDutycostcenternameLessThanOrEqualTo(String value) {
            addCriterion("tpr_DutyCostCenterName <=", value, "tprDutycostcentername");
            return (Criteria) this;
        }

        public Criteria andTprDutycostcenternameLike(String value) {
            addCriterion("tpr_DutyCostCenterName like", value, "tprDutycostcentername");
            return (Criteria) this;
        }

        public Criteria andTprDutycostcenternameNotLike(String value) {
            addCriterion("tpr_DutyCostCenterName not like", value, "tprDutycostcentername");
            return (Criteria) this;
        }

        public Criteria andTprDutycostcenternameIn(List<String> values) {
            addCriterion("tpr_DutyCostCenterName in", values, "tprDutycostcentername");
            return (Criteria) this;
        }

        public Criteria andTprDutycostcenternameNotIn(List<String> values) {
            addCriterion("tpr_DutyCostCenterName not in", values, "tprDutycostcentername");
            return (Criteria) this;
        }

        public Criteria andTprDutycostcenternameBetween(String value1, String value2) {
            addCriterion("tpr_DutyCostCenterName between", value1, value2, "tprDutycostcentername");
            return (Criteria) this;
        }

        public Criteria andTprDutycostcenternameNotBetween(String value1, String value2) {
            addCriterion("tpr_DutyCostCenterName not between", value1, value2, "tprDutycostcentername");
            return (Criteria) this;
        }

        public Criteria andTprDutypartIsNull() {
            addCriterion("tpr_DutyPart is null");
            return (Criteria) this;
        }

        public Criteria andTprDutypartIsNotNull() {
            addCriterion("tpr_DutyPart is not null");
            return (Criteria) this;
        }

        public Criteria andTprDutypartEqualTo(String value) {
            addCriterion("tpr_DutyPart =", value, "tprDutypart");
            return (Criteria) this;
        }

        public Criteria andTprDutypartNotEqualTo(String value) {
            addCriterion("tpr_DutyPart <>", value, "tprDutypart");
            return (Criteria) this;
        }

        public Criteria andTprDutypartGreaterThan(String value) {
            addCriterion("tpr_DutyPart >", value, "tprDutypart");
            return (Criteria) this;
        }

        public Criteria andTprDutypartGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_DutyPart >=", value, "tprDutypart");
            return (Criteria) this;
        }

        public Criteria andTprDutypartLessThan(String value) {
            addCriterion("tpr_DutyPart <", value, "tprDutypart");
            return (Criteria) this;
        }

        public Criteria andTprDutypartLessThanOrEqualTo(String value) {
            addCriterion("tpr_DutyPart <=", value, "tprDutypart");
            return (Criteria) this;
        }

        public Criteria andTprDutypartLike(String value) {
            addCriterion("tpr_DutyPart like", value, "tprDutypart");
            return (Criteria) this;
        }

        public Criteria andTprDutypartNotLike(String value) {
            addCriterion("tpr_DutyPart not like", value, "tprDutypart");
            return (Criteria) this;
        }

        public Criteria andTprDutypartIn(List<String> values) {
            addCriterion("tpr_DutyPart in", values, "tprDutypart");
            return (Criteria) this;
        }

        public Criteria andTprDutypartNotIn(List<String> values) {
            addCriterion("tpr_DutyPart not in", values, "tprDutypart");
            return (Criteria) this;
        }

        public Criteria andTprDutypartBetween(String value1, String value2) {
            addCriterion("tpr_DutyPart between", value1, value2, "tprDutypart");
            return (Criteria) this;
        }

        public Criteria andTprDutypartNotBetween(String value1, String value2) {
            addCriterion("tpr_DutyPart not between", value1, value2, "tprDutypart");
            return (Criteria) this;
        }

        public Criteria andTprDutyroutingIsNull() {
            addCriterion("tpr_DutyRouting is null");
            return (Criteria) this;
        }

        public Criteria andTprDutyroutingIsNotNull() {
            addCriterion("tpr_DutyRouting is not null");
            return (Criteria) this;
        }

        public Criteria andTprDutyroutingEqualTo(String value) {
            addCriterion("tpr_DutyRouting =", value, "tprDutyrouting");
            return (Criteria) this;
        }

        public Criteria andTprDutyroutingNotEqualTo(String value) {
            addCriterion("tpr_DutyRouting <>", value, "tprDutyrouting");
            return (Criteria) this;
        }

        public Criteria andTprDutyroutingGreaterThan(String value) {
            addCriterion("tpr_DutyRouting >", value, "tprDutyrouting");
            return (Criteria) this;
        }

        public Criteria andTprDutyroutingGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_DutyRouting >=", value, "tprDutyrouting");
            return (Criteria) this;
        }

        public Criteria andTprDutyroutingLessThan(String value) {
            addCriterion("tpr_DutyRouting <", value, "tprDutyrouting");
            return (Criteria) this;
        }

        public Criteria andTprDutyroutingLessThanOrEqualTo(String value) {
            addCriterion("tpr_DutyRouting <=", value, "tprDutyrouting");
            return (Criteria) this;
        }

        public Criteria andTprDutyroutingLike(String value) {
            addCriterion("tpr_DutyRouting like", value, "tprDutyrouting");
            return (Criteria) this;
        }

        public Criteria andTprDutyroutingNotLike(String value) {
            addCriterion("tpr_DutyRouting not like", value, "tprDutyrouting");
            return (Criteria) this;
        }

        public Criteria andTprDutyroutingIn(List<String> values) {
            addCriterion("tpr_DutyRouting in", values, "tprDutyrouting");
            return (Criteria) this;
        }

        public Criteria andTprDutyroutingNotIn(List<String> values) {
            addCriterion("tpr_DutyRouting not in", values, "tprDutyrouting");
            return (Criteria) this;
        }

        public Criteria andTprDutyroutingBetween(String value1, String value2) {
            addCriterion("tpr_DutyRouting between", value1, value2, "tprDutyrouting");
            return (Criteria) this;
        }

        public Criteria andTprDutyroutingNotBetween(String value1, String value2) {
            addCriterion("tpr_DutyRouting not between", value1, value2, "tprDutyrouting");
            return (Criteria) this;
        }

        public Criteria andTprDutyopIsNull() {
            addCriterion("tpr_DutyOp is null");
            return (Criteria) this;
        }

        public Criteria andTprDutyopIsNotNull() {
            addCriterion("tpr_DutyOp is not null");
            return (Criteria) this;
        }

        public Criteria andTprDutyopEqualTo(String value) {
            addCriterion("tpr_DutyOp =", value, "tprDutyop");
            return (Criteria) this;
        }

        public Criteria andTprDutyopNotEqualTo(String value) {
            addCriterion("tpr_DutyOp <>", value, "tprDutyop");
            return (Criteria) this;
        }

        public Criteria andTprDutyopGreaterThan(String value) {
            addCriterion("tpr_DutyOp >", value, "tprDutyop");
            return (Criteria) this;
        }

        public Criteria andTprDutyopGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_DutyOp >=", value, "tprDutyop");
            return (Criteria) this;
        }

        public Criteria andTprDutyopLessThan(String value) {
            addCriterion("tpr_DutyOp <", value, "tprDutyop");
            return (Criteria) this;
        }

        public Criteria andTprDutyopLessThanOrEqualTo(String value) {
            addCriterion("tpr_DutyOp <=", value, "tprDutyop");
            return (Criteria) this;
        }

        public Criteria andTprDutyopLike(String value) {
            addCriterion("tpr_DutyOp like", value, "tprDutyop");
            return (Criteria) this;
        }

        public Criteria andTprDutyopNotLike(String value) {
            addCriterion("tpr_DutyOp not like", value, "tprDutyop");
            return (Criteria) this;
        }

        public Criteria andTprDutyopIn(List<String> values) {
            addCriterion("tpr_DutyOp in", values, "tprDutyop");
            return (Criteria) this;
        }

        public Criteria andTprDutyopNotIn(List<String> values) {
            addCriterion("tpr_DutyOp not in", values, "tprDutyop");
            return (Criteria) this;
        }

        public Criteria andTprDutyopBetween(String value1, String value2) {
            addCriterion("tpr_DutyOp between", value1, value2, "tprDutyop");
            return (Criteria) this;
        }

        public Criteria andTprDutyopNotBetween(String value1, String value2) {
            addCriterion("tpr_DutyOp not between", value1, value2, "tprDutyop");
            return (Criteria) this;
        }

        public Criteria andTprDutyopnameIsNull() {
            addCriterion("tpr_DutyOpName is null");
            return (Criteria) this;
        }

        public Criteria andTprDutyopnameIsNotNull() {
            addCriterion("tpr_DutyOpName is not null");
            return (Criteria) this;
        }

        public Criteria andTprDutyopnameEqualTo(String value) {
            addCriterion("tpr_DutyOpName =", value, "tprDutyopname");
            return (Criteria) this;
        }

        public Criteria andTprDutyopnameNotEqualTo(String value) {
            addCriterion("tpr_DutyOpName <>", value, "tprDutyopname");
            return (Criteria) this;
        }

        public Criteria andTprDutyopnameGreaterThan(String value) {
            addCriterion("tpr_DutyOpName >", value, "tprDutyopname");
            return (Criteria) this;
        }

        public Criteria andTprDutyopnameGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_DutyOpName >=", value, "tprDutyopname");
            return (Criteria) this;
        }

        public Criteria andTprDutyopnameLessThan(String value) {
            addCriterion("tpr_DutyOpName <", value, "tprDutyopname");
            return (Criteria) this;
        }

        public Criteria andTprDutyopnameLessThanOrEqualTo(String value) {
            addCriterion("tpr_DutyOpName <=", value, "tprDutyopname");
            return (Criteria) this;
        }

        public Criteria andTprDutyopnameLike(String value) {
            addCriterion("tpr_DutyOpName like", value, "tprDutyopname");
            return (Criteria) this;
        }

        public Criteria andTprDutyopnameNotLike(String value) {
            addCriterion("tpr_DutyOpName not like", value, "tprDutyopname");
            return (Criteria) this;
        }

        public Criteria andTprDutyopnameIn(List<String> values) {
            addCriterion("tpr_DutyOpName in", values, "tprDutyopname");
            return (Criteria) this;
        }

        public Criteria andTprDutyopnameNotIn(List<String> values) {
            addCriterion("tpr_DutyOpName not in", values, "tprDutyopname");
            return (Criteria) this;
        }

        public Criteria andTprDutyopnameBetween(String value1, String value2) {
            addCriterion("tpr_DutyOpName between", value1, value2, "tprDutyopname");
            return (Criteria) this;
        }

        public Criteria andTprDutyopnameNotBetween(String value1, String value2) {
            addCriterion("tpr_DutyOpName not between", value1, value2, "tprDutyopname");
            return (Criteria) this;
        }

        public Criteria andTprRecordstatusIsNull() {
            addCriterion("tpr_RecordStatus is null");
            return (Criteria) this;
        }

        public Criteria andTprRecordstatusIsNotNull() {
            addCriterion("tpr_RecordStatus is not null");
            return (Criteria) this;
        }

        public Criteria andTprRecordstatusEqualTo(Integer value) {
            addCriterion("tpr_RecordStatus =", value, "tprRecordstatus");
            return (Criteria) this;
        }

        public Criteria andTprRecordstatusNotEqualTo(Integer value) {
            addCriterion("tpr_RecordStatus <>", value, "tprRecordstatus");
            return (Criteria) this;
        }

        public Criteria andTprRecordstatusGreaterThan(Integer value) {
            addCriterion("tpr_RecordStatus >", value, "tprRecordstatus");
            return (Criteria) this;
        }

        public Criteria andTprRecordstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("tpr_RecordStatus >=", value, "tprRecordstatus");
            return (Criteria) this;
        }

        public Criteria andTprRecordstatusLessThan(Integer value) {
            addCriterion("tpr_RecordStatus <", value, "tprRecordstatus");
            return (Criteria) this;
        }

        public Criteria andTprRecordstatusLessThanOrEqualTo(Integer value) {
            addCriterion("tpr_RecordStatus <=", value, "tprRecordstatus");
            return (Criteria) this;
        }

        public Criteria andTprRecordstatusIn(List<Integer> values) {
            addCriterion("tpr_RecordStatus in", values, "tprRecordstatus");
            return (Criteria) this;
        }

        public Criteria andTprRecordstatusNotIn(List<Integer> values) {
            addCriterion("tpr_RecordStatus not in", values, "tprRecordstatus");
            return (Criteria) this;
        }

        public Criteria andTprRecordstatusBetween(Integer value1, Integer value2) {
            addCriterion("tpr_RecordStatus between", value1, value2, "tprRecordstatus");
            return (Criteria) this;
        }

        public Criteria andTprRecordstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("tpr_RecordStatus not between", value1, value2, "tprRecordstatus");
            return (Criteria) this;
        }

        public Criteria andTprScrapqtyIsNull() {
            addCriterion("tpr_ScrapQty is null");
            return (Criteria) this;
        }

        public Criteria andTprScrapqtyIsNotNull() {
            addCriterion("tpr_ScrapQty is not null");
            return (Criteria) this;
        }

        public Criteria andTprScrapqtyEqualTo(Integer value) {
            addCriterion("tpr_ScrapQty =", value, "tprScrapqty");
            return (Criteria) this;
        }

        public Criteria andTprScrapqtyNotEqualTo(Integer value) {
            addCriterion("tpr_ScrapQty <>", value, "tprScrapqty");
            return (Criteria) this;
        }

        public Criteria andTprScrapqtyGreaterThan(Integer value) {
            addCriterion("tpr_ScrapQty >", value, "tprScrapqty");
            return (Criteria) this;
        }

        public Criteria andTprScrapqtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("tpr_ScrapQty >=", value, "tprScrapqty");
            return (Criteria) this;
        }

        public Criteria andTprScrapqtyLessThan(Integer value) {
            addCriterion("tpr_ScrapQty <", value, "tprScrapqty");
            return (Criteria) this;
        }

        public Criteria andTprScrapqtyLessThanOrEqualTo(Integer value) {
            addCriterion("tpr_ScrapQty <=", value, "tprScrapqty");
            return (Criteria) this;
        }

        public Criteria andTprScrapqtyIn(List<Integer> values) {
            addCriterion("tpr_ScrapQty in", values, "tprScrapqty");
            return (Criteria) this;
        }

        public Criteria andTprScrapqtyNotIn(List<Integer> values) {
            addCriterion("tpr_ScrapQty not in", values, "tprScrapqty");
            return (Criteria) this;
        }

        public Criteria andTprScrapqtyBetween(Integer value1, Integer value2) {
            addCriterion("tpr_ScrapQty between", value1, value2, "tprScrapqty");
            return (Criteria) this;
        }

        public Criteria andTprScrapqtyNotBetween(Integer value1, Integer value2) {
            addCriterion("tpr_ScrapQty not between", value1, value2, "tprScrapqty");
            return (Criteria) this;
        }

        public Criteria andTprQualifiedqtyIsNull() {
            addCriterion("tpr_QualifiedQty is null");
            return (Criteria) this;
        }

        public Criteria andTprQualifiedqtyIsNotNull() {
            addCriterion("tpr_QualifiedQty is not null");
            return (Criteria) this;
        }

        public Criteria andTprQualifiedqtyEqualTo(Integer value) {
            addCriterion("tpr_QualifiedQty =", value, "tprQualifiedqty");
            return (Criteria) this;
        }

        public Criteria andTprQualifiedqtyNotEqualTo(Integer value) {
            addCriterion("tpr_QualifiedQty <>", value, "tprQualifiedqty");
            return (Criteria) this;
        }

        public Criteria andTprQualifiedqtyGreaterThan(Integer value) {
            addCriterion("tpr_QualifiedQty >", value, "tprQualifiedqty");
            return (Criteria) this;
        }

        public Criteria andTprQualifiedqtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("tpr_QualifiedQty >=", value, "tprQualifiedqty");
            return (Criteria) this;
        }

        public Criteria andTprQualifiedqtyLessThan(Integer value) {
            addCriterion("tpr_QualifiedQty <", value, "tprQualifiedqty");
            return (Criteria) this;
        }

        public Criteria andTprQualifiedqtyLessThanOrEqualTo(Integer value) {
            addCriterion("tpr_QualifiedQty <=", value, "tprQualifiedqty");
            return (Criteria) this;
        }

        public Criteria andTprQualifiedqtyIn(List<Integer> values) {
            addCriterion("tpr_QualifiedQty in", values, "tprQualifiedqty");
            return (Criteria) this;
        }

        public Criteria andTprQualifiedqtyNotIn(List<Integer> values) {
            addCriterion("tpr_QualifiedQty not in", values, "tprQualifiedqty");
            return (Criteria) this;
        }

        public Criteria andTprQualifiedqtyBetween(Integer value1, Integer value2) {
            addCriterion("tpr_QualifiedQty between", value1, value2, "tprQualifiedqty");
            return (Criteria) this;
        }

        public Criteria andTprQualifiedqtyNotBetween(Integer value1, Integer value2) {
            addCriterion("tpr_QualifiedQty not between", value1, value2, "tprQualifiedqty");
            return (Criteria) this;
        }

        public Criteria andTprDutyisconfirmIsNull() {
            addCriterion("tpr_DutyIsConfirm is null");
            return (Criteria) this;
        }

        public Criteria andTprDutyisconfirmIsNotNull() {
            addCriterion("tpr_DutyIsConfirm is not null");
            return (Criteria) this;
        }

        public Criteria andTprDutyisconfirmEqualTo(Integer value) {
            addCriterion("tpr_DutyIsConfirm =", value, "tprDutyisconfirm");
            return (Criteria) this;
        }

        public Criteria andTprDutyisconfirmNotEqualTo(Integer value) {
            addCriterion("tpr_DutyIsConfirm <>", value, "tprDutyisconfirm");
            return (Criteria) this;
        }

        public Criteria andTprDutyisconfirmGreaterThan(Integer value) {
            addCriterion("tpr_DutyIsConfirm >", value, "tprDutyisconfirm");
            return (Criteria) this;
        }

        public Criteria andTprDutyisconfirmGreaterThanOrEqualTo(Integer value) {
            addCriterion("tpr_DutyIsConfirm >=", value, "tprDutyisconfirm");
            return (Criteria) this;
        }

        public Criteria andTprDutyisconfirmLessThan(Integer value) {
            addCriterion("tpr_DutyIsConfirm <", value, "tprDutyisconfirm");
            return (Criteria) this;
        }

        public Criteria andTprDutyisconfirmLessThanOrEqualTo(Integer value) {
            addCriterion("tpr_DutyIsConfirm <=", value, "tprDutyisconfirm");
            return (Criteria) this;
        }

        public Criteria andTprDutyisconfirmIn(List<Integer> values) {
            addCriterion("tpr_DutyIsConfirm in", values, "tprDutyisconfirm");
            return (Criteria) this;
        }

        public Criteria andTprDutyisconfirmNotIn(List<Integer> values) {
            addCriterion("tpr_DutyIsConfirm not in", values, "tprDutyisconfirm");
            return (Criteria) this;
        }

        public Criteria andTprDutyisconfirmBetween(Integer value1, Integer value2) {
            addCriterion("tpr_DutyIsConfirm between", value1, value2, "tprDutyisconfirm");
            return (Criteria) this;
        }

        public Criteria andTprDutyisconfirmNotBetween(Integer value1, Integer value2) {
            addCriterion("tpr_DutyIsConfirm not between", value1, value2, "tprDutyisconfirm");
            return (Criteria) this;
        }

        public Criteria andTprStartvenddomainIsNull() {
            addCriterion("tpr_StartVendDomain is null");
            return (Criteria) this;
        }

        public Criteria andTprStartvenddomainIsNotNull() {
            addCriterion("tpr_StartVendDomain is not null");
            return (Criteria) this;
        }

        public Criteria andTprStartvenddomainEqualTo(String value) {
            addCriterion("tpr_StartVendDomain =", value, "tprStartvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprStartvenddomainNotEqualTo(String value) {
            addCriterion("tpr_StartVendDomain <>", value, "tprStartvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprStartvenddomainGreaterThan(String value) {
            addCriterion("tpr_StartVendDomain >", value, "tprStartvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprStartvenddomainGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_StartVendDomain >=", value, "tprStartvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprStartvenddomainLessThan(String value) {
            addCriterion("tpr_StartVendDomain <", value, "tprStartvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprStartvenddomainLessThanOrEqualTo(String value) {
            addCriterion("tpr_StartVendDomain <=", value, "tprStartvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprStartvenddomainLike(String value) {
            addCriterion("tpr_StartVendDomain like", value, "tprStartvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprStartvenddomainNotLike(String value) {
            addCriterion("tpr_StartVendDomain not like", value, "tprStartvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprStartvenddomainIn(List<String> values) {
            addCriterion("tpr_StartVendDomain in", values, "tprStartvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprStartvenddomainNotIn(List<String> values) {
            addCriterion("tpr_StartVendDomain not in", values, "tprStartvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprStartvenddomainBetween(String value1, String value2) {
            addCriterion("tpr_StartVendDomain between", value1, value2, "tprStartvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprStartvenddomainNotBetween(String value1, String value2) {
            addCriterion("tpr_StartVendDomain not between", value1, value2, "tprStartvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprStartvendnoIsNull() {
            addCriterion("tpr_StartVendNo is null");
            return (Criteria) this;
        }

        public Criteria andTprStartvendnoIsNotNull() {
            addCriterion("tpr_StartVendNo is not null");
            return (Criteria) this;
        }

        public Criteria andTprStartvendnoEqualTo(String value) {
            addCriterion("tpr_StartVendNo =", value, "tprStartvendno");
            return (Criteria) this;
        }

        public Criteria andTprStartvendnoNotEqualTo(String value) {
            addCriterion("tpr_StartVendNo <>", value, "tprStartvendno");
            return (Criteria) this;
        }

        public Criteria andTprStartvendnoGreaterThan(String value) {
            addCriterion("tpr_StartVendNo >", value, "tprStartvendno");
            return (Criteria) this;
        }

        public Criteria andTprStartvendnoGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_StartVendNo >=", value, "tprStartvendno");
            return (Criteria) this;
        }

        public Criteria andTprStartvendnoLessThan(String value) {
            addCriterion("tpr_StartVendNo <", value, "tprStartvendno");
            return (Criteria) this;
        }

        public Criteria andTprStartvendnoLessThanOrEqualTo(String value) {
            addCriterion("tpr_StartVendNo <=", value, "tprStartvendno");
            return (Criteria) this;
        }

        public Criteria andTprStartvendnoLike(String value) {
            addCriterion("tpr_StartVendNo like", value, "tprStartvendno");
            return (Criteria) this;
        }

        public Criteria andTprStartvendnoNotLike(String value) {
            addCriterion("tpr_StartVendNo not like", value, "tprStartvendno");
            return (Criteria) this;
        }

        public Criteria andTprStartvendnoIn(List<String> values) {
            addCriterion("tpr_StartVendNo in", values, "tprStartvendno");
            return (Criteria) this;
        }

        public Criteria andTprStartvendnoNotIn(List<String> values) {
            addCriterion("tpr_StartVendNo not in", values, "tprStartvendno");
            return (Criteria) this;
        }

        public Criteria andTprStartvendnoBetween(String value1, String value2) {
            addCriterion("tpr_StartVendNo between", value1, value2, "tprStartvendno");
            return (Criteria) this;
        }

        public Criteria andTprStartvendnoNotBetween(String value1, String value2) {
            addCriterion("tpr_StartVendNo not between", value1, value2, "tprStartvendno");
            return (Criteria) this;
        }

        public Criteria andTprEndvenddomainIsNull() {
            addCriterion("tpr_EndVendDomain is null");
            return (Criteria) this;
        }

        public Criteria andTprEndvenddomainIsNotNull() {
            addCriterion("tpr_EndVendDomain is not null");
            return (Criteria) this;
        }

        public Criteria andTprEndvenddomainEqualTo(String value) {
            addCriterion("tpr_EndVendDomain =", value, "tprEndvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprEndvenddomainNotEqualTo(String value) {
            addCriterion("tpr_EndVendDomain <>", value, "tprEndvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprEndvenddomainGreaterThan(String value) {
            addCriterion("tpr_EndVendDomain >", value, "tprEndvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprEndvenddomainGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_EndVendDomain >=", value, "tprEndvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprEndvenddomainLessThan(String value) {
            addCriterion("tpr_EndVendDomain <", value, "tprEndvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprEndvenddomainLessThanOrEqualTo(String value) {
            addCriterion("tpr_EndVendDomain <=", value, "tprEndvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprEndvenddomainLike(String value) {
            addCriterion("tpr_EndVendDomain like", value, "tprEndvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprEndvenddomainNotLike(String value) {
            addCriterion("tpr_EndVendDomain not like", value, "tprEndvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprEndvenddomainIn(List<String> values) {
            addCriterion("tpr_EndVendDomain in", values, "tprEndvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprEndvenddomainNotIn(List<String> values) {
            addCriterion("tpr_EndVendDomain not in", values, "tprEndvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprEndvenddomainBetween(String value1, String value2) {
            addCriterion("tpr_EndVendDomain between", value1, value2, "tprEndvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprEndvenddomainNotBetween(String value1, String value2) {
            addCriterion("tpr_EndVendDomain not between", value1, value2, "tprEndvenddomain");
            return (Criteria) this;
        }

        public Criteria andTprEndvendnoIsNull() {
            addCriterion("tpr_EndVendNo is null");
            return (Criteria) this;
        }

        public Criteria andTprEndvendnoIsNotNull() {
            addCriterion("tpr_EndVendNo is not null");
            return (Criteria) this;
        }

        public Criteria andTprEndvendnoEqualTo(String value) {
            addCriterion("tpr_EndVendNo =", value, "tprEndvendno");
            return (Criteria) this;
        }

        public Criteria andTprEndvendnoNotEqualTo(String value) {
            addCriterion("tpr_EndVendNo <>", value, "tprEndvendno");
            return (Criteria) this;
        }

        public Criteria andTprEndvendnoGreaterThan(String value) {
            addCriterion("tpr_EndVendNo >", value, "tprEndvendno");
            return (Criteria) this;
        }

        public Criteria andTprEndvendnoGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_EndVendNo >=", value, "tprEndvendno");
            return (Criteria) this;
        }

        public Criteria andTprEndvendnoLessThan(String value) {
            addCriterion("tpr_EndVendNo <", value, "tprEndvendno");
            return (Criteria) this;
        }

        public Criteria andTprEndvendnoLessThanOrEqualTo(String value) {
            addCriterion("tpr_EndVendNo <=", value, "tprEndvendno");
            return (Criteria) this;
        }

        public Criteria andTprEndvendnoLike(String value) {
            addCriterion("tpr_EndVendNo like", value, "tprEndvendno");
            return (Criteria) this;
        }

        public Criteria andTprEndvendnoNotLike(String value) {
            addCriterion("tpr_EndVendNo not like", value, "tprEndvendno");
            return (Criteria) this;
        }

        public Criteria andTprEndvendnoIn(List<String> values) {
            addCriterion("tpr_EndVendNo in", values, "tprEndvendno");
            return (Criteria) this;
        }

        public Criteria andTprEndvendnoNotIn(List<String> values) {
            addCriterion("tpr_EndVendNo not in", values, "tprEndvendno");
            return (Criteria) this;
        }

        public Criteria andTprEndvendnoBetween(String value1, String value2) {
            addCriterion("tpr_EndVendNo between", value1, value2, "tprEndvendno");
            return (Criteria) this;
        }

        public Criteria andTprEndvendnoNotBetween(String value1, String value2) {
            addCriterion("tpr_EndVendNo not between", value1, value2, "tprEndvendno");
            return (Criteria) this;
        }

        public Criteria andTprWastetimeIsNull() {
            addCriterion("tpr_WasteTime is null");
            return (Criteria) this;
        }

        public Criteria andTprWastetimeIsNotNull() {
            addCriterion("tpr_WasteTime is not null");
            return (Criteria) this;
        }

        public Criteria andTprWastetimeEqualTo(BigDecimal value) {
            addCriterion("tpr_WasteTime =", value, "tprWastetime");
            return (Criteria) this;
        }

        public Criteria andTprWastetimeNotEqualTo(BigDecimal value) {
            addCriterion("tpr_WasteTime <>", value, "tprWastetime");
            return (Criteria) this;
        }

        public Criteria andTprWastetimeGreaterThan(BigDecimal value) {
            addCriterion("tpr_WasteTime >", value, "tprWastetime");
            return (Criteria) this;
        }

        public Criteria andTprWastetimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tpr_WasteTime >=", value, "tprWastetime");
            return (Criteria) this;
        }

        public Criteria andTprWastetimeLessThan(BigDecimal value) {
            addCriterion("tpr_WasteTime <", value, "tprWastetime");
            return (Criteria) this;
        }

        public Criteria andTprWastetimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tpr_WasteTime <=", value, "tprWastetime");
            return (Criteria) this;
        }

        public Criteria andTprWastetimeIn(List<BigDecimal> values) {
            addCriterion("tpr_WasteTime in", values, "tprWastetime");
            return (Criteria) this;
        }

        public Criteria andTprWastetimeNotIn(List<BigDecimal> values) {
            addCriterion("tpr_WasteTime not in", values, "tprWastetime");
            return (Criteria) this;
        }

        public Criteria andTprWastetimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tpr_WasteTime between", value1, value2, "tprWastetime");
            return (Criteria) this;
        }

        public Criteria andTprWastetimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tpr_WasteTime not between", value1, value2, "tprWastetime");
            return (Criteria) this;
        }

        public Criteria andTprDirectnoIsNull() {
            addCriterion("tpr_DirectNo is null");
            return (Criteria) this;
        }

        public Criteria andTprDirectnoIsNotNull() {
            addCriterion("tpr_DirectNo is not null");
            return (Criteria) this;
        }

        public Criteria andTprDirectnoEqualTo(String value) {
            addCriterion("tpr_DirectNo =", value, "tprDirectno");
            return (Criteria) this;
        }

        public Criteria andTprDirectnoNotEqualTo(String value) {
            addCriterion("tpr_DirectNo <>", value, "tprDirectno");
            return (Criteria) this;
        }

        public Criteria andTprDirectnoGreaterThan(String value) {
            addCriterion("tpr_DirectNo >", value, "tprDirectno");
            return (Criteria) this;
        }

        public Criteria andTprDirectnoGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_DirectNo >=", value, "tprDirectno");
            return (Criteria) this;
        }

        public Criteria andTprDirectnoLessThan(String value) {
            addCriterion("tpr_DirectNo <", value, "tprDirectno");
            return (Criteria) this;
        }

        public Criteria andTprDirectnoLessThanOrEqualTo(String value) {
            addCriterion("tpr_DirectNo <=", value, "tprDirectno");
            return (Criteria) this;
        }

        public Criteria andTprDirectnoLike(String value) {
            addCriterion("tpr_DirectNo like", value, "tprDirectno");
            return (Criteria) this;
        }

        public Criteria andTprDirectnoNotLike(String value) {
            addCriterion("tpr_DirectNo not like", value, "tprDirectno");
            return (Criteria) this;
        }

        public Criteria andTprDirectnoIn(List<String> values) {
            addCriterion("tpr_DirectNo in", values, "tprDirectno");
            return (Criteria) this;
        }

        public Criteria andTprDirectnoNotIn(List<String> values) {
            addCriterion("tpr_DirectNo not in", values, "tprDirectno");
            return (Criteria) this;
        }

        public Criteria andTprDirectnoBetween(String value1, String value2) {
            addCriterion("tpr_DirectNo between", value1, value2, "tprDirectno");
            return (Criteria) this;
        }

        public Criteria andTprDirectnoNotBetween(String value1, String value2) {
            addCriterion("tpr_DirectNo not between", value1, value2, "tprDirectno");
            return (Criteria) this;
        }

        public Criteria andTprParentrecordnoIsNull() {
            addCriterion("tpr_ParentRecordNo is null");
            return (Criteria) this;
        }

        public Criteria andTprParentrecordnoIsNotNull() {
            addCriterion("tpr_ParentRecordNo is not null");
            return (Criteria) this;
        }

        public Criteria andTprParentrecordnoEqualTo(String value) {
            addCriterion("tpr_ParentRecordNo =", value, "tprParentrecordno");
            return (Criteria) this;
        }

        public Criteria andTprParentrecordnoNotEqualTo(String value) {
            addCriterion("tpr_ParentRecordNo <>", value, "tprParentrecordno");
            return (Criteria) this;
        }

        public Criteria andTprParentrecordnoGreaterThan(String value) {
            addCriterion("tpr_ParentRecordNo >", value, "tprParentrecordno");
            return (Criteria) this;
        }

        public Criteria andTprParentrecordnoGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_ParentRecordNo >=", value, "tprParentrecordno");
            return (Criteria) this;
        }

        public Criteria andTprParentrecordnoLessThan(String value) {
            addCriterion("tpr_ParentRecordNo <", value, "tprParentrecordno");
            return (Criteria) this;
        }

        public Criteria andTprParentrecordnoLessThanOrEqualTo(String value) {
            addCriterion("tpr_ParentRecordNo <=", value, "tprParentrecordno");
            return (Criteria) this;
        }

        public Criteria andTprParentrecordnoLike(String value) {
            addCriterion("tpr_ParentRecordNo like", value, "tprParentrecordno");
            return (Criteria) this;
        }

        public Criteria andTprParentrecordnoNotLike(String value) {
            addCriterion("tpr_ParentRecordNo not like", value, "tprParentrecordno");
            return (Criteria) this;
        }

        public Criteria andTprParentrecordnoIn(List<String> values) {
            addCriterion("tpr_ParentRecordNo in", values, "tprParentrecordno");
            return (Criteria) this;
        }

        public Criteria andTprParentrecordnoNotIn(List<String> values) {
            addCriterion("tpr_ParentRecordNo not in", values, "tprParentrecordno");
            return (Criteria) this;
        }

        public Criteria andTprParentrecordnoBetween(String value1, String value2) {
            addCriterion("tpr_ParentRecordNo between", value1, value2, "tprParentrecordno");
            return (Criteria) this;
        }

        public Criteria andTprParentrecordnoNotBetween(String value1, String value2) {
            addCriterion("tpr_ParentRecordNo not between", value1, value2, "tprParentrecordno");
            return (Criteria) this;
        }

        public Criteria andTprRecordtypeIsNull() {
            addCriterion("tpr_RecordType is null");
            return (Criteria) this;
        }

        public Criteria andTprRecordtypeIsNotNull() {
            addCriterion("tpr_RecordType is not null");
            return (Criteria) this;
        }

        public Criteria andTprRecordtypeEqualTo(Integer value) {
            addCriterion("tpr_RecordType =", value, "tprRecordtype");
            return (Criteria) this;
        }

        public Criteria andTprRecordtypeNotEqualTo(Integer value) {
            addCriterion("tpr_RecordType <>", value, "tprRecordtype");
            return (Criteria) this;
        }

        public Criteria andTprRecordtypeGreaterThan(Integer value) {
            addCriterion("tpr_RecordType >", value, "tprRecordtype");
            return (Criteria) this;
        }

        public Criteria andTprRecordtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tpr_RecordType >=", value, "tprRecordtype");
            return (Criteria) this;
        }

        public Criteria andTprRecordtypeLessThan(Integer value) {
            addCriterion("tpr_RecordType <", value, "tprRecordtype");
            return (Criteria) this;
        }

        public Criteria andTprRecordtypeLessThanOrEqualTo(Integer value) {
            addCriterion("tpr_RecordType <=", value, "tprRecordtype");
            return (Criteria) this;
        }

        public Criteria andTprRecordtypeIn(List<Integer> values) {
            addCriterion("tpr_RecordType in", values, "tprRecordtype");
            return (Criteria) this;
        }

        public Criteria andTprRecordtypeNotIn(List<Integer> values) {
            addCriterion("tpr_RecordType not in", values, "tprRecordtype");
            return (Criteria) this;
        }

        public Criteria andTprRecordtypeBetween(Integer value1, Integer value2) {
            addCriterion("tpr_RecordType between", value1, value2, "tprRecordtype");
            return (Criteria) this;
        }

        public Criteria andTprRecordtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("tpr_RecordType not between", value1, value2, "tprRecordtype");
            return (Criteria) this;
        }

        public Criteria andTprAssemblypartIsNull() {
            addCriterion("tpr_AssemblyPart is null");
            return (Criteria) this;
        }

        public Criteria andTprAssemblypartIsNotNull() {
            addCriterion("tpr_AssemblyPart is not null");
            return (Criteria) this;
        }

        public Criteria andTprAssemblypartEqualTo(String value) {
            addCriterion("tpr_AssemblyPart =", value, "tprAssemblypart");
            return (Criteria) this;
        }

        public Criteria andTprAssemblypartNotEqualTo(String value) {
            addCriterion("tpr_AssemblyPart <>", value, "tprAssemblypart");
            return (Criteria) this;
        }

        public Criteria andTprAssemblypartGreaterThan(String value) {
            addCriterion("tpr_AssemblyPart >", value, "tprAssemblypart");
            return (Criteria) this;
        }

        public Criteria andTprAssemblypartGreaterThanOrEqualTo(String value) {
            addCriterion("tpr_AssemblyPart >=", value, "tprAssemblypart");
            return (Criteria) this;
        }

        public Criteria andTprAssemblypartLessThan(String value) {
            addCriterion("tpr_AssemblyPart <", value, "tprAssemblypart");
            return (Criteria) this;
        }

        public Criteria andTprAssemblypartLessThanOrEqualTo(String value) {
            addCriterion("tpr_AssemblyPart <=", value, "tprAssemblypart");
            return (Criteria) this;
        }

        public Criteria andTprAssemblypartLike(String value) {
            addCriterion("tpr_AssemblyPart like", value, "tprAssemblypart");
            return (Criteria) this;
        }

        public Criteria andTprAssemblypartNotLike(String value) {
            addCriterion("tpr_AssemblyPart not like", value, "tprAssemblypart");
            return (Criteria) this;
        }

        public Criteria andTprAssemblypartIn(List<String> values) {
            addCriterion("tpr_AssemblyPart in", values, "tprAssemblypart");
            return (Criteria) this;
        }

        public Criteria andTprAssemblypartNotIn(List<String> values) {
            addCriterion("tpr_AssemblyPart not in", values, "tprAssemblypart");
            return (Criteria) this;
        }

        public Criteria andTprAssemblypartBetween(String value1, String value2) {
            addCriterion("tpr_AssemblyPart between", value1, value2, "tprAssemblypart");
            return (Criteria) this;
        }

        public Criteria andTprAssemblypartNotBetween(String value1, String value2) {
            addCriterion("tpr_AssemblyPart not between", value1, value2, "tprAssemblypart");
            return (Criteria) this;
        }

        public Criteria andTprDutyobjecttypeIsNull() {
            addCriterion("tpr_DutyObjectType is null");
            return (Criteria) this;
        }

        public Criteria andTprDutyobjecttypeIsNotNull() {
            addCriterion("tpr_DutyObjectType is not null");
            return (Criteria) this;
        }

        public Criteria andTprDutyobjecttypeEqualTo(Integer value) {
            addCriterion("tpr_DutyObjectType =", value, "tprDutyobjecttype");
            return (Criteria) this;
        }

        public Criteria andTprDutyobjecttypeNotEqualTo(Integer value) {
            addCriterion("tpr_DutyObjectType <>", value, "tprDutyobjecttype");
            return (Criteria) this;
        }

        public Criteria andTprDutyobjecttypeGreaterThan(Integer value) {
            addCriterion("tpr_DutyObjectType >", value, "tprDutyobjecttype");
            return (Criteria) this;
        }

        public Criteria andTprDutyobjecttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tpr_DutyObjectType >=", value, "tprDutyobjecttype");
            return (Criteria) this;
        }

        public Criteria andTprDutyobjecttypeLessThan(Integer value) {
            addCriterion("tpr_DutyObjectType <", value, "tprDutyobjecttype");
            return (Criteria) this;
        }

        public Criteria andTprDutyobjecttypeLessThanOrEqualTo(Integer value) {
            addCriterion("tpr_DutyObjectType <=", value, "tprDutyobjecttype");
            return (Criteria) this;
        }

        public Criteria andTprDutyobjecttypeIn(List<Integer> values) {
            addCriterion("tpr_DutyObjectType in", values, "tprDutyobjecttype");
            return (Criteria) this;
        }

        public Criteria andTprDutyobjecttypeNotIn(List<Integer> values) {
            addCriterion("tpr_DutyObjectType not in", values, "tprDutyobjecttype");
            return (Criteria) this;
        }

        public Criteria andTprDutyobjecttypeBetween(Integer value1, Integer value2) {
            addCriterion("tpr_DutyObjectType between", value1, value2, "tprDutyobjecttype");
            return (Criteria) this;
        }

        public Criteria andTprDutyobjecttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("tpr_DutyObjectType not between", value1, value2, "tprDutyobjecttype");
            return (Criteria) this;
        }

        public Criteria andTprUnitcostIsNull() {
            addCriterion("tpr_UnitCost is null");
            return (Criteria) this;
        }

        public Criteria andTprUnitcostIsNotNull() {
            addCriterion("tpr_UnitCost is not null");
            return (Criteria) this;
        }

        public Criteria andTprUnitcostEqualTo(BigDecimal value) {
            addCriterion("tpr_UnitCost =", value, "tprUnitcost");
            return (Criteria) this;
        }

        public Criteria andTprUnitcostNotEqualTo(BigDecimal value) {
            addCriterion("tpr_UnitCost <>", value, "tprUnitcost");
            return (Criteria) this;
        }

        public Criteria andTprUnitcostGreaterThan(BigDecimal value) {
            addCriterion("tpr_UnitCost >", value, "tprUnitcost");
            return (Criteria) this;
        }

        public Criteria andTprUnitcostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tpr_UnitCost >=", value, "tprUnitcost");
            return (Criteria) this;
        }

        public Criteria andTprUnitcostLessThan(BigDecimal value) {
            addCriterion("tpr_UnitCost <", value, "tprUnitcost");
            return (Criteria) this;
        }

        public Criteria andTprUnitcostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tpr_UnitCost <=", value, "tprUnitcost");
            return (Criteria) this;
        }

        public Criteria andTprUnitcostIn(List<BigDecimal> values) {
            addCriterion("tpr_UnitCost in", values, "tprUnitcost");
            return (Criteria) this;
        }

        public Criteria andTprUnitcostNotIn(List<BigDecimal> values) {
            addCriterion("tpr_UnitCost not in", values, "tprUnitcost");
            return (Criteria) this;
        }

        public Criteria andTprUnitcostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tpr_UnitCost between", value1, value2, "tprUnitcost");
            return (Criteria) this;
        }

        public Criteria andTprUnitcostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tpr_UnitCost not between", value1, value2, "tprUnitcost");
            return (Criteria) this;
        }

        public Criteria andTprLaborandmachinecostIsNull() {
            addCriterion("tpr_LaborAndMachineCost is null");
            return (Criteria) this;
        }

        public Criteria andTprLaborandmachinecostIsNotNull() {
            addCriterion("tpr_LaborAndMachineCost is not null");
            return (Criteria) this;
        }

        public Criteria andTprLaborandmachinecostEqualTo(BigDecimal value) {
            addCriterion("tpr_LaborAndMachineCost =", value, "tprLaborandmachinecost");
            return (Criteria) this;
        }

        public Criteria andTprLaborandmachinecostNotEqualTo(BigDecimal value) {
            addCriterion("tpr_LaborAndMachineCost <>", value, "tprLaborandmachinecost");
            return (Criteria) this;
        }

        public Criteria andTprLaborandmachinecostGreaterThan(BigDecimal value) {
            addCriterion("tpr_LaborAndMachineCost >", value, "tprLaborandmachinecost");
            return (Criteria) this;
        }

        public Criteria andTprLaborandmachinecostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tpr_LaborAndMachineCost >=", value, "tprLaborandmachinecost");
            return (Criteria) this;
        }

        public Criteria andTprLaborandmachinecostLessThan(BigDecimal value) {
            addCriterion("tpr_LaborAndMachineCost <", value, "tprLaborandmachinecost");
            return (Criteria) this;
        }

        public Criteria andTprLaborandmachinecostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tpr_LaborAndMachineCost <=", value, "tprLaborandmachinecost");
            return (Criteria) this;
        }

        public Criteria andTprLaborandmachinecostIn(List<BigDecimal> values) {
            addCriterion("tpr_LaborAndMachineCost in", values, "tprLaborandmachinecost");
            return (Criteria) this;
        }

        public Criteria andTprLaborandmachinecostNotIn(List<BigDecimal> values) {
            addCriterion("tpr_LaborAndMachineCost not in", values, "tprLaborandmachinecost");
            return (Criteria) this;
        }

        public Criteria andTprLaborandmachinecostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tpr_LaborAndMachineCost between", value1, value2, "tprLaborandmachinecost");
            return (Criteria) this;
        }

        public Criteria andTprLaborandmachinecostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tpr_LaborAndMachineCost not between", value1, value2, "tprLaborandmachinecost");
            return (Criteria) this;
        }

        public Criteria andIroRunTimeIsNull() {
            addCriterion("iro_run_time is null");
            return (Criteria) this;
        }

        public Criteria andIroRunTimeIsNotNull() {
            addCriterion("iro_run_time is not null");
            return (Criteria) this;
        }

        public Criteria andIroRunTimeEqualTo(BigDecimal value) {
            addCriterion("iro_run_time =", value, "iroRunTime");
            return (Criteria) this;
        }

        public Criteria andIroRunTimeNotEqualTo(BigDecimal value) {
            addCriterion("iro_run_time <>", value, "iroRunTime");
            return (Criteria) this;
        }

        public Criteria andIroRunTimeGreaterThan(BigDecimal value) {
            addCriterion("iro_run_time >", value, "iroRunTime");
            return (Criteria) this;
        }

        public Criteria andIroRunTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("iro_run_time >=", value, "iroRunTime");
            return (Criteria) this;
        }

        public Criteria andIroRunTimeLessThan(BigDecimal value) {
            addCriterion("iro_run_time <", value, "iroRunTime");
            return (Criteria) this;
        }

        public Criteria andIroRunTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("iro_run_time <=", value, "iroRunTime");
            return (Criteria) this;
        }

        public Criteria andIroRunTimeIn(List<BigDecimal> values) {
            addCriterion("iro_run_time in", values, "iroRunTime");
            return (Criteria) this;
        }

        public Criteria andIroRunTimeNotIn(List<BigDecimal> values) {
            addCriterion("iro_run_time not in", values, "iroRunTime");
            return (Criteria) this;
        }

        public Criteria andIroRunTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("iro_run_time between", value1, value2, "iroRunTime");
            return (Criteria) this;
        }

        public Criteria andIroRunTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("iro_run_time not between", value1, value2, "iroRunTime");
            return (Criteria) this;
        }

        public Criteria andIroCostTotIsNull() {
            addCriterion("iro_cost_tot is null");
            return (Criteria) this;
        }

        public Criteria andIroCostTotIsNotNull() {
            addCriterion("iro_cost_tot is not null");
            return (Criteria) this;
        }

        public Criteria andIroCostTotEqualTo(BigDecimal value) {
            addCriterion("iro_cost_tot =", value, "iroCostTot");
            return (Criteria) this;
        }

        public Criteria andIroCostTotNotEqualTo(BigDecimal value) {
            addCriterion("iro_cost_tot <>", value, "iroCostTot");
            return (Criteria) this;
        }

        public Criteria andIroCostTotGreaterThan(BigDecimal value) {
            addCriterion("iro_cost_tot >", value, "iroCostTot");
            return (Criteria) this;
        }

        public Criteria andIroCostTotGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("iro_cost_tot >=", value, "iroCostTot");
            return (Criteria) this;
        }

        public Criteria andIroCostTotLessThan(BigDecimal value) {
            addCriterion("iro_cost_tot <", value, "iroCostTot");
            return (Criteria) this;
        }

        public Criteria andIroCostTotLessThanOrEqualTo(BigDecimal value) {
            addCriterion("iro_cost_tot <=", value, "iroCostTot");
            return (Criteria) this;
        }

        public Criteria andIroCostTotIn(List<BigDecimal> values) {
            addCriterion("iro_cost_tot in", values, "iroCostTot");
            return (Criteria) this;
        }

        public Criteria andIroCostTotNotIn(List<BigDecimal> values) {
            addCriterion("iro_cost_tot not in", values, "iroCostTot");
            return (Criteria) this;
        }

        public Criteria andIroCostTotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("iro_cost_tot between", value1, value2, "iroCostTot");
            return (Criteria) this;
        }

        public Criteria andIroCostTotNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("iro_cost_tot not between", value1, value2, "iroCostTot");
            return (Criteria) this;
        }

        public Criteria andIroMtlLlIsNull() {
            addCriterion("iro_mtl_ll is null");
            return (Criteria) this;
        }

        public Criteria andIroMtlLlIsNotNull() {
            addCriterion("iro_mtl_ll is not null");
            return (Criteria) this;
        }

        public Criteria andIroMtlLlEqualTo(BigDecimal value) {
            addCriterion("iro_mtl_ll =", value, "iroMtlLl");
            return (Criteria) this;
        }

        public Criteria andIroMtlLlNotEqualTo(BigDecimal value) {
            addCriterion("iro_mtl_ll <>", value, "iroMtlLl");
            return (Criteria) this;
        }

        public Criteria andIroMtlLlGreaterThan(BigDecimal value) {
            addCriterion("iro_mtl_ll >", value, "iroMtlLl");
            return (Criteria) this;
        }

        public Criteria andIroMtlLlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("iro_mtl_ll >=", value, "iroMtlLl");
            return (Criteria) this;
        }

        public Criteria andIroMtlLlLessThan(BigDecimal value) {
            addCriterion("iro_mtl_ll <", value, "iroMtlLl");
            return (Criteria) this;
        }

        public Criteria andIroMtlLlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("iro_mtl_ll <=", value, "iroMtlLl");
            return (Criteria) this;
        }

        public Criteria andIroMtlLlIn(List<BigDecimal> values) {
            addCriterion("iro_mtl_ll in", values, "iroMtlLl");
            return (Criteria) this;
        }

        public Criteria andIroMtlLlNotIn(List<BigDecimal> values) {
            addCriterion("iro_mtl_ll not in", values, "iroMtlLl");
            return (Criteria) this;
        }

        public Criteria andIroMtlLlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("iro_mtl_ll between", value1, value2, "iroMtlLl");
            return (Criteria) this;
        }

        public Criteria andIroMtlLlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("iro_mtl_ll not between", value1, value2, "iroMtlLl");
            return (Criteria) this;
        }

        public Criteria andIroLbrLlIsNull() {
            addCriterion("iro_lbr_ll is null");
            return (Criteria) this;
        }

        public Criteria andIroLbrLlIsNotNull() {
            addCriterion("iro_lbr_ll is not null");
            return (Criteria) this;
        }

        public Criteria andIroLbrLlEqualTo(BigDecimal value) {
            addCriterion("iro_lbr_ll =", value, "iroLbrLl");
            return (Criteria) this;
        }

        public Criteria andIroLbrLlNotEqualTo(BigDecimal value) {
            addCriterion("iro_lbr_ll <>", value, "iroLbrLl");
            return (Criteria) this;
        }

        public Criteria andIroLbrLlGreaterThan(BigDecimal value) {
            addCriterion("iro_lbr_ll >", value, "iroLbrLl");
            return (Criteria) this;
        }

        public Criteria andIroLbrLlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("iro_lbr_ll >=", value, "iroLbrLl");
            return (Criteria) this;
        }

        public Criteria andIroLbrLlLessThan(BigDecimal value) {
            addCriterion("iro_lbr_ll <", value, "iroLbrLl");
            return (Criteria) this;
        }

        public Criteria andIroLbrLlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("iro_lbr_ll <=", value, "iroLbrLl");
            return (Criteria) this;
        }

        public Criteria andIroLbrLlIn(List<BigDecimal> values) {
            addCriterion("iro_lbr_ll in", values, "iroLbrLl");
            return (Criteria) this;
        }

        public Criteria andIroLbrLlNotIn(List<BigDecimal> values) {
            addCriterion("iro_lbr_ll not in", values, "iroLbrLl");
            return (Criteria) this;
        }

        public Criteria andIroLbrLlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("iro_lbr_ll between", value1, value2, "iroLbrLl");
            return (Criteria) this;
        }

        public Criteria andIroLbrLlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("iro_lbr_ll not between", value1, value2, "iroLbrLl");
            return (Criteria) this;
        }

        public Criteria andIroBdnLlIsNull() {
            addCriterion("iro_bdn_ll is null");
            return (Criteria) this;
        }

        public Criteria andIroBdnLlIsNotNull() {
            addCriterion("iro_bdn_ll is not null");
            return (Criteria) this;
        }

        public Criteria andIroBdnLlEqualTo(BigDecimal value) {
            addCriterion("iro_bdn_ll =", value, "iroBdnLl");
            return (Criteria) this;
        }

        public Criteria andIroBdnLlNotEqualTo(BigDecimal value) {
            addCriterion("iro_bdn_ll <>", value, "iroBdnLl");
            return (Criteria) this;
        }

        public Criteria andIroBdnLlGreaterThan(BigDecimal value) {
            addCriterion("iro_bdn_ll >", value, "iroBdnLl");
            return (Criteria) this;
        }

        public Criteria andIroBdnLlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("iro_bdn_ll >=", value, "iroBdnLl");
            return (Criteria) this;
        }

        public Criteria andIroBdnLlLessThan(BigDecimal value) {
            addCriterion("iro_bdn_ll <", value, "iroBdnLl");
            return (Criteria) this;
        }

        public Criteria andIroBdnLlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("iro_bdn_ll <=", value, "iroBdnLl");
            return (Criteria) this;
        }

        public Criteria andIroBdnLlIn(List<BigDecimal> values) {
            addCriterion("iro_bdn_ll in", values, "iroBdnLl");
            return (Criteria) this;
        }

        public Criteria andIroBdnLlNotIn(List<BigDecimal> values) {
            addCriterion("iro_bdn_ll not in", values, "iroBdnLl");
            return (Criteria) this;
        }

        public Criteria andIroBdnLlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("iro_bdn_ll between", value1, value2, "iroBdnLl");
            return (Criteria) this;
        }

        public Criteria andIroBdnLlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("iro_bdn_ll not between", value1, value2, "iroBdnLl");
            return (Criteria) this;
        }

        public Criteria andIroSubLlIsNull() {
            addCriterion("iro_sub_ll is null");
            return (Criteria) this;
        }

        public Criteria andIroSubLlIsNotNull() {
            addCriterion("iro_sub_ll is not null");
            return (Criteria) this;
        }

        public Criteria andIroSubLlEqualTo(BigDecimal value) {
            addCriterion("iro_sub_ll =", value, "iroSubLl");
            return (Criteria) this;
        }

        public Criteria andIroSubLlNotEqualTo(BigDecimal value) {
            addCriterion("iro_sub_ll <>", value, "iroSubLl");
            return (Criteria) this;
        }

        public Criteria andIroSubLlGreaterThan(BigDecimal value) {
            addCriterion("iro_sub_ll >", value, "iroSubLl");
            return (Criteria) this;
        }

        public Criteria andIroSubLlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("iro_sub_ll >=", value, "iroSubLl");
            return (Criteria) this;
        }

        public Criteria andIroSubLlLessThan(BigDecimal value) {
            addCriterion("iro_sub_ll <", value, "iroSubLl");
            return (Criteria) this;
        }

        public Criteria andIroSubLlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("iro_sub_ll <=", value, "iroSubLl");
            return (Criteria) this;
        }

        public Criteria andIroSubLlIn(List<BigDecimal> values) {
            addCriterion("iro_sub_ll in", values, "iroSubLl");
            return (Criteria) this;
        }

        public Criteria andIroSubLlNotIn(List<BigDecimal> values) {
            addCriterion("iro_sub_ll not in", values, "iroSubLl");
            return (Criteria) this;
        }

        public Criteria andIroSubLlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("iro_sub_ll between", value1, value2, "iroSubLl");
            return (Criteria) this;
        }

        public Criteria andIroSubLlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("iro_sub_ll not between", value1, value2, "iroSubLl");
            return (Criteria) this;
        }

        public Criteria andIroOvhLlIsNull() {
            addCriterion("iro_ovh_ll is null");
            return (Criteria) this;
        }

        public Criteria andIroOvhLlIsNotNull() {
            addCriterion("iro_ovh_ll is not null");
            return (Criteria) this;
        }

        public Criteria andIroOvhLlEqualTo(BigDecimal value) {
            addCriterion("iro_ovh_ll =", value, "iroOvhLl");
            return (Criteria) this;
        }

        public Criteria andIroOvhLlNotEqualTo(BigDecimal value) {
            addCriterion("iro_ovh_ll <>", value, "iroOvhLl");
            return (Criteria) this;
        }

        public Criteria andIroOvhLlGreaterThan(BigDecimal value) {
            addCriterion("iro_ovh_ll >", value, "iroOvhLl");
            return (Criteria) this;
        }

        public Criteria andIroOvhLlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("iro_ovh_ll >=", value, "iroOvhLl");
            return (Criteria) this;
        }

        public Criteria andIroOvhLlLessThan(BigDecimal value) {
            addCriterion("iro_ovh_ll <", value, "iroOvhLl");
            return (Criteria) this;
        }

        public Criteria andIroOvhLlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("iro_ovh_ll <=", value, "iroOvhLl");
            return (Criteria) this;
        }

        public Criteria andIroOvhLlIn(List<BigDecimal> values) {
            addCriterion("iro_ovh_ll in", values, "iroOvhLl");
            return (Criteria) this;
        }

        public Criteria andIroOvhLlNotIn(List<BigDecimal> values) {
            addCriterion("iro_ovh_ll not in", values, "iroOvhLl");
            return (Criteria) this;
        }

        public Criteria andIroOvhLlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("iro_ovh_ll between", value1, value2, "iroOvhLl");
            return (Criteria) this;
        }

        public Criteria andIroOvhLlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("iro_ovh_ll not between", value1, value2, "iroOvhLl");
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