package com.kkb.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HosregisterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HosregisterExample() {
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

        public Criteria andHosr_idIsNull() {
            addCriterion("hosr_id is null");
            return (Criteria) this;
        }

        public Criteria andHosr_idIsNotNull() {
            addCriterion("hosr_id is not null");
            return (Criteria) this;
        }

        public Criteria andHosr_idEqualTo(Integer value) {
            addCriterion("hosr_id =", value, "hosr_id");
            return (Criteria) this;
        }

        public Criteria andHosr_idNotEqualTo(Integer value) {
            addCriterion("hosr_id <>", value, "hosr_id");
            return (Criteria) this;
        }

        public Criteria andHosr_idGreaterThan(Integer value) {
            addCriterion("hosr_id >", value, "hosr_id");
            return (Criteria) this;
        }

        public Criteria andHosr_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("hosr_id >=", value, "hosr_id");
            return (Criteria) this;
        }

        public Criteria andHosr_idLessThan(Integer value) {
            addCriterion("hosr_id <", value, "hosr_id");
            return (Criteria) this;
        }

        public Criteria andHosr_idLessThanOrEqualTo(Integer value) {
            addCriterion("hosr_id <=", value, "hosr_id");
            return (Criteria) this;
        }

        public Criteria andHosr_idIn(List<Integer> values) {
            addCriterion("hosr_id in", values, "hosr_id");
            return (Criteria) this;
        }

        public Criteria andHosr_idNotIn(List<Integer> values) {
            addCriterion("hosr_id not in", values, "hosr_id");
            return (Criteria) this;
        }

        public Criteria andHosr_idBetween(Integer value1, Integer value2) {
            addCriterion("hosr_id between", value1, value2, "hosr_id");
            return (Criteria) this;
        }

        public Criteria andHosr_idNotBetween(Integer value1, Integer value2) {
            addCriterion("hosr_id not between", value1, value2, "hosr_id");
            return (Criteria) this;
        }

        public Criteria andHosr_nameIsNull() {
            addCriterion("hosr_name is null");
            return (Criteria) this;
        }

        public Criteria andHosr_nameIsNotNull() {
            addCriterion("hosr_name is not null");
            return (Criteria) this;
        }

        public Criteria andHosr_nameEqualTo(String value) {
            addCriterion("hosr_name =", value, "hosr_name");
            return (Criteria) this;
        }

        public Criteria andHosr_nameNotEqualTo(String value) {
            addCriterion("hosr_name <>", value, "hosr_name");
            return (Criteria) this;
        }

        public Criteria andHosr_nameGreaterThan(String value) {
            addCriterion("hosr_name >", value, "hosr_name");
            return (Criteria) this;
        }

        public Criteria andHosr_nameGreaterThanOrEqualTo(String value) {
            addCriterion("hosr_name >=", value, "hosr_name");
            return (Criteria) this;
        }

        public Criteria andHosr_nameLessThan(String value) {
            addCriterion("hosr_name <", value, "hosr_name");
            return (Criteria) this;
        }

        public Criteria andHosr_nameLessThanOrEqualTo(String value) {
            addCriterion("hosr_name <=", value, "hosr_name");
            return (Criteria) this;
        }

        public Criteria andHosr_nameLike(String value) {
            addCriterion("hosr_name like", value, "hosr_name");
            return (Criteria) this;
        }

        public Criteria andHosr_nameNotLike(String value) {
            addCriterion("hosr_name not like", value, "hosr_name");
            return (Criteria) this;
        }

        public Criteria andHosr_nameIn(List<String> values) {
            addCriterion("hosr_name in", values, "hosr_name");
            return (Criteria) this;
        }

        public Criteria andHosr_nameNotIn(List<String> values) {
            addCriterion("hosr_name not in", values, "hosr_name");
            return (Criteria) this;
        }

        public Criteria andHosr_nameBetween(String value1, String value2) {
            addCriterion("hosr_name between", value1, value2, "hosr_name");
            return (Criteria) this;
        }

        public Criteria andHosr_nameNotBetween(String value1, String value2) {
            addCriterion("hosr_name not between", value1, value2, "hosr_name");
            return (Criteria) this;
        }

        public Criteria andHosr_idCarIsNull() {
            addCriterion("hosr_idCar is null");
            return (Criteria) this;
        }

        public Criteria andHosr_idCarIsNotNull() {
            addCriterion("hosr_idCar is not null");
            return (Criteria) this;
        }

        public Criteria andHosr_idCarEqualTo(String value) {
            addCriterion("hosr_idCar =", value, "hosr_idCar");
            return (Criteria) this;
        }

        public Criteria andHosr_idCarNotEqualTo(String value) {
            addCriterion("hosr_idCar <>", value, "hosr_idCar");
            return (Criteria) this;
        }

        public Criteria andHosr_idCarGreaterThan(String value) {
            addCriterion("hosr_idCar >", value, "hosr_idCar");
            return (Criteria) this;
        }

        public Criteria andHosr_idCarGreaterThanOrEqualTo(String value) {
            addCriterion("hosr_idCar >=", value, "hosr_idCar");
            return (Criteria) this;
        }

        public Criteria andHosr_idCarLessThan(String value) {
            addCriterion("hosr_idCar <", value, "hosr_idCar");
            return (Criteria) this;
        }

        public Criteria andHosr_idCarLessThanOrEqualTo(String value) {
            addCriterion("hosr_idCar <=", value, "hosr_idCar");
            return (Criteria) this;
        }

        public Criteria andHosr_idCarLike(String value) {
            addCriterion("hosr_idCar like", value, "hosr_idCar");
            return (Criteria) this;
        }

        public Criteria andHosr_idCarNotLike(String value) {
            addCriterion("hosr_idCar not like", value, "hosr_idCar");
            return (Criteria) this;
        }

        public Criteria andHosr_idCarIn(List<String> values) {
            addCriterion("hosr_idCar in", values, "hosr_idCar");
            return (Criteria) this;
        }

        public Criteria andHosr_idCarNotIn(List<String> values) {
            addCriterion("hosr_idCar not in", values, "hosr_idCar");
            return (Criteria) this;
        }

        public Criteria andHosr_idCarBetween(String value1, String value2) {
            addCriterion("hosr_idCar between", value1, value2, "hosr_idCar");
            return (Criteria) this;
        }

        public Criteria andHosr_idCarNotBetween(String value1, String value2) {
            addCriterion("hosr_idCar not between", value1, value2, "hosr_idCar");
            return (Criteria) this;
        }

        public Criteria andHosr_medicalIsNull() {
            addCriterion("hosr_medical is null");
            return (Criteria) this;
        }

        public Criteria andHosr_medicalIsNotNull() {
            addCriterion("hosr_medical is not null");
            return (Criteria) this;
        }

        public Criteria andHosr_medicalEqualTo(String value) {
            addCriterion("hosr_medical =", value, "hosr_medical");
            return (Criteria) this;
        }

        public Criteria andHosr_medicalNotEqualTo(String value) {
            addCriterion("hosr_medical <>", value, "hosr_medical");
            return (Criteria) this;
        }

        public Criteria andHosr_medicalGreaterThan(String value) {
            addCriterion("hosr_medical >", value, "hosr_medical");
            return (Criteria) this;
        }

        public Criteria andHosr_medicalGreaterThanOrEqualTo(String value) {
            addCriterion("hosr_medical >=", value, "hosr_medical");
            return (Criteria) this;
        }

        public Criteria andHosr_medicalLessThan(String value) {
            addCriterion("hosr_medical <", value, "hosr_medical");
            return (Criteria) this;
        }

        public Criteria andHosr_medicalLessThanOrEqualTo(String value) {
            addCriterion("hosr_medical <=", value, "hosr_medical");
            return (Criteria) this;
        }

        public Criteria andHosr_medicalLike(String value) {
            addCriterion("hosr_medical like", value, "hosr_medical");
            return (Criteria) this;
        }

        public Criteria andHosr_medicalNotLike(String value) {
            addCriterion("hosr_medical not like", value, "hosr_medical");
            return (Criteria) this;
        }

        public Criteria andHosr_medicalIn(List<String> values) {
            addCriterion("hosr_medical in", values, "hosr_medical");
            return (Criteria) this;
        }

        public Criteria andHosr_medicalNotIn(List<String> values) {
            addCriterion("hosr_medical not in", values, "hosr_medical");
            return (Criteria) this;
        }

        public Criteria andHosr_medicalBetween(String value1, String value2) {
            addCriterion("hosr_medical between", value1, value2, "hosr_medical");
            return (Criteria) this;
        }

        public Criteria andHosr_medicalNotBetween(String value1, String value2) {
            addCriterion("hosr_medical not between", value1, value2, "hosr_medical");
            return (Criteria) this;
        }

        public Criteria andHosr_regPriceIsNull() {
            addCriterion("hosr_regPrice is null");
            return (Criteria) this;
        }

        public Criteria andHosr_regPriceIsNotNull() {
            addCriterion("hosr_regPrice is not null");
            return (Criteria) this;
        }

        public Criteria andHosr_regPriceEqualTo(Integer value) {
            addCriterion("hosr_regPrice =", value, "hosr_regPrice");
            return (Criteria) this;
        }

        public Criteria andHosr_regPriceNotEqualTo(Integer value) {
            addCriterion("hosr_regPrice <>", value, "hosr_regPrice");
            return (Criteria) this;
        }

        public Criteria andHosr_regPriceGreaterThan(Integer value) {
            addCriterion("hosr_regPrice >", value, "hosr_regPrice");
            return (Criteria) this;
        }

        public Criteria andHosr_regPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("hosr_regPrice >=", value, "hosr_regPrice");
            return (Criteria) this;
        }

        public Criteria andHosr_regPriceLessThan(Integer value) {
            addCriterion("hosr_regPrice <", value, "hosr_regPrice");
            return (Criteria) this;
        }

        public Criteria andHosr_regPriceLessThanOrEqualTo(Integer value) {
            addCriterion("hosr_regPrice <=", value, "hosr_regPrice");
            return (Criteria) this;
        }

        public Criteria andHosr_regPriceIn(List<Integer> values) {
            addCriterion("hosr_regPrice in", values, "hosr_regPrice");
            return (Criteria) this;
        }

        public Criteria andHosr_regPriceNotIn(List<Integer> values) {
            addCriterion("hosr_regPrice not in", values, "hosr_regPrice");
            return (Criteria) this;
        }

        public Criteria andHosr_regPriceBetween(Integer value1, Integer value2) {
            addCriterion("hosr_regPrice between", value1, value2, "hosr_regPrice");
            return (Criteria) this;
        }

        public Criteria andHosr_regPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("hosr_regPrice not between", value1, value2, "hosr_regPrice");
            return (Criteria) this;
        }

        public Criteria andHosr_phoneIsNull() {
            addCriterion("hosr_phone is null");
            return (Criteria) this;
        }

        public Criteria andHosr_phoneIsNotNull() {
            addCriterion("hosr_phone is not null");
            return (Criteria) this;
        }

        public Criteria andHosr_phoneEqualTo(String value) {
            addCriterion("hosr_phone =", value, "hosr_phone");
            return (Criteria) this;
        }

        public Criteria andHosr_phoneNotEqualTo(String value) {
            addCriterion("hosr_phone <>", value, "hosr_phone");
            return (Criteria) this;
        }

        public Criteria andHosr_phoneGreaterThan(String value) {
            addCriterion("hosr_phone >", value, "hosr_phone");
            return (Criteria) this;
        }

        public Criteria andHosr_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("hosr_phone >=", value, "hosr_phone");
            return (Criteria) this;
        }

        public Criteria andHosr_phoneLessThan(String value) {
            addCriterion("hosr_phone <", value, "hosr_phone");
            return (Criteria) this;
        }

        public Criteria andHosr_phoneLessThanOrEqualTo(String value) {
            addCriterion("hosr_phone <=", value, "hosr_phone");
            return (Criteria) this;
        }

        public Criteria andHosr_phoneLike(String value) {
            addCriterion("hosr_phone like", value, "hosr_phone");
            return (Criteria) this;
        }

        public Criteria andHosr_phoneNotLike(String value) {
            addCriterion("hosr_phone not like", value, "hosr_phone");
            return (Criteria) this;
        }

        public Criteria andHosr_phoneIn(List<String> values) {
            addCriterion("hosr_phone in", values, "hosr_phone");
            return (Criteria) this;
        }

        public Criteria andHosr_phoneNotIn(List<String> values) {
            addCriterion("hosr_phone not in", values, "hosr_phone");
            return (Criteria) this;
        }

        public Criteria andHosr_phoneBetween(String value1, String value2) {
            addCriterion("hosr_phone between", value1, value2, "hosr_phone");
            return (Criteria) this;
        }

        public Criteria andHosr_phoneNotBetween(String value1, String value2) {
            addCriterion("hosr_phone not between", value1, value2, "hosr_phone");
            return (Criteria) this;
        }

        public Criteria andHosr_selfPriceIsNull() {
            addCriterion("hosr_selfPrice is null");
            return (Criteria) this;
        }

        public Criteria andHosr_selfPriceIsNotNull() {
            addCriterion("hosr_selfPrice is not null");
            return (Criteria) this;
        }

        public Criteria andHosr_selfPriceEqualTo(Integer value) {
            addCriterion("hosr_selfPrice =", value, "hosr_selfPrice");
            return (Criteria) this;
        }

        public Criteria andHosr_selfPriceNotEqualTo(Integer value) {
            addCriterion("hosr_selfPrice <>", value, "hosr_selfPrice");
            return (Criteria) this;
        }

        public Criteria andHosr_selfPriceGreaterThan(Integer value) {
            addCriterion("hosr_selfPrice >", value, "hosr_selfPrice");
            return (Criteria) this;
        }

        public Criteria andHosr_selfPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("hosr_selfPrice >=", value, "hosr_selfPrice");
            return (Criteria) this;
        }

        public Criteria andHosr_selfPriceLessThan(Integer value) {
            addCriterion("hosr_selfPrice <", value, "hosr_selfPrice");
            return (Criteria) this;
        }

        public Criteria andHosr_selfPriceLessThanOrEqualTo(Integer value) {
            addCriterion("hosr_selfPrice <=", value, "hosr_selfPrice");
            return (Criteria) this;
        }

        public Criteria andHosr_selfPriceIn(List<Integer> values) {
            addCriterion("hosr_selfPrice in", values, "hosr_selfPrice");
            return (Criteria) this;
        }

        public Criteria andHosr_selfPriceNotIn(List<Integer> values) {
            addCriterion("hosr_selfPrice not in", values, "hosr_selfPrice");
            return (Criteria) this;
        }

        public Criteria andHosr_selfPriceBetween(Integer value1, Integer value2) {
            addCriterion("hosr_selfPrice between", value1, value2, "hosr_selfPrice");
            return (Criteria) this;
        }

        public Criteria andHosr_selfPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("hosr_selfPrice not between", value1, value2, "hosr_selfPrice");
            return (Criteria) this;
        }

        public Criteria andHosr_sexIsNull() {
            addCriterion("hosr_sex is null");
            return (Criteria) this;
        }

        public Criteria andHosr_sexIsNotNull() {
            addCriterion("hosr_sex is not null");
            return (Criteria) this;
        }

        public Criteria andHosr_sexEqualTo(Integer value) {
            addCriterion("hosr_sex =", value, "hosr_sex");
            return (Criteria) this;
        }

        public Criteria andHosr_sexNotEqualTo(Integer value) {
            addCriterion("hosr_sex <>", value, "hosr_sex");
            return (Criteria) this;
        }

        public Criteria andHosr_sexGreaterThan(Integer value) {
            addCriterion("hosr_sex >", value, "hosr_sex");
            return (Criteria) this;
        }

        public Criteria andHosr_sexGreaterThanOrEqualTo(Integer value) {
            addCriterion("hosr_sex >=", value, "hosr_sex");
            return (Criteria) this;
        }

        public Criteria andHosr_sexLessThan(Integer value) {
            addCriterion("hosr_sex <", value, "hosr_sex");
            return (Criteria) this;
        }

        public Criteria andHosr_sexLessThanOrEqualTo(Integer value) {
            addCriterion("hosr_sex <=", value, "hosr_sex");
            return (Criteria) this;
        }

        public Criteria andHosr_sexIn(List<Integer> values) {
            addCriterion("hosr_sex in", values, "hosr_sex");
            return (Criteria) this;
        }

        public Criteria andHosr_sexNotIn(List<Integer> values) {
            addCriterion("hosr_sex not in", values, "hosr_sex");
            return (Criteria) this;
        }

        public Criteria andHosr_sexBetween(Integer value1, Integer value2) {
            addCriterion("hosr_sex between", value1, value2, "hosr_sex");
            return (Criteria) this;
        }

        public Criteria andHosr_sexNotBetween(Integer value1, Integer value2) {
            addCriterion("hosr_sex not between", value1, value2, "hosr_sex");
            return (Criteria) this;
        }

        public Criteria andHosr_ageIsNull() {
            addCriterion("hosr_age is null");
            return (Criteria) this;
        }

        public Criteria andHosr_ageIsNotNull() {
            addCriterion("hosr_age is not null");
            return (Criteria) this;
        }

        public Criteria andHosr_ageEqualTo(Integer value) {
            addCriterion("hosr_age =", value, "hosr_age");
            return (Criteria) this;
        }

        public Criteria andHosr_ageNotEqualTo(Integer value) {
            addCriterion("hosr_age <>", value, "hosr_age");
            return (Criteria) this;
        }

        public Criteria andHosr_ageGreaterThan(Integer value) {
            addCriterion("hosr_age >", value, "hosr_age");
            return (Criteria) this;
        }

        public Criteria andHosr_ageGreaterThanOrEqualTo(Integer value) {
            addCriterion("hosr_age >=", value, "hosr_age");
            return (Criteria) this;
        }

        public Criteria andHosr_ageLessThan(Integer value) {
            addCriterion("hosr_age <", value, "hosr_age");
            return (Criteria) this;
        }

        public Criteria andHosr_ageLessThanOrEqualTo(Integer value) {
            addCriterion("hosr_age <=", value, "hosr_age");
            return (Criteria) this;
        }

        public Criteria andHosr_ageIn(List<Integer> values) {
            addCriterion("hosr_age in", values, "hosr_age");
            return (Criteria) this;
        }

        public Criteria andHosr_ageNotIn(List<Integer> values) {
            addCriterion("hosr_age not in", values, "hosr_age");
            return (Criteria) this;
        }

        public Criteria andHosr_ageBetween(Integer value1, Integer value2) {
            addCriterion("hosr_age between", value1, value2, "hosr_age");
            return (Criteria) this;
        }

        public Criteria andHosr_ageNotBetween(Integer value1, Integer value2) {
            addCriterion("hosr_age not between", value1, value2, "hosr_age");
            return (Criteria) this;
        }

        public Criteria andHosr_workIsNull() {
            addCriterion("hosr_work is null");
            return (Criteria) this;
        }

        public Criteria andHosr_workIsNotNull() {
            addCriterion("hosr_work is not null");
            return (Criteria) this;
        }

        public Criteria andHosr_workEqualTo(String value) {
            addCriterion("hosr_work =", value, "hosr_work");
            return (Criteria) this;
        }

        public Criteria andHosr_workNotEqualTo(String value) {
            addCriterion("hosr_work <>", value, "hosr_work");
            return (Criteria) this;
        }

        public Criteria andHosr_workGreaterThan(String value) {
            addCriterion("hosr_work >", value, "hosr_work");
            return (Criteria) this;
        }

        public Criteria andHosr_workGreaterThanOrEqualTo(String value) {
            addCriterion("hosr_work >=", value, "hosr_work");
            return (Criteria) this;
        }

        public Criteria andHosr_workLessThan(String value) {
            addCriterion("hosr_work <", value, "hosr_work");
            return (Criteria) this;
        }

        public Criteria andHosr_workLessThanOrEqualTo(String value) {
            addCriterion("hosr_work <=", value, "hosr_work");
            return (Criteria) this;
        }

        public Criteria andHosr_workLike(String value) {
            addCriterion("hosr_work like", value, "hosr_work");
            return (Criteria) this;
        }

        public Criteria andHosr_workNotLike(String value) {
            addCriterion("hosr_work not like", value, "hosr_work");
            return (Criteria) this;
        }

        public Criteria andHosr_workIn(List<String> values) {
            addCriterion("hosr_work in", values, "hosr_work");
            return (Criteria) this;
        }

        public Criteria andHosr_workNotIn(List<String> values) {
            addCriterion("hosr_work not in", values, "hosr_work");
            return (Criteria) this;
        }

        public Criteria andHosr_workBetween(String value1, String value2) {
            addCriterion("hosr_work between", value1, value2, "hosr_work");
            return (Criteria) this;
        }

        public Criteria andHosr_workNotBetween(String value1, String value2) {
            addCriterion("hosr_work not between", value1, value2, "hosr_work");
            return (Criteria) this;
        }

        public Criteria andHosr_lookDoctorIsNull() {
            addCriterion("hosr_lookDoctor is null");
            return (Criteria) this;
        }

        public Criteria andHosr_lookDoctorIsNotNull() {
            addCriterion("hosr_lookDoctor is not null");
            return (Criteria) this;
        }

        public Criteria andHosr_lookDoctorEqualTo(String value) {
            addCriterion("hosr_lookDoctor =", value, "hosr_lookDoctor");
            return (Criteria) this;
        }

        public Criteria andHosr_lookDoctorNotEqualTo(String value) {
            addCriterion("hosr_lookDoctor <>", value, "hosr_lookDoctor");
            return (Criteria) this;
        }

        public Criteria andHosr_lookDoctorGreaterThan(String value) {
            addCriterion("hosr_lookDoctor >", value, "hosr_lookDoctor");
            return (Criteria) this;
        }

        public Criteria andHosr_lookDoctorGreaterThanOrEqualTo(String value) {
            addCriterion("hosr_lookDoctor >=", value, "hosr_lookDoctor");
            return (Criteria) this;
        }

        public Criteria andHosr_lookDoctorLessThan(String value) {
            addCriterion("hosr_lookDoctor <", value, "hosr_lookDoctor");
            return (Criteria) this;
        }

        public Criteria andHosr_lookDoctorLessThanOrEqualTo(String value) {
            addCriterion("hosr_lookDoctor <=", value, "hosr_lookDoctor");
            return (Criteria) this;
        }

        public Criteria andHosr_lookDoctorLike(String value) {
            addCriterion("hosr_lookDoctor like", value, "hosr_lookDoctor");
            return (Criteria) this;
        }

        public Criteria andHosr_lookDoctorNotLike(String value) {
            addCriterion("hosr_lookDoctor not like", value, "hosr_lookDoctor");
            return (Criteria) this;
        }

        public Criteria andHosr_lookDoctorIn(List<String> values) {
            addCriterion("hosr_lookDoctor in", values, "hosr_lookDoctor");
            return (Criteria) this;
        }

        public Criteria andHosr_lookDoctorNotIn(List<String> values) {
            addCriterion("hosr_lookDoctor not in", values, "hosr_lookDoctor");
            return (Criteria) this;
        }

        public Criteria andHosr_lookDoctorBetween(String value1, String value2) {
            addCriterion("hosr_lookDoctor between", value1, value2, "hosr_lookDoctor");
            return (Criteria) this;
        }

        public Criteria andHosr_lookDoctorNotBetween(String value1, String value2) {
            addCriterion("hosr_lookDoctor not between", value1, value2, "hosr_lookDoctor");
            return (Criteria) this;
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

        public Criteria andHosr_intimeIsNull() {
            addCriterion("hosr_intime is null");
            return (Criteria) this;
        }

        public Criteria andHosr_intimeIsNotNull() {
            addCriterion("hosr_intime is not null");
            return (Criteria) this;
        }

        public Criteria andHosr_intimeEqualTo(Date value) {
            addCriterionForJDBCDate("hosr_intime =", value, "hosr_intime");
            return (Criteria) this;
        }

        public Criteria andHosr_intimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("hosr_intime <>", value, "hosr_intime");
            return (Criteria) this;
        }

        public Criteria andHosr_intimeGreaterThan(Date value) {
            addCriterionForJDBCDate("hosr_intime >", value, "hosr_intime");
            return (Criteria) this;
        }

        public Criteria andHosr_intimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hosr_intime >=", value, "hosr_intime");
            return (Criteria) this;
        }

        public Criteria andHosr_intimeLessThan(Date value) {
            addCriterionForJDBCDate("hosr_intime <", value, "hosr_intime");
            return (Criteria) this;
        }

        public Criteria andHosr_intimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hosr_intime <=", value, "hosr_intime");
            return (Criteria) this;
        }

        public Criteria andHosr_intimeIn(List<Date> values) {
            addCriterionForJDBCDate("hosr_intime in", values, "hosr_intime");
            return (Criteria) this;
        }

        public Criteria andHosr_intimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("hosr_intime not in", values, "hosr_intime");
            return (Criteria) this;
        }

        public Criteria andHosr_intimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hosr_intime between", value1, value2, "hosr_intime");
            return (Criteria) this;
        }

        public Criteria andHosr_intimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hosr_intime not between", value1, value2, "hosr_intime");
            return (Criteria) this;
        }

        public Criteria andD_idIsNull() {
            addCriterion("d_id is null");
            return (Criteria) this;
        }

        public Criteria andD_idIsNotNull() {
            addCriterion("d_id is not null");
            return (Criteria) this;
        }

        public Criteria andD_idEqualTo(Integer value) {
            addCriterion("d_id =", value, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idNotEqualTo(Integer value) {
            addCriterion("d_id <>", value, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idGreaterThan(Integer value) {
            addCriterion("d_id >", value, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_id >=", value, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idLessThan(Integer value) {
            addCriterion("d_id <", value, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idLessThanOrEqualTo(Integer value) {
            addCriterion("d_id <=", value, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idIn(List<Integer> values) {
            addCriterion("d_id in", values, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idNotIn(List<Integer> values) {
            addCriterion("d_id not in", values, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idBetween(Integer value1, Integer value2) {
            addCriterion("d_id between", value1, value2, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idNotBetween(Integer value1, Integer value2) {
            addCriterion("d_id not between", value1, value2, "d_id");
            return (Criteria) this;
        }

        public Criteria andHosr_remarkIsNull() {
            addCriterion("hosr_remark is null");
            return (Criteria) this;
        }

        public Criteria andHosr_remarkIsNotNull() {
            addCriterion("hosr_remark is not null");
            return (Criteria) this;
        }

        public Criteria andHosr_remarkEqualTo(String value) {
            addCriterion("hosr_remark =", value, "hosr_remark");
            return (Criteria) this;
        }

        public Criteria andHosr_remarkNotEqualTo(String value) {
            addCriterion("hosr_remark <>", value, "hosr_remark");
            return (Criteria) this;
        }

        public Criteria andHosr_remarkGreaterThan(String value) {
            addCriterion("hosr_remark >", value, "hosr_remark");
            return (Criteria) this;
        }

        public Criteria andHosr_remarkGreaterThanOrEqualTo(String value) {
            addCriterion("hosr_remark >=", value, "hosr_remark");
            return (Criteria) this;
        }

        public Criteria andHosr_remarkLessThan(String value) {
            addCriterion("hosr_remark <", value, "hosr_remark");
            return (Criteria) this;
        }

        public Criteria andHosr_remarkLessThanOrEqualTo(String value) {
            addCriterion("hosr_remark <=", value, "hosr_remark");
            return (Criteria) this;
        }

        public Criteria andHosr_remarkLike(String value) {
            addCriterion("hosr_remark like", value, "hosr_remark");
            return (Criteria) this;
        }

        public Criteria andHosr_remarkNotLike(String value) {
            addCriterion("hosr_remark not like", value, "hosr_remark");
            return (Criteria) this;
        }

        public Criteria andHosr_remarkIn(List<String> values) {
            addCriterion("hosr_remark in", values, "hosr_remark");
            return (Criteria) this;
        }

        public Criteria andHosr_remarkNotIn(List<String> values) {
            addCriterion("hosr_remark not in", values, "hosr_remark");
            return (Criteria) this;
        }

        public Criteria andHosr_remarkBetween(String value1, String value2) {
            addCriterion("hosr_remark between", value1, value2, "hosr_remark");
            return (Criteria) this;
        }

        public Criteria andHosr_remarkNotBetween(String value1, String value2) {
            addCriterion("hosr_remark not between", value1, value2, "hosr_remark");
            return (Criteria) this;
        }

        public Criteria andHosr_stateIsNull() {
            addCriterion("hosr_state is null");
            return (Criteria) this;
        }

        public Criteria andHosr_stateIsNotNull() {
            addCriterion("hosr_state is not null");
            return (Criteria) this;
        }

        public Criteria andHosr_stateEqualTo(Integer value) {
            addCriterion("hosr_state =", value, "hosr_state");
            return (Criteria) this;
        }

        public Criteria andHosr_stateNotEqualTo(Integer value) {
            addCriterion("hosr_state <>", value, "hosr_state");
            return (Criteria) this;
        }

        public Criteria andHosr_stateGreaterThan(Integer value) {
            addCriterion("hosr_state >", value, "hosr_state");
            return (Criteria) this;
        }

        public Criteria andHosr_stateGreaterThanOrEqualTo(Integer value) {
            addCriterion("hosr_state >=", value, "hosr_state");
            return (Criteria) this;
        }

        public Criteria andHosr_stateLessThan(Integer value) {
            addCriterion("hosr_state <", value, "hosr_state");
            return (Criteria) this;
        }

        public Criteria andHosr_stateLessThanOrEqualTo(Integer value) {
            addCriterion("hosr_state <=", value, "hosr_state");
            return (Criteria) this;
        }

        public Criteria andHosr_stateIn(List<Integer> values) {
            addCriterion("hosr_state in", values, "hosr_state");
            return (Criteria) this;
        }

        public Criteria andHosr_stateNotIn(List<Integer> values) {
            addCriterion("hosr_state not in", values, "hosr_state");
            return (Criteria) this;
        }

        public Criteria andHosr_stateBetween(Integer value1, Integer value2) {
            addCriterion("hosr_state between", value1, value2, "hosr_state");
            return (Criteria) this;
        }

        public Criteria andHosr_stateNotBetween(Integer value1, Integer value2) {
            addCriterion("hosr_state not between", value1, value2, "hosr_state");
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