package com.napalm.MrKittyBot;

import net.dv8tion.jda.core.entities.ChannelType;
import net.dv8tion.jda.core.entities.PrivateChannel;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter {
	
	@Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
		if(event.getAuthor().isBot())
			return;
		
        if (event.isFromType(ChannelType.PRIVATE))
        {
            sendPrivate(event.getAuthor().openPrivateChannel().complete(), "I don't do private messages yet. Stop. Also meow.");
        }
        else
        {
            System.out.printf("[%s][%s] %s: %s%n", event.getGuild().getName(),
                        event.getTextChannel().getName(), event.getMember().getEffectiveName(),
                        event.getMessage().getContentDisplay());
        }
    }
	
	public void sendPrivate(PrivateChannel channel, String message) {
		channel.sendMessage(message).queue();
	}

}
