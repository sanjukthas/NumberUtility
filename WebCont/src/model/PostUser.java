package model;

import javax.persistence.EntityManager;

public class PostUser {

	public static void main(String[] args) {
				EntityManager em= DBUtil.getEmFactory().createEntityManager();
			try{
				model.Bhpost cust =em.find(model.Bhpost.class, (long)21);
				System.out.println(cust.getBhuser());
			}catch(Exception e){
				System.out.println(e);
			}finally{
				em.close();
				System.out.println("cerrado!");
			}

		}

}
