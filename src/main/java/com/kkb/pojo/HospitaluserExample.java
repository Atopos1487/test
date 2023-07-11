package com.kkb.pojo;

import java.util.ArrayList;
import java.util.List;

public class HospitaluserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HospitaluserExample() {
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

        public Criteria andU_phoneIsNull() {
            addCriterion("u_phone is null");
            return (Criteria) this;
        }

        public Criteria andU_phoneIsNotNull() {
            addCriterion("u_phone is not null");
            return (Criteria) this;
        }

        public Criteria andU_phoneEqualTo(String value) {
            addCriterion("u_phone =", value, "u_phone");
            return (Criteria) this;
        }

        public Criteria andU_phoneNotEqualTo(String value) {
            addCriterion("u_phone <>", value, "u_phone");
            return (Criteria) this;
        }

        public Criteria andU_phoneGreaterThan(String value) {
            addCriterion("u_phone >", value, "u_phone");
            return (Criteria) this;
        }

        public Criteria andU_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("u_phone >=", value, "u_phone");
            return (Criteria) this;
        }

        public Criteria andU_phoneLessThan(String value) {
            addCriterion("u_phone <", value, "u_phone");
            return (Criteria) this;
        }

        public Criteria andU_phoneLessThanOrEqualTo(String value) {
            addCriterion("u_phone <=", value, "u_phone");
            return (Criteria) this;
        }

        public Criteria andU_phoneLike(String value) {
            addCriterion("u_phone like", value, "u_phone");
            return (Criteria) this;
        }

        public Criteria andU_phoneNotLike(String value) {
            addCriterion("u_phone not like", value, "u_phone");
            return (Criteria) this;
        }

        public Criteria andU_phoneIn(List<String> values) {
            addCriterion("u_phone in", values, "u_phone");
            return (Criteria) this;
        }

        public Criteria andU_phoneNotIn(List<String> values) {
            addCriterion("u_phone not in", values, "u_phone");
            return (Criteria) this;
        }

        public Criteria andU_phoneBetween(String value1, String value2) {
            addCriterion("u_phone between", value1, value2, "u_phone");
            return (Criteria) this;
        }

        public Criteria andU_phoneNotBetween(String value1, String value2) {
            addCriterion("u_phone not between", value1, value2, "u_phone");
            return (Criteria) this;
        }

        public Criteria andU_passwordIsNull() {
            addCriterion("u_password is null");
            return (Criteria) this;
        }

        public Criteria andU_passwordIsNotNull() {
            addCriterion("u_password is not null");
            return (Criteria) this;
        }

        public Criteria andU_passwordEqualTo(String value) {
            addCriterion("u_password =", value, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_passwordNotEqualTo(String value) {
            addCriterion("u_password <>", value, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_passwordGreaterThan(String value) {
            addCriterion("u_password >", value, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("u_password >=", value, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_passwordLessThan(String value) {
            addCriterion("u_password <", value, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_passwordLessThanOrEqualTo(String value) {
            addCriterion("u_password <=", value, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_passwordLike(String value) {
            addCriterion("u_password like", value, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_passwordNotLike(String value) {
            addCriterion("u_password not like", value, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_passwordIn(List<String> values) {
            addCriterion("u_password in", values, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_passwordNotIn(List<String> values) {
            addCriterion("u_password not in", values, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_passwordBetween(String value1, String value2) {
            addCriterion("u_password between", value1, value2, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_passwordNotBetween(String value1, String value2) {
            addCriterion("u_password not between", value1, value2, "u_password");
            return (Criteria) this;
        }

        public Criteria andU_truenameIsNull() {
            addCriterion("u_truename is null");
            return (Criteria) this;
        }

        public Criteria andU_truenameIsNotNull() {
            addCriterion("u_truename is not null");
            return (Criteria) this;
        }

        public Criteria andU_truenameEqualTo(String value) {
            addCriterion("u_truename =", value, "u_truename");
            return (Criteria) this;
        }

        public Criteria andU_truenameNotEqualTo(String value) {
            addCriterion("u_truename <>", value, "u_truename");
            return (Criteria) this;
        }

        public Criteria andU_truenameGreaterThan(String value) {
            addCriterion("u_truename >", value, "u_truename");
            return (Criteria) this;
        }

        public Criteria andU_truenameGreaterThanOrEqualTo(String value) {
            addCriterion("u_truename >=", value, "u_truename");
            return (Criteria) this;
        }

        public Criteria andU_truenameLessThan(String value) {
            addCriterion("u_truename <", value, "u_truename");
            return (Criteria) this;
        }

        public Criteria andU_truenameLessThanOrEqualTo(String value) {
            addCriterion("u_truename <=", value, "u_truename");
            return (Criteria) this;
        }

        public Criteria andU_truenameLike(String value) {
            addCriterion("u_truename like", value, "u_truename");
            return (Criteria) this;
        }

        public Criteria andU_truenameNotLike(String value) {
            addCriterion("u_truename not like", value, "u_truename");
            return (Criteria) this;
        }

        public Criteria andU_truenameIn(List<String> values) {
            addCriterion("u_truename in", values, "u_truename");
            return (Criteria) this;
        }

        public Criteria andU_truenameNotIn(List<String> values) {
            addCriterion("u_truename not in", values, "u_truename");
            return (Criteria) this;
        }

        public Criteria andU_truenameBetween(String value1, String value2) {
            addCriterion("u_truename between", value1, value2, "u_truename");
            return (Criteria) this;
        }

        public Criteria andU_truenameNotBetween(String value1, String value2) {
            addCriterion("u_truename not between", value1, value2, "u_truename");
            return (Criteria) this;
        }

        public Criteria andU_emailIsNull() {
            addCriterion("u_email is null");
            return (Criteria) this;
        }

        public Criteria andU_emailIsNotNull() {
            addCriterion("u_email is not null");
            return (Criteria) this;
        }

        public Criteria andU_emailEqualTo(String value) {
            addCriterion("u_email =", value, "u_email");
            return (Criteria) this;
        }

        public Criteria andU_emailNotEqualTo(String value) {
            addCriterion("u_email <>", value, "u_email");
            return (Criteria) this;
        }

        public Criteria andU_emailGreaterThan(String value) {
            addCriterion("u_email >", value, "u_email");
            return (Criteria) this;
        }

        public Criteria andU_emailGreaterThanOrEqualTo(String value) {
            addCriterion("u_email >=", value, "u_email");
            return (Criteria) this;
        }

        public Criteria andU_emailLessThan(String value) {
            addCriterion("u_email <", value, "u_email");
            return (Criteria) this;
        }

        public Criteria andU_emailLessThanOrEqualTo(String value) {
            addCriterion("u_email <=", value, "u_email");
            return (Criteria) this;
        }

        public Criteria andU_emailLike(String value) {
            addCriterion("u_email like", value, "u_email");
            return (Criteria) this;
        }

        public Criteria andU_emailNotLike(String value) {
            addCriterion("u_email not like", value, "u_email");
            return (Criteria) this;
        }

        public Criteria andU_emailIn(List<String> values) {
            addCriterion("u_email in", values, "u_email");
            return (Criteria) this;
        }

        public Criteria andU_emailNotIn(List<String> values) {
            addCriterion("u_email not in", values, "u_email");
            return (Criteria) this;
        }

        public Criteria andU_emailBetween(String value1, String value2) {
            addCriterion("u_email between", value1, value2, "u_email");
            return (Criteria) this;
        }

        public Criteria andU_emailNotBetween(String value1, String value2) {
            addCriterion("u_email not between", value1, value2, "u_email");
            return (Criteria) this;
        }

        public Criteria andU_stateIsNull() {
            addCriterion("u_state is null");
            return (Criteria) this;
        }

        public Criteria andU_stateIsNotNull() {
            addCriterion("u_state is not null");
            return (Criteria) this;
        }

        public Criteria andU_stateEqualTo(Integer value) {
            addCriterion("u_state =", value, "u_state");
            return (Criteria) this;
        }

        public Criteria andU_stateNotEqualTo(Integer value) {
            addCriterion("u_state <>", value, "u_state");
            return (Criteria) this;
        }

        public Criteria andU_stateGreaterThan(Integer value) {
            addCriterion("u_state >", value, "u_state");
            return (Criteria) this;
        }

        public Criteria andU_stateGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_state >=", value, "u_state");
            return (Criteria) this;
        }

        public Criteria andU_stateLessThan(Integer value) {
            addCriterion("u_state <", value, "u_state");
            return (Criteria) this;
        }

        public Criteria andU_stateLessThanOrEqualTo(Integer value) {
            addCriterion("u_state <=", value, "u_state");
            return (Criteria) this;
        }

        public Criteria andU_stateIn(List<Integer> values) {
            addCriterion("u_state in", values, "u_state");
            return (Criteria) this;
        }

        public Criteria andU_stateNotIn(List<Integer> values) {
            addCriterion("u_state not in", values, "u_state");
            return (Criteria) this;
        }

        public Criteria andU_stateBetween(Integer value1, Integer value2) {
            addCriterion("u_state between", value1, value2, "u_state");
            return (Criteria) this;
        }

        public Criteria andU_stateNotBetween(Integer value1, Integer value2) {
            addCriterion("u_state not between", value1, value2, "u_state");
            return (Criteria) this;
        }

        public Criteria andU_ridIsNull() {
            addCriterion("u_rid is null");
            return (Criteria) this;
        }

        public Criteria andU_ridIsNotNull() {
            addCriterion("u_rid is not null");
            return (Criteria) this;
        }

        public Criteria andU_ridEqualTo(Integer value) {
            addCriterion("u_rid =", value, "u_rid");
            return (Criteria) this;
        }

        public Criteria andU_ridNotEqualTo(Integer value) {
            addCriterion("u_rid <>", value, "u_rid");
            return (Criteria) this;
        }

        public Criteria andU_ridGreaterThan(Integer value) {
            addCriterion("u_rid >", value, "u_rid");
            return (Criteria) this;
        }

        public Criteria andU_ridGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_rid >=", value, "u_rid");
            return (Criteria) this;
        }

        public Criteria andU_ridLessThan(Integer value) {
            addCriterion("u_rid <", value, "u_rid");
            return (Criteria) this;
        }

        public Criteria andU_ridLessThanOrEqualTo(Integer value) {
            addCriterion("u_rid <=", value, "u_rid");
            return (Criteria) this;
        }

        public Criteria andU_ridIn(List<Integer> values) {
            addCriterion("u_rid in", values, "u_rid");
            return (Criteria) this;
        }

        public Criteria andU_ridNotIn(List<Integer> values) {
            addCriterion("u_rid not in", values, "u_rid");
            return (Criteria) this;
        }

        public Criteria andU_ridBetween(Integer value1, Integer value2) {
            addCriterion("u_rid between", value1, value2, "u_rid");
            return (Criteria) this;
        }

        public Criteria andU_ridNotBetween(Integer value1, Integer value2) {
            addCriterion("u_rid not between", value1, value2, "u_rid");
            return (Criteria) this;
        }

        public Criteria andIs_delIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIs_delIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIs_delEqualTo(Integer value) {
            addCriterion("is_del =", value, "is_del");
            return (Criteria) this;
        }

        public Criteria andIs_delNotEqualTo(Integer value) {
            addCriterion("is_del <>", value, "is_del");
            return (Criteria) this;
        }

        public Criteria andIs_delGreaterThan(Integer value) {
            addCriterion("is_del >", value, "is_del");
            return (Criteria) this;
        }

        public Criteria andIs_delGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_del >=", value, "is_del");
            return (Criteria) this;
        }

        public Criteria andIs_delLessThan(Integer value) {
            addCriterion("is_del <", value, "is_del");
            return (Criteria) this;
        }

        public Criteria andIs_delLessThanOrEqualTo(Integer value) {
            addCriterion("is_del <=", value, "is_del");
            return (Criteria) this;
        }

        public Criteria andIs_delIn(List<Integer> values) {
            addCriterion("is_del in", values, "is_del");
            return (Criteria) this;
        }

        public Criteria andIs_delNotIn(List<Integer> values) {
            addCriterion("is_del not in", values, "is_del");
            return (Criteria) this;
        }

        public Criteria andIs_delBetween(Integer value1, Integer value2) {
            addCriterion("is_del between", value1, value2, "is_del");
            return (Criteria) this;
        }

        public Criteria andIs_delNotBetween(Integer value1, Integer value2) {
            addCriterion("is_del not between", value1, value2, "is_del");
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