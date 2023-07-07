package com.starsoft1.bms.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.starsoft1.bms.entity.Cases;

@Component
public class CasesDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private PlatformTransactionManager transactionManager;
	
	private BeanPropertyRowMapper<Cases> casesMapper = new BeanPropertyRowMapper<Cases>(Cases.class);
	
	public List<Cases> getList(){
		String sql = "SELECT * FROM caseTable";
		List<Cases> casesList = jdbcTemplate.query(sql, casesMapper);
		
		return casesList;
	}
	
	public Cases getAnCases(int id) {
		String sql = "SELECT * FROM caseTable WHERE caseId=?";
		Object[] parameters = {id};
		Cases anCase = jdbcTemplate.queryForObject(sql, parameters, casesMapper);
		
		return anCase;
	}
	
	public List<Cases> getUnapproved() {
		String sql = "SELECT * FROM caseTable WHERE approval=0";
		List<Cases> casesList = jdbcTemplate.query(sql, casesMapper);
		
		return casesList;
	}
	
	public int dismiss(int id) {
		String sql = "UPDATE caseTable SET approval=0 WHERE caseId=?";
		Object[] parameters = {id};
		TransactionStatus transactionStatus = null;
		DefaultTransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
		
		int numberOfRow = 0;
		try {
			transactionStatus = transactionManager.getTransaction(transactionDefinition);
			numberOfRow = jdbcTemplate.update(sql,parameters);
			transactionManager.commit(transactionStatus);
		} catch(DataAccessException e) {
			e.printStackTrace();
			transactionManager.rollback(transactionStatus);
		} catch(TransactionException e) {
			e.printStackTrace();
			if(transactionStatus != null) {
				transactionManager.rollback(transactionStatus);
			}
		}
		return numberOfRow;
	}
	public int approval(int id) {
		String sql = "UPDATE caseTable SET approval=1 WHERE caseId=?";
		Object[] parameters = {id};
		TransactionStatus transactionStatus = null;
		DefaultTransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
		
		int numberOfRow = 0;
		try {
			transactionStatus = transactionManager.getTransaction(transactionDefinition);
			numberOfRow = jdbcTemplate.update(sql,parameters);
			transactionManager.commit(transactionStatus);
		} catch(DataAccessException e) {
			e.printStackTrace();
			transactionManager.rollback(transactionStatus);
		} catch(TransactionException e) {
			e.printStackTrace();
			if(transactionStatus != null) {
				transactionManager.rollback(transactionStatus);
			}
		}
		return numberOfRow;
	}
	
	public int update(Cases cases) {
		String sql = "UPDATE caseTable SET caseName=?,caseDetail=?,place=?,startDate=?,endDate=?,"
				+ "resp_process=?,dev_lang1=?,dev_lang1_lv=?,dev_lang2=?,dev_lang2_lv=?,"
				+ "dev_lang3=?,dev_lang3_lv=?,dev_lang4=?,dev_lang4_lv=?,dev_lang5=?,dev_lang5_lv=?,"
				+ "skill1=?,skill1_lv=?,skill2=?,skill2_lv=?,skill3=?,skill3_lv=?,"
				+ "skill4=?,skill4_lv=?,skill5=?,skill5_lv=?,skill_other=?,DB=?,env=?,"
				+ "nationality=?,age=?,char_like=?,number_of_people=?,"
				+ "number_of_interview=? WHERE caseId=?;" ;
		Object[] parameters = {cases.getCaseName(),cases.getCaseDetail(),cases.getPlace(),
				cases.getStartDate(),cases.getEndDate(),cases.getResp_process(),
				cases.getDev_lang1(),cases.getDev_lang1_lv(),cases.getDev_lang2(),
				cases.getDev_lang2_lv(),cases.getDev_lang3(),cases.getDev_lang3_lv(),
				cases.getDev_lang4(),cases.getDev_lang4_lv(),cases.getDev_lang5(),
				cases.getDev_lang5_lv(),cases.getSkill1(),cases.getSkill1_lv(),
				cases.getSkill2(),cases.getSkill2_lv(),cases.getSkill3(),
				cases.getSkill3_lv(),cases.getSkill4(),cases.getSkill4_lv(),
				cases.getSkill5(),cases.getSkill5_lv(),cases.getSkill_other(),
				cases.getDB(),cases.getEnv(),cases.getNationality(),
				cases.getAge(),cases.getChar_like(),cases.getNumber_of_people(),
				cases.getNumber_of_interview(),cases.getCaseId()};
		TransactionStatus transactionStatus = null;
		DefaultTransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
		
		int numberOfRow = 0;
		try {
			transactionStatus = transactionManager.getTransaction(transactionDefinition);
			numberOfRow = jdbcTemplate.update(sql,parameters);
			transactionManager.commit(transactionStatus);
		} catch(DataAccessException e) {
			e.printStackTrace();
			transactionManager.rollback(transactionStatus);
		} catch(TransactionException e) {
			e.printStackTrace();
			if(transactionStatus != null) {
				transactionManager.rollback(transactionStatus);
			}
		}
		return numberOfRow;
	}
	
 	public int caseInsert(Cases cases) {
		String sql = "INSERT INTO sampleDB.caseTable(userId,caseName,caseDetail,place,startDate,endDate,"
				+ "resp_process,dev_lang1,dev_lang1_lv,dev_lang2,dev_lang2_lv,"
				+ "dev_lang3,dev_lang3_lv,dev_lang4,dev_lang4_lv,dev_lang5,dev_lang5_lv,"
				+ "skill1,skill1_lv,skill2,skill2_lv,skill3,skill3_lv,"
				+ "skill4,skill4_lv,skill5,skill5_lv,skill_other,DB,env,"
				+ "nationality,age,char_like,number_of_people,"
				+ "number_of_interview) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
				+ "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);" ;
		Object[] parameters = {cases.getUserId(),cases.getCaseName(),cases.getCaseDetail(),cases.getPlace(),
				cases.getStartDate(),cases.getEndDate(),cases.getResp_process(),
				cases.getDev_lang1(),cases.getDev_lang1_lv(),cases.getDev_lang2(),
				cases.getDev_lang2_lv(),cases.getDev_lang3(),cases.getDev_lang3_lv(),
				cases.getDev_lang4(),cases.getDev_lang4_lv(),cases.getDev_lang5(),
				cases.getDev_lang5_lv(),cases.getSkill1(),cases.getSkill1_lv(),
				cases.getSkill2(),cases.getSkill2_lv(),cases.getSkill3(),
				cases.getSkill3_lv(),cases.getSkill4(),cases.getSkill4_lv(),
				cases.getSkill5(),cases.getSkill5_lv(),cases.getSkill_other(),
				cases.getDB(),cases.getEnv(),cases.getNationality(),
				cases.getAge(),cases.getChar_like(),cases.getNumber_of_people(),
				cases.getNumber_of_interview()};
		TransactionStatus transactionStatus = null;
		DefaultTransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
		int numberOfRow = 0;
		try {
			transactionStatus = transactionManager.getTransaction(transactionDefinition);
			numberOfRow = jdbcTemplate.update(sql,parameters);
			transactionManager.commit(transactionStatus);
		} catch(DataAccessException e) {
			e.printStackTrace();
			transactionManager.rollback(transactionStatus);
		} catch(TransactionException e) {
			e.printStackTrace();
			if(transactionStatus != null) {
				transactionManager.rollback(transactionStatus);
			}
		}
		return numberOfRow;
	}
}
