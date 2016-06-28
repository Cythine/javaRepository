package com.rest.resources;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.bean.Transaction;

import javax.ws.rs.GET;

@Path("/trans")
public class Resource {

	/**
	 * 查询交易信息
	 * @return
	 */
	@GET
	@Path("/transactionState/{transactionState}")
	@Produces(MediaType.APPLICATION_XML)
	public List<Transaction> queryTrans(@PathParam("transactionState")String transactionState) {
		List<Transaction> records = new ArrayList<Transaction>();
		List<Transaction> trans = creatTran();
		if("all".equals(transactionState)){
			return trans;
		}else if("success".equals(transactionState)){
			for (Transaction transaction : trans) {
				if("success".equals(transaction.getTransactionState())){
					records.add(transaction);
				}
			}
			return records;
		}else if("failure".equals(transactionState)){
			for (Transaction transaction : trans) {
				if("failure".equals(transaction.getTransactionState())){
					records.add(transaction);
				}
			}
			return records;
		}else{
			return null;
		}
	}

	private Date creatTime;

	
	/**
	 * 添加交易信息
	 * @param transactionID
	 * @param transactionState
	 * @param transactionTypes
	 * @param transactionAmount
	 * @param transactionCurrency
	 * @param customerID
	 * @param customerName
	 * @return
	 */
	@GET
	@Path("/transactionID/{transactionID}/transactionState/{transactionState}/transactionTypes/{transactionTypes}/transactionAmount/{transactionAmount}/transactionCurrency/{transactionCurrency}/customerID/{customerID}/customerName/{customerName}")
	@Produces(MediaType.APPLICATION_XML)
	public Transaction addTran(@PathParam("transactionID") String transactionID,
			@PathParam("transactionState") String transactionState,
			@PathParam("transactionTypes") String transactionTypes,
			@PathParam("transactionAmount") String transactionAmount,
			@PathParam("transactionCurrency") String transactionCurrency, @PathParam("customerID") String customerID,
			@PathParam("customerName") String customerName) {
		this.creatTime = new Date();
		Transaction transaction = new Transaction(transactionID, creatTime, transactionState, transactionTypes, transactionAmount, transactionCurrency, customerID, customerName);
		return transaction;
	}

	// 定义5个交易信息对象，3个成功，2个失败
	public static List<Transaction> creatTran() {
		Transaction t1 = new Transaction("2016062801", new Date(), "success", "paid", "78.5", "RMB", "1001", "wang");
		Transaction t2 = new Transaction("2016062802", new Date(), "success", "paid", "11.0", "RMB", "1001", "wang");
		Transaction t3 = new Transaction("2016062803", new Date(), "success", "paid", "178.5", "RMB", "1001", "wang");
		Transaction t4 = new Transaction("2016062804", new Date(), "failure", "paid", "8.5", "RMB", "1001", "wang");
		Transaction t5 = new Transaction("2016062805", new Date(), "failure", "paid", "1.5", "RMB", "1001", "wang");
		List<Transaction> tranLists = new ArrayList<Transaction>();
		tranLists.add(t1);
		tranLists.add(t2);
		tranLists.add(t3);
		tranLists.add(t4);
		tranLists.add(t5);
		return tranLists;
	}
}