package com.dormi.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RegistrationExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RegistrationExample() {
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

        public Criteria andRegistrationIdIsNull() {
            addCriterion("registration_id is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdIsNotNull() {
            addCriterion("registration_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdEqualTo(Integer value) {
            addCriterion("registration_id =", value, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdNotEqualTo(Integer value) {
            addCriterion("registration_id <>", value, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdGreaterThan(Integer value) {
            addCriterion("registration_id >", value, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("registration_id >=", value, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdLessThan(Integer value) {
            addCriterion("registration_id <", value, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdLessThanOrEqualTo(Integer value) {
            addCriterion("registration_id <=", value, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdIn(List<Integer> values) {
            addCriterion("registration_id in", values, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdNotIn(List<Integer> values) {
            addCriterion("registration_id not in", values, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdBetween(Integer value1, Integer value2) {
            addCriterion("registration_id between", value1, value2, "registrationId");
            return (Criteria) this;
        }

        public Criteria andRegistrationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("registration_id not between", value1, value2, "registrationId");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNull() {
            addCriterion("student_name is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("student_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("student_name =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("student_name <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("student_name >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("student_name >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("student_name <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("student_name <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("student_name like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("student_name not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("student_name in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("student_name not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("student_name between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("student_name not between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentMajorIsNull() {
            addCriterion("student_major is null");
            return (Criteria) this;
        }

        public Criteria andStudentMajorIsNotNull() {
            addCriterion("student_major is not null");
            return (Criteria) this;
        }

        public Criteria andStudentMajorEqualTo(String value) {
            addCriterion("student_major =", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorNotEqualTo(String value) {
            addCriterion("student_major <>", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorGreaterThan(String value) {
            addCriterion("student_major >", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorGreaterThanOrEqualTo(String value) {
            addCriterion("student_major >=", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorLessThan(String value) {
            addCriterion("student_major <", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorLessThanOrEqualTo(String value) {
            addCriterion("student_major <=", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorLike(String value) {
            addCriterion("student_major like", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorNotLike(String value) {
            addCriterion("student_major not like", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorIn(List<String> values) {
            addCriterion("student_major in", values, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorNotIn(List<String> values) {
            addCriterion("student_major not in", values, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorBetween(String value1, String value2) {
            addCriterion("student_major between", value1, value2, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorNotBetween(String value1, String value2) {
            addCriterion("student_major not between", value1, value2, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentCardIsNull() {
            addCriterion("student_card is null");
            return (Criteria) this;
        }

        public Criteria andStudentCardIsNotNull() {
            addCriterion("student_card is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCardEqualTo(String value) {
            addCriterion("student_card =", value, "studentCard");
            return (Criteria) this;
        }

        public Criteria andStudentCardNotEqualTo(String value) {
            addCriterion("student_card <>", value, "studentCard");
            return (Criteria) this;
        }

        public Criteria andStudentCardGreaterThan(String value) {
            addCriterion("student_card >", value, "studentCard");
            return (Criteria) this;
        }

        public Criteria andStudentCardGreaterThanOrEqualTo(String value) {
            addCriterion("student_card >=", value, "studentCard");
            return (Criteria) this;
        }

        public Criteria andStudentCardLessThan(String value) {
            addCriterion("student_card <", value, "studentCard");
            return (Criteria) this;
        }

        public Criteria andStudentCardLessThanOrEqualTo(String value) {
            addCriterion("student_card <=", value, "studentCard");
            return (Criteria) this;
        }

        public Criteria andStudentCardLike(String value) {
            addCriterion("student_card like", value, "studentCard");
            return (Criteria) this;
        }

        public Criteria andStudentCardNotLike(String value) {
            addCriterion("student_card not like", value, "studentCard");
            return (Criteria) this;
        }

        public Criteria andStudentCardIn(List<String> values) {
            addCriterion("student_card in", values, "studentCard");
            return (Criteria) this;
        }

        public Criteria andStudentCardNotIn(List<String> values) {
            addCriterion("student_card not in", values, "studentCard");
            return (Criteria) this;
        }

        public Criteria andStudentCardBetween(String value1, String value2) {
            addCriterion("student_card between", value1, value2, "studentCard");
            return (Criteria) this;
        }

        public Criteria andStudentCardNotBetween(String value1, String value2) {
            addCriterion("student_card not between", value1, value2, "studentCard");
            return (Criteria) this;
        }

        public Criteria andRegistrationMarksIsNull() {
            addCriterion("registration_marks is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationMarksIsNotNull() {
            addCriterion("registration_marks is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationMarksEqualTo(String value) {
            addCriterion("registration_marks =", value, "registrationMarks");
            return (Criteria) this;
        }

        public Criteria andRegistrationMarksNotEqualTo(String value) {
            addCriterion("registration_marks <>", value, "registrationMarks");
            return (Criteria) this;
        }

        public Criteria andRegistrationMarksGreaterThan(String value) {
            addCriterion("registration_marks >", value, "registrationMarks");
            return (Criteria) this;
        }

        public Criteria andRegistrationMarksGreaterThanOrEqualTo(String value) {
            addCriterion("registration_marks >=", value, "registrationMarks");
            return (Criteria) this;
        }

        public Criteria andRegistrationMarksLessThan(String value) {
            addCriterion("registration_marks <", value, "registrationMarks");
            return (Criteria) this;
        }

        public Criteria andRegistrationMarksLessThanOrEqualTo(String value) {
            addCriterion("registration_marks <=", value, "registrationMarks");
            return (Criteria) this;
        }

        public Criteria andRegistrationMarksLike(String value) {
            addCriterion("registration_marks like", value, "registrationMarks");
            return (Criteria) this;
        }

        public Criteria andRegistrationMarksNotLike(String value) {
            addCriterion("registration_marks not like", value, "registrationMarks");
            return (Criteria) this;
        }

        public Criteria andRegistrationMarksIn(List<String> values) {
            addCriterion("registration_marks in", values, "registrationMarks");
            return (Criteria) this;
        }

        public Criteria andRegistrationMarksNotIn(List<String> values) {
            addCriterion("registration_marks not in", values, "registrationMarks");
            return (Criteria) this;
        }

        public Criteria andRegistrationMarksBetween(String value1, String value2) {
            addCriterion("registration_marks between", value1, value2, "registrationMarks");
            return (Criteria) this;
        }

        public Criteria andRegistrationMarksNotBetween(String value1, String value2) {
            addCriterion("registration_marks not between", value1, value2, "registrationMarks");
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

        public Criteria andRegistrationDateIsNull() {
            addCriterion("registration_date is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateIsNotNull() {
            addCriterion("registration_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateEqualTo(Date value) {
            addCriterionForJDBCDate("registration_date =", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("registration_date <>", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateGreaterThan(Date value) {
            addCriterionForJDBCDate("registration_date >", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("registration_date >=", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateLessThan(Date value) {
            addCriterionForJDBCDate("registration_date <", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("registration_date <=", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateIn(List<Date> values) {
            addCriterionForJDBCDate("registration_date in", values, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("registration_date not in", values, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("registration_date between", value1, value2, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("registration_date not between", value1, value2, "registrationDate");
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