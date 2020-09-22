package com.first_java.dao;
import java.sql.*;

import com.facebokutility.facebookException;
import com.first_java.fentity.facebookuser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class facebookdao implements facebookdaointerface{
	
	
	
	@Override
	public int createdaoprofile(facebookuser fb) {
		int i=0;
		Connection con=null;
		try
		{
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");//load drivers
		
		//create conncection with database
		 con=DriverManager.getConnection("jdbc:derby:C:/firstdb1;create=true","kunal","kunal");
		
		//step 3 create query
		
		PreparedStatement ps=con.prepareStatement("insert into FACEBOOK1 values(?)");
		ps.setString(1, fb.getname());
		//ps.setString(2, "kunalrasam");
		
		/*int i=0;
		if(fb.getname().equals("kunal"))
		{
		System.out.println("dao profile created");
		i=1;
		}
		else
		{
			
		}*/
		//step 4 execute query
		 i=ps.executeUpdate();
		}
		catch(ClassNotFoundException|SQLException e1)
		{
			e1.printStackTrace();
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return i;
		
	}

	@Override
	public facebookuser updatedaoprofile(facebookuser fb,int i)  {
		Connection con=null;
		facebookuser fu=null;
	
	if(i==0)
	{
		try
		{
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
	    con=DriverManager.getConnection("jdbc:derby:c:/firstdb1;create=true","kunal","kunal");
		PreparedStatement ps=con.prepareStatement("select * from FACEBOOK1 where name=?");
		
		ps.setString(1, fb.getname());
		ResultSet res=ps.executeQuery();
		
		
		
		
		if(res.next()) {
			fu=new facebookuser();
			fu.SetName(res.getString(1));
	
		}
		}catch(ClassNotFoundException|SQLException e1)
		{
			e1.printStackTrace();
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return fu;
	}
	else
	{
		try
		{
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		 con=DriverManager.getConnection("jdbc:derby:c:/firstdb1;create=true","kunal","kunal");
		PreparedStatement ps=con.prepareStatement("select * from FACEBOOK1 where name=?");
		
		ps.setString(1, fb.getname());
		ResultSet res=ps.executeQuery();
		System.out.println(fb.getnewname());
		System.out.println(fb.getname());
		
			ps=con.prepareStatement("update FACEBOOK1 set name=? where name=?");
			ps.setString(1, fb.getnewname());
			ps.setString(2, fb.getname());
			ps.executeUpdate();
		}
		catch(ClassNotFoundException|SQLException e1)
		{
			e1.printStackTrace();
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return fb;
	}
	
	
	
		
	
		
		
	}

	@Override
	public facebookuser viewdaoprofile(facebookuser fb) {
		Connection con=null;
		facebookuser fu=null;
		try
		{
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		 con=DriverManager.getConnection("jdbc:derby:c:/firstdb1;create=true","kunal","kunal");
		PreparedStatement ps=con.prepareStatement("select * from FACEBOOK1 where name=?");
		
		ps.setString(1, fb.getname());
		ResultSet res=ps.executeQuery();
		
		
		
		
		if(res.next()) {
			fu=new facebookuser();
			fu.SetName(res.getString(1));
	
		}
		}catch(ClassNotFoundException|SQLException e1)
		{
			e1.printStackTrace();
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return fu;
		
		// TODO Auto-generated method stub
		
		
		
		
		
	}

	@Override
	public List<facebookuser> searchprofile(facebookuser fb)throws facebookException{
		Connection con=null;
		List<facebookuser> ll=new ArrayList<facebookuser>();
		try
		{
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		con=DriverManager.getConnection("jdbc:derby:c:/firstdb1;create=true","kunal","kunal");
		PreparedStatement ps=con.prepareStatement("select * from FACEBOOK1 ");
		
		
		
		//ps.setString(1, fb.getname());
		
		ResultSet res=ps.executeQuery();
		
		
		
		while(res.next()) {
			facebookuser fu=new facebookuser();
			fu.SetName(res.getString(1));
			
			ll.add(fu);

		
		
		
		
		}	
		if(ll.size()==0)
		{
			throw new facebookException("");
		}
		}
		catch(Exception e1)
		{
			//e1.printStackTrace();
		}
	
		
		return ll;
		
	}

	@Override
	public Map<String, List<facebookuser>> daouserdetailhistory() throws Exception{
		Map<String, List<facebookuser>> m=new HashMap<String, List<facebookuser>>();
		List<facebookuser>l1 = null;
		List<facebookuser>l2 = null;
		try {
			l1=searchprofile(null);
		    l2=searchprofile(null);
		} catch (facebookException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m.put("studentlist", l1);
		m.put("proflist", l2);
		
		return m;
	}

	//this function uses file as database
	@Override
	public int createdaoprofilefile(facebookuser fb) throws Exception {
		File f1=new File("F:/two.txt");
		if(f1.createNewFile()) {
			System.out.println("file created");
		}
		else {
			System.out.println("could not create file");
		}



		FileOutputStream out=new FileOutputStream(f1);
		String name=fb.getname();
		for(int i=0;i<name.length();i++)
		{
			out.write(name.charAt(i));
		}
		
		FileInputStream in=new FileInputStream(f1);
		
		int c=0;
		
		while(!((c=in.read())==-1)){
			
			System.out.print((char) (c));
		}
		out.close();
		
		return 0;
	}	
	

}
