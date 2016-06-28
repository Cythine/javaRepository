package com.rest.bean;  
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;  
/* 
 * 用户 bean 
 * @author waylau.com 
 * 2014-3-17 
 */  
@XmlRootElement  
public class Transaction {  
      
	private String transactionID;// 交易ID
	private Date creatTime;// 创建时间
	private String transactionState;// 交易状态
	private String transactionTypes;// 交易类型
	private String transactionAmount;// 交易金额
	private String transactionCurrency;// 交易币种
	private String customerID;// 客户ID
	private String customerName;// 客户姓名 
      
    public Transaction() {};  
       
    public Transaction(String transactionID, Date creatTime, String transactionState, String transactionTypes,
			String transactionAmount, String transactionCurrency, String customerID, String customerName) {
		super();
		this.transactionID = transactionID;
		this.creatTime = creatTime;
		this.transactionState = transactionState;
		this.transactionTypes = transactionTypes;
		this.transactionAmount = transactionAmount;
		this.transactionCurrency = transactionCurrency;
		this.customerID = customerID;
		this.customerName = customerName;
	}

	public String getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	public Date getCreatTime() {
		return creatTime;
	}

	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}

	public String getTransactionState() {
		return transactionState;
	}

	public void setTransactionState(String transactionState) {
		this.transactionState = transactionState;
	}

	public String getTransactionTypes() {
		return transactionTypes;
	}

	public void setTransactionTypes(String transactionTypes) {
		this.transactionTypes = transactionTypes;
	}

	public String getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getTransactionCurrency() {
		return transactionCurrency;
	}

	public void setTransactionCurrency(String transactionCurrency) {
		this.transactionCurrency = transactionCurrency;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
}  