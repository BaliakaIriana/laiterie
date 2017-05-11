package s6.frameop.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;

import s6.frameop.entities.Data;
import s6.frameop.util.HibernateUtil;


public class HibernateDao {
	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	/**
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public void save(Data obj) throws Exception{
        Session session = null;
        Transaction tr=null;
        try{
            session = getSessionFactory().openSession();
            tr=session.beginTransaction();
            session.save(obj);
            tr.commit();
        }catch (Exception ex){
            if(tr!=null)
                tr.rollback();
            throw ex;
        }finally {
            if(session!=null)
                session.close();
        }
    }
	public void findById(Data obj) throws Exception{
        Session session = null;
        try{
            session = getSessionFactory().openSession();
            session.load(obj,obj.getId());
        }catch (Exception ex){
            throw ex;
        }finally {
            if(session!=null)
                session.close();
        }
    }

    @SuppressWarnings({ "deprecation", "unchecked" })
	public List<Data> findAll(Data obj)  throws Exception{
        Session session = null;
        try{
            session = getSessionFactory().openSession();
            Criteria criteria = session.createCriteria(obj.getClass());
			List<Data> allEntityList = criteria.list();
            return allEntityList;
        }catch (Exception ex){
            throw ex;
        }finally {
            if(session!=null)
                session.close();
        }
    }
    @SuppressWarnings({ "deprecation", "unchecked" })
	public List<Data> find(Data obj,Criterion allEq)  throws Exception{
        Session session = null;
        try{
            session = getSessionFactory().openSession();
            Criteria criteria = session.createCriteria(obj.getClass());
            criteria.add(allEq);
			List<Data> allEntityList = criteria.list();
            return allEntityList;
        }catch (Exception ex){
            throw ex;
        }finally {
            if(session!=null)
                session.close();
        }
    }
    
    public void update(Data obj){
    	Session session = null;
    	Transaction tr = null;
    	try{
    		session = getSessionFactory().openSession();
    		tr = session.beginTransaction();
        	session.update(obj);
        	tr.commit();
    	}catch(Exception e){
    		if(tr != null){
    			tr.rollback();
    		}
    	}finally{
    		if(session != null){
    			session.close();
    		}
    	}
    	
    }
    public void delete(Data obj){
    	Session session = null;
    	Transaction tr = null;
    	try{
    		session = getSessionFactory().openSession();
    		tr = session.beginTransaction();
        	session.delete(obj);
        	tr.commit();
    	}catch(Exception e){
    		if(tr != null){
    			tr.rollback();
    		}
    	}finally{
    		if(session != null){
    			session.close();
    		}
    	}
    }

}
