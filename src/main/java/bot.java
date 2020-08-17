import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.JDA;
import java.beans.EventHandler;
import net.dv8tion.jda.api.AccountType;

//haetaan lisäosat / komennot
import events.tervehdys;


@SuppressWarnings("unused")
public class bot {
	
		@SuppressWarnings("deprecation")
		public static void main(String[] arguments) throws Exception {
		JDA jda = new JDABuilder("TOKEN").build();
		
	
		jda.addEventListener(new tervehdys());
		
	}
}