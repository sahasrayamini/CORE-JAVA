package com.createiq;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.createiq.dao.LaboratoryDao;
import com.createiq.dao.SiteDao;
import com.createiq.dao.OrganizationDao;

@SpringBootTest
class OrganizationApplicationTests {
	
	@Autowired
	private OrganizationDao dao;
	
	@Autowired
	private SiteDao siteDao;
	
	@Autowired
	private LaboratoryDao laboratoryDao;
	

	@Test
	public void testing() {
		
//		Laboratory lab1=new Laboratory(1, "chemistry", "sravani");
//		Laboratory lab2=new Laboratory(2, "Biology", "vamsi");
//		Laboratory lab3=new Laboratory(3, "Pharmacology", "Anudeep");
//		Laboratory lab4=new Laboratory(4, "Analytical Labs", "Teja");
//		
//		List<Laboratory> laboratory1=new ArrayList<Laboratory>();
//		laboratory1.add(lab1);
//		laboratory1.add(lab2);
//		
//		List<Laboratory> laboratory2=new ArrayList<Laboratory>();
//		laboratory2.add(lab3);
//		laboratory2.add(lab4);
//		
//		
//		
//		Site site=new Site(1,"Dr Reddy's Hyderabad" , "Hyderabad", "Sahasra", laboratory1);
//		Site site1=new Site(2,"Dr Reddy's Chennai" , "chennai", "yamini", laboratory2);
//		
//		List<Site> s=new ArrayList<Site>();
//		s.add(site);
//		s.add(site1);
//		
//		Organization org=new Organization(2, "Dr.Reddy's", " It is a multinational pharmaceutical company ",s);
//      
//		
//		laboratoryDao.saveAll(List.of(lab1,lab2,lab3,lab4));
//		siteDao.saveAll(List.of(site,site1));
//		dao.save(org);
	}

}
