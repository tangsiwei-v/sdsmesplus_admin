package com.uspring.sdsmesplus.entity.po;

import java.util.ArrayList;
import java.util.List;

public class PlanOpBomPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlanOpBomPOExample() {
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

        public Criteria andPlbmIdIsNull() {
            addCriterion("plbm_id is null");
            return (Criteria) this;
        }

        public Criteria andPlbmIdIsNotNull() {
            addCriterion("plbm_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlbmIdEqualTo(Integer value) {
            addCriterion("plbm_id =", value, "plbmId");
            return (Criteria) this;
        }

        public Criteria andPlbmIdNotEqualTo(Integer value) {
            addCriterion("plbm_id <>", value, "plbmId");
            return (Criteria) this;
        }

        public Criteria andPlbmIdGreaterThan(Integer value) {
            addCriterion("plbm_id >", value, "plbmId");
            return (Criteria) this;
        }

        public Criteria andPlbmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("plbm_id >=", value, "plbmId");
            return (Criteria) this;
        }

        public Criteria andPlbmIdLessThan(Integer value) {
            addCriterion("plbm_id <", value, "plbmId");
            return (Criteria) this;
        }

        public Criteria andPlbmIdLessThanOrEqualTo(Integer value) {
            addCriterion("plbm_id <=", value, "plbmId");
            return (Criteria) this;
        }

        public Criteria andPlbmIdIn(List<Integer> values) {
            addCriterion("plbm_id in", values, "plbmId");
            return (Criteria) this;
        }

        public Criteria andPlbmIdNotIn(List<Integer> values) {
            addCriterion("plbm_id not in", values, "plbmId");
            return (Criteria) this;
        }

        public Criteria andPlbmIdBetween(Integer value1, Integer value2) {
            addCriterion("plbm_id between", value1, value2, "plbmId");
            return (Criteria) this;
        }

        public Criteria andPlbmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("plbm_id not between", value1, value2, "plbmId");
            return (Criteria) this;
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

        public Criteria andMaterialPosnrIsNull() {
            addCriterion("material_posnr is null");
            return (Criteria) this;
        }

