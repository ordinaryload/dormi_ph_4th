package com.dormi.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class NoticeExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoticeExample() {
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

        public Criteria andNoticeIdIsNull() {
            addCriterion("notice_id is null");
            return (Criteria) this;
        }

        public Criteria andNoticeIdIsNotNull() {
            addCriterion("notice_id is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeIdEqualTo(Integer value) {
            addCriterion("notice_id =", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotEqualTo(Integer value) {
            addCriterion("notice_id <>", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdGreaterThan(Integer value) {
            addCriterion("notice_id >", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("notice_id >=", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdLessThan(Integer value) {
            addCriterion("notice_id <", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdLessThanOrEqualTo(Integer value) {
            addCriterion("notice_id <=", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdIn(List<Integer> values) {
            addCriterion("notice_id in", values, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotIn(List<Integer> values) {
            addCriterion("notice_id not in", values, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdBetween(Integer value1, Integer value2) {
            addCriterion("notice_id between", value1, value2, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("notice_id not between", value1, value2, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeFileIsNull() {
            addCriterion("notice_file is null");
            return (Criteria) this;
        }

        public Criteria andNoticeFileIsNotNull() {
            addCriterion("notice_file is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeFileEqualTo(String value) {
            addCriterion("notice_file =", value, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andNoticeFileNotEqualTo(String value) {
            addCriterion("notice_file <>", value, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andNoticeFileGreaterThan(String value) {
            addCriterion("notice_file >", value, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andNoticeFileGreaterThanOrEqualTo(String value) {
            addCriterion("notice_file >=", value, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andNoticeFileLessThan(String value) {
            addCriterion("notice_file <", value, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andNoticeFileLessThanOrEqualTo(String value) {
            addCriterion("notice_file <=", value, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andNoticeFileLike(String value) {
            addCriterion("notice_file like", value, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andNoticeFileNotLike(String value) {
            addCriterion("notice_file not like", value, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andNoticeFileIn(List<String> values) {
            addCriterion("notice_file in", values, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andNoticeFileNotIn(List<String> values) {
            addCriterion("notice_file not in", values, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andNoticeFileBetween(String value1, String value2) {
            addCriterion("notice_file between", value1, value2, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andNoticeFileNotBetween(String value1, String value2) {
            addCriterion("notice_file not between", value1, value2, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleIsNull() {
            addCriterion("notice_title is null");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleIsNotNull() {
            addCriterion("notice_title is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleEqualTo(String value) {
            addCriterion("notice_title =", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotEqualTo(String value) {
            addCriterion("notice_title <>", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleGreaterThan(String value) {
            addCriterion("notice_title >", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleGreaterThanOrEqualTo(String value) {
            addCriterion("notice_title >=", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleLessThan(String value) {
            addCriterion("notice_title <", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleLessThanOrEqualTo(String value) {
            addCriterion("notice_title <=", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleLike(String value) {
            addCriterion("notice_title like", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotLike(String value) {
            addCriterion("notice_title not like", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleIn(List<String> values) {
            addCriterion("notice_title in", values, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotIn(List<String> values) {
            addCriterion("notice_title not in", values, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleBetween(String value1, String value2) {
            addCriterion("notice_title between", value1, value2, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotBetween(String value1, String value2) {
            addCriterion("notice_title not between", value1, value2, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeDescIsNull() {
            addCriterion("notice_desc is null");
            return (Criteria) this;
        }

        public Criteria andNoticeDescIsNotNull() {
            addCriterion("notice_desc is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeDescEqualTo(String value) {
            addCriterion("notice_desc =", value, "noticeDesc");
            return (Criteria) this;
        }

        public Criteria andNoticeDescNotEqualTo(String value) {
            addCriterion("notice_desc <>", value, "noticeDesc");
            return (Criteria) this;
        }

        public Criteria andNoticeDescGreaterThan(String value) {
            addCriterion("notice_desc >", value, "noticeDesc");
            return (Criteria) this;
        }

        public Criteria andNoticeDescGreaterThanOrEqualTo(String value) {
            addCriterion("notice_desc >=", value, "noticeDesc");
            return (Criteria) this;
        }

        public Criteria andNoticeDescLessThan(String value) {
            addCriterion("notice_desc <", value, "noticeDesc");
            return (Criteria) this;
        }

        public Criteria andNoticeDescLessThanOrEqualTo(String value) {
            addCriterion("notice_desc <=", value, "noticeDesc");
            return (Criteria) this;
        }

        public Criteria andNoticeDescLike(String value) {
            addCriterion("notice_desc like", value, "noticeDesc");
            return (Criteria) this;
        }

        public Criteria andNoticeDescNotLike(String value) {
            addCriterion("notice_desc not like", value, "noticeDesc");
            return (Criteria) this;
        }

        public Criteria andNoticeDescIn(List<String> values) {
            addCriterion("notice_desc in", values, "noticeDesc");
            return (Criteria) this;
        }

        public Criteria andNoticeDescNotIn(List<String> values) {
            addCriterion("notice_desc not in", values, "noticeDesc");
            return (Criteria) this;
        }

        public Criteria andNoticeDescBetween(String value1, String value2) {
            addCriterion("notice_desc between", value1, value2, "noticeDesc");
            return (Criteria) this;
        }

        public Criteria andNoticeDescNotBetween(String value1, String value2) {
            addCriterion("notice_desc not between", value1, value2, "noticeDesc");
            return (Criteria) this;
        }

        public Criteria andNoticeDateIsNull() {
            addCriterion("notice_date is null");
            return (Criteria) this;
        }

        public Criteria andNoticeDateIsNotNull() {
            addCriterion("notice_date is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeDateEqualTo(Date value) {
            addCriterionForJDBCDate("notice_date =", value, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("notice_date <>", value, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateGreaterThan(Date value) {
            addCriterionForJDBCDate("notice_date >", value, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("notice_date >=", value, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateLessThan(Date value) {
            addCriterionForJDBCDate("notice_date <", value, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("notice_date <=", value, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateIn(List<Date> values) {
            addCriterionForJDBCDate("notice_date in", values, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("notice_date not in", values, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("notice_date between", value1, value2, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("notice_date not between", value1, value2, "noticeDate");
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