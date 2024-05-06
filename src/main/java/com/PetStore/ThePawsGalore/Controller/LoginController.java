package com.PetStore.ThePawsGalore.Controller;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.PetStore.ThePawsGalore.Model.Comment;
import com.PetStore.ThePawsGalore.Model.Contact;
import com.PetStore.ThePawsGalore.Model.Login;

@Controller
public class LoginController {
	@Autowired
	SessionFactory sf;
	
	@RequestMapping("login")
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping("validlogin")
	public String validlogin(Login login) throws IOException {
		Session s = sf.openSession();
		Login dblogin = s.get(Login.class, login.getUsername());
		String page = "error";
		if (dblogin != null && dblogin.getPassword().equals(login.getPassword())) {
			if (dblogin.equals(dblogin)) {
				page = "home";
			}
		}
		return page;
	}
	
	@RequestMapping("register")
	public String registerPage() {
		return "register";
	}
	@RequestMapping("registerdata")
	public String createaccountdata(Login login) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(login);
		t.commit();
		return "login";
	}// save data

	@RequestMapping("home")
	public String homePage() {
		return "home";
	}
	@RequestMapping("about")
	public String aboutPage() {
		return "about";
	}
	@RequestMapping("price")
	public String pricePage() {
		return "price";
	}
	@RequestMapping("dogbreedguide")
	public String dogbreedguidePage() {
		return "dogbreedguide";
	}
	@RequestMapping("Hamster")
	public String HamsterPage() {
		return "Hamster";
	}
	@RequestMapping("RedRumpedParakeets")
	public String RedRumpedParakeetsPage() {
		return "RedRumpedParakeets";
	}
	@RequestMapping("parrotblog")
	public String parrotblogPage() {
		return "parrotblog";
	}
	@RequestMapping("careguide")
	public String careguidePage() {
		return "careguide";
	}
	@RequestMapping("blog")
	public String blogPage() {
		return "blog";
	}
	@RequestMapping("team")
	public String teamPage() {
		return "team";
	}
	@RequestMapping("testimonial")
	public String testimonialPage() {
		return "testimonial";
	}
	@RequestMapping("service")
	public String servicePage() {
		return "service";
	}
	@RequestMapping("product")
	public String productPage() {
		return "product";
	}
	
	@RequestMapping("detail")
	public String detailPage() {
		return "detail";
	}
	@RequestMapping("contact")
	public String contactPage() {
		return "contact";
	}
	@RequestMapping("contactdata")
	public String contactdata(Contact contact) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(contact);
		t.commit();
		return "contact";
	}// save data
	
	@RequestMapping("comment")
	public String commentPage() {
		return "comment";
	}
	@RequestMapping("commentdata")
	public String commentdata(Comment comment) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(comment);
		t.commit();
		return "comment";
	}// save data

	@RequestMapping("logout")
	public String logout() {
		return "logout";
	}
}
