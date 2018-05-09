package com.napalm.MrKittyBot;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

public class MrKittyBot {
	
	private static JDA api;

	public static void main(String[] args) {
		
		try {
			api = new JDABuilder(AccountType.BOT).setToken(Ref.TOKEN).buildBlocking();
			api.addEventListener(new Commands());
		} catch (LoginException | InterruptedException e) {
			e.printStackTrace();
		}

	}

}
