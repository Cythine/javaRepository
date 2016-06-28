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
		// ��������Ϊ��ѯȫ���Ľ��׼�¼
		List<Transaction> transactions = resource.queryTrans("all");
		assertEquals(5,transactions.size());
		
		// ��������Ϊ��ѯ����״̬Ϊ�ɹ��Ľ��׼�¼
		List<Transaction> success = resource.queryTrans("success");
		assertEquals(3, success.size());
		
		// ��������Ϊ��ѯ����״̬Ϊʧ�ܵĽ��׼�¼
		List<Transaction> failure = resource.queryTrans("failure");
		assertEquals(2, failure.size());
	}

	@Test
	public void testAddTran() {
		Resource resource = new Resource();
		Transaction tran = resource.addTran("2016062801", "�ȴ�����", "֧��", "86.5", "RMB", "1001", "����");
		assertEquals("�ȴ�����", tran.getTransactionState());
		assertEquals("86.5", tran.getTransactionAmount());
	}

}
