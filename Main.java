public class Main
{
	public static void main(String args[])
	{
	
		Memory m=new Memory();
		m.firstpage=new FirstPage(m);
		m.registration=new Registration(m);
		m.login=new LoginPage(m);
		m.citizen=new CitizenReg(m);
		m.authority=new AuthorityReg(m);
		m.apply=new Apply(m);
		m.applyfor=new ApplyFor(m);
		m.applyforbc=new ApplyForBC(m);
		m.applyforcc=new ApplyForCC(m);
		m.applyforpc=new ApplyForPC(m);
		m.applyforlc=new ApplyForLC(m);
		m.loginselection=new LoginSelection(m);
		m.authoritylogin=new AuthorityLogin(m);
		m.authorityselection=new AuthoritySelection(m);
		m.requestcc=new RequestCC(m);
		
        m.firstpage.setVisible(true);    
		
	}
}