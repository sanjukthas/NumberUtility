package model;

	import java.math.BigDecimal;
import java.util.List;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

		public class DBGradebook {
		private static final String Typeid = null;

		public static Gradebook getUser(long userID)
		{
			EntityManager em = DBUtil.getEmFactory().createEntityManager();
			Gradebook user = em.find(Gradebook.class, userID);
			return user;		
		}

	    public static void insert(Gradebook gradebook) {
	        EntityManager em = DBUtil.getEmFactory().createEntityManager();
	        EntityTransaction trans = em.getTransaction();
	        try {
	            trans.begin();
	            em.persist(gradebook);
	            trans.commit();
	        } catch (Exception e) {
	            trans.rollback();
	        } finally {
	            em.close();
	        }
	    }

	    public static void update(Gradebook gradebook) {
	        EntityManager em = DBUtil.getEmFactory().createEntityManager();
	        EntityTransaction trans = em.getTransaction();
	        try {
	            trans.begin();
	            em.merge(gradebook);
	            trans.commit();
	        } catch (Exception e) {
	            trans.rollback();
	        } finally {
	            em.close();
	        }
	    }

	   

	    public static List<Gradebook> getAllPost (){
	        EntityManager em = DBUtil.getEmFactory().createEntityManager();
	        String qString = "select b from Gradebook b";
	        
	        List<Gradebook> posts = null;
	        try{
	            TypedQuery<Gradebook> query = em.createQuery(qString,Gradebook.class);
	            posts = query.getResultList();

	        }catch (Exception e){
	            e.printStackTrace();
	        }
	        finally{
	                em.close();
	            }
	        return posts;
	    }
	    
	    public static List<Gradebook> postsofUser(long userid)
	    {
	        EntityManager em = DBUtil.getEmFactory().createEntityManager();
	        List<Gradebook> userposts = null;
	        String qString = "select b from Gradebook b where b.assignmenttype.assignmenttypeid = :userid";
	        
	        try{
	            TypedQuery<Gradebook> query = em.createQuery(qString,Gradebook.class);
	            query.setParameter("userid", userid);
	            userposts = query.getResultList();
	        }catch (Exception e){
	            e.printStackTrace();
	        }
	        finally{
	                em.close();
	            }
	        return userposts;    
	    }
	    public static List<Gradebook> postsofUser(String useremail)
	    {
	        EntityManager em = DBUtil.getEmFactory().createEntityManager();
	        List<Gradebook> userposts = null;
	        String qString = "select b from Gradebook b "
	                + "where b.assignmenttype.useremail = :useremail";
	        
	        try{
	            TypedQuery<Gradebook> query = em.createQuery(qString,Gradebook.class);
	            query.setParameter("useremail", useremail);
	            userposts = query.getResultList();
	        }catch (Exception e){
	            e.printStackTrace();
	        }
	        finally{
	                em.close();
	            }
	        return userposts;    
	    }
	    
	    public static List<Gradebook> searchPosts (String search)
	    {
	        EntityManager em = DBUtil.getEmFactory().createEntityManager();
	        List<Gradebook> searchposts = null;
	        String qString = "select b from Gradebook b "
	                + "where b.posttext like :search";
	        
	        try{
	            TypedQuery<Gradebook> query = em.createQuery(qString,Gradebook.class);
	            query.setParameter("search", "%" + search + "%");
	            searchposts = query.getResultList();
	        }catch (Exception e){
	            e.printStackTrace();
	        }finally{
	            em.close();
	        }return searchposts;
	    }
	    public static Float getHigh(String type) {
	    	EntityManager em = DBUtil.getEmFactory().createEntityManager();
	    	        
	    	        String qString = "select Max (s.grade), s.assignmenttype.type "
	    	        		+ "from Gradebook s "
	    	        		+ "group by s.assignmenttype.type "
	    	        		+ "having s.assignmenttype.type=:type "
	    	        		+ "order by s.assignmenttype.type";
	    	        
	    	       Float result = null;
	    	        try{
	    	            Query query = em.createQuery(qString,Gradebook.class);
	    	            query.setParameter("type", type);
	    	            Object[] results = (Object[]) query.getSingleResult();
	    	            result = (Float) results[0];

	    	        }catch (Exception e){
	    	        	 return null;
	    	        }
	    	        finally{
	    	                em.close();
	    	            }
	    	        return result;
	    		}

	    		public static Float getLow(String type) {
	    	EntityManager em = DBUtil.getEmFactory().createEntityManager();
	    	        
	    	        String qString = "select Min (s.grade),s.assignmenttype.type "
	    	        		+ "from Gradebook s "
	    	        		+ "group by s.assignmenttype.type "
	    	        		+ "having s.assignmenttype.type=:type "
	    	        		+ "order by s.assignmenttype.type";
	    	        
	    	       Float result = null;
	    	        try{
	    	            Query query = em.createQuery(qString,Gradebook.class);
	    	            query.setParameter("type", type);
	    	            Object[] results = (Object[]) query.getSingleResult();
	    	            result = (Float) results[0];

	    	        }catch (Exception e){
	    	        	 return null;
	    	        }
	    	        finally{
	    	                em.close();
	    	            }
	    	        return result;
	    		}

				public static String getTypeId(String type) {
					EntityManager em = DBUtil.getEmFactory().createEntityManager();
					 try{
		           String qString = "Select u from Assignmenttype u "
				                   + "where u.description = :type";
		              TypedQuery<Assignmenttype> q = em.createQuery(qString, Assignmenttype.class);
		                 q.setParameter("type", type);
		                 	String Typeid= q.getSingleResult().getTypeid();
					 }catch (Exception e){
	    	        	 return null;
	    	        }
	    	        finally{
	    	                em.close();
	    	            } return Typeid;
				}
					
									
				}
	    			
	    		
	    
	