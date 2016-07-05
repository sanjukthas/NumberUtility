package model;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

public class UserHelp {

	public static Bhuser getUserByEmail(String Email) {
		EntityManager em= DBUtil.getEmFactory().createEntityManager();
		String qString ="Select u from Bhuser u "
				+ "where u.useremail= :useremail";
		TypedQuery<Bhuser> q =em.createQuery(qString,Bhuser.class);
		q.setParameter("useremail", Email);
		Bhuser User =null;		
		try{
			User = q.getSingleResult();
		}catch(NoResultException e){
			System.out.println(e);
		}finally{
			em.close();
			
		}

		return User;
	
	}
	public static boolean isValidUser(String email,String password){
		EntityManager em= DBUtil.getEmFactory().createEntityManager();
		String qString ="Select count(b.bhuserid) from Bhuser b "
				+ " where b.useremail= :useremail"
				+ " and b.userpassword=:userpass";
		TypedQuery<Long> q =em.createQuery(qString,Long.class);
		boolean result =false;
		q.setParameter("useremail", email);
		q.setParameter("userpass", password);
		try{
			Long UserId = q.getSingleResult();
			if (UserId >0)
			{
				result=true;
			}
		}catch(NoResultException e){
			result=false;;
		}finally{
			em.close();
			
		}
          return result;
	
	}

}