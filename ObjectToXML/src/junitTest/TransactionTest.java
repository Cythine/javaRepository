package junitTest;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.rest.bean.Transaction;
import com.rest.resources.Resource;

public class TransactionTest {

	@Test
	public void testQueryTrans() {
		
		Resource resource = new Resource();
		// 检索条件为查询全部的交易记录
		List<Transaction> transactions = resource.queryTrans("all");
		assertEquals(5,transactions.size());
		
		// 线索条件为查询交易状态为成功的交易记录
		List<Transaction> success = resource.queryTrans("success");
		assertEquals(3, success.size());
		
		// 线索条件为查询交易状态为失败的交易记录
		List<Transaction> failure = resource.queryTrans("failure");
		assertEquals(2, failure.size());
	}

	@Test
	public void testAddTran() {
		Resource resource = new Resource();
		Transaction tran = resource.addTran("2016062801", "等待付款", "支付", "86.5", "RMB", "1001", "张三");
		assertEquals("等待付款", tran.getTransactionState());
		assertEquals("86.5", tran.getTransactionAmount());
	}

}