        public Criteria andMaterialPosnrIsNotNull() {
            addCriterion("material_posnr is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialPosnrEqualTo(String value) {
            addCriterion("material_posnr =", value, "materialPosnr");
            return (Criteria) this;
        }

        public Criteria andMaterialPosnrNotEqualTo(String value) {
            addCriterion("material_posnr <>", value, "materialPosnr");
            return (Criteria) this;
        }

        public Criteria andMaterialPosnrGreaterThan(String value) {
            addCriterion("material_posnr >", value, "materialPosnr");
            return (Criteria) this;
        }

        public Criteria andMaterialPosnrGreaterThanOrEqualTo(String value) {
            addCriterion("material_posnr >=", value, "materialPosnr");
            return (Criteria) this;
        }

        public Criteria andMaterialPosnrLessThan(String value) {
            addCriterion("material_posnr <", value, "materialPosnr");
            return (Criteria) this;
        }

        public Criteria andMaterialPosnrLessThanOrEqualTo(String value) {
            addCriterion("material_posnr <=", value, "materialPosnr");
            return (Criteria) this;
        }

        public Criteria andMaterialPosnrLike(String value) {
            addCriterion("material_posnr like", value, "materialPosnr");
            return (Criteria) this;
        }

        public Criteria andMaterialPosnrNotLike(String value) {
            addCriterion("material_posnr not like", value, "materialPosnr");
            return (Criteria) this;
        }

        public Criteria andMaterialPosnrIn(List<String> values) {
            addCriterion("material_posnr in", values, "materialPosnr");
            return (Criteria) this;
        }

        public Criteria andMaterialPosnrNotIn(List<String> values) {
            addCriterion("material_posnr not in", values, "materialPosnr");
            return (Criteria) this;
        }

        public Criteria andMaterialPosnrBetween(String value1, String value2) {
            addCriterion("material_posnr between", value1, value2, "materialPosnr");
            return (Criteria) this;
        }

        public Criteria andMaterialPosnrNotBetween(String value1, String value2) {
            addCriterion("material_posnr not between", value1, value2, "materialPosnr");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeIsNull() {
            addCriterion("material_code is null");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeIsNotNull() {
            addCriterion("material_code is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeEqualTo(String value) {
            addCriterion("material_code =", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotEqualTo(String value) {
            addCriterion("material_code <>", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeGreaterThan(String value) {
            addCriterion("material_code >", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeGreaterThanOrEqualTo(String value) {
            addCriterion("material_code >=", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLessThan(String value) {
            addCriterion("material_code <", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLessThanOrEqualTo(String value) {
            addCriterion("material_code <=", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLike(String value) {
            addCriterion("material_code like", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotLike(String value) {
            addCriterion("material_code not like", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeIn(List<String> values) {
            addCriterion("material_code in", values, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotIn(List<String> values) {
            addCriterion("material_code not in", values, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeBetween(String value1, String value2) {
            addCriterion("material_code between", value1, value2, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotBetween(String value1, String value2) {
            addCriterion("material_code not between", value1, value2, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCountIsNull() {
            addCriterion("material_count is null");
            return (Criteria) this;
        }

        public Criteria andMaterialCountIsNotNull() {
            addCriterion("material_count is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialCountEqualTo(Integer value) {
            addCriterion("material_count =", value, "materialCount");
            return (Criteria) this;
        }

        public Criteria andMaterialCountNotEqualTo(Integer value) {
            addCriterion("material_count <>", value, "materialCount");
            return (Criteria) this;
        }

        public Criteria andMaterialCountGreaterThan(Integer value) {
            addCriterion("material_count >", value, "materialCount");
            return (Criteria) this;
        }

        public Criteria andMaterialCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("material_count >=", value, "materialCount");
            return (Criteria) this;
        }

        public Criteria andMaterialCountLessThan(Integer value) {
            addCriterion("material_count <", value, "materialCount");
            return (Criteria) this;
        }

        public Criteria andMaterialCountLessThanOrEqualTo(Integer value) {
            addCriterion("material_count <=", value, "materialCount");
            return (Criteria) this;
        }

        public Criteria andMaterialCountIn(List<Integer> values) {
            addCriterion("material_count in", values, "materialCount");
            return (Criteria) this;
        }

        public Criteria andMaterialCountNotIn(List<Integer> values) {
            addCriterion("material_count not in", values, "materialCount");
            return (Criteria) this;
        }

        public Criteria andMaterialCountBetween(Integer value1, Integer value2) {
            addCriterion("material_count between", value1, value2, "materialCount");
            return (Criteria) this;
        }

        public Criteria andMaterialCountNotBetween(Integer value1, Integer value2) {
            addCriterion("material_count not between", value1, value2, "materialCount");
            return (Criteria) this;
        }

        public Criteria andMaterialUnitIsNull() {
            addCriterion("material_unit is null");
            return (Criteria) this;
        }

        public Criteria andMaterialUnitIsNotNull() {
            addCriterion("material_unit is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialUnitEqualTo(String value) {
            addCriterion("material_unit =", value, "materialUnit");
            return (Criteria) this;
        }

        public Criteria andMaterialUnitNotEqualTo(String value) {
            addCriterion("material_unit <>", value, "materialUnit");
            return (Criteria) this;
        }

        public Criteria andMaterialUnitGreaterThan(String value) {
            addCriterion("material_unit >", value, "materialUnit");
            return (Criteria) this;
        }

        public Criteria andMaterialUnitGreaterThanOrEqualTo(String value) {
            addCriterion("material_unit >=", value, "materialUnit");
            return (Criteria) this;
        }

        public Criteria andMaterialUnitLessThan(String value) {
            addCriterion("material_unit <", value, "materialUnit");
            return (Criteria) this;
        }

        public Criteria andMaterialUnitLessThanOrEqualTo(String value) {
            addCriterion("material_unit <=", value, "materialUnit");
            return (Criteria) this;
        }

        public Criteria andMaterialUnitLike(String value) {
            addCriterion("material_unit like", value, "materialUnit");
            return (Criteria) this;
        }

        public Criteria andMaterialUnitNotLike(String value) {
            addCriterion("material_unit not like", value, "materialUnit");
            return (Criteria) this;
        }

        public Criteria andMaterialUnitIn(List<String> values) {
            addCriterion("material_unit in", values, "materialUnit");
            return (Criteria) this;
        }

        public Criteria andMaterialUnitNotIn(List<String> values) {
            addCriterion("material_unit not in", values, "materialUnit");
            return (Criteria) this;
        }

        public Criteria andMaterialUnitBetween(String value1, String value2) {
            addCriterion("material_unit between", value1, value2, "materialUnit");
            return (Criteria) this;
        }

        public Criteria andMaterialUnitNotBetween(String value1, String value2) {
            addCriterion("material_unit not between", value1, value2, "materialUnit");
            return (Criteria) this;
        }

        public Criteria andMaterialStlocIsNull() {
            addCriterion("material_stloc is null");
            return (Criteria) this;
        }

        public Criteria andMaterialStlocIsNotNull() {
            addCriterion("material_stloc is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialStlocEqualTo(String value) {
            addCriterion("material_stloc =", value, "materialStloc");
            return (Criteria) this;
        }

        public Criteria andMaterialStlocNotEqualTo(String value) {
            addCriterion("material_stloc <>", value, "materialStloc");
            return (Criteria) this;
        }

        public Criteria andMaterialStlocGreaterThan(String value) {
            addCriterion("material_stloc >", value, "materialStloc");
            return (Criteria) this;
        }

        public Criteria andMaterialStlocGreaterThanOrEqualTo(String value) {
            addCriterion("material_stloc >=", value, "materialStloc");
            return (Criteria) this;
        }

        public Criteria andMaterialStlocLessThan(String value) {
            addCriterion("material_stloc <", value, "materialStloc");
            return (Criteria) this;
        }

        public Criteria andMaterialStlocLessThanOrEqualTo(String value) {
            addCriterion("material_stloc <=", value, "materialStloc");
            return (Criteria) this;
        }

        public Criteria andMaterialStlocLike(String value) {
            addCriterion("material_stloc like", value, "materialStloc");
            return (Criteria) this;
        }

        public Criteria andMaterialStlocNotLike(String value) {
            addCriterion("material_stloc not like", value, "materialStloc");
            return (Criteria) this;
        }

        public Criteria andMaterialStlocIn(List<String> values) {
            addCriterion("material_stloc in", values, "materialStloc");
            return (Criteria) this;
        }

        public Criteria andMaterialStlocNotIn(List<String> values) {
            addCriterion("material_stloc not in", values, "materialStloc");
            return (Criteria) this;
        }

        public Criteria andMaterialStlocBetween(String value1, String value2) {
            addCriterion("material_stloc between", value1, value2, "materialStloc");
            return (Criteria) this;
        }

        public Criteria andMaterialStlocNotBetween(String value1, String value2) {
            addCriterion("material_stloc not between", value1, value2, "materialStloc");
            return (Criteria) this;
        }

        public Criteria andMaterialPsaIsNull() {
            addCriterion("material_psa is null");
            return (Criteria) this;
        }

        public Criteria andMaterialPsaIsNotNull() {
            addCriterion("material_psa is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialPsaEqualTo(String value) {
            addCriterion("material_psa =", value, "materialPsa");
            return (Criteria) this;
        }

        public Criteria andMaterialPsaNotEqualTo(String value) {
            addCriterion("material_psa <>", value, "materialPsa");
            return (Criteria) this;
        }

        public Criteria andMaterialPsaGreaterThan(String value) {
            addCriterion("material_psa >", value, "materialPsa");
            return (Criteria) this;
        }

        public Criteria andMaterialPsaGreaterThanOrEqualTo(String value) {
            addCriterion("material_psa >=", value, "materialPsa");
            return (Criteria) this;
        }

        public Criteria andMaterialPsaLessThan(String value) {
            addCriterion("material_psa <", value, "materialPsa");
            return (Criteria) this;
        }

        public Criteria andMaterialPsaLessThanOrEqualTo(String value) {
            addCriterion("material_psa <=", value, "materialPsa");
            return (Criteria) this;
        }

        public Criteria andMaterialPsaLike(String value) {
            addCriterion("material_psa like", value, "materialPsa");
            return (Criteria) this;
        }

        public Criteria andMaterialPsaNotLike(String value) {
            addCriterion("material_psa not like", value, "materialPsa");
            return (Criteria) this;
        }

        public Criteria andMaterialPsaIn(List<String> values) {
            addCriterion("material_psa in", values, "materialPsa");
            return (Criteria) this;
        }

        public Criteria andMaterialPsaNotIn(List<String> values) {
            addCriterion("material_psa not in", values, "materialPsa");
            return (Criteria) this;
        }

        public Criteria andMaterialPsaBetween(String value1, String value2) {
            addCriterion("material_psa between", value1, value2, "materialPsa");
            return (Criteria) this;
        }

        public Criteria andMaterialPsaNotBetween(String value1, String value2) {
            addCriterion("material_psa not between", value1, value2, "materialPsa");
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