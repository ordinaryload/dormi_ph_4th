package com.dormi.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EvaluationExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EvaluationExample() {
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

        public Criteria andEvaluationIdIsNull() {
            addCriterion("evaluation_id is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdIsNotNull() {
            addCriterion("evaluation_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdEqualTo(Integer value) {
            addCriterion("evaluation_id =", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdNotEqualTo(Integer value) {
            addCriterion("evaluation_id <>", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdGreaterThan(Integer value) {
            addCriterion("evaluation_id >", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("evaluation_id >=", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdLessThan(Integer value) {
            addCriterion("evaluation_id <", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdLessThanOrEqualTo(Integer value) {
            addCriterion("evaluation_id <=", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdIn(List<Integer> values) {
            addCriterion("evaluation_id in", values, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdNotIn(List<Integer> values) {
            addCriterion("evaluation_id not in", values, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdBetween(Integer value1, Integer value2) {
            addCriterion("evaluation_id between", value1, value2, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("evaluation_id not between", value1, value2, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationScoreIsNull() {
            addCriterion("evaluation_score is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationScoreIsNotNull() {
            addCriterion("evaluation_score is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationScoreEqualTo(Double value) {
            addCriterion("evaluation_score =", value, "evaluationScore");
            return (Criteria) this;
        }

        public Criteria andEvaluationScoreNotEqualTo(Double value) {
            addCriterion("evaluation_score <>", value, "evaluationScore");
            return (Criteria) this;
        }

        public Criteria andEvaluationScoreGreaterThan(Double value) {
            addCriterion("evaluation_score >", value, "evaluationScore");
            return (Criteria) this;
        }

        public Criteria andEvaluationScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("evaluation_score >=", value, "evaluationScore");
            return (Criteria) this;
        }

        public Criteria andEvaluationScoreLessThan(Double value) {
            addCriterion("evaluation_score <", value, "evaluationScore");
            return (Criteria) this;
        }

        public Criteria andEvaluationScoreLessThanOrEqualTo(Double value) {
            addCriterion("evaluation_score <=", value, "evaluationScore");
            return (Criteria) this;
        }

        public Criteria andEvaluationScoreIn(List<Double> values) {
            addCriterion("evaluation_score in", values, "evaluationScore");
            return (Criteria) this;
        }

        public Criteria andEvaluationScoreNotIn(List<Double> values) {
            addCriterion("evaluation_score not in", values, "evaluationScore");
            return (Criteria) this;
        }

        public Criteria andEvaluationScoreBetween(Double value1, Double value2) {
            addCriterion("evaluation_score between", value1, value2, "evaluationScore");
            return (Criteria) this;
        }

        public Criteria andEvaluationScoreNotBetween(Double value1, Double value2) {
            addCriterion("evaluation_score not between", value1, value2, "evaluationScore");
            return (Criteria) this;
        }

        public Criteria andEvaluationDateIsNull() {
            addCriterion("evaluation_date is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationDateIsNotNull() {
            addCriterion("evaluation_date is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationDateEqualTo(Date value) {
            addCriterionForJDBCDate("evaluation_date =", value, "evaluationDate");
            return (Criteria) this;
        }

        public Criteria andEvaluationDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("evaluation_date <>", value, "evaluationDate");
            return (Criteria) this;
        }

        public Criteria andEvaluationDateGreaterThan(Date value) {
            addCriterionForJDBCDate("evaluation_date >", value, "evaluationDate");
            return (Criteria) this;
        }

        public Criteria andEvaluationDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("evaluation_date >=", value, "evaluationDate");
            return (Criteria) this;
        }

        public Criteria andEvaluationDateLessThan(Date value) {
            addCriterionForJDBCDate("evaluation_date <", value, "evaluationDate");
            return (Criteria) this;
        }

        public Criteria andEvaluationDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("evaluation_date <=", value, "evaluationDate");
            return (Criteria) this;
        }

        public Criteria andEvaluationDateIn(List<Date> values) {
            addCriterionForJDBCDate("evaluation_date in", values, "evaluationDate");
            return (Criteria) this;
        }

        public Criteria andEvaluationDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("evaluation_date not in", values, "evaluationDate");
            return (Criteria) this;
        }

        public Criteria andEvaluationDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("evaluation_date between", value1, value2, "evaluationDate");
            return (Criteria) this;
        }

        public Criteria andEvaluationDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("evaluation_date not between", value1, value2, "evaluationDate");
            return (Criteria) this;
        }

        public Criteria andDormNumberIsNull() {
            addCriterion("dorm_number is null");
            return (Criteria) this;
        }

        public Criteria andDormNumberIsNotNull() {
            addCriterion("dorm_number is not null");
            return (Criteria) this;
        }

        public Criteria andDormNumberEqualTo(String value) {
            addCriterion("dorm_number =", value, "dormNumber");
            return (Criteria) this;
        }

        public Criteria andDormNumberNotEqualTo(String value) {
            addCriterion("dorm_number <>", value, "dormNumber");
            return (Criteria) this;
        }

        public Criteria andDormNumberGreaterThan(String value) {
            addCriterion("dorm_number >", value, "dormNumber");
            return (Criteria) this;
        }

        public Criteria andDormNumberGreaterThanOrEqualTo(String value) {
            addCriterion("dorm_number >=", value, "dormNumber");
            return (Criteria) this;
        }

        public Criteria andDormNumberLessThan(String value) {
            addCriterion("dorm_number <", value, "dormNumber");
            return (Criteria) this;
        }

        public Criteria andDormNumberLessThanOrEqualTo(String value) {
            addCriterion("dorm_number <=", value, "dormNumber");
            return (Criteria) this;
        }

        public Criteria andDormNumberLike(String value) {
            addCriterion("dorm_number like", value, "dormNumber");
            return (Criteria) this;
        }

        public Criteria andDormNumberNotLike(String value) {
            addCriterion("dorm_number not like", value, "dormNumber");
            return (Criteria) this;
        }

        public Criteria andDormNumberIn(List<String> values) {
            addCriterion("dorm_number in", values, "dormNumber");
            return (Criteria) this;
        }

        public Criteria andDormNumberNotIn(List<String> values) {
            addCriterion("dorm_number not in", values, "dormNumber");
            return (Criteria) this;
        }

        public Criteria andDormNumberBetween(String value1, String value2) {
            addCriterion("dorm_number between", value1, value2, "dormNumber");
            return (Criteria) this;
        }

        public Criteria andDormNumberNotBetween(String value1, String value2) {
            addCriterion("dorm_number not between", value1, value2, "dormNumber");
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