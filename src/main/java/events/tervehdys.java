package events;

import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;


public class tervehdys extends ListenerAdapter{

	
	public void onGuilfMessageReceived(GuildMessageReceivedEvent event) {
		String messageSent = event.getMessage().getContentRaw();
		String name = event.getMember().getUser().getName();
		if(messageSent.equalsIgnoreCase("Hei")){
			event.getChannel().sendMessage("Tervehdys " + name).queue();
		}
	}
}
