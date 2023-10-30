package org.sid.walletservice;

import jakarta.validation.constraints.Null;
import org.sid.walletservice.Repository.ClientRepository;
import org.sid.walletservice.Repository.WalletRepository;
import org.sid.walletservice.entities.Client;
import org.sid.walletservice.entities.Wallet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class WalletServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalletServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ClientRepository clientRepository,WalletRepository walletRepository){
		return args -> {

			Client client1=new Client(null,"najat","najat@gmail.com", null);
			Client client2=new Client(null,"Salma","salma@gmail.com",null);
			Client client3=new Client(null,"ahmed","ahmed@gmail.com",null);


			Wallet wallet1=new Wallet(null,129.23,new Date(),12983.42,null);
			Wallet wallet2=new Wallet(null,23784.2,new Date(),1291.32,null);
			Wallet wallet3=new Wallet(null,29482.2,new Date(),939.3,null);

			walletRepository.save(wallet1);
			walletRepository.save(wallet2);
			walletRepository.save(wallet3);



			clientRepository.save(client1);
			clientRepository.save(client2);
			clientRepository.save(client3);



			client1.setWallets(walletRepository.findAll());
			client2.setWallets(walletRepository.findAll());

			walletRepository.save(wallet1);
			walletRepository.save(wallet2);
			walletRepository.save(wallet3);

			clientRepository.findAll().forEach(c->
					System.out.println(c.toString()));

			walletRepository.findAll().forEach(w->
					System.out.println(w.toString()));

		};

	}


}
