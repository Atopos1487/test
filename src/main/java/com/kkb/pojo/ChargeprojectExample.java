package com.kkb.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ChargeprojectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChargeprojectExample() {
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

        public Criteria andChap_idIsNull() {
            addCriterion("chap_id is null");
            return (Criteria) this;
        }

        public Criteria andChap_idIsNotNull() {
            addCriterion("chap_id is not null");
            return (Criteria) this;
        }

        public Criteria andChap_idEqualTo(Integer value) {
            addCriterion("chap_id =", value, "chap_id");
            return (Criteria) this;
        }

        public Criteria andChap_idNotEqualTo(Integer value) {
            addCriterion("chap_id <>", value, "chap_id");
            return (Criteria) this;
        }

        public Criteria andChap_idGreaterThan(Integer value) {
            addCriterion("chap_id >", value, "chap_id");
            return (Criteria) this;
        }

        public Criteria andChap_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("chap_id >=", value, "chap_id");
            return (Criteria) this;
        }

        public Criteria andChap_idLessThan(Integer value) {
            addCriterion("chap_id <", value, "chap_id");
            return (Criteria) this;
        }

        public Criteria andChap_idLessThanOrEqualTo(Integer value) {
            addCriterion("chap_id <=", value, "chap_id");
            return (Criteria) this;
        }

        public Criteria andChap_idIn(List<Integer> values) {
            addCriterion("chap_id in", values, "chap_id");
            return (Criteria) this;
        }

        public Criteria andChap_idNotIn(List<Integer> values) {
            addCriterion("chap_id not in", values, "chap_id");
            return (Criteria) this;
        }

        public Criteria andChap_idBetween(Integer value1, Integer value2) {
            addCriterion("chap_id between", value1, value2, "chap_id");
            return (Criteria) this;
        }

        public Criteria andChap_idNotBetween(Integer value1, Integer value2) {
            addCriterion("chap_id not between", value1, value2, "chap_id");
            return (Criteria) this;
        }

        public Criteria andChap_nameIsNull() {
            addCriterion("chap_name is null");
            return (Criteria) this;
        }

        public Criteria andChap_nameIsNotNull() {
            addCriterion("chap_name is not null");
            return (Criteria) this;
        }

        public Criteria andChap_nameEqualTo(String value) {
            addCriterion("chap_name =", value, "chap_name");
            return (Criteria) this;
        }

        public Criteria andChap_nameNotEqualTo(String value) {
            addCriterion("chap_name <>", value, "chap_name");
            return (Criteria) this;
        }

        public Criteria andChap_nameGreaterThan(String value) {
            addCriterion("chap_name >", value, "chap_name");
            return (Criteria) this;
        }

        public Criteria andChap_nameGreaterThanOrEqualTo(String value) {
            addCriterion("chap_name >=", value, "chap_name");
            return (Criteria) this;
        }

        public Criteria andChap_nameLessThan(String value) {
            addCriterion("chap_name <", value, "chap_name");
            return (Criteria) this;
        }

        public Criteria andChap_nameLessThanOrEqualTo(String value) {
            addCriterion("chap_name <=", value, "chap_name");
            return (Criteria) this;
        }

        public Criteria andChap_nameLike(String value) {
            addCriterion("chap_name like", value, "chap_name");
            return (Criteria) this;
        }

        public Criteria andChap_nameNotLike(String value) {
            addCriterion("chap_name not like", value, "chap_name");
            return (Criteria) this;
        }

        public Criteria andChap_nameIn(List<String> values) {
            addCriterion("chap_name in", values, "chap_name");
            return (Criteria) this;
        }

        public Criteria andChap_nameNotIn(List<String> values) {
            addCriterion("chap_name not in", values, "chap_name");
            return (Criteria) this;
        }

        public Criteria andChap_nameBetween(String value1, String value2) {
            addCriterion("chap_name between", value1, value2, "chap_name");
            return (Criteria) this;
        }

        public Criteria andChap_nameNotBetween(String value1, String value2) {
            addCriterion("chap_name not between", value1, value2, "chap_name");
            return (Criteria) this;
        }

        public Criteria andChap_moneyIsNull() {
            addCriterion("chap_money is null");
            return (Criteria) this;
        }

        public Criteria andChap_moneyIsNotNull() {
            addCriterion("chap_money is not null");
            return (Criteria) this;
        }

        public Criteria andChap_moneyEqualTo(Integer value) {
            addCriterion("chap_money =", value, "chap_money");
            return (Criteria) this;
        }

        public Criteria andChap_moneyNotEqualTo(Integer value) {
            addCriterion("chap_money <>", value, "chap_money");
            return (Criteria) this;
        }

        public Criteria andChap_moneyGreaterThan(Integer value) {
            addCriterion("chap_money >", value, "chap_money");
            return (Criteria) this;
        }

        public Criteria andChap_moneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("chap_money >=", value, "chap_money");
            return (Criteria) this;
        }

        public Criteria andChap_moneyLessThan(Integer value) {
            addCriterion("chap_money <", value, "chap_money");
            return (Criteria) this;
        }

        public Criteria andChap_moneyLessThanOrEqualTo(Integer value) {
            addCriterion("chap_money <=", value, "chap_money");
            return (Criteria) this;
        }

        public Criteria andChap_moneyIn(List<Integer> values) {
            addCriterion("chap_money in", values, "chap_money");
            return (Criteria) this;
        }

        public Criteria andChap_moneyNotIn(List<Integer> values) {
            addCriterion("chap_money not in", values, "chap_money");
            return (Criteria) this;
        }

        public Criteria andChap_moneyBetween(Integer value1, Integer value2) {
            addCriterion("chap_money between", value1, value2, "chap_money");
            return (Criteria) this;
        }

        public Criteria andChap_moneyNotBetween(Integer value1, Integer value2) {
            addCriterion("chap_money not between", value1, value2, "chap_money");
            return (Criteria) this;
        }

        public Criteria andChap_intimeIsNull() {
            addCriterion("chap_intime is null");
            return (Criteria) this;
        }

        public Criteria andChap_intimeIsNotNull() {
            addCriterion("chap_intime is not null");
            return (Criteria) this;
        }

        public Criteria andChap_intimeEqualTo(Date value) {
            addCriterionForJDBCDate("chap_intime =", value, "chap_intime");
            return (Criteria) this;
        }

        public Criteria andChap_intimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("chap_intime <>", value, "chap_intime");
            return (Criteria) this;
        }

        public Criteria andChap_intimeGreaterThan(Date value) {
            addCriterionForJDBCDate("chap_intime >", value, "chap_intime");
            return (Criteria) this;
        }

        public Criteria andChap_intimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("chap_intime >=", value, "chap_intime");
            return (Criteria) this;
        }

        public Criteria andChap_intimeLessThan(Date value) {
            addCriterionForJDBCDate("chap_intime <", value, "chap_intime");
            return (Criteria) this;
        }

        public Criteria andChap_intimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("chap_intime <=", value, "chap_intime");
            return (Criteria) this;
        }

        public Criteria andChap_intimeIn(List<Date> values) {
            addCriterionForJDBCDate("chap_intime in", values, "chap_intime");
            return (Criteria) this;
        }

        public Criteria andChap_intimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("chap_intime not in", values, "chap_intime");
            return (Criteria) this;
        }

        public Criteria andChap_intimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("chap_intime between", value1, value2, "chap_intime");
            return (Criteria) this;
        }

        public Criteria andChap_intimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("chap_intime not between", value1, value2, "chap_intime");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("isDel is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("isDel is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Integer value) {
            addCriterion("isDel =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Integer value) {
            addCriterion("isDel <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Integer value) {
            addCriterion("isDel >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("isDel >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Integer value) {
            addCriterion("isDel <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("isDel <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Integer> values) {
            addCriterion("isDel in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Integer> values) {
            addCriterion("isDel not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Integer value1, Integer value2) {
            addCriterion("isDel between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("isDel not between", value1, value2, "isDel");
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

        private String typeHandler ;

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