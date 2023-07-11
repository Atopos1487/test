package com.kkb.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BehospitalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BehospitalExample() {
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

        public Criteria andBeh_idIsNull() {
            addCriterion("beh_id is null");
            return (Criteria) this;
        }

        public Criteria andBeh_idIsNotNull() {
            addCriterion("beh_id is not null");
            return (Criteria) this;
        }

        public Criteria andBeh_idEqualTo(Integer value) {
            addCriterion("beh_id =", value, "beh_id");
            return (Criteria) this;
        }
        public Criteria andHosr_idEqualTo(Integer value) {
            addCriterion("hosr_id =", value, "hosr_id");
            return (Criteria) this;
        }

        public Criteria andBeh_idNotEqualTo(Integer value) {
            addCriterion("beh_id <>", value, "beh_id");
            return (Criteria) this;
        }

        public Criteria andBeh_idGreaterThan(Integer value) {
            addCriterion("beh_id >", value, "beh_id");
            return (Criteria) this;
        }

        public Criteria andBeh_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("beh_id >=", value, "beh_id");
            return (Criteria) this;
        }

        public Criteria andBeh_idLessThan(Integer value) {
            addCriterion("beh_id <", value, "beh_id");
            return (Criteria) this;
        }

        public Criteria andBeh_idLessThanOrEqualTo(Integer value) {
            addCriterion("beh_id <=", value, "beh_id");
            return (Criteria) this;
        }

        public Criteria andBeh_idIn(List<Integer> values) {
            addCriterion("beh_id in", values, "beh_id");
            return (Criteria) this;
        }

        public Criteria andBeh_idNotIn(List<Integer> values) {
            addCriterion("beh_id not in", values, "beh_id");
            return (Criteria) this;
        }

        public Criteria andBeh_idBetween(Integer value1, Integer value2) {
            addCriterion("beh_id between", value1, value2, "beh_id");
            return (Criteria) this;
        }

        public Criteria andBeh_idNotBetween(Integer value1, Integer value2) {
            addCriterion("beh_id not between", value1, value2, "beh_id");
            return (Criteria) this;
        }

        public Criteria andBeh_nameIsNull() {
            addCriterion("beh_name is null");
            return (Criteria) this;
        }

        public Criteria andBeh_nameIsNotNull() {
            addCriterion("beh_name is not null");
            return (Criteria) this;
        }

        public Criteria andBeh_nameEqualTo(String value) {
            addCriterion("beh_name =", value, "beh_name");
            return (Criteria) this;
        }

        public Criteria andBeh_nameNotEqualTo(String value) {
            addCriterion("beh_name <>", value, "beh_name");
            return (Criteria) this;
        }

        public Criteria andBeh_nameGreaterThan(String value) {
            addCriterion("beh_name >", value, "beh_name");
            return (Criteria) this;
        }

        public Criteria andBeh_nameGreaterThanOrEqualTo(String value) {
            addCriterion("beh_name >=", value, "beh_name");
            return (Criteria) this;
        }

        public Criteria andBeh_nameLessThan(String value) {
            addCriterion("beh_name <", value, "beh_name");
            return (Criteria) this;
        }

        public Criteria andBeh_nameLessThanOrEqualTo(String value) {
            addCriterion("beh_name <=", value, "beh_name");
            return (Criteria) this;
        }

        public Criteria andBeh_nameLike(String value) {
            addCriterion("beh_name like", value, "beh_name");
            return (Criteria) this;
        }

        public Criteria andBeh_nameNotLike(String value) {
            addCriterion("beh_name not like", value, "beh_name");
            return (Criteria) this;
        }

        public Criteria andBeh_nameIn(List<String> values) {
            addCriterion("beh_name in", values, "beh_name");
            return (Criteria) this;
        }

        public Criteria andBeh_nameNotIn(List<String> values) {
            addCriterion("beh_name not in", values, "beh_name");
            return (Criteria) this;
        }

        public Criteria andBeh_nameBetween(String value1, String value2) {
            addCriterion("beh_name between", value1, value2, "beh_name");
            return (Criteria) this;
        }

        public Criteria andBeh_nameNotBetween(String value1, String value2) {
            addCriterion("beh_name not between", value1, value2, "beh_name");
            return (Criteria) this;
        }

        public Criteria andBeh_nursePeopleIsNull() {
            addCriterion("beh_nursePeople is null");
            return (Criteria) this;
        }

        public Criteria andBeh_nursePeopleIsNotNull() {
            addCriterion("beh_nursePeople is not null");
            return (Criteria) this;
        }

        public Criteria andBeh_nursePeopleEqualTo(String value) {
            addCriterion("beh_nursePeople =", value, "beh_nursePeople");
            return (Criteria) this;
        }

        public Criteria andBeh_nursePeopleNotEqualTo(String value) {
            addCriterion("beh_nursePeople <>", value, "beh_nursePeople");
            return (Criteria) this;
        }

        public Criteria andBeh_nursePeopleGreaterThan(String value) {
            addCriterion("beh_nursePeople >", value, "beh_nursePeople");
            return (Criteria) this;
        }

        public Criteria andBeh_nursePeopleGreaterThanOrEqualTo(String value) {
            addCriterion("beh_nursePeople >=", value, "beh_nursePeople");
            return (Criteria) this;
        }

        public Criteria andBeh_nursePeopleLessThan(String value) {
            addCriterion("beh_nursePeople <", value, "beh_nursePeople");
            return (Criteria) this;
        }

        public Criteria andBeh_nursePeopleLessThanOrEqualTo(String value) {
            addCriterion("beh_nursePeople <=", value, "beh_nursePeople");
            return (Criteria) this;
        }

        public Criteria andBeh_nursePeopleLike(String value) {
            addCriterion("beh_nursePeople like", value, "beh_nursePeople");
            return (Criteria) this;
        }

        public Criteria andBeh_nursePeopleNotLike(String value) {
            addCriterion("beh_nursePeople not like", value, "beh_nursePeople");
            return (Criteria) this;
        }

        public Criteria andBeh_nursePeopleIn(List<String> values) {
            addCriterion("beh_nursePeople in", values, "beh_nursePeople");
            return (Criteria) this;
        }

        public Criteria andBeh_nursePeopleNotIn(List<String> values) {
            addCriterion("beh_nursePeople not in", values, "beh_nursePeople");
            return (Criteria) this;
        }

        public Criteria andBeh_nursePeopleBetween(String value1, String value2) {
            addCriterion("beh_nursePeople between", value1, value2, "beh_nursePeople");
            return (Criteria) this;
        }

        public Criteria andBeh_nursePeopleNotBetween(String value1, String value2) {
            addCriterion("beh_nursePeople not between", value1, value2, "beh_nursePeople");
            return (Criteria) this;
        }

        public Criteria andBeh_patbedIsNull() {
            addCriterion("beh_patbed is null");
            return (Criteria) this;
        }

        public Criteria andBeh_patbedIsNotNull() {
            addCriterion("beh_patbed is not null");
            return (Criteria) this;
        }

        public Criteria andBeh_patbedEqualTo(String value) {
            addCriterion("beh_patbed =", value, "beh_patbed");
            return (Criteria) this;
        }

        public Criteria andBeh_patbedNotEqualTo(String value) {
            addCriterion("beh_patbed <>", value, "beh_patbed");
            return (Criteria) this;
        }

        public Criteria andBeh_patbedGreaterThan(String value) {
            addCriterion("beh_patbed >", value, "beh_patbed");
            return (Criteria) this;
        }

        public Criteria andBeh_patbedGreaterThanOrEqualTo(String value) {
            addCriterion("beh_patbed >=", value, "beh_patbed");
            return (Criteria) this;
        }

        public Criteria andBeh_patbedLessThan(String value) {
            addCriterion("beh_patbed <", value, "beh_patbed");
            return (Criteria) this;
        }

        public Criteria andBeh_patbedLessThanOrEqualTo(String value) {
            addCriterion("beh_patbed <=", value, "beh_patbed");
            return (Criteria) this;
        }

        public Criteria andBeh_patbedLike(String value) {
            addCriterion("beh_patbed like", value, "beh_patbed");
            return (Criteria) this;
        }

        public Criteria andBeh_patbedNotLike(String value) {
            addCriterion("beh_patbed not like", value, "beh_patbed");
            return (Criteria) this;
        }

        public Criteria andBeh_patbedIn(List<String> values) {
            addCriterion("beh_patbed in", values, "beh_patbed");
            return (Criteria) this;
        }

        public Criteria andBeh_patbedNotIn(List<String> values) {
            addCriterion("beh_patbed not in", values, "beh_patbed");
            return (Criteria) this;
        }

        public Criteria andBeh_patbedBetween(String value1, String value2) {
            addCriterion("beh_patbed between", value1, value2, "beh_patbed");
            return (Criteria) this;
        }

        public Criteria andBeh_patbedNotBetween(String value1, String value2) {
            addCriterion("beh_patbed not between", value1, value2, "beh_patbed");
            return (Criteria) this;
        }

        public Criteria andBeh_antecedentIsNull() {
            addCriterion("beh_antecedent is null");
            return (Criteria) this;
        }

        public Criteria andBeh_antecedentIsNotNull() {
            addCriterion("beh_antecedent is not null");
            return (Criteria) this;
        }

        public Criteria andBeh_antecedentEqualTo(Integer value) {
            addCriterion("beh_antecedent =", value, "beh_antecedent");
            return (Criteria) this;
        }

        public Criteria andBeh_antecedentNotEqualTo(Integer value) {
            addCriterion("beh_antecedent <>", value, "beh_antecedent");
            return (Criteria) this;
        }

        public Criteria andBeh_antecedentGreaterThan(Integer value) {
            addCriterion("beh_antecedent >", value, "beh_antecedent");
            return (Criteria) this;
        }

        public Criteria andBeh_antecedentGreaterThanOrEqualTo(Integer value) {
            addCriterion("beh_antecedent >=", value, "beh_antecedent");
            return (Criteria) this;
        }

        public Criteria andBeh_antecedentLessThan(Integer value) {
            addCriterion("beh_antecedent <", value, "beh_antecedent");
            return (Criteria) this;
        }

        public Criteria andBeh_antecedentLessThanOrEqualTo(Integer value) {
            addCriterion("beh_antecedent <=", value, "beh_antecedent");
            return (Criteria) this;
        }

        public Criteria andBeh_antecedentIn(List<Integer> values) {
            addCriterion("beh_antecedent in", values, "beh_antecedent");
            return (Criteria) this;
        }

        public Criteria andBeh_antecedentNotIn(List<Integer> values) {
            addCriterion("beh_antecedent not in", values, "beh_antecedent");
            return (Criteria) this;
        }

        public Criteria andBeh_antecedentBetween(Integer value1, Integer value2) {
            addCriterion("beh_antecedent between", value1, value2, "beh_antecedent");
            return (Criteria) this;
        }

        public Criteria andBeh_antecedentNotBetween(Integer value1, Integer value2) {
            addCriterion("beh_antecedent not between", value1, value2, "beh_antecedent");
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

        public Criteria andBeh_intimeIsNull() {
            addCriterion("beh_intime is null");
            return (Criteria) this;
        }

        public Criteria andBeh_intimeIsNotNull() {
            addCriterion("beh_intime is not null");
            return (Criteria) this;
        }

        public Criteria andBeh_intimeEqualTo(Date value) {
            addCriterionForJDBCDate("beh_intime =", value, "beh_intime");
            return (Criteria) this;
        }

        public Criteria andBeh_intimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("beh_intime <>", value, "beh_intime");
            return (Criteria) this;
        }

        public Criteria andBeh_intimeGreaterThan(Date value) {
            addCriterionForJDBCDate("beh_intime >", value, "beh_intime");
            return (Criteria) this;
        }

        public Criteria andBeh_intimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("beh_intime >=", value, "beh_intime");
            return (Criteria) this;
        }

        public Criteria andBeh_intimeLessThan(Date value) {
            addCriterionForJDBCDate("beh_intime <", value, "beh_intime");
            return (Criteria) this;
        }

        public Criteria andBeh_intimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("beh_intime <=", value, "beh_intime");
            return (Criteria) this;
        }

        public Criteria andBeh_intimeIn(List<Date> values) {
            addCriterionForJDBCDate("beh_intime in", values, "beh_intime");
            return (Criteria) this;
        }

        public Criteria andBeh_intimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("beh_intime not in", values, "beh_intime");
            return (Criteria) this;
        }

        public Criteria andBeh_intimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("beh_intime between", value1, value2, "beh_intime");
            return (Criteria) this;
        }

        public Criteria andBeh_intimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("beh_intime not between", value1, value2, "beh_intime");
            return (Criteria) this;
        }

        public Criteria andBeh_illnessIsNull() {
            addCriterion("beh_illness is null");
            return (Criteria) this;
        }

        public Criteria andBeh_illnessIsNotNull() {
            addCriterion("beh_illness is not null");
            return (Criteria) this;
        }

        public Criteria andBeh_illnessEqualTo(String value) {
            addCriterion("beh_illness =", value, "beh_illness");
            return (Criteria) this;
        }

        public Criteria andBeh_illnessNotEqualTo(String value) {
            addCriterion("beh_illness <>", value, "beh_illness");
            return (Criteria) this;
        }

        public Criteria andBeh_illnessGreaterThan(String value) {
            addCriterion("beh_illness >", value, "beh_illness");
            return (Criteria) this;
        }

        public Criteria andBeh_illnessGreaterThanOrEqualTo(String value) {
            addCriterion("beh_illness >=", value, "beh_illness");
            return (Criteria) this;
        }

        public Criteria andBeh_illnessLessThan(String value) {
            addCriterion("beh_illness <", value, "beh_illness");
            return (Criteria) this;
        }

        public Criteria andBeh_illnessLessThanOrEqualTo(String value) {
            addCriterion("beh_illness <=", value, "beh_illness");
            return (Criteria) this;
        }

        public Criteria andBeh_illnessLike(String value) {
            addCriterion("beh_illness like", value, "beh_illness");
            return (Criteria) this;
        }

        public Criteria andBeh_illnessNotLike(String value) {
            addCriterion("beh_illness not like", value, "beh_illness");
            return (Criteria) this;
        }

        public Criteria andBeh_illnessIn(List<String> values) {
            addCriterion("beh_illness in", values, "beh_illness");
            return (Criteria) this;
        }

        public Criteria andBeh_illnessNotIn(List<String> values) {
            addCriterion("beh_illness not in", values, "beh_illness");
            return (Criteria) this;
        }

        public Criteria andBeh_illnessBetween(String value1, String value2) {
            addCriterion("beh_illness between", value1, value2, "beh_illness");
            return (Criteria) this;
        }

        public Criteria andBeh_illnessNotBetween(String value1, String value2) {
            addCriterion("beh_illness not between", value1, value2, "beh_illness");
            return (Criteria) this;
        }

        public Criteria andBeh_closepriceIsNull() {
            addCriterion("beh_closeprice is null");
            return (Criteria) this;
        }

        public Criteria andBeh_closepriceIsNotNull() {
            addCriterion("beh_closeprice is not null");
            return (Criteria) this;
        }

        public Criteria andBeh_closepriceEqualTo(Integer value) {
            addCriterion("beh_closeprice =", value, "beh_closeprice");
            return (Criteria) this;
        }

        public Criteria andBeh_closepriceNotEqualTo(Integer value) {
            addCriterion("beh_closeprice <>", value, "beh_closeprice");
            return (Criteria) this;
        }

        public Criteria andBeh_closepriceGreaterThan(Integer value) {
            addCriterion("beh_closeprice >", value, "beh_closeprice");
            return (Criteria) this;
        }

        public Criteria andBeh_closepriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("beh_closeprice >=", value, "beh_closeprice");
            return (Criteria) this;
        }

        public Criteria andBeh_closepriceLessThan(Integer value) {
            addCriterion("beh_closeprice <", value, "beh_closeprice");
            return (Criteria) this;
        }

        public Criteria andBeh_closepriceLessThanOrEqualTo(Integer value) {
            addCriterion("beh_closeprice <=", value, "beh_closeprice");
            return (Criteria) this;
        }

        public Criteria andBeh_closepriceIn(List<Integer> values) {
            addCriterion("beh_closeprice in", values, "beh_closeprice");
            return (Criteria) this;
        }

        public Criteria andBeh_closepriceNotIn(List<Integer> values) {
            addCriterion("beh_closeprice not in", values, "beh_closeprice");
            return (Criteria) this;
        }

        public Criteria andBeh_closepriceBetween(Integer value1, Integer value2) {
            addCriterion("beh_closeprice between", value1, value2, "beh_closeprice");
            return (Criteria) this;
        }

        public Criteria andBeh_closepriceNotBetween(Integer value1, Integer value2) {
            addCriterion("beh_closeprice not between", value1, value2, "beh_closeprice");
            return (Criteria) this;
        }

        public Criteria andBeh_stateIsNull() {
            addCriterion("beh_state is null");
            return (Criteria) this;
        }

        public Criteria andBeh_stateIsNotNull() {
            addCriterion("beh_state is not null");
            return (Criteria) this;
        }

        public Criteria andBeh_stateEqualTo(Integer value) {
            addCriterion("beh_state =", value, "beh_state");
            return (Criteria) this;
        }

        public Criteria andBeh_stateNotEqualTo(Integer value) {
            addCriterion("beh_state <>", value, "beh_state");
            return (Criteria) this;
        }

        public Criteria andBeh_stateGreaterThan(Integer value) {
            addCriterion("beh_state >", value, "beh_state");
            return (Criteria) this;
        }

        public Criteria andBeh_stateGreaterThanOrEqualTo(Integer value) {
            addCriterion("beh_state >=", value, "beh_state");
            return (Criteria) this;
        }

        public Criteria andBeh_stateLessThan(Integer value) {
            addCriterion("beh_state <", value, "beh_state");
            return (Criteria) this;
        }

        public Criteria andBeh_stateLessThanOrEqualTo(Integer value) {
            addCriterion("beh_state <=", value, "beh_state");
            return (Criteria) this;
        }

        public Criteria andBeh_stateIn(List<Integer> values) {
            addCriterion("beh_state in", values, "beh_state");
            return (Criteria) this;
        }

        public Criteria andBeh_stateNotIn(List<Integer> values) {
            addCriterion("beh_state not in", values, "beh_state");
            return (Criteria) this;
        }

        public Criteria andBeh_stateBetween(Integer value1, Integer value2) {
            addCriterion("beh_state between", value1, value2, "beh_state");
            return (Criteria) this;
        }

        public Criteria andBeh_stateNotBetween(Integer value1, Integer value2) {
            addCriterion("beh_state not between", value1, value2, "beh_state");
            return (Criteria) this;
        }

        public Criteria andBeh_depIsNull() {
            addCriterion("beh_dep is null");
            return (Criteria) this;
        }

        public Criteria andBeh_depIsNotNull() {
            addCriterion("beh_dep is not null");
            return (Criteria) this;
        }

        public Criteria andBeh_depEqualTo(Integer value) {
            addCriterion("beh_dep =", value, "beh_dep");
            return (Criteria) this;
        }

        public Criteria andBeh_depNotEqualTo(Integer value) {
            addCriterion("beh_dep <>", value, "beh_dep");
            return (Criteria) this;
        }

        public Criteria andBeh_depGreaterThan(Integer value) {
            addCriterion("beh_dep >", value, "beh_dep");
            return (Criteria) this;
        }

        public Criteria andBeh_depGreaterThanOrEqualTo(Integer value) {
            addCriterion("beh_dep >=", value, "beh_dep");
            return (Criteria) this;
        }

        public Criteria andBeh_depLessThan(Integer value) {
            addCriterion("beh_dep <", value, "beh_dep");
            return (Criteria) this;
        }

        public Criteria andBeh_depLessThanOrEqualTo(Integer value) {
            addCriterion("beh_dep <=", value, "beh_dep");
            return (Criteria) this;
        }

        public Criteria andBeh_depIn(List<Integer> values) {
            addCriterion("beh_dep in", values, "beh_dep");
            return (Criteria) this;
        }

        public Criteria andBeh_depNotIn(List<Integer> values) {
            addCriterion("beh_dep not in", values, "beh_dep");
            return (Criteria) this;
        }

        public Criteria andBeh_depBetween(Integer value1, Integer value2) {
            addCriterion("beh_dep between", value1, value2, "beh_dep");
            return (Criteria) this;
        }

        public Criteria andBeh_depNotBetween(Integer value1, Integer value2) {
            addCriterion("beh_dep not between", value1, value2, "beh_dep");
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