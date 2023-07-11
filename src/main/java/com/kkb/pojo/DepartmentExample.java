package com.kkb.pojo;

import java.util.ArrayList;
import java.util.List;

public class DepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartmentExample() {
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

        public Criteria andDep_idIsNull() {
            addCriterion("dep_id is null");
            return (Criteria) this;
        }

        public Criteria andDep_idIsNotNull() {
            addCriterion("dep_id is not null");
            return (Criteria) this;
        }

        public Criteria andDep_idEqualTo(Integer value) {
            addCriterion("dep_id =", value, "dep_id");
            return (Criteria) this;
        }

        public Criteria andDep_idNotEqualTo(Integer value) {
            addCriterion("dep_id <>", value, "dep_id");
            return (Criteria) this;
        }

        public Criteria andDep_idGreaterThan(Integer value) {
            addCriterion("dep_id >", value, "dep_id");
            return (Criteria) this;
        }

        public Criteria andDep_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("dep_id >=", value, "dep_id");
            return (Criteria) this;
        }

        public Criteria andDep_idLessThan(Integer value) {
            addCriterion("dep_id <", value, "dep_id");
            return (Criteria) this;
        }

        public Criteria andDep_idLessThanOrEqualTo(Integer value) {
            addCriterion("dep_id <=", value, "dep_id");
            return (Criteria) this;
        }

        public Criteria andDep_idIn(List<Integer> values) {
            addCriterion("dep_id in", values, "dep_id");
            return (Criteria) this;
        }

        public Criteria andDep_idNotIn(List<Integer> values) {
            addCriterion("dep_id not in", values, "dep_id");
            return (Criteria) this;
        }

        public Criteria andDep_idBetween(Integer value1, Integer value2) {
            addCriterion("dep_id between", value1, value2, "dep_id");
            return (Criteria) this;
        }

        public Criteria andDep_idNotBetween(Integer value1, Integer value2) {
            addCriterion("dep_id not between", value1, value2, "dep_id");
            return (Criteria) this;
        }

        public Criteria andDep_nameIsNull() {
            addCriterion("dep_name is null");
            return (Criteria) this;
        }

        public Criteria andDep_nameIsNotNull() {
            addCriterion("dep_name is not null");
            return (Criteria) this;
        }

        public Criteria andDep_nameEqualTo(String value) {
            addCriterion("dep_name =", value, "dep_name");
            return (Criteria) this;
        }

        public Criteria andDep_nameNotEqualTo(String value) {
            addCriterion("dep_name <>", value, "dep_name");
            return (Criteria) this;
        }

        public Criteria andDep_nameGreaterThan(String value) {
            addCriterion("dep_name >", value, "dep_name");
            return (Criteria) this;
        }

        public Criteria andDep_nameGreaterThanOrEqualTo(String value) {
            addCriterion("dep_name >=", value, "dep_name");
            return (Criteria) this;
        }

        public Criteria andDep_nameLessThan(String value) {
            addCriterion("dep_name <", value, "dep_name");
            return (Criteria) this;
        }

        public Criteria andDep_nameLessThanOrEqualTo(String value) {
            addCriterion("dep_name <=", value, "dep_name");
            return (Criteria) this;
        }

        public Criteria andDep_nameLike(String value) {
            addCriterion("dep_name like", value, "dep_name");
            return (Criteria) this;
        }

        public Criteria andDep_nameNotLike(String value) {
            addCriterion("dep_name not like", value, "dep_name");
            return (Criteria) this;
        }

        public Criteria andDep_nameIn(List<String> values) {
            addCriterion("dep_name in", values, "dep_name");
            return (Criteria) this;
        }

        public Criteria andDep_nameNotIn(List<String> values) {
            addCriterion("dep_name not in", values, "dep_name");
            return (Criteria) this;
        }

        public Criteria andDep_nameBetween(String value1, String value2) {
            addCriterion("dep_name between", value1, value2, "dep_name");
            return (Criteria) this;
        }

        public Criteria andDep_nameNotBetween(String value1, String value2) {
            addCriterion("dep_name not between", value1, value2, "dep_name");
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