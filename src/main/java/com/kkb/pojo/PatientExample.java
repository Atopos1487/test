package com.kkb.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatientExample  {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatientExample() {
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

        public Criteria andP_idIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andP_idIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andP_idEqualTo(Integer value) {
            addCriterion("p_id =", value, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idNotEqualTo(Integer value) {
            addCriterion("p_id <>", value, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idGreaterThan(Integer value) {
            addCriterion("p_id >", value, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_id >=", value, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idLessThan(Integer value) {
            addCriterion("p_id <", value, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idLessThanOrEqualTo(Integer value) {
            addCriterion("p_id <=", value, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idIn(List<Integer> values) {
            addCriterion("p_id in", values, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idNotIn(List<Integer> values) {
            addCriterion("p_id not in", values, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idBetween(Integer value1, Integer value2) {
            addCriterion("p_id between", value1, value2, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_idNotBetween(Integer value1, Integer value2) {
            addCriterion("p_id not between", value1, value2, "p_id");
            return (Criteria) this;
        }

        public Criteria andP_nameIsNull() {
            addCriterion("p_name is null");
            return (Criteria) this;
        }

        public Criteria andP_nameIsNotNull() {
            addCriterion("p_name is not null");
            return (Criteria) this;
        }

        public Criteria andP_nameEqualTo(String value) {
            addCriterion("p_name =", value, "p_name");
            return (Criteria) this;
        }

        public Criteria andP_nameNotEqualTo(String value) {
            addCriterion("p_name <>", value, "p_name");
            return (Criteria) this;
        }

        public Criteria andP_nameGreaterThan(String value) {
            addCriterion("p_name >", value, "p_name");
            return (Criteria) this;
        }

        public Criteria andP_nameGreaterThanOrEqualTo(String value) {
            addCriterion("p_name >=", value, "p_name");
            return (Criteria) this;
        }

        public Criteria andP_nameLessThan(String value) {
            addCriterion("p_name <", value, "p_name");
            return (Criteria) this;
        }

        public Criteria andP_nameLessThanOrEqualTo(String value) {
            addCriterion("p_name <=", value, "p_name");
            return (Criteria) this;
        }

        public Criteria andP_nameLike(String value) {
            addCriterion("p_name like", value, "p_name");
            return (Criteria) this;
        }

        public Criteria andP_nameNotLike(String value) {
            addCriterion("p_name not like", value, "p_name");
            return (Criteria) this;
        }

        public Criteria andP_nameIn(List<String> values) {
            addCriterion("p_name in", values, "p_name");
            return (Criteria) this;
        }

        public Criteria andP_nameNotIn(List<String> values) {
            addCriterion("p_name not in", values, "p_name");
            return (Criteria) this;
        }

        public Criteria andP_nameBetween(String value1, String value2) {
            addCriterion("p_name between", value1, value2, "p_name");
            return (Criteria) this;
        }

        public Criteria andP_nameNotBetween(String value1, String value2) {
            addCriterion("p_name not between", value1, value2, "p_name");
            return (Criteria) this;
        }

        public Criteria andStewardIsNull() {
            addCriterion("steward is null");
            return (Criteria) this;
        }

        public Criteria andStewardIsNotNull() {
            addCriterion("steward is not null");
            return (Criteria) this;
        }

        public Criteria andStewardEqualTo(String value) {
            addCriterion("steward =", value, "steward");
            return (Criteria) this;
        }

        public Criteria andStewardNotEqualTo(String value) {
            addCriterion("steward <>", value, "steward");
            return (Criteria) this;
        }

        public Criteria andStewardGreaterThan(String value) {
            addCriterion("steward >", value, "steward");
            return (Criteria) this;
        }

        public Criteria andStewardGreaterThanOrEqualTo(String value) {
            addCriterion("steward >=", value, "steward");
            return (Criteria) this;
        }

        public Criteria andStewardLessThan(String value) {
            addCriterion("steward <", value, "steward");
            return (Criteria) this;
        }

        public Criteria andStewardLessThanOrEqualTo(String value) {
            addCriterion("steward <=", value, "steward");
            return (Criteria) this;
        }

        public Criteria andStewardLike(String value) {
            addCriterion("steward like", value, "steward");
            return (Criteria) this;
        }

        public Criteria andStewardNotLike(String value) {
            addCriterion("steward not like", value, "steward");
            return (Criteria) this;
        }

        public Criteria andStewardIn(List<String> values) {
            addCriterion("steward in", values, "steward");
            return (Criteria) this;
        }

        public Criteria andStewardNotIn(List<String> values) {
            addCriterion("steward not in", values, "steward");
            return (Criteria) this;
        }

        public Criteria andStewardBetween(String value1, String value2) {
            addCriterion("steward between", value1, value2, "steward");
            return (Criteria) this;
        }

        public Criteria andStewardNotBetween(String value1, String value2) {
            addCriterion("steward not between", value1, value2, "steward");
            return (Criteria) this;
        }

        public Criteria andP_dateIsNull() {
            addCriterion("p_date is null");
            return (Criteria) this;
        }

        public Criteria andP_dateIsNotNull() {
            addCriterion("p_date is not null");
            return (Criteria) this;
        }

        public Criteria andP_dateEqualTo(Date value) {
            addCriterion("p_date =", value, "p_date");
            return (Criteria) this;
        }

        public Criteria andP_dateNotEqualTo(Date value) {
            addCriterion("p_date <>", value, "p_date");
            return (Criteria) this;
        }

        public Criteria andP_dateGreaterThan(Date value) {
            addCriterion("p_date >", value, "p_date");
            return (Criteria) this;
        }

        public Criteria andP_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("p_date >=", value, "p_date");
            return (Criteria) this;
        }

        public Criteria andP_dateLessThan(Date value) {
            addCriterion("p_date <", value, "p_date");
            return (Criteria) this;
        }

        public Criteria andP_dateLessThanOrEqualTo(Date value) {
            addCriterion("p_date <=", value, "p_date");
            return (Criteria) this;
        }

        public Criteria andP_dateIn(List<Date> values) {
            addCriterion("p_date in", values, "p_date");
            return (Criteria) this;
        }

        public Criteria andP_dateNotIn(List<Date> values) {
            addCriterion("p_date not in", values, "p_date");
            return (Criteria) this;
        }

        public Criteria andP_dateBetween(Date value1, Date value2) {
            addCriterion("p_date between", value1, value2, "p_date");
            return (Criteria) this;
        }

        public Criteria andP_dateNotBetween(Date value1, Date value2) {
            addCriterion("p_date not between", value1, value2, "p_date");
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