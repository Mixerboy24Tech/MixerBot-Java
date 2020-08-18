package lisaosat;

import net.dv8tion.jda.core.events.ReadyEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import net.dv8tion.jda.core.entities.Game;
import net.dv8tion.jda.core.entities.Game.GameType;

public class status extends ListenerAdapter {

	@Override
	public void onReady(ReadyEvent re) {
		re.getJDA().getPresence().setGame( Game.of(GameType.DEFAULT, "MixerBot Java version ALPHA") );
	}
}
