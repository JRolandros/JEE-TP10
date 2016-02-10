/**
 * 
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import beans.Bonus;

/**
 * @author Roland
 *
 */
public class BonusDAO extends DAO<Bonus, String> {

    private static BonusDAO instanceCompteDAO;

    private BonusDAO() {

        super();

    }
    
    public boolean create(Bonus obj) {

      try {

        PreparedStatement st = null;

        st = connect.prepareStatement("insert into  bonus (ssn,bonus,result) values(?,?,?)");

        st.setString(1, obj.getSsn());

         st.setString(2, obj.getBonus());
         
         st.setString(3, obj.getResult());

         st.executeUpdate();

         connect.commit();

        } catch (SQLException e) {

            e.printStackTrace();
            }

        return false;
    }

	@Override
	public boolean delete(Bonus obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Bonus obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Bonus find(String id) {
		
		return null;
	}
	
	public static BonusDAO getInstance() {

        if (null == instanceCompteDAO) { // Premier appel

            instanceCompteDAO = new BonusDAO();

        }
        return instanceCompteDAO;

    }

	@Override
	public List<Bonus> findAll() {
		String query = "SELECT * FROM bonus";
		List<Bonus> listB=null;
	      try {
	    	// create the java statement
	    	  Statement st = connect.createStatement();
	    	  
	    	// execute the query, and get a java resultset
			ResultSet rs = st.executeQuery(query);
			listB=new LinkedList<Bonus>();
			Bonus b;
			while (rs.next())
		      {
				b=new Bonus();
				b.setBonus(rs.getString("bonus"));
				b.setResult(Integer.parseInt(rs.getString("result")));
				b.setSsn(rs.getString("ssn"));
				listB.add(b);
		      }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      return listB;
	}
}
