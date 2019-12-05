package com.uspring.sdsmesplus.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysProdPdfPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysProdPdfPOExample() {
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

        public Criteria andSppIdIsNull() {
            addCriterion("spp_id is null");
            return (Criteria) this;
        }

        public Criteria andSppIdIsNotNull() {
            addCriterion("spp_id is not null");
            return (Criteria) this;
        }

        public Criteria andSppIdEqualTo(Integer value) {
            addCriterion("spp_id =", value, "sppId");
            return (Criteria) this;
        }

        public Criteria andSppIdNotEqualTo(Integer value) {
            addCriterion("spp_id <>", value, "sppId");
            return (Criteria) this;
        }

        public Criteria andSppIdGreaterThan(Integer value) {
            addCriterion("spp_id >", value, "sppId");
            return (Criteria) this;
        }

        public Criteria andSppIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("spp_id >=", value, "sppId");
            return (Criteria) this;
        }

        public Criteria andSppIdLessThan(Integer value) {
            addCriterion("spp_id <", value, "sppId");
            return (Criteria) this;
        }

        public Criteria andSppIdLessThanOrEqualTo(Integer value) {
            addCriterion("spp_id <=", value, "sppId");
            return (Criteria) this;
        }

        public Criteria andSppIdIn(List<Integer> values) {
            addCriterion("spp_id in", values, "sppId");
            return (Criteria) this;
        }

        public Criteria andSppIdNotIn(List<Integer> values) {
            addCriterion("spp_id not in", values, "sppId");
            return (Criteria) this;
        }

        public Criteria andSppIdBetween(Integer value1, Integer value2) {
            addCriterion("spp_id between", value1, value2, "sppId");
            return (Criteria) this;
        }

        public Criteria andSppIdNotBetween(Integer value1, Integer value2) {
            addCriterion("spp_id not between", value1, value2, "sppId");
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

        public Criteria andPdfNameIsNull() {
            addCriterion("pdf_name is null");
            return (Criteria) this;
        }

        public Criteria andPdfNameIsNotNull() {
            addCriterion("pdf_name is not null");
            return (Criteria) this;
        }

        public Criteria andPdfNameEqualTo(String value) {
            addCriterion("pdf_name =", value, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfNameNotEqualTo(String value) {
            addCriterion("pdf_name <>", value, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfNameGreaterThan(String value) {
            addCriterion("pdf_name >", value, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfNameGreaterThanOrEqualTo(String value) {
            addCriterion("pdf_name >=", value, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfNameLessThan(String value) {
            addCriterion("pdf_name <", value, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfNameLessThanOrEqualTo(String value) {
            addCriterion("pdf_name <=", value, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfNameLike(String value) {
            addCriterion("pdf_name like", value, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfNameNotLike(String value) {
            addCriterion("pdf_name not like", value, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfNameIn(List<String> values) {
            addCriterion("pdf_name in", values, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfNameNotIn(List<String> values) {
            addCriterion("pdf_name not in", values, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfNameBetween(String value1, String value2) {
            addCriterion("pdf_name between", value1, value2, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfNameNotBetween(String value1, String value2) {
            addCriterion("pdf_name not between", value1, value2, "pdfName");
            return (Criteria) this;
        }

        public Criteria andPdfContentIsNull() {
            addCriterion("pdf_content is null");
            return (Criteria) this;
        }

        public Criteria andPdfContentIsNotNull() {
            addCriterion("pdf_content is not null");
            return (Criteria) this;
        }

        public Criteria andPdfContentEqualTo(String value) {
            addCriterion("pdf_content =", value, "pdfContent");
            return (Criteria) this;
        }

        public Criteria andPdfContentNotEqualTo(String value) {
            addCriterion("pdf_content <>", value, "pdfContent");
            return (Criteria) this;
        }

        public Criteria andPdfContentGreaterThan(String value) {
            addCriterion("pdf_content >", value, "pdfContent");
            return (Criteria) this;
        }

        public Criteria andPdfContentGreaterThanOrEqualTo(String value) {
            addCriterion("pdf_content >=", value, "pdfContent");
            return (Criteria) this;
        }

        public Criteria andPdfContentLessThan(String value) {
            addCriterion("pdf_content <", value, "pdfContent");
            return (Criteria) this;
        }

        public Criteria andPdfContentLessThanOrEqualTo(String value) {
            addCriterion("pdf_content <=", value, "pdfContent");
            return (Criteria) this;
        }

        public Criteria andPdfContentLike(String value) {
            addCriterion("pdf_content like", value, "pdfContent");
            return (Criteria) this;
        }

        public Criteria andPdfContentNotLike(String value) {
            addCriterion("pdf_content not like", value, "pdfContent");
            return (Criteria) this;
        }

        public Criteria andPdfContentIn(List<String> values) {
            addCriterion("pdf_content in", values, "pdfContent");
            return (Criteria) this;
        }

        public Criteria andPdfContentNotIn(List<String> values) {
            addCriterion("pdf_content not in", values, "pdfContent");
            return (Criteria) this;
        }

        public Criteria andPdfContentBetween(String value1, String value2) {
            addCriterion("pdf_content between", value1, value2, "pdfContent");
            return (Criteria) this;
        }

        public Criteria andPdfContentNotBetween(String value1, String value2) {
            addCriterion("pdf_content not between", value1, value2, "pdfContent");
            return (Criteria) this;
        }

        public Criteria andPdfUrlIsNull() {
            addCriterion("pdf_url is null");
            return (Criteria) this;
        }

        public Criteria andPdfUrlIsNotNull() {
            addCriterion("pdf_url is not null");
            return (Criteria) this;
        }

        public Criteria andPdfUrlEqualTo(String value) {
            addCriterion("pdf_url =", value, "pdfUrl");
            return (Criteria) this;
        }

        public Criteria andPdfUrlNotEqualTo(String value) {
            addCriterion("pdf_url <>", value, "pdfUrl");
            return (Criteria) this;
        }

        public Criteria andPdfUrlGreaterThan(String value) {
            addCriterion("pdf_url >", value, "pdfUrl");
            return (Criteria) this;
        }

        public Criteria andPdfUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pdf_url >=", value, "pdfUrl");
            return (Criteria) this;
        }

        public Criteria andPdfUrlLessThan(String value) {
            addCriterion("pdf_url <", value, "pdfUrl");
            return (Criteria) this;
        }

        public Criteria andPdfUrlLessThanOrEqualTo(String value) {
            addCriterion("pdf_url <=", value, "pdfUrl");
            return (Criteria) this;
        }

        public Criteria andPdfUrlLike(String value) {
            addCriterion("pdf_url like", value, "pdfUrl");
            return (Criteria) this;
        }

        public Criteria andPdfUrlNotLike(String value) {
            addCriterion("pdf_url not like", value, "pdfUrl");
            return (Criteria) this;
        }

        public Criteria andPdfUrlIn(List<String> values) {
            addCriterion("pdf_url in", values, "pdfUrl");
            return (Criteria) this;
        }

        public Criteria andPdfUrlNotIn(List<String> values) {
            addCriterion("pdf_url not in", values, "pdfUrl");
            return (Criteria) this;
        }

        public Criteria andPdfUrlBetween(String value1, String value2) {
            addCriterion("pdf_url between", value1, value2, "pdfUrl");
            return (Criteria) this;
        }

        public Criteria andPdfUrlNotBetween(String value1, String value2) {
            addCriterion("pdf_url not between", value1, value2, "pdfUrl");
            return (Criteria) this;
        }

        public Criteria andPdfLastpageIsNull() {
            addCriterion("pdf_lastpage is null");
            return (Criteria) this;
        }

        public Criteria andPdfLastpageIsNotNull() {
            addCriterion("pdf_lastpage is not null");
            return (Criteria) this;
        }

        public Criteria andPdfLastpageEqualTo(Integer value) {
            addCriterion("pdf_lastpage =", value, "pdfLastpage");
            return (Criteria) this;
        }

        public Criteria andPdfLastpageNotEqualTo(Integer value) {
            addCriterion("pdf_lastpage <>", value, "pdfLastpage");
            return (Criteria) this;
        }

        public Criteria andPdfLastpageGreaterThan(Integer value) {
            addCriterion("pdf_lastpage >", value, "pdfLastpage");
            return (Criteria) this;
        }

        public Criteria andPdfLastpageGreaterThanOrEqualTo(Integer value) {
            addCriterion("pdf_lastpage >=", value, "pdfLastpage");
            return (Criteria) this;
        }

        public Criteria andPdfLastpageLessThan(Integer value) {
            addCriterion("pdf_lastpage <", value, "pdfLastpage");
            return (Criteria) this;
        }

        public Criteria andPdfLastpageLessThanOrEqualTo(Integer value) {
            addCriterion("pdf_lastpage <=", value, "pdfLastpage");
            return (Criteria) this;
        }

        public Criteria andPdfLastpageIn(List<Integer> values) {
            addCriterion("pdf_lastpage in", values, "pdfLastpage");
            return (Criteria) this;
        }

        public Criteria andPdfLastpageNotIn(List<Integer> values) {
            addCriterion("pdf_lastpage not in", values, "pdfLastpage");
            return (Criteria) this;
        }

        public Criteria andPdfLastpageBetween(Integer value1, Integer value2) {
            addCriterion("pdf_lastpage between", value1, value2, "pdfLastpage");
            return (Criteria) this;
        }

        public Criteria andPdfLastpageNotBetween(Integer value1, Integer value2) {
            addCriterion("pdf_lastpage not between", value1, value2, "pdfLastpage");
            return (Criteria) this;
        }

        public Criteria andPdfTypeIsNull() {
            addCriterion("pdf_type is null");
            return (Criteria) this;
        }

        public Criteria andPdfTypeIsNotNull() {
            addCriterion("pdf_type is not null");
            return (Criteria) this;
        }

        public Criteria andPdfTypeEqualTo(String value) {
            addCriterion("pdf_type =", value, "pdfType");
            return (Criteria) this;
        }

        public Criteria andPdfTypeNotEqualTo(String value) {
            addCriterion("pdf_type <>", value, "pdfType");
            return (Criteria) this;
        }

        public Criteria andPdfTypeGreaterThan(String value) {
            addCriterion("pdf_type >", value, "pdfType");
            return (Criteria) this;
        }

        public Criteria andPdfTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pdf_type >=", value, "pdfType");
            return (Criteria) this;
        }

        public Criteria andPdfTypeLessThan(String value) {
            addCriterion("pdf_type <", value, "pdfType");
            return (Criteria) this;
        }

        public Criteria andPdfTypeLessThanOrEqualTo(String value) {
            addCriterion("pdf_type <=", value, "pdfType");
            return (Criteria) this;
        }

        public Criteria andPdfTypeLike(String value) {
            addCriterion("pdf_type like", value, "pdfType");
            return (Criteria) this;
        }

        public Criteria andPdfTypeNotLike(String value) {
            addCriterion("pdf_type not like", value, "pdfType");
            return (Criteria) this;
        }

        public Criteria andPdfTypeIn(List<String> values) {
            addCriterion("pdf_type in", values, "pdfType");
            return (Criteria) this;
        }

        public Criteria andPdfTypeNotIn(List<String> values) {
            addCriterion("pdf_type not in", values, "pdfType");
            return (Criteria) this;
        }

        public Criteria andPdfTypeBetween(String value1, String value2) {
            addCriterion("pdf_type between", value1, value2, "pdfType");
            return (Criteria) this;
        }

        public Criteria andPdfTypeNotBetween(String value1, String value2) {
            addCriterion("pdf_type not between", value1, value2, "pdfType");
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