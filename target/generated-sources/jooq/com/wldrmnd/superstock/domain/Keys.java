/*
 * This file is generated by jOOQ.
 */
package com.wldrmnd.superstock.domain;


import com.wldrmnd.superstock.domain.tables.Account;
import com.wldrmnd.superstock.domain.tables.Bank;
import com.wldrmnd.superstock.domain.tables.BankExchange;
import com.wldrmnd.superstock.domain.tables.BankExchangeTransaction;
import com.wldrmnd.superstock.domain.tables.BankReview;
import com.wldrmnd.superstock.domain.tables.ExchangeStockRequest;
import com.wldrmnd.superstock.domain.tables.FlywaySchemaHistory;
import com.wldrmnd.superstock.domain.tables.Stock;
import com.wldrmnd.superstock.domain.tables.StockAccount;
import com.wldrmnd.superstock.domain.tables.StockAccountStatistic;
import com.wldrmnd.superstock.domain.tables.StockPrice;
import com.wldrmnd.superstock.domain.tables.StockStatistic;
import com.wldrmnd.superstock.domain.tables.StockTransaction;
import com.wldrmnd.superstock.domain.tables.User;
import com.wldrmnd.superstock.domain.tables.records.AccountRecord;
import com.wldrmnd.superstock.domain.tables.records.BankExchangeRecord;
import com.wldrmnd.superstock.domain.tables.records.BankExchangeTransactionRecord;
import com.wldrmnd.superstock.domain.tables.records.BankRecord;
import com.wldrmnd.superstock.domain.tables.records.BankReviewRecord;
import com.wldrmnd.superstock.domain.tables.records.ExchangeStockRequestRecord;
import com.wldrmnd.superstock.domain.tables.records.FlywaySchemaHistoryRecord;
import com.wldrmnd.superstock.domain.tables.records.StockAccountRecord;
import com.wldrmnd.superstock.domain.tables.records.StockAccountStatisticRecord;
import com.wldrmnd.superstock.domain.tables.records.StockPriceRecord;
import com.wldrmnd.superstock.domain.tables.records.StockRecord;
import com.wldrmnd.superstock.domain.tables.records.StockStatisticRecord;
import com.wldrmnd.superstock.domain.tables.records.StockTransactionRecord;
import com.wldrmnd.superstock.domain.tables.records.UserRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * superstock.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AccountRecord> KEY_ACCOUNT_PRIMARY = Internal.createUniqueKey(Account.ACCOUNT, DSL.name("KEY_account_PRIMARY"), new TableField[] { Account.ACCOUNT.ID }, true);
    public static final UniqueKey<BankRecord> KEY_BANK_PRIMARY = Internal.createUniqueKey(Bank.BANK, DSL.name("KEY_bank_PRIMARY"), new TableField[] { Bank.BANK.ID }, true);
    public static final UniqueKey<BankExchangeRecord> KEY_BANK_EXCHANGE_PRIMARY = Internal.createUniqueKey(BankExchange.BANK_EXCHANGE, DSL.name("KEY_bank_exchange_PRIMARY"), new TableField[] { BankExchange.BANK_EXCHANGE.ID }, true);
    public static final UniqueKey<BankExchangeTransactionRecord> KEY_BANK_EXCHANGE_TRANSACTION_PRIMARY = Internal.createUniqueKey(BankExchangeTransaction.BANK_EXCHANGE_TRANSACTION, DSL.name("KEY_bank_exchange_transaction_PRIMARY"), new TableField[] { BankExchangeTransaction.BANK_EXCHANGE_TRANSACTION.ID }, true);
    public static final UniqueKey<BankReviewRecord> KEY_BANK_REVIEW_PRIMARY = Internal.createUniqueKey(BankReview.BANK_REVIEW, DSL.name("KEY_bank_review_PRIMARY"), new TableField[] { BankReview.BANK_REVIEW.ID }, true);
    public static final UniqueKey<ExchangeStockRequestRecord> KEY_EXCHANGE_STOCK_REQUEST_PRIMARY = Internal.createUniqueKey(ExchangeStockRequest.EXCHANGE_STOCK_REQUEST, DSL.name("KEY_exchange_stock_request_PRIMARY"), new TableField[] { ExchangeStockRequest.EXCHANGE_STOCK_REQUEST.ID }, true);
    public static final UniqueKey<FlywaySchemaHistoryRecord> KEY_FLYWAY_SCHEMA_HISTORY_PRIMARY = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, DSL.name("KEY_flyway_schema_history_PRIMARY"), new TableField[] { FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK }, true);
    public static final UniqueKey<StockRecord> KEY_STOCK_PRIMARY = Internal.createUniqueKey(Stock.STOCK, DSL.name("KEY_stock_PRIMARY"), new TableField[] { Stock.STOCK.ID }, true);
    public static final UniqueKey<StockAccountRecord> KEY_STOCK_ACCOUNT_PRIMARY = Internal.createUniqueKey(StockAccount.STOCK_ACCOUNT, DSL.name("KEY_stock_account_PRIMARY"), new TableField[] { StockAccount.STOCK_ACCOUNT.ID }, true);
    public static final UniqueKey<StockAccountStatisticRecord> KEY_STOCK_ACCOUNT_STATISTIC_PRIMARY = Internal.createUniqueKey(StockAccountStatistic.STOCK_ACCOUNT_STATISTIC, DSL.name("KEY_stock_account_statistic_PRIMARY"), new TableField[] { StockAccountStatistic.STOCK_ACCOUNT_STATISTIC.ID }, true);
    public static final UniqueKey<StockPriceRecord> KEY_STOCK_PRICE_PRIMARY = Internal.createUniqueKey(StockPrice.STOCK_PRICE, DSL.name("KEY_stock_price_PRIMARY"), new TableField[] { StockPrice.STOCK_PRICE.ID }, true);
    public static final UniqueKey<StockStatisticRecord> KEY_STOCK_STATISTIC_PRIMARY = Internal.createUniqueKey(StockStatistic.STOCK_STATISTIC, DSL.name("KEY_stock_statistic_PRIMARY"), new TableField[] { StockStatistic.STOCK_STATISTIC.ID }, true);
    public static final UniqueKey<StockTransactionRecord> KEY_STOCK_TRANSACTION_PRIMARY = Internal.createUniqueKey(StockTransaction.STOCK_TRANSACTION, DSL.name("KEY_stock_transaction_PRIMARY"), new TableField[] { StockTransaction.STOCK_TRANSACTION.ID }, true);
    public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = Internal.createUniqueKey(User.USER, DSL.name("KEY_user_PRIMARY"), new TableField[] { User.USER.ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<AccountRecord, UserRecord> ACCOUNT_IBFK_1 = Internal.createForeignKey(Account.ACCOUNT, DSL.name("account_ibfk_1"), new TableField[] { Account.ACCOUNT.USER_ID }, Keys.KEY_USER_PRIMARY, new TableField[] { User.USER.ID }, true);
    public static final ForeignKey<BankExchangeRecord, BankRecord> BANK_EXCHANGE_IBFK_1 = Internal.createForeignKey(BankExchange.BANK_EXCHANGE, DSL.name("bank_exchange_ibfk_1"), new TableField[] { BankExchange.BANK_EXCHANGE.BANK_ID }, Keys.KEY_BANK_PRIMARY, new TableField[] { Bank.BANK.ID }, true);
    public static final ForeignKey<ExchangeStockRequestRecord, UserRecord> EXCHANGE_STOCK_REQUEST_IBFK_1 = Internal.createForeignKey(ExchangeStockRequest.EXCHANGE_STOCK_REQUEST, DSL.name("exchange_stock_request_ibfk_1"), new TableField[] { ExchangeStockRequest.EXCHANGE_STOCK_REQUEST.USER_ID }, Keys.KEY_USER_PRIMARY, new TableField[] { User.USER.ID }, true);
    public static final ForeignKey<ExchangeStockRequestRecord, StockRecord> EXCHANGE_STOCK_REQUEST_IBFK_2 = Internal.createForeignKey(ExchangeStockRequest.EXCHANGE_STOCK_REQUEST, DSL.name("exchange_stock_request_ibfk_2"), new TableField[] { ExchangeStockRequest.EXCHANGE_STOCK_REQUEST.STOCK_ID }, Keys.KEY_STOCK_PRIMARY, new TableField[] { Stock.STOCK.ID }, true);
    public static final ForeignKey<StockAccountRecord, UserRecord> STOCK_ACCOUNT_IBFK_1 = Internal.createForeignKey(StockAccount.STOCK_ACCOUNT, DSL.name("stock_account_ibfk_1"), new TableField[] { StockAccount.STOCK_ACCOUNT.USER_ID }, Keys.KEY_USER_PRIMARY, new TableField[] { User.USER.ID }, true);
    public static final ForeignKey<StockAccountRecord, StockRecord> STOCK_ACCOUNT_IBFK_2 = Internal.createForeignKey(StockAccount.STOCK_ACCOUNT, DSL.name("stock_account_ibfk_2"), new TableField[] { StockAccount.STOCK_ACCOUNT.STOCK_ID }, Keys.KEY_STOCK_PRIMARY, new TableField[] { Stock.STOCK.ID }, true);
    public static final ForeignKey<StockPriceRecord, StockRecord> STOCK_PRICE_IBFK_1 = Internal.createForeignKey(StockPrice.STOCK_PRICE, DSL.name("stock_price_ibfk_1"), new TableField[] { StockPrice.STOCK_PRICE.STOCK_ID }, Keys.KEY_STOCK_PRIMARY, new TableField[] { Stock.STOCK.ID }, true);
    public static final ForeignKey<StockStatisticRecord, StockRecord> STOCK_STATISTIC_IBFK_1 = Internal.createForeignKey(StockStatistic.STOCK_STATISTIC, DSL.name("stock_statistic_ibfk_1"), new TableField[] { StockStatistic.STOCK_STATISTIC.STOCK_ID }, Keys.KEY_STOCK_PRIMARY, new TableField[] { Stock.STOCK.ID }, true);
}