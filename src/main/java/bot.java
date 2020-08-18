import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.AccountType;

//haetaan lisäosat / komennot
import events.tervehdys;

public class bot {
	
		public static void main(String[] args) throws Exception {
		JDA jda = new JDABuilder(AccountType.BOT).setToken("TOKEN").setAutoReconnect(true).build();
		
		jda.addEventListener(new tervehdys());
		
	}
}}
