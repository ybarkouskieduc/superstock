/*
 * This file is generated by jOOQ.
 */
package com.wldrmnd.superstock.domain.tables.records;


import com.wldrmnd.superstock.domain.tables.BankExchangeTransaction;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BankExchangeTransactionRecord extends UpdatableRecordImpl<BankExchangeTransactionRecord> implements Record11<Long, Long, Long, String, String, BigDecimal, BigDecimal, BigDecimal, Timestamp, BigDecimal, Timestamp> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>superstock.bank_exchange_transaction.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>superstock.bank_exchange_transaction.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>superstock.bank_exchange_transaction.user_id</code>.
     */
    public void setUserId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>superstock.bank_exchange_transaction.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>superstock.bank_exchange_transaction.bank_id</code>.
     */
    public void setBankId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>superstock.bank_exchange_transaction.bank_id</code>.
     */
    public Long getBankId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>superstock.bank_exchange_transaction.currency_in</code>.
     */
    public void setCurrencyIn(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>superstock.bank_exchange_transaction.currency_in</code>.
     */
    public String getCurrencyIn() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>superstock.bank_exchange_transaction.currency_out</code>.
     */
    public void setCurrencyOut(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>superstock.bank_exchange_transaction.currency_out</code>.
     */
    public String getCurrencyOut() {
        return (String) get(4);
    }

    /**
     * Setter for <code>superstock.bank_exchange_transaction.amount_in</code>.
     */
    public void setAmountIn(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>superstock.bank_exchange_transaction.amount_in</code>.
     */
    public BigDecimal getAmountIn() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>superstock.bank_exchange_transaction.amount_out</code>.
     */
    public void setAmountOut(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>superstock.bank_exchange_transaction.amount_out</code>.
     */
    public BigDecimal getAmountOut() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>superstock.bank_exchange_transaction.rate</code>.
     */
    public void setRate(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>superstock.bank_exchange_transaction.rate</code>.
     */
    public BigDecimal getRate() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>superstock.bank_exchange_transaction.created_at</code>.
     */
    public void setCreatedAt(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>superstock.bank_exchange_transaction.created_at</code>.
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>superstock.bank_exchange_transaction.fee</code>.
     */
    public void setFee(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>superstock.bank_exchange_transaction.fee</code>.
     */
    public BigDecimal getFee() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>superstock.bank_exchange_transaction.reverted_at</code>.
     */
    public void setRevertedAt(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>superstock.bank_exchange_transaction.reverted_at</code>.
     */
    public Timestamp getRevertedAt() {
        return (Timestamp) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, Long, Long, String, String, BigDecimal, BigDecimal, BigDecimal, Timestamp, BigDecimal, Timestamp> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Long, Long, Long, String, String, BigDecimal, BigDecimal, BigDecimal, Timestamp, BigDecimal, Timestamp> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return BankExchangeTransaction.BANK_EXCHANGE_TRANSACTION.ID;
    }

    @Override
    public Field<Long> field2() {
        return BankExchangeTransaction.BANK_EXCHANGE_TRANSACTION.USER_ID;
    }

    @Override
    public Field<Long> field3() {
        return BankExchangeTransaction.BANK_EXCHANGE_TRANSACTION.BANK_ID;
    }

    @Override
    public Field<String> field4() {
        return BankExchangeTransaction.BANK_EXCHANGE_TRANSACTION.CURRENCY_IN;
    }

    @Override
    public Field<String> field5() {
        return BankExchangeTransaction.BANK_EXCHANGE_TRANSACTION.CURRENCY_OUT;
    }

    @Override
    public Field<BigDecimal> field6() {
        return BankExchangeTransaction.BANK_EXCHANGE_TRANSACTION.AMOUNT_IN;
    }

    @Override
    public Field<BigDecimal> field7() {
        return BankExchangeTransaction.BANK_EXCHANGE_TRANSACTION.AMOUNT_OUT;
    }

    @Override
    public Field<BigDecimal> field8() {
        return BankExchangeTransaction.BANK_EXCHANGE_TRANSACTION.RATE;
    }

    @Override
    public Field<Timestamp> field9() {
        return BankExchangeTransaction.BANK_EXCHANGE_TRANSACTION.CREATED_AT;
    }

    @Override
    public Field<BigDecimal> field10() {
        return BankExchangeTransaction.BANK_EXCHANGE_TRANSACTION.FEE;
    }

    @Override
    public Field<Timestamp> field11() {
        return BankExchangeTransaction.BANK_EXCHANGE_TRANSACTION.REVERTED_AT;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getUserId();
    }

    @Override
    public Long component3() {
        return getBankId();
    }

    @Override
    public String component4() {
        return getCurrencyIn();
    }

    @Override
    public String component5() {
        return getCurrencyOut();
    }

    @Override
    public BigDecimal component6() {
        return getAmountIn();
    }

    @Override
    public BigDecimal component7() {
        return getAmountOut();
    }

    @Override
    public BigDecimal component8() {
        return getRate();
    }

    @Override
    public Timestamp component9() {
        return getCreatedAt();
    }

    @Override
    public BigDecimal component10() {
        return getFee();
    }

    @Override
    public Timestamp component11() {
        return getRevertedAt();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getUserId();
    }

    @Override
    public Long value3() {
        return getBankId();
    }

    @Override
    public String value4() {
        return getCurrencyIn();
    }

    @Override
    public String value5() {
        return getCurrencyOut();
    }

    @Override
    public BigDecimal value6() {
        return getAmountIn();
    }

    @Override
    public BigDecimal value7() {
        return getAmountOut();
    }

    @Override
    public BigDecimal value8() {
        return getRate();
    }

    @Override
    public Timestamp value9() {
        return getCreatedAt();
    }

    @Override
    public BigDecimal value10() {
        return getFee();
    }

    @Override
    public Timestamp value11() {
        return getRevertedAt();
    }

    @Override
    public BankExchangeTransactionRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public BankExchangeTransactionRecord value2(Long value) {
        setUserId(value);
        return this;
    }

    @Override
    public BankExchangeTransactionRecord value3(Long value) {
        setBankId(value);
        return this;
    }

    @Override
    public BankExchangeTransactionRecord value4(String value) {
        setCurrencyIn(value);
        return this;
    }

    @Override
    public BankExchangeTransactionRecord value5(String value) {
        setCurrencyOut(value);
        return this;
    }

    @Override
    public BankExchangeTransactionRecord value6(BigDecimal value) {
        setAmountIn(value);
        return this;
    }

    @Override
    public BankExchangeTransactionRecord value7(BigDecimal value) {
        setAmountOut(value);
        return this;
    }

    @Override
    public BankExchangeTransactionRecord value8(BigDecimal value) {
        setRate(value);
        return this;
    }

    @Override
    public BankExchangeTransactionRecord value9(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public BankExchangeTransactionRecord value10(BigDecimal value) {
        setFee(value);
        return this;
    }

    @Override
    public BankExchangeTransactionRecord value11(Timestamp value) {
        setRevertedAt(value);
        return this;
    }

    @Override
    public BankExchangeTransactionRecord values(Long value1, Long value2, Long value3, String value4, String value5, BigDecimal value6, BigDecimal value7, BigDecimal value8, Timestamp value9, BigDecimal value10, Timestamp value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BankExchangeTransactionRecord
     */
    public BankExchangeTransactionRecord() {
        super(BankExchangeTransaction.BANK_EXCHANGE_TRANSACTION);
    }

    /**
     * Create a detached, initialised BankExchangeTransactionRecord
     */
    public BankExchangeTransactionRecord(Long id, Long userId, Long bankId, String currencyIn, String currencyOut, BigDecimal amountIn, BigDecimal amountOut, BigDecimal rate, Timestamp createdAt, BigDecimal fee, Timestamp revertedAt) {
        super(BankExchangeTransaction.BANK_EXCHANGE_TRANSACTION);

        setId(id);
        setUserId(userId);
        setBankId(bankId);
        setCurrencyIn(currencyIn);
        setCurrencyOut(currencyOut);
        setAmountIn(amountIn);
        setAmountOut(amountOut);
        setRate(rate);
        setCreatedAt(createdAt);
        setFee(fee);
        setRevertedAt(revertedAt);
    }
}