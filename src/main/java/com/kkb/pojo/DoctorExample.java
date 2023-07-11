package com.kkb.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DoctorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoctorExample() {
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

        public Criteria andD_nameIsNull() {
            addCriterion("d_name is null");
            return (Criteria) this;
        }

        public Criteria andD_nameIsNotNull() {
            addCriterion("d_name is not null");
            return (Criteria) this;
        }

        public Criteria andD_nameEqualTo(String value) {
            addCriterion("d_name =", value, "d_name");
            return (Criteria) this;
        }

        public Criteria andD_nameNotEqualTo(String value) {
            addCriterion("d_name <>", value, "d_name");
            return (Criteria) this;
        }

        public Criteria andD_nameGreaterThan(String value) {
            addCriterion("d_name >", value, "d_name");
            return (Criteria) this;
        }

        public Criteria andD_nameGreaterThanOrEqualTo(String value) {
            addCriterion("d_name >=", value, "d_name");
            return (Criteria) this;
        }

        public Criteria andD_nameLessThan(String value) {
            addCriterion("d_name <", value, "d_name");
            return (Criteria) this;
        }

        public Criteria andD_nameLessThanOrEqualTo(String value) {
            addCriterion("d_name <=", value, "d_name");
            return (Criteria) this;
        }

        public Criteria andD_nameLike(String value) {
            addCriterion("d_name like", value, "d_name");
            return (Criteria) this;
        }

        public Criteria andD_nameNotLike(String value) {
            addCriterion("d_name not like", value, "d_name");
            return (Criteria) this;
        }

        public Criteria andD_nameIn(List<String> values) {
            addCriterion("d_name in", values, "d_name");
            return (Criteria) this;
        }

        public Criteria andD_nameNotIn(List<String> values) {
            addCriterion("d_name not in", values, "d_name");
            return (Criteria) this;
        }

        public Criteria andD_nameBetween(String value1, String value2) {
            addCriterion("d_name between", value1, value2, "d_name");
            return (Criteria) this;
        }

        public Criteria andD_nameNotBetween(String value1, String value2) {
            addCriterion("d_name not between", value1, value2, "d_name");
            return (Criteria) this;
        }

        public Criteria andD_idcarIsNull() {
            addCriterion("d_idcar is null");
            return (Criteria) this;
        }

        public Criteria andD_idcarIsNotNull() {
            addCriterion("d_idcar is not null");
            return (Criteria) this;
        }

        public Criteria andD_idcarEqualTo(String value) {
            addCriterion("d_idcar =", value, "d_idcar");
            return (Criteria) this;
        }

        public Criteria andD_idcarNotEqualTo(String value) {
            addCriterion("d_idcar <>", value, "d_idcar");
            return (Criteria) this;
        }

        public Criteria andD_idcarGreaterThan(String value) {
            addCriterion("d_idcar >", value, "d_idcar");
            return (Criteria) this;
        }

        public Criteria andD_idcarGreaterThanOrEqualTo(String value) {
            addCriterion("d_idcar >=", value, "d_idcar");
            return (Criteria) this;
        }

        public Criteria andD_idcarLessThan(String value) {
            addCriterion("d_idcar <", value, "d_idcar");
            return (Criteria) this;
        }

        public Criteria andD_idcarLessThanOrEqualTo(String value) {
            addCriterion("d_idcar <=", value, "d_idcar");
            return (Criteria) this;
        }

        public Criteria andD_idcarLike(String value) {
            addCriterion("d_idcar like", value, "d_idcar");
            return (Criteria) this;
        }

        public Criteria andD_idcarNotLike(String value) {
            addCriterion("d_idcar not like", value, "d_idcar");
            return (Criteria) this;
        }

        public Criteria andD_idcarIn(List<String> values) {
            addCriterion("d_idcar in", values, "d_idcar");
            return (Criteria) this;
        }

        public Criteria andD_idcarNotIn(List<String> values) {
            addCriterion("d_idcar not in", values, "d_idcar");
            return (Criteria) this;
        }

        public Criteria andD_idcarBetween(String value1, String value2) {
            addCriterion("d_idcar between", value1, value2, "d_idcar");
            return (Criteria) this;
        }

        public Criteria andD_idcarNotBetween(String value1, String value2) {
            addCriterion("d_idcar not between", value1, value2, "d_idcar");
            return (Criteria) this;
        }

        public Criteria andD_phoneIsNull() {
            addCriterion("d_phone is null");
            return (Criteria) this;
        }

        public Criteria andD_phoneIsNotNull() {
            addCriterion("d_phone is not null");
            return (Criteria) this;
        }

        public Criteria andD_phoneEqualTo(Integer value) {
            addCriterion("d_phone =", value, "d_phone");
            return (Criteria) this;
        }

        public Criteria andD_phoneNotEqualTo(Integer value) {
            addCriterion("d_phone <>", value, "d_phone");
            return (Criteria) this;
        }

        public Criteria andD_phoneGreaterThan(Integer value) {
            addCriterion("d_phone >", value, "d_phone");
            return (Criteria) this;
        }

        public Criteria andD_phoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_phone >=", value, "d_phone");
            return (Criteria) this;
        }

        public Criteria andD_phoneLessThan(Integer value) {
            addCriterion("d_phone <", value, "d_phone");
            return (Criteria) this;
        }

        public Criteria andD_phoneLessThanOrEqualTo(Integer value) {
            addCriterion("d_phone <=", value, "d_phone");
            return (Criteria) this;
        }

        public Criteria andD_phoneIn(List<Integer> values) {
            addCriterion("d_phone in", values, "d_phone");
            return (Criteria) this;
        }

        public Criteria andD_phoneNotIn(List<Integer> values) {
            addCriterion("d_phone not in", values, "d_phone");
            return (Criteria) this;
        }

        public Criteria andD_phoneBetween(Integer value1, Integer value2) {
            addCriterion("d_phone between", value1, value2, "d_phone");
            return (Criteria) this;
        }

        public Criteria andD_phoneNotBetween(Integer value1, Integer value2) {
            addCriterion("d_phone not between", value1, value2, "d_phone");
            return (Criteria) this;
        }

        public Criteria andD_telphoneIsNull() {
            addCriterion("d_telphone is null");
            return (Criteria) this;
        }

        public Criteria andD_telphoneIsNotNull() {
            addCriterion("d_telphone is not null");
            return (Criteria) this;
        }

        public Criteria andD_telphoneEqualTo(String value) {
            addCriterion("d_telphone =", value, "d_telphone");
            return (Criteria) this;
        }

        public Criteria andD_telphoneNotEqualTo(String value) {
            addCriterion("d_telphone <>", value, "d_telphone");
            return (Criteria) this;
        }

        public Criteria andD_telphoneGreaterThan(String value) {
            addCriterion("d_telphone >", value, "d_telphone");
            return (Criteria) this;
        }

        public Criteria andD_telphoneGreaterThanOrEqualTo(String value) {
            addCriterion("d_telphone >=", value, "d_telphone");
            return (Criteria) this;
        }

        public Criteria andD_telphoneLessThan(String value) {
            addCriterion("d_telphone <", value, "d_telphone");
            return (Criteria) this;
        }

        public Criteria andD_telphoneLessThanOrEqualTo(String value) {
            addCriterion("d_telphone <=", value, "d_telphone");
            return (Criteria) this;
        }

        public Criteria andD_telphoneLike(String value) {
            addCriterion("d_telphone like", value, "d_telphone");
            return (Criteria) this;
        }

        public Criteria andD_telphoneNotLike(String value) {
            addCriterion("d_telphone not like", value, "d_telphone");
            return (Criteria) this;
        }

        public Criteria andD_telphoneIn(List<String> values) {
            addCriterion("d_telphone in", values, "d_telphone");
            return (Criteria) this;
        }

        public Criteria andD_telphoneNotIn(List<String> values) {
            addCriterion("d_telphone not in", values, "d_telphone");
            return (Criteria) this;
        }

        public Criteria andD_telphoneBetween(String value1, String value2) {
            addCriterion("d_telphone between", value1, value2, "d_telphone");
            return (Criteria) this;
        }

        public Criteria andD_telphoneNotBetween(String value1, String value2) {
            addCriterion("d_telphone not between", value1, value2, "d_telphone");
            return (Criteria) this;
        }

        public Criteria andD_sexIsNull() {
            addCriterion("d_sex is null");
            return (Criteria) this;
        }

        public Criteria andD_sexIsNotNull() {
            addCriterion("d_sex is not null");
            return (Criteria) this;
        }

        public Criteria andD_sexEqualTo(Integer value) {
            addCriterion("d_sex =", value, "d_sex");
            return (Criteria) this;
        }

        public Criteria andD_sexNotEqualTo(Integer value) {
            addCriterion("d_sex <>", value, "d_sex");
            return (Criteria) this;
        }

        public Criteria andD_sexGreaterThan(Integer value) {
            addCriterion("d_sex >", value, "d_sex");
            return (Criteria) this;
        }

        public Criteria andD_sexGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_sex >=", value, "d_sex");
            return (Criteria) this;
        }

        public Criteria andD_sexLessThan(Integer value) {
            addCriterion("d_sex <", value, "d_sex");
            return (Criteria) this;
        }

        public Criteria andD_sexLessThanOrEqualTo(Integer value) {
            addCriterion("d_sex <=", value, "d_sex");
            return (Criteria) this;
        }

        public Criteria andD_sexIn(List<Integer> values) {
            addCriterion("d_sex in", values, "d_sex");
            return (Criteria) this;
        }

        public Criteria andD_sexNotIn(List<Integer> values) {
            addCriterion("d_sex not in", values, "d_sex");
            return (Criteria) this;
        }

        public Criteria andD_sexBetween(Integer value1, Integer value2) {
            addCriterion("d_sex between", value1, value2, "d_sex");
            return (Criteria) this;
        }

        public Criteria andD_sexNotBetween(Integer value1, Integer value2) {
            addCriterion("d_sex not between", value1, value2, "d_sex");
            return (Criteria) this;
        }

        public Criteria andD_birthdayIsNull() {
            addCriterion("d_birthday is null");
            return (Criteria) this;
        }

        public Criteria andD_birthdayIsNotNull() {
            addCriterion("d_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andD_birthdayEqualTo(Date value) {
            addCriterionForJDBCDate("d_birthday =", value, "d_birthday");
            return (Criteria) this;
        }

        public Criteria andD_birthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("d_birthday <>", value, "d_birthday");
            return (Criteria) this;
        }

        public Criteria andD_birthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("d_birthday >", value, "d_birthday");
            return (Criteria) this;
        }

        public Criteria andD_birthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("d_birthday >=", value, "d_birthday");
            return (Criteria) this;
        }

        public Criteria andD_birthdayLessThan(Date value) {
            addCriterionForJDBCDate("d_birthday <", value, "d_birthday");
            return (Criteria) this;
        }

        public Criteria andD_birthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("d_birthday <=", value, "d_birthday");
            return (Criteria) this;
        }

        public Criteria andD_birthdayIn(List<Date> values) {
            addCriterionForJDBCDate("d_birthday in", values, "d_birthday");
            return (Criteria) this;
        }

        public Criteria andD_birthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("d_birthday not in", values, "d_birthday");
            return (Criteria) this;
        }

        public Criteria andD_birthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("d_birthday between", value1, value2, "d_birthday");
            return (Criteria) this;
        }

        public Criteria andD_birthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("d_birthday not between", value1, value2, "d_birthday");
            return (Criteria) this;
        }

        public Criteria andD_ageIsNull() {
            addCriterion("d_age is null");
            return (Criteria) this;
        }

        public Criteria andD_ageIsNotNull() {
            addCriterion("d_age is not null");
            return (Criteria) this;
        }

        public Criteria andD_ageEqualTo(Integer value) {
            addCriterion("d_age =", value, "d_age");
            return (Criteria) this;
        }

        public Criteria andD_ageNotEqualTo(Integer value) {
            addCriterion("d_age <>", value, "d_age");
            return (Criteria) this;
        }

        public Criteria andD_ageGreaterThan(Integer value) {
            addCriterion("d_age >", value, "d_age");
            return (Criteria) this;
        }

        public Criteria andD_ageGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_age >=", value, "d_age");
            return (Criteria) this;
        }

        public Criteria andD_ageLessThan(Integer value) {
            addCriterion("d_age <", value, "d_age");
            return (Criteria) this;
        }

        public Criteria andD_ageLessThanOrEqualTo(Integer value) {
            addCriterion("d_age <=", value, "d_age");
            return (Criteria) this;
        }

        public Criteria andD_ageIn(List<Integer> values) {
            addCriterion("d_age in", values, "d_age");
            return (Criteria) this;
        }

        public Criteria andD_ageNotIn(List<Integer> values) {
            addCriterion("d_age not in", values, "d_age");
            return (Criteria) this;
        }

        public Criteria andD_ageBetween(Integer value1, Integer value2) {
            addCriterion("d_age between", value1, value2, "d_age");
            return (Criteria) this;
        }

        public Criteria andD_ageNotBetween(Integer value1, Integer value2) {
            addCriterion("d_age not between", value1, value2, "d_age");
            return (Criteria) this;
        }

        public Criteria andD_emailIsNull() {
            addCriterion("d_email is null");
            return (Criteria) this;
        }

        public Criteria andD_emailIsNotNull() {
            addCriterion("d_email is not null");
            return (Criteria) this;
        }

        public Criteria andD_emailEqualTo(String value) {
            addCriterion("d_email =", value, "d_email");
            return (Criteria) this;
        }

        public Criteria andD_emailNotEqualTo(String value) {
            addCriterion("d_email <>", value, "d_email");
            return (Criteria) this;
        }

        public Criteria andD_emailGreaterThan(String value) {
            addCriterion("d_email >", value, "d_email");
            return (Criteria) this;
        }

        public Criteria andD_emailGreaterThanOrEqualTo(String value) {
            addCriterion("d_email >=", value, "d_email");
            return (Criteria) this;
        }

        public Criteria andD_emailLessThan(String value) {
            addCriterion("d_email <", value, "d_email");
            return (Criteria) this;
        }

        public Criteria andD_emailLessThanOrEqualTo(String value) {
            addCriterion("d_email <=", value, "d_email");
            return (Criteria) this;
        }

        public Criteria andD_emailLike(String value) {
            addCriterion("d_email like", value, "d_email");
            return (Criteria) this;
        }

        public Criteria andD_emailNotLike(String value) {
            addCriterion("d_email not like", value, "d_email");
            return (Criteria) this;
        }

        public Criteria andD_emailIn(List<String> values) {
            addCriterion("d_email in", values, "d_email");
            return (Criteria) this;
        }

        public Criteria andD_emailNotIn(List<String> values) {
            addCriterion("d_email not in", values, "d_email");
            return (Criteria) this;
        }

        public Criteria andD_emailBetween(String value1, String value2) {
            addCriterion("d_email between", value1, value2, "d_email");
            return (Criteria) this;
        }

        public Criteria andD_emailNotBetween(String value1, String value2) {
            addCriterion("d_email not between", value1, value2, "d_email");
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

        public Criteria andD_xueliIsNull() {
            addCriterion("d_xueli is null");
            return (Criteria) this;
        }

        public Criteria andD_xueliIsNotNull() {
            addCriterion("d_xueli is not null");
            return (Criteria) this;
        }

        public Criteria andD_xueliEqualTo(String value) {
            addCriterion("d_xueli =", value, "d_xueli");
            return (Criteria) this;
        }

        public Criteria andD_xueliNotEqualTo(String value) {
            addCriterion("d_xueli <>", value, "d_xueli");
            return (Criteria) this;
        }

        public Criteria andD_xueliGreaterThan(String value) {
            addCriterion("d_xueli >", value, "d_xueli");
            return (Criteria) this;
        }

        public Criteria andD_xueliGreaterThanOrEqualTo(String value) {
            addCriterion("d_xueli >=", value, "d_xueli");
            return (Criteria) this;
        }

        public Criteria andD_xueliLessThan(String value) {
            addCriterion("d_xueli <", value, "d_xueli");
            return (Criteria) this;
        }

        public Criteria andD_xueliLessThanOrEqualTo(String value) {
            addCriterion("d_xueli <=", value, "d_xueli");
            return (Criteria) this;
        }

        public Criteria andD_xueliLike(String value) {
            addCriterion("d_xueli like", value, "d_xueli");
            return (Criteria) this;
        }

        public Criteria andD_xueliNotLike(String value) {
            addCriterion("d_xueli not like", value, "d_xueli");
            return (Criteria) this;
        }

        public Criteria andD_xueliIn(List<String> values) {
            addCriterion("d_xueli in", values, "d_xueli");
            return (Criteria) this;
        }

        public Criteria andD_xueliNotIn(List<String> values) {
            addCriterion("d_xueli not in", values, "d_xueli");
            return (Criteria) this;
        }

        public Criteria andD_xueliBetween(String value1, String value2) {
            addCriterion("d_xueli between", value1, value2, "d_xueli");
            return (Criteria) this;
        }

        public Criteria andD_xueliNotBetween(String value1, String value2) {
            addCriterion("d_xueli not between", value1, value2, "d_xueli");
            return (Criteria) this;
        }

        public Criteria andD_descIsNull() {
            addCriterion("d_desc is null");
            return (Criteria) this;
        }

        public Criteria andD_descIsNotNull() {
            addCriterion("d_desc is not null");
            return (Criteria) this;
        }

        public Criteria andD_descEqualTo(String value) {
            addCriterion("d_desc =", value, "d_desc");
            return (Criteria) this;
        }

        public Criteria andD_descNotEqualTo(String value) {
            addCriterion("d_desc <>", value, "d_desc");
            return (Criteria) this;
        }

        public Criteria andD_descGreaterThan(String value) {
            addCriterion("d_desc >", value, "d_desc");
            return (Criteria) this;
        }

        public Criteria andD_descGreaterThanOrEqualTo(String value) {
            addCriterion("d_desc >=", value, "d_desc");
            return (Criteria) this;
        }

        public Criteria andD_descLessThan(String value) {
            addCriterion("d_desc <", value, "d_desc");
            return (Criteria) this;
        }

        public Criteria andD_descLessThanOrEqualTo(String value) {
            addCriterion("d_desc <=", value, "d_desc");
            return (Criteria) this;
        }

        public Criteria andD_descLike(String value) {
            addCriterion("d_desc like", value, "d_desc");
            return (Criteria) this;
        }

        public Criteria andD_descNotLike(String value) {
            addCriterion("d_desc not like", value, "d_desc");
            return (Criteria) this;
        }

        public Criteria andD_descIn(List<String> values) {
            addCriterion("d_desc in", values, "d_desc");
            return (Criteria) this;
        }

        public Criteria andD_descNotIn(List<String> values) {
            addCriterion("d_desc not in", values, "d_desc");
            return (Criteria) this;
        }

        public Criteria andD_descBetween(String value1, String value2) {
            addCriterion("d_desc between", value1, value2, "d_desc");
            return (Criteria) this;
        }

        public Criteria andD_descNotBetween(String value1, String value2) {
            addCriterion("d_desc not between", value1, value2, "d_desc");
            return (Criteria) this;
        }

        public Criteria andD_intimeIsNull() {
            addCriterion("d_intime is null");
            return (Criteria) this;
        }

        public Criteria andD_intimeIsNotNull() {
            addCriterion("d_intime is not null");
            return (Criteria) this;
        }

        public Criteria andD_intimeEqualTo(Date value) {
            addCriterionForJDBCDate("d_intime =", value, "d_intime");
            return (Criteria) this;
        }

        public Criteria andD_intimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("d_intime <>", value, "d_intime");
            return (Criteria) this;
        }

        public Criteria andD_intimeGreaterThan(Date value) {
            addCriterionForJDBCDate("d_intime >", value, "d_intime");
            return (Criteria) this;
        }

        public Criteria andD_intimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("d_intime >=", value, "d_intime");
            return (Criteria) this;
        }

        public Criteria andD_intimeLessThan(Date value) {
            addCriterionForJDBCDate("d_intime <", value, "d_intime");
            return (Criteria) this;
        }

        public Criteria andD_intimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("d_intime <=", value, "d_intime");
            return (Criteria) this;
        }

        public Criteria andD_intimeIn(List<Date> values) {
            addCriterionForJDBCDate("d_intime in", values, "d_intime");
            return (Criteria) this;
        }

        public Criteria andD_intimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("d_intime not in", values, "d_intime");
            return (Criteria) this;
        }

        public Criteria andD_intimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("d_intime between", value1, value2, "d_intime");
            return (Criteria) this;
        }

        public Criteria andD_intimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("d_intime not between", value1, value2, "d_intime");
            return (Criteria) this;
        }

        public Criteria andD_stateIsNull() {
            addCriterion("d_state is null");
            return (Criteria) this;
        }

        public Criteria andD_stateIsNotNull() {
            addCriterion("d_state is not null");
            return (Criteria) this;
        }

        public Criteria andD_stateEqualTo(Integer value) {
            addCriterion("d_state =", value, "d_state");
            return (Criteria) this;
        }

        public Criteria andD_stateNotEqualTo(Integer value) {
            addCriterion("d_state <>", value, "d_state");
            return (Criteria) this;
        }

        public Criteria andD_stateGreaterThan(Integer value) {
            addCriterion("d_state >", value, "d_state");
            return (Criteria) this;
        }

        public Criteria andD_stateGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_state >=", value, "d_state");
            return (Criteria) this;
        }

        public Criteria andD_stateLessThan(Integer value) {
            addCriterion("d_state <", value, "d_state");
            return (Criteria) this;
        }

        public Criteria andD_stateLessThanOrEqualTo(Integer value) {
            addCriterion("d_state <=", value, "d_state");
            return (Criteria) this;
        }

        public Criteria andD_stateIn(List<Integer> values) {
            addCriterion("d_state in", values, "d_state");
            return (Criteria) this;
        }

        public Criteria andD_stateNotIn(List<Integer> values) {
            addCriterion("d_state not in", values, "d_state");
            return (Criteria) this;
        }

        public Criteria andD_stateBetween(Integer value1, Integer value2) {
            addCriterion("d_state between", value1, value2, "d_state");
            return (Criteria) this;
        }

        public Criteria andD_stateNotBetween(Integer value1, Integer value2) {
            addCriterion("d_state not between", value1, value2, "d_state");
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